package com.pusair.smopi.Presentation.Blanko4A;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko04Bangtrol;
import com.pusair.smopi.Model.GroupIp3a;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.RentangMusimTanam;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Presentation.Blanko4O.Blanko4OAddFragment;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Sort;

public class Blanko4AFragment extends Fragment {

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

    private Context activity;

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private QueryFilters queryFilters;
    private List<String> musimTanamSpinner;
    private List<String> bulanSpinner;
    private List<String> tahunBulanList;
    private List<MusimTanam> musimTanamList;
    private List<Blanko0405> blanko0405List;
    private List<Blanko04Bangtrol> blanko04BangtrolList;
    private RentangMusimTanam rentangMusimTanam;
    private AdapterListBlanko4A adapterListBlanko4A;


    private int kodeMT = 0;
    private String urutMT = "MT1";
    private String tahunBulan = "202001";
    private int perioda = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_blanko_4a, null);
        ButterKnife.bind(this, view);

        queryFilters = new QueryFilters();
        musimTanamSpinner = new ArrayList<>();
        tahunBulanList = new ArrayList<>();
        List<Blanko04Bangtrol> blanko04BangtrolList = new ArrayList<>();

        ((HomeActivity)getActivity()).saveBtn.setVisibility(View.INVISIBLE);

        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);

        if (musimTanamList.size() > 0) {
            for (int i =0; i< musimTanamList.size(); i++) {
                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
            }
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinnerMusim.setItems(musimTanamSpinner);

        queryFilters = new QueryFilters();
        if (musimTanamList.size()>0){
            queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        }
//        queryFilters.add("kd_mt", musimTanamList.get(0).getKd_mt());
        tahunBulanList = new ArrayList<>();

        try {
            rentangMusimTanam = LocalData.get(queryFilters, RentangMusimTanam.class);

            String date1 = rentangMusimTanam.getBlnaw()+"-"+rentangMusimTanam.getThnaw();
            String date2 = (rentangMusimTanam.getBlnak()+1)+"-"+rentangMusimTanam.getThnak();

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
            tahunBulan = rentangMusimTanam.getThnaw()+rentangMusimTanam.getBlnaw();
            kodeMT = musimTanamList.get(0).getKd_mt();

        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
            spinnerBulan.setItems("-- Pilih Bulan --");
            spinnerMt.setItems("-- Pilih MT --");
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

                    String date1 = rentangMusimTanam.getBlnaw()+"-"+rentangMusimTanam.getThnaw();
                    String date2 = (rentangMusimTanam.getBlnak()+1)+"-"+rentangMusimTanam.getThnak();

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
                    tahunBulan = rentangMusimTanam.getThnaw()+rentangMusimTanam.getBlnaw();
                } catch (LocalDataNotFoundException e) {
                    e.printStackTrace();
                    spinnerBulan.setItems("-- Pilih Bulan --");
                    spinnerMt.setItems("-- Pilih MT --");
                    spinnerPerioda.setItems("-- Pilih Perioda --");
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
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        spinnerMt.setOnItemSelectedListener((view12, position, id, item) -> urutMT = view12.getItems().get(position).toString());

        spinnerPerioda.setOnItemSelectedListener((view1, position, id, item) -> {
            String periodString = view1.getItems().get(position).toString();
            perioda = Integer.parseInt(periodString.substring(periodString.length()-1));
        });
    }

    @OnClick(R.id.fab_add)
    public void openAddBlanko4A() {

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("urut_mt", urutMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("poda_air", perioda);
        List<Blanko04Bangtrol> blanko04BangtrolList = LocalData.getList(queryFilters, Blanko04Bangtrol.class, "nm_bangtrol", Sort.ASCENDING);

        Bundle bundle = new Bundle();

        bundle.putString("urutMT", urutMT);
        bundle.putString("tahunBulan", tahunBulan);
        bundle.putInt("perioda", perioda);
        bundle.putInt("kodeMT", kodeMT);
        if (blanko04BangtrolList.size()>0){
            bundle.putInt("action", 2);
        } else {
            bundle.putInt("action", 1);
        }


        Fragment fragment = new Blanko4AAddFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko4a");
        fragmentTransaction.addToBackStack("blanko4a");

        fragmentTransaction.commit();
    }
}
