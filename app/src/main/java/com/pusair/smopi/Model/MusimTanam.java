package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class MusimTanam extends RealmObject {

    @Expose
    @PrimaryKey
    @SerializedName("kd_mt")
    private int kd_mt;

    @Expose
    @SerializedName("thn_mt")
    private String thn_mt;

    public int getKd_mt() {
        return kd_mt;
    }

    public void setKd_mt(int kd_mt) {
        this.kd_mt = kd_mt;
    }

    public String getThn_mt() {
        return thn_mt;
    }

    public void setThn_mt(String thn_mt) {
        this.thn_mt = thn_mt;
    }
}
