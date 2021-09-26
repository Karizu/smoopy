package com.pusair.smopi.Presentation.Blanko1O;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0123Model;
import com.pusair.smopi.Model.GroupIp3a;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko1OEditAllFragment extends Fragment {

    @BindView(R.id.rvBlanko01EditAll)
    RecyclerView recyclerView;
    @BindView(R.id.notFoundText)
    TextView notFoundText;

    @BindView(R.id.KeputusanMT1LsIrigasi)
    TextView keputusanMT1LsIrigasi;

    @BindView(R.id.keputusanMT2LsIrigasi)
    TextView keputusanMT2LsIrigasi;

    @BindView(R.id.keputusanMT3LsIrigasi)
    TextView keputusanMT3LsIrigasi;

    @BindView(R.id.usulanMT1LsIrigasi)
    TextView usulanMT1LsIrigasi;

    @BindView(R.id.usulanMT2LsIrigasi)
    TextView usulanMT2LsIrigasi;

    @BindView(R.id.usulanMT3LsIrigasi)
    TextView usulanMT3LsIrigasi;

    private AdapterEditAllBlanko1O adapter;
    private QueryFilters queryFilters;
    private List<String> musimTanamSpinner;
    private List<String> ip3aSpinner;
    private LinearLayoutManager layoutManager;
    private List<Blanko0123> blanko0123ListUsulan, blanko0123ListKeputusan;
    private List<MusimTanam> musimTanamList;
    private String listKodeOrg;
    private int kodeMT = 0;
    private List<Blanko0123Model> blanko0123ModelList;
    private Blanko0123 usulanMT1, usulanMT2, usulanMT3, keputusanMT1, keputusanMT2, keputusanMT3;
    private float summaryUsulanMT1, summaryUsulanMT2, summaryUsulanMT3, summaryKeputusanMT1, summaryKeputusanMT2, summaryKeputusanMT3;
    private float usulanMT1All, usulanMT2All, usulanMT3All, keputusanMT1All, keputusanMT2All, keputusanMT3All;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_all_blanko_1o, null);
        ButterKnife.bind(this, view);

        queryFilters = new QueryFilters();
        musimTanamSpinner = new ArrayList<>();
        ip3aSpinner = new ArrayList<>();
        blanko0123ListUsulan = new ArrayList<>();
        blanko0123ListKeputusan = new ArrayList<>();
        blanko0123ModelList = new ArrayList<>();

        ((HomeActivity) getActivity()).saveBtn.setVisibility(View.VISIBLE);

        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);
        List<GroupIp3a> groupIp3aList = LocalData.getList(queryFilters, GroupIp3a.class, "kd_org", Sort.ASCENDING);

        if (musimTanamList.size() > 0) {
            for (int i =0; i< musimTanamList.size(); i++) {
                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
            }
        }

        if (groupIp3aList.size() > 0) {
            for (int i=0; i< groupIp3aList.size(); i++) {
                ip3aSpinner.add(i, groupIp3aList.get(i).getKd_org());
            }
        }

        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        kodeMT = getArguments().getInt("kodeMT");
        listKodeOrg = getArguments().getString("listKodeOrg");
        String[] list = new Gson().fromJson(listKodeOrg, String[].class);
        if (list.length>0){
            for (String kodeOrg: list) {
                populateData(kodeMT, kodeOrg);
                populateDataFooter(kodeMT, kodeOrg);
            }
        }

        adapter = new AdapterEditAllBlanko1O(blanko0123ModelList, getActivity());
        recyclerView.setAdapter(adapter);

        usulanMT1LsIrigasi.setText("Usulan " + usulanMT1All + " ha");
        usulanMT2LsIrigasi.setText("Usulan " + usulanMT2All + " ha");
        usulanMT2LsIrigasi.setText("Usulan " + usulanMT3All + " ha");
        keputusanMT1LsIrigasi.setText("Keputusan " + keputusanMT1All + " ha");
        keputusanMT2LsIrigasi.setText("Keputusan " + keputusanMT2All + " ha");
        keputusanMT3LsIrigasi.setText("Keputusan " + keputusanMT3All + " ha");

        if (blanko0123ModelList.size() > 0) {
            notFoundText.setVisibility(View.GONE);
        } else {
            notFoundText.setVisibility(View.VISIBLE);
        }

        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setOnClickListener(view1 -> {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            try {
                for (int i = 0; i < AdapterEditAllBlanko1O.blanko0123List.size(); i++) {
                    List<Blanko0123> blanko0123Usulan = AdapterEditAllBlanko1O.blanko0123List.get(i).getBlanko0123s();
                    for (Blanko0123 blanko0123 : blanko0123Usulan) {
                        switch (blanko0123.getUrut_mt()) {
                            case "MT1":
                                try {
                                    queryFilters = new QueryFilters();
                                    queryFilters.add("kd_mt", kodeMT);
                                    queryFilters.add("kd_org", blanko0123.getKd_org());
                                    queryFilters.add("urut_mt", "MT1");
                                    queryFilters.add("jenis_uk", "u");
                                    usulanMT1 = LocalData.get(queryFilters, Blanko0123.class);

                                    usulanMT1.setPadi(blanko0123.getPadi());
                                    usulanMT1.setTebu_tua(blanko0123.getTebu_tua());
                                    usulanMT1.setTebu_muda(blanko0123.getTebu_muda());
                                    usulanMT1.setPalawija(blanko0123.getPalawija());
                                    usulanMT1.setLain(blanko0123.getLain());
                                    usulanMT1.setBero(blanko0123.getBero());
                                    usulanMT1.setLuas_swiri((usulanMT1.getPadi() + usulanMT1.getTebu_muda() + usulanMT1.getTebu_tua() + usulanMT1.getPalawija()
                                            + usulanMT1.getLain() + usulanMT1.getBero()));
                                    usulanMT1.setGol(blanko0123.getGol());
                                    usulanMT1.setTgl_mt(blanko0123.getTgl_mt());
                                    usulanMT1.setTgledit(currentDateandTime);
                                    usulanMT1.setFlag(false);
                                    LocalData.saveOrUpdate(usulanMT1);
                                } catch (Exception e){
                                    e.printStackTrace();
                                }
                                break;
                            case "MT2":
                                try {
                                    queryFilters = new QueryFilters();
                                    queryFilters.add("kd_mt", kodeMT);
                                    queryFilters.add("kd_org", blanko0123.getKd_org());
                                    queryFilters.add("urut_mt", "MT2");
                                    queryFilters.add("jenis_uk", "u");

                                    usulanMT2 = LocalData.get(queryFilters, Blanko0123.class);
                                    usulanMT2.setPadi(blanko0123.getPadi());
                                    usulanMT2.setTebu_tua(blanko0123.getTebu_tua());
                                    usulanMT2.setTebu_muda(blanko0123.getTebu_muda());
                                    usulanMT2.setPalawija(blanko0123.getPalawija());
                                    usulanMT2.setLain(blanko0123.getLain());
                                    usulanMT2.setBero(blanko0123.getBero());
                                    usulanMT2.setLuas_swiri((usulanMT2.getPadi() + usulanMT2.getTebu_muda() + usulanMT2.getTebu_tua() + usulanMT2.getPalawija()
                                            + usulanMT2.getLain() + usulanMT2.getBero()));
                                    usulanMT2.setGol(blanko0123.getGol());
                                    usulanMT2.setTgl_mt(blanko0123.getTgl_mt());
                                    usulanMT2.setTgledit(currentDateandTime);
                                    usulanMT2.setFlag(false);
                                    LocalData.saveOrUpdate(usulanMT2);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                                break;
                            case "MT3":
                                try {
                                    queryFilters = new QueryFilters();
                                    queryFilters.add("kd_mt", kodeMT);
                                    queryFilters.add("kd_org", blanko0123.getKd_org());
                                    queryFilters.add("urut_mt", "MT3");
                                    queryFilters.add("jenis_uk", "u");

                                    usulanMT3 = LocalData.get(queryFilters, Blanko0123.class);
                                    usulanMT3.setPadi(blanko0123.getPadi());
                                    usulanMT3.setTebu_tua(blanko0123.getTebu_tua());
                                    usulanMT3.setTebu_muda(blanko0123.getTebu_muda());
                                    usulanMT3.setPalawija(blanko0123.getPalawija());
                                    usulanMT3.setLain(blanko0123.getLain());
                                    usulanMT3.setBero(blanko0123.getBero());
                                    usulanMT3.setLuas_swiri((usulanMT3.getPadi() + usulanMT3.getTebu_muda() + usulanMT3.getTebu_tua() + usulanMT3.getPalawija()
                                            + usulanMT3.getLain() + usulanMT3.getBero()));
                                    usulanMT3.setGol(blanko0123.getGol());
                                    usulanMT3.setTgl_mt(blanko0123.getTgl_mt());
                                    usulanMT3.setTgledit(currentDateandTime);
                                    usulanMT3.setFlag(false);
                                    LocalData.saveOrUpdate(usulanMT3);
                                } catch (Exception e){
                                    e.printStackTrace();
                                }
                                break;
                        }
                    }
                }
                Toast.makeText(getActivity(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), HomeActivity.class);
                startActivity(intent);
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    private void populateData(int kodeMT, String kodeOrg) {

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("jenis_uk", "u");

        blanko0123ListUsulan = new ArrayList<>();
        blanko0123ListUsulan.addAll(LocalData.getList(queryFilters, Blanko0123.class, "kd_mt", Sort.DESCENDING));

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("jenis_uk", "k");

        blanko0123ListKeputusan = new ArrayList<>();
        blanko0123ListKeputusan.addAll(LocalData.getList(queryFilters, Blanko0123.class, "kd_mt", Sort.DESCENDING));

        blanko0123ModelList.add(new Blanko0123Model(blanko0123ListUsulan, blanko0123ListKeputusan));
    }

    @SuppressLint("SetTextI18n")
    private void populateDataFooter(int kodeMT, String kodeOrg) {
        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT1");
        queryFilters.add("jenis_uk", "u");

        try {
            usulanMT1 = LocalData.get(queryFilters, Blanko0123.class);
            summaryUsulanMT1 = usulanMT1.getPadi() + usulanMT1.getTebu_muda() + usulanMT1.getTebu_tua() + usulanMT1.getPalawija()
                    + usulanMT1.getLain() + usulanMT1.getBero();
            usulanMT1All += summaryUsulanMT1;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT2");
        queryFilters.add("jenis_uk", "u");

        try {
            usulanMT2 = LocalData.get(queryFilters, Blanko0123.class);
            summaryUsulanMT2 = usulanMT2.getPadi() + usulanMT2.getTebu_muda() + usulanMT2.getTebu_tua() + usulanMT2.getPalawija()
                    + usulanMT2.getLain() + usulanMT2.getBero();
            usulanMT2All += summaryUsulanMT2;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT3");
        queryFilters.add("jenis_uk", "u");

        try {
            usulanMT3 = LocalData.get(queryFilters, Blanko0123.class);
            summaryUsulanMT3 = usulanMT3.getPadi() + usulanMT3.getTebu_muda() + usulanMT3.getTebu_tua() + usulanMT3.getPalawija()
                    + usulanMT3.getLain() + usulanMT3.getBero();
            usulanMT3All += summaryUsulanMT3;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT1");
        queryFilters.add("jenis_uk", "k");

        try {
            keputusanMT1 = LocalData.get(queryFilters, Blanko0123.class);
            summaryKeputusanMT1 = keputusanMT1.getPadi() + keputusanMT1.getTebu_muda() + keputusanMT1.getTebu_tua() + keputusanMT1.getPalawija()
                    + keputusanMT1.getLain() + keputusanMT1.getBero();
            keputusanMT1All += summaryKeputusanMT1;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT2");
        queryFilters.add("jenis_uk", "k");

        try {
            keputusanMT2 = LocalData.get(queryFilters, Blanko0123.class);
            summaryKeputusanMT2 = keputusanMT2.getPadi() + keputusanMT2.getTebu_muda() + keputusanMT2.getTebu_tua() + keputusanMT2.getPalawija()
                    + keputusanMT2.getLain() + keputusanMT2.getBero();
            keputusanMT2All += summaryKeputusanMT2;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("kd_org", kodeOrg);
        queryFilters.add("urut_mt", "MT3");
        queryFilters.add("jenis_uk", "k");

        try {
            keputusanMT3 = LocalData.get(queryFilters, Blanko0123.class);
            summaryKeputusanMT3 = keputusanMT3.getPadi() + keputusanMT3.getTebu_muda() + keputusanMT3.getTebu_tua() + keputusanMT3.getPalawija()
                    + keputusanMT3.getLain() + keputusanMT3.getBero();
            keputusanMT3All += summaryKeputusanMT3;
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

    }
}
