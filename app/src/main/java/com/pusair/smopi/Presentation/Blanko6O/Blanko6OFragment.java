package com.pusair.smopi.Presentation.Blanko6O;

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
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.RentangMusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
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

public class Blanko6OFragment extends Fragment {

    @BindView(R.id.spinner_musim)
    MaterialSpinner spinnerMusim;

    @BindView(R.id.spinner_bulan)
    MaterialSpinner spinnerBulan;

    @BindView(R.id.spinner_perioda)
    MaterialSpinner spinnerPerioda;

    @BindView(R.id.notFoundText)
    TextView notFoundText;

    @BindView(R.id.fab_add)
    FloatingActionButton fab_add;

    private AdapterListBlanko6O adapter;

    private Context activity;

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private QueryFilters queryFilters;
    private List<String> musimTanamSpinner;
    private List<String> tahunBulanList;
    private List<MusimTanam> musimTanamList;
    private List<Blanko06> blanko06List;
    private RentangMusimTanam rentangMusimTanam;
    private String kdIrigasiSelected;

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

        recyclerView = getView().findViewById(R.id.list_blanko_6o);
        recyclerView.setLayoutManager(layoutManager);

        try {
            kdIrigasiSelected = Objects.requireNonNull(getArguments()).getString("kd_di");
        } catch (Exception e){
            e.printStackTrace();
        }

        spinnerMusim.setItems(musimTanamSpinner);

        tahunBulanList = new ArrayList<>();
        queryFilters = new QueryFilters();
        if(musimTanamList.size()>0){
            queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        }

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
            spinnerPerioda.setItems("Perioda 1", "Perioda 2");
            tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();
            kodeMT = musimTanamList.get(0).getKd_mt();

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
            spinnerBulan.setItems("-- Pilih Bulan --");
            spinnerPerioda.setItems("-- Pilih Perioda --");
        }

        spinnerMusim.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
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
                    spinnerPerioda.setItems("Perioda 1", "Perioda 2");
                    tahunBulan = rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw();

                    populateData(false, kodeMT, tahunBulan, perioda);
                } catch (LocalDataNotFoundException e) {
                    e.printStackTrace();
                    spinnerBulan.setItems("-- Pilih Bulan --");
                }
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
                    Log.d("tahun Bulan", kodeMT + " - " + tahunBulan + " - " + perioda);

                    populateData(false, kodeMT, tahunBulan, perioda);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        spinnerPerioda.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                String periodString = view.getItems().get(position).toString();
                perioda = Integer.parseInt(periodString.substring(periodString.length() - 1));
                populateData(false, kodeMT, tahunBulan, perioda);
            }
        });

        populateData(true, musimTanamList.size()>0?musimTanamList.get(0).getKd_mt():0, rentangMusimTanam.getThnaw() + rentangMusimTanam.getBlnaw(), perioda);
    }

    @OnClick(R.id.fab_add)
    public void addBlanko6o() {
        Bundle bundle = new Bundle();

        bundle.putInt("action", 1);
        bundle.putString("tahunBulan", tahunBulan);
        bundle.putInt("perioda", perioda);
        bundle.putInt("kodeMT", kodeMT);
        bundle.putString("kd_di", kdIrigasiSelected);

        Fragment fragment = new Blanko6OAddNewFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko6o");
        fragmentTransaction.addToBackStack("blanko6o");

        fragmentTransaction.commit();
    }

    @SuppressLint("RestrictedApi")
    private void populateData(boolean firstInit, int kodeMT, String thBln, int perioda) {
        if (firstInit) {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("thbln", thBln);

            blanko06List = new ArrayList<>();
            List<Blanko06> tempListBlanko6 = new ArrayList<>();
            List<Blanko06> tempListBlanko6_2 = new ArrayList<>();
            tempListBlanko6.addAll(LocalData.getList(queryFilters, Blanko06.class, "kd_mt", Sort.DESCENDING));
            if (tempListBlanko6.size() > 0) {
                switch (perioda) {
                    case 1:
                        for (int i = 0; i < tempListBlanko6.size(); i++) {
                            Blanko06 blanko06 = tempListBlanko6.get(i);
                            int jDebit1 = (int) blanko06.getJdebit1();
                            if (jDebit1 != 0) {
                                tempListBlanko6_2.add(blanko06);
                            }
                        }
                        blanko06List.add(tempListBlanko6_2.size()>0?tempListBlanko6_2.get(0):new Blanko06());
                        break;

                    case 2:
                        for (int i = 0; i < tempListBlanko6.size(); i++) {
                            Blanko06 blanko06 = tempListBlanko6.get(i);
                            int jDebit2 = (int) blanko06.getJdebit2();
                            if (jDebit2 != 0) {
                                tempListBlanko6_2.add(blanko06);
                            }
                        }
                        blanko06List.add(tempListBlanko6_2.size()>0?tempListBlanko6_2.get(0):new Blanko06());
                        break;

                    default:

                        break;
                }
            }

            adapter = new AdapterListBlanko6O(blanko06List, activity, perioda, kdIrigasiSelected);
            recyclerView.setAdapter(adapter);

            if (blanko06List.size() > 0) {
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

            blanko06List.clear();
            List<Blanko06> tempListBlanko6 = new ArrayList<>();
            List<Blanko06> tempListBlanko6_2 = new ArrayList<>();
            tempListBlanko6.addAll(LocalData.getList(queryFilters, Blanko06.class, "kd_mt", Sort.DESCENDING));

            if (tempListBlanko6.size() > 0) {
                switch (perioda) {
                    case 1:
                        for (int i = 0; i < tempListBlanko6.size(); i++) {
                            Blanko06 blanko06 = tempListBlanko6.get(i);
                            int jDebit1 = (int) blanko06.getJdebit1();
                            if (jDebit1 != 0) {
                                tempListBlanko6_2.add(blanko06);
                            }
                        }
                        if (tempListBlanko6_2.size() > 0) {
                            blanko06List.add(tempListBlanko6_2.get(0));
                        }
                        break;

                    case 2:
                        for (int i = 0; i < tempListBlanko6.size(); i++) {
                            Blanko06 blanko06 = tempListBlanko6.get(i);
                            int jDebit2 = (int) blanko06.getJdebit2();
                            if (jDebit2 != 0) {
                                tempListBlanko6_2.add(blanko06);
                            }
                        }
                        if (tempListBlanko6_2.size() > 0) {
                            blanko06List.add(tempListBlanko6_2.get(0));
                        }
                        break;

                    default:

                        break;
                }
            }

            adapter.setPerioda(perioda);
            adapter.notifyDataSetChanged();

            if (blanko06List.size() > 0) {
                fab_add.setVisibility(View.GONE);
                notFoundText.setVisibility(View.GONE);
            } else {
                fab_add.setVisibility(View.VISIBLE);
                notFoundText.setVisibility(View.VISIBLE);
            }
        }

    }

}
