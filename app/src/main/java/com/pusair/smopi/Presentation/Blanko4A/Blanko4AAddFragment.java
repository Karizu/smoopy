package com.pusair.smopi.Presentation.Blanko4A;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.pusair.smopi.Model.Blanko04Bangtrol;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.pusair.smopi.Utils.Constant;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.localdata.LocalDataNotFoundException;
import com.rezkyatinnov.kyandroid.localdata.QueryFilters;
import com.rezkyatinnov.kyandroid.session.Session;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Sort;

public class Blanko4AAddFragment extends Fragment {

    @BindView(R.id.layoutAdditional)
    LinearLayout layoutAdditional;
    @BindView(R.id.layoutAdditional2)
    LinearLayout layoutAdditional2;
    @BindView(R.id.layoutAdditional3)
    LinearLayout layoutAdditional3;
    @BindView(R.id.layoutAdditional4)
    LinearLayout layoutAdditional4;
    @BindView(R.id.layoutAdditional5)
    LinearLayout layoutAdditional5;
    @BindView(R.id.layoutAdditional6)
    LinearLayout layoutAdditional6;
    @BindView(R.id.layoutAdditional7)
    LinearLayout layoutAdditional7;
    @BindView(R.id.layoutAdditional8)
    LinearLayout layoutAdditional8;

    @BindView(R.id.layoutPengolahan5)
    LinearLayout layoutPengolahan5;
    @BindView(R.id.tvPengolahanTitle1)
    TextView tvPengolahanTitle1;
    @BindView(R.id.tvPengolahanTitle2)
    TextView tvPengolahanTitle2;
    @BindView(R.id.tvPengolahanTitle3)
    TextView tvPengolahanTitle3;
    @BindView(R.id.tvPengolahanTitle4)
    TextView tvPengolahanTitle4;
    @BindView(R.id.tvPengolahanTitle5)
    TextView tvPengolahanTitle5;

    @BindView(R.id.tvPengolahanTitleAdd5)
    TextView tvPengolahanTitleAdd5;
    @BindView(R.id.tvPengolahanTitleAdd6)
    TextView tvPengolahanTitleAdd6;
    @BindView(R.id.tvPengolahanTitleAdd7)
    TextView tvPengolahanTitleAdd7;
    @BindView(R.id.tvPengolahanTitleAdd8)
    TextView tvPengolahanTitleAdd8;
    @BindView(R.id.tvPengolahanTitleAdd9)
    TextView tvPengolahanTitleAdd9;
    @BindView(R.id.tvPengolahanTitleAdd10)
    TextView tvPengolahanTitleAdd10;
    @BindView(R.id.tvPengolahanTitleAdd11)
    TextView tvPengolahanTitleAdd11;
    @BindView(R.id.tvPengolahanTitleAdd12)
    TextView tvPengolahanTitleAdd12;
    @BindView(R.id.tvPengolahanTitleAdd13)
    TextView tvPengolahanTitleAdd13;
    @BindView(R.id.tvPengolahanTitleAdd14)
    TextView tvPengolahanTitleAdd14;
    @BindView(R.id.tvPengolahanTitleAdd15)
    TextView tvPengolahanTitleAdd15;
    @BindView(R.id.tvPengolahanTitleAdd16)
    TextView tvPengolahanTitleAdd16;

    @BindView(R.id.layoutPertumbuhan5)
    LinearLayout layoutPertumbuhan5;
    @BindView(R.id.tvPertumbuhanTitle1)
    TextView tvPertumbuhanTitle1;
    @BindView(R.id.tvPertumbuhanTitle2)
    TextView tvPertumbuhanTitle2;
    @BindView(R.id.tvPertumbuhanTitle3)
    TextView tvPertumbuhanTitle3;
    @BindView(R.id.tvPertumbuhanTitle4)
    TextView tvPertumbuhanTitle4;
    @BindView(R.id.tvPertumbuhanTitle5)
    TextView tvPertumbuhanTitle5;

    @BindView(R.id.tvPertumbuhanTitleAdd5)
    TextView tvPertumbuhanTitleAdd5;
    @BindView(R.id.tvPertumbuhanTitleAdd6)
    TextView tvPertumbuhanTitleAdd6;
    @BindView(R.id.tvPertumbuhanTitleAdd7)
    TextView tvPertumbuhanTitleAdd7;
    @BindView(R.id.tvPertumbuhanTitleAdd8)
    TextView tvPertumbuhanTitleAdd8;
    @BindView(R.id.tvPertumbuhanTitleAdd9)
    TextView tvPertumbuhanTitleAdd9;
    @BindView(R.id.tvPertumbuhanTitleAdd10)
    TextView tvPertumbuhanTitleAdd10;
    @BindView(R.id.tvPertumbuhanTitleAdd11)
    TextView tvPertumbuhanTitleAdd11;
    @BindView(R.id.tvPertumbuhanTitleAdd12)
    TextView tvPertumbuhanTitleAdd12;
    @BindView(R.id.tvPertumbuhanTitleAdd13)
    TextView tvPertumbuhanTitleAdd13;
    @BindView(R.id.tvPertumbuhanTitleAdd14)
    TextView tvPertumbuhanTitleAdd14;
    @BindView(R.id.tvPertumbuhanTitleAdd15)
    TextView tvPertumbuhanTitleAdd15;
    @BindView(R.id.tvPertumbuhanTitleAdd16)
    TextView tvPertumbuhanTitleAdd16;

    @BindView(R.id.layoutPanen5)
    LinearLayout layoutPanen5;
    @BindView(R.id.tvPaneneTitle1)
    TextView tvPaneneTitle1;
    @BindView(R.id.tvPaneneTitle2)
    TextView tvPaneneTitle2;
    @BindView(R.id.tvPaneneTitle3)
    TextView tvPaneneTitle3;
    @BindView(R.id.tvPaneneTitle4)
    TextView tvPaneneTitle4;
    @BindView(R.id.tvPaneneTitle5)
    TextView tvPaneneTitle5;


    @BindView(R.id.tvPaneneTitleAdd5)
    TextView tvPaneneTitleAdd5;
    @BindView(R.id.tvPaneneTitleAdd6)
    TextView tvPaneneTitleAdd6;
    @BindView(R.id.tvPaneneTitleAdd7)
    TextView tvPaneneTitleAdd7;
    @BindView(R.id.tvPaneneTitleAdd8)
    TextView tvPaneneTitleAdd8;
    @BindView(R.id.tvPaneneTitleAdd9)
    TextView tvPaneneTitleAdd9;
    @BindView(R.id.tvPaneneTitleAdd10)
    TextView tvPaneneTitleAdd10;
    @BindView(R.id.tvPaneneTitleAdd11)
    TextView tvPaneneTitleAdd11;
    @BindView(R.id.tvPaneneTitleAdd12)
    TextView tvPaneneTitleAdd12;
    @BindView(R.id.tvPaneneTitleAdd13)
    TextView tvPaneneTitleAdd13;
    @BindView(R.id.tvPaneneTitleAdd14)
    TextView tvPaneneTitleAdd14;
    @BindView(R.id.tvPaneneTitleAdd15)
    TextView tvPaneneTitleAdd15;
    @BindView(R.id.tvPaneneTitleAdd16)
    TextView tvPaneneTitleAdd16;

    @BindView(R.id.etPtpSm1)
    EditText etPadiOlahTanahSm1;
    @BindView(R.id.etPtpSm2)
    EditText etPadiOlahTanahSm2;
    @BindView(R.id.etPtpSm3)
    EditText etPadiOlahTanahSm3;
    @BindView(R.id.etPtpSm4)
    EditText etPadiOlahTanahSm4;
    @BindView(R.id.etPtpSm5)
    EditText etPadiOlahTanahSm5;

    @BindView(R.id.etPtpSmAdd5)
    EditText etPadiOlahTanahSmAdd5;
    @BindView(R.id.etPtpSmAdd6)
    EditText etPadiOlahTanahSmAdd6;
    @BindView(R.id.etPtpSmAdd7)
    EditText etPadiOlahTanahSmAdd7;
    @BindView(R.id.etPtpSmAdd8)
    EditText etPadiOlahTanahSmAdd8;
    @BindView(R.id.etPtpSmAdd9)
    EditText etPadiOlahTanahSmAdd9;
    @BindView(R.id.etPtpSmAdd10)
    EditText etPadiOlahTanahSmAdd10;
    @BindView(R.id.etPtpSmAdd11)
    EditText etPadiOlahTanahSmAdd11;
    @BindView(R.id.etPtpSmAdd12)
    EditText etPadiOlahTanahSmAdd12;
    @BindView(R.id.etPtpSmAdd13)
    EditText etPadiOlahTanahSmAdd13;
    @BindView(R.id.etPtpSmAdd14)
    EditText etPadiOlahTanahSmAdd14;
    @BindView(R.id.etPtpSmAdd15)
    EditText etPadiOlahTanahSmAdd15;
    @BindView(R.id.etPtpSmAdd16)
    EditText etPadiOlahTanahSmAdd16;

    @BindView(R.id.etPertSm1)
    EditText etPadiTumbuhSm1;
    @BindView(R.id.etPertSm2)
    EditText etPadiTumbuhSm2;
    @BindView(R.id.etPertSm3)
    EditText etPadiTumbuhSm3;
    @BindView(R.id.etPertSm4)
    EditText etPadiTumbuhSm4;
    @BindView(R.id.etPertSm5)
    EditText etPadiTumbuhSm5;

    @BindView(R.id.etPertSmAdd5)
    EditText etPadiTumbuhSmAdd5;
    @BindView(R.id.etPertSmAdd6)
    EditText etPadiTumbuhSmAdd6;
    @BindView(R.id.etPertSmAdd7)
    EditText etPadiTumbuhSmAdd7;
    @BindView(R.id.etPertSmAdd8)
    EditText etPadiTumbuhSmAdd8;
    @BindView(R.id.etPertSmAdd9)
    EditText etPadiTumbuhSmAdd9;
    @BindView(R.id.etPertSmAdd10)
    EditText etPadiTumbuhSmAdd10;
    @BindView(R.id.etPertSmAdd11)
    EditText etPadiTumbuhSmAdd11;
    @BindView(R.id.etPertSmAdd12)
    EditText etPadiTumbuhSmAdd12;
    @BindView(R.id.etPertSmAdd13)
    EditText etPadiTumbuhSmAdd13;
    @BindView(R.id.etPertSmAdd14)
    EditText etPadiTumbuhSmAdd14;
    @BindView(R.id.etPertSmAdd15)
    EditText etPadiTumbuhSmAdd15;
    @BindView(R.id.etPertSmAdd16)
    EditText etPadiTumbuhSmAdd16;

    @BindView(R.id.etPanSm1)
    EditText etPadiPanenSm1;
    @BindView(R.id.etPanSm2)
    EditText etPadiPanenSm2;
    @BindView(R.id.etPanSm3)
    EditText etPadiPanenSm3;
    @BindView(R.id.etPanSm4)
    EditText etPadiPanenSm4;
    @BindView(R.id.etPanSm5)
    EditText etPadiPanenSm5;

    @BindView(R.id.etPanSmAdd5)
    EditText etPadiPanenSmAdd5;
    @BindView(R.id.etPanSmAdd6)
    EditText etPadiPanenSmAdd6;
    @BindView(R.id.etPanSmAdd7)
    EditText etPadiPanenSmAdd7;
    @BindView(R.id.etPanSmAdd8)
    EditText etPadiPanenSmAdd8;
    @BindView(R.id.etPanSmAdd9)
    EditText etPadiPanenSmAdd9;
    @BindView(R.id.etPanSmAdd10)
    EditText etPadiPanenSmAdd10;
    @BindView(R.id.etPanSmAdd11)
    EditText etPadiPanenSmAdd11;
    @BindView(R.id.etPanSmAdd12)
    EditText etPadiPanenSmAdd12;
    @BindView(R.id.etPanSmAdd13)
    EditText etPadiPanenSmAdd13;
    @BindView(R.id.etPanSmAdd14)
    EditText etPadiPanenSmAdd14;
    @BindView(R.id.etPanSmAdd15)
    EditText etPadiPanenSmAdd15;
    @BindView(R.id.etPanSmAdd16)
    EditText etPadiPanenSmAdd16;

    @BindView(R.id.layoutPengolahanTebu5)
    LinearLayout layoutPengolahanTebu5;
    @BindView(R.id.tvPengolahanTebuTitle1)
    TextView tvPengolahanTebuTitle1;
    @BindView(R.id.tvPengolahanTebuTitle2)
    TextView tvPengolahanTebuTitle2;
    @BindView(R.id.tvPengolahanTebuTitle3)
    TextView tvPengolahanTebuTitle3;
    @BindView(R.id.tvPengolahanTebuTitle4)
    TextView tvPengolahanTebuTitle4;
    @BindView(R.id.tvPengolahanTebuTitle5)
    TextView tvPengolahanTebuTitle5;

    @BindView(R.id.tvPengolahanTebuTitleAdd5)
    TextView tvPengolahanTebuTitleAdd5;
    @BindView(R.id.tvPengolahanTebuTitleAdd6)
    TextView tvPengolahanTebuTitleAdd6;
    @BindView(R.id.tvPengolahanTebuTitleAdd7)
    TextView tvPengolahanTebuTitleAdd7;
    @BindView(R.id.tvPengolahanTebuTitleAdd8)
    TextView tvPengolahanTebuTitleAdd8;
    @BindView(R.id.tvPengolahanTebuTitleAdd9)
    TextView tvPengolahanTebuTitleAdd9;
    @BindView(R.id.tvPengolahanTebuTitleAdd10)
    TextView tvPengolahanTebuTitleAdd10;
    @BindView(R.id.tvPengolahanTebuTitleAdd11)
    TextView tvPengolahanTebuTitleAdd11;
    @BindView(R.id.tvPengolahanTebuTitleAdd12)
    TextView tvPengolahanTebuTitleAdd12;
    @BindView(R.id.tvPengolahanTebuTitleAdd13)
    TextView tvPengolahanTebuTitleAdd13;
    @BindView(R.id.tvPengolahanTebuTitleAdd14)
    TextView tvPengolahanTebuTitleAdd14;
    @BindView(R.id.tvPengolahanTebuTitleAdd15)
    TextView tvPengolahanTebuTitleAdd15;
    @BindView(R.id.tvPengolahanTebuTitleAdd16)
    TextView tvPengolahanTebuTitleAdd16;

    @BindView(R.id.layoutTebuMuda5)
    LinearLayout layoutTebuMuda5;
    @BindView(R.id.tvTebuMudaTitle1)
    TextView tvTebuMudaTitle1;
    @BindView(R.id.tvTebuMudaTitle2)
    TextView tvTebuMudaTitle2;
    @BindView(R.id.tvTebuMudaTitle3)
    TextView tvTebuMudaTitle3;
    @BindView(R.id.tvTebuMudaTitle4)
    TextView tvTebuMudaTitle4;
    @BindView(R.id.tvTebuMudaTitle5)
    TextView tvTebuMudaTitle5;

    @BindView(R.id.tvTebuMudaTitleAdd5)
    TextView tvTebuMudaTitleAdd5;
    @BindView(R.id.tvTebuMudaTitleAdd6)
    TextView tvTebuMudaTitleAdd6;
    @BindView(R.id.tvTebuMudaTitleAdd7)
    TextView tvTebuMudaTitleAdd7;
    @BindView(R.id.tvTebuMudaTitleAdd8)
    TextView tvTebuMudaTitleAdd8;
    @BindView(R.id.tvTebuMudaTitleAdd9)
    TextView tvTebuMudaTitleAdd9;
    @BindView(R.id.tvTebuMudaTitleAdd10)
    TextView tvTebuMudaTitleAdd10;
    @BindView(R.id.tvTebuMudaTitleAdd11)
    TextView tvTebuMudaTitleAdd11;
    @BindView(R.id.tvTebuMudaTitleAdd12)
    TextView tvTebuMudaTitleAdd12;
    @BindView(R.id.tvTebuMudaTitleAdd13)
    TextView tvTebuMudaTitleAdd13;
    @BindView(R.id.tvTebuMudaTitleAdd14)
    TextView tvTebuMudaTitleAdd14;
    @BindView(R.id.tvTebuMudaTitleAdd15)
    TextView tvTebuMudaTitleAdd15;
    @BindView(R.id.tvTebuMudaTitleAdd16)
    TextView tvTebuMudaTitleAdd16;

    @BindView(R.id.layoutPalawijaya5)
    LinearLayout layoutPalawijaya5;
    @BindView(R.id.tvPalawijayaTitle1)
    TextView tvPalawijayaTitle1;
    @BindView(R.id.tvPalawijayaTitle2)
    TextView tvPalawijayaTitle2;
    @BindView(R.id.tvPalawijayaTitle3)
    TextView tvPalawijayaTitle3;
    @BindView(R.id.tvPalawijayaTitle4)
    TextView tvPalawijayaTitle4;
    @BindView(R.id.tvPalawijayaTitle5)
    TextView tvPalawijayaTitle5;

    @BindView(R.id.tvPalawijayaTitleAdd5)
    TextView tvPalawijayaTitleAdd5;
    @BindView(R.id.tvPalawijayaTitleAdd6)
    TextView tvPalawijayaTitleAdd6;
    @BindView(R.id.tvPalawijayaTitleAdd7)
    TextView tvPalawijayaTitleAdd7;
    @BindView(R.id.tvPalawijayaTitleAdd8)
    TextView tvPalawijayaTitleAdd8;
    @BindView(R.id.tvPalawijayaTitleAdd9)
    TextView tvPalawijayaTitleAdd9;
    @BindView(R.id.tvPalawijayaTitleAdd10)
    TextView tvPalawijayaTitleAdd10;
    @BindView(R.id.tvPalawijayaTitleAdd11)
    TextView tvPalawijayaTitleAdd11;
    @BindView(R.id.tvPalawijayaTitleAdd12)
    TextView tvPalawijayaTitleAdd12;
    @BindView(R.id.tvPalawijayaTitleAdd13)
    TextView tvPalawijayaTitleAdd13;
    @BindView(R.id.tvPalawijayaTitleAdd14)
    TextView tvPalawijayaTitleAdd14;
    @BindView(R.id.tvPalawijayaTitleAdd15)
    TextView tvPalawijayaTitleAdd15;
    @BindView(R.id.tvPalawijayaTitleAdd16)
    TextView tvPalawijayaTitleAdd16;

    @BindView(R.id.etTebuPtpSm1)
    EditText etTebuOlahTanahSm1;
    @BindView(R.id.etTebuPtpSm2)
    EditText etTebuOlahTanahSm2;
    @BindView(R.id.etTebuPtpSm3)
    EditText etTebuOlahTanahSm3;
    @BindView(R.id.etTebuPtpSm4)
    EditText etTebuOlahTanahSm4;
    @BindView(R.id.etTebuPtpSm5)
    EditText etTebuOlahTanahSm5;

    @BindView(R.id.etTebuPtpSmAdd5)
    EditText etTebuOlahTanahSmAdd5;
    @BindView(R.id.etTebuPtpSmAdd6)
    EditText etTebuOlahTanahSmAdd6;
    @BindView(R.id.etTebuPtpSmAdd7)
    EditText etTebuOlahTanahSmAdd7;
    @BindView(R.id.etTebuPtpSmAdd8)
    EditText etTebuOlahTanahSmAdd8;
    @BindView(R.id.etTebuPtpSmAdd9)
    EditText etTebuOlahTanahSmAdd9;
    @BindView(R.id.etTebuPtpSmAdd10)
    EditText etTebuOlahTanahSmAdd10;
    @BindView(R.id.etTebuPtpSmAdd11)
    EditText etTebuOlahTanahSmAdd11;
    @BindView(R.id.etTebuPtpSmAdd12)
    EditText etTebuOlahTanahSmAdd12;
    @BindView(R.id.etTebuPtpSmAdd13)
    EditText etTebuOlahTanahSmAdd13;
    @BindView(R.id.etTebuPtpSmAdd14)
    EditText etTebuOlahTanahSmAdd14;
    @BindView(R.id.etTebuPtpSmAdd15)
    EditText etTebuOlahTanahSmAdd15;
    @BindView(R.id.etTebuPtpSmAdd16)
    EditText etTebuOlahTanahSmAdd16;

    @BindView(R.id.etTebuMudaSm1)
    EditText etTebuMudaSm1;
    @BindView(R.id.etTebuMudaSm2)
    EditText etTebuMudaSm2;
    @BindView(R.id.etTebuMudaSm3)
    EditText etTebuMudaSm3;
    @BindView(R.id.etTebuMudaSm4)
    EditText etTebuMudaSm4;
    @BindView(R.id.etTebuMudaSm5)
    EditText etTebuMudaSm5;

    @BindView(R.id.etTebuMudaSmAdd5)
    EditText etTebuMudaSmAdd5;
    @BindView(R.id.etTebuMudaSmAdd6)
    EditText etTebuMudaSmAdd6;
    @BindView(R.id.etTebuMudaSmAdd7)
    EditText etTebuMudaSmAdd7;
    @BindView(R.id.etTebuMudaSmAdd8)
    EditText etTebuMudaSmAdd8;
    @BindView(R.id.etTebuMudaSmAdd9)
    EditText etTebuMudaSmAdd9;
    @BindView(R.id.etTebuMudaSmAdd10)
    EditText etTebuMudaSmAdd10;
    @BindView(R.id.etTebuMudaSmAdd11)
    EditText etTebuMudaSmAdd11;
    @BindView(R.id.etTebuMudaSmAdd12)
    EditText etTebuMudaSmAdd12;
    @BindView(R.id.etTebuMudaSmAdd13)
    EditText etTebuMudaSmAdd13;
    @BindView(R.id.etTebuMudaSmAdd14)
    EditText etTebuMudaSmAdd14;
    @BindView(R.id.etTebuMudaSmAdd15)
    EditText etTebuMudaSmAdd15;
    @BindView(R.id.etTebuMudaSmAdd16)
    EditText etTebuMudaSmAdd16;

    @BindView(R.id.etPalaSm1)
    EditText etTebuTuaSm1;
    @BindView(R.id.etPalaSm2)
    EditText etTebuTuaSm2;
    @BindView(R.id.etPalaSm3)
    EditText etTebuTuaSm3;
    @BindView(R.id.etPalaSm4)
    EditText etTebuTuaSm4;
    @BindView(R.id.etPalaSm5)
    EditText etTebuTuaSm5;

    @BindView(R.id.etPalaSmAdd5)
    EditText etTebuTuaSmAdd5;
    @BindView(R.id.etPalaSmAdd6)
    EditText etTebuTuaSmAdd6;
    @BindView(R.id.etPalaSmAdd7)
    EditText etTebuTuaSmAdd7;
    @BindView(R.id.etPalaSmAdd8)
    EditText etTebuTuaSmAdd8;
    @BindView(R.id.etPalaSmAdd9)
    EditText etTebuTuaSmAdd9;
    @BindView(R.id.etPalaSmAdd10)
    EditText etTebuTuaSmAdd10;
    @BindView(R.id.etPalaSmAdd11)
    EditText etTebuTuaSmAdd11;
    @BindView(R.id.etPalaSmAdd12)
    EditText etTebuTuaSmAdd12;
    @BindView(R.id.etPalaSmAdd13)
    EditText etTebuTuaSmAdd13;
    @BindView(R.id.etPalaSmAdd14)
    EditText etTebuTuaSmAdd14;
    @BindView(R.id.etPalaSmAdd15)
    EditText etTebuTuaSmAdd15;
    @BindView(R.id.etPalaSmAdd16)
    EditText etTebuTuaSmAdd16;

    @BindView(R.id.layoutBanyakAir5)
    LinearLayout layoutBanyakAir5;
    @BindView(R.id.tvBanyakAirTitle1)
    TextView tvBanyakAirTitle1;
    @BindView(R.id.tvBanyakAirTitle2)
    TextView tvBanyakAirTitle2;
    @BindView(R.id.tvBanyakAirTitle3)
    TextView tvBanyakAirTitle3;
    @BindView(R.id.tvBanyakAirTitle4)
    TextView tvBanyakAirTitle4;
    @BindView(R.id.tvBanyakAirTitle5)
    TextView tvBanyakAirTitle5;

    @BindView(R.id.tvBanyakAirTitleAdd5)
    TextView tvBanyakAirTitleAdd5;
    @BindView(R.id.tvBanyakAirTitleAdd6)
    TextView tvBanyakAirTitleAdd6;
    @BindView(R.id.tvBanyakAirTitleAdd7)
    TextView tvBanyakAirTitleAdd7;
    @BindView(R.id.tvBanyakAirTitleAdd8)
    TextView tvBanyakAirTitleAdd8;
    @BindView(R.id.tvBanyakAirTitleAdd9)
    TextView tvBanyakAirTitleAdd9;
    @BindView(R.id.tvBanyakAirTitleAdd10)
    TextView tvBanyakAirTitleAdd10;
    @BindView(R.id.tvBanyakAirTitleAdd11)
    TextView tvBanyakAirTitleAdd11;
    @BindView(R.id.tvBanyakAirTitleAdd12)
    TextView tvBanyakAirTitleAdd12;
    @BindView(R.id.tvBanyakAirTitleAdd13)
    TextView tvBanyakAirTitleAdd13;
    @BindView(R.id.tvBanyakAirTitleAdd14)
    TextView tvBanyakAirTitleAdd14;
    @BindView(R.id.tvBanyakAirTitleAdd15)
    TextView tvBanyakAirTitleAdd15;
    @BindView(R.id.tvBanyakAirTitleAdd16)
    TextView tvBanyakAirTitleAdd16;

    @BindView(R.id.layoutSedikitAir5)
    LinearLayout layoutSedikitAir5;
    @BindView(R.id.tvSedikitAirTitle1)
    TextView tvSedikitAirTitle1;
    @BindView(R.id.tvSedikitAirTitle2)
    TextView tvSedikitAirTitle2;
    @BindView(R.id.tvSedikitAirTitle3)
    TextView tvSedikitAirTitle3;
    @BindView(R.id.tvSedikitAirTitle4)
    TextView tvSedikitAirTitle4;
    @BindView(R.id.tvSedikitAirTitle5)
    TextView tvSedikitAirTitle5;

    @BindView(R.id.tvSedikitAirTitleAdd5)
    TextView tvSedikitAirTitleAdd5;
    @BindView(R.id.tvSedikitAirTitleAdd6)
    TextView tvSedikitAirTitleAdd6;
    @BindView(R.id.tvSedikitAirTitleAdd7)
    TextView tvSedikitAirTitleAdd7;
    @BindView(R.id.tvSedikitAirTitleAdd8)
    TextView tvSedikitAirTitleAdd8;
    @BindView(R.id.tvSedikitAirTitleAdd9)
    TextView tvSedikitAirTitleAdd9;
    @BindView(R.id.tvSedikitAirTitleAdd10)
    TextView tvSedikitAirTitleAdd10;
    @BindView(R.id.tvSedikitAirTitleAdd11)
    TextView tvSedikitAirTitleAdd11;
    @BindView(R.id.tvSedikitAirTitleAdd12)
    TextView tvSedikitAirTitleAdd12;
    @BindView(R.id.tvSedikitAirTitleAdd13)
    TextView tvSedikitAirTitleAdd13;
    @BindView(R.id.tvSedikitAirTitleAdd14)
    TextView tvSedikitAirTitleAdd14;
    @BindView(R.id.tvSedikitAirTitleAdd15)
    TextView tvSedikitAirTitleAdd15;
    @BindView(R.id.tvSedikitAirTitleAdd16)
    TextView tvSedikitAirTitleAdd16;

    @BindView(R.id.etBanyakAirSm1)
    EditText etBanyakAirSm1;
    @BindView(R.id.etBanyakAirSm2)
    EditText etBanyakAirSm2;
    @BindView(R.id.etBanyakAirSm3)
    EditText etBanyakAirSm3;
    @BindView(R.id.etBanyakAirSm4)
    EditText etBanyakAirSm4;
    @BindView(R.id.etBanyakAirSm5)
    EditText etBanyakAirSm5;

    @BindView(R.id.etBanyakAirSmAdd5)
    EditText etBanyakAirSmAdd5;
    @BindView(R.id.etBanyakAirSmAdd6)
    EditText etBanyakAirSmAdd6;
    @BindView(R.id.etBanyakAirSmAdd7)
    EditText etBanyakAirSmAdd7;
    @BindView(R.id.etBanyakAirSmAdd8)
    EditText etBanyakAirSmAdd8;
    @BindView(R.id.etBanyakAirSmAdd9)
    EditText etBanyakAirSmAdd9;
    @BindView(R.id.etBanyakAirSmAdd10)
    EditText etBanyakAirSmAdd10;
    @BindView(R.id.etBanyakAirSmAdd11)
    EditText etBanyakAirSmAdd11;
    @BindView(R.id.etBanyakAirSmAdd12)
    EditText etBanyakAirSmAdd12;
    @BindView(R.id.etBanyakAirSmAdd13)
    EditText etBanyakAirSmAdd13;
    @BindView(R.id.etBanyakAirSmAdd14)
    EditText etBanyakAirSmAdd14;
    @BindView(R.id.etBanyakAirSmAdd15)
    EditText etBanyakAirSmAdd15;
    @BindView(R.id.etBanyakAirSmAdd16)
    EditText etBanyakAirSmAdd16;

    @BindView(R.id.etSedikitAirSm1)
    EditText etSedikitAirSm1;
    @BindView(R.id.etSedikitAirSm2)
    EditText etSedikitAirSm2;
    @BindView(R.id.etSedikitAirSm3)
    EditText etSedikitAirSm3;
    @BindView(R.id.etSedikitAirSm4)
    EditText etSedikitAirSm4;
    @BindView(R.id.etSedikitAirSm5)
    EditText etSedikitAirSm5;

    @BindView(R.id.etSedikitAirSmAdd5)
    EditText etSedikitAirSmAdd5;
    @BindView(R.id.etSedikitAirSmAdd6)
    EditText etSedikitAirSmAdd6;
    @BindView(R.id.etSedikitAirSmAdd7)
    EditText etSedikitAirSmAdd7;
    @BindView(R.id.etSedikitAirSmAdd8)
    EditText etSedikitAirSmAdd8;
    @BindView(R.id.etSedikitAirSmAdd9)
    EditText etSedikitAirSmAdd9;
    @BindView(R.id.etSedikitAirSmAdd10)
    EditText etSedikitAirSmAdd10;
    @BindView(R.id.etSedikitAirSmAdd11)
    EditText etSedikitAirSmAdd11;
    @BindView(R.id.etSedikitAirSmAdd12)
    EditText etSedikitAirSmAdd12;
    @BindView(R.id.etSedikitAirSmAdd13)
    EditText etSedikitAirSmAdd13;
    @BindView(R.id.etSedikitAirSmAdd14)
    EditText etSedikitAirSmAdd14;
    @BindView(R.id.etSedikitAirSmAdd15)
    EditText etSedikitAirSmAdd15;
    @BindView(R.id.etSedikitAirSmAdd16)
    EditText etSedikitAirSmAdd16;

    @BindView(R.id.rvTersier)
    RecyclerView rvTersier;

//    @BindView(R.id.etGaduSm1)
//    EditText etGaduSm1;
//    @BindView(R.id.etGaduSm2)
//    EditText etGaduSm2;
//    @BindView(R.id.etGaduSm3)
//    EditText etGaduSm3;
//    @BindView(R.id.etGaduSm4)
//    EditText etGaduSm4;
//    @BindView(R.id.etLainSm1)
//    EditText etLainSm1;
//    @BindView(R.id.etLainSm2)
//    EditText etLainSm2;
//    @BindView(R.id.etLainSm3)
//    EditText etLainSm3;
//    @BindView(R.id.etLainSm4)
//    EditText etLainSm4;
//    @BindView(R.id.etBeroSm1)
//    EditText etBeroSm1;
//    @BindView(R.id.etBeroSm2)
//    EditText etBeroSm2;
//    @BindView(R.id.etBeroSm3)
//    EditText etBeroSm3;
//    @BindView(R.id.etBeroSm4)
//    EditText etBeroSm4;

    private int kodeMT = 0;
    private String urutMT = "MT1";
    private String tahunBulan = "202001";
    private int perioda = 1;
    private int action = 0;
    private QueryFilters queryFilters;
    private List<Blanko04Bangtrol> blanko04BangtrolList;
    private Blanko04Bangtrol blanko04Bangtrol;
    private List<SaluranDetail> saluranDetailList;
    private AdapterListBlanko4A adapterListBlanko4A;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_add_blanko_4a, null);
        ButterKnife.bind(this, view);

        ((HomeActivity) Objects.requireNonNull(getActivity())).saveBtn.setVisibility(View.VISIBLE);

        ((HomeActivity)getActivity()).saveBtn.setOnClickListener(view1 -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            if (action == Constant.ACTION_EDIT) {
                for (Blanko04Bangtrol bangtrol: blanko04BangtrolList){
                    if (bangtrol.getNm_bangtrol().contains("Sm.1") || bangtrol.getNm_bangtrol().contains("BCIm16 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 1")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm1.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm1.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm1.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm1.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm1.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm1.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm1.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm1.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.2") || bangtrol.getNm_bangtrol().contains("BCIm 17 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 2")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm2.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm2.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm2.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm2.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm2.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm2.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm2.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm2.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.3") || bangtrol.getNm_bangtrol().contains("BCIm 18 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 3")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm3.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm3.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm3.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm3.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm3.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm3.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm3.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm3.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.4") || bangtrol.getNm_bangtrol().contains("BCIm 19 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 4")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm4.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm4.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm4.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm4.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm4.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm4.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm4.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm4.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 20a Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd5.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd5.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd5.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd5.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd5.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd5.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd5.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd5.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 20 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd6.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd6.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd6.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd6.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd6.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd6.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd6.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd6.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 21 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd7.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd7.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd7.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd7.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd7.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd7.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd7.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd7.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 22 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd8.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd8.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd8.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd8.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd8.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd8.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd8.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd8.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 23 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd9.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd9.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd9.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd9.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd9.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd9.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd9.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd9.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 24 Kn 1")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd10.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd10.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd10.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd10.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd10.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd10.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd10.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd10.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 24 Kn 2")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd11.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd11.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd11.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd11.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd11.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd11.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd11.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd11.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 25 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd12.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd12.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd12.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd12.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd12.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd12.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd12.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd12.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 26 Kn")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd13.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd13.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd13.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd13.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd13.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd13.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd13.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd13.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.1")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd14.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd14.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd14.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd14.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd14.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd14.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd14.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd14.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.2")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd15.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd15.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd15.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd15.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd15.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd15.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd15.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd15.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.3")){
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd16.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd16.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd16.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd16.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd16.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd16.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd16.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd16.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.CS 5")) {
                        bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm5.getText().toString()));
                        bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm5.getText().toString()));
                        bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm5.getText().toString()));
                        bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm5.getText().toString()));
                        bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm5.getText().toString()));
                        bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm5.getText().toString()));
                        bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm5.getText().toString()));
                        bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm5.getText().toString()));
                        bangtrol.setFlag(false);
                        bangtrol.setTgledit(currentDateandTime);
                        LocalData.saveOrUpdate(bangtrol);
                    }
                }

                Toast.makeText(getContext(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), HomeActivity.class);
                Objects.requireNonNull(getActivity()).startActivity(intent);
            } else {
                try {
                    queryFilters = new QueryFilters();
                    queryFilters.add("nm_usr", Session.get("Authorization").getValue());
                    User currentUser = LocalData.get(queryFilters, User.class);

                    queryFilters = new QueryFilters();
                    if (currentUser.getNm_usr().equals("maraus")) queryFilters.add("kd_saluran", "64025005001");
                    saluranDetailList = LocalData.getList(queryFilters, SaluranDetail.class, "nm_bangtrol", Sort.ASCENDING);
                    if (saluranDetailList.size() == 0) {
                        queryFilters = new QueryFilters();
                        queryFilters.add("kd_saluran", "36007003001");
                        saluranDetailList = LocalData.getList(queryFilters, SaluranDetail.class, "nm_bangtrol", Sort.ASCENDING);
                    }
                    System.out.println(new Gson().toJson(saluranDetailList));
                    for (SaluranDetail saluranDetail: saluranDetailList){
                        if (saluranDetail.getNm_bangtrol().equals("64025005001B.Sm.1") || saluranDetail.getNm_bangtrol().contains("BCIm16 Kn")
                                || saluranDetail.getNm_bangtrol().contains("B.CS 1")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm1.getText().toString().equals("")?"0":etPadiOlahTanahSm1.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm1.getText().toString().equals("")?"0":etPadiTumbuhSm1.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm1.getText().toString().equals("")?"0":etPadiPanenSm1.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm1.getText().toString().equals("")?"0":etTebuOlahTanahSm1.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm1.getText().toString().equals("")?"0":etTebuMudaSm1.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm1.getText().toString().equals("")?"0":etTebuTuaSm1.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm1.getText().toString().equals("")?"0":etBanyakAirSm1.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm1.getText().toString().equals("")?"0":etSedikitAirSm1.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SM1: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().equals("64025005001B.Sm.2") || saluranDetail.getNm_bangtrol().contains("BCIm 17 Kn")
                                || saluranDetail.getNm_bangtrol().contains("B.CS 2")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm2.getText().toString().equals("")?"0":etPadiOlahTanahSm2.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm2.getText().toString().equals("")?"0":etPadiTumbuhSm2.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm2.getText().toString().equals("")?"0":etPadiPanenSm2.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm2.getText().toString().equals("")?"0":etTebuOlahTanahSm2.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm2.getText().toString().equals("")?"0":etTebuMudaSm2.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm2.getText().toString().equals("")?"0":etTebuTuaSm2.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm2.getText().toString().equals("")?"0":etBanyakAirSm2.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm2.getText().toString().equals("")?"0":etSedikitAirSm2.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SM2: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().equals("64025005001B.Sm.3") || saluranDetail.getNm_bangtrol().contains("BCIm 18 Kn")
                                || saluranDetail.getNm_bangtrol().contains("B.CS 3")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm3.getText().toString().equals("")?"0":etPadiOlahTanahSm3.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm3.getText().toString().equals("")?"0":etPadiTumbuhSm3.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm3.getText().toString().equals("")?"0":etPadiPanenSm3.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm3.getText().toString().equals("")?"0":etTebuOlahTanahSm3.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm3.getText().toString().equals("")?"0":etTebuMudaSm3.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm3.getText().toString().equals("")?"0":etTebuTuaSm3.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm3.getText().toString().equals("")?"0":etBanyakAirSm3.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm3.getText().toString().equals("")?"0":etSedikitAirSm3.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SM3: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().equals("64025005001B.Sm.4") || saluranDetail.getNm_bangtrol().contains("BCIm 19 Kn")
                                || saluranDetail.getNm_bangtrol().contains("B.CS 4")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm4.getText().toString().equals("")?"0":etPadiOlahTanahSm4.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm4.getText().toString().equals("")?"0":etPadiTumbuhSm4.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm4.getText().toString().equals("")?"0":etPadiPanenSm4.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm4.getText().toString().equals("")?"0":etTebuOlahTanahSm4.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm4.getText().toString().equals("")?"0":etTebuMudaSm4.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm4.getText().toString().equals("")?"0":etTebuTuaSm4.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm4.getText().toString().equals("")?"0":etBanyakAirSm4.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm4.getText().toString().equals("")?"0":etSedikitAirSm4.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SM4: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 20a Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd5.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd5.getText().toString().equals("")?"0":etPadiTumbuhSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd5.getText().toString().equals("")?"0":etPadiPanenSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd5.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd5.getText().toString().equals("")?"0":etTebuMudaSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd5.getText().toString().equals("")?"0":etTebuTuaSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd5.getText().toString().equals("")?"0":etBanyakAirSmAdd5.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd5.getText().toString().equals("")?"0":etSedikitAirSmAdd5.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd5: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 20 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd6.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd6.getText().toString().equals("")?"0":etPadiTumbuhSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd6.getText().toString().equals("")?"0":etPadiPanenSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd6.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd6.getText().toString().equals("")?"0":etTebuMudaSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd6.getText().toString().equals("")?"0":etTebuTuaSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd6.getText().toString().equals("")?"0":etBanyakAirSmAdd6.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd6.getText().toString().equals("")?"0":etSedikitAirSmAdd6.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd6: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 21 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd7.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd7.getText().toString().equals("")?"0":etPadiTumbuhSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd7.getText().toString().equals("")?"0":etPadiPanenSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd7.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd7.getText().toString().equals("")?"0":etTebuMudaSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd7.getText().toString().equals("")?"0":etTebuTuaSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd7.getText().toString().equals("")?"0":etBanyakAirSmAdd7.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd7.getText().toString().equals("")?"0":etSedikitAirSmAdd7.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd7: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 22 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd8.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd8.getText().toString().equals("")?"0":etPadiTumbuhSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd8.getText().toString().equals("")?"0":etPadiPanenSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd8.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd8.getText().toString().equals("")?"0":etTebuMudaSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd8.getText().toString().equals("")?"0":etTebuTuaSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd8.getText().toString().equals("")?"0":etBanyakAirSmAdd8.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd8.getText().toString().equals("")?"0":etSedikitAirSmAdd8.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd8: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 23 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd9.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd9.getText().toString().equals("")?"0":etPadiTumbuhSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd9.getText().toString().equals("")?"0":etPadiPanenSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd9.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd9.getText().toString().equals("")?"0":etTebuMudaSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd9.getText().toString().equals("")?"0":etTebuTuaSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd9.getText().toString().equals("")?"0":etBanyakAirSmAdd9.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd9.getText().toString().equals("")?"0":etSedikitAirSmAdd9.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd9: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 24 Kn 1")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd10.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd10.getText().toString().equals("")?"0":etPadiTumbuhSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd10.getText().toString().equals("")?"0":etPadiPanenSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd10.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd10.getText().toString().equals("")?"0":etTebuMudaSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd10.getText().toString().equals("")?"0":etTebuTuaSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd10.getText().toString().equals("")?"0":etBanyakAirSmAdd10.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd10.getText().toString().equals("")?"0":etSedikitAirSmAdd10.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd10: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 24 Kn 2")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd11.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd11.getText().toString().equals("")?"0":etPadiTumbuhSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd11.getText().toString().equals("")?"0":etPadiPanenSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd11.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd11.getText().toString().equals("")?"0":etTebuMudaSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd11.getText().toString().equals("")?"0":etTebuTuaSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd11.getText().toString().equals("")?"0":etBanyakAirSmAdd11.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd11.getText().toString().equals("")?"0":etSedikitAirSmAdd11.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd11: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 25 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd12.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd12.getText().toString().equals("")?"0":etPadiTumbuhSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd12.getText().toString().equals("")?"0":etPadiPanenSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd12.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd12.getText().toString().equals("")?"0":etTebuMudaSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd12.getText().toString().equals("")?"0":etTebuTuaSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd12.getText().toString().equals("")?"0":etBanyakAirSmAdd12.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd12.getText().toString().equals("")?"0":etSedikitAirSmAdd12.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd12: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("BCIm 26 Kn")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd13.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd13.getText().toString().equals("")?"0":etPadiTumbuhSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd13.getText().toString().equals("")?"0":etPadiPanenSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd13.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd13.getText().toString().equals("")?"0":etTebuMudaSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd13.getText().toString().equals("")?"0":etTebuTuaSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd13.getText().toString().equals("")?"0":etBanyakAirSmAdd13.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd13.getText().toString().equals("")?"0":etSedikitAirSmAdd13.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd13: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("B.K.1")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd14.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd14.getText().toString().equals("")?"0":etPadiTumbuhSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd14.getText().toString().equals("")?"0":etPadiPanenSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd14.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd14.getText().toString().equals("")?"0":etTebuMudaSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd14.getText().toString().equals("")?"0":etTebuTuaSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd14.getText().toString().equals("")?"0":etBanyakAirSmAdd14.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd14.getText().toString().equals("")?"0":etSedikitAirSmAdd14.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd14: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("B.K.2")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd15.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd15.getText().toString().equals("")?"0":etPadiTumbuhSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd15.getText().toString().equals("")?"0":etPadiPanenSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd15.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd15.getText().toString().equals("")?"0":etTebuMudaSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd15.getText().toString().equals("")?"0":etTebuTuaSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd15.getText().toString().equals("")?"0":etBanyakAirSmAdd15.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd15.getText().toString().equals("")?"0":etSedikitAirSmAdd15.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd15: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("B.K.3")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSmAdd16.getText().toString().equals("")?"0":etPadiOlahTanahSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSmAdd16.getText().toString().equals("")?"0":etPadiTumbuhSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSmAdd16.getText().toString().equals("")?"0":etPadiPanenSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSmAdd16.getText().toString().equals("")?"0":etTebuOlahTanahSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSmAdd16.getText().toString().equals("")?"0":etTebuMudaSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSmAdd16.getText().toString().equals("")?"0":etTebuTuaSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSmAdd16.getText().toString().equals("")?"0":etBanyakAirSmAdd16.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSmAdd16.getText().toString().equals("")?"0":etSedikitAirSmAdd16.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SMAdd16: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }

                        if (saluranDetail.getNm_bangtrol().contains("B.CS 5")){
                            blanko04Bangtrol = new Blanko04Bangtrol();
                            String uuid = UUID.randomUUID().toString();
                            blanko04Bangtrol.setId(uuid);
                            blanko04Bangtrol.setKd_staf(currentUser.getKd_staf());
                            blanko04Bangtrol.setKd_mt(kodeMT);
                            blanko04Bangtrol.setUrut_mt(urutMT);
                            blanko04Bangtrol.setThbln(tahunBulan);
                            blanko04Bangtrol.setPoda_air(perioda);
                            blanko04Bangtrol.setNm_bangtrol(saluranDetail.getNm_bangtrol());
                            blanko04Bangtrol.setTmt_bangtrol(saluranDetail.getTmt_bangtrol());
                            blanko04Bangtrol.setUrutan(saluranDetail.getUrutan());
                            blanko04Bangtrol.setPetak_tersier(saluranDetail.getPetak_tersier());
                            blanko04Bangtrol.setUs_padi_olahtanah(Float.parseFloat(etPadiOlahTanahSm5.getText().toString().equals("")?"0":etPadiOlahTanahSm5.getText().toString()));
                            blanko04Bangtrol.setUs_padi_tumbuh(Float.parseFloat(etPadiTumbuhSm5.getText().toString().equals("")?"0":etPadiTumbuhSm5.getText().toString()));
                            blanko04Bangtrol.setUs_padi_panen(Float.parseFloat(etPadiPanenSm5.getText().toString().equals("")?"0":etPadiPanenSm5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_olahtanah(Float.parseFloat(etTebuOlahTanahSm5.getText().toString().equals("")?"0":etTebuOlahTanahSm5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_muda(Float.parseFloat(etTebuMudaSm5.getText().toString().equals("")?"0":etTebuMudaSm5.getText().toString()));
                            blanko04Bangtrol.setUs_tebu_tua(Float.parseFloat(etTebuTuaSm5.getText().toString().equals("")?"0":etTebuTuaSm5.getText().toString()));
                            blanko04Bangtrol.setUs_wija_byk_air(Float.parseFloat(etBanyakAirSm5.getText().toString().equals("")?"0":etBanyakAirSm5.getText().toString()));
                            blanko04Bangtrol.setUs_wija_dkt_air(Float.parseFloat(etSedikitAirSm5.getText().toString().equals("")?"0":etSedikitAirSm5.getText().toString()));
                            blanko04Bangtrol.setFlag(false);
                            blanko04Bangtrol.setTgledit(currentDateandTime);
                            System.out.println("SM5: "+new Gson().toJson(blanko04Bangtrol));
                            LocalData.saveOrUpdate(blanko04Bangtrol);
                        }
                    }
                    Toast.makeText(getContext(), "Berhasil simpan data", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    Objects.requireNonNull(getActivity()).startActivity(intent);
                } catch (LocalDataNotFoundException e) {
                    e.printStackTrace();
                }
            }

        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        action = Objects.requireNonNull(getArguments()).getInt("action");
        kodeMT = getArguments().getInt("kodeMT");
        urutMT = getArguments().getString("urutMT");
        tahunBulan = getArguments().getString("tahunBulan");
        perioda = getArguments().getInt("perioda");

        populateForm();
        populateData(action, kodeMT, urutMT, tahunBulan, perioda);
        populateRv();
    }

    private void populateRv() {
        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("urut_mt", urutMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("poda_air", perioda);
        List<Blanko04Bangtrol> blanko04BangtrolList = LocalData.getList(queryFilters, Blanko04Bangtrol.class, "nm_bangtrol", Sort.ASCENDING);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rvTersier.setLayoutManager(layoutManager);

        adapterListBlanko4A = new AdapterListBlanko4A(blanko04BangtrolList, getContext());
        rvTersier.setAdapter(adapterListBlanko4A);
    }

    @SuppressLint("SetTextI18n")
    private void populateForm() {
        queryFilters = new QueryFilters();
        try {
            queryFilters.add("nm_usr", Session.get("Authorization").getValue());
            User currentUser = LocalData.get(queryFilters, User.class);
            saluranDetailList = LocalData.getList(queryFilters, SaluranDetail.class, "nm_bangtrol", Sort.ASCENDING);
            System.out.println(new Gson().toJson(saluranDetailList));
            if (currentUser.getNm_usr().equals("anasa")) {
                layoutPengolahan5.setVisibility(View.VISIBLE);
                layoutPertumbuhan5.setVisibility(View.VISIBLE);
                layoutPanen5.setVisibility(View.VISIBLE);
                layoutPalawijaya5.setVisibility(View.VISIBLE);
                layoutPengolahanTebu5.setVisibility(View.VISIBLE);
                layoutTebuMuda5.setVisibility(View.VISIBLE);
                layoutSedikitAir5.setVisibility(View.VISIBLE);
                layoutBanyakAir5.setVisibility(View.VISIBLE);
            }

            if (currentUser.getNm_usr().equals("ade")){
                layoutAdditional.setVisibility(View.VISIBLE);
                layoutAdditional2.setVisibility(View.VISIBLE);
                layoutAdditional3.setVisibility(View.VISIBLE);
                layoutAdditional4.setVisibility(View.VISIBLE);
                layoutAdditional5.setVisibility(View.VISIBLE);
                layoutAdditional6.setVisibility(View.VISIBLE);
                layoutAdditional7.setVisibility(View.VISIBLE);
                layoutAdditional8.setVisibility(View.VISIBLE);
            }

            if (!currentUser.getNm_usr().equals("maraus")) {
                for (SaluranDetail saluranDetail: saluranDetailList){
                    if (saluranDetail.getNm_bangtrol().contains("BCIm16 Kn")){
                        tvPengolahanTitle1.setText("BCIm16 Kn");
                        tvPertumbuhanTitle1.setText("BCIm16 Kn");
                        tvPaneneTitle1.setText("BCIm16 Kn");
                        tvPengolahanTebuTitle1.setText("BCIm16 Kn");
                        tvPalawijayaTitle1.setText("BCIm16 Kn");
                        tvTebuMudaTitle1.setText("BCIm16 Kn");
                        tvSedikitAirTitle1.setText("BCIm16 Kn");
                        tvBanyakAirTitle1.setText("BCIm16 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 17 Kn")) {
                        tvPengolahanTitle2.setText("BCIm 17 Kn");
                        tvPertumbuhanTitle2.setText("BCIm 17 Kn");
                        tvPaneneTitle2.setText("BCIm 17 Kn");
                        tvPengolahanTebuTitle2.setText("BCIm 17 Kn");
                        tvPalawijayaTitle2.setText("BCIm 17 Kn");
                        tvTebuMudaTitle2.setText("BCIm 17 Kn");
                        tvSedikitAirTitle2.setText("BCIm 17 Kn");
                        tvBanyakAirTitle2.setText("BCIm 17 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 18 Kn")) {
                        tvPengolahanTitle3.setText("BCIm 18 Kn");
                        tvPertumbuhanTitle3.setText("BCIm 18 Kn");
                        tvPaneneTitle3.setText("BCIm 18 Kn");
                        tvPengolahanTebuTitle3.setText("BCIm 18 Kn");
                        tvPalawijayaTitle3.setText("BCIm 18 Kn");
                        tvTebuMudaTitle3.setText("BCIm 18 Kn");
                        tvSedikitAirTitle3.setText("BCIm 18 Kn");
                        tvBanyakAirTitle3.setText("BCIm 18 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 19 Kn")) {
                        tvPengolahanTitle4.setText("BCIm 19 Kn");
                        tvPertumbuhanTitle4.setText("BCIm 19 Kn");
                        tvPaneneTitle4.setText("BCIm 19 Kn");
                        tvPengolahanTebuTitle4.setText("BCIm 19 Kn");
                        tvPalawijayaTitle4.setText("BCIm 19 Kn");
                        tvTebuMudaTitle4.setText("BCIm 19 Kn");
                        tvSedikitAirTitle4.setText("BCIm 19 Kn");
                        tvBanyakAirTitle4.setText("BCIm 19 Kn");
                    }
                    else if (saluranDetail.getNm_bangtrol().contains("BCIm 20a Kn")) {
                        tvPengolahanTitleAdd5.setText("BCIm 20a Kn");;
                        tvPertumbuhanTitleAdd5.setText("BCIm 20a Kn");
                        tvPaneneTitleAdd5.setText("BCIm 20a Kn");
                        tvPengolahanTebuTitleAdd5.setText("BCIm 20a Kn");
                        tvPalawijayaTitleAdd5.setText("BCIm 20a Kn");
                        tvTebuMudaTitleAdd5.setText("BCIm 20a Kn");
                        tvSedikitAirTitleAdd5.setText("BCIm 20a Kn");
                        tvBanyakAirTitleAdd5.setText("BCIm 20a Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 20 Kn")) {
                        tvPengolahanTitleAdd6.setText("BCIm 20 Kn");
                        tvPertumbuhanTitleAdd6.setText("BCIm 20 Kn");
                        tvPaneneTitleAdd6.setText("BCIm 20 Kn");
                        tvPengolahanTebuTitleAdd6.setText("BCIm 20 Kn");
                        tvPalawijayaTitleAdd6.setText("BCIm 20 Kn");
                        tvTebuMudaTitleAdd6.setText("BCIm 20 Kn");
                        tvSedikitAirTitleAdd6.setText("BCIm 20 Kn");
                        tvBanyakAirTitleAdd6.setText("BCIm 20 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 21 Kn")) {
                        tvPengolahanTitleAdd7.setText("BCIm 21 Kn");
                        tvPertumbuhanTitleAdd7.setText("BCIm 21 Kn");
                        tvPaneneTitleAdd7.setText("BCIm 21 Kn");
                        tvPengolahanTebuTitleAdd7.setText("BCIm 21 Kn");
                        tvPalawijayaTitleAdd7.setText("BCIm 21 Kn");
                        tvTebuMudaTitleAdd7.setText("BCIm 21 Kn");
                        tvSedikitAirTitleAdd7.setText("BCIm 21 Kn");
                        tvBanyakAirTitleAdd7.setText("BCIm 21 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 22 Kn")) {
                        tvPengolahanTitleAdd8.setText("BCIm 22 Kn");
                        tvPertumbuhanTitleAdd8.setText("BCIm 22 Kn");
                        tvPaneneTitleAdd8.setText("BCIm 22 Kn");
                        tvPengolahanTebuTitleAdd8.setText("BCIm 22 Kn");
                        tvPalawijayaTitleAdd8.setText("BCIm 22 Kn");
                        tvTebuMudaTitleAdd8.setText("BCIm 22 Kn");
                        tvSedikitAirTitleAdd8.setText("BCIm 22 Kn");
                        tvBanyakAirTitleAdd8.setText("BCIm 22 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 23 Kn")) {
                        tvPengolahanTitleAdd9.setText("BCIm 23 Kn");
                        tvPertumbuhanTitleAdd9.setText("BCIm 23 Kn");
                        tvPaneneTitleAdd9.setText("BCIm 23 Kn");
                        tvPengolahanTebuTitleAdd9.setText("BCIm 23 Kn");
                        tvPalawijayaTitleAdd9.setText("BCIm 23 Kn");
                        tvTebuMudaTitleAdd9.setText("BCIm 23 Kn");
                        tvSedikitAirTitleAdd9.setText("BCIm 23 Kn");
                        tvBanyakAirTitleAdd9.setText("BCIm 23 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 24 Kn 1")) {
                        tvPengolahanTitleAdd10.setText("BCIm 24 Kn 1");
                        tvPertumbuhanTitleAdd10.setText("BCIm 24 Kn 1");
                        tvPaneneTitleAdd10.setText("BCIm 24 Kn 1");
                        tvPengolahanTebuTitleAdd10.setText("BCIm 24 Kn 1");
                        tvPalawijayaTitleAdd10.setText("BCIm 24 Kn 1");
                        tvTebuMudaTitleAdd10.setText("BCIm 24 Kn 1");
                        tvSedikitAirTitleAdd10.setText("BCIm 24 Kn 1");
                        tvBanyakAirTitleAdd10.setText("BCIm 24 Kn 1");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 24 Kn 2")) {
                        tvPengolahanTitleAdd11.setText("BCIm 24 Kn 2");
                        tvPertumbuhanTitleAdd11.setText("BCIm 24 Kn 2");
                        tvPaneneTitleAdd11.setText("BCIm 24 Kn 2");
                        tvPengolahanTebuTitleAdd11.setText("BCIm 24 Kn 2");
                        tvPalawijayaTitleAdd11.setText("BCIm 24 Kn 2");
                        tvTebuMudaTitleAdd11.setText("BCIm 24 Kn 2");
                        tvSedikitAirTitleAdd11.setText("BCIm 24 Kn 2");
                        tvBanyakAirTitleAdd11.setText("BCIm 24 Kn 2");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 25 Kn")) {
                        tvPengolahanTitleAdd12.setText("BCIm 25 Kn");
                        tvPertumbuhanTitleAdd12.setText("BCIm 25 Kn");
                        tvPaneneTitleAdd12.setText("BCIm 25 Kn");
                        tvPengolahanTebuTitleAdd12.setText("BCIm 25 Kn");
                        tvPalawijayaTitleAdd12.setText("BCIm 25 Kn");
                        tvTebuMudaTitleAdd12.setText("BCIm 25 Kn");
                        tvSedikitAirTitleAdd12.setText("BCIm 25 Kn");
                        tvBanyakAirTitleAdd12.setText("BCIm 25 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("BCIm 26 Kn")) {
                        tvPengolahanTitleAdd13.setText("BCIm 26 Kn");
                        tvPertumbuhanTitleAdd13.setText("BCIm 26 Kn");
                        tvPaneneTitleAdd13.setText("BCIm 26 Kn");
                        tvPengolahanTebuTitleAdd13.setText("BCIm 26 Kn");
                        tvPalawijayaTitleAdd13.setText("BCIm 26 Kn");
                        tvTebuMudaTitleAdd13.setText("BCIm 26 Kn");
                        tvSedikitAirTitleAdd13.setText("BCIm 26 Kn");
                        tvBanyakAirTitleAdd13.setText("BCIm 26 Kn");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.K.1")) {
                        tvPengolahanTitleAdd14.setText("B.K.1");
                        tvPertumbuhanTitleAdd14.setText("B.K.1");
                        tvPaneneTitleAdd14.setText("B.K.1");
                        tvPengolahanTebuTitleAdd14.setText("B.K.1");
                        tvPalawijayaTitleAdd14.setText("B.K.1");
                        tvTebuMudaTitleAdd14.setText("B.K.1");
                        tvSedikitAirTitleAdd14.setText("B.K.1");
                        tvBanyakAirTitleAdd14.setText("B.K.1");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.K.2")) {
                        tvPengolahanTitleAdd15.setText("B.K.3");
                        tvPertumbuhanTitleAdd15.setText("B.K.3");
                        tvPaneneTitleAdd15.setText("B.K.3");
                        tvPengolahanTebuTitleAdd15.setText("B.K.3");
                        tvPalawijayaTitleAdd15.setText("B.K.3");
                        tvTebuMudaTitleAdd15.setText("B.K.3");
                        tvSedikitAirTitleAdd15.setText("B.K.3");
                        tvBanyakAirTitleAdd15.setText("B.K.3");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.K.3")) {
                        tvPengolahanTitleAdd16.setText("B.K.3");
                        tvPertumbuhanTitleAdd16.setText("B.K.3");
                        tvPaneneTitleAdd16.setText("B.K.3");
                        tvPengolahanTebuTitleAdd16.setText("B.K.3");
                        tvPalawijayaTitleAdd16.setText("B.K.3");
                        tvTebuMudaTitleAdd16.setText("B.K.3");
                        tvSedikitAirTitleAdd16.setText("B.K.3");
                        tvBanyakAirTitleAdd16.setText("B.K.3");
                    }
                    else if (saluranDetail.getNm_bangtrol().contains("B.CS 1")) {
                        tvPengolahanTitle1.setText("B.CS 1");
                        tvPertumbuhanTitle1.setText("B.CS 1");
                        tvPaneneTitle1.setText("B.CS 1");
                        tvPengolahanTebuTitle1.setText("B.CS 1");
                        tvPalawijayaTitle1.setText("B.CS 1");
                        tvTebuMudaTitle1.setText("B.CS 1");
                        tvSedikitAirTitle1.setText("B.CS 1");
                        tvBanyakAirTitle1.setText("B.CS 1");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.CS 2")) {
                        tvPengolahanTitle2.setText("B.CS 2");
                        tvPertumbuhanTitle2.setText("B.CS 2");
                        tvPaneneTitle2.setText("B.CS 2");
                        tvPengolahanTebuTitle2.setText("B.CS 2");
                        tvPalawijayaTitle2.setText("B.CS 2");
                        tvTebuMudaTitle2.setText("B.CS 2");
                        tvSedikitAirTitle2.setText("B.CS 2");
                        tvBanyakAirTitle2.setText("B.CS 2");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.CS 3")) {
                        tvPengolahanTitle3.setText("B.CS 3");
                        tvPertumbuhanTitle3.setText("B.CS 3");
                        tvPaneneTitle3.setText("B.CS 3");
                        tvPengolahanTebuTitle3.setText("B.CS 3");
                        tvPalawijayaTitle3.setText("B.CS 3");
                        tvTebuMudaTitle3.setText("B.CS 3");
                        tvSedikitAirTitle3.setText("B.CS 3");
                        tvBanyakAirTitle3.setText("B.CS 3");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.CS 4")) {
                        tvPengolahanTitle4.setText("B.CS 4");
                        tvPertumbuhanTitle4.setText("B.CS 4");
                        tvPaneneTitle4.setText("B.CS 4");
                        tvPengolahanTebuTitle4.setText("B.CS 4");
                        tvPalawijayaTitle4.setText("B.CS 4");
                        tvTebuMudaTitle4.setText("B.CS 4");
                        tvSedikitAirTitle4.setText("B.CS 4");
                        tvBanyakAirTitle4.setText("B.CS 4");
                    } else if (saluranDetail.getNm_bangtrol().contains("B.CS 5")) {
                        tvPengolahanTitle5.setText("B.CS 5");
                        tvPertumbuhanTitle5.setText("B.CS 5");
                        tvPaneneTitle5.setText("B.CS 5");
                        tvPengolahanTebuTitle5.setText("B.CS 5");
                        tvPalawijayaTitle5.setText("B.CS 5");
                        tvTebuMudaTitle5.setText("B.CS 5");
                        tvSedikitAirTitle5.setText("B.CS 5");
                        tvBanyakAirTitle5.setText("B.CS 5");
                    }
                }
            }
        } catch (LocalDataNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void populateData(int action, int kodeMT, String urutMT, String tahunBulan, int perioda) {

        queryFilters = new QueryFilters();
        queryFilters.add("kd_mt", kodeMT);
        queryFilters.add("urut_mt", urutMT);
        queryFilters.add("thbln", tahunBulan);
        queryFilters.add("poda_air", perioda);

        if (action == Constant.ACTION_EDIT) {
            try {
                blanko04BangtrolList = LocalData.getList(queryFilters, Blanko04Bangtrol.class, "nm_bangtrol", Sort.ASCENDING);
                System.out.println(new Gson().toJson(blanko04BangtrolList));
                for (Blanko04Bangtrol bangtrol: blanko04BangtrolList){
                    if (bangtrol.getNm_bangtrol().contains("Sm.1") || bangtrol.getNm_bangtrol().contains("BCIm16 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 1")){
                        etPadiOlahTanahSm1.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSm1.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSm1.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSm1.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSm1.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSm1.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSm1.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSm1.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.2") || bangtrol.getNm_bangtrol().contains("BCIm 17 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 2")){
                        etPadiOlahTanahSm2.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSm2.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSm2.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSm2.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSm2.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSm2.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSm2.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSm2.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.3") || bangtrol.getNm_bangtrol().contains("BCIm 18 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 3")){
                        etPadiOlahTanahSm3.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSm3.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSm3.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSm3.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSm3.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSm3.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSm3.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSm3.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("Sm.4") || bangtrol.getNm_bangtrol().contains("BCIm 19 Kn")
                            || bangtrol.getNm_bangtrol().contains("B.CS 4")){
                        etPadiOlahTanahSm4.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSm4.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSm4.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSm4.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSm4.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSm4.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSm4.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSm4.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 20a Kn")){
                        etPadiOlahTanahSmAdd5.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd5.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd5.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd5.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd5.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd5.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd5.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd5.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 20 Kn")){
                        etPadiOlahTanahSmAdd6.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd6.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd6.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd6.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd6.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd6.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd6.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd6.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 21 Kn")){
                        etPadiOlahTanahSmAdd7.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd7.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd7.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd7.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd7.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd7.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd7.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd7.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 22 Kn")){
                        etPadiOlahTanahSmAdd8.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd8.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd8.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd8.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd8.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd8.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd8.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd8.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 23 Kn")){
                        etPadiOlahTanahSmAdd9.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd9.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd9.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd9.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd9.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd9.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd9.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd9.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 24 Kn 1")){
                        etPadiOlahTanahSmAdd10.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd10.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd10.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd10.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd10.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd10.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd10.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd10.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 24 Kn 2")){
                        etPadiOlahTanahSmAdd11.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd11.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd11.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd11.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd11.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd11.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd11.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd11.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 25 Kn")){
                        etPadiOlahTanahSmAdd12.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd12.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd12.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd12.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd12.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd12.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd12.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd12.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("BCIm 26 Kn")){
                        etPadiOlahTanahSmAdd13.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd13.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd13.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd13.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd13.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd13.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd13.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd13.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.1")){
                        etPadiOlahTanahSmAdd14.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd14.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd14.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd14.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd14.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd14.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd14.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd14.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.2")){
                        etPadiOlahTanahSmAdd15.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd15.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd15.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd15.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd15.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd15.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd15.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd15.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.K.3")){
                        etPadiOlahTanahSmAdd16.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSmAdd16.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSmAdd16.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSmAdd16.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSmAdd16.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSmAdd16.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSmAdd16.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSmAdd16.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }

                    if (bangtrol.getNm_bangtrol().contains("B.CS 5")) {
                        etPadiOlahTanahSm5.setText(String.valueOf(bangtrol.getUs_padi_olahtanah()));
                        etPadiTumbuhSm5.setText(String.valueOf(bangtrol.getUs_padi_tumbuh()));
                        etPadiPanenSm5.setText(String.valueOf(bangtrol.getUs_padi_panen()));
                        etTebuOlahTanahSm5.setText(String.valueOf(bangtrol.getUs_tebu_olahtanah()));
                        etTebuMudaSm5.setText(String.valueOf(bangtrol.getUs_tebu_muda()));
                        etTebuTuaSm5.setText(String.valueOf(bangtrol.getUs_tebu_tua()));
                        etBanyakAirSm5.setText(String.valueOf(bangtrol.getUs_wija_byk_air()));
                        etSedikitAirSm5.setText(String.valueOf(bangtrol.getUs_wija_dkt_air()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            blanko04Bangtrol = new Blanko04Bangtrol();
        }
    }
}
