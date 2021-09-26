package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse <T> {

    private String pesan;
    private T data;
    private String peringatan;

    @Expose
    @SerializedName("r_daerahirigasi")
    List<DaerahIrigasi> daerahIrigasiList;

    @Expose
    @SerializedName("staf_iri")
    List<User> staffIrigasi;

    @Expose
    @SerializedName("r_saluranmaster")
    List<Saluran> saluranList;

    @Expose
    @SerializedName("r_salurandetil")
    List<SaluranDetail> saluranDetailList;

    @Expose
    @SerializedName("r_poda_laporan_di")
    List<PodaLaporanDaerahIrigasi> podaLaporanDaerahIrigasiList;

    @Expose
    @SerializedName("poda_mstanam")
    List<MusimTanam> musimTanamList;

    @Expose
    @SerializedName("grup_ip3a")
    List<GroupIp3a> groupIp3aList;

    @Expose
    @SerializedName("rentang_mt")
    List<RentangMusimTanam> rentangMusimTanamList;

    @Expose
    @SerializedName("rp_jnskeadaan")
    List<JenisKeadaan> jenisKeadaanList;

    @Expose
    @SerializedName("b0123")
    List<Blanko0123> blanko0123List;

    @Expose
    @SerializedName("b0405")
    List<Blanko0405> blanko0405List;

    @Expose
    @SerializedName("b06")
    List<Blanko06> blanko06List;

    @Expose
    @SerializedName("b08")
    List<Blanko08> blanko08List;

    @Expose
    @SerializedName("b04_bangtrol")
    List<Blanko04Bangtrol> blanko04BangtrolList;

    @Expose
    @SerializedName("pb01")
    List<BlankoP01> blankoP01List;

    @Expose
    @SerializedName("pb01_detil")
    List<BlankoP01Detail> blankoP01DetailList;

    public String getPeringatan() {
        return peringatan;
    }

    public void setPeringatan(String peringatan) {
        this.peringatan = peringatan;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<DaerahIrigasi> getDaerahIrigasiList() {
        return daerahIrigasiList;
    }

    public void setDaerahIrigasiList(List<DaerahIrigasi> daerahIrigasiList) {
        this.daerahIrigasiList = daerahIrigasiList;
    }

    public List<User> getStaffIrigasi() {
        return staffIrigasi;
    }

    public void setStaffIrigasi(List<User> staffIrigasi) {
        this.staffIrigasi = staffIrigasi;
    }

    public List<Saluran> getSaluranList() {
        return saluranList;
    }

    public void setSaluranList(List<Saluran> saluranList) {
        this.saluranList = saluranList;
    }

    public List<SaluranDetail> getSaluranDetailList() {
        return saluranDetailList;
    }

    public void setSaluranDetailList(List<SaluranDetail> saluranDetailList) {
        this.saluranDetailList = saluranDetailList;
    }
//
    public List<MusimTanam> getMusimTanamList() {
        return musimTanamList;
    }

    public void setMusimTanamList(List<MusimTanam> musimTanamList) {
        this.musimTanamList = musimTanamList;
    }

    public List<GroupIp3a> getGroupIp3aList() {
        return groupIp3aList;
    }

    public void setGroupIp3aList(List<GroupIp3a> groupIp3aList) {
        this.groupIp3aList = groupIp3aList;
    }

    public List<RentangMusimTanam> getRentangMusimTanamList() {
        return rentangMusimTanamList;
    }

    public void setRentangMusimTanamList(List<RentangMusimTanam> rentangMusimTanamList) {
        this.rentangMusimTanamList = rentangMusimTanamList;
    }

    public List<JenisKeadaan> getJenisKeadaanList() {
        return jenisKeadaanList;
    }

    public void setJenisKeadaanList(List<JenisKeadaan> jenisKeadaanList) {
        this.jenisKeadaanList = jenisKeadaanList;
    }

    public List<Blanko0123> getBlanko0123List() {
        return blanko0123List;
    }

    public void setBlanko0123List(List<Blanko0123> blanko0123List) {
        this.blanko0123List = blanko0123List;
    }

    public List<Blanko0405> getBlanko0405List() {
        return blanko0405List;
    }

    public void setBlanko0405List(List<Blanko0405> blanko0405List) {
        this.blanko0405List = blanko0405List;
    }

    public List<Blanko06> getBlanko06List() {
        return blanko06List;
    }

    public void setBlanko06List(List<Blanko06> blanko06List) {
        this.blanko06List = blanko06List;
    }

    public List<Blanko04Bangtrol> getBlanko04BangtrolList() {
        return blanko04BangtrolList;
    }

    public void setBlanko04BangtrolList(List<Blanko04Bangtrol> blanko04BangtrolList) {
        this.blanko04BangtrolList = blanko04BangtrolList;
    }

    public List<BlankoP01> getBlankoP01List() {
        return blankoP01List;
    }

    public void setBlankoP01List(List<BlankoP01> blankoP01List) {
        this.blankoP01List = blankoP01List;
    }

    public List<BlankoP01Detail> getBlankoP01DetailList() {
        return blankoP01DetailList;
    }

    public void setBlankoP01DetailList(List<BlankoP01Detail> blankoP01DetailList) {
        this.blankoP01DetailList = blankoP01DetailList;
    }

    public List<PodaLaporanDaerahIrigasi> getPodaLaporanDaerahIrigasiList() {
        return podaLaporanDaerahIrigasiList;
    }

    public void setPodaLaporanDaerahIrigasiList(List<PodaLaporanDaerahIrigasi> podaLaporanDaerahIrigasiList) {
        this.podaLaporanDaerahIrigasiList = podaLaporanDaerahIrigasiList;
    }

    public List<Blanko08> getBlanko08List() {
        return blanko08List;
    }

    public void setBlanko08List(List<Blanko08> blanko08List) {
        this.blanko08List = blanko08List;
    }
}
