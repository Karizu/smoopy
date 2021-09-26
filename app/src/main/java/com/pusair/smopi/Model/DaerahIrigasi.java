package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class DaerahIrigasi extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("kd_di")
    private String kd_di;

    @Expose
    @SerializedName("nm_di")
    private String nm_di;

    @Expose
    @SerializedName("klasifikasi")
    private String klasifikasi;

    @Expose
    @SerializedName("thn_bangun")
    private String thn_bangun;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

    @Expose
    @SerializedName("kewenangan")
    private String kewenangan;

    @Expose
    @SerializedName("sumber")
    private String sumber;

    @Expose
    @SerializedName("nm_sumber")
    private String nm_sumber;

    @Expose
    @SerializedName("tmt_di")
    private String tmt_di;

    @Expose
    @SerializedName("kd_das")
    private String kd_das;

    @Expose
    @SerializedName("tmt_das")
    private String tmt_das;

    @Expose
    @SerializedName("hapus")
    private int hapus;

    @Expose
    @SerializedName("kd_ws")
    private String kd_ws;

    @Expose
    @SerializedName("tmt_ws")
    private String tmt_ws;

    @Expose
    @SerializedName("fpr")
    private float fpr;

    @Expose
    @SerializedName("perkolasi")
    private int perkolasi;

    @Expose
    @SerializedName("kd_kab")
    private String kd_kab;

    @Expose
    @SerializedName("kd_prop")
    private String kd_prop;

    @Expose
    @SerializedName("kd_pulau")
    private String kd_pulau;

    @Expose
    @SerializedName("nm_ws")
    private String nm_ws;

    @Expose
    @SerializedName("luas_ws")
    private float luas_ws;

    @Expose
    @SerializedName("stok_air")
    private float stok_air;

    @Expose
    @SerializedName("nm_kab")
    private String nm_kab;

    @Expose
    @SerializedName("nm_prop")
    private String nm_prop;

    @Expose
    @SerializedName("kriteria_ws")
    private String kriteria_ws;

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

    public String getNm_di() {
        return nm_di;
    }

    public void setNm_di(String nm_di) {
        this.nm_di = nm_di;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public String getThn_bangun() {
        return thn_bangun;
    }

    public void setThn_bangun(String thn_bangun) {
        this.thn_bangun = thn_bangun;
    }

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
    }

    public String getKewenangan() {
        return kewenangan;
    }

    public void setKewenangan(String kewenangan) {
        this.kewenangan = kewenangan;
    }

    public String getSumber() {
        return sumber;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }

    public String getNm_sumber() {
        return nm_sumber;
    }

    public void setNm_sumber(String nm_sumber) {
        this.nm_sumber = nm_sumber;
    }

    public String getTmt_di() {
        return tmt_di;
    }

    public void setTmt_di(String tmt_di) {
        this.tmt_di = tmt_di;
    }

    public String getKd_das() {
        return kd_das;
    }

    public void setKd_das(String kd_das) {
        this.kd_das = kd_das;
    }

    public String getTmt_das() {
        return tmt_das;
    }

    public void setTmt_das(String tmt_das) {
        this.tmt_das = tmt_das;
    }

    public int getHapus() {
        return hapus;
    }

    public void setHapus(int hapus) {
        this.hapus = hapus;
    }

    public String getKd_ws() {
        return kd_ws;
    }

    public void setKd_ws(String kd_ws) {
        this.kd_ws = kd_ws;
    }

    public String getTmt_ws() {
        return tmt_ws;
    }

    public void setTmt_ws(String tmt_ws) {
        this.tmt_ws = tmt_ws;
    }

    public float getFpr() {
        return fpr;
    }

    public void setFpr(float fpr) {
        this.fpr = fpr;
    }

    public int getPerkolasi() {
        return perkolasi;
    }

    public void setPerkolasi(int perkolasi) {
        this.perkolasi = perkolasi;
    }

    public String getKd_kab() {
        return kd_kab;
    }

    public void setKd_kab(String kd_kab) {
        this.kd_kab = kd_kab;
    }

    public String getKd_prop() {
        return kd_prop;
    }

    public void setKd_prop(String kd_prop) {
        this.kd_prop = kd_prop;
    }

    public String getKd_pulau() {
        return kd_pulau;
    }

    public void setKd_pulau(String kd_pulau) {
        this.kd_pulau = kd_pulau;
    }

    public String getNm_ws() {
        return nm_ws;
    }

    public void setNm_ws(String nm_ws) {
        this.nm_ws = nm_ws;
    }

    public float getLuas_ws() {
        return luas_ws;
    }

    public void setLuas_ws(float luas_ws) {
        this.luas_ws = luas_ws;
    }

    public float getStok_air() {
        return stok_air;
    }

    public void setStok_air(float stok_air) {
        this.stok_air = stok_air;
    }

    public String getNm_kab() {
        return nm_kab;
    }

    public void setNm_kab(String nm_kab) {
        this.nm_kab = nm_kab;
    }

    public String getNm_prop() {
        return nm_prop;
    }

    public void setNm_prop(String nm_prop) {
        this.nm_prop = nm_prop;
    }

    public String getKriteria_ws() {
        return kriteria_ws;
    }

    public void setKriteria_ws(String kriteria_ws) {
        this.kriteria_ws = kriteria_ws;
    }
}
