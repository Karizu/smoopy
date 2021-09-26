package com.pusair.smopi.Api;

import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.FirstInit;
import com.pusair.smopi.Model.Sync;
import com.pusair.smopi.Model.User;
import com.pusair.smopi.ViewModel.LoginViewModel;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface
{
    String BASE_URL = "http://smoi.irigasi.net/";


    @Headers({"otorisasi: c4ca4238a0b923820dcc509a6f75849b"})
    @GET("json_encod20.php")
    Call<ApiResponse> firstInit(@Query("akun") String username);

    @Headers({"otorisasi: c4ca4238a0b923820dcc509a6f75849b"})
    @POST("json_decod20.php")
    Call<ApiResponse> syncBlanko(@Body RequestBody sync);
}
