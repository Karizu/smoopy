package com.pusair.smopi.Presentation.Blanko1P;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.util.List;

public class AdapterListBlanko1P extends RecyclerView.Adapter<AdapterListBlanko1P.ViewHolder> {

    private List<BlankoP01> blankoP01List;
    private Context context;
    private String dIrigasi;
    private String kdIrigasiSelected;

    public AdapterListBlanko1P(List<BlankoP01> blankoP01List, Context context, String dIrigasi, String kdIrigasiSelected) {
        this.blankoP01List = blankoP01List;
        this.context = context;
        this.dIrigasi = dIrigasi;
        this.kdIrigasiSelected = kdIrigasiSelected;
    }

    @NonNull
    @Override
    public AdapterListBlanko1P.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko1p, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListBlanko1P.ViewHolder holder, int position) {
        BlankoP01 blankoP01 = blankoP01List.get(position);
        int id = blankoP01.getId_b01();
        String kdSaluran = blankoP01.getKd_saluran();
        String tmtBangtrol = blankoP01.getTmt_bangtrol()!=null?blankoP01.getTmt_bangtrol():"null";
        String tglInspeksi = blankoP01.getTgl_inspeksi();
        String sPelaksana = blankoP01.getPelaksana();
        String uTindakan = blankoP01.getUsulan_tindakan();
        String aPelayanan = String.valueOf(blankoP01.getAreal_layanan());
        String latitude = String.valueOf(blankoP01.getKoordl());
        String longitude = String.valueOf(blankoP01.getKoordb());
        String sKecamatan = String.valueOf(blankoP01.getDesa_kecamatan());
        boolean kerusakanIsSaluran = false;

        if (tmtBangtrol.equals("null")){
            kerusakanIsSaluran = true;
        }

        holder.ip3aName.setText(blankoP01.getDesa_kecamatan());
        holder.date_blanko1p.setText(blankoP01.getTgl_inspeksi());
        holder.hm_blanko1p.setText(blankoP01.getNm_bangtrol());

        boolean finalKerusakanIsSaluran = kerusakanIsSaluran;
        holder.editBtn.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putInt("id", id);
            bundle.putBoolean("kerusakanIsSaluran", finalKerusakanIsSaluran);
            bundle.putString("daerahIrigasiSelected", dIrigasi);
            bundle.putString("kdIrigasiSelected", kdIrigasiSelected);
            bundle.putInt("action", Constant.ACTION_EDIT);

            Fragment fragment = new Blanko1PAddFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.screen_area, fragment);
            fragmentTransaction.addToBackStack("back_stack");

            fragmentTransaction.commit();
        });

        holder.deleteBtn.setOnClickListener(view -> {
            DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        QueryFilters queryFilters1 = new QueryFilters();
                        queryFilters1.add("id_b01", id);
                        LocalData.delete(queryFilters1, BlankoP01.class);

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

        holder.layoutItemBlanko1p.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putInt("id", id);

            Fragment fragment = new Blanko1PRincianFragment();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.screen_area, fragment);
            fragmentTransaction.addToBackStack("back_stack");

            fragmentTransaction.commit();
        });
    }

    @Override
    public int getItemCount() {
        return blankoP01List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView date_blanko1p;
        public TextView ip3aName;
        public TextView hm_blanko1p;
        public ImageView editBtn;
        public ImageView deleteBtn;
        public LinearLayout layoutItemBlanko1p;

        public ViewHolder(View v) {
            super(v);

            ip3aName = v.findViewById(R.id.desaKecamatan);
            date_blanko1p = v.findViewById(R.id.tglInspeksi);
            hm_blanko1p = v.findViewById(R.id.hmBlanko1p);
            editBtn = v.findViewById(R.id.editBtn);
            deleteBtn = v.findViewById(R.id.deleteBtn);
            layoutItemBlanko1p = v.findViewById(R.id.layoutItemBlanko1p);

        }
    }
}
