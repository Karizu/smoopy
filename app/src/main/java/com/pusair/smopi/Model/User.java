package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {

    @Expose
    @SerializedName("nm_usr")
    private String nm_usr;

    @Expose
    @SerializedName("passwd")
    private String passwd;

    @Expose
    @SerializedName("previl")
    private String previl;

    @Expose
    @SerializedName("nm_staf")
    private String nm_staf;

    @Expose
    @SerializedName("nrp")
    private String nrp;

    @Expose
    @SerializedName("gol")
    private String gol;

    @Expose
    @SerializedName("nohp")
    private String nohp;

    @Expose
    @SerializedName("pendidikan")
    private String pendidikan;

    @Expose
    @SerializedName("kd_prop")
    private String kd_prop;

    @Expose
    @SerializedName("kd_bws")
    private String kd_bws;

    @Expose
    @SerializedName("kd_di")
    private String kd_di;

    @Expose
    @SerializedName("tmt_di")
    private String tmt_di;

    @Expose
    @SerializedName("kd_kab")
    private String kd_kab;

    @Expose
    @PrimaryKey
    @SerializedName("kd_staf")
    private String kd_staf;

    @Expose
    @SerializedName("kecamatan")
    private String kecamatan;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

    @Expose
    @SerializedName("wil_kerja")
    private String wil_kerja;

    @Expose
    @SerializedName("petak_tersier")
    private int petak_tersier;

    @Expose
    @SerializedName("aktif")
    private String aktif;

    @Expose
    @SerializedName("kd_jbtkasi")
    private String kd_jbtkasi;

    @Expose
    @SerializedName("kd_stafboss")
    private String kd_stafboss;

    @Expose
    @SerializedName("nm_di")
    private String nm_di;

    @Expose
    @SerializedName("id_ppa")
    private String id_ppa;

    @Expose
    @SerializedName("nm_ppa")
    private String nm_ppa;

    @Expose
    @SerializedName("nm_bangtrol")
    private String nm_bangtrol;

    @Expose
    @SerializedName("tmt_bangtrol")
    private String tmt_bangtrol;

    @Expose
    private DaerahIrigasi daerahIrigasi;

    public String getId_ppa() {
        return id_ppa;
    }

    public void setId_ppa(String id_ppa) {
        this.id_ppa = id_ppa;
    }

    public String getNm_ppa() {
        return nm_ppa;
    }

    public void setNm_ppa(String nm_ppa) {
        this.nm_ppa = nm_ppa;
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

    public String getNm_usr() {
        return nm_usr;
    }

    public void setNm_usr(String nm_usr) {
        this.nm_usr = nm_usr;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPrevil() {
        return previl;
    }

    public void setPrevil(String previl) {
        this.previl = previl;
    }

    public String getNm_staf() {
        return nm_staf;
    }

    public void setNm_staf(String nm_staf) {
        this.nm_staf = nm_staf;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getKd_prop() {
        return kd_prop;
    }

    public void setKd_prop(String kd_prop) {
        this.kd_prop = kd_prop;
    }

    public String getKd_bws() {
        return kd_bws;
    }

    public void setKd_bws(String kd_bws) {
        this.kd_bws = kd_bws;
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

    public String getKd_kab() {
        return kd_kab;
    }

    public void setKd_kab(String kd_kab) {
        this.kd_kab = kd_kab;
    }

    public String getKd_staf() {
        return kd_staf;
    }

    public void setKd_staf(String kd_staf) {
        this.kd_staf = kd_staf;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
    }

    public String getWil_kerja() {
        return wil_kerja;
    }

    public void setWil_kerja(String wil_kerja) {
        this.wil_kerja = wil_kerja;
    }

    public int getPetak_tersier() {
        return petak_tersier;
    }

    public void setPetak_tersier(int petak_tersier) {
        this.petak_tersier = petak_tersier;
    }

    public String getAktif() {
        return aktif;
    }

    public void setAktif(String aktif) {
        this.aktif = aktif;
    }

    public String getKd_jbtkasi() {
        return kd_jbtkasi;
    }

    public void setKd_jbtkasi(String kd_jbtkasi) {
        this.kd_jbtkasi = kd_jbtkasi;
    }

    public String getKd_stafboss() {
        return kd_stafboss;
    }

    public void setKd_stafboss(String kd_stafboss) {
        this.kd_stafboss = kd_stafboss;
    }

    public String getNm_di() {
        return nm_di;
    }

    public void setNm_di(String nm_di) {
        this.nm_di = nm_di;
    }

    public DaerahIrigasi getDaerahIrigasi() {
        return daerahIrigasi;
    }

    public void setDaerahIrigasi(DaerahIrigasi daerahIrigasi) {
        this.daerahIrigasi = daerahIrigasi;
    }
}
