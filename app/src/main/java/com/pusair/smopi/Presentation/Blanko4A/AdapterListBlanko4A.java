package com.pusair.smopi.Presentation.Blanko4A;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko04Bangtrol;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Blanko4O.Blanko4OAddFragment;
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

public class AdapterListBlanko4A extends RecyclerView.Adapter<AdapterListBlanko4A.ViewHolder> {

    private List<Blanko04Bangtrol> blanko0405List;
    private Context context;

    public AdapterListBlanko4A(List<Blanko04Bangtrol> blanko0405List, Context context) {
        this.blanko0405List = blanko0405List;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterListBlanko4A.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blanko4a, parent, false);

        return new AdapterListBlanko4A.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListBlanko4A.ViewHolder holder, int position) {

        Blanko04Bangtrol blanko0405 = blanko0405List.get(position);
        String nmBangtrol = "";
        int index = 0;
        if (blanko0405.getNm_bangtrol().contains("Sm")){
            index = blanko0405.getNm_bangtrol().indexOf("Sm");
            nmBangtrol = blanko0405.getNm_bangtrol().substring(index);
        } else if (blanko0405.getNm_bangtrol().contains("BCIm")){
            index = blanko0405.getNm_bangtrol().indexOf("BCIm");
            nmBangtrol = blanko0405.getNm_bangtrol().substring(index);
        } else if (blanko0405.getNm_bangtrol().contains("B.CS")){
            index = blanko0405.getNm_bangtrol().indexOf("B.CS");
            nmBangtrol = blanko0405.getNm_bangtrol().substring(index);
        } else if (blanko0405.getNm_bangtrol().contains("B.K")){
            index = blanko0405.getNm_bangtrol().indexOf("B.K");
            nmBangtrol = blanko0405.getNm_bangtrol().substring(index);
        }
        holder.nmBangtrol.setText(nmBangtrol);
        holder.petakTersier.setText(String.valueOf(blanko0405.getPetak_tersier()));
    }

    @Override
    public int getItemCount() {
        return blanko0405List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nmBangtrol;
        public TextView petakTersier;

        public ViewHolder(View v){
            super(v);

            nmBangtrol = v.findViewById(R.id.nmBangtrol);
            petakTersier = v.findViewById(R.id.petakTersier);

        }
    }
}
