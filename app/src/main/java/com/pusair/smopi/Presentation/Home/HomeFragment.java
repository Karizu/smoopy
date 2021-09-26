package com.pusair.smopi.Presentation.Home;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko04Bangtrol;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.DaerahIrigasi;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Blanko1O.Blanko1OFragment;
import com.pusair.smopi.Presentation.Blanko1P.Blanko1PFragment;
import com.pusair.smopi.Presentation.Blanko4O.Blanko4OFragment;
import com.pusair.smopi.Presentation.Blanko6O.Blanko6OFragment;
import com.pusair.smopi.Presentation.Blanko8O.Blanko8OFragment;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.ExternalStoragePermissions;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    @BindView(R.id.spinner_daerahIrigasi)
    MaterialSpinner spinnerDI;

    @BindView(R.id.blanko_1o)
    ImageView btnBlanko1o;

    @BindView(R.id.blanko_1p)
    ImageView btnBlanko1p;

    @BindView(R.id.blanko_4o)
    ImageView btnBlanko4o;

    @BindView(R.id.blanko_6o)
    ImageView btnBlanko6o;

    @BindView(R.id.username)
    TextView tvUsername;

    @BindView(R.id.area)
    TextView tvArea;

    @BindView(R.id.sync_date)
    TextView syncDate;

    @BindView(R.id.sync_btn)
    ImageView syncBtn;

    @BindView(R.id.blanko_8o)
    FrameLayout blanko_8o;

    private String daerahIrigasiSelected, kdIrigasiSelected;
    private QueryFilters queryFilters;
    private ProgressDialog progressDialog;
    private String currentDateandTime;

    @Override
    public void onStart() {
        super.onStart();
        queryFilters = new QueryFilters();
        try {
            queryFilters.add("nm_usr", Session.get("Authorization").getValue());
            User currentUser = LocalData.get(queryFilters, User.class);
            if (currentUser.getPrevil().equals("Bendung")) {
                blanko_8o.setVisibility(View.VISIBLE);
                btnBlanko1o.setVisibility(View.GONE);
                btnBlanko1p.setVisibility(View.GONE);
                btnBlanko4o.setVisibility(View.GONE);
                btnBlanko6o.setVisibility(View.GONE);
            }
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, view);

        queryFilters = new QueryFilters();

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault());
        String currentDateandTime = sdf.format(new Date());

        syncDate.setText("Last Update: " + currentDateandTime);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try {

            queryFilters.add("nm_usr", Session.get("Authorization").getValue());

            User currentUser = LocalData.get(queryFilters, User.class);

            if (currentUser != null) {
                tvUsername.setText(currentUser.getNm_usr());
                tvArea.setText(currentUser.getPrevil());
            }

            requestPermission();
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        ArrayList<DaerahIrigasi> daerahIrigasi = (ArrayList<DaerahIrigasi>) LocalData.getList(queryFilters, DaerahIrigasi.class, "id", Sort.ASCENDING);
        List<String> diList = new ArrayList<>();
        List<String> kd_diList = new ArrayList<>();
        diList.add("-- Pilih Daerah Irigasi --");
        kd_diList.add("0");

        for (int i = 0; i < daerahIrigasi.size(); i++) {
            diList.add(daerahIrigasi.get(i).getNm_di());
            kd_diList.add(daerahIrigasi.get(i).getKd_di());
        }

        spinnerDI.setItems(diList);
        spinnerDI.setOnItemSelectedListener((view1, position, id, item) -> {
            daerahIrigasiSelected = item.toString();
            kdIrigasiSelected = kd_diList.get(position);
        });
    }

    @OnClick(R.id.blanko_1o)
    public void openBlanko1O() {
        Fragment fragment = new Blanko1OFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "blanko1o");
        fragmentTransaction.addToBackStack("home");

        fragmentTransaction.commit();
    }

    @OnClick(R.id.blanko_4o)
    public void openBlanko4O() {
        Fragment fragment = new Blanko4OFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "blanko4o");
        fragmentTransaction.addToBackStack("home");

        fragmentTransaction.commit();
    }

    @OnClick(R.id.blanko_6o)
    public void openBlanko6o() {
        Bundle bundle = new Bundle();
        bundle.putString("kd_di", kdIrigasiSelected);

        if (kdIrigasiSelected != null && !kdIrigasiSelected.equals("0")) {
            Fragment fragment = new Blanko6OFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.screen_area, fragment, "blanko6o");
            fragmentTransaction.addToBackStack("home");

            fragmentTransaction.commit();
        } else {
            Toast.makeText(getActivity(), "Silahkan pilih daerah irigasi terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.blanko_8o)
    public void openBlanko8o() {
        Fragment fragment = new Blanko8OFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "blanko8o");
        fragmentTransaction.addToBackStack("home");

        fragmentTransaction.commit();
    }

    @OnClick(R.id.blanko_1p)
    public void openBlanko1P() {
        Bundle bundle = new Bundle();
        bundle.putString("daerahIrigasiSelected", daerahIrigasiSelected);
        bundle.putString("kdIrigasiSelected", kdIrigasiSelected);

        if (kdIrigasiSelected != null && !kdIrigasiSelected.equals("0")) {
            Fragment fragment = new Blanko1PFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.screen_area, fragment, "blanko1p");
            fragmentTransaction.addToBackStack("home");
            fragmentTransaction.commit();
        } else {
            Toast.makeText(getActivity(), "Silahkan pilih daerah irigasi terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("SetTextI18n")
    @OnClick(R.id.sync_btn)
    public void syncData() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        currentDateandTime = sdf.format(new Date());

        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setMessage("Sync Data...");
        progressDialog.show();

        doSyncBlanko8OData();
        doSyncBlanko6OData();
        doSyncBlanko123Data();
        doSyncBlanko4OData();
        doSyncBlanko4AData();
        doSyncBlanko1PDetilData();
        doSyncBlanko1PData();
    }

    private void doSyncBlanko8OData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);
            List<Blanko08> blanko08List = LocalData.getList(queryFilters, Blanko08.class);

            if (blanko08List.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"b08/2017-01-01/2021-12-31\": " + new Gson().toJson(blanko08List) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlanko08List() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlanko08List: " + new Gson().toJson(response.body().getBlanko08List()));
                                    for (int i = 0; i < response.body().getBlanko08List().size(); i++) {
                                        Blanko08 blanko08 = (Blanko08) response.body().getBlanko08List().get(i);
                                        if ((blanko08.getInsert() != null && blanko08.getInsert().equals("ok")) || (blanko08.getUpdate() != null && blanko08.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko08.getKd_mt());
                                            queryFilters.add("thbln", blanko08.getThbln());
                                            queryFilters.add("poda_air", blanko08.getPoda_air());
                                            queryFilters.add("tgl", blanko08.getTgl());

                                            try {
                                                Blanko08 localData = LocalData.get(queryFilters, Blanko08.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blanko08.getDelete() != null && blanko08.getDelete().equals("delete_android")) || (blanko08.getDelete() != null && blanko08.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko08.getKd_mt());
                                            queryFilters.add("thbln", blanko08.getThbln());
                                            queryFilters.add("poda_air", blanko08.getPoda_air());
                                            queryFilters.add("tgl", blanko08.getTgl());
                                            LocalData.delete(queryFilters, Blanko08.class);
                                        }

                                        if (blanko08.getSkip_update() != null && blanko08.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko08.getKd_mt());
                                            queryFilters.add("thbln", blanko08.getThbln());
                                            queryFilters.add("poda_air", blanko08.getPoda_air());
                                            queryFilters.add("tgl", blanko08.getTgl());

                                            try {
                                                Blanko08 localData = LocalData.get(queryFilters, Blanko08.class);

                                                if (localData != null) {
                                                    localData.setH_bendung(blanko08.getH_bendung());
                                                    localData.setQ_bendung(blanko08.getQ_bendung());
                                                    localData.setH_ki_ambil(blanko08.getH_ki_ambil());
                                                    localData.setQ_ki_ambil(blanko08.getQ_ki_ambil());
                                                    localData.setH_ka_ambil(blanko08.getH_ka_ambil());
                                                    localData.setQ_ka_ambil(blanko08.getQ_ka_ambil());
                                                    localData.setQsungai(blanko08.getQsungai());
                                                    localData.setQsungai_rata(blanko08.getQsungai_rata());
                                                    localData.setTgledit(blanko08.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blanko08.getRec_baru_server() != null && blanko08.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko08.getKd_mt());
                                            queryFilters.add("thbln", blanko08.getThbln());
                                            queryFilters.add("poda_air", blanko08.getPoda_air());
                                            queryFilters.add("tgl", blanko08.getTgl());
                                            LocalData.delete(queryFilters, Blanko08.class);

                                            blanko08.setId(UUID.randomUUID().toString());
                                            blanko08.setFlag(true);
                                            LocalData.saveOrUpdate(blanko08);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {

                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko6OData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<Blanko06> blanko06List = LocalData.getList(queryFilters, Blanko06.class);

            if (blanko06List.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"b06/2017-01-01/2021-12-31\": " + new Gson().toJson(blanko06List) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlanko06List() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlanko06List: " + new Gson().toJson(response.body().getBlanko06List()));
                                    for (int i = 0; i < response.body().getBlanko06List().size(); i++) {
                                        Blanko06 blanko06 = (Blanko06) response.body().getBlanko06List().get(i);
                                        if ((blanko06.getInsert() != null && blanko06.getInsert().equals("ok")) || (blanko06.getUpdate() != null && blanko06.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko06.getKd_mt());
                                            queryFilters.add("thbln", blanko06.getThbln());
                                            queryFilters.add("nm_bangtrol", blanko06.getNm_bangtrol());
                                            queryFilters.add("tmt_bangtrol", blanko06.getTmt_bangtrol());
                                            queryFilters.add("urutan", blanko06.getUrutan());

                                            try {
                                                Blanko06 localData = LocalData.get(queryFilters, Blanko06.class);
                                                System.out.println(new Gson().toJson(localData));
                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blanko06.getDelete() != null && blanko06.getDelete().equals("delete_android")) || (blanko06.getDelete() != null && blanko06.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko06.getKd_mt());
                                            queryFilters.add("thbln", blanko06.getThbln());
                                            queryFilters.add("nm_bangtrol", blanko06.getNm_bangtrol());
                                            queryFilters.add("tmt_bangtrol", blanko06.getTmt_bangtrol());
                                            queryFilters.add("urutan", blanko06.getUrutan());
                                            LocalData.delete(queryFilters, Blanko06.class);
                                        }

                                        if (blanko06.getSkip_update() != null && blanko06.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko06.getKd_mt());
                                            queryFilters.add("thbln", blanko06.getThbln());
                                            queryFilters.add("nm_bangtrol", blanko06.getNm_bangtrol());
                                            queryFilters.add("tmt_bangtrol", blanko06.getTmt_bangtrol());
                                            queryFilters.add("urutan", blanko06.getUrutan());

                                            try {
                                                Blanko06 localData = LocalData.get(queryFilters, Blanko06.class);
                                                System.out.println(new Gson().toJson(localData));
                                                if (localData != null) {
                                                    localData = blanko06;
                                                    localData.setTgledit(blanko06.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blanko06.getRec_baru_server() != null && blanko06.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko06.getKd_mt());
                                            queryFilters.add("thbln", blanko06.getThbln());
                                            queryFilters.add("nm_bangtrol", blanko06.getNm_bangtrol());
                                            queryFilters.add("tmt_bangtrol", blanko06.getTmt_bangtrol());
                                            queryFilters.add("urutan", blanko06.getUrutan());
                                            LocalData.delete(queryFilters, Blanko06.class);

                                            blanko06.setId(UUID.randomUUID().toString());
                                            blanko06.setFlag(true);
                                            LocalData.saveOrUpdate(blanko06);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {

                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko123Data() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<Blanko0123> blanko0123List = LocalData.getList(queryFilters, Blanko0123.class);

            if (blanko0123List.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"b0123/2017-01-01/2021-12-31\": " + new Gson().toJson(blanko0123List) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlanko0123List() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlanko0123List: " + new Gson().toJson(response.body().getBlanko0123List()));
                                    for (int i = 0; i < response.body().getBlanko0123List().size(); i++) {
                                        Blanko0123 blanko0123 = (Blanko0123) response.body().getBlanko0123List().get(i);
                                        if ((blanko0123.getInsert() != null && blanko0123.getInsert().equals("ok")) || (blanko0123.getUpdate() != null && blanko0123.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0123.getKd_mt());
                                            queryFilters.add("kd_org", blanko0123.getKd_org());
                                            queryFilters.add("jenis_uk", blanko0123.getJenis_uk());
                                            queryFilters.add("urut_mt", blanko0123.getUrut_mt());

                                            try {
                                                Blanko0123 localData = LocalData.get(queryFilters, Blanko0123.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blanko0123.getDelete() != null && blanko0123.getDelete().equals("delete_android")) || (blanko0123.getDelete() != null && blanko0123.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0123.getKd_mt());
                                            queryFilters.add("kd_org", blanko0123.getKd_org());
                                            queryFilters.add("jenis_uk", blanko0123.getJenis_uk());
                                            queryFilters.add("urut_mt", blanko0123.getUrut_mt());
                                            LocalData.delete(queryFilters, Blanko0123.class);
                                        }

                                        if (blanko0123.getSkip_update() != null && blanko0123.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0123.getKd_mt());
                                            queryFilters.add("kd_org", blanko0123.getKd_org());
                                            queryFilters.add("jenis_uk", blanko0123.getJenis_uk());
                                            queryFilters.add("urut_mt", blanko0123.getUrut_mt());

                                            try {
                                                Blanko0123 localData = LocalData.get(queryFilters, Blanko0123.class);

                                                if (localData != null) {
                                                    localData.setPadi(blanko0123.getPadi());
                                                    localData.setTebu_muda(blanko0123.getTebu_muda());
                                                    localData.setTebu_tua(blanko0123.getTebu_tua());
                                                    localData.setPalawija(blanko0123.getPalawija());
                                                    localData.setLain(blanko0123.getLain());
                                                    localData.setBero(blanko0123.getBero());
                                                    localData.setLuas_swiri(blanko0123.getLuas_swiri());
                                                    localData.setGol(blanko0123.getGol());
                                                    localData.setTgl_mt(blanko0123.getTgl_mt());
                                                    localData.setTgl_olah(blanko0123.getTgl_olah());
                                                    localData.setTgledit(blanko0123.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blanko0123.getRec_baru_server() != null && blanko0123.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0123.getKd_mt());
                                            queryFilters.add("kd_org", blanko0123.getKd_org());
                                            queryFilters.add("jenis_uk", blanko0123.getJenis_uk());
                                            queryFilters.add("urut_mt", blanko0123.getUrut_mt());
                                            LocalData.delete(queryFilters, Blanko0123.class);

                                            blanko0123.setId(UUID.randomUUID().toString());
                                            blanko0123.setFlag(true);
                                            LocalData.saveOrUpdate(blanko0123);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {

                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko4OData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<Blanko0405> blanko0405List = LocalData.getList(queryFilters, Blanko0405.class);

            if (blanko0405List.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"b0405/2017-01-01/2021-12-31\": " + new Gson().toJson(blanko0405List) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlanko0405List() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlanko0405List: " + new Gson().toJson(response.body().getBlanko0405List()));
                                    for (int i = 0; i < response.body().getBlanko0405List().size(); i++) {
                                        Blanko0405 blanko0405 = (Blanko0405) response.body().getBlanko0405List().get(i);

                                        if ((blanko0405.getInsert() != null && blanko0405.getInsert().equals("ok")) || (blanko0405.getUpdate() != null && blanko0405.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0405.getKd_mt());
                                            queryFilters.add("urut_mt", blanko0405.getUrut_mt());
                                            queryFilters.add("thbln", blanko0405.getThbln());
                                            queryFilters.add("poda_air", blanko0405.getPoda_air());

                                            try {
                                                Blanko0405 localData = LocalData.get(queryFilters, Blanko0405.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blanko0405.getDelete() != null && blanko0405.getDelete().equals("delete_android")) || (blanko0405.getDelete() != null && blanko0405.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0405.getKd_mt());
                                            queryFilters.add("urut_mt", blanko0405.getUrut_mt());
                                            queryFilters.add("thbln", blanko0405.getThbln());
                                            queryFilters.add("poda_air", blanko0405.getPoda_air());
                                            LocalData.delete(queryFilters, Blanko0405.class);
                                        }

                                        if (blanko0405.getSkip_update() != null && blanko0405.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0405.getKd_mt());
                                            queryFilters.add("urut_mt", blanko0405.getUrut_mt());
                                            queryFilters.add("thbln", blanko0405.getThbln());
                                            queryFilters.add("poda_air", blanko0405.getPoda_air());

                                            try {
                                                Blanko0405 localData = LocalData.get(queryFilters, Blanko0405.class);

                                                if (localData != null) {
                                                    localData.setRs_padi(blanko0405.getRs_padi());
                                                    localData.setRs_tebu_muda(blanko0405.getRs_tebu_muda());
                                                    localData.setRs_tebu_tua(blanko0405.getRs_tebu_tua());
                                                    localData.setRs_palawija(blanko0405.getRs_palawija());
                                                    localData.setRs_lain(blanko0405.getRs_lain());
                                                    localData.setRs_bero(blanko0405.getRs_bero());
                                                    localData.setLuas_swiri(blanko0405.getLuas_swiri());
                                                    localData.setKa_airpetak(blanko0405.getKa_airpetak());
                                                    localData.setPadi_krg(blanko0405.getPadi_krg());
                                                    localData.setPadi_bjr(blanko0405.getPadi_bjr());
                                                    localData.setTebu_krg(blanko0405.getTebu_krg());
                                                    localData.setTebu_bjr(blanko0405.getTebu_bjr());
                                                    localData.setWija_bjr(blanko0405.getWija_bjr());
                                                    localData.setWija_krg(blanko0405.getWija_krg());

                                                    localData.setTgledit(blanko0405.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blanko0405.getRec_baru_server() != null && blanko0405.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko0405.getKd_mt());
                                            queryFilters.add("urut_mt", blanko0405.getUrut_mt());
                                            queryFilters.add("thbln", blanko0405.getThbln());
                                            queryFilters.add("poda_air", blanko0405.getPoda_air());
                                            LocalData.delete(queryFilters, Blanko0405.class);

                                            blanko0405.setId(UUID.randomUUID().toString());
                                            blanko0405.setFlag(true);
                                            LocalData.saveOrUpdate(blanko0405);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {

                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko4AData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<Blanko04Bangtrol> blanko04BangtrolList = LocalData.getList(queryFilters, Blanko04Bangtrol.class);

            if (blanko04BangtrolList.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"b04_bangtrol/2017-01-01/2021-12-31\": " + new Gson().toJson(blanko04BangtrolList) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlanko04BangtrolList() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlanko04BangtrolList: " + new Gson().toJson(response.body().getBlanko04BangtrolList()));
                                    for (int i = 0; i < response.body().getBlanko04BangtrolList().size(); i++) {
                                        Blanko04Bangtrol blanko04Bangtrol = (Blanko04Bangtrol) response.body().getBlanko04BangtrolList().get(i);

                                        if ((blanko04Bangtrol.getInsert() != null && blanko04Bangtrol.getInsert().equals("ok")) || (blanko04Bangtrol.getUpdate() != null && blanko04Bangtrol.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko04Bangtrol.getKd_mt());
                                            queryFilters.add("urut_mt", blanko04Bangtrol.getUrut_mt());
                                            queryFilters.add("thbln", blanko04Bangtrol.getThbln());
                                            queryFilters.add("poda_air", blanko04Bangtrol.getPoda_air());

                                            try {
                                                Blanko04Bangtrol localData = LocalData.get(queryFilters, Blanko04Bangtrol.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blanko04Bangtrol.getDelete() != null && blanko04Bangtrol.getDelete().equals("delete_android")) || (blanko04Bangtrol.getDelete() != null && blanko04Bangtrol.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko04Bangtrol.getKd_mt());
                                            queryFilters.add("urut_mt", blanko04Bangtrol.getUrut_mt());
                                            queryFilters.add("thbln", blanko04Bangtrol.getThbln());
                                            queryFilters.add("poda_air", blanko04Bangtrol.getPoda_air());
                                            LocalData.delete(queryFilters, Blanko04Bangtrol.class);
                                        }

                                        if (blanko04Bangtrol.getSkip_update() != null && blanko04Bangtrol.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko04Bangtrol.getKd_mt());
                                            queryFilters.add("urut_mt", blanko04Bangtrol.getUrut_mt());
                                            queryFilters.add("thbln", blanko04Bangtrol.getThbln());
                                            queryFilters.add("poda_air", blanko04Bangtrol.getPoda_air());

                                            try {
                                                Blanko04Bangtrol localData = LocalData.get(queryFilters, Blanko04Bangtrol.class);

                                                if (localData != null) {
                                                    localData = blanko04Bangtrol;

                                                    localData.setTgledit(blanko04Bangtrol.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blanko04Bangtrol.getRec_baru_server() != null && blanko04Bangtrol.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("kd_mt", blanko04Bangtrol.getKd_mt());
                                            queryFilters.add("urut_mt", blanko04Bangtrol.getUrut_mt());
                                            queryFilters.add("thbln", blanko04Bangtrol.getThbln());
                                            queryFilters.add("poda_air", blanko04Bangtrol.getPoda_air());
                                            LocalData.delete(queryFilters, Blanko04Bangtrol.class);

                                            blanko04Bangtrol.setId(UUID.randomUUID().toString());
                                            blanko04Bangtrol.setFlag(true);
                                            LocalData.saveOrUpdate(blanko04Bangtrol);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {
                        progressDialog.dismiss();
                        t.printStackTrace();
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko1PData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<BlankoP01> blankoP01List = LocalData.getList(queryFilters, BlankoP01.class);

            if (blankoP01List.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"pb01/2017-01-01/2021-12-31\": " + new Gson().toJson(blankoP01List) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlankoP01List() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlankoP01List: " + new Gson().toJson(response.body().getBlankoP01List()));
                                    for (int i = 0; i < response.body().getBlankoP01List().size(); i++) {
                                        BlankoP01 blankoP01 = (BlankoP01) response.body().getBlankoP01List().get(i);

                                        if ((blankoP01.getInsert() != null && blankoP01.getInsert().equals("ok")) || (blankoP01.getUpdate() != null && blankoP01.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01.getId_b01());
                                            queryFilters.add("kd_saluran", blankoP01.getKd_saluran());
                                            queryFilters.add("tgl_inspeksi", blankoP01.getTgl_inspeksi());

                                            try {
                                                BlankoP01 localData = LocalData.get(queryFilters, BlankoP01.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blankoP01.getDelete() != null && blankoP01.getDelete().equals("delete_android")) || (blankoP01.getDelete() != null && blankoP01.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01.getId_b01());
                                            queryFilters.add("kd_saluran", blankoP01.getKd_saluran());
                                            queryFilters.add("tgl_inspeksi", blankoP01.getTgl_inspeksi());
                                            LocalData.delete(queryFilters, BlankoP01.class);
                                        }

                                        if (blankoP01.getSkip_update() != null && blankoP01.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01.getId_b01());
                                            queryFilters.add("kd_saluran", blankoP01.getKd_saluran());
                                            queryFilters.add("tgl_inspeksi", blankoP01.getTgl_inspeksi());

                                            try {
                                                BlankoP01 localData = LocalData.get(queryFilters, BlankoP01.class);

                                                if (localData != null) {
                                                    localData = blankoP01;

                                                    localData.setTgledit(blankoP01.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blankoP01.getRec_baru_server() != null && blankoP01.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01.getId_b01());
                                            queryFilters.add("kd_saluran", blankoP01.getKd_saluran());
                                            queryFilters.add("tgl_inspeksi", blankoP01.getTgl_inspeksi());
                                            LocalData.delete(queryFilters, BlankoP01.class);

                                            blankoP01.setFlag(true);
                                            LocalData.saveOrUpdate(blankoP01);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {
                        progressDialog.dismiss();
                        t.printStackTrace();
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doSyncBlanko1PDetilData() {
        try {
            queryFilters = new QueryFilters();
            queryFilters.add("flag", false);

            List<BlankoP01Detail> blankoP01DetailList = LocalData.getList(queryFilters, BlankoP01Detail.class);

            if (blankoP01DetailList.size() > 0) {
//                progressDialog = new ProgressDialog(getActivity());
//                progressDialog.setIndeterminate(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.setMessage("Sync Data...");
//                progressDialog.show();

                String dataString = "{\"pb01_detil/2017-01-01/2021-12-31\": " + new Gson().toJson(blankoP01DetailList) + "}";
                RequestBody syncModel = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("user", Session.get("Authorization").getValue())
                        .addFormDataPart("data", dataString)
                        .build();

                SyncHelper.syncBlanko(syncModel, new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            if (response.body() != null) {
                                if (response.body().getBlankoP01DetailList() != null) {
                                    Toast.makeText(getActivity(), "Sinkronisasi berhasil", Toast.LENGTH_SHORT).show();
                                    syncDate.setText("Last Update: " + currentDateandTime);
                                    System.out.println("getBlankoP01DetailList: " + new Gson().toJson(response.body().getBlankoP01DetailList()));
                                    for (int i = 0; i < response.body().getBlankoP01DetailList().size(); i++) {
                                        BlankoP01Detail blankoP01Detail = (BlankoP01Detail) response.body().getBlankoP01DetailList().get(i);

                                        if ((blankoP01Detail.getInsert() != null && blankoP01Detail.getInsert().equals("ok")) || (blankoP01Detail.getUpdate() != null && blankoP01Detail.getUpdate().equals("ok"))) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01Detail.getId_b01());
                                            queryFilters.add("jns_keadaan", blankoP01Detail.getJns_keadaan());
                                            queryFilters.add("tgl_inspeksi", blankoP01Detail.getTgl_inspeksi());

                                            try {
                                                BlankoP01Detail localData = LocalData.get(queryFilters, BlankoP01Detail.class);

                                                if (localData != null) {
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if ((blankoP01Detail.getDelete() != null && blankoP01Detail.getDelete().equals("delete_android")) || (blankoP01Detail.getDelete() != null && blankoP01Detail.getDelete().equals("delete_server"))) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01Detail.getId_b01());
                                            queryFilters.add("jns_keadaan", blankoP01Detail.getJns_keadaan());
                                            queryFilters.add("tgl_inspeksi", blankoP01Detail.getTgl_inspeksi());
                                            LocalData.delete(queryFilters, BlankoP01Detail.class);
                                        }

                                        if (blankoP01Detail.getSkip_update() != null && blankoP01Detail.getSkip_update().equals("update_android")) {

                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01Detail.getId_b01());
                                            queryFilters.add("jns_keadaan", blankoP01Detail.getJns_keadaan());
                                            queryFilters.add("tgl_inspeksi", blankoP01Detail.getTgl_inspeksi());

                                            try {
                                                BlankoP01Detail localData = LocalData.get(queryFilters, BlankoP01Detail.class);

                                                if (localData != null) {
                                                    localData = blankoP01Detail;

                                                    localData.setTgledit_detil(blankoP01Detail.getTgledit_detil());
                                                    localData.setTgledit(blankoP01Detail.getTgledit());
                                                    localData.setFlag(true);
                                                    LocalData.saveOrUpdate(localData);
                                                }

                                            } catch (LocalDataNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        if (blankoP01Detail.getRec_baru_server() != null && blankoP01Detail.getRec_baru_server().equals("insert_android")) {
                                            queryFilters = new QueryFilters();
                                            queryFilters.add("id_b01", blankoP01Detail.getId_b01());
                                            queryFilters.add("jns_keadaan", blankoP01Detail.getJns_keadaan());
                                            queryFilters.add("tgl_inspeksi", blankoP01Detail.getTgl_inspeksi());
                                            LocalData.delete(queryFilters, BlankoP01Detail.class);

                                            blankoP01Detail.setId(UUID.randomUUID().toString());
                                            blankoP01Detail.setFlag(true);
                                            LocalData.saveOrUpdate(blankoP01Detail);
                                        }
                                    }
                                } else {
                                    String msg = response.body().getPeringatan() != null ? response.body().getPeringatan() : response.body().getPesan() == null ? "Tak ada perbedaan server dan android" : "Terjadi masalah, silahkan coba lagi nanti";
                                    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            try {
                                assert response.errorBody() != null;
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                jsonObject.getString("peringatan");
                                Toast.makeText(getActivity(), jsonObject.getString("peringatan"), Toast.LENGTH_SHORT).show();
                            } catch (IOException | JSONException e) {
                                Toast.makeText(getActivity(), response.message(), Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse> call, Throwable t) {
                        progressDialog.dismiss();
                        t.printStackTrace();
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void requestPermission() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (Objects.requireNonNull(getActivity()).checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
                        || getActivity().checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {

                } else {
                    ExternalStoragePermissions.verifyStoragePermissions(getActivity());
                }
            }

            if (ActivityCompat.checkSelfPermission(Objects.requireNonNull(getActivity()), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                Dexter.withActivity(getActivity())
                        .withPermissions(
                                Manifest.permission.ACCESS_COARSE_LOCATION,
                                Manifest.permission.ACCESS_FINE_LOCATION)
                        .withListener(new MultiplePermissionsListener() {
                            @Override
                            public void onPermissionsChecked(MultiplePermissionsReport report) {
                                // check if all permissions are granted
                                if (report.areAllPermissionsGranted()) {
                                    // do you work now
                                }

                                // check for permanent denial of any permission
                                if (report.isAnyPermissionPermanentlyDenied()) {
                                    // permission is denied permenantly, navigate user to app settings
                                }
                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {

                            }

                        })
                        .onSameThread()
                        .check();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
