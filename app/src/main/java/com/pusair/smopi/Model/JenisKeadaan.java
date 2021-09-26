package com.pusair.smopi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class JenisKeadaan extends RealmObject {

    @PrimaryKey
    @Expose
    @SerializedName("jns_keadaan")
    private int jns_keadaan;

    @Expose
    @SerializedName("nm_keadaan")
    private String nm_keadaan;

    public int getJns_keadaan() {
        return jns_keadaan;
    }

    public void setJns_keadaan(int jns_keadaan) {
        this.jns_keadaan = jns_keadaan;
    }

    public String getNm_keadaan() {
        return nm_keadaan;
    }

    public void setNm_keadaan(String nm_keadaan) {
        this.nm_keadaan = nm_keadaan;
    }
}
