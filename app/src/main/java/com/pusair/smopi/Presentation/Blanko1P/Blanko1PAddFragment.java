package com.pusair.smopi.Presentation.Blanko1P;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.pusair.smopi.Api.SyncHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.JenisKeadaan;
import com.pusair.smopi.Model.Saluran;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.pusair.smopi.Utils.MapsActivity;
import com.pusair.smopi.Utils.MethodUtil;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
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
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Sort;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class Blanko1PAddFragment extends Fragment {


    private BlankoP01 blankoP01;
    private BlankoP01Detail blankoP01Detail;
    private List<Saluran> saluranList;
    private List<SaluranDetail> saluranDetailList;
    private int action;
    private String kdSaluran;
    private String daerahIrigasiSelected;
    private String kdIrigasiSelected;
    private String kdSaluranSelected = "null";
    private String tglInspeksiSelected;
    private String nmBangtrolSelected = "null";
    private String tmtBangtrolSelected = "null";
    private String pelaksanaSelected = "S";
    private String tmtSaluranSelected;
    private String jnsKeadaanSelected;
    private String nmKeadaanSelected;
    private String tipeKerusakanSelected;
    private QueryFilters queryFilters;
    private int LAUNCH_SECOND_ACTIVITY = 1;
    private Dialog dialog;
    private int id_b01;
    private boolean kerusakanIsSaluran;
    private boolean isBangunan;

    @BindView(R.id.tvDaerahIrigasi)
    TextView tvDaerahIrigasi;
    @BindView(R.id.spiner_saluran)
    MaterialSpinner spiner_saluran;
    @BindView(R.id.cbSaluran)
    CheckBox cbSaluran;
    @BindView(R.id.cbBangunan)
    CheckBox cbBangunan;
    @BindView(R.id.spinner_bangunan_kontrol)
    MaterialSpinner spinner_bangunan_kontrol;
    @BindView(R.id.tv_tgl_inspeksi)
    TextView tv_tgl_inspeksi;
    @BindView(R.id.cbSwakelola)
    CheckBox cbSwakelola;
    @BindView(R.id.cbKontraktual)
    CheckBox cbKontraktual;
    @BindView(R.id.etUsulanTindakan)
    EditText etUsulanTindakan;
    @BindView(R.id.et_areal_pelayanan)
    EditText et_areal_pelayanan;
    @BindView(R.id.etLatitude)
    EditText etLatitude;
    @BindView(R.id.etLongitude)
    EditText etLongitude;
    @BindView(R.id.etDesaKecamatan)
    EditText etDesaKecamatan;
    @BindView(R.id.img_lampiran_1)
    ImageView img_lampiran_1;
    @BindView(R.id.img_lampiran_2)
    ImageView img_lampiran_2;

    @OnClick(R.id.fab_add)
    void onClickFabAddLoc(){
        Intent i = new Intent(getActivity(), MapsActivity.class);
        startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
    }

    @OnClick(R.id.imd_add)
    void onClickAddImage(){

    }

    @OnClick(R.id.cbSaluran)
    void onClickCbSaluran(){
        cbSaluran.setChecked(true);
        cbBangunan.setChecked(false);
        isBangunan = false;
        spinner_bangunan_kontrol.setEnabled(false);
    }

    @OnClick(R.id.cbBangunan)
    void onClickCbBangunan(){
        cbSaluran.setChecked(false);
        cbBangunan.setChecked(true);
        isBangunan = true;
        spinner_bangunan_kontrol.setEnabled(true);
    }

    @OnClick(R.id.cbSwakelola)
    void onClickcbSwakelola(){
        cbSwakelola.setChecked(true);
        cbKontraktual.setChecked(false);
        pelaksanaSelected = "S";
    }

    @OnClick(R.id.cbKontraktual)
    void onClickcbKontraktual(){
        cbSwakelola.setChecked(false);
        cbKontraktual.setChecked(true);
        pelaksanaSelected = "K";
    }

    @OnClick(R.id.tv_tgl_inspeksi)
    void onClickTglInspeksi(){
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);
        // date picker dialog
        DatePickerDialog picker = new DatePickerDialog(Objects.requireNonNull(getActivity()),
                (view, year1, monthOfYear, dayOfMonth) -> {
                    String dt = MethodUtil.getDateSet(year1, monthOfYear, dayOfMonth);
                    tv_tgl_inspeksi.setText(dt);
                    tglInspeksiSelected = MethodUtil.formatDateString(dt, "dd MMM yyyy", "yyyy-MM-dd");
                }, year, month, day);
        picker.show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View view =  inflater.inflate(R.layout.fragment_add_blanko_1p, null);
        ButterKnife.bind(this, view);
        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setVisibility(View.VISIBLE);
        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setOnClickListener(view1 -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());
            try {
                if (action == Constant.ACTION_ADD) {
                    if (!kdSaluranSelected.equals("null")){

                        tglInspeksiSelected = MethodUtil.formatDateString(tv_tgl_inspeksi.getText().toString(), "dd MMM yyyy", "yyyy-MM-dd");

                        queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                        User currentUser = LocalData.get(queryFilters, User.class);

                        queryFilters = new QueryFilters();
                        queryFilters.add("kd_saluran", kdSaluranSelected);
                        List<BlankoP01> p01List = new ArrayList<>(LocalData.getList(queryFilters, BlankoP01.class, "id_b01", Sort.DESCENDING));

                        int getId = p01List.size()>0?p01List.get(0).getId_b01() + 1:0;
                        blankoP01.setId_b01(getId);
                        blankoP01.setTgl_inspeksi(tglInspeksiSelected);
                        blankoP01.setTmt_saluran(tmtSaluranSelected);
                        if (!nmBangtrolSelected.equals("null")) blankoP01.setNm_bangtrol(nmBangtrolSelected);
                        if (!tmtBangtrolSelected.equals("null")) blankoP01.setTmt_bangtrol(tmtBangtrolSelected);
                        blankoP01.setKd_staf(currentUser.getKd_staf());
                        blankoP01.setPelaksana(pelaksanaSelected);
                        blankoP01.setUsulan_tindakan(etUsulanTindakan.getText().toString());
                        blankoP01.setAreal_layanan(Float.parseFloat(et_areal_pelayanan.getText().toString()));
                        blankoP01.setDesa_kecamatan(etDesaKecamatan.getText().toString());
                        blankoP01.setKoordl(Double.parseDouble(etLatitude.getText().toString()));
                        blankoP01.setKoordb(Double.parseDouble(etLongitude.getText().toString()));
                        blankoP01.setKd_saluran(kdSaluranSelected);
                        blankoP01.setTgledit(currentDateandTime);
                        blankoP01.setTglrekam(currentDateandTime);
                        blankoP01.setFlag(false);

                        LocalData.saveOrUpdate(blankoP01);

                        proccessToAddRincian(getId, currentUser.getKd_staf());

                    } else {
                        Toast.makeText(getActivity(), "Silahkan lengkapi data terlebih dahulu", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    blankoP01.setTgl_inspeksi(MethodUtil.formatDateString(tv_tgl_inspeksi.getText().toString(), "dd MMM yyyy", "yyyy-MM-dd"));
                    blankoP01.setTmt_saluran(tmtSaluranSelected);
                    if (!nmBangtrolSelected.equals("null")) blankoP01.setNm_bangtrol(nmBangtrolSelected);
                    if (!tmtBangtrolSelected.equals("null")) blankoP01.setTmt_bangtrol(tmtBangtrolSelected);
                    blankoP01.setPelaksana(pelaksanaSelected);
                    blankoP01.setUsulan_tindakan(etUsulanTindakan.getText().toString());
                    blankoP01.setAreal_layanan(Float.parseFloat(et_areal_pelayanan.getText().toString()));
                    blankoP01.setDesa_kecamatan(etDesaKecamatan.getText().toString());
                    blankoP01.setKoordl(Double.parseDouble(etLatitude.getText().toString()));
                    blankoP01.setKoordb(Double.parseDouble(etLongitude.getText().toString()));
                    blankoP01.setKd_saluran(kdSaluranSelected);
                    blankoP01.setFlag(false);
                    blankoP01.setTgledit(currentDateandTime);
                    LocalData.saveOrUpdate(blankoP01);

                    Toast.makeText(getContext(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    Objects.requireNonNull(getActivity()).startActivity(intent);
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        action = Objects.requireNonNull(getArguments()).getInt("action");
        daerahIrigasiSelected = getArguments().getString("daerahIrigasiSelected");
        kdIrigasiSelected = getArguments().getString("kdIrigasiSelected");
        kdSaluran = getArguments().getString("kdSaluran");
        tmtBangtrolSelected = getArguments().getString("tmtBangtrol");
        id_b01 = getArguments().getInt("id");
        kerusakanIsSaluran = getArguments().getBoolean("kerusakanIsSaluran", false);

        initComponent();

        populateData(action);
    }

    @SuppressLint("SetTextI18n")
    private void populateData(int action) {
        if (action == Constant.ACTION_EDIT) {
            try {
                queryFilters = new QueryFilters();
                queryFilters.add("id_b01", id_b01);
                blankoP01 = LocalData.get(queryFilters, BlankoP01.class);
                System.out.println(new Gson().toJson(blankoP01));
                tvDaerahIrigasi.setText("Daerah Irigasi: " + daerahIrigasiSelected);

                Saluran saluran;
                queryFilters = new QueryFilters();
                queryFilters.add("kd_saluran", blankoP01.getKd_saluran());
                saluran = LocalData.get(queryFilters, Saluran.class);
                tmtSaluranSelected = saluran.getTmt_saluran();
                kdSaluranSelected = saluran.getKd_saluran();

                setSpinText(spiner_saluran, saluran.getNm_saluran());
                if (kerusakanIsSaluran){
                    cbSaluran.setChecked(true);
                    cbBangunan.setChecked(false);
                    spinner_bangunan_kontrol.setEnabled(false);
                    nmBangtrolSelected = "null";
                    tmtBangtrolSelected = "null";
                } else {
                    cbBangunan.setChecked(true);
                    cbSaluran.setChecked(false);
                    spinner_bangunan_kontrol.setEnabled(true);
                    populateBangtrol(blankoP01.getKd_saluran());
                    setSpinText(spinner_bangunan_kontrol, blankoP01.getNm_bangtrol().substring(blankoP01.getKd_saluran().length()));
                    nmBangtrolSelected = blankoP01.getNm_bangtrol();
                    tmtBangtrolSelected = blankoP01.getTmt_bangtrol();
                }

                tv_tgl_inspeksi.setText(MethodUtil.formatDateString(blankoP01.getTgl_inspeksi(), "yyyy-MM-dd", "dd MMM yyyy"));
                if (blankoP01.getPelaksana().equals("S")){
                    cbSwakelola.setChecked(true);
                    cbKontraktual.setChecked(false);
                    pelaksanaSelected = "S";
                } else {
                    cbKontraktual.setChecked(true);
                    cbSwakelola.setChecked(false);
                    pelaksanaSelected = "K";
                }

                etUsulanTindakan.setText(blankoP01.getUsulan_tindakan());
                et_areal_pelayanan.setText(String.valueOf(Math.round(blankoP01.getAreal_layanan())));
                etLatitude.setText(String.valueOf(blankoP01.getKoordl()));
                etLongitude.setText(String.valueOf(blankoP01.getKoordb()));
                etDesaKecamatan.setText(blankoP01.getDesa_kecamatan());

            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            blankoP01 = new BlankoP01();
            blankoP01Detail = new BlankoP01Detail();
        }
    }

    private void setSpinText(MaterialSpinner spin, String text) {
        for (int i = 0; i < spin.getItems().size(); i++) {
            if (spin.getItems().get(i).toString().contains(text)) {
                spin.setSelectedIndex(i);
            }
        }
    }

    @SuppressLint("DefaultLocale")
    private void proccessToAddRincian(int id_b01, String kodeStaff) {
        List<String> jnsKeadaanList = new ArrayList<>();
        List<String> nmKeadaanList = new ArrayList<>();
        String[] tipeKerusakan = {"RR", "RS", "RB", "RT"};

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String currentDateandTime = sdf.format(new Date());

        showDialog();
        MaterialSpinner spinnerSaluran = dialog.findViewById(R.id.spiner_saluran);
        MaterialSpinner spinnerKerusakan = dialog.findViewById(R.id.spinner_kerusakan);
        FrameLayout btnFrameSimpan = dialog.findViewById(R.id.btn_frame_simpan);
        LinearLayout layoutRuas = dialog.findViewById(R.id.layoutRuas);
        EditText etDeskripsi = dialog.findViewById(R.id.et_deskripsi);
        EditText etJumlah = dialog.findViewById(R.id.et_jumlah);
        EditText etSatuan = dialog.findViewById(R.id.et_satuan);
        EditText etRuasAwalStart = dialog.findViewById(R.id.et_ruas_awal_start);
        EditText etRuasAwalEnd = dialog.findViewById(R.id.et_ruas_awal_end);
        EditText etRuasAkhirStart = dialog.findViewById(R.id.et_ruas_akhir_start);
        EditText etRuasAkhirEnd = dialog.findViewById(R.id.et_ruas_akhir_end);

        if (isBangunan) {
            layoutRuas.setVisibility(View.GONE);
        }

        queryFilters = new QueryFilters();
        List<JenisKeadaan> jenisKeadaanList = new ArrayList<>(LocalData.getList(queryFilters, JenisKeadaan.class));
        for (JenisKeadaan jenisKeadaan:jenisKeadaanList) {
            jnsKeadaanList.add(String.valueOf(jenisKeadaan.getJns_keadaan()));
            nmKeadaanList.add(jenisKeadaan.getNm_keadaan());
        }

        jnsKeadaanSelected = jnsKeadaanList.get(0);
        nmKeadaanSelected = nmKeadaanList.get(0);
        spinnerSaluran.setItems(nmKeadaanList);
        spinnerSaluran.setOnItemSelectedListener((view, position, id, item) -> {
            jnsKeadaanSelected = jnsKeadaanList.get(position);
            nmKeadaanSelected = nmKeadaanList.get(position);
        });

        tipeKerusakanSelected = tipeKerusakan[0];
        spinnerKerusakan.setItems(tipeKerusakan);
        spinnerKerusakan.setOnItemSelectedListener((view, position, id, item) -> tipeKerusakanSelected = item.toString());

        btnFrameSimpan.setOnClickListener(view -> {
            dialog.dismiss();
            blankoP01Detail.setId(UUID.randomUUID().toString());
            blankoP01Detail.setId_b01(id_b01);
            blankoP01Detail.setCbya("true");
            blankoP01Detail.setJns_keadaan(jnsKeadaanSelected);
            blankoP01Detail.setNm_keadaan(nmKeadaanSelected);
            blankoP01Detail.setDeskripsi(etDeskripsi.getText().toString());
            blankoP01Detail.setJumlah(Float.parseFloat(etJumlah.getText().toString()));
            blankoP01Detail.setKerusakan(tipeKerusakanSelected);
            blankoP01Detail.setSatuan(etSatuan.getText().toString());
            blankoP01Detail.setRuas_aw(Integer.parseInt(Integer.parseInt(String.format("%02d", Integer.parseInt(etRuasAwalStart.getText().toString().equals("")?"0":etRuasAwalStart.getText().toString())))+String.format("%02d", Integer.parseInt(etRuasAwalEnd.getText().toString().equals("")?"0":etRuasAwalEnd.getText().toString()))));
            blankoP01Detail.setRuas_ak(Integer.parseInt(Integer.parseInt(String.format("%02d", Integer.parseInt(etRuasAkhirStart.getText().toString().equals("")?"0":etRuasAkhirStart.getText().toString())))+String.format("%02d", Integer.parseInt(etRuasAkhirEnd.getText().toString().equals("")?"0":etRuasAkhirEnd.getText().toString()))));
            blankoP01Detail.setPk_waktu(currentDateandTime);
            blankoP01Detail.setTgledit_detil(currentDateandTime);
            blankoP01Detail.setTgl_inspeksi(tglInspeksiSelected);
            blankoP01Detail.setTmt_saluran(tmtSaluranSelected);
            if (!nmBangtrolSelected.equals("null")) blankoP01Detail.setNm_bangtrol(nmBangtrolSelected);
            if (!tmtBangtrolSelected.equals("null")) blankoP01Detail.setTmt_bangtrol(tmtBangtrolSelected);
            blankoP01Detail.setKd_staf(kodeStaff);
            blankoP01Detail.setPelaksana(pelaksanaSelected);
            blankoP01Detail.setUsulan_tindakan(etUsulanTindakan.getText().toString());
            blankoP01Detail.setAreal_layanan(et_areal_pelayanan.getText().toString());
            blankoP01Detail.setDesa_kecamatan(etDesaKecamatan.getText().toString());
            blankoP01Detail.setKoordl(Double.parseDouble(etLatitude.getText().toString()));
            blankoP01Detail.setKoordb(Double.parseDouble(etLongitude.getText().toString()));
            blankoP01Detail.setKd_saluran(kdSaluranSelected);
            blankoP01Detail.setTgledit(currentDateandTime);
            blankoP01Detail.setTglrekam(currentDateandTime);
            blankoP01Detail.setFlag(false);
            LocalData.saveOrUpdate(blankoP01Detail);

            Toast.makeText(getContext(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            Objects.requireNonNull(getActivity()).startActivity(intent);
        });
    }

    @SuppressLint("SetTextI18n")
    private void initComponent() {
        onClickCbSaluran();
        onClickcbSwakelola();
        saluranList = new ArrayList<>();
        saluranDetailList = new ArrayList<>();
        List<String> saluranItem = new ArrayList<>();
        List<String> kdSaluranItem = new ArrayList<>();
        List<String> tmtSaluranItem = new ArrayList<>();
        saluranItem.add("-- Pilih Saluran --");
        kdSaluranItem.add("null");
        tmtSaluranItem.add("null");

        tvDaerahIrigasi.setText("Daerah Irigasi: " + daerahIrigasiSelected);

        queryFilters = new QueryFilters();
        queryFilters.add("kd_di", kdIrigasiSelected);
        saluranList.addAll(LocalData.getList(queryFilters, Saluran.class, "kd_saluran", Sort.DESCENDING));
        for (Saluran saluran: saluranList){
            saluranItem.add(saluran.getNm_saluran());
            kdSaluranItem.add(saluran.getKd_saluran());
            tmtSaluranItem.add(saluran.getTmt_saluran());
        }

        kdSaluranSelected = kdSaluranItem.size()>0?kdSaluranItem.get(0):"";
        tmtSaluranSelected = tmtSaluranItem.size()>0?tmtSaluranItem.get(0):"";
        spiner_saluran.setItems(saluranItem);
        spiner_saluran.setOnItemSelectedListener((view, position, id, item) -> {
            kdSaluranSelected = kdSaluranItem.get(position);
            tmtSaluranSelected = tmtSaluranItem.get(position);
            populateBangtrol(kdSaluranSelected);
        });

        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String date = sdf.format(new Date());
        tv_tgl_inspeksi.setText(date);
        tglInspeksiSelected = MethodUtil.formatDateString(date, "dd MMM yyyy", "yyyy-MM-dd");

        populateBangtrol(kdSaluranSelected);
    }

    private void populateBangtrol(String kdSaluranSelected){
        List<String> bangtrolList = new ArrayList<>();
        List<String> nmBangtrolList = new ArrayList<>();
        List<String> tmtBangtrolList = new ArrayList<>();

        bangtrolList.add("-- Pilih Bangunan Kontrol --");
        nmBangtrolList.add("null");
        tmtBangtrolList.add("null");

        queryFilters = new QueryFilters();
        queryFilters.add("kd_saluran", kdSaluranSelected);
        saluranDetailList.addAll(LocalData.getList(queryFilters, SaluranDetail.class, "kd_saluran", Sort.DESCENDING));
        for (SaluranDetail saluranDetail: saluranDetailList){
            String nmBangtrol = saluranDetail.getNm_bangtrol().substring(kdSaluranSelected.length());
            bangtrolList.add(nmBangtrol);
            nmBangtrolList.add(saluranDetail.getNm_bangtrol());
            tmtBangtrolList.add(saluranDetail.getTmt_bangtrol());
        }
        nmBangtrolSelected = nmBangtrolList.get(0);
        tmtBangtrolSelected = tmtBangtrolList.get(0);
        spinner_bangunan_kontrol.setItems(bangtrolList);
        spinner_bangunan_kontrol.setOnItemSelectedListener((view, position, id, item) -> {
            nmBangtrolSelected = nmBangtrolList.get(position);
            tmtBangtrolSelected = tmtBangtrolList.get(position);
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == LAUNCH_SECOND_ACTIVITY) {
            if(resultCode == Activity.RESULT_OK){
                Bundle bundle = data.getBundleExtra("bundle");
                assert bundle != null;
                Double latitude = Objects.requireNonNull(bundle.getDouble("latitude"));
                Double longitude = Objects.requireNonNull(bundle.getDouble("longitude"));

                etLatitude.setText(String.valueOf(latitude));
                etLongitude.setText(String.valueOf(longitude));
            }
        }
    }

    private void showDialog() {
        dialog = new Dialog(Objects.requireNonNull(getContext()));
        dialog.setContentView(R.layout.dialog_add_rincian_blanko1p);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(Objects.requireNonNull(dialog.getWindow()).getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }
}
