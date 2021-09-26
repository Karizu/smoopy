package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RentangMusimTanam extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("kd_di")
    private String kd_di;

    @Expose
    @SerializedName("tmt_di")
    private String tmt_di;

    @Expose
    @SerializedName("kd_mt")
    private int kd_mt;

    @Expose
    @SerializedName("blnaw")
    private int blnaw;

    @Expose
    @SerializedName("thnaw")
    private String thnaw;

    @Expose
    @SerializedName("blnak")
    private int blnak;

    @Expose
    @SerializedName("thnak")
    private String thnak;

    @Expose
    @SerializedName("podaw")
    private int podaw;

    @Expose
    @SerializedName("podak")
    private int podak;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getKd_mt() {
        return kd_mt;
    }

    public void setKd_mt(int kd_mt) {
        this.kd_mt = kd_mt;
    }

    public int getBlnaw() {
        return blnaw;
    }

    public void setBlnaw(int blnaw) {
        this.blnaw = blnaw;
    }

    public String getThnaw() {
        return thnaw;
    }

    public void setThnaw(String thnaw) {
        this.thnaw = thnaw;
    }

    public int getBlnak() {
        return blnak;
    }

    public void setBlnak(int blnak) {
        this.blnak = blnak;
    }

    public String getThnak() {
        return thnak;
    }

    public void setThnak(String thnak) {
        this.thnak = thnak;
    }

    public int getPodaw() {
        return podaw;
    }

    public void setPodaw(int podaw) {
        this.podaw = podaw;
    }

    public int getPodak() {
        return podak;
    }

    public void setPodak(int podak) {
        this.podak = podak;
    }
}
