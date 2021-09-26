package com.pusair.smopi.Presentation.Blanko1P;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
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
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.JenisKeadaan;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.pusair.smopi.Utils.MethodUtil;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

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

public class Blanko1PFragment extends Fragment {

    private AdapterListBlanko1P adapterListBlanko1P;
    private QueryFilters queryFilters;
    private List<BlankoP01> blankoP01List;
    private List<SaluranDetail> saluranDetailList;
    private List<BlankoP01Detail> blankoP01Details;
    private List<String> tmtBangtrolList;
    private String startDate;
    private String endDate;
    private String tmtBangtrol;
    private DatePickerDialog picker;
    private String sCekTmtBangtrol = "null";
    private List<BlankoP01> p01List;
    private String daerahIrigasiSelected;
    private String kdIrigasiSelected;

    @BindView(R.id.spinner_start_date)
    FrameLayout spinnerStartDate;
    @BindView(R.id.spinner_end_date)
    FrameLayout spinnerEndDate;
    @BindView(R.id.spinner_tmt)
    MaterialSpinner spinnerTmt;

    @BindView(R.id.list_blanko_1p)
    RecyclerView recyclerView;
    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;
    @BindView(R.id.tvStartDate)
    TextView tvStartDate;
    @BindView(R.id.tvEndDate)
    TextView tvEndDate;
    @BindView(R.id.notFoundText)
    TextView notFoundText;

    @OnClick(R.id.spinner_start_date)
    void onClickSpinnerDateStart() {
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);
        // date picker dialog
        picker = new DatePickerDialog(Objects.requireNonNull(getActivity()),
                (view, year1, monthOfYear, dayOfMonth) -> {
                    String dt = MethodUtil.getDateSet(year1, monthOfYear, dayOfMonth);
                    tvStartDate.setText(dt);
                    startDate = dt;
                    populateData(false, startDate, endDate, tmtBangtrol);
                }, year, month, day);
        picker.show();
    }

    @OnClick(R.id.spinner_end_date)
    void onClickSpinnerDateEnd() {
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);
        // date picker dialog
        picker = new DatePickerDialog(Objects.requireNonNull(getActivity()),
                (view, year1, monthOfYear, dayOfMonth) -> {
                    String dt = MethodUtil.getDateSet(year1, monthOfYear, dayOfMonth);
                    tvEndDate.setText(dt);
                    endDate = dt;
                    populateData(false, startDate, endDate, tmtBangtrol);
                }, year, month, day);
        picker.show();
    }

    @OnClick(R.id.fab_add)
    void onClickFabAddBlanko1p() {
        Bundle bundle = new Bundle();
        bundle.putString("daerahIrigasiSelected", daerahIrigasiSelected);
        bundle.putString("kdIrigasiSelected", kdIrigasiSelected);
        bundle.putString("tmtBangtrol", tmtBangtrol);
        bundle.putInt("action", Constant.ACTION_ADD);

        Fragment fragment = new Blanko1PAddFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment);
        fragmentTransaction.addToBackStack("home");

        fragmentTransaction.commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blanko_1p, null);
        ButterKnife.bind(this, view);
        queryFilters = new QueryFilters();
        tmtBangtrolList = new ArrayList<>();
        p01List = new ArrayList<>();
        blankoP01List = new ArrayList<>();
        saluranDetailList = new ArrayList<>();

        try {
//            blankoP01List.addAll(LocalData.getList(queryFilters, BlankoP01.class, "id_b01", Sort.DESCENDING));
            saluranDetailList.addAll(LocalData.getList(queryFilters, SaluranDetail.class, "nm_bangtrol", Sort.DESCENDING));
            queryFilters = new QueryFilters();
            blankoP01Details = LocalData.getList(queryFilters, BlankoP01Detail.class, "id_b01", Sort.DESCENDING);
            System.out.println(new Gson().toJson(saluranDetailList));
            System.out.println(new Gson().toJson(blankoP01Details));
            tmtBangtrolList.add(0, "TMT Bangtrol");
            int j = 1;
            if (saluranDetailList.size() > 0) {
                for (int i = 0; i  < saluranDetailList.size(); i++) {
                    if (saluranDetailList.get(i).getTmt_bangtrol()!=null){
                        if (!sCekTmtBangtrol.contains(saluranDetailList.get(i).getTmt_bangtrol())){
                            sCekTmtBangtrol += saluranDetailList.get(i).getTmt_bangtrol();
                            tmtBangtrolList.add(j, saluranDetailList.get(i).getTmt_bangtrol());
                            j++;
                        }
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setVisibility(View.INVISIBLE);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        daerahIrigasiSelected = Objects.requireNonNull(getArguments()).getString("daerahIrigasiSelected");
        kdIrigasiSelected = getArguments().getString("kdIrigasiSelected");

        recyclerView = getView().findViewById(R.id.list_blanko_1p);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String date = sdf.format(new Date());

        tvStartDate.setText(date);
        tvEndDate.setText(date);
        startDate = date;
        endDate = date;
        try {
            spinnerTmt.setItems(tmtBangtrolList);
            spinnerTmt.setOnItemSelectedListener((view1, position, id, item) -> {
                tmtBangtrol = tmtBangtrolList.get(position);
                populateData(false, startDate, endDate, tmtBangtrol);
            });
        } catch (Exception e){
            e.printStackTrace();
        }

        populateData(true, startDate, endDate, tmtBangtrolList.get(spinnerTmt.getSelectedIndex()));
    }

    private void populateData(boolean isFirstInit, String startDate, String endDate, String tmtBangtrol) {
        startDate = MethodUtil.formatDateString(startDate, "dd MMM yyyy", "yyyy-MM");
        endDate = MethodUtil.formatDateString(endDate, "dd MMM yyyy", "yyyy-MM");

        Log.d("startDate", startDate);

        if (isFirstInit) {
            queryFilters = new QueryFilters();
            queryFilters.add("tmt_bangtrol", "2015-04-28");

            blankoP01List = new ArrayList<>();
            blankoP01List.addAll(LocalData.getList(queryFilters, BlankoP01.class, "id_b01", Sort.DESCENDING));

            p01List = new ArrayList<>();
            if (blankoP01List.size() > 0){
                for (BlankoP01 p01: blankoP01List){
                    if (p01.getTgl_inspeksi()!=null){
                        if (p01.getTgl_inspeksi().contains(startDate) || p01.getTgl_inspeksi().contains(endDate)) {
                            p01List.add(p01);
                        }
                    }
                }
            }

            adapterListBlanko1P = new AdapterListBlanko1P(p01List, getActivity(), daerahIrigasiSelected, kdIrigasiSelected);
            recyclerView.setAdapter(adapterListBlanko1P);

            if (p01List.size() > 0){
                notFoundText.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
            }
        } else {
            queryFilters = new QueryFilters();
            queryFilters.add("tmt_bangtrol", tmtBangtrol);

            blankoP01List.clear();
            blankoP01List.addAll(LocalData.getList(queryFilters, BlankoP01.class, "id_b01", Sort.DESCENDING));

            p01List.clear();
            if (blankoP01List.size() > 0){
                for (BlankoP01 p01: blankoP01List){
                    if (p01.getTgl_inspeksi()!=null){
                        if (p01.getTgl_inspeksi().contains(startDate) || p01.getTgl_inspeksi().contains(endDate)) {
                            p01List.add(p01);
                        }
                    }
                }
            }

            adapterListBlanko1P.notifyDataSetChanged();

            if (p01List.size() > 0){
                notFoundText.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
            }
        }
    }
}
