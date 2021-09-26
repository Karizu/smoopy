package com.pusair.smopi.Api;

import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.Blanko0123;
import com.pusair.smopi.Model.Sync;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.reztrofit.Reztrofit;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Callback;

public class SyncHelper {

    public static void syncBlanko(RequestBody sync, RestCallback<ApiResponse> callback){
        Reztrofit<ApiInterface> service = Reztrofit.getInstance();
        service.getEndpoint().syncBlanko(sync).enqueue(callback);
    }

    public static void syncBlanko(RequestBody sync, Callback<ApiResponse> callback){
        Reztrofit<ApiInterface> service = Reztrofit.getInstance();
        service.getEndpoint().syncBlanko(sync).enqueue(callback);
    }
}
