package com.pusair.smopi.Presentation.Blanko1P;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.JenisKeadaan;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class AdapterListRincianBlanko1P extends RecyclerView.Adapter<AdapterListRincianBlanko1P.ViewHolder> {

    private List<BlankoP01Detail> blankoP01List;
    private Context context;
    private Fragment fragment;
    private Dialog dialog;
    private String jnsKeadaanSelected, nmKeadaanSelected;
    private String tipeKerusakanSelected;
    private QueryFilters queryFilters;

    public AdapterListRincianBlanko1P(List<BlankoP01Detail> blankoP01List, Context context, Fragment fragment) {
        this.blankoP01List = blankoP01List;
        this.context = context;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public AdapterListRincianBlanko1P.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rincian_blanko1p, parent, false);

        return new ViewHolder(v);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public void onBindViewHolder(@NonNull AdapterListRincianBlanko1P.ViewHolder holder, int position) {
        BlankoP01Detail blankoP01 = blankoP01List.get(position);
        String id = blankoP01.getId();
        int id_b01 = blankoP01.getId_b01();
        String nmKeadaan = blankoP01.getNm_keadaan();
        String jumlah = String.valueOf(blankoP01.getJumlah());
        String ruasAwal = String.valueOf(blankoP01.getRuas_aw());
        String ruasAkhir = String.valueOf(blankoP01.getRuas_ak());
        String kerusakan = blankoP01.getKerusakan();
        String jnsKeadaan = blankoP01.getJns_keadaan();

        nmKeadaanSelected = nmKeadaan;
        jnsKeadaanSelected = jnsKeadaan;
        tipeKerusakanSelected = kerusakan;

        holder.tv_1.setText(nmKeadaan);
        holder.tv_2.setText(jumlah);
        holder.tv_3.setText(ruasAwal + " s.d " +ruasAkhir);
        holder.tv_4.setText(kerusakan);

        holder.editBtn.setOnClickListener(view -> {
            showDialog();
            TextView title = dialog.findViewById(R.id.blanko_1p_rincian_title);
            title.setText("Edit Rincian");
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

            etDeskripsi.setText(blankoP01.getDeskripsi());
            etJumlah.setText(String.valueOf(Math.round(blankoP01.getJumlah())));
            etSatuan.setText(blankoP01.getSatuan());
            etRuasAwalStart.setText(String.format("%04d", blankoP01.getRuas_aw()).substring(0,2));
            etRuasAwalEnd.setText(String.format("%04d", blankoP01.getRuas_aw()).substring(2));
            etRuasAkhirStart.setText(String.format("%04d", blankoP01.getRuas_ak()).substring(0,2));
            etRuasAkhirEnd.setText(String.format("%04d", blankoP01.getRuas_ak()).substring(2));

            List<String> jnsKeadaanList = new ArrayList<>();
            List<String> nmKeadaanList = new ArrayList<>();
            List<JenisKeadaan> jenisKeadaanList = new ArrayList<>();

            queryFilters = new QueryFilters();
            jenisKeadaanList.addAll(LocalData.getList(queryFilters, JenisKeadaan.class));
            for (JenisKeadaan jenisKeadaan:jenisKeadaanList) {
                jnsKeadaanList.add(String.valueOf(jenisKeadaan.getJns_keadaan()));
                nmKeadaanList.add(jenisKeadaan.getNm_keadaan());
            }
            spinnerjnsKeadaan.setItems(nmKeadaanList);
            spinnerjnsKeadaan.setOnItemSelectedListener((view1, position1, ids, item) -> {
                jnsKeadaanSelected = jnsKeadaanList.get(position);
                nmKeadaanSelected = nmKeadaanList.get(position);
            });

            setSpinText(spinnerjnsKeadaan, nmKeadaan);

            String[] tipeKerusakan = {"RR", "RS", "RB", "RT"};
            spinnerKerusakan.setItems(tipeKerusakan);
            spinnerKerusakan.setOnItemSelectedListener((view1, position1, idr, item) -> tipeKerusakanSelected = item.toString());

            setSpinText(spinnerKerusakan, kerusakan);

            btnFrameSimpan.setOnClickListener(view1 -> {
                dialog.dismiss();
                queryFilters = new QueryFilters();
                queryFilters.add("id", id);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                String currentDateandTime = sdf.format(new Date());

                try {
                    BlankoP01Detail blankoP01Detail = LocalData.get(queryFilters, BlankoP01Detail.class);
                    blankoP01Detail.setCbya("true");
                    blankoP01Detail.setId_b01(id_b01);
                    blankoP01Detail.setJns_keadaan(jnsKeadaanSelected);
                    blankoP01Detail.setNm_keadaan(nmKeadaanSelected);
                    blankoP01Detail.setDeskripsi(etDeskripsi.getText().toString());
                    blankoP01Detail.setJumlah(Float.parseFloat(etJumlah.getText().toString()));
                    blankoP01Detail.setKerusakan(tipeKerusakanSelected);
                    blankoP01Detail.setSatuan(etSatuan.getText().toString());
                    blankoP01Detail.setRuas_aw(Integer.parseInt(etRuasAwalStart.getText().toString()+etRuasAwalEnd.getText().toString()));
                    blankoP01Detail.setRuas_ak(Integer.parseInt(etRuasAkhirStart.getText().toString()+etRuasAkhirEnd.getText().toString()));
                    blankoP01Detail.setTgledit_detil(currentDateandTime);
                    blankoP01Detail.setFlag(false);
                    LocalData.saveOrUpdate(blankoP01Detail);

                    Toast.makeText(context, "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HomeActivity.class);
                    context.startActivity(intent);

                } catch (LocalDataNotFoundException e) {
                    e.printStackTrace();
                }
            });
        });

        holder.deleteBtn.setOnClickListener( view -> {
            DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        QueryFilters queryFilters1 = new QueryFilters();
                        queryFilters1.add("id_b01", id_b01);
                        LocalData.delete(queryFilters1, BlankoP01Detail.class);
                        Toast.makeText(context, "Berhasil hapus data", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, HomeActivity.class);
                        context.startActivity(intent);
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            };

            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage("Apakah anda yakin akan menghapus data?").setPositiveButton("Ya", dialogClickListener)
                    .setNegativeButton("Tidak", dialogClickListener).show();
        });

    }

    @Override
    public int getItemCount() {
        return blankoP01List.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_1;
        public TextView tv_2;
        public TextView tv_3;
        public TextView tv_4;
        public ImageView editBtn;
        public ImageView deleteBtn;

        public ViewHolder(View v){
            super(v);

            tv_1 = v.findViewById(R.id.tv_1);
            tv_2 = v.findViewById(R.id.tv_2);
            tv_3 = v.findViewById(R.id.tv_3);
            tv_4 = v.findViewById(R.id.tv_4);
            editBtn = v.findViewById(R.id.editBtn);
            deleteBtn = v.findViewById(R.id.deleteBtn);

        }
    }

    private void showDialog() {
        dialog = new Dialog(Objects.requireNonNull(context));
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

    private void setSpinText(MaterialSpinner spin, String text) {
        for (int i = 0; i < spin.getItems().size(); i++) {
            if (spin.getItems().get(i).toString().contains(text)) {
                spin.setSelectedIndex(i);
            }
        }
    }
}
