package com.pusair.smopi.Presentation.Blanko8O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.RentangMusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Sort;

public class Blanko8OFragment extends Fragment {

    @BindView(R.id.spinner_musim)
    MaterialSpinner spinnerMusim;

    @BindView(R.id.spinner_bulan)
    MaterialSpinner spinnerBulan;

    @BindView(R.id.spinner_perioda)
    MaterialSpinner spinnerPerioda;

    @BindView(R.id.notFoundText)
    TextView notFoundText;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.titleList)
    TextView titleList;

    @BindView(R.id.fab_add)
    FloatingActionButton fab_add;

    private AdapterListBlanko8O adapter;

    private Context activity;

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private QueryFilters queryFilters;
    private List<String> musimTanamSpinner;
    private List<String> tahunBulanList;
    private List<MusimTanam> musimTanamList;
    private List<Blanko08> blanko08List;
    private RentangMusimTanam rentangMusimTanam;

    private int kodeMT = 0;
    private String tahunBulan = "202001";
    private int perioda = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blanko_6o, null);
        ButterKnife.bind(this, view);

        queryFilters = new QueryFilters();
        musimTanamSpinner = new ArrayList<>();
        tahunBulanList = new ArrayList<>();

        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setVisibility(View.INVISIBLE);

//        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);
//
//        if (musimTanamList.size() > 0) {
//            for (int i = 0; i < musimTanamList.size(); i++) {
//                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
//            }
//        }

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        activity = getActivity();
        layoutManager = new LinearLayoutManager(activity,
                RecyclerView.VERTICAL,
                false);

        title.setText("Blanko 08-A");
        titleList.setText("Daftar Blanko 08-A");

        recyclerView = Objects.requireNonNull(getView()).findViewById(R.id.list_blanko_6o);
        recyclerView.setLayoutManager(layoutManager);

        queryFilters = new QueryFilters();
        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);

        if (musimTanamList.size() > 0) {
            for (int i = 0; i < musimTanamList.size(); i++) {
                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
            }
        }

        spinnerMusim.setItems(musimTanamSpinner);

        queryFilters = new QueryFilters();
//        queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        queryFilters.add("kd_mt", 10);
        tahunBulanList = new ArrayList<>();

        try {
            rentangMusimTanam = LocalData.get(queryFilters, RentangMusimTanam.class);

            String date1 = rentangMusimTanam.getBlnaw() + "-" + rentangMusimTanam.getThnaw();
            String date2 = (rentangMusimTanam.getBlnak() + 1) + "-" + rentangMusimTanam.getThnak();

            @SuppressLint("SimpleDateFormat") DateFormat formater = new SimpleDateFormat("MMM yyyy");
            @SuppressLint("SimpleDateFormat") DateFormat formaterSource = new SimpleDateFormat("MM-yyyy");

            Calendar beginCalendar = Calendar.getInstance();
            Calendar finishCalendar = Calendar.getInstance();

            try {
                beginCalendar.setTime(Objects.requireNonNull(formaterSource.parse(date1)));
                finishCalendar.setTime(Objects.requireNonNull(formaterSource.parse(date2)));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            while (beginCalendar.before(finishCalendar)) {
                // add one month to date per loop
                String date = formater.format(beginCalendar.getTime()).toUpperCase();
                tahunBulanList.add(date);
                beginCalendar.add(Calendar.MONTH, 1);
            }

            spinnerBulan.setItems(tahunBulanList);
            spinnerPerioda.setItems("Perioda 1", "Perioda 2");
            tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();
            kodeMT = musimTanamList.get(0).getKd_mt();

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
            spinnerBulan.setItems("-- Pilih Bulan --");
            spinnerPerioda.setItems("-- Pilih Perioda --");
        }

        spinnerMusim.setOnItemSelectedListener((view13, position, id, item) -> {
            kodeMT = musimTanamList.get(position).getKd_mt();
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            tahunBulanList = new ArrayList<>();

            try {
                rentangMusimTanam = LocalData.get(queryFilters, RentangMusimTanam.class);

                String date1 = rentangMusimTanam.getBlnaw() + "-" + rentangMusimTanam.getThnaw();
                String date2 = (rentangMusimTanam.getBlnak() + 1) + "-" + rentangMusimTanam.getThnak();

                @SuppressLint("SimpleDateFormat") DateFormat formater = new SimpleDateFormat("MMM yyyy");
                @SuppressLint("SimpleDateFormat") DateFormat formaterSource = new SimpleDateFormat("MM-yyyy");

                Calendar beginCalendar = Calendar.getInstance();
                Calendar finishCalendar = Calendar.getInstance();

                try {
                    beginCalendar.setTime(Objects.requireNonNull(formaterSource.parse(date1)));
                    finishCalendar.setTime(Objects.requireNonNull(formaterSource.parse(date2)));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                while (beginCalendar.before(finishCalendar)) {
                    // add one month to date per loop
                    String date = formater.format(beginCalendar.getTime()).toUpperCase();
                    tahunBulanList.add(date);
                    beginCalendar.add(Calendar.MONTH, 1);
                }

                spinnerBulan.setItems(tahunBulanList);
                spinnerPerioda.setItems("Perioda 1", "Perioda 2");
                tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();

                populateData(false, kodeMT, tahunBulan, perioda);
            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
                spinnerBulan.setItems("-- Pilih Bulan --");
            }
        });

        spinnerBulan.setOnItemSelectedListener((view12, position, id, item) -> {
            try {
                @SuppressLint("SimpleDateFormat") DateFormat sourceFormater = new SimpleDateFormat("MMM yyyy");
                @SuppressLint("SimpleDateFormat") DateFormat formater = new SimpleDateFormat("yyyyMM");

                Date sourceDate = sourceFormater.parse(tahunBulanList.get(position));

                tahunBulan = formater.format(sourceDate);
                Log.d("tahun Bulan", kodeMT + " - " + tahunBulan + " - " + perioda);

                populateData(false, kodeMT, tahunBulan, perioda);

            } catch (ParseException e) {
                e.printStackTrace();
            }
        });

        spinnerPerioda.setOnItemSelectedListener((view1, position, id, item) -> {
            String periodString = view1.getItems().get(position).toString();
            perioda = Integer.parseInt(periodString.substring(periodString.length() - 1));
            populateData(false, kodeMT, tahunBulan, perioda);
        });

        populateData(true, musimTanamList.get(0).getKd_mt(), rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw(), perioda);
    }

    @OnClick(R.id.fab_add)
    public void addBlanko8o() {
        Bundle bundle = new Bundle();

        bundle.putInt("action", Constant.ACTION_ADD);
        bundle.putString("tahunBulan", tahunBulan);
        bundle.putInt("perioda", perioda);
        bundle.putInt("kodeMT", kodeMT);

        Fragment fragment = new Blanko8OAddFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko8o");
        fragmentTransaction.addToBackStack("blanko8o");

        fragmentTransaction.commit();
    }

    @SuppressLint("RestrictedApi")
    private void populateData(boolean firstInit, int kodeMT, String thBln, int perioda) {
        if (firstInit) {
            queryFilters = new QueryFilters();
            List<Blanko08> tempListBlanko6s = LocalData.getList(queryFilters, Blanko08.class, "tgledit", Sort.DESCENDING);
            System.out.println("All Data: " + new Gson().toJson(tempListBlanko6s));

            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("thbln", thBln);
            queryFilters.add("poda_air", perioda);

            blanko08List = new ArrayList<>();
            List<Blanko08> tempListBlanko6;
            tempListBlanko6 = LocalData.getList(queryFilters, Blanko08.class, "tgl", Sort.ASCENDING);
            System.out.println(new Gson().toJson(tempListBlanko6));
            if (tempListBlanko6.size()>0){
                blanko08List.add(tempListBlanko6.get(0));
            }

            adapter = new AdapterListBlanko8O(blanko08List, activity, perioda);
            recyclerView.setAdapter(adapter);

            if (blanko08List.size() > 0) {
                fab_add.setVisibility(View.GONE);
                notFoundText.setVisibility(View.GONE);
            } else {
                fab_add.setVisibility(View.VISIBLE);
                notFoundText.setVisibility(View.VISIBLE);
            }
        } else {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("thbln", thBln);
            queryFilters.add("poda_air", perioda);

            blanko08List.clear();
            List<Blanko08> tempListBlanko6;
            tempListBlanko6 = LocalData.getList(queryFilters, Blanko08.class, "tgl", Sort.DESCENDING);
            System.out.println(new Gson().toJson(tempListBlanko6));

            if (tempListBlanko6.size()>0){
                blanko08List.add(tempListBlanko6.get(0));
            }

            adapter.setPerioda(perioda);
            adapter.notifyDataSetChanged();

            if (blanko08List.size() > 0) {
                fab_add.setVisibility(View.GONE);
                notFoundText.setVisibility(View.GONE);
            } else {
                fab_add.setVisibility(View.VISIBLE);
                notFoundText.setVisibility(View.VISIBLE);
            }
        }

    }

}
