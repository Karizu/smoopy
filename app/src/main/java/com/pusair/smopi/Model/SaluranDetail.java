package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class SaluranDetail extends RealmObject {

    @PrimaryKey
    @Expose
    @SerializedName("nm_bangtrol")
    private String nm_bangtrol;

    @Expose
    @SerializedName("urutan")
    private int urutan;

    @Expose
    @SerializedName("tmt_bangtrol")
    private String tmt_bangtrol;

    @Expose
    @SerializedName("kd_saluran")
    private String kd_saluran;

    @Expose
    @SerializedName("tmt_saluran")
    private String tmt_saluran;

    @Expose
    @SerializedName("kd_jnsbang")
    private int kd_jnsbang;

    @Expose
    @SerializedName("nm_bangtrolpar")
    private String nm_bangtrolpar;

    @Expose
    @SerializedName("tmt_bangtrolpar")
    private String tmt_bangtrolpar;

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
    @SerializedName("petak_tersier")
    private float petak_tersier;

    @Expose
    @SerializedName("panjang")
    private float panjang;

    @Expose
    @SerializedName("lebar")
    private float lebar;

    @Expose
    @SerializedName("tinggi")
    private float tinggi;

    @Expose
    @SerializedName("ruas_sal")
    private int ruas_sal;

    @Expose
    @SerializedName("jum_pintu")
    private int jum_pintu;

    @Expose
    @SerializedName("nm_jnsbang")
    private String nm_jnsbang;

    public String getNm_bangtrol() {
        return nm_bangtrol;
    }

    public void setNm_bangtrol(String nm_bangtrol) {
        this.nm_bangtrol = nm_bangtrol;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    public String getTmt_bangtrol() {
        return tmt_bangtrol;
    }

    public void setTmt_bangtrol(String tmt_bangtrol) {
        this.tmt_bangtrol = tmt_bangtrol;
    }

    public String getKd_saluran() {
        return kd_saluran;
    }

    public void setKd_saluran(String kd_saluran) {
        this.kd_saluran = kd_saluran;
    }

    public String getTmt_saluran() {
        return tmt_saluran;
    }

    public void setTmt_saluran(String tmt_saluran) {
        this.tmt_saluran = tmt_saluran;
    }

    public int getKd_jnsbang() {
        return kd_jnsbang;
    }

    public void setKd_jnsbang(int kd_jnsbang) {
        this.kd_jnsbang = kd_jnsbang;
    }

    public String getNm_bangtrolpar() {
        return nm_bangtrolpar;
    }

    public void setNm_bangtrolpar(String nm_bangtrolpar) {
        this.nm_bangtrolpar = nm_bangtrolpar;
    }

    public String getTmt_bangtrolpar() {
        return tmt_bangtrolpar;
    }

    public void setTmt_bangtrolpar(String tmt_bangtrolpar) {
        this.tmt_bangtrolpar = tmt_bangtrolpar;
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

    public float getPetak_tersier() {
        return petak_tersier;
    }

    public void setPetak_tersier(float petak_tersier) {
        this.petak_tersier = petak_tersier;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public int getRuas_sal() {
        return ruas_sal;
    }

    public void setRuas_sal(int ruas_sal) {
        this.ruas_sal = ruas_sal;
    }

    public int getJum_pintu() {
        return jum_pintu;
    }

    public void setJum_pintu(int jum_pintu) {
        this.jum_pintu = jum_pintu;
    }

    public String getNm_jnsbang() {
        return nm_jnsbang;
    }

    public void setNm_jnsbang(String nm_jnsbang) {
        this.nm_jnsbang = nm_jnsbang;
    }
}
