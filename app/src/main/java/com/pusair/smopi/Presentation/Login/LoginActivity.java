package com.pusair.smopi.Presentation.Login;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Headers;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pusair.smopi.Api.FirstInitHelper;
import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Blanko0405;
import com.pusair.smopi.Model.Blanko04Bangtrol;
import com.pusair.smopi.Model.Blanko06;
import com.pusair.smopi.Model.Blanko08;
import com.pusair.smopi.Model.BlankoP01;
import com.pusair.smopi.Model.BlankoP01Detail;
import com.pusair.smopi.Model.DaerahIrigasi;
import com.pusair.smopi.Model.GroupIp3a;
import com.pusair.smopi.Model.JenisKeadaan;
import com.pusair.smopi.Model.MusimTanam;
import com.pusair.smopi.Model.PodaLaporanDaerahIrigasi;
import com.pusair.smopi.Model.RentangMusimTanam;
import com.pusair.smopi.Model.Saluran;
import com.pusair.smopi.Model.SaluranDetail;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.Presentation.Home.HomeActivity;
import com.pusair.smopi.R;
import com.rezkyatinnov.kyandroid.localdata.LocalData;
import com.rezkyatinnov.kyandroid.reztrofit.ErrorResponse;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.session.Session;
import com.rezkyatinnov.kyandroid.session.SessionNotFoundException;
import com.rezkyatinnov.kyandroid.session.SessionObject;

import java.util.UUID;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.ed_username)
    EditText _inputUsername;

    @BindView(R.id.ed_password)
    EditText _inputPassword;

    @BindView(R.id.btn_login)
    Button _loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        try {
            Session.get("Authorization");
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        } catch (SessionNotFoundException e) {
            Session.clear();
            LocalData.clear();
            e.printStackTrace();
        }
    }

    @OnClick(R.id.btn_login)
    public void doLogin() {

        String username = _inputUsername.getText().toString();

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Inisialisasi Data...");
        progressDialog.show();

        FirstInitHelper.firstInit(username, new RestCallback<ApiResponse>() {
            @Override
            public void onSuccess(Headers headers, ApiResponse body) {

                if (body != null) {

                    if (body.getPeringatan() != null){
                        Toast.makeText(getApplicationContext(), body.getPeringatan(), Toast.LENGTH_SHORT).show();
                    } else {
                        Session.save(new SessionObject("Authorization", username,true));
                        if (username.equals("marang") || username.equals("anas")) {
                            for (int i=0; i< body.getDaerahIrigasiList().size(); i++) {
                                DaerahIrigasi di = (DaerahIrigasi) body.getDaerahIrigasiList().get(i);
                                di.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(di);
                            }
//
                            for (int i=0; i< body.getStaffIrigasi().size(); i++) {
                                LocalData.saveOrUpdate((User) body.getStaffIrigasi().get(i));
                            }
//
                            for (int i=0; i< body.getSaluranList().size(); i++) {
                                LocalData.saveOrUpdate((Saluran) body.getSaluranList().get(i));
                            }

                            for (int i=0; i< body.getPodaLaporanDaerahIrigasiList().size(); i++) {
                                PodaLaporanDaerahIrigasi podaLaporanDaerahIrigasi = (PodaLaporanDaerahIrigasi) body.getPodaLaporanDaerahIrigasiList().get(i);
                                podaLaporanDaerahIrigasi.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(podaLaporanDaerahIrigasi);
                            }

                            for (int i=0; i< body.getMusimTanamList().size(); i++) {
                                MusimTanam musimTanam = (MusimTanam) body.getMusimTanamList().get(i);
                                LocalData.saveOrUpdate(musimTanam);
                            }

                            for (int i=0; i< body.getRentangMusimTanamList().size(); i++) {
                                RentangMusimTanam rentangMusimTanam = (RentangMusimTanam) body.getRentangMusimTanamList().get(i);
                                rentangMusimTanam.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(rentangMusimTanam);
                            }

                            for (int i=0; i< body.getJenisKeadaanList().size(); i++) {
                                LocalData.saveOrUpdate((JenisKeadaan) body.getJenisKeadaanList().get(i));
                            }

                            for (int i=0; i< body.getBlanko08List().size(); i++) {
                                Blanko08 blanko08 = (Blanko08) body.getBlanko08List().get(i);
                                blanko08.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(blanko08);
                            }
                        }
                        else {
                            for (int i=0; i< body.getDaerahIrigasiList().size(); i++) {
                                DaerahIrigasi di = (DaerahIrigasi) body.getDaerahIrigasiList().get(i);
                                di.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(di);
                            }
//
                            for (int i=0; i< body.getStaffIrigasi().size(); i++) {
                                LocalData.saveOrUpdate((User) body.getStaffIrigasi().get(i));
                            }
//
                            for (int i=0; i< body.getSaluranList().size(); i++) {
                                LocalData.saveOrUpdate((Saluran) body.getSaluranList().get(i));
                            }
//
                            for (int i=0; i< body.getSaluranDetailList().size(); i++) {
                                LocalData.saveOrUpdate((SaluranDetail) body.getSaluranDetailList().get(i));
                            }

                            for (int i=0; i< body.getPodaLaporanDaerahIrigasiList().size(); i++) {
                                PodaLaporanDaerahIrigasi podaLaporanDaerahIrigasi = (PodaLaporanDaerahIrigasi) body.getPodaLaporanDaerahIrigasiList().get(i);
                                podaLaporanDaerahIrigasi.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(podaLaporanDaerahIrigasi);
                            }

                            for (int i=0; i< body.getMusimTanamList().size(); i++) {
                                MusimTanam musimTanam = (MusimTanam) body.getMusimTanamList().get(i);
                                LocalData.saveOrUpdate(musimTanam);
                            }

                            for (int i=0; i< body.getGroupIp3aList().size(); i++) {
                                GroupIp3a groupIp3a = (GroupIp3a) body.getGroupIp3aList().get(i);
                                groupIp3a.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(groupIp3a);
                            }

                            for (int i=0; i< body.getRentangMusimTanamList().size(); i++) {
                                RentangMusimTanam rentangMusimTanam = (RentangMusimTanam) body.getRentangMusimTanamList().get(i);
                                rentangMusimTanam.setId(UUID.randomUUID().toString());

                                LocalData.saveOrUpdate(rentangMusimTanam);
                            }

                            for (int i=0; i< body.getJenisKeadaanList().size(); i++) {
                                LocalData.saveOrUpdate((JenisKeadaan) body.getJenisKeadaanList().get(i));
                            }

                            try {
                                for (int i=0; i< body.getBlanko0123List().size(); i++) {
                                    Blanko0123 blanko0123 = (Blanko0123) body.getBlanko0123List().get(i);
                                    blanko0123.setId(UUID.randomUUID().toString());
                                    blanko0123.setFlag(true);
                                    LocalData.saveOrUpdate(blanko0123);
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            for (int i=0; i< body.getBlanko0405List().size(); i++) {
                                Blanko0405 blanko0405 = (Blanko0405) body.getBlanko0405List().get(i);
                                blanko0405.setId(UUID.randomUUID().toString());
                                blanko0405.setFlag(true);
                                LocalData.saveOrUpdate(blanko0405);
                            }

                            for (int i=0; i< body.getBlanko06List().size(); i++) {
                                Blanko06 blanko06 = (Blanko06) body.getBlanko06List().get(i);
                                blanko06.setId(UUID.randomUUID().toString());
                                blanko06.setFlag(true);
                                LocalData.saveOrUpdate(blanko06);
                            }
//
                            try {
                                for (int i=0; i< body.getBlanko04BangtrolList().size(); i++) {
                                    Blanko04Bangtrol blanko04Bangtrol = (Blanko04Bangtrol) body.getBlanko04BangtrolList().get(i);
                                    blanko04Bangtrol.setId(UUID.randomUUID().toString());
                                    blanko04Bangtrol.setFlag(true);
                                    LocalData.saveOrUpdate(blanko04Bangtrol);
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            try {
                                for (int i=0; i< body.getBlankoP01List().size(); i++) {
                                    BlankoP01 blankoP01 = (BlankoP01) body.getBlankoP01List().get(i);
                                    blankoP01.setFlag(true);
                                    LocalData.saveOrUpdate(blankoP01);
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            try {
                                for (int i=0; i< body.getBlankoP01DetailList().size(); i++) {
                                    BlankoP01Detail blankoP01Detail = (BlankoP01Detail) body.getBlankoP01DetailList().get(i);
                                    blankoP01Detail.setId(UUID.randomUUID().toString());
                                    LocalData.saveOrUpdate(blankoP01Detail);
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                        }

                        progressDialog.dismiss();

                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }

                } else {
                    Toast.makeText(getApplicationContext(), body.getPesan(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailed(ErrorResponse error) {

            }

            @Override
            public void onCanceled() {

            }
        });
    }
}
