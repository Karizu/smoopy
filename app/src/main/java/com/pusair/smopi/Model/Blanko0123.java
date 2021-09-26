package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.NonNull;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Blanko0123 extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("kd_staf")
    private String kd_staf;

    @Expose
    @SerializedName("kd_mt")
    private int kd_mt;

    @Expose
    @SerializedName("kd_org")
    private String kd_org;

    @Expose
    @SerializedName("jenis_uk")
    private String jenis_uk;

    @Expose
    @SerializedName("urut_mt")
    private String urut_mt;

    @Expose
    @SerializedName("padi")
    private float padi;

    @Expose
    @SerializedName("tebu_tua")
    private float tebu_tua;

    @Expose
    @SerializedName("tebu_muda")
    private float tebu_muda;

    @Expose
    @SerializedName("palawija")
    private float palawija;

    @Expose
    @SerializedName("lain")
    private float lain;

    @Expose
    @SerializedName("bero")
    private float bero;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

    @Expose
    @SerializedName("gol")
    private String gol;

    @Expose
    @SerializedName("tgl_olah")
    private String tgl_olah;

    @Expose
    @SerializedName("tgledit")
    private String tgledit;

    @Expose
    @SerializedName("tgl_airaw")
    private String tgl_airaw;

    @Expose
    @SerializedName("tgl_airak")
    private String tgl_airak;

    @Expose
    @SerializedName("tgl_mt")
    private String tgl_mt;

    @Expose
    @SerializedName("verify")
    private String verify;

    @Expose
    @SerializedName("flag")
    private boolean flag;

    @Expose
    @SerializedName("deleterec")
    private String deleterec;

    @Expose
    @SerializedName("insert")
    private String insert;

    @Expose
    @SerializedName("update")
    private String update;

    @Expose
    @SerializedName("skip_update")
    private String skip_update;

    @Expose
    @SerializedName("delete")
    private String delete;

    @Expose
    @SerializedName("rec_baru_server")
    private String rec_baru_server;

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getSkip_update() {
        return skip_update;
    }

    public void setSkip_update(String skip_update) {
        this.skip_update = skip_update;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getRec_baru_server() {
        return rec_baru_server;
    }

    public void setRec_baru_server(String rec_baru_server) {
        this.rec_baru_server = rec_baru_server;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getKd_staf() {
        return kd_staf;
    }

    public void setKd_staf(String kd_staf) {
        this.kd_staf = kd_staf;
    }

    public int getKd_mt() {
        return kd_mt;
    }

    public void setKd_mt(int kd_mt) {
        this.kd_mt = kd_mt;
    }

    public String getKd_org() {
        return kd_org;
    }

    public void setKd_org(String kd_org) {
        this.kd_org = kd_org;
    }

    public String getJenis_uk() {
        return jenis_uk;
    }

    public void setJenis_uk(String jenis_uk) {
        this.jenis_uk = jenis_uk;
    }

    public String getUrut_mt() {
        return urut_mt;
    }

    public void setUrut_mt(String urut_mt) {
        this.urut_mt = urut_mt;
    }

    public float getPadi() {
        return padi;
    }

    public void setPadi(float padi) {
        this.padi = padi;
    }

    public float getTebu_tua() {
        return tebu_tua;
    }

    public void setTebu_tua(float tebu_tua) {
        this.tebu_tua = tebu_tua;
    }

    public float getTebu_muda() {
        return tebu_muda;
    }

    public void setTebu_muda(float tebu_muda) {
        this.tebu_muda = tebu_muda;
    }

    public float getPalawija() {
        return palawija;
    }

    public void setPalawija(float palawija) {
        this.palawija = palawija;
    }

    public float getLain() {
        return lain;
    }

    public void setLain(float lain) {
        this.lain = lain;
    }

    public float getBero() {
        return bero;
    }

    public void setBero(float bero) {
        this.bero = bero;
    }

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
    }

    public String getTgl_olah() {
        return tgl_olah;
    }

    public void setTgl_olah(String tgl_olah) {
        this.tgl_olah = tgl_olah;
    }

    public String getTgledit() {
        return tgledit;
    }

    public void setTgledit(String tgledit) {
        this.tgledit = tgledit;
    }

    public String getTgl_airaw() {
        return tgl_airaw;
    }

    public void setTgl_airaw(String tgl_airaw) {
        this.tgl_airaw = tgl_airaw;
    }

    public String getTgl_airak() {
        return tgl_airak;
    }

    public void setTgl_airak(String tgl_airak) {
        this.tgl_airak = tgl_airak;
    }

    public String getTgl_mt() {
        return tgl_mt;
    }

    public void setTgl_mt(String tgl_mt) {
        this.tgl_mt = tgl_mt;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeleterec() {
        return deleterec;
    }

    public void setDeleterec(String deleterec) {
        this.deleterec = deleterec;
    }
}
