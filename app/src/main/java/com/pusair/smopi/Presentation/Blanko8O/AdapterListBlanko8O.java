package com.pusair.smopi.Presentation.Blanko8O;

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

import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Blanko6O.Blanko6OAddNewFragment;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class AdapterListBlanko8O extends RecyclerView.Adapter<AdapterListBlanko8O.ViewHolder> {

    private List<Blanko08> blanko06List;
    private Context context;
    private int perioda;

    public AdapterListBlanko8O(List<Blanko08> blanko06List, Context context, int perioda) {
        this.blanko06List = blanko06List;
        this.context = context;
        this.perioda = perioda;
    }

    public void setPerioda(int perioda) {
        this.perioda = perioda;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko6o, parent, false);

        return new AdapterListBlanko8O.ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Blanko08 blanko08 = blanko06List.get(position);
        QueryFilters queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", blanko08.getKd_mt());
        try {
            MusimTanam musimTanam = LocalData.get(queryFilters, MusimTanam.class);

            DateFormat formater = new SimpleDateFormat("yyyyMM");
            DateFormat viewFormater = new SimpleDateFormat("MMM yyyy");

            Calendar beginCalendar = Calendar.getInstance();
            beginCalendar.setTime(formater.parse(blanko08.getThbln()));

            holder.tahunName.setText(viewFormater.format(beginCalendar.getTime()).toUpperCase());
            holder.periodName.setText("Perioda "+blanko08.getPoda_air());

            holder.editBtn.setOnClickListener(view -> {
                Bundle bundle = new Bundle();
                bundle.putString("id", blanko08.getId());
                bundle.putString("tahunBulan", blanko08.getThbln());
                bundle.putInt("kodeMT", musimTanam.getKd_mt());
                bundle.putInt("perioda", blanko08.getPoda_air());
                bundle.putInt("action", Constant.ACTION_EDIT);

                Fragment fragment = new Blanko8OEditFragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko8o");
                fragmentTransaction.addToBackStack("blanko8o");

                fragmentTransaction.commit();
            });

            holder.deleteBtn.setOnClickListener(view -> {
                DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                    switch (which) {
                        case DialogInterface.BUTTON_POSITIVE:
                            //Yes button clicked
                            QueryFilters queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("thbln", blanko08.getThbln());
                            LocalData.delete(queryFilters1, Blanko08.class);

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
