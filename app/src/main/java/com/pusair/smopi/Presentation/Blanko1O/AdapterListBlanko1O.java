package com.pusair.smopi.Presentation.Blanko1O;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterListBlanko1O extends RecyclerView.Adapter<AdapterListBlanko1O.ViewHolder> {

    private List<Blanko0123> blanko0123List;
    private Context context;

    public AdapterListBlanko1O(List<Blanko0123> blanko0123List, Context context) {
        this.blanko0123List = blanko0123List;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterListBlanko1O.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko1o, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListBlanko1O.ViewHolder holder, int position) {

        Blanko0123 blanko0123 = blanko0123List.get(position);
        QueryFilters queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", blanko0123.getKd_mt());
        try {
            MusimTanam musimTanam = LocalData.get(queryFilters, MusimTanam.class);
            holder.ip3Name.setText(blanko0123.getKd_org());
            holder.tahunName.setText(musimTanam.getThn_mt());

            holder.editBtn.setOnClickListener(view -> {
                Bundle bundle = new Bundle();

                bundle.putString("kodeOrg", blanko0123.getKd_org());
                bundle.putInt("kodeMT", musimTanam.getKd_mt());
                bundle.putInt("action", Constant.ACTION_EDIT);

                Fragment fragment = new Blanko1OAddFragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko1o");
                fragmentTransaction.addToBackStack("blanko1o");

                fragmentTransaction.commit();
            });

            holder.deleteBtn.setOnClickListener( view -> {
                DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                    switch (which){
                        case DialogInterface.BUTTON_POSITIVE:
                            //Yes button clicked
                            QueryFilters queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("kd_org", blanko0123.getKd_org());
                            queryFilters1.add("urut_mt", "MT1");
                            queryFilters1.add("jenis_uk", "u");
                            LocalData.delete(queryFilters1, Blanko0123.class);

                            queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("kd_org", blanko0123.getKd_org());
                            queryFilters1.add("urut_mt", "MT2");
                            queryFilters1.add("jenis_uk", "u");
                            LocalData.delete(queryFilters1, Blanko0123.class);

                            queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("kd_org", blanko0123.getKd_org());
                            queryFilters1.add("urut_mt", "MT3");
                            queryFilters1.add("jenis_uk", "u");
                            LocalData.delete(queryFilters1, Blanko0123.class);
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

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return blanko0123List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ip3Name;
        public TextView tahunName;
        public ImageView editBtn;
        public ImageView deleteBtn;

        public ViewHolder(View v){
            super(v);

            ip3Name = v.findViewById(R.id.desaKecamatan);
            tahunName = v.findViewById(R.id.tahunName);
            editBtn = v.findViewById(R.id.editBtn);
            deleteBtn = v.findViewById(R.id.deleteBtn);

        }
    }
}
