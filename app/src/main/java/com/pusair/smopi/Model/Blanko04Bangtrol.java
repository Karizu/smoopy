package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Blanko04Bangtrol extends RealmObject {

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
    @SerializedName("nm_bangtrol")
    private String nm_bangtrol;

    @Expose
    @SerializedName("tmt_bangtrol")
    private String tmt_bangtrol;

    @Expose
    @SerializedName("luas_swiri")
    private float luas_swiri;

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
    @SerializedName("tgledit")
    private String tgledit;

    @Expose
    @SerializedName("ka_padi_olahtanah")
    private float ka_padi_olahtanah;

    @Expose
    @SerializedName("ka_padi_tumbuh")
    private float ka_padi_tumbuh;

    @Expose
    @SerializedName("ka_padi_panen")
    private float ka_padi_panen;

    @Expose
    @SerializedName("ka_tebu_olahtanah")
    private float ka_tebu_olahtanah;

    @Expose
    @SerializedName("ka_tebu_muda")
    private float ka_tebu_muda;

    @Expose
    @SerializedName("ka_tebu_tua")
    private float ka_tebu_tua;

    @Expose
    @SerializedName("ka_wija_byk_air")
    private float ka_wija_byk_air;

    @Expose
    @SerializedName("ka_wija_dkt_air")
    private float ka_wija_dkt_air;

    @Expose
    @SerializedName("keb_air_bangtrol")
    private float keb_air_bangtrol;

    @Expose
    @SerializedName("urutan")
    private int urutan;

    @Expose
    @SerializedName("petak_tersier")
    private float petak_tersier;

    @Expose
    @SerializedName("petak_tersier_rcn")
    private float petak_tersier_rcn;

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
    @SerializedName("gol")
    private int gol;

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

    public String getDeleterec() {
        return deleterec;
    }

    public void setDeleterec(String deleterec) {
        this.deleterec = deleterec;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

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

    public float getLuas_swiri() {
        return luas_swiri;
    }

    public void setLuas_swiri(float luas_swiri) {
        this.luas_swiri = luas_swiri;
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

    public String getTgledit() {
        return tgledit;
    }

    public void setTgledit(String tgledit) {
        this.tgledit = tgledit;
    }

    public float getKa_padi_olahtanah() {
        return ka_padi_olahtanah;
    }

    public void setKa_padi_olahtanah(float ka_padi_olahtanah) {
        this.ka_padi_olahtanah = ka_padi_olahtanah;
    }

    public float getKa_padi_tumbuh() {
        return ka_padi_tumbuh;
    }

    public void setKa_padi_tumbuh(float ka_padi_tumbuh) {
        this.ka_padi_tumbuh = ka_padi_tumbuh;
    }

    public float getKa_padi_panen() {
        return ka_padi_panen;
    }

    public void setKa_padi_panen(float ka_padi_panen) {
        this.ka_padi_panen = ka_padi_panen;
    }

    public float getKa_tebu_olahtanah() {
        return ka_tebu_olahtanah;
    }

    public void setKa_tebu_olahtanah(float ka_tebu_olahtanah) {
        this.ka_tebu_olahtanah = ka_tebu_olahtanah;
    }

    public float getKa_tebu_muda() {
        return ka_tebu_muda;
    }

    public void setKa_tebu_muda(float ka_tebu_muda) {
        this.ka_tebu_muda = ka_tebu_muda;
    }

    public float getKa_tebu_tua() {
        return ka_tebu_tua;
    }

    public void setKa_tebu_tua(float ka_tebu_tua) {
        this.ka_tebu_tua = ka_tebu_tua;
    }

    public float getKa_wija_byk_air() {
        return ka_wija_byk_air;
    }

    public void setKa_wija_byk_air(float ka_wija_byk_air) {
        this.ka_wija_byk_air = ka_wija_byk_air;
    }

    public float getKa_wija_dkt_air() {
        return ka_wija_dkt_air;
    }

    public void setKa_wija_dkt_air(float ka_wija_dkt_air) {
        this.ka_wija_dkt_air = ka_wija_dkt_air;
    }

    public float getKeb_air_bangtrol() {
        return keb_air_bangtrol;
    }

    public void setKeb_air_bangtrol(float keb_air_bangtrol) {
        this.keb_air_bangtrol = keb_air_bangtrol;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    public float getPetak_tersier() {
        return petak_tersier;
    }

    public void setPetak_tersier(float petak_tersier) {
        this.petak_tersier = petak_tersier;
    }

    public float getPetak_tersier_rcn() {
        return petak_tersier_rcn;
    }

    public void setPetak_tersier_rcn(float petak_tersier_rcn) {
        this.petak_tersier_rcn = petak_tersier_rcn;
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

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
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
