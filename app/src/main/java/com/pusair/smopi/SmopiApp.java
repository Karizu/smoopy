package com.pusair.smopi;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.pusair.smopi.Api.ApiInterface;
import com.pusair.smopi.Model.SmopiRealmModule;
import com.rezkyatinnov.kyandroid.Kyandroid;
import com.rezkyatinnov.kyandroid.localdata.KyandroidRealmModule;

public class SmopiApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Kyandroid.init(this,
                ApiInterface.BASE_URL,
                ApiInterface.class,
                "smopiapp",
                Context.MODE_PRIVATE,
                "smopi_db",
                1,
                false,
                new KyandroidRealmModule(),
                new SmopiRealmModule());
    }
}
