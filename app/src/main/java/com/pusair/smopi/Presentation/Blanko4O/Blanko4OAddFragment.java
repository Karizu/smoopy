package com.pusair.smopi.Presentation.Blanko4O;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko4OAddFragment extends Fragment {

    @BindView(R.id.spinner_keadaan_air)
    MaterialSpinner spinnerKeadaanAir;

    @BindView(R.id.label_padi)
    TextView labelPadi;

    @BindView(R.id.ed_realisasiPadi)
    EditText realisasiPadi;

    @BindView(R.id.label_usulan_padi_1)
    TextView usulanPadiOlahTanah;

    @BindView(R.id.label_usulan_padi_2)
    TextView usulanPadiTumbuh;

    @BindView(R.id.label_usulan_padi_3)
    TextView usulanPadiPanen;

    @BindView(R.id.ed_realisasiBero)
    EditText realisasiBero;

    @BindView(R.id.label_usulan_bero)
    TextView usulanBero;

    @BindView(R.id.ed_kekeringan_padi)
    EditText kekeringanPadi;

    @BindView(R.id.ed_genangan_padi)
    EditText genanganPadi;

    @BindView(R.id.ed_kekeringan_tebu)
    EditText kekeringanTebu;

    @BindView(R.id.ed_genangan_tebu)
    EditText genanganTebu;

    @BindView(R.id.ed_kekeringan_palawija)
    EditText kekeringanPalawija;

    @BindView(R.id.ed_genangan_palawija)
    EditText genanganPalawija;

    @BindView(R.id.ed_lain_lain)
    EditText realisasiLainLain;

    @BindView(R.id.label_usulan_lain)
    TextView usulanLain;

    @BindView(R.id.label_realisasi_ls_sawah)
    TextView realisasiLuasSawah;

    @BindView(R.id.label_usulan_ls_sawah)
    TextView usulanLuasSawah;

    @BindView(R.id.ed_realisasiTebuMuda)
    EditText realisasiTebuMuda;

    @BindView(R.id.ed_realisasiTebuTua)
    EditText realisasiTebuTua;

    @BindView(R.id.label_usulan_tebu_1)
    TextView usulanTebuOlahTanah;

    @BindView(R.id.label_usulan_tebu_2)
    TextView usulanTebuMuda;

    @BindView(R.id.label_usulan_tebu_3)
    TextView usulanTebuTua;

    @BindView(R.id.ed_realisasiPalawija)
    EditText realisasiPalawija;

    @BindView(R.id.usulan_palawija_banyak_air)
    TextView usulanPalawijaBanyakAir;

    @BindView(R.id.usulan_palawija_sedikit_air)
    TextView usulanPalawijaSedikitAir;

    @BindView(R.id.label_palawija)
    TextView labelPalawija;

    private int kodeMT = 0;
    private String urutMT = "MT1";
    private String tahunBulan = "202001";
    private int perioda = 1;
    private int action = 0;
    private QueryFilters queryFilters;
    private Blanko0405 blanko0405;
    private String keadaanAir = "";
    private List<String> keadaanAirList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_add_blanko_4o, null);
        ButterKnife.bind(this, view);

        keadaanAirList = new ArrayList<>();
        keadaanAirList.add("-- Pilih --");
        keadaanAirList.add("berlebihan");
        keadaanAirList.add("cukup");
        keadaanAirList.add("kurang");

        ((HomeActivity)getActivity()).saveBtn.setVisibility(View.VISIBLE);

        ((HomeActivity)getActivity()).saveBtn.setOnClickListener(view1 -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            try {
                if (action == 1) {
                    queryFilters = new QueryFilters();

                    queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                    User currentUser = LocalData.get(queryFilters, User.class);

                    blanko0405.setId(UUID.randomUUID().toString());
                    blanko0405.setKd_staf(currentUser.getKd_staf());
                    blanko0405.setKd_mt(kodeMT);
                    blanko0405.setThbln(tahunBulan);
                    blanko0405.setPoda_air(perioda);
                    blanko0405.setUrut_mt(urutMT);

                    try {
                        blanko0405.setRs_padi(Float.parseFloat(realisasiPadi.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_padi(0);
                    }

                    try {
                        blanko0405.setRs_bero(Float.parseFloat(realisasiBero.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_bero(0);
                    }


                    blanko0405.setKa_airpetak(keadaanAir);

                    try {
                        blanko0405.setPadi_krg(Float.parseFloat(kekeringanPadi.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setPadi_krg(0);
                    }

                    try {
                        blanko0405.setTebu_krg(Float.parseFloat(kekeringanTebu.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setTebu_krg(0);
                    }
                    try {
                        blanko0405.setWija_krg(Float.parseFloat(kekeringanPalawija.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setWija_krg(0);
                    }

                    try {
                        blanko0405.setPadi_bjr(Float.parseFloat(genanganPadi.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setPadi_bjr(0);
                    }

                    try {
                        blanko0405.setTebu_bjr(Float.parseFloat(genanganTebu.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setTebu_bjr(0);
                    }

                    try {
                        blanko0405.setWija_bjr(Float.parseFloat(genanganPalawija.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setWija_bjr(0);
                    }

                    try {
                        blanko0405.setRs_lain(Float.parseFloat(realisasiLainLain.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_lain(0);
                    }

                    try {
                        blanko0405.setRs_tebu_muda(Float.parseFloat(realisasiTebuMuda.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_tebu_muda(0);
                    }

                    try {
                        blanko0405.setRs_tebu_tua(Float.parseFloat(realisasiTebuTua.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_tebu_tua(0);
                    }

                    try {
                        blanko0405.setRs_palawija(Float.parseFloat(realisasiPalawija.getText().toString()));
                    } catch(NumberFormatException ex) {
                        blanko0405.setRs_palawija(0);
                    }

                    blanko0405.setTgledit(currentDateandTime);
                    blanko0405.setFlag(false);
                    LocalData.saveOrUpdate(blanko0405);

                    Toast.makeText(getActivity(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);

                    System.out.println("blanko0405: "+ new Gson().toJson(blanko0405));

                } else {
                    blanko0405.setRs_padi(Float.parseFloat(realisasiPadi.getText().toString()));
                    blanko0405.setRs_bero(Float.parseFloat(realisasiBero.getText().toString()));

                    blanko0405.setKa_airpetak(keadaanAir);

                    blanko0405.setPadi_krg(Float.parseFloat(kekeringanPadi.getText().toString()));
                    blanko0405.setTebu_krg(Float.parseFloat(kekeringanTebu.getText().toString()));
                    blanko0405.setWija_krg(Float.parseFloat(kekeringanPalawija.getText().toString()));

                    blanko0405.setPadi_bjr(Float.parseFloat(genanganPadi.getText().toString()));
                    blanko0405.setTebu_bjr(Float.parseFloat(genanganTebu.getText().toString()));
                    blanko0405.setWija_bjr(Float.parseFloat(genanganPalawija.getText().toString()));

                    blanko0405.setRs_lain(Float.parseFloat(realisasiLainLain.getText().toString()));

                    blanko0405.setRs_tebu_muda(Float.parseFloat(realisasiTebuMuda.getText().toString()));
                    blanko0405.setRs_tebu_tua(Float.parseFloat(realisasiTebuTua.getText().toString()));

                    blanko0405.setRs_palawija(Float.parseFloat(realisasiPalawija.getText().toString()));

                    blanko0405.setLuas_swiri(
                            Float.parseFloat(realisasiPadi.getText().toString()) +
                                    Float.parseFloat(realisasiBero.getText().toString()) +
                                    Float.parseFloat(realisasiLainLain.getText().toString()) +
                                    Float.parseFloat(realisasiPalawija.getText().toString()) +
                                    Float.parseFloat(realisasiTebuMuda.getText().toString()) +
                                    Float.parseFloat(realisasiTebuTua.getText().toString())
                    );

                    blanko0405.setTgledit(currentDateandTime);
                    blanko0405.setFlag(false);
                    LocalData.saveOrUpdate(blanko0405);

                    Toast.makeText(getActivity(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                }

                Toast.makeText(getActivity(), "Data berhasil disimpan", Toast.LENGTH_SHORT).show();

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
        urutMT = getArguments().getString("urutMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");

        populateData(action, kodeMT, urutMT, tahunBulan, perioda);

        spinnerKeadaanAir.setItems(keadaanAirList);

        spinnerKeadaanAir.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                keadaanAir = view.getItems().get(position).toString();
            }
        });

    }

    private void populateData(int action, int kodeMT, String urutMT, String tahunBulan, int perioda) {

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("urut_mt", urutMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("poda_air", perioda);

        if (action == 2) {
            try {
                blanko0405 = LocalData.get(queryFilters, Blanko0405.class);
                System.out.println("Json: "+new Gson().toJson(blanko0405));
                realisasiPadi.setText(String.valueOf(blanko0405.getRs_padi()));
                usulanPadiOlahTanah.setText(usulanPadiOlahTanah.getText()+" "+blanko0405.getUs_padi_olahtanah()+" Ha");
                usulanPadiPanen.setText(usulanPadiPanen.getText()+" "+blanko0405.getUs_padi_panen()+" Ha");
                usulanPadiTumbuh.setText(usulanPadiTumbuh.getText()+" "+blanko0405.getUs_padi_panen()+" Ha");

                realisasiBero.setText(String.valueOf(blanko0405.getRs_bero()));
                usulanBero.setText(usulanBero.getText()+" "+blanko0405.getUs_bero()+" Ha");

                if (blanko0405.getKa_airpetak() != null) {
                    spinnerKeadaanAir.setSelectedIndex(keadaanAirList.indexOf(blanko0405.getKa_airpetak()));
                } else {
                    spinnerKeadaanAir.setSelectedIndex(0);
                }

                kekeringanPadi.setText(String.valueOf(blanko0405.getPadi_krg()));
                kekeringanTebu.setText(String.valueOf(blanko0405.getTebu_krg()));
                kekeringanPalawija.setText(String.valueOf(blanko0405.getWija_krg()));

                genanganPadi.setText(String.valueOf(blanko0405.getPadi_bjr()));
                genanganTebu.setText(String.valueOf(blanko0405.getPadi_bjr()));
                genanganPalawija.setText(String.valueOf(blanko0405.getWija_bjr()));

                realisasiLainLain.setText(String.valueOf(blanko0405.getRs_lain()));
                usulanLain.setText(usulanLain.getText()+" "+blanko0405.getUs_lain()+" Ha");

                realisasiTebuMuda.setText(String.valueOf(blanko0405.getRs_tebu_muda()));
                realisasiTebuTua.setText(String.valueOf(blanko0405.getRs_tebu_tua()));
                usulanTebuOlahTanah.setText(usulanTebuOlahTanah.getText()+" "+blanko0405.getUs_tebu_olahtanah()+" Ha");
                usulanTebuMuda.setText(usulanTebuMuda.getText()+" "+blanko0405.getUs_tebu_muda()+" Ha");
                usulanTebuTua.setText(usulanTebuTua.getText()+" "+blanko0405.getUs_tebu_tua()+" Ha");

                realisasiPalawija.setText(String.valueOf(blanko0405.getRs_palawija()));
                usulanPalawijaBanyakAir.setText(usulanPalawijaBanyakAir.getText()+" "+blanko0405.getUs_wija_byk_air()+" Ha");
                usulanPalawijaSedikitAir.setText(usulanPalawijaSedikitAir.getText()+" "+blanko0405.getUs_wija_dkt_air()+" Ha");

                usulanLuasSawah.setText(usulanLuasSawah.getText()+" "+blanko0405.getLuas_swiri()+" Ha");
                realisasiLuasSawah.setText(realisasiLuasSawah.getText()+" "+
                                (blanko0405.getRs_padi()+blanko0405.getRs_bero()+blanko0405.getRs_lain()+blanko0405.getRs_palawija()+blanko0405.getRs_tebu_muda()+blanko0405.getRs_tebu_tua())+
                                " Ha"
                        );

            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            blanko0405 = new Blanko0405();
        }

        labelPadi.setText(labelPadi.getText()+" "+urutMT);
        labelPalawija.setText(labelPalawija.getText()+" "+urutMT);

    }

}
