package com.pusair.smopi.Api;

import com.pusair.smopi.Model.ApiResponse;
import com.pusair.smopi.Model.FirstInit;
import com.rezkyatinnov.kyandroid.reztrofit.RestCallback;
import com.rezkyatinnov.kyandroid.reztrofit.Reztrofit;

public class FirstInitHelper {

    public static void firstInit(String username, RestCallback<ApiResponse> callback){
        Reztrofit<ApiInterface> service = Reztrofit.getInstance();
        service.getEndpoint().firstInit(username).enqueue(callback);
    }
}
