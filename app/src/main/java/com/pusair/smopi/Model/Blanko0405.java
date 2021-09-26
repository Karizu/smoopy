package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Blanko0405 extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("kd_staf")
    private String kd_staf;

    @Expose
    @SerializedName("kd_mt")
    private int kd_mt;

    @Expose
    @SerializedName("urut_mt")
    private String urut_mt;

    @Expose
    @SerializedName("thbln")
    private String thbln;

    @Expose
    @SerializedName("poda_air")
    private int poda_air;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

    @Expose
    @SerializedName("rs_padi")
    private float rs_padi;

    @Expose
    @SerializedName("rs_tebu_muda")
    private float rs_tebu_muda;

    @Expose
    @SerializedName("rs_tebu_tua")
    private float rs_tebu_tua;

    @Expose
    @SerializedName("rs_palawija")
    private float rs_palawija;

    @Expose
    @SerializedName("rs_gadu")
    private float rs_gadu;

    @Expose
    @SerializedName("rs_lain")
    private float rs_lain;

    @Expose
    @SerializedName("rs_bero")
    private float rs_bero;

    @Expose
    @SerializedName("us_padi_olahtanah")
    private float us_padi_olahtanah;

    @Expose
    @SerializedName("us_padi_tumbuh")
    private float us_padi_tumbuh;

    @Expose
    @SerializedName("us_padi_panen")
    private float us_padi_panen;

    @Expose
    @SerializedName("us_tebu_olahtanah")
    private float us_tebu_olahtanah;

    @Expose
    @SerializedName("us_tebu_muda")
    private float us_tebu_muda;

    @Expose
    @SerializedName("us_tebu_tua")
    private float us_tebu_tua;

    @Expose
    @SerializedName("us_wija_byk_air")
    private float us_wija_byk_air;

    @Expose
    @SerializedName("us_wija_dkt_air")
    private float us_wija_dkt_air;

    @Expose
    @SerializedName("us_gadu")
    private float us_gadu;

    @Expose
    @SerializedName("us_lain")
    private float us_lain;

    @Expose
    @SerializedName("us_bero")
    private float us_bero;

    @Expose
    @SerializedName("ka_airpetak")
    private String ka_airpetak;

    @Expose
    @SerializedName("padi_krg")
    private float padi_krg;

    @Expose
    @SerializedName("tebu_krg")
    private float tebu_krg;

    @Expose
    @SerializedName("wija_krg")
    private float wija_krg;

    @Expose
    @SerializedName("padi_bjr")
    private float padi_bjr;

    @Expose
    @SerializedName("tebu_bjr")
    private float tebu_bjr;

    @Expose
    @SerializedName("wija_bjr")
    private float wija_bjr;

    @Expose
    @SerializedName("kb_padi_olahtanah")
    private float kb_padi_olahtanah;

    @Expose
    @SerializedName("kb_padi_tumbuh")
    private float kb_padi_tumbuh;

    @Expose
    @SerializedName("kb_padi_panen")
    private float kb_padi_panen;

    @Expose
    @SerializedName("kb_tebu_olahtanah")
    private float kb_tebu_olahtanah;

    @Expose
    @SerializedName("kb_tebu_muda")
    private float kb_tebu_muda;

    @Expose
    @SerializedName("kb_tebu_tua")
    private float kb_tebu_tua;

    @Expose
    @SerializedName("kb_wija_byk_air")
    private float kb_wija_byk_air;

    @Expose
    @SerializedName("kb_wija_dkt_air")
    private float kb_wija_dkt_air;

    @Expose
    @SerializedName("kb_gadu")
    private float kb_gadu;

    @Expose
    @SerializedName("kb_lain")
    private float kb_lain;

    @Expose
    @SerializedName("jum_dsawah")
    private float jum_dsawah;

    @Expose
    @SerializedName("faktor_tersier")
    private float faktor_tersier;

    @Expose
    @SerializedName("air_tersier")
    private float air_tersier;

    @Expose
    @SerializedName("kerusakan")
    private float kerusakan;

    @Expose
    @SerializedName("pelaksana")
    private String pelaksana;

    @Expose
    @SerializedName("verify")
    private int verify;

    @Expose
    @SerializedName("tgledit")
    private String tgledit;

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

    public String getDeleterec() {
        return deleterec;
    }

    public void setDeleterec(String deleterec) {
        this.deleterec = deleterec;
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

    public String getUrut_mt() {
        return urut_mt;
    }

    public void setUrut_mt(String urut_mt) {
        this.urut_mt = urut_mt;
    }

    public String getThbln() {
        return thbln;
    }

    public void setThbln(String thbln) {
        this.thbln = thbln;
    }

    public int getPoda_air() {
        return poda_air;
    }

    public void setPoda_air(int poda_air) {
        this.poda_air = poda_air;
    }

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
    }

    public float getRs_padi() {
        return rs_padi;
    }

    public void setRs_padi(float rs_padi) {
        this.rs_padi = rs_padi;
    }

    public float getRs_tebu_muda() {
        return rs_tebu_muda;
    }

    public void setRs_tebu_muda(float rs_tebu_muda) {
        this.rs_tebu_muda = rs_tebu_muda;
    }

    public float getRs_tebu_tua() {
        return rs_tebu_tua;
    }

    public void setRs_tebu_tua(float rs_tebu_tua) {
        this.rs_tebu_tua = rs_tebu_tua;
    }

    public float getRs_palawija() {
        return rs_palawija;
    }

    public void setRs_palawija(float rs_palawija) {
        this.rs_palawija = rs_palawija;
    }

    public float getRs_gadu() {
        return rs_gadu;
    }

    public void setRs_gadu(float rs_gadu) {
        this.rs_gadu = rs_gadu;
    }

    public float getRs_lain() {
        return rs_lain;
    }

    public void setRs_lain(float rs_lain) {
        this.rs_lain = rs_lain;
    }

    public float getRs_bero() {
        return rs_bero;
    }

    public void setRs_bero(float rs_bero) {
        this.rs_bero = rs_bero;
    }

    public float getUs_padi_olahtanah() {
        return us_padi_olahtanah;
    }

    public void setUs_padi_olahtanah(float us_padi_olahtanah) {
        this.us_padi_olahtanah = us_padi_olahtanah;
    }

    public float getUs_padi_tumbuh() {
        return us_padi_tumbuh;
    }

    public void setUs_padi_tumbuh(float us_padi_tumbuh) {
        this.us_padi_tumbuh = us_padi_tumbuh;
    }

    public float getUs_padi_panen() {
        return us_padi_panen;
    }

    public void setUs_padi_panen(float us_padi_panen) {
        this.us_padi_panen = us_padi_panen;
    }

    public float getUs_tebu_olahtanah() {
        return us_tebu_olahtanah;
    }

    public void setUs_tebu_olahtanah(float us_tebu_olahtanah) {
        this.us_tebu_olahtanah = us_tebu_olahtanah;
    }

    public float getUs_tebu_muda() {
        return us_tebu_muda;
    }

    public void setUs_tebu_muda(float us_tebu_muda) {
        this.us_tebu_muda = us_tebu_muda;
    }

    public float getUs_tebu_tua() {
        return us_tebu_tua;
    }

    public void setUs_tebu_tua(float us_tebu_tua) {
        this.us_tebu_tua = us_tebu_tua;
    }

    public float getUs_wija_byk_air() {
        return us_wija_byk_air;
    }

    public void setUs_wija_byk_air(float us_wija_byk_air) {
        this.us_wija_byk_air = us_wija_byk_air;
    }

    public float getUs_wija_dkt_air() {
        return us_wija_dkt_air;
    }

    public void setUs_wija_dkt_air(float us_wija_dkt_air) {
        this.us_wija_dkt_air = us_wija_dkt_air;
    }

    public float getUs_gadu() {
        return us_gadu;
    }

    public void setUs_gadu(float us_gadu) {
        this.us_gadu = us_gadu;
    }

    public float getUs_lain() {
        return us_lain;
    }

    public void setUs_lain(float us_lain) {
        this.us_lain = us_lain;
    }

    public float getUs_bero() {
        return us_bero;
    }

    public void setUs_bero(float us_bero) {
        this.us_bero = us_bero;
    }

    public String getKa_airpetak() {
        return ka_airpetak;
    }

    public void setKa_airpetak(String ka_airpetak) {
        this.ka_airpetak = ka_airpetak;
    }

    public float getPadi_krg() {
        return padi_krg;
    }

    public void setPadi_krg(float padi_krg) {
        this.padi_krg = padi_krg;
    }

    public float getTebu_krg() {
        return tebu_krg;
    }

    public void setTebu_krg(float tebu_krg) {
        this.tebu_krg = tebu_krg;
    }

    public float getWija_krg() {
        return wija_krg;
    }

    public void setWija_krg(float wija_krg) {
        this.wija_krg = wija_krg;
    }

    public float getPadi_bjr() {
        return padi_bjr;
    }

    public void setPadi_bjr(float padi_bjr) {
        this.padi_bjr = padi_bjr;
    }

    public float getTebu_bjr() {
        return tebu_bjr;
    }

    public void setTebu_bjr(float tebu_bjr) {
        this.tebu_bjr = tebu_bjr;
    }

    public float getWija_bjr() {
        return wija_bjr;
    }

    public void setWija_bjr(float wija_bjr) {
        this.wija_bjr = wija_bjr;
    }

    public float getKb_padi_olahtanah() {
        return kb_padi_olahtanah;
    }

    public void setKb_padi_olahtanah(float kb_padi_olahtanah) {
        this.kb_padi_olahtanah = kb_padi_olahtanah;
    }

    public float getKb_padi_tumbuh() {
        return kb_padi_tumbuh;
    }

    public void setKb_padi_tumbuh(float kb_padi_tumbuh) {
        this.kb_padi_tumbuh = kb_padi_tumbuh;
    }

    public float getKb_padi_panen() {
        return kb_padi_panen;
    }

    public void setKb_padi_panen(float kb_padi_panen) {
        this.kb_padi_panen = kb_padi_panen;
    }

    public float getKb_tebu_olahtanah() {
        return kb_tebu_olahtanah;
    }

    public void setKb_tebu_olahtanah(float kb_tebu_olahtanah) {
        this.kb_tebu_olahtanah = kb_tebu_olahtanah;
    }

    public float getKb_tebu_muda() {
        return kb_tebu_muda;
    }

    public void setKb_tebu_muda(float kb_tebu_muda) {
        this.kb_tebu_muda = kb_tebu_muda;
    }

    public float getKb_tebu_tua() {
        return kb_tebu_tua;
    }

    public void setKb_tebu_tua(float kb_tebu_tua) {
        this.kb_tebu_tua = kb_tebu_tua;
    }

    public float getKb_wija_byk_air() {
        return kb_wija_byk_air;
    }

    public void setKb_wija_byk_air(float kb_wija_byk_air) {
        this.kb_wija_byk_air = kb_wija_byk_air;
    }

    public float getKb_wija_dkt_air() {
        return kb_wija_dkt_air;
    }

    public void setKb_wija_dkt_air(float kb_wija_dkt_air) {
        this.kb_wija_dkt_air = kb_wija_dkt_air;
    }

    public float getKb_gadu() {
        return kb_gadu;
    }

    public void setKb_gadu(float kb_gadu) {
        this.kb_gadu = kb_gadu;
    }

    public float getKb_lain() {
        return kb_lain;
    }

    public void setKb_lain(float kb_lain) {
        this.kb_lain = kb_lain;
    }

    public float getJum_dsawah() {
        return jum_dsawah;
    }

    public void setJum_dsawah(float jum_dsawah) {
        this.jum_dsawah = jum_dsawah;
    }

    public float getFaktor_tersier() {
        return faktor_tersier;
    }

    public void setFaktor_tersier(float faktor_tersier) {
        this.faktor_tersier = faktor_tersier;
    }

    public float getAir_tersier() {
        return air_tersier;
    }

    public void setAir_tersier(float air_tersier) {
        this.air_tersier = air_tersier;
    }

    public float getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(float kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getPelaksana() {
        return pelaksana;
    }

    public void setPelaksana(String pelaksana) {
        this.pelaksana = pelaksana;
    }

    public int getVerify() {
        return verify;
    }

    public void setVerify(int verify) {
        this.verify = verify;
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
