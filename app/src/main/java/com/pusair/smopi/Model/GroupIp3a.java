package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class GroupIp3a extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("kd_staf")
    private String kd_staf;

    @Expose
    @SerializedName("kd_org")
    private String kd_org;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

    @Expose
    @SerializedName("tgledit")
    private String tgledit;

    public String getKd_staf() {
        return kd_staf;
    }

    public void setKd_staf(String kd_staf) {
        this.kd_staf = kd_staf;
    }

    public String getKd_org() {
        return kd_org;
    }

    public void setKd_org(String kd_org) {
        this.kd_org = kd_org;
    }

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
    }

    public String getTgledit() {
        return tgledit;
    }

    public void setTgledit(String tgledit) {
        this.tgledit = tgledit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
