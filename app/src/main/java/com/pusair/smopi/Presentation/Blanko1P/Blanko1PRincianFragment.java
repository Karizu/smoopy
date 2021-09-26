package com.pusair.smopi.Presentation.Blanko1P;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.JenisKeadaan;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Sort;

public class Blanko1PRincianFragment extends Fragment {

    private Dialog dialog;
    private QueryFilters queryFilters;
    private int id_b01;
    private String jnsKeadaanSelected;
    private String nmKeadaanSelected;
    private String tipeKerusakanSelected;

    @BindView(R.id.list_rincian_blanko_1p)
    RecyclerView recyclerView;
    @BindView(R.id.tv_ruas_hm)
    TextView tvRuasHm;

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.fab_add)
    void onClickFabAddRincian(){
        showDialog();
        MaterialSpinner spinnerjnsKeadaan = dialog.findViewById(R.id.spiner_saluran);
        MaterialSpinner spinnerKerusakan = dialog.findViewById(R.id.spinner_kerusakan);
        FrameLayout btnFrameSimpan = dialog.findViewById(R.id.btn_frame_simpan);
        EditText etDeskripsi = dialog.findViewById(R.id.et_deskripsi);
        EditText etJumlah = dialog.findViewById(R.id.et_jumlah);
        EditText etSatuan = dialog.findViewById(R.id.et_satuan);
        EditText etRuasAwalStart = dialog.findViewById(R.id.et_ruas_awal_start);
        EditText etRuasAwalEnd = dialog.findViewById(R.id.et_ruas_awal_end);
        EditText etRuasAkhirStart = dialog.findViewById(R.id.et_ruas_akhir_start);
        EditText etRuasAkhirEnd = dialog.findViewById(R.id.et_ruas_akhir_end);

        List<String> jnsKeadaanList = new ArrayList<>();
        List<String> nmKeadaanList = new ArrayList<>();

        queryFilters = new QueryFilters();
        List<JenisKeadaan> jenisKeadaanList = new ArrayList<>(LocalData.getList(queryFilters, JenisKeadaan.class));
        for (JenisKeadaan jenisKeadaan:jenisKeadaanList) {
            jnsKeadaanList.add(String.valueOf(jenisKeadaan.getJns_keadaan()));
            nmKeadaanList.add(jenisKeadaan.getNm_keadaan());
        }

        jnsKeadaanSelected = jnsKeadaanList.size()>0?jnsKeadaanList.get(0):"";
        nmKeadaanSelected = nmKeadaanList.size()>0?nmKeadaanList.get(0):"";
        spinnerjnsKeadaan.setItems(nmKeadaanList);
        spinnerjnsKeadaan.setOnItemSelectedListener((view1, position1, ids, item) -> {
            jnsKeadaanSelected = jnsKeadaanList.get(position1);
            nmKeadaanSelected = nmKeadaanList.get(position1);
        });

        String[] tipeKerusakan = {"RR", "RS", "RB", "RT"};
        tipeKerusakanSelected = tipeKerusakan[0];
        spinnerKerusakan.setItems(tipeKerusakan);
        spinnerKerusakan.setOnItemSelectedListener((view1, position1, idr, item) -> tipeKerusakanSelected = item.toString());

        btnFrameSimpan.setOnClickListener(view1 -> {
            dialog.dismiss();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());


            queryFilters = new QueryFilters();
            queryFilters.add("id_b01", id_b01);
            try {
                BlankoP01 blankoP01 = LocalData.get(queryFilters, BlankoP01.class);

                BlankoP01Detail blankoP01Detail = new BlankoP01Detail();
                blankoP01Detail.setId(UUID.randomUUID().toString());
                blankoP01Detail.setId_b01(id_b01);
                blankoP01Detail.setCbya("true");
                blankoP01Detail.setJns_keadaan(jnsKeadaanSelected);
                blankoP01Detail.setNm_keadaan(nmKeadaanSelected);
                blankoP01Detail.setDeskripsi(etDeskripsi.getText().toString());
                blankoP01Detail.setJumlah(Float.parseFloat(etJumlah.getText().toString()));
                blankoP01Detail.setKerusakan(tipeKerusakanSelected);
                blankoP01Detail.setSatuan(etSatuan.getText().toString());
                blankoP01Detail.setRuas_aw(Integer.parseInt(Integer.parseInt(String.format("%02d", Integer.parseInt(etRuasAwalStart.getText().toString())))+String.format("%02d", Integer.parseInt(etRuasAwalEnd.getText().toString()))));
                blankoP01Detail.setRuas_ak(Integer.parseInt(Integer.parseInt(String.format("%02d", Integer.parseInt(etRuasAkhirStart.getText().toString())))+String.format("%02d", Integer.parseInt(etRuasAkhirEnd.getText().toString()))));
                blankoP01Detail.setPk_waktu(currentDateandTime);
                blankoP01Detail.setTgledit_detil(currentDateandTime);
                blankoP01Detail.setTgl_inspeksi(blankoP01.getTgl_inspeksi());
                blankoP01Detail.setTmt_saluran(blankoP01.getTmt_saluran());
                blankoP01Detail.setNm_bangtrol(blankoP01.getNm_bangtrol());
                blankoP01Detail.setTmt_bangtrol(blankoP01.getTmt_bangtrol());
                blankoP01Detail.setKd_staf(blankoP01.getKd_staf());
                blankoP01Detail.setPelaksana(blankoP01.getPelaksana());
                blankoP01Detail.setUsulan_tindakan(blankoP01.getUsulan_tindakan());
                blankoP01Detail.setAreal_layanan(String.valueOf(blankoP01.getAreal_layanan()));
                blankoP01Detail.setDesa_kecamatan(blankoP01.getDesa_kecamatan());
                blankoP01Detail.setKoordl(blankoP01.getKoordl());
                blankoP01Detail.setKoordb(blankoP01.getKoordb());
                blankoP01Detail.setKd_saluran(blankoP01.getKd_saluran());
                blankoP01Detail.setTgledit(currentDateandTime);
                blankoP01Detail.setTglrekam(currentDateandTime);
                blankoP01Detail.setFlag(false);
                LocalData.saveOrUpdate(blankoP01Detail);

                Toast.makeText(getContext(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), HomeActivity.class);
                Objects.requireNonNull(getContext()).startActivity(intent);

            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View view =  inflater.inflate(R.layout.fragment_blanko_1p_rincian, null);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        id_b01 = Objects.requireNonNull(getArguments()).getInt("id");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        populateData();
    }

    private void populateData() {
        queryFilters = new QueryFilters();
        queryFilters.add("id_b01", id_b01);

        List<BlankoP01Detail> blankoP01List = new ArrayList<>(LocalData.getList(queryFilters, BlankoP01Detail.class, "id_b01", Sort.DESCENDING));
        AdapterListRincianBlanko1P adapter = new AdapterListRincianBlanko1P(blankoP01List, getActivity(), Blanko1PRincianFragment.this);
        recyclerView.setAdapter(adapter);
    }

    private void showDialog() {
        dialog = new Dialog(Objects.requireNonNull(getContext()));
        dialog.setContentView(R.layout.dialog_add_rincian_blanko1p);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(Objects.requireNonNull(dialog.getWindow()).getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }
}
