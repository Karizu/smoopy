package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Blanko08 extends RealmObject {
    @PrimaryKey
    private String id;
    @SerializedName("kd_staf")
    @Expose
    private String kd_staf;
    @Expose
    @SerializedName("kd_mt")
    private int kd_mt;
    @SerializedName("thbln")
    @Expose
    private String thbln;
    @SerializedName("poda_air")
    @Expose
    private int poda_air;
    @SerializedName("tgl")
    @Expose
    private String tgl;
    @SerializedName("h_bendung")
    @Expose
    private float h_bendung;
    @SerializedName("q_bendung")
    @Expose
    private float q_bendung;
    @SerializedName("h_ki_ambil")
    @Expose
    private float h_ki_ambil;
    @SerializedName("q_ki_ambil")
    @Expose
    private float q_ki_ambil;
    @SerializedName("h_ka_ambil")
    @Expose
    private float h_ka_ambil;
    @SerializedName("q_ka_ambil")
    @Expose
    private float q_ka_ambil;
    @SerializedName("qsungai")
    @Expose
    private float qsungai;
    @SerializedName("qsungai_rata")
    @Expose
    private float qsungai_rata;
    @SerializedName("qef_ki")
    @Expose
    private String qef_ki;
    @SerializedName("qef_ka")
    @Expose
    private String qef_ka;
    @SerializedName("pelaksana")
    @Expose
    private String pelaksana;
    @SerializedName("verify")
    @Expose
    private String verify;
    @SerializedName("sungai")
    @Expose
    private String sungai;
    @SerializedName("bendung")
    @Expose
    private String bendung;
    @SerializedName("tgledit")
    @Expose
    private String tgledit;
    @SerializedName("flag")
    @Expose
    private Boolean flag;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getThbln() {
        return thbln;
    }

    public void setThbln(String thbln) {
        this.thbln = thbln;
    }

    public Integer getPoda_air() {
        return poda_air;
    }

    public void setPoda_air(Integer poda_air) {
        this.poda_air = poda_air;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public float getH_bendung() {
        return h_bendung;
    }

    public void setH_bendung(float h_bendung) {
        this.h_bendung = h_bendung;
    }

    public float getQ_bendung() {
        return q_bendung;
    }

    public void setQ_bendung(float q_bendung) {
        this.q_bendung = q_bendung;
    }

    public float getH_ki_ambil() {
        return h_ki_ambil;
    }

    public void setH_ki_ambil(float h_ki_ambil) {
        this.h_ki_ambil = h_ki_ambil;
    }

    public float getQ_ki_ambil() {
        return q_ki_ambil;
    }

    public void setQ_ki_ambil(float q_ki_ambil) {
        this.q_ki_ambil = q_ki_ambil;
    }

    public float getH_ka_ambil() {
        return h_ka_ambil;
    }

    public void setH_ka_ambil(float h_ka_ambil) {
        this.h_ka_ambil = h_ka_ambil;
    }

    public float getQ_ka_ambil() {
        return q_ka_ambil;
    }

    public void setQ_ka_ambil(float q_ka_ambil) {
        this.q_ka_ambil = q_ka_ambil;
    }

    public float getQsungai() {
        return qsungai;
    }

    public void setQsungai(float qsungai) {
        this.qsungai = qsungai;
    }

    public float getQsungai_rata() {
        return qsungai_rata;
    }

    public void setQsungai_rata(float qsungai_rata) {
        this.qsungai_rata = qsungai_rata;
    }

    public String getQef_ki() {
        return qef_ki;
    }

    public void setQef_ki(String qef_ki) {
        this.qef_ki = qef_ki;
    }

    public String getQef_ka() {
        return qef_ka;
    }

    public void setQef_ka(String qef_ka) {
        this.qef_ka = qef_ka;
    }

    public String getPelaksana() {
        return pelaksana;
    }

    public void setPelaksana(String pelaksana) {
        this.pelaksana = pelaksana;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getSungai() {
        return sungai;
    }

    public void setSungai(String sungai) {
        this.sungai = sungai;
    }

    public String getBendung() {
        return bendung;
    }

    public void setBendung(String bendung) {
        this.bendung = bendung;
    }

    public String getTgledit() {
        return tgledit;
    }

    public void setTgledit(String tgledit) {
        this.tgledit = tgledit;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public void setPoda_air(int poda_air) {
        this.poda_air = poda_air;
    }

    public String getDeleterec() {
        return deleterec;
    }

    public void setDeleterec(String deleterec) {
        this.deleterec = deleterec;
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
}
