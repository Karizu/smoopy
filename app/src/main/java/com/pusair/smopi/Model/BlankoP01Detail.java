package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class BlankoP01Detail extends RealmObject {

    @PrimaryKey
    private String id;

    @Expose
    @SerializedName("id_b01")
    private int id_b01;

    @Expose
    @SerializedName("cbya")
    private String cbya;

    @Expose
    @SerializedName("jns_keadaan")
    private String jns_keadaan;

    @Expose
    @SerializedName("nm_keadaan")
    private String nm_keadaan;

    @Expose
    @SerializedName("deskripsi")
    private String deskripsi;

    @Expose
    @SerializedName("jumlah")
    private float jumlah;

    @Expose
    @SerializedName("kerusakan")
    private String kerusakan;

    @Expose
    @SerializedName("satuan")
    private String satuan;

    @Expose
    @SerializedName("ruas_aw")
    private int ruas_aw;

    @Expose
    @SerializedName("ruas_ak")
    private int ruas_ak;

    @Expose
    @SerializedName("id_b06")
    private int id_b06;

    @Expose
    @SerializedName("id_bcp")
    private int id_bcp;

    @Expose
    @SerializedName("pk_waktu")
    private String pk_waktu;

    @Expose
    @SerializedName("tgledit_detil")
    private String tgledit_detil;

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
    private String areal_layanan;

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

    public int getId_b01() {
        return id_b01;
    }

    public void setId_b01(int id_b01) {
        this.id_b01 = id_b01;
    }

    public String getCbya() {
        return cbya;
    }

    public void setCbya(String cbya) {
        this.cbya = cbya;
    }

    public String getJns_keadaan() {
        return jns_keadaan;
    }

    public void setJns_keadaan(String jns_keadaan) {
        this.jns_keadaan = jns_keadaan;
    }

    public String getNm_keadaan() {
        return nm_keadaan;
    }

    public void setNm_keadaan(String nm_keadaan) {
        this.nm_keadaan = nm_keadaan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public float getJumlah() {
        return jumlah;
    }

    public void setJumlah(float jumlah) {
        this.jumlah = jumlah;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
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

    public int getId_b06() {
        return id_b06;
    }

    public void setId_b06(int id_b06) {
        this.id_b06 = id_b06;
    }

    public int getId_bcp() {
        return id_bcp;
    }

    public void setId_bcp(int id_bcp) {
        this.id_bcp = id_bcp;
    }

    public String getPk_waktu() {
        return pk_waktu;
    }

    public void setPk_waktu(String pk_waktu) {
        this.pk_waktu = pk_waktu;
    }

    public String getTgledit_detil() {
        return tgledit_detil;
    }

    public void setTgledit_detil(String tgledit_detil) {
        this.tgledit_detil = tgledit_detil;
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

    public String getAreal_layanan() {
        return areal_layanan;
    }

    public void setAreal_layanan(String areal_layanan) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getFlag() {
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
