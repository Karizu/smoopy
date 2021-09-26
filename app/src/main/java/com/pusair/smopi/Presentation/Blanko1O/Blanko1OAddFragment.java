package com.pusair.smopi.Presentation.Blanko1O;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Sync;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
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
import java.util.UUID;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko1OAddFragment extends Fragment {

    @BindView(R.id.namaIp3a)
    TextView namaIp3a;

    @BindView(R.id.keputusanMT1Padi)
    TextView keputusanMT1Padi;

    @BindView(R.id.keputusanMT2Padi)
    TextView keputusanMT2Padi;

    @BindView(R.id.keputusanMT3Padi)
    TextView keputusanMT3Padi;

    @BindView(R.id.keputusanMT1TebuTua)
    TextView keputusanMT1TebuTua;

    @BindView(R.id.keputusanMT2TebuTua)
    TextView keputusanMT2TebuTua;

    @BindView(R.id.keputusanMT3TebuTua)
    TextView keputusanMT3TebuTua;

    @BindView(R.id.keputusanMT1TebuMuda)
    TextView keputusanMT1TebuMuda;

    @BindView(R.id.keputusanMT2TebuMuda)
    TextView keputusanMT2TebuMuda;

    @BindView(R.id.keputusanMT3TebuMuda)
    TextView keputusanMT3TebuMuda;

    @BindView(R.id.keputusanMT1Palawija)
    TextView keputusanMT1Palawija;

    @BindView(R.id.keputusanMT2Palawija)
    TextView keputusanMT2Palawija;

    @BindView(R.id.keputusanMT3Palawija)
    TextView keputusanMT3Palawija;

    @BindView(R.id.keputusanMT1KeperluanLain)
    TextView keputusanMT1KeperluanLain;

    @BindView(R.id.keputusanMT2KeperluanLain)
    TextView keputusanMT2KeperluanLain;

    @BindView(R.id.keputusanMT3KeperluanLain)
    TextView keputusanMT3KeperluanLain;

    @BindView(R.id.keputusanMT1Bero)
    TextView keputusanMT1Bero;

    @BindView(R.id.keputusanMT2Bero)
    TextView keputusanMT2Bero;

    @BindView(R.id.keputusanMT3Bero)
    TextView keputusanMT3Bero;

    @BindView(R.id.keputusanMT1GolTanam)
    TextView keputusanMT1GolTanam;

    @BindView(R.id.keputusanMT2GolTanam)
    TextView keputusanMT2GolTanam;

    @BindView(R.id.keputusanMT3GolTanam)
    TextView keputusanMT3GolTanam;

    @BindView(R.id.keputusanMT1TglOlah)
    TextView keputusanMT1TglOlah;

    @BindView(R.id.keputusanMT2TglOlah)
    TextView keputusanMT2TglOlah;

    @BindView(R.id.keputusanMT3TglOlah)
    TextView keputusanMT3TglOlah;

    @BindView(R.id.KeputusanMT1LsIrigasi)
    TextView keputusanMT1LsIrigasi;

    @BindView(R.id.keputusanMT2LsIrigasi)
    TextView keputusanMT2LsIrigasi;

    @BindView(R.id.keputusanMT3LsIrigasi)
    TextView keputusanMT3LsIrigasi;

    @BindView(R.id.usulanMT1Padi)
    EditText usulanMT1Padi;

    @BindView(R.id.usulanMT2Padi)
    EditText usulanMT2Padi;

    @BindView(R.id.usulanMT3Padi)
    EditText usulanMT3Padi;

    @BindView(R.id.usulanMT1TebuTua)
    EditText usulanMT1TebuTua;

    @BindView(R.id.usulanMT2TebuTua)
    EditText usulanMT2TebuTua;

    @BindView(R.id.usulanMT3TebuTua)
    EditText usulanMT3TebuTua;

    @BindView(R.id.usulanMT1TebuMuda)
    EditText usulanMT1TebuMuda;

    @BindView(R.id.usulanMT2TebuMuda)
    EditText usulanMT2TebuMuda;

    @BindView(R.id.usulanMT3TebuMuda)
    EditText usulanMT3TebuMuda;

    @BindView(R.id.usulanMT1Palawija)
    EditText usulanMT1Palawija;

    @BindView(R.id.usulanMT2Palawija)
    EditText usulanMT2Palawija;

    @BindView(R.id.usulanMT3Palawija)
    EditText usulanMT3Palawija;

    @BindView(R.id.usulanMT1KeperluanLain)
    EditText usulanMT1KeperluanLain;

    @BindView(R.id.usulanMT2KeperluanLain)
    EditText usulanMT2KeperluanLain;

    @BindView(R.id.usulanMT3KeperluanLain)
    EditText usulanMT3KeperluanLain;

    @BindView(R.id.usulanMT1Bero)
    EditText usulanMT1Bero;

    @BindView(R.id.usulanMT2Bero)
    EditText usulanMT2Bero;

    @BindView(R.id.usulanMT3Bero)
    EditText usulanMT3Bero;

    @BindView(R.id.usulanMT1GolTanam)
    EditText usulanMT1GolTanam;

    @BindView(R.id.usulanMT2GolTanam)
    EditText usulanMT2GolTanam;

    @BindView(R.id.usulanMT3GolTanam)
    EditText usulanMT3GolTanam;

    @BindView(R.id.usulanMT1TglOlah)
    EditText usulanMT1TglOlah;

    @BindView(R.id.usulanMT2TglOlah)
    EditText usulanMT2TglOlah;

    @BindView(R.id.usulanMT3TglOlah)
    EditText usulanMT3TglOlah;

    @BindView(R.id.usulanMT1LsIrigasi)
    TextView usulanMT1LsIrigasi;

    @BindView(R.id.usulanMT2LsIrigasi)
    TextView usulanMT2LsIrigasi;

    @BindView(R.id.usulanMT3LsIrigasi)
    TextView usulanMT3LsIrigasi;

    private QueryFilters queryFilters;

    private Blanko0123 keputusanMT1;

    private Blanko0123 keputusanMT2;

    private Blanko0123 keputusanMT3;

    private Blanko0123 usulanMT1;

    private Blanko0123 usulanMT2;

    private Blanko0123 usulanMT3;

    private int kodeMT;

    private String kodeOrg;

    private int action;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_add_blanko_1o, null);
        ButterKnife.bind(this, view);

        ((HomeActivity)getActivity()).saveBtn.setVisibility(View.VISIBLE);

        ((HomeActivity)getActivity()).saveBtn.setOnClickListener(view1 -> {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            try {

                if (action == Constant.ACTION_ADD) {
                    queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                    User currentUser = LocalData.get(queryFilters, User.class);

                    usulanMT1.setId(UUID.randomUUID().toString());
                    usulanMT1.setKd_staf(currentUser.getKd_staf());
                    usulanMT1.setKd_mt(kodeMT);
                    usulanMT1.setKd_org(kodeOrg);
                    usulanMT1.setJenis_uk("u");
                    usulanMT1.setUrut_mt("MT1");
                    usulanMT1.setPadi(Float.parseFloat(usulanMT1Padi.getText().toString().equals("")?"0":usulanMT1Padi.getText().toString()));
                    usulanMT1.setTebu_tua(Float.parseFloat(usulanMT1TebuTua.getText().toString().equals("")?"0":usulanMT1TebuTua.getText().toString()));
                    usulanMT1.setTebu_muda(Float.parseFloat(usulanMT1TebuMuda.getText().toString().equals("")?"0":usulanMT1TebuMuda.getText().toString()));
                    usulanMT1.setPalawija(Float.parseFloat(usulanMT1Palawija.getText().toString().equals("")?"0":usulanMT1Palawija.getText().toString()));
                    usulanMT1.setLain(Float.parseFloat(usulanMT1KeperluanLain.getText().toString().equals("")?"0":usulanMT1KeperluanLain.getText().toString()));
                    usulanMT1.setBero(Float.parseFloat(usulanMT1Bero.getText().toString().equals("")?"0":usulanMT1Bero.getText().toString()));
                    usulanMT1.setLuas_swiri((usulanMT1.getPadi() + usulanMT1.getTebu_muda() + usulanMT1.getTebu_tua() + usulanMT1.getPalawija()
                            + usulanMT1.getLain() + usulanMT1.getBero()));
                    usulanMT1.setGol(usulanMT1GolTanam.getText().toString().equals("")?"0":usulanMT1GolTanam.getText().toString());
                    usulanMT1.setTgl_mt(usulanMT1TglOlah.getText().toString().equals("")?"0":usulanMT1TglOlah.getText().toString());
                    usulanMT1.setTgledit(currentDateandTime);
                    usulanMT1.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT1);
                    System.out.println("usulanMT1: "+ new Gson().toJson(usulanMT1));

                    usulanMT2.setId(UUID.randomUUID().toString());
                    usulanMT2.setKd_staf(currentUser.getKd_staf());
                    usulanMT2.setKd_mt(kodeMT);
                    usulanMT2.setKd_org(kodeOrg);
                    usulanMT2.setJenis_uk("u");
                    usulanMT2.setUrut_mt("MT2");
                    usulanMT2.setPadi(Float.parseFloat(usulanMT2Padi.getText().toString().equals("")?"0":usulanMT2Padi.getText().toString()));
                    usulanMT2.setTebu_tua(Float.parseFloat(usulanMT2TebuTua.getText().toString().equals("")?"0":usulanMT2TebuTua.getText().toString()));
                    usulanMT2.setTebu_muda(Float.parseFloat(usulanMT2TebuMuda.getText().toString().equals("")?"0":usulanMT2TebuMuda.getText().toString()));
                    usulanMT2.setPalawija(Float.parseFloat(usulanMT2Palawija.getText().toString().equals("")?"0":usulanMT2Palawija.getText().toString()));
                    usulanMT2.setLain(Float.parseFloat(usulanMT2KeperluanLain.getText().toString().equals("")?"0":usulanMT2KeperluanLain.getText().toString()));
                    usulanMT2.setBero(Float.parseFloat(usulanMT2Bero.getText().toString().equals("")?"0":usulanMT1Bero.getText().toString()));
                    usulanMT2.setLuas_swiri((usulanMT2.getPadi() + usulanMT2.getTebu_muda() + usulanMT2.getTebu_tua() + usulanMT2.getPalawija()
                            + usulanMT2.getLain() + usulanMT2.getBero()));
                    usulanMT2.setGol(usulanMT2GolTanam.getText().toString().equals("")?"0":usulanMT1GolTanam.getText().toString());
                    usulanMT2.setTgl_mt(usulanMT2TglOlah.getText().toString().equals("")?"0":usulanMT1TglOlah.getText().toString());
                    usulanMT2.setTgledit(currentDateandTime);
                    usulanMT2.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT2);
                    System.out.println("usulanMT2: "+ new Gson().toJson(usulanMT2));

                    usulanMT3.setId(UUID.randomUUID().toString());
                    usulanMT3.setKd_staf(currentUser.getKd_staf());
                    usulanMT3.setKd_mt(kodeMT);
                    usulanMT3.setKd_org(kodeOrg);
                    usulanMT3.setJenis_uk("u");
                    usulanMT3.setUrut_mt("MT3");
                    usulanMT3.setPadi(Float.parseFloat(usulanMT3Padi.getText().toString().equals("")?"0":usulanMT3Padi.getText().toString()));
                    usulanMT3.setTebu_tua(Float.parseFloat(usulanMT3TebuTua.getText().toString().equals("")?"0":usulanMT3TebuTua.getText().toString()));
                    usulanMT3.setTebu_muda(Float.parseFloat(usulanMT3TebuMuda.getText().toString().equals("")?"0":usulanMT3TebuMuda.getText().toString()));
                    usulanMT3.setPalawija(Float.parseFloat(usulanMT3Palawija.getText().toString().equals("")?"0":usulanMT3Palawija.getText().toString()));
                    usulanMT3.setLain(Float.parseFloat(usulanMT3KeperluanLain.getText().toString().equals("")?"0":usulanMT3KeperluanLain.getText().toString()));
                    usulanMT3.setBero(Float.parseFloat(usulanMT3Bero.getText().toString().equals("")?"0":usulanMT3Bero.getText().toString()));
                    usulanMT3.setLuas_swiri((usulanMT3.getPadi() + usulanMT3.getTebu_muda() + usulanMT3.getTebu_tua() + usulanMT3.getPalawija()
                            + usulanMT3.getLain() + usulanMT3.getBero()));
                    usulanMT3.setGol(usulanMT3GolTanam.getText().toString().equals("")?"0":usulanMT3GolTanam.getText().toString());
                    usulanMT3.setTgl_mt(usulanMT3TglOlah.getText().toString().equals("")?"0":usulanMT3TglOlah.getText().toString());
                    usulanMT3.setTgledit(currentDateandTime);
                    usulanMT3.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT3);

                    Toast.makeText(getActivity(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);

                    System.out.println("usulanMT3: "+ new Gson().toJson(usulanMT3));
                } else {
                    usulanMT1.setPadi(Float.parseFloat(usulanMT1Padi.getText().toString()));
                    usulanMT1.setTebu_tua(Float.parseFloat(usulanMT1TebuTua.getText().toString()));
                    usulanMT1.setTebu_muda(Float.parseFloat(usulanMT1TebuMuda.getText().toString()));
                    usulanMT1.setPalawija(Float.parseFloat(usulanMT1Palawija.getText().toString()));
                    usulanMT1.setLain(Float.parseFloat(usulanMT1KeperluanLain.getText().toString()));
                    usulanMT1.setBero(Float.parseFloat(usulanMT1Bero.getText().toString()));
                    usulanMT1.setLuas_swiri((usulanMT1.getPadi() + usulanMT1.getTebu_muda() + usulanMT1.getTebu_tua() + usulanMT1.getPalawija()
                            + usulanMT1.getLain() + usulanMT1.getBero()));
                    usulanMT1.setGol(usulanMT1GolTanam.getText().toString());
                    usulanMT1.setTgl_mt(usulanMT1TglOlah.getText().toString());
                    usulanMT1.setTgledit(currentDateandTime);
                    usulanMT1.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT1);

                    usulanMT2.setPadi(Float.parseFloat(usulanMT2Padi.getText().toString()));
                    usulanMT2.setTebu_tua(Float.parseFloat(usulanMT2TebuTua.getText().toString()));
                    usulanMT2.setTebu_muda(Float.parseFloat(usulanMT2TebuMuda.getText().toString()));
                    usulanMT2.setPalawija(Float.parseFloat(usulanMT2Palawija.getText().toString()));
                    usulanMT2.setLain(Float.parseFloat(usulanMT2KeperluanLain.getText().toString()));
                    usulanMT2.setBero(Float.parseFloat(usulanMT2Bero.getText().toString()));
                    usulanMT2.setLuas_swiri((usulanMT2.getPadi() + usulanMT2.getTebu_muda() + usulanMT2.getTebu_tua() + usulanMT2.getPalawija()
                            + usulanMT2.getLain() + usulanMT2.getBero()));
                    usulanMT2.setGol(usulanMT2GolTanam.getText().toString());
                    usulanMT2.setTgl_mt(usulanMT2TglOlah.getText().toString());
                    usulanMT2.setTgledit(currentDateandTime);
                    usulanMT2.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT2);

                    usulanMT3.setPadi(Float.parseFloat(usulanMT3Padi.getText().toString()));
                    usulanMT3.setTebu_tua(Float.parseFloat(usulanMT3TebuTua.getText().toString()));
                    usulanMT3.setTebu_muda(Float.parseFloat(usulanMT3TebuMuda.getText().toString()));
                    usulanMT3.setPalawija(Float.parseFloat(usulanMT3Palawija.getText().toString()));
                    usulanMT3.setLain(Float.parseFloat(usulanMT3KeperluanLain.getText().toString()));
                    usulanMT3.setBero(Float.parseFloat(usulanMT3Bero.getText().toString()));
                    usulanMT3.setLuas_swiri((usulanMT3.getPadi() + usulanMT3.getTebu_muda() + usulanMT3.getTebu_tua() + usulanMT3.getPalawija()
                            + usulanMT3.getLain() + usulanMT3.getBero()));
                    usulanMT3.setGol(usulanMT3GolTanam.getText().toString());
                    usulanMT3.setTgl_mt(usulanMT3TglOlah.getText().toString());
                    usulanMT3.setTgledit(currentDateandTime);
                    usulanMT3.setFlag(false);
                    LocalData.saveOrUpdate(usulanMT3);

                    Toast.makeText(getActivity(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                }
            } catch (SessionNotFoundException e) {
                e.printStackTrace();
            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }
        });


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        action = getArguments().getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        kodeOrg = getArguments().getString("kodeOrg");

        namaIp3a.setText(getArguments().getString("kodeOrg"));

        populateData(action, kodeMT, kodeOrg);

    }

    @SuppressLint("SetTextI18n")
    private void populateData(int action, int kodeMT, String kodeOrg) {

        try {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("urut_mt", "MT1");
            queryFilters.add("jenis_uk", "k");
            keputusanMT1 = LocalData.get(queryFilters, Blanko0123.class);

            keputusanMT1Padi.setText(keputusanMT1.getPadi() + " ha");
            keputusanMT1TebuTua.setText(keputusanMT1.getTebu_tua() + " ha");
            keputusanMT1TebuMuda.setText(keputusanMT1.getTebu_muda() + " ha");
            keputusanMT1Palawija.setText(keputusanMT1.getPalawija() + " ha");
            keputusanMT1KeperluanLain.setText(keputusanMT1.getLain() + " ha");
            keputusanMT1Bero.setText(keputusanMT1.getBero() + " ha");
            keputusanMT1GolTanam.setText(keputusanMT1.getGol());
            keputusanMT1TglOlah.setText(keputusanMT1.getTgl_mt());
            keputusanMT1LsIrigasi.setText("Keputusan " + (keputusanMT1.getPadi() + keputusanMT1.getTebu_muda() + keputusanMT1.getTebu_tua() + keputusanMT1.getPalawija()
                    + keputusanMT1.getLain() + keputusanMT1.getBero()) + " ha");

            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("urut_mt", "MT2");
            queryFilters.add("jenis_uk", "k");
            keputusanMT2 = LocalData.get(queryFilters, Blanko0123.class);

            keputusanMT2Padi.setText(keputusanMT2.getPadi() + " ha");
            keputusanMT2TebuTua.setText(keputusanMT2.getTebu_tua() + " ha");
            keputusanMT2TebuMuda.setText(keputusanMT2.getTebu_muda() + " ha");
            keputusanMT2Palawija.setText(keputusanMT2.getPalawija() + " ha");
            keputusanMT2KeperluanLain.setText(keputusanMT2.getLain() + " ha");
            keputusanMT2Bero.setText(keputusanMT2.getBero() + " ha");
            keputusanMT2GolTanam.setText(keputusanMT2.getGol());
            keputusanMT2TglOlah.setText(keputusanMT2.getTgl_mt());
            keputusanMT2LsIrigasi.setText("Keputusan " + (keputusanMT2.getPadi() + keputusanMT2.getTebu_muda() + keputusanMT2.getTebu_tua() + keputusanMT2.getPalawija()
                    + keputusanMT2.getLain() + keputusanMT2.getBero()) + " ha");

            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("urut_mt", "MT3");
            queryFilters.add("jenis_uk", "k");
            keputusanMT3 = LocalData.get(queryFilters, Blanko0123.class);

            keputusanMT3Padi.setText(keputusanMT3.getPadi() + " ha");
            keputusanMT3TebuTua.setText(keputusanMT3.getTebu_tua() + " ha");
            keputusanMT3TebuMuda.setText(keputusanMT3.getTebu_muda() + " ha");
            keputusanMT3Palawija.setText(keputusanMT3.getPalawija() + " ha");
            keputusanMT3KeperluanLain.setText(keputusanMT3.getLain() + " ha");
            keputusanMT3Bero.setText(keputusanMT3.getBero() + " ha");
            keputusanMT3GolTanam.setText(keputusanMT3.getGol());
            keputusanMT3TglOlah.setText(keputusanMT3.getTgl_mt());
            keputusanMT3LsIrigasi.setText("Keputusan " + (keputusanMT3.getPadi() + keputusanMT3.getTebu_muda() + keputusanMT3.getTebu_tua() + keputusanMT3.getPalawija()
                    + keputusanMT3.getLain() + keputusanMT3.getBero()) + " ha");

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

        if (action == 2) {
            try {
                queryFilters = new QueryFilters();
                queryFilters.add("kd_mt", kodeMT);
                queryFilters.add("kd_org", kodeOrg);
                queryFilters.add("urut_mt", "MT1");
                queryFilters.add("jenis_uk", "u");

                usulanMT1 = LocalData.get(queryFilters, Blanko0123.class);
                usulanMT1Padi.setText(String.valueOf(usulanMT1.getPadi()));
                usulanMT1TebuTua.setText(String.valueOf(usulanMT1.getTebu_tua()));
                usulanMT1TebuMuda.setText(String.valueOf(usulanMT1.getTebu_muda()));
                usulanMT1Palawija.setText(String.valueOf(usulanMT1.getPalawija()));
                usulanMT1KeperluanLain.setText(String.valueOf(usulanMT1.getLain()));
                usulanMT1Bero.setText(String.valueOf(usulanMT1.getBero()));
                usulanMT1GolTanam.setText(String.valueOf(usulanMT1.getGol()));
                usulanMT1TglOlah.setText(usulanMT1.getTgl_mt());
                usulanMT1LsIrigasi.setText("Usulan " + (usulanMT1.getPadi() + usulanMT1.getTebu_muda() + usulanMT1.getTebu_tua() + usulanMT1.getPalawija()
                        + usulanMT1.getLain() + usulanMT1.getBero()) + " ha");

                queryFilters = new QueryFilters();
                queryFilters.add("kd_mt", kodeMT);
                queryFilters.add("kd_org", kodeOrg);
                queryFilters.add("urut_mt", "MT2");
                queryFilters.add("jenis_uk", "u");

                usulanMT2 = LocalData.get(queryFilters, Blanko0123.class);
                usulanMT2Padi.setText(String.valueOf(usulanMT2.getPadi()));
                usulanMT2TebuTua.setText(String.valueOf(usulanMT2.getTebu_tua()));
                usulanMT2TebuMuda.setText(String.valueOf(usulanMT2.getTebu_muda()));
                usulanMT2Palawija.setText(String.valueOf(usulanMT2.getPalawija()));
                usulanMT2KeperluanLain.setText(String.valueOf(usulanMT2.getLain()));
                usulanMT2Bero.setText(String.valueOf(usulanMT2.getBero()));
                usulanMT2GolTanam.setText(usulanMT2.getGol());
                usulanMT2TglOlah.setText(usulanMT2.getTgl_mt());
                usulanMT2LsIrigasi.setText("Usulan " + (usulanMT2.getPadi() + usulanMT2.getTebu_muda() + usulanMT2.getTebu_tua() + usulanMT2.getPalawija()
                        + usulanMT2.getLain() + usulanMT2.getBero()) + " ha");

                queryFilters = new QueryFilters();
                queryFilters.add("kd_mt", kodeMT);
                queryFilters.add("kd_org", kodeOrg);
                queryFilters.add("urut_mt", "MT3");
                queryFilters.add("jenis_uk", "u");

                usulanMT3 = LocalData.get(queryFilters, Blanko0123.class);
                usulanMT3Padi.setText(String.valueOf(usulanMT3.getPadi()));
                usulanMT3TebuTua.setText(String.valueOf(usulanMT3.getTebu_tua()));
                usulanMT3TebuMuda.setText(String.valueOf(usulanMT3.getTebu_muda()));
                usulanMT3Palawija.setText(String.valueOf(usulanMT3.getPalawija()));
                usulanMT3KeperluanLain.setText(String.valueOf(usulanMT3.getLain()));
                usulanMT3Bero.setText(String.valueOf(usulanMT3.getBero()));
                usulanMT3GolTanam.setText(usulanMT3.getGol());
                usulanMT3TglOlah.setText(usulanMT3.getTgl_mt());
                usulanMT3LsIrigasi.setText("Usulan " + (usulanMT3.getPadi() + usulanMT3.getTebu_muda() + usulanMT3.getTebu_tua() + usulanMT3.getPalawija()
                        + usulanMT3.getLain() + usulanMT3.getBero()) + " ha");

            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            usulanMT1 = new Blanko0123();
            usulanMT2 = new Blanko0123();
            usulanMT3 = new Blanko0123();
        }
    }

}
