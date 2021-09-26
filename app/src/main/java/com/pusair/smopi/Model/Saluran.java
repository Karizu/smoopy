package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Saluran extends RealmObject {

    @PrimaryKey
    @Expose
    @SerializedName("kd_saluran")
    private String kd_saluran;

    @Expose
    @SerializedName("nm_saluran")
    private String nm_saluran;

    @Expose
    @SerializedName("jns_saluran")
    private String jns_saluran;

    @Expose
    @SerializedName("tmt_saluran")
    private String tmt_saluran;

    @Expose
    @SerializedName("panjang")
    private float panjang;

    @Expose
    @SerializedName("kd_di")
    private String kd_di;

    @Expose
    @SerializedName("tmt_di")
    private String tmt_di;

    @Expose
    @SerializedName("kd_saluranpar")
    private String kd_saluranpar;

    @Expose
    @SerializedName("tmt_saluranpar")
    private String tmt_saluranpar;

    @Expose
    @SerializedName("kd_bangbil")
    private String kd_bangbil;

    @Expose
    @SerializedName("hapus")
    private int hapus;

    @Expose
    @SerializedName("lat")
    private double lat;

    @Expose
    @SerializedName("lon")
    private double lon;

    @Expose
    @SerializedName("nm_bangtrolbil")
    private String nm_bangtrolbil;

    @Expose
    @SerializedName("tmt_bangtrolbil")
    private String tmt_bangtrolbil;

    @Expose
    @SerializedName("lebar_dasar")
    private float lebar_dasar;

    @Expose
    @SerializedName("tinggi")
    private float tinggi;

    @Expose
    @SerializedName("ruas_aw")
    private int ruas_aw;

    @Expose
    @SerializedName("ruas_ak")
    private int ruas_ak;

    @Expose
    @SerializedName("jns_bangbil")
    private String jns_bangbil;

    public String getKd_saluran() {
        return kd_saluran;
    }

    public void setKd_saluran(String kd_saluran) {
        this.kd_saluran = kd_saluran;
    }

    public String getNm_saluran() {
        return nm_saluran;
    }

    public void setNm_saluran(String nm_saluran) {
        this.nm_saluran = nm_saluran;
    }

    public String getJns_saluran() {
        return jns_saluran;
    }

    public void setJns_saluran(String jns_saluran) {
        this.jns_saluran = jns_saluran;
    }

    public String getTmt_saluran() {
        return tmt_saluran;
    }

    public void setTmt_saluran(String tmt_saluran) {
        this.tmt_saluran = tmt_saluran;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
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

    public String getKd_saluranpar() {
        return kd_saluranpar;
    }

    public void setKd_saluranpar(String kd_saluranpar) {
        this.kd_saluranpar = kd_saluranpar;
    }

    public String getTmt_saluranpar() {
        return tmt_saluranpar;
    }

    public void setTmt_saluranpar(String tmt_saluranpar) {
        this.tmt_saluranpar = tmt_saluranpar;
    }

    public String getKd_bangbil() {
        return kd_bangbil;
    }

    public void setKd_bangbil(String kd_bangbil) {
        this.kd_bangbil = kd_bangbil;
    }

    public int getHapus() {
        return hapus;
    }

    public void setHapus(int hapus) {
        this.hapus = hapus;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getNm_bangtrolbil() {
        return nm_bangtrolbil;
    }

    public void setNm_bangtrolbil(String nm_bangtrolbil) {
        this.nm_bangtrolbil = nm_bangtrolbil;
    }

    public String getTmt_bangtrolbil() {
        return tmt_bangtrolbil;
    }

    public void setTmt_bangtrolbil(String tmt_bangtrolbil) {
        this.tmt_bangtrolbil = tmt_bangtrolbil;
    }

    public float getLebar_dasar() {
        return lebar_dasar;
    }

    public void setLebar_dasar(float lebar_dasar) {
        this.lebar_dasar = lebar_dasar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public int getRuas_aw() {
        return ruas_aw;
    }

    public void setRuas_aw(int ruas_aw) {
        this.ruas_aw = ruas_aw;
    }

    public int getRuas_ak() {
        return ruas_ak;
    }

    public void setRuas_ak(int ruas_ak) {
        this.ruas_ak = ruas_ak;
    }

    public String getJns_bangbil() {
        return jns_bangbil;
    }

    public void setJns_bangbil(String jns_bangbil) {
        this.jns_bangbil = jns_bangbil;
    }
}
