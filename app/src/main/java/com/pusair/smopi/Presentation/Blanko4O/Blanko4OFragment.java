package com.pusair.smopi.Presentation.Blanko4O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.RentangMusimTanam;
import com.pusair.smopi.Presentation.Blanko1O.Blanko1OAddFragment;
import com.pusair.smopi.Presentation.Blanko4A.Blanko4AFragment;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Sort;

public class Blanko4OFragment extends Fragment {

    @BindView(R.id.spinner_musim)
    MaterialSpinner spinnerMusim;

    @BindView(R.id.spinner_bulan)
    MaterialSpinner spinnerBulan;

    @BindView(R.id.spinner_mt)
    MaterialSpinner spinnerMt;

    @BindView(R.id.spinner_perioda)
    MaterialSpinner spinnerPerioda;

    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;

    @BindView(R.id.notFoundText)
    TextView notFoundText;

    private RecyclerView.Adapter adapter;

    private Context activity;

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private QueryFilters queryFilters;
    private List<String> musimTanamSpinner;
    private List<String> tahunBulanList;
    private List<MusimTanam> musimTanamList;
    private List<Blanko0405> blanko0405List;
    private RentangMusimTanam rentangMusimTanam;

    private int kodeMT = 0;
    private String urutMT = "MT1";
    private String tahunBulan = "202001";
    private int perioda = 1;

    @OnClick(R.id.btn_blanko4a)
    void onClickbtn_blanko4a() {
        Fragment fragment = new Blanko4AFragment();
        FragmentManager fragmentManager = getFragmentManager();
        assert fragmentManager != null;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko4a");
        fragmentTransaction.addToBackStack("blanko4o");

        fragmentTransaction.commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blanko_4o, null);
        ButterKnife.bind(this, view);

        queryFilters = new QueryFilters();
        musimTanamSpinner = new ArrayList<>();
        tahunBulanList = new ArrayList<>();

        ((HomeActivity) getActivity()).saveBtn.setVisibility(View.INVISIBLE);

        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);

        if (musimTanamList.size() > 0) {
            for (int i = 0; i < musimTanamList.size(); i++) {
                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
            }
        }

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        activity = getActivity();
        layoutManager = new LinearLayoutManager(activity,
                RecyclerView.VERTICAL,
                false);

        recyclerView = getView().findViewById(R.id.list_blanko_4o);
        recyclerView.setLayoutManager(layoutManager);

        spinnerMusim.setItems(musimTanamSpinner);

        queryFilters = new QueryFilters();
        if(musimTanamList.size()>0){
            queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        }
//        queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        tahunBulanList = new ArrayList<>();

        try {
            rentangMusimTanam = LocalData.get(queryFilters, RentangMusimTanam.class);

            String date1 = rentangMusimTanam.getBlnaw() + "-" + rentangMusimTanam.getThnaw();
            String date2 = (rentangMusimTanam.getBlnak() + 1) + "-" + rentangMusimTanam.getThnak();

            DateFormat formater = new SimpleDateFormat("MMM yyyy");
            DateFormat formaterSource = new SimpleDateFormat("MM-yyyy");

            Calendar beginCalendar = Calendar.getInstance();
            Calendar finishCalendar = Calendar.getInstance();

            try {
                beginCalendar.setTime(formaterSource.parse(date1));
                finishCalendar.setTime(formaterSource.parse(date2));
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
            spinnerMt.setItems("MT1", "MT2", "MT3");
            spinnerPerioda.setItems("Perioda 1", "Perioda 2");
            tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();
            kodeMT = musimTanamList.get(0).getKd_mt();

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
            spinnerBulan.setItems("-- Pilih Bulan --");
            spinnerMt.setItems("-- Pilih MT --");
            spinnerPerioda.setItems("-- Pilih Perioda --");
        }

        populateData(true, musimTanamList.get(0).getKd_mt(), rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw(), urutMT, perioda);


        spinnerMusim.setOnItemSelectedListener((view1, position, id, item) -> {
            kodeMT = musimTanamList.get(position).getKd_mt();
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            tahunBulanList = new ArrayList<>();

            try {
                rentangMusimTanam = LocalData.get(queryFilters, RentangMusimTanam.class);

                String date1 = rentangMusimTanam.getBlnaw() + "-" + rentangMusimTanam.getThnaw();
                String date2 = (rentangMusimTanam.getBlnak() + 1) + "-" + rentangMusimTanam.getThnak();

                DateFormat formater = new SimpleDateFormat("MMM yyyy");
                DateFormat formaterSource = new SimpleDateFormat("MM-yyyy");

                Calendar beginCalendar = Calendar.getInstance();
                Calendar finishCalendar = Calendar.getInstance();

                try {
                    beginCalendar.setTime(formaterSource.parse(date1));
                    finishCalendar.setTime(formaterSource.parse(date2));
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
                spinnerMt.setItems("MT1", "MT2", "MT3");
                spinnerPerioda.setItems("Perioda 1", "Perioda 2");
                tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();

                populateData(false, kodeMT, tahunBulan, urutMT, perioda);
            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
                spinnerBulan.setItems("-- Pilih Bulan --");
                spinnerMt.setItems("-- Pilih MT --");
                spinnerPerioda.setItems("-- Pilih Perioda --");
            }
        });

        spinnerBulan.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                try {
                    DateFormat sourceFormater = new SimpleDateFormat("MMM yyyy");
                    DateFormat formater = new SimpleDateFormat("yyyyMM");

                    Date sourceDate = sourceFormater.parse(tahunBulanList.get(position));

                    tahunBulan = formater.format(sourceDate);

                    populateData(false, kodeMT, tahunBulan, urutMT, perioda);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        spinnerMt.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                urutMT = view.getItems().get(position).toString();
                populateData(false, kodeMT, tahunBulan, urutMT, perioda);
            }
        });

        spinnerPerioda.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                String periodString = view.getItems().get(position).toString();
                perioda = Integer.parseInt(periodString.substring(periodString.length() - 1));
                populateData(false, kodeMT, tahunBulan, urutMT, perioda);
            }
        });

    }

    @OnClick(R.id.fab_add)
    public void openAddBlanko40() {
        Bundle bundle = new Bundle();

        bundle.putString("urutMT", urutMT);
        bundle.putString("tahunBulan", tahunBulan);
        bundle.putInt("perioda", perioda);
        bundle.putInt("kodeMT", kodeMT);
        bundle.putInt("action", 1);

        Fragment fragment = new Blanko4OAddFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko4o");
        fragmentTransaction.addToBackStack("blanko4o");

        fragmentTransaction.commit();
    }

    @SuppressLint("RestrictedApi")
    private void populateData(boolean firstInit, int kodeMT, String thBln, String MT, int perioda) {

        if (firstInit) {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("urut_mt", MT);
            queryFilters.add("thbln", thBln);
            queryFilters.add("poda_air", perioda);

            blanko0405List = new ArrayList<>();

            blanko0405List.addAll(LocalData.getList(queryFilters, Blanko0405.class, "kd_mt", Sort.DESCENDING));

            adapter = new AdapterListBlanko4O(blanko0405List, activity);
            recyclerView.setAdapter(adapter);

            if (blanko0405List.size() > 0) {
                notFoundText.setVisibility(View.GONE);
                fabAdd.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
                fabAdd.setVisibility(View.VISIBLE);
            }
        } else {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("urut_mt", MT);
            queryFilters.add("thbln", thBln);
            queryFilters.add("poda_air", perioda);

            blanko0405List.clear();
            blanko0405List.addAll(LocalData.getList(queryFilters, Blanko0405.class, "kd_mt", Sort.DESCENDING));

            adapter.notifyDataSetChanged();

            if (blanko0405List.size() > 0) {
                notFoundText.setVisibility(View.GONE);
                fabAdd.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
                fabAdd.setVisibility(View.VISIBLE);
            }
        }
    }
}
