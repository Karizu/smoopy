package com.pusair.smopi.Presentation.Blanko6O;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.DaerahIrigasi;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Blanko1O.AdapterEditAllBlanko1O;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko6OAddNewFragment extends Fragment {

    private List<String> caraUkurList;
    private List<String> kondisiAlatList;
    private List<SaluranDetail> bangtrolList;
    private List<String> bangtrolStringList;
    private QueryFilters queryFilters;
    private List<Blanko06> blanko06List;
    private Blanko06 blanko06;
    private int kodeMT = 0;
    private String tahunBulan;
    private int perioda;
    private int action;
    private String id;
    private String kdIrigasiSelected;

    @BindView(R.id.label_daerahIrigasi)
    TextView daerahIrigasi;
    @BindView(R.id.label_kodeIrigasi)
    TextView kodeIrigasi;
    @BindView(R.id.label_luasSawah)
    TextView luasSawah;
    @BindView(R.id.rvBlanko06Add)
    RecyclerView rvBlanko06Add;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_blanko_6o_new, null);
        ButterKnife.bind(this, view);

        ((HomeActivity) getActivity()).saveBtn.setVisibility(View.VISIBLE);
        ((HomeActivity) getActivity()).saveBtn.setOnClickListener(view1 -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());
            try {
                if (action == Constant.ACTION_ADD) {
                    for (int i = 0; i < AdapterAddListBlanko6O.blanko06List.size(); i++) {
                        blanko06 = AdapterAddListBlanko6O.blanko06List.get(i);
                        blanko06.setThbln(tahunBulan);
                        if (perioda == 1){
                            blanko06.setJdebit1(blanko06.getTg01() + blanko06.getTg02() + blanko06.getTg03() + blanko06.getTg04() +
                                    blanko06.getTg05() + blanko06.getTg06() + blanko06.getTg07() + blanko06.getTg08() + blanko06.getTg09() +
                                    blanko06.getTg10() + blanko06.getTg11() + blanko06.getTg12() + blanko06.getTg13() + blanko06.getTg14() +
                                    blanko06.getTg15());
                            int debit_rata = Math.round(blanko06.getTg01() + blanko06.getTg02() + blanko06.getTg03() + blanko06.getTg04() +
                                    blanko06.getTg05() + blanko06.getTg06() + blanko06.getTg07() + blanko06.getTg08() + blanko06.getTg09() +
                                    blanko06.getTg10() + blanko06.getTg11() + blanko06.getTg12() + blanko06.getTg13() + blanko06.getTg14() +
                                    blanko06.getTg15()) / 15;
                            blanko06.setRata1(debit_rata);
                        } else {
                            blanko06.setJdebit2(blanko06.getTg16() + blanko06.getTg17() + blanko06.getTg18() + blanko06.getTg19() +
                                    blanko06.getTg20() + blanko06.getTg21() + blanko06.getTg22() + blanko06.getTg23() + blanko06.getTg24() +
                                    blanko06.getTg25() + blanko06.getTg26() + blanko06.getTg27() + blanko06.getTg28() + blanko06.getTg29() +
                                    blanko06.getTg30()+blanko06.getTg31());
                            int debit_rata = Math.round(blanko06.getTg16() + blanko06.getTg17() + blanko06.getTg18() + blanko06.getTg19() +
                                    blanko06.getTg20() + blanko06.getTg21() + blanko06.getTg22() + blanko06.getTg23() + blanko06.getTg24() +
                                    blanko06.getTg25() + blanko06.getTg26() + blanko06.getTg27() + blanko06.getTg28() + blanko06.getTg29() +
                                    blanko06.getTg30()+blanko06.getTg31()) / 16;
                            blanko06.setRata2(debit_rata);
                        }
                        blanko06.setTgledit(currentDateandTime);
                        blanko06.setFlag(false);
                        System.out.println(new Gson().toJson(blanko06));
                        int jDebit1 = (int) blanko06.getJdebit1();
                        int jDebit2 = (int) blanko06.getJdebit2();
                        if (perioda == 1){
                            if (jDebit1 == 0){
                                queryFilters = new QueryFilters();
                                queryFilters.add("kd_mt", kodeMT);
                                queryFilters.add("thbln", tahunBulan);
                                LocalData.delete(queryFilters, Blanko06.class);
                                Toast.makeText(getActivity(), "Silahkan isi form yang tersedia", Toast.LENGTH_SHORT).show();
                            } else {
                                LocalData.saveOrUpdate(blanko06);
                            }
                        } else {
                            if (jDebit2 == 0){
                                queryFilters = new QueryFilters();
                                queryFilters.add("kd_mt", kodeMT);
                                queryFilters.add("thbln", tahunBulan);
                                LocalData.delete(queryFilters, Blanko06.class);
                                Toast.makeText(getActivity(), "Silahkan isi form yang tersedia", Toast.LENGTH_SHORT).show();
                            } else {
                                LocalData.saveOrUpdate(blanko06);
                            }
                        }
                    }
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(), "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i < AdapterAddListBlanko6O.blanko06List.size(); i++) {
                        blanko06 = AdapterAddListBlanko6O.blanko06List.get(i);
                        blanko06.setTgledit(currentDateandTime);
                        blanko06.setFlag(false);
                        System.out.println(new Gson().toJson(blanko06));
                        LocalData.saveOrUpdate(blanko06);
                        Intent intent = new Intent(getActivity(), HomeActivity.class);
                        startActivity(intent);
                        Toast.makeText(getActivity(), "Perubahan berhasil disimpan", Toast.LENGTH_SHORT).show();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        bangtrolList = new ArrayList<>();
        bangtrolStringList = new ArrayList<>();
        blanko06List = new ArrayList<>();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        action = Objects.requireNonNull(getArguments()).getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");
        id = getArguments().getString("id");
        kdIrigasiSelected = Objects.requireNonNull(getArguments()).getString("kd_di");

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rvBlanko06Add.setLayoutManager(layoutManager);

        getDaerahIrigasi();

        if (action == Constant.ACTION_EDIT) {
            try {
                queryFilters = new QueryFilters();
                queryFilters.add("thbln", tahunBulan);
                queryFilters.add("kd_mt", kodeMT);
                List<Blanko06> tempListBlanko6 = new ArrayList<>();
                tempListBlanko6.addAll(LocalData.getList(queryFilters, Blanko06.class, "nm_bangtrol", Sort.ASCENDING));

                if (tempListBlanko6.size()>0){
                    switch (perioda) {
                        case 1:
                            for (int i = 0; i < tempListBlanko6.size(); i++){
                                Blanko06 blanko06 = tempListBlanko6.get(i);
                                int jDebit1 = (int) blanko06.getJdebit1();
                                if (jDebit1 != 0) {
                                    blanko06List.add(blanko06);
                                }
                            }

                            System.out.println("Periode 1: "+new Gson().toJson(blanko06List));
                            break;

                        case 2:
                            for (int i = 0; i < tempListBlanko6.size(); i++){
                                Blanko06 blanko06 = tempListBlanko6.get(i);
                                int jDebit2 = (int) blanko06.getJdebit2();
                                if (jDebit2 != 0) {
                                    blanko06List.add(blanko06);
                                }
                            }
                            System.out.println("Periode 2: "+ new Gson().toJson(blanko06List));
                            break;

                        default:

                            break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            AdapterAddListBlanko6O adapter = new AdapterAddListBlanko6O(blanko06List, getContext(), perioda, Constant.ACTION_EDIT);
            rvBlanko06Add.setAdapter(adapter);
        } else {
            blanko06 = new Blanko06();
            try {
                queryFilters = new QueryFilters();
                queryFilters.add("hapus", 0);
                List<SaluranDetail> saluranDetails = LocalData.getList(queryFilters, SaluranDetail.class);

                queryFilters = new QueryFilters();
                queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                User currentUser = LocalData.get(queryFilters, User.class);

                for (int i = 0; i < saluranDetails.size(); i++) {
                    if (saluranDetails.get(i).getNm_bangtrolpar() == null) {
                        Blanko06 blanko06 = new Blanko06();
                        blanko06.setId(UUID.randomUUID().toString());
                        blanko06.setKd_staf(currentUser.getKd_staf());
                        blanko06.setKd_mt(kodeMT);
                        blanko06.setThbln(tahunBulan);
//                    saluranDetails.get(i).setNm_bangtrol(saluranDetails.get(i).getNm_bangtrol().replace(saluranDetails.get(i).getKd_saluran(), ""));
                        blanko06.setNm_bangtrol(saluranDetails.get(i).getNm_bangtrol());
                        blanko06.setTmt_bangtrol(saluranDetails.get(i).getTmt_bangtrol());
                        blanko06.setPetak_tersier(saluranDetails.get(i).getPetak_tersier());
                        blanko06.setUrutan(saluranDetails.get(i).getUrutan());
                        blanko06List.add(blanko06);
                    }
                }
            } catch (SessionNotFoundException e) {
                e.printStackTrace();
            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }

            AdapterAddListBlanko6O adapter = new AdapterAddListBlanko6O(blanko06List, getContext(), perioda, Constant.ACTION_ADD);
            rvBlanko06Add.setAdapter(adapter);
        }
    }

    private void getDaerahIrigasi(){
        queryFilters = new QueryFilters();
        queryFilters.add("kd_di", kdIrigasiSelected);
        try {
            DaerahIrigasi irigasi = LocalData.get(queryFilters, DaerahIrigasi.class);
            if (irigasi!=null){
                daerahIrigasi.setText(irigasi.getNm_di());
                kodeIrigasi.setText(irigasi.getKd_di());
                luasSawah.setText(String.valueOf(irigasi.getLuas_swiri()));
            }
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }
    }
}
