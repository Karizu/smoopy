package com.pusair.smopi.Presentation.Blanko8O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;
import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;

public class Blanko8OEditFragment extends Fragment {

    private Context activity;
    private int kodeMT = 0;
    private String tahunBulan = "202001";
    private int perioda = 1;
    private int action = 0;

    private Blanko08 blanko08;
    private List<Blanko08> blanko08List;
    private QueryFilters queryFilters;
    private Calendar selectedDate;
    private String selectedDateFromTab = "1";

    @BindView(R.id.ed_debit)
    EditText h_bendung;
    @BindView(R.id.ed_h)
    EditText q_bendung;
    @BindView(R.id.q_pintu_masuk_kanan)
    EditText q_ka_ambil;
    @BindView(R.id.h_pintu_masuk_kanan)
    EditText h_ka_ambil;
    @BindView(R.id.q_pintu_masuk_kiri)
    EditText q_ki_ambil;
    @BindView(R.id.h_pintu_masuk_kiri)
    EditText h_ki_ambil;
    @BindView(R.id.total_debit_sungai)
    TextView qsungai;
    @BindView(R.id.rata_rata_debit_sungai)
    TextView qsungai_rata;
    @BindView(R.id.label_periode)
    TextView label_periode;

    @BindView(R.id.tabs)
    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_blanko_8o, null);
        ButterKnife.bind(this, view);

        ((HomeActivity) getActivity()).saveBtn.setVisibility(View.VISIBLE);

        ((HomeActivity) getActivity()).saveBtn.setOnClickListener(view1 -> {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("thbln", tahunBulan);
            queryFilters.add("poda_air", perioda);

            try {
                blanko08.setH_bendung(Float.parseFloat(h_bendung.getText().toString().equals("") ? "0" : h_bendung.getText().toString()));
                blanko08.setQ_bendung(Float.parseFloat(q_bendung.getText().toString().equals("") ? "0" : q_bendung.getText().toString()));
                blanko08.setH_ki_ambil(Float.parseFloat(h_ki_ambil.getText().toString().equals("") ? "0" : h_ki_ambil.getText().toString()));
                blanko08.setQ_ki_ambil(Float.parseFloat(q_ki_ambil.getText().toString().equals("") ? "0" : q_ki_ambil.getText().toString()));
                blanko08.setH_ka_ambil(Float.parseFloat(h_ka_ambil.getText().toString().equals("") ? "0" : h_ka_ambil.getText().toString()));
                blanko08.setQ_ka_ambil(Float.parseFloat(q_ka_ambil.getText().toString().equals("") ? "0" : q_ka_ambil.getText().toString()));
                blanko08.setQsungai(blanko08.getQ_bendung() + blanko08.getQ_ki_ambil() + blanko08.getQ_ka_ambil());
                blanko08.setTgledit(currentDateandTime);
                blanko08.setFlag(false);
                LocalData.saveOrUpdate(blanko08);

                blanko08List = LocalData.getList(queryFilters, Blanko08.class, "tgl", Sort.DESCENDING);
                if (blanko08List.size() > 0) {
                    float qSungai = 0;
                    float qSungaiRata = 0;
                    for (Blanko08 blanko08 : blanko08List) {
                        qSungai += blanko08.getQsungai();
                    }

                    if (perioda == 1) {
                        qSungaiRata = qSungai / 15;
                    } else {
                        qSungaiRata = qSungai / 16;
                    }
                    for (Blanko08 blanko08 : blanko08List) {
                        blanko08.setQsungai_rata(qSungaiRata);
                        blanko08.setTgledit(currentDateandTime);
                        blanko08.setFlag(false);
                        LocalData.saveOrUpdate(blanko08);
                    }
                }

                Toast.makeText(activity, "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, HomeActivity.class);
                startActivity(intent);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        blanko08List = new ArrayList<>();


        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        activity = getActivity();

        action = getArguments().getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");

        label_periode.setText(tahunBulan + ", Perioda Ke-" + perioda);

        setDateLayout();
        populateData(action, kodeMT, tahunBulan, perioda, perioda == 1 ? 1 : 16);

    }

    private void populateData(int action, int kodeMT, String tahunBulan, int perioda, int date) {
        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("poda_air", perioda);
        queryFilters.add("tgl", String.valueOf(date));

        try {
            blanko08 = LocalData.get(queryFilters, Blanko08.class);
            // TO:DO parsing value dari DB ke tampilan
            h_bendung.setText(String.valueOf(blanko08.getH_bendung()));
            q_bendung.setText(String.valueOf(blanko08.getQ_bendung()));
            q_ka_ambil.setText(String.valueOf(blanko08.getQ_ka_ambil()));
            h_ka_ambil.setText(String.valueOf(blanko08.getH_ka_ambil()));
            q_ki_ambil.setText(String.valueOf(blanko08.getQ_ki_ambil()));
            h_ki_ambil.setText(String.valueOf(blanko08.getH_ki_ambil()));
            qsungai.setText(String.valueOf(blanko08.getQsungai()));
            qsungai_rata.setText(String.valueOf(blanko08.getQsungai_rata()));
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void setDateLayout() {
        if (perioda == 1) {
            for (int i = 0; i < 15; i++) {
                tabLayout.addTab(tabLayout.newTab().setText(String.valueOf(i + 1)));
            }
        } else {
            for (int i = 15; i < 31; i++) {
                tabLayout.addTab(tabLayout.newTab().setText(String.valueOf(i + 1)));
            }
        }

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (perioda == 1) {
                    selectedDateFromTab = String.valueOf(tab.getPosition() + 1);
                    populateData(action, kodeMT, tahunBulan, perioda, tab.getPosition() + 1);
                } else {
                    int position = tab.getPosition() + 1;
                    selectedDateFromTab = String.valueOf(position + 15);
                    populateData(action, kodeMT, tahunBulan, perioda, position + 15);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
