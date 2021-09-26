package com.pusair.smopi.Presentation.Blanko6O;

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
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko6OAddFragment extends Fragment {

    @BindView(R.id.label_daerahIrigasi)
    TextView daerahIrigasi;

    @BindView(R.id.label_kodeIrigasi)
    TextView kodeIrigasi;

    @BindView(R.id.label_luasSawah)
    TextView luasSawah;

    @BindView(R.id.label_bangtrol)
    TextView bangtrol;

    @BindView(R.id.label_petak)
    TextView petak;

    @BindView(R.id.spinner_bangtrol)
    MaterialSpinner spinnerBangtrol;

    @BindView(R.id.ed_debit)
    EditText debitAir;

    @BindView(R.id.ed_qLain)
    EditText qLain;

    @BindView(R.id.ed_qHilang)
    EditText qHilang;

    @BindView(R.id.ed_qSuplesi)
    EditText qSuplesi;

    @BindView(R.id.spinner_caraukur)
    MaterialSpinner spinnerCaraUkur;

    @BindView(R.id.spinner_kondisialat)
    MaterialSpinner spinnerKondisiAlat;

    @BindView(R.id.rvBlanko06Add)
    RecyclerView rvBlanko06Add;

    private List<String> caraUkurList;
    private List<String> kondisiAlatList;
    private List<SaluranDetail> bangtrolList;
    private List<String> bangtrolStringList;

    private int kodeMT = 0;
    private String tahunBulan = "202001";
    private int perioda = 1;
    private int action = 0;
    private SaluranDetail selectedBangtrol;

    private QueryFilters queryFilters;

    private Blanko06 blanko06;
    private List<Blanko06> blanko06List;
    private Calendar selectedDate;
    private String selectedCaraUkur;
    private String selectedAlatUkur;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_add_blanko_6o, null);
        ButterKnife.bind(this, view);

        ((HomeActivity)getActivity()).saveBtn.setVisibility(View.VISIBLE);

        ((HomeActivity)getActivity()).saveBtn.setOnClickListener(view1 -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            try {
                if (action == 1) {
                    queryFilters = new QueryFilters();

                    queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                    User currentUser = LocalData.get(queryFilters, User.class);

                    blanko06.setId(UUID.randomUUID().toString());
                    blanko06.setKd_staf(currentUser.getKd_staf());
                    blanko06.setKd_mt(kodeMT);
                    blanko06.setThbln(tahunBulan);
                    blanko06.setNm_bangtrol(selectedBangtrol.getNm_bangtrol());
                    blanko06.setTmt_bangtrol(selectedBangtrol.getTmt_bangtrol());
                    blanko06.setUrutan(selectedBangtrol.getUrutan());

                    if (perioda == 1) {
                        blanko06.setCara_ukur1(selectedCaraUkur);
                        blanko06.setKon_ukur1(selectedAlatUkur);
                    } else {
                        blanko06.setCara_ukur2(selectedCaraUkur);
                        blanko06.setKon_ukur2(selectedAlatUkur);
                    }

                    blanko06.setTgledit(currentDateandTime);
                    blanko06.setFlag(false);
                    LocalData.saveOrUpdate(blanko06);

                } else {

                    if (perioda == 1) {
                        blanko06.setCara_ukur1(selectedCaraUkur);
                        blanko06.setKon_ukur1(selectedAlatUkur);
                    } else {
                        blanko06.setCara_ukur2(selectedCaraUkur);
                        blanko06.setKon_ukur2(selectedAlatUkur);
                    }

                    blanko06.setTgledit(currentDateandTime);
                    blanko06.setFlag(false);
                    LocalData.saveOrUpdate(blanko06);
                }

                Toast.makeText(getActivity(), "Data berhasil disimpan", Toast.LENGTH_SHORT).show();

            } catch (SessionNotFoundException e) {
                e.printStackTrace();
            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }
        });

        blanko06List = new ArrayList<>();

        caraUkurList = new ArrayList<>();
        caraUkurList.add("-- Pilih --");
        caraUkurList.add("A");
        caraUkurList.add("B");
        spinnerCaraUkur.setItems(caraUkurList);
        spinnerCaraUkur.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                selectedCaraUkur = view.getItems().get(position).toString();
            }
        });

        kondisiAlatList = new ArrayList<>();
        kondisiAlatList.add("-- Pilih --");
        kondisiAlatList.add("Baik");
        kondisiAlatList.add("Rusak");
        spinnerKondisiAlat.setItems(kondisiAlatList);
        spinnerKondisiAlat.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                selectedAlatUkur = view.getItems().get(position).toString();
            }
        });

        bangtrolList = new ArrayList<>();
        bangtrolStringList = new ArrayList<>();

        queryFilters = new QueryFilters();
        queryFilters.add("hapus", 0);

        List<SaluranDetail> saluranDetails = LocalData.getList(queryFilters, SaluranDetail.class);

        for (int i=0; i< saluranDetails.size(); i++){
            if (saluranDetails.get(i).getNm_bangtrolpar() == null){
                saluranDetails.get(i).setNm_bangtrol(saluranDetails.get(i).getNm_bangtrol().replace(saluranDetails.get(i).getKd_saluran(), ""));
                bangtrolList.add(saluranDetails.get(i));
                bangtrolStringList.add(saluranDetails.get(i).getNm_bangtrol());
            }
        }

        spinnerBangtrol.setItems(bangtrolStringList);
        bangtrol.setText(bangtrolStringList.get(0));
        petak.setText("Petak Tersier "+bangtrolList.get(0).getPetak_tersier());
        selectedBangtrol = bangtrolList.get(0);

        spinnerBangtrol.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                bangtrol.setText(bangtrolStringList.get(position));
                petak.setText("Petak Tersier "+bangtrolList.get(position).getPetak_tersier());
                selectedBangtrol = bangtrolList.get(position);

                populateData(action, kodeMT, tahunBulan, perioda);

            }
        });

        debitAir.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    int date = selectedDate.get(Calendar.DATE)+1;

                    switch (date) {
                        case 1 :
                            blanko06.setTg01(Float.parseFloat(debitAir.getText().toString()));
                            break;

                        case 2 :
                            blanko06.setTg02(Float.parseFloat(debitAir.getText().toString()));
                            break;

                        case 3 :
                            blanko06.setTg03(Float.parseFloat(debitAir.getText().toString()));
                            break;
                    }
                }
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        action = getArguments().getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");

        Calendar initDate = Calendar.getInstance();
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();

        if (perioda == 1) {
            initDate.set(2019, 11, 31);
            startDate.set(2019, 12, 1);
            endDate.set(2019, 12, 15);
        } else {
            initDate.set(2019, 12, 15);
            startDate.set(2019, 12, 16);
            endDate.set(2019, 12, 31);
        }

        selectedDate = startDate;

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(view, R.id.calendarView)
                .range(initDate, endDate)
                .datesNumberOnScreen(8)
                .configure()
                    .showTopText(false)
                    .showBottomText(false)
                .end()
                .defaultSelectedDate(startDate)
                .build();

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Calendar date, int position) {

                // library error, need to add day + 1 for correct selected date
                selectedDate = date;
                Toast.makeText(getContext(), "String:" +date.get(Calendar.DATE), Toast.LENGTH_SHORT).show();
            }
        });

        populateData(action, kodeMT, tahunBulan, perioda);
    }

    private void populateData(int action, int kodeMT, String tahunBulan, int perioda) {
        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("nm_bangtrol", selectedBangtrol.getNm_bangtrol());

        if (action == 2) {
            try {
                blanko06 = LocalData.get(queryFilters, Blanko06.class);
                // TO:DO parsing value dari DB ke tampilan

            } catch (LocalDataNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            blanko06 = new Blanko06();
        }

    }

}
