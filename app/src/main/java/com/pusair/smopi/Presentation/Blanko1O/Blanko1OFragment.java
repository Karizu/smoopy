package com.pusair.smopi.Presentation.Blanko1O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.GroupIp3a;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import io.realm.Realm;
import io.realm.Sort;

public class Blanko1OFragment extends Fragment {

    @BindView(R.id.spinner_musim)
    MaterialSpinner spinnerMusim;

    @BindView(R.id.spinner_ip3a)
    MaterialSpinner spinnerIp3a;

    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;

    @BindView(R.id.notFoundText)
    TextView notFoundText;

    private RecyclerView.Adapter adapter;

    private Context activity;

    private RecyclerView recyclerView;

    private QueryFilters queryFilters;

    private List<String> musimTanamSpinner;

    private List<String> ip3aSpinner;

    private LinearLayoutManager layoutManager;

    private List<Blanko0123> blanko0123List;

    private List<MusimTanam> musimTanamList;

    private String kodeOrg = "";

    private int kodeMT = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_blanko_1o, null);
        ButterKnife.bind(this, view);
        queryFilters = new QueryFilters();
        musimTanamSpinner = new ArrayList<>();
        ip3aSpinner = new ArrayList<>();

        ((HomeActivity)getActivity()).saveBtn.setVisibility(View.INVISIBLE);

        musimTanamList = LocalData.getList(queryFilters, MusimTanam.class, "kd_mt", Sort.DESCENDING);
        List<GroupIp3a> groupIp3aList = LocalData.getList(queryFilters, GroupIp3a.class, "kd_org", Sort.ASCENDING);

        if (musimTanamList.size() > 0) {
            for (int i =0; i< musimTanamList.size(); i++) {
                musimTanamSpinner.add(i, musimTanamList.get(i).getThn_mt());
            }
        }

        if (groupIp3aList.size() > 0) {
            for (int i=0; i< groupIp3aList.size(); i++) {
                ip3aSpinner.add(i, groupIp3aList.get(i).getKd_org());
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

        recyclerView = getView().findViewById(R.id.list_blanko_1o);
        recyclerView.setLayoutManager(layoutManager);

        spinnerMusim.setItems(musimTanamSpinner);
        spinnerIp3a.setItems(ip3aSpinner);

        kodeOrg = ip3aSpinner.get(0);
        kodeMT = musimTanamList.get(0).getKd_mt();

        populateData(true, musimTanamList.get(0).getKd_mt(), ip3aSpinner.get(0));

        spinnerIp3a.setOnItemSelectedListener((view12, position, id, item) -> {
            kodeOrg = ip3aSpinner.get(position);
            populateData(false, kodeMT, kodeOrg);
        });

        spinnerMusim.setOnItemSelectedListener((view1, position, id, item) -> {
            kodeMT = musimTanamList.get(position).getKd_mt();
            populateData(false, kodeMT, kodeOrg);
        });
    }

    @OnClick(R.id.fab_add)
    public void openAddBlanko10() {
        Bundle bundle = new Bundle();

        bundle.putString("kodeOrg", kodeOrg);
        bundle.putInt("kodeMT", kodeMT);
        bundle.putInt("action", Constant.ACTION_ADD);

        Fragment fragment = new Blanko1OAddFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "addblanko1o");
        fragmentTransaction.addToBackStack("blanko1o");

        fragmentTransaction.commit();
    }

    @SuppressLint("RestrictedApi")
    private void populateData(boolean firstInit, int kodeMT, String kodeOrg) {

        if (firstInit) {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("kd_org", kodeOrg);
            queryFilters.add("urut_mt", "MT1");
            queryFilters.add("jenis_uk", "u");

            blanko0123List = new ArrayList<>();

            blanko0123List.addAll(LocalData.getList(queryFilters, Blanko0123.class, "kd_mt", Sort.DESCENDING));

            adapter = new AdapterListBlanko1O(blanko0123List, activity);
            recyclerView.setAdapter(adapter);

            if (blanko0123List.size() > 0) {
                notFoundText.setVisibility(View.GONE);
                fabAdd.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
                fabAdd.setVisibility(View.VISIBLE);
            }
        } else {
            queryFilters = new QueryFilters();
            queryFilters.add("kd_mt", kodeMT);
            queryFilters.add("kd_org", kodeOrg);
            queryFilters.add("urut_mt", "MT1");
            queryFilters.add("jenis_uk", "u");

            blanko0123List.clear();
            blanko0123List.addAll(LocalData.getList(queryFilters, Blanko0123.class, "kd_mt", Sort.DESCENDING));

            adapter.notifyDataSetChanged();

            if (blanko0123List.size() > 0) {
                notFoundText.setVisibility(View.GONE);
                fabAdd.setVisibility(View.GONE);
            } else {
                notFoundText.setVisibility(View.VISIBLE);
                fabAdd.setVisibility(View.VISIBLE);
            }
        }
    }

    @OnClick(R.id.btn_edit_blanko1o)
    void onClickEditBlanko1O(){

        String listKodeOrg = new Gson().toJson(ip3aSpinner);

        Bundle bundle = new Bundle();
        bundle.putInt("kodeMT", kodeMT);
        bundle.putString("listKodeOrg", listKodeOrg);

        Fragment fragment = new Blanko1OEditAllFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.screen_area, fragment, "editblanko1o");
        fragmentTransaction.addToBackStack("addblanko1o");

        fragmentTransaction.commit();
    }

}
