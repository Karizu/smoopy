package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class BlankoP01 extends RealmObject {

    @Expose
    @PrimaryKey
    @SerializedName("id_b01")
    private int id_b01;

    @Expose
    @SerializedName("tgl_inspeksi")
    private String tgl_inspeksi;

    @Expose
    @SerializedName("tmt_saluran")
    private String tmt_saluran;

    @Expose
    @SerializedName("nm_bangtrol")
    private String nm_bangtrol;

    @Expose
    @SerializedName("tmt_bangtrol")
    private String tmt_bangtrol;

    @Expose
    @SerializedName("kd_staf")
    private String kd_staf;

    @Expose
    @SerializedName("pelaksana")
    private String pelaksana;

    @Expose
    @SerializedName("usulan_tindakan")
    private String usulan_tindakan;

    @Expose
    @SerializedName("areal_layanan")
    private float areal_layanan;

    @Expose
    @SerializedName("desa_kecamatan")
    private String desa_kecamatan;

    @Expose
    @SerializedName("koordl")
    private double koordl;

    @Expose
    @SerializedName("koordb")
    private double koordb;

    @Expose
    @SerializedName("kd_saluran")
    private String kd_saluran;

    @Expose
    @SerializedName("tgledit")
    private String tgledit;

    @Expose
    @SerializedName("tglrekam")
    private String tglrekam;

    @Expose
    @SerializedName("deleterec")
    private String deleterec;

    @Expose
    @SerializedName("flag")
    private boolean flag;

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getDeleterec() {
        return deleterec;
    }

    public void setDeleterec(String deleterec) {
        this.deleterec = deleterec;
    }

    public int getId_b01() {
        return id_b01;
    }

    public void setId_b01(int id_b01) {
        this.id_b01 = id_b01;
    }

    public String getTgl_inspeksi() {
        return tgl_inspeksi;
    }

    public void setTgl_inspeksi(String tgl_inspeksi) {
        this.tgl_inspeksi = tgl_inspeksi;
    }

    public String getTmt_saluran() {
        return tmt_saluran;
    }

    public void setTmt_saluran(String tmt_saluran) {
        this.tmt_saluran = tmt_saluran;
    }

    public String getNm_bangtrol() {
        return nm_bangtrol;
    }

    public void setNm_bangtrol(String nm_bangtrol) {
        this.nm_bangtrol = nm_bangtrol;
    }

    public String getTmt_bangtrol() {
        return tmt_bangtrol;
    }

    public void setTmt_bangtrol(String tmt_bangtrol) {
        this.tmt_bangtrol = tmt_bangtrol;
    }

    public String getKd_staf() {
        return kd_staf;
    }

    public void setKd_staf(String kd_staf) {
        this.kd_staf = kd_staf;
    }

    public String getPelaksana() {
        return pelaksana;
    }

    public void setPelaksana(String pelaksana) {
        this.pelaksana = pelaksana;
    }

    public String getUsulan_tindakan() {
        return usulan_tindakan;
    }

    public void setUsulan_tindakan(String usulan_tindakan) {
        this.usulan_tindakan = usulan_tindakan;
    }

    public float getAreal_layanan() {
        return areal_layanan;
    }

    public void setAreal_layanan(float areal_layanan) {
        this.areal_layanan = areal_layanan;
    }

    public String getDesa_kecamatan() {
        return desa_kecamatan;
    }

    public void setDesa_kecamatan(String desa_kecamatan) {
        this.desa_kecamatan = desa_kecamatan;
    }

    public double getKoordl() {
        return koordl;
    }

    public void setKoordl(double koordl) {
        this.koordl = koordl;
    }

    public double getKoordb() {
        return koordb;
    }

    public void setKoordb(double koordb) {
        this.koordb = koordb;
    }

    public String getKd_saluran() {
        return kd_saluran;
    }

    public void setKd_saluran(String kd_saluran) {
        this.kd_saluran = kd_saluran;
    }

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

    public String getTgledit() {
        return tgledit;
    }

    public void setTgledit(String tgledit) {
        this.tgledit = tgledit;
    }

    public String getTglrekam() {
        return tglrekam;
    }

    public void setTglrekam(String tglrekam) {
        this.tglrekam = tglrekam;
    }
}
