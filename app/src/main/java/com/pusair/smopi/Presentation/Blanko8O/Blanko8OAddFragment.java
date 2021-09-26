package com.pusair.smopi.Presentation.Blanko8O;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.session.Session;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;

public class Blanko8OAddFragment extends Fragment {

    private Context activity;
    private int kodeMT = 0;
    private String tahunBulan = "202001";
    private int perioda = 1;
    private int action = 0;

    private Blanko08 blanko08;
    private QueryFilters queryFilters;
    private Calendar selectedDate;

    @BindView(R.id.label_periode)
    TextView label_periode;

    @BindView(R.id.tvTgl_01) TextView tvTgl_01;
    @BindView(R.id.h_bendung) EditText h_bendung;
    @BindView(R.id.q_bendung) EditText q_bendung;
    @BindView(R.id.q_ka_ambil) EditText q_ka_ambil;
    @BindView(R.id.h_ka_ambil) EditText h_ka_ambil;
    @BindView(R.id.q_ki_ambil) EditText q_ki_ambil;
    @BindView(R.id.h_ki_ambil) EditText h_ki_ambil;
    @BindView(R.id.total_debit_sungai) TextView total_debit_sungai;
    @BindView(R.id.rata_rata_debit_sungai) TextView rata_rata_debit_sungai;

    @BindView(R.id.tvTgl_02) TextView tvTgl_02;
    @BindView(R.id.h_bendung_02) EditText h_bendung_02;
    @BindView(R.id.q_bendung_02) EditText q_bendung_02;
    @BindView(R.id.q_ka_ambil_02) EditText q_ka_ambil_02;
    @BindView(R.id.h_ka_ambil_02) EditText h_ka_ambil_02;
    @BindView(R.id.q_ki_ambil_02) EditText q_ki_ambil_02;
    @BindView(R.id.h_ki_ambil_02) EditText h_ki_ambil_02;
    @BindView(R.id.total_debit_sungai_02) TextView total_debit_sungai_02;
    @BindView(R.id.rata_rata_debit_sungai_02) TextView rata_rata_debit_sungai_02;

    @BindView(R.id.tvTgl_03) TextView tvTgl_03;
    @BindView(R.id.h_bendung_03) EditText h_bendung_03;
    @BindView(R.id.q_bendung_03) EditText q_bendung_03;
    @BindView(R.id.q_ka_ambil_03) EditText q_ka_ambil_03;
    @BindView(R.id.h_ka_ambil_03) EditText h_ka_ambil_03;
    @BindView(R.id.q_ki_ambil_03) EditText q_ki_ambil_03;
    @BindView(R.id.h_ki_ambil_03) EditText h_ki_ambil_03;
    @BindView(R.id.total_debit_sungai_03) TextView total_debit_sungai_03;
    @BindView(R.id.rata_rata_debit_sungai_03) TextView rata_rata_debit_sungai_03;

    @BindView(R.id.tvTgl_04) TextView tvTgl_04;
    @BindView(R.id.h_bendung_04) EditText h_bendung_04;
    @BindView(R.id.q_bendung_04) EditText q_bendung_04;
    @BindView(R.id.q_ka_ambil_04) EditText q_ka_ambil_04;
    @BindView(R.id.h_ka_ambil_04) EditText h_ka_ambil_04;
    @BindView(R.id.q_ki_ambil_04) EditText q_ki_ambil_04;
    @BindView(R.id.h_ki_ambil_04) EditText h_ki_ambil_04;
    @BindView(R.id.total_debit_sungai_04) TextView total_debit_sungai_04;
    @BindView(R.id.rata_rata_debit_sungai_04) TextView rata_rata_debit_sungai_04;

    @BindView(R.id.tvTgl_05) TextView tvTgl_05;
    @BindView(R.id.h_bendung_05) EditText h_bendung_05;
    @BindView(R.id.q_bendung_05) EditText q_bendung_05;
    @BindView(R.id.q_ka_ambil_05) EditText q_ka_ambil_05;
    @BindView(R.id.h_ka_ambil_05) EditText h_ka_ambil_05;
    @BindView(R.id.q_ki_ambil_05) EditText q_ki_ambil_05;
    @BindView(R.id.h_ki_ambil_05) EditText h_ki_ambil_05;
    @BindView(R.id.total_debit_sungai_05) TextView total_debit_sungai_05;
    @BindView(R.id.rata_rata_debit_sungai_05) TextView rata_rata_debit_sungai_05;

    @BindView(R.id.tvTgl_06) TextView tvTgl_06;
    @BindView(R.id.h_bendung_06) EditText h_bendung_06;
    @BindView(R.id.q_bendung_06) EditText q_bendung_06;
    @BindView(R.id.q_ka_ambil_06) EditText q_ka_ambil_06;
    @BindView(R.id.h_ka_ambil_06) EditText h_ka_ambil_06;
    @BindView(R.id.q_ki_ambil_06) EditText q_ki_ambil_06;
    @BindView(R.id.h_ki_ambil_06) EditText h_ki_ambil_06;
    @BindView(R.id.total_debit_sungai_06) TextView total_debit_sungai_06;
    @BindView(R.id.rata_rata_debit_sungai_06) TextView rata_rata_debit_sungai_06;

    @BindView(R.id.tvTgl_07) TextView tvTgl_07;
    @BindView(R.id.h_bendung_07) EditText h_bendung_07;
    @BindView(R.id.q_bendung_07) EditText q_bendung_07;
    @BindView(R.id.q_ka_ambil_07) EditText q_ka_ambil_07;
    @BindView(R.id.h_ka_ambil_07) EditText h_ka_ambil_07;
    @BindView(R.id.q_ki_ambil_07) EditText q_ki_ambil_07;
    @BindView(R.id.h_ki_ambil_07) EditText h_ki_ambil_07;
    @BindView(R.id.total_debit_sungai_07) TextView total_debit_sungai_07;
    @BindView(R.id.rata_rata_debit_sungai_07) TextView rata_rata_debit_sungai_07;

    @BindView(R.id.tvTgl_08) TextView tvTgl_08;
    @BindView(R.id.h_bendung_08) EditText h_bendung_08;
    @BindView(R.id.q_bendung_08) EditText q_bendung_08;
    @BindView(R.id.q_ka_ambil_08) EditText q_ka_ambil_08;
    @BindView(R.id.h_ka_ambil_08) EditText h_ka_ambil_08;
    @BindView(R.id.q_ki_ambil_08) EditText q_ki_ambil_08;
    @BindView(R.id.h_ki_ambil_08) EditText h_ki_ambil_08;
    @BindView(R.id.total_debit_sungai_08) TextView total_debit_sungai_08;
    @BindView(R.id.rata_rata_debit_sungai_08) TextView rata_rata_debit_sungai_08;

    @BindView(R.id.tvTgl_09) TextView tvTgl_09;
    @BindView(R.id.h_bendung_09) EditText h_bendung_09;
    @BindView(R.id.q_bendung_09) EditText q_bendung_09;
    @BindView(R.id.q_ka_ambil_09) EditText q_ka_ambil_09;
    @BindView(R.id.h_ka_ambil_09) EditText h_ka_ambil_09;
    @BindView(R.id.q_ki_ambil_09) EditText q_ki_ambil_09;
    @BindView(R.id.h_ki_ambil_09) EditText h_ki_ambil_09;
    @BindView(R.id.total_debit_sungai_09) TextView total_debit_sungai_09;
    @BindView(R.id.rata_rata_debit_sungai_09) TextView rata_rata_debit_sungai_09;

    @BindView(R.id.tvTgl_10) TextView tvTgl_10;
    @BindView(R.id.h_bendung_10) EditText h_bendung_10;
    @BindView(R.id.q_bendung_10) EditText q_bendung_10;
    @BindView(R.id.q_ka_ambil_10) EditText q_ka_ambil_10;
    @BindView(R.id.h_ka_ambil_10) EditText h_ka_ambil_10;
    @BindView(R.id.q_ki_ambil_10) EditText q_ki_ambil_10;
    @BindView(R.id.h_ki_ambil_10) EditText h_ki_ambil_10;
    @BindView(R.id.total_debit_sungai_10) TextView total_debit_sungai_10;
    @BindView(R.id.rata_rata_debit_sungai_10) TextView rata_rata_debit_sungai_10;

    @BindView(R.id.tvTgl_11) TextView tvTgl_11;
    @BindView(R.id.h_bendung_11) EditText h_bendung_11;
    @BindView(R.id.q_bendung_11) EditText q_bendung_11;
    @BindView(R.id.q_ka_ambil_11) EditText q_ka_ambil_11;
    @BindView(R.id.h_ka_ambil_11) EditText h_ka_ambil_11;
    @BindView(R.id.q_ki_ambil_11) EditText q_ki_ambil_11;
    @BindView(R.id.h_ki_ambil_11) EditText h_ki_ambil_11;
    @BindView(R.id.total_debit_sungai_11) TextView total_debit_sungai_11;
    @BindView(R.id.rata_rata_debit_sungai_11) TextView rata_rata_debit_sungai_11;

    @BindView(R.id.tvTgl_12) TextView tvTgl_12;
    @BindView(R.id.h_bendung_12) EditText h_bendung_12;
    @BindView(R.id.q_bendung_12) EditText q_bendung_12;
    @BindView(R.id.q_ka_ambil_12) EditText q_ka_ambil_12;
    @BindView(R.id.h_ka_ambil_12) EditText h_ka_ambil_12;
    @BindView(R.id.q_ki_ambil_12) EditText q_ki_ambil_12;
    @BindView(R.id.h_ki_ambil_12) EditText h_ki_ambil_12;
    @BindView(R.id.total_debit_sungai_12) TextView total_debit_sungai_12;
    @BindView(R.id.rata_rata_debit_sungai_12) TextView rata_rata_debit_sungai_12;

    @BindView(R.id.tvTgl_13) TextView tvTgl_13;
    @BindView(R.id.h_bendung_13) EditText h_bendung_13;
    @BindView(R.id.q_bendung_13) EditText q_bendung_13;
    @BindView(R.id.q_ka_ambil_13) EditText q_ka_ambil_13;
    @BindView(R.id.h_ka_ambil_13) EditText h_ka_ambil_13;
    @BindView(R.id.q_ki_ambil_13) EditText q_ki_ambil_13;
    @BindView(R.id.h_ki_ambil_13) EditText h_ki_ambil_13;
    @BindView(R.id.total_debit_sungai_13) TextView total_debit_sungai_13;
    @BindView(R.id.rata_rata_debit_sungai_13) TextView rata_rata_debit_sungai_13;

    @BindView(R.id.tvTgl_14) TextView tvTgl_14;
    @BindView(R.id.h_bendung_14) EditText h_bendung_14;
    @BindView(R.id.q_bendung_14) EditText q_bendung_14;
    @BindView(R.id.q_ka_ambil_14) EditText q_ka_ambil_14;
    @BindView(R.id.h_ka_ambil_14) EditText h_ka_ambil_14;
    @BindView(R.id.q_ki_ambil_14) EditText q_ki_ambil_14;
    @BindView(R.id.h_ki_ambil_14) EditText h_ki_ambil_14;
    @BindView(R.id.total_debit_sungai_14) TextView total_debit_sungai_14;
    @BindView(R.id.rata_rata_debit_sungai_14) TextView rata_rata_debit_sungai_14;

    @BindView(R.id.tvTgl_15) TextView tvTgl_15;
    @BindView(R.id.h_bendung_15) EditText h_bendung_15;
    @BindView(R.id.q_bendung_15) EditText q_bendung_15;
    @BindView(R.id.q_ka_ambil_15) EditText q_ka_ambil_15;
    @BindView(R.id.h_ka_ambil_15) EditText h_ka_ambil_15;
    @BindView(R.id.q_ki_ambil_15) EditText q_ki_ambil_15;
    @BindView(R.id.h_ki_ambil_15) EditText h_ki_ambil_15;
    @BindView(R.id.total_debit_sungai_15) TextView total_debit_sungai_15;
    @BindView(R.id.rata_rata_debit_sungai_15) TextView rata_rata_debit_sungai_15;

    @BindView(R.id.layoutTgl31) LinearLayout layoutTgl31;
    @BindView(R.id.tvTgl_31) TextView tvTgl_31;
    @BindView(R.id.h_bendung_31) EditText h_bendung_31;
    @BindView(R.id.q_bendung_31) EditText q_bendung_31;
    @BindView(R.id.q_ka_ambil_31) EditText q_ka_ambil_31;
    @BindView(R.id.h_ka_ambil_31) EditText h_ka_ambil_31;
    @BindView(R.id.q_ki_ambil_31) EditText q_ki_ambil_31;
    @BindView(R.id.h_ki_ambil_31) EditText h_ki_ambil_31;
    @BindView(R.id.total_debit_sungai_31) TextView total_debit_sungai_31;
    @BindView(R.id.rata_rata_debit_sungai_31) TextView rata_rata_debit_sungai_31;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.fragment_add_blanko_8o, null);
        ButterKnife.bind(this, view);

        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setVisibility(View.VISIBLE);
        ((HomeActivity)getActivity()).saveBtn.setOnClickListener(view1 -> {
            proccessData();
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        activity = getActivity();

        action = Objects.requireNonNull(getArguments()).getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");

        setComponent();
    }

    private void proccessData() {
        try {

            final ProgressDialog progressDialog = new ProgressDialog(activity);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Menyimpan Data...");
            progressDialog.show();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            queryFilters = new QueryFilters();
            queryFilters.add("nm_usr", Session.get("Authorization").getValue());
            User currentUser = LocalData.get(queryFilters, User.class);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("1");
            } else {
                blanko08.setTgl("16");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung.getText().toString().equals("")?"0":h_bendung.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung.getText().toString().equals("")?"0":q_bendung.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil.getText().toString().equals("")?"0":h_ki_ambil.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil.getText().toString().equals("")?"0":q_ki_ambil.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil.getText().toString().equals("")?"0":h_ka_ambil.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil.getText().toString().equals("")?"0":q_ka_ambil.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("2");
            } else {
                blanko08.setTgl("17");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_02.getText().toString().equals("")?"0":h_bendung_02.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_02.getText().toString().equals("")?"0":q_bendung_02.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_02.getText().toString().equals("")?"0":h_ki_ambil_02.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_02.getText().toString().equals("")?"0":q_ki_ambil_02.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_02.getText().toString().equals("")?"0":h_ka_ambil_02.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_02.getText().toString().equals("")?"0":q_ka_ambil_02.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("3");
            } else {
                blanko08.setTgl("18");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_03.getText().toString().equals("")?"0":h_bendung_03.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_03.getText().toString().equals("")?"0":q_bendung_03.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_03.getText().toString().equals("")?"0":h_ki_ambil_03.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_03.getText().toString().equals("")?"0":q_ki_ambil_03.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_03.getText().toString().equals("")?"0":h_ka_ambil_03.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_03.getText().toString().equals("")?"0":q_ka_ambil_03.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("4");
            } else {
                blanko08.setTgl("19");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_04.getText().toString().equals("")?"0":h_bendung_04.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_04.getText().toString().equals("")?"0":q_bendung_04.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_04.getText().toString().equals("")?"0":h_ki_ambil_04.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_04.getText().toString().equals("")?"0":q_ki_ambil_04.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_04.getText().toString().equals("")?"0":h_ka_ambil_04.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_04.getText().toString().equals("")?"0":q_ka_ambil_04.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("5");
            } else {
                blanko08.setTgl("20");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_05.getText().toString().equals("")?"0":h_bendung_05.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_05.getText().toString().equals("")?"0":q_bendung_05.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_05.getText().toString().equals("")?"0":h_ki_ambil_05.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_05.getText().toString().equals("")?"0":q_ki_ambil_05.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_05.getText().toString().equals("")?"0":h_ka_ambil_05.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_05.getText().toString().equals("")?"0":q_ka_ambil_05.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("6");
            } else {
                blanko08.setTgl("21");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_06.getText().toString().equals("")?"0":h_bendung_06.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_06.getText().toString().equals("")?"0":q_bendung_06.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_06.getText().toString().equals("")?"0":h_ki_ambil_06.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_06.getText().toString().equals("")?"0":q_ki_ambil_06.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_06.getText().toString().equals("")?"0":h_ka_ambil_06.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_06.getText().toString().equals("")?"0":q_ka_ambil_06.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("7");
            } else {
                blanko08.setTgl("22");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_07.getText().toString().equals("")?"0":h_bendung_07.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_07.getText().toString().equals("")?"0":q_bendung_07.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_07.getText().toString().equals("")?"0":h_ki_ambil_07.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_07.getText().toString().equals("")?"0":q_ki_ambil_07.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_07.getText().toString().equals("")?"0":h_ka_ambil_07.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_07.getText().toString().equals("")?"0":q_ka_ambil_07.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("8");
            } else {
                blanko08.setTgl("23");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_08.getText().toString().equals("")?"0":h_bendung_08.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_08.getText().toString().equals("")?"0":q_bendung_08.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_08.getText().toString().equals("")?"0":h_ki_ambil_08.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_08.getText().toString().equals("")?"0":q_ki_ambil_08.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_08.getText().toString().equals("")?"0":h_ka_ambil_08.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_08.getText().toString().equals("")?"0":q_ka_ambil_08.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("9");
            } else {
                blanko08.setTgl("24");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_09.getText().toString().equals("")?"0":h_bendung_09.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_09.getText().toString().equals("")?"0":q_bendung_09.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_09.getText().toString().equals("")?"0":h_ki_ambil_09.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_09.getText().toString().equals("")?"0":q_ki_ambil_09.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_09.getText().toString().equals("")?"0":h_ka_ambil_09.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_09.getText().toString().equals("")?"0":q_ka_ambil_09.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("10");
            } else {
                blanko08.setTgl("25");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_10.getText().toString().equals("")?"0":h_bendung_10.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_10.getText().toString().equals("")?"0":q_bendung_10.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_10.getText().toString().equals("")?"0":h_ki_ambil_10.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_10.getText().toString().equals("")?"0":q_ki_ambil_10.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_10.getText().toString().equals("")?"0":h_ka_ambil_10.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_10.getText().toString().equals("")?"0":q_ka_ambil_10.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("11");
            } else {
                blanko08.setTgl("26");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_11.getText().toString().equals("")?"0":h_bendung_11.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_11.getText().toString().equals("")?"0":q_bendung_11.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_11.getText().toString().equals("")?"0":h_ki_ambil_11.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_11.getText().toString().equals("")?"0":q_ki_ambil_11.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_11.getText().toString().equals("")?"0":h_ka_ambil_11.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_11.getText().toString().equals("")?"0":q_ka_ambil_11.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("12");
            } else {
                blanko08.setTgl("27");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_12.getText().toString().equals("")?"0":h_bendung_12.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_12.getText().toString().equals("")?"0":q_bendung_12.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_12.getText().toString().equals("")?"0":h_ki_ambil_12.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_12.getText().toString().equals("")?"0":q_ki_ambil_12.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_12.getText().toString().equals("")?"0":h_ka_ambil_12.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_12.getText().toString().equals("")?"0":q_ka_ambil_12.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("13");
            } else {
                blanko08.setTgl("28");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_13.getText().toString().equals("")?"0":h_bendung_13.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_13.getText().toString().equals("")?"0":q_bendung_13.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_13.getText().toString().equals("")?"0":h_ki_ambil_13.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_13.getText().toString().equals("")?"0":q_ki_ambil_13.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_13.getText().toString().equals("")?"0":h_ka_ambil_13.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_13.getText().toString().equals("")?"0":q_ka_ambil_13.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("14");
            } else {
                blanko08.setTgl("29");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_14.getText().toString().equals("")?"0":h_bendung_14.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_14.getText().toString().equals("")?"0":q_bendung_14.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_14.getText().toString().equals("")?"0":h_ki_ambil_14.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_14.getText().toString().equals("")?"0":q_ki_ambil_14.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_14.getText().toString().equals("")?"0":h_ka_ambil_14.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_14.getText().toString().equals("")?"0":q_ka_ambil_14.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            blanko08 = new Blanko08();
            blanko08.setId(UUID.randomUUID().toString());
            blanko08.setKd_staf(currentUser.getKd_staf());
            blanko08.setKd_mt(kodeMT);
            blanko08.setThbln(tahunBulan);
            blanko08.setPoda_air(perioda);
            if (perioda == 1){
                blanko08.setTgl("15");
            } else {
                blanko08.setTgl("30");
            }
            blanko08.setH_bendung(Float.parseFloat(h_bendung_15.getText().toString().equals("")?"0":h_bendung_15.getText().toString()));
            blanko08.setQ_bendung(Float.parseFloat(q_bendung_15.getText().toString().equals("")?"0":q_bendung_15.getText().toString()));
            blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_15.getText().toString().equals("")?"0":h_ki_ambil_15.getText().toString()));
            blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_15.getText().toString().equals("")?"0":q_ki_ambil_15.getText().toString()));
            blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_15.getText().toString().equals("")?"0":h_ka_ambil_15.getText().toString()));
            blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_15.getText().toString().equals("")?"0":q_ka_ambil_15.getText().toString()));
            blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
            blanko08.setTgledit(currentDateandTime);
            blanko08.setFlag(false);
            LocalData.saveOrUpdate(blanko08);

            if (perioda == 2){
                blanko08 = new Blanko08();
                blanko08.setId(UUID.randomUUID().toString());
                blanko08.setKd_staf(currentUser.getKd_staf());
                blanko08.setKd_mt(kodeMT);
                blanko08.setThbln(tahunBulan);
                blanko08.setPoda_air(perioda);
                blanko08.setTgl("31");
                blanko08.setH_bendung(Float.parseFloat(h_bendung_31.getText().toString().equals("")?"0":h_bendung_31.getText().toString()));
                blanko08.setQ_bendung(Float.parseFloat(q_bendung_31.getText().toString().equals("")?"0":q_bendung_31.getText().toString()));
                blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil_31.getText().toString().equals("")?"0":h_ki_ambil_31.getText().toString()));
                blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil_31.getText().toString().equals("")?"0":q_ki_ambil_31.getText().toString()));
                blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil_31.getText().toString().equals("")?"0":h_ka_ambil_31.getText().toString()));
                blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil_31.getText().toString().equals("")?"0":q_ka_ambil_31.getText().toString()));
                blanko08.setQsungai(blanko08.getQ_bendung()+ blanko08.getQ_ki_ambil()+ blanko08.getQ_ka_ambil());
                blanko08.setTgledit(currentDateandTime);
                blanko08.setFlag(false);
                LocalData.saveOrUpdate(blanko08);
            }

            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("thbln", tahunBulan);
            queryFilters.add("poda_air", perioda);

            List<Blanko08> blanko08List = LocalData.getList(queryFilters, Blanko08.class, "tgl", Sort.DESCENDING);
            if (blanko08List.size()>0){
                float qSungai = 0;
                float qSungaiRata = 0;
                for (Blanko08 blanko08: blanko08List){
                    qSungai+=blanko08.getQsungai();
                }

                if (perioda == 1){
                    qSungaiRata = qSungai/15;
                } else {
                    qSungaiRata = qSungai/16;
                }
                for (Blanko08 blanko08: blanko08List){
                    blanko08.setQsungai_rata(qSungaiRata);
                    blanko08.setTgledit(currentDateandTime);
                    blanko08.setFlag(false);
                    LocalData.saveOrUpdate(blanko08);
                }
            }

            Toast.makeText(activity, "Berhasil simpan data", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(activity, HomeActivity.class);
            startActivity(intent);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressLint("SetTextI18n")
    private void setComponent() {

        label_periode.setText(tahunBulan + ", Perioda Ke-"+perioda);
        if (perioda == 2){
            layoutTgl31.setVisibility(View.VISIBLE);
            tvTgl_01.setText("Tanggal 16");
            tvTgl_02.setText("Tanggal 17");
            tvTgl_03.setText("Tanggal 18");
            tvTgl_04.setText("Tanggal 19");
            tvTgl_05.setText("Tanggal 20");
            tvTgl_06.setText("Tanggal 21");
            tvTgl_07.setText("Tanggal 22");
            tvTgl_08.setText("Tanggal 23");
            tvTgl_09.setText("Tanggal 24");
            tvTgl_10.setText("Tanggal 25");
            tvTgl_11.setText("Tanggal 26");
            tvTgl_12.setText("Tanggal 27");
            tvTgl_13.setText("Tanggal 28");
            tvTgl_14.setText("Tanggal 29");
            tvTgl_15.setText("Tanggal 30");
        }
    }
}
