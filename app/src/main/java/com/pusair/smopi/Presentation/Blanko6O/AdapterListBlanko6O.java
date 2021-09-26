package com.pusair.smopi.Presentation.Blanko6O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Blanko4O.AdapterListBlanko4O;
import com.pusair.smopi.Presentation.Blanko4O.Blanko4OAddFragment;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class AdapterListBlanko6O extends RecyclerView.Adapter<AdapterListBlanko6O.ViewHolder> {

    private List<Blanko06> blanko06List;
    private Context context;
    private int perioda;
    private String kdIrigasiSelected;

    public AdapterListBlanko6O(List<Blanko06> blanko06List, Context context, int perioda, String kdIrigasiSelected) {
        this.blanko06List = blanko06List;
        this.context = context;
        this.perioda = perioda;
        this.kdIrigasiSelected = kdIrigasiSelected;
    }

    public void setPerioda(int perioda) {
        this.perioda = perioda;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko6o, parent, false);

        return new AdapterListBlanko6O.ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Blanko06 blanko06 = blanko06List.get(position);
        QueryFilters queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", blanko06.getKd_mt());
        try {
            MusimTanam musimTanam = LocalData.get(queryFilters, MusimTanam.class);

            DateFormat formater = new SimpleDateFormat("yyyyMM");
            DateFormat viewFormater = new SimpleDateFormat("MMM yyyy");

            Calendar beginCalendar = Calendar.getInstance();
            beginCalendar.setTime(formater.parse(blanko06.getThbln()));

            holder.tahunName.setText(viewFormater.format(beginCalendar.getTime()).toUpperCase());

            if (perioda == 1) {
                if (blanko06.getCara_ukur1()!=null){
                    holder.periodName.setText("Perioda 1");
                }
            } else {
                if (blanko06.getCara_ukur2()!=null){
                    holder.periodName.setText("Perioda 2");
                }
            }

            holder.editBtn.setOnClickListener(view -> {
                Bundle bundle = new Bundle();
                bundle.putString("id", blanko06.getId());
                bundle.putString("tahunBulan", blanko06.getThbln());
                bundle.putInt("kodeMT", musimTanam.getKd_mt());
                bundle.putInt("perioda", perioda);
                bundle.putInt("action", 2);
                bundle.putString("kd_di", kdIrigasiSelected);

                Fragment fragment = new Blanko6OAddNewFragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko6o");
                fragmentTransaction.addToBackStack("blanko6o");

                fragmentTransaction.commit();
            });

            holder.deleteBtn.setOnClickListener(view -> {
                DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                    switch (which) {
                        case DialogInterface.BUTTON_POSITIVE:
                            //Yes button clicked
                            QueryFilters queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("thbln", blanko06.getThbln());
                            LocalData.delete(queryFilters1, Blanko06.class);

                            Intent intent = new Intent(context, HomeActivity.class);
                            context.startActivity(intent);
                            Toast.makeText(context, "Data berhasil dihapus", Toast.LENGTH_SHORT).show();
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

        } catch (LocalDataNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return blanko06List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView periodName;
        public TextView tahunName;
        public ImageView editBtn;
        public ImageView deleteBtn;

        public ViewHolder(View v) {
            super(v);

            periodName = v.findViewById(R.id.periodName);
            tahunName = v.findViewById(R.id.tahunName);
            editBtn = v.findViewById(R.id.editBtn);
            deleteBtn = v.findViewById(R.id.deleteBtn);

        }
    }
}
