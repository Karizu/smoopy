package com.pusair.smopi.Presentation.Blanko4O;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Blanko1O.Blanko1OAddFragment;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterListBlanko4O extends RecyclerView.Adapter<AdapterListBlanko4O.ViewHolder> {

    private List<Blanko0405> blanko0405List;
    private Context context;

    public AdapterListBlanko4O(List<Blanko0405> blanko0405List, Context context) {
        this.blanko0405List = blanko0405List;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterListBlanko4O.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko4o, parent, false);

        return new AdapterListBlanko4O.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListBlanko4O.ViewHolder holder, int position) {

        Blanko0405 blanko0405 = blanko0405List.get(position);
        QueryFilters queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", blanko0405.getKd_mt());
        try {
            MusimTanam musimTanam = LocalData.get(queryFilters, MusimTanam.class);

            DateFormat formater = new SimpleDateFormat("yyyyMM");
            DateFormat viewFormater = new SimpleDateFormat("MMM yyyy");

            Calendar beginCalendar = Calendar.getInstance();
            beginCalendar.setTime(formater.parse(blanko0405.getThbln()));

            holder.musimTanamName.setText(blanko0405.getUrut_mt());
            holder.tahunName.setText(viewFormater.format(beginCalendar.getTime()).toUpperCase());
            holder.periodName.setText("Perioda "+blanko0405.getPoda_air());

            holder.editBtn.setOnClickListener(view -> {
                Bundle bundle = new Bundle();

                bundle.putString("tahunBulan", blanko0405.getThbln());
                bundle.putInt("kodeMT", musimTanam.getKd_mt());
                bundle.putString("urutMT", blanko0405.getUrut_mt());
                bundle.putInt("perioda", blanko0405.getPoda_air());
                bundle.putInt("action", Constant.ACTION_EDIT);

                Fragment fragment = new Blanko4OAddFragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko4o");
                fragmentTransaction.addToBackStack("blanko4o");

                fragmentTransaction.commit();
            });

            holder.deleteBtn.setOnClickListener( view -> {
                DialogInterface.OnClickListener dialogClickListener = (dialog, which) -> {
                    switch (which){
                        case DialogInterface.BUTTON_POSITIVE:
                            //Yes button clicked
                            QueryFilters queryFilters1 = new QueryFilters();
                            queryFilters1.add("kd_mt", musimTanam.getKd_mt());
                            queryFilters1.add("urut_mt", blanko0405.getUrut_mt());
                            queryFilters1.add("thbln", blanko0405.getThbln());
                            queryFilters1.add("poda_air", blanko0405.getPoda_air());
                            LocalData.delete(queryFilters1, Blanko0405.class);

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
        return blanko0405List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView musimTanamName;
        public TextView periodName;
        public TextView tahunName;
        public ImageView editBtn;
        public ImageView deleteBtn;

        public ViewHolder(View v){
            super(v);

            musimTanamName = v.findViewById(R.id.musimTanamName);
            periodName = v.findViewById(R.id.periodName);
            tahunName = v.findViewById(R.id.tahunName);
            editBtn = v.findViewById(R.id.editBtn);
            deleteBtn = v.findViewById(R.id.deleteBtn);

        }
    }
}
