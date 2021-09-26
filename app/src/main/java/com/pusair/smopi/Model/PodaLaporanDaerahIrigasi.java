package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class PodaLaporanDaerahIrigasi extends RealmObject {

    @PrimaryKey
    private String id;

    @SerializedName("kd_di")
    @Expose
    private String kd_di;

    @SerializedName("tmt_di")
    @Expose
    private String tmt_di;

    @SerializedName("perioda")
    @Expose
    private int perioda;

    @SerializedName("tmt")
    @Expose
    private String tmt;

    public String getKd_di() {
        return kd_di;
    }

    public void setKd_di(String kd_di) {
        this.kd_di = kd_di;
    }

    public String getTmt_di() {
        return tmt_di;
    }

    public void setTmt_di(String tmt_di) {
        this.tmt_di = tmt_di;
    }

    public int getPerioda() {
        return perioda;
    }

    public void setPerioda(int perioda) {
        this.perioda = perioda;
    }

    public String getTmt() {
        return tmt;
    }

    public void setTmt(String tmt) {
        this.tmt = tmt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
