package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_pusair_smopi_Model_Blanko0405RealmProxy extends com.pusair.smopi.Model.Blanko0405
    implements RealmObjectProxy, com_pusair_smopi_Model_Blanko0405RealmProxyInterface {

    static final class Blanko0405ColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_mtIndex;
        long urut_mtIndex;
        long thblnIndex;
        long poda_airIndex;
        long luas_swiriIndex;
        long rs_padiIndex;
        long rs_tebu_mudaIndex;
        long rs_tebu_tuaIndex;
        long rs_palawijaIndex;
        long rs_gaduIndex;
        long rs_lainIndex;
        long rs_beroIndex;
        long us_padi_olahtanahIndex;
        long us_padi_tumbuhIndex;
        long us_padi_panenIndex;
        long us_tebu_olahtanahIndex;
        long us_tebu_mudaIndex;
        long us_tebu_tuaIndex;
        long us_wija_byk_airIndex;
        long us_wija_dkt_airIndex;
        long us_gaduIndex;
        long us_lainIndex;
        long us_beroIndex;
        long ka_airpetakIndex;
        long padi_krgIndex;
        long tebu_krgIndex;
        long wija_krgIndex;
        long padi_bjrIndex;
        long tebu_bjrIndex;
        long wija_bjrIndex;
        long kb_padi_olahtanahIndex;
        long kb_padi_tumbuhIndex;
        long kb_padi_panenIndex;
        long kb_tebu_olahtanahIndex;
        long kb_tebu_mudaIndex;
        long kb_tebu_tuaIndex;
        long kb_wija_byk_airIndex;
        long kb_wija_dkt_airIndex;
        long kb_gaduIndex;
        long kb_lainIndex;
        long jum_dsawahIndex;
        long faktor_tersierIndex;
        long air_tersierIndex;
        long kerusakanIndex;
        long pelaksanaIndex;
        long verifyIndex;
        long tgleditIndex;
        long deleterecIndex;
        long flagIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;

        Blanko0405ColumnInfo(OsSchemaInfo schemaInfo) {
            super(56);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Blanko0405");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.urut_mtIndex = addColumnDetails("urut_mt", "urut_mt", objectSchemaInfo);
            this.thblnIndex = addColumnDetails("thbln", "thbln", objectSchemaInfo);
            this.poda_airIndex = addColumnDetails("poda_air", "poda_air", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.rs_padiIndex = addColumnDetails("rs_padi", "rs_padi", objectSchemaInfo);
            this.rs_tebu_mudaIndex = addColumnDetails("rs_tebu_muda", "rs_tebu_muda", objectSchemaInfo);
            this.rs_tebu_tuaIndex = addColumnDetails("rs_tebu_tua", "rs_tebu_tua", objectSchemaInfo);
            this.rs_palawijaIndex = addColumnDetails("rs_palawija", "rs_palawija", objectSchemaInfo);
            this.rs_gaduIndex = addColumnDetails("rs_gadu", "rs_gadu", objectSchemaInfo);
            this.rs_lainIndex = addColumnDetails("rs_lain", "rs_lain", objectSchemaInfo);
            this.rs_beroIndex = addColumnDetails("rs_bero", "rs_bero", objectSchemaInfo);
            this.us_padi_olahtanahIndex = addColumnDetails("us_padi_olahtanah", "us_padi_olahtanah", objectSchemaInfo);
            this.us_padi_tumbuhIndex = addColumnDetails("us_padi_tumbuh", "us_padi_tumbuh", objectSchemaInfo);
            this.us_padi_panenIndex = addColumnDetails("us_padi_panen", "us_padi_panen", objectSchemaInfo);
            this.us_tebu_olahtanahIndex = addColumnDetails("us_tebu_olahtanah", "us_tebu_olahtanah", objectSchemaInfo);
            this.us_tebu_mudaIndex = addColumnDetails("us_tebu_muda", "us_tebu_muda", objectSchemaInfo);
            this.us_tebu_tuaIndex = addColumnDetails("us_tebu_tua", "us_tebu_tua", objectSchemaInfo);
            this.us_wija_byk_airIndex = addColumnDetails("us_wija_byk_air", "us_wija_byk_air", objectSchemaInfo);
            this.us_wija_dkt_airIndex = addColumnDetails("us_wija_dkt_air", "us_wija_dkt_air", objectSchemaInfo);
            this.us_gaduIndex = addColumnDetails("us_gadu", "us_gadu", objectSchemaInfo);
            this.us_lainIndex = addColumnDetails("us_lain", "us_lain", objectSchemaInfo);
            this.us_beroIndex = addColumnDetails("us_bero", "us_bero", objectSchemaInfo);
            this.ka_airpetakIndex = addColumnDetails("ka_airpetak", "ka_airpetak", objectSchemaInfo);
            this.padi_krgIndex = addColumnDetails("padi_krg", "padi_krg", objectSchemaInfo);
            this.tebu_krgIndex = addColumnDetails("tebu_krg", "tebu_krg", objectSchemaInfo);
            this.wija_krgIndex = addColumnDetails("wija_krg", "wija_krg", objectSchemaInfo);
            this.padi_bjrIndex = addColumnDetails("padi_bjr", "padi_bjr", objectSchemaInfo);
            this.tebu_bjrIndex = addColumnDetails("tebu_bjr", "tebu_bjr", objectSchemaInfo);
            this.wija_bjrIndex = addColumnDetails("wija_bjr", "wija_bjr", objectSchemaInfo);
            this.kb_padi_olahtanahIndex = addColumnDetails("kb_padi_olahtanah", "kb_padi_olahtanah", objectSchemaInfo);
            this.kb_padi_tumbuhIndex = addColumnDetails("kb_padi_tumbuh", "kb_padi_tumbuh", objectSchemaInfo);
            this.kb_padi_panenIndex = addColumnDetails("kb_padi_panen", "kb_padi_panen", objectSchemaInfo);
            this.kb_tebu_olahtanahIndex = addColumnDetails("kb_tebu_olahtanah", "kb_tebu_olahtanah", objectSchemaInfo);
            this.kb_tebu_mudaIndex = addColumnDetails("kb_tebu_muda", "kb_tebu_muda", objectSchemaInfo);
            this.kb_tebu_tuaIndex = addColumnDetails("kb_tebu_tua", "kb_tebu_tua", objectSchemaInfo);
            this.kb_wija_byk_airIndex = addColumnDetails("kb_wija_byk_air", "kb_wija_byk_air", objectSchemaInfo);
            this.kb_wija_dkt_airIndex = addColumnDetails("kb_wija_dkt_air", "kb_wija_dkt_air", objectSchemaInfo);
            this.kb_gaduIndex = addColumnDetails("kb_gadu", "kb_gadu", objectSchemaInfo);
            this.kb_lainIndex = addColumnDetails("kb_lain", "kb_lain", objectSchemaInfo);
            this.jum_dsawahIndex = addColumnDetails("jum_dsawah", "jum_dsawah", objectSchemaInfo);
            this.faktor_tersierIndex = addColumnDetails("faktor_tersier", "faktor_tersier", objectSchemaInfo);
            this.air_tersierIndex = addColumnDetails("air_tersier", "air_tersier", objectSchemaInfo);
            this.kerusakanIndex = addColumnDetails("kerusakan", "kerusakan", objectSchemaInfo);
            this.pelaksanaIndex = addColumnDetails("pelaksana", "pelaksana", objectSchemaInfo);
            this.verifyIndex = addColumnDetails("verify", "verify", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
        }

        Blanko0405ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Blanko0405ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Blanko0405ColumnInfo src = (Blanko0405ColumnInfo) rawSrc;
            final Blanko0405ColumnInfo dst = (Blanko0405ColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.urut_mtIndex = src.urut_mtIndex;
            dst.thblnIndex = src.thblnIndex;
            dst.poda_airIndex = src.poda_airIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.rs_padiIndex = src.rs_padiIndex;
            dst.rs_tebu_mudaIndex = src.rs_tebu_mudaIndex;
            dst.rs_tebu_tuaIndex = src.rs_tebu_tuaIndex;
            dst.rs_palawijaIndex = src.rs_palawijaIndex;
            dst.rs_gaduIndex = src.rs_gaduIndex;
            dst.rs_lainIndex = src.rs_lainIndex;
            dst.rs_beroIndex = src.rs_beroIndex;
            dst.us_padi_olahtanahIndex = src.us_padi_olahtanahIndex;
            dst.us_padi_tumbuhIndex = src.us_padi_tumbuhIndex;
            dst.us_padi_panenIndex = src.us_padi_panenIndex;
            dst.us_tebu_olahtanahIndex = src.us_tebu_olahtanahIndex;
            dst.us_tebu_mudaIndex = src.us_tebu_mudaIndex;
            dst.us_tebu_tuaIndex = src.us_tebu_tuaIndex;
            dst.us_wija_byk_airIndex = src.us_wija_byk_airIndex;
            dst.us_wija_dkt_airIndex = src.us_wija_dkt_airIndex;
            dst.us_gaduIndex = src.us_gaduIndex;
            dst.us_lainIndex = src.us_lainIndex;
            dst.us_beroIndex = src.us_beroIndex;
            dst.ka_airpetakIndex = src.ka_airpetakIndex;
            dst.padi_krgIndex = src.padi_krgIndex;
            dst.tebu_krgIndex = src.tebu_krgIndex;
            dst.wija_krgIndex = src.wija_krgIndex;
            dst.padi_bjrIndex = src.padi_bjrIndex;
            dst.tebu_bjrIndex = src.tebu_bjrIndex;
            dst.wija_bjrIndex = src.wija_bjrIndex;
            dst.kb_padi_olahtanahIndex = src.kb_padi_olahtanahIndex;
            dst.kb_padi_tumbuhIndex = src.kb_padi_tumbuhIndex;
            dst.kb_padi_panenIndex = src.kb_padi_panenIndex;
            dst.kb_tebu_olahtanahIndex = src.kb_tebu_olahtanahIndex;
            dst.kb_tebu_mudaIndex = src.kb_tebu_mudaIndex;
            dst.kb_tebu_tuaIndex = src.kb_tebu_tuaIndex;
            dst.kb_wija_byk_airIndex = src.kb_wija_byk_airIndex;
            dst.kb_wija_dkt_airIndex = src.kb_wija_dkt_airIndex;
            dst.kb_gaduIndex = src.kb_gaduIndex;
            dst.kb_lainIndex = src.kb_lainIndex;
            dst.jum_dsawahIndex = src.jum_dsawahIndex;
            dst.faktor_tersierIndex = src.faktor_tersierIndex;
            dst.air_tersierIndex = src.air_tersierIndex;
            dst.kerusakanIndex = src.kerusakanIndex;
            dst.pelaksanaIndex = src.pelaksanaIndex;
            dst.verifyIndex = src.verifyIndex;
            dst.tgleditIndex = src.tgleditIndex;
            dst.deleterecIndex = src.deleterecIndex;
            dst.flagIndex = src.flagIndex;
            dst.insertIndex = src.insertIndex;
            dst.updateIndex = src.updateIndex;
            dst.skip_updateIndex = src.skip_updateIndex;
            dst.deleteIndex = src.deleteIndex;
            dst.rec_baru_serverIndex = src.rec_baru_serverIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Blanko0405ColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Blanko0405> proxyState;

    com_pusair_smopi_Model_Blanko0405RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Blanko0405ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Blanko0405>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_staf() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_stafIndex);
    }

    @Override
    public void realmSet$kd_staf(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_stafIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_stafIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_stafIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_stafIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$kd_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.kd_mtIndex);
    }

    @Override
    public void realmSet$kd_mt(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.kd_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.kd_mtIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$urut_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urut_mtIndex);
    }

    @Override
    public void realmSet$urut_mt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urut_mtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urut_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urut_mtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urut_mtIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thbln() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thblnIndex);
    }

    @Override
    public void realmSet$thbln(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thblnIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thblnIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thblnIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thblnIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$poda_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.poda_airIndex);
    }

    @Override
    public void realmSet$poda_air(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.poda_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.poda_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$luas_swiri() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.luas_swiriIndex);
    }

    @Override
    public void realmSet$luas_swiri(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.luas_swiriIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.luas_swiriIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_padi() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_padiIndex);
    }

    @Override
    public void realmSet$rs_padi(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_padiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_padiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_tebu_mudaIndex);
    }

    @Override
    public void realmSet$rs_tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_tebu_tuaIndex);
    }

    @Override
    public void realmSet$rs_tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_palawija() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_palawijaIndex);
    }

    @Override
    public void realmSet$rs_palawija(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_palawijaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_palawijaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_gadu() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_gaduIndex);
    }

    @Override
    public void realmSet$rs_gadu(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_gaduIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_gaduIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_lainIndex);
    }

    @Override
    public void realmSet$rs_lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rs_bero() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rs_beroIndex);
    }

    @Override
    public void realmSet$rs_bero(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rs_beroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rs_beroIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_padi_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_olahtanahIndex);
    }

    @Override
    public void realmSet$us_padi_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_padi_tumbuh() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_tumbuhIndex);
    }

    @Override
    public void realmSet$us_padi_tumbuh(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_tumbuhIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_tumbuhIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_padi_panen() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_panenIndex);
    }

    @Override
    public void realmSet$us_padi_panen(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_panenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_panenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_olahtanahIndex);
    }

    @Override
    public void realmSet$us_tebu_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_mudaIndex);
    }

    @Override
    public void realmSet$us_tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_tuaIndex);
    }

    @Override
    public void realmSet$us_tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_wija_byk_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_wija_byk_airIndex);
    }

    @Override
    public void realmSet$us_wija_byk_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_wija_byk_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_wija_byk_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_wija_dkt_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_wija_dkt_airIndex);
    }

    @Override
    public void realmSet$us_wija_dkt_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_wija_dkt_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_wija_dkt_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_gadu() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_gaduIndex);
    }

    @Override
    public void realmSet$us_gadu(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_gaduIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_gaduIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_lainIndex);
    }

    @Override
    public void realmSet$us_lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_bero() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_beroIndex);
    }

    @Override
    public void realmSet$us_bero(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_beroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_beroIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ka_airpetak() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ka_airpetakIndex);
    }

    @Override
    public void realmSet$ka_airpetak(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ka_airpetakIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.ka_airpetakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ka_airpetakIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ka_airpetakIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$padi_krg() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.padi_krgIndex);
    }

    @Override
    public void realmSet$padi_krg(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.padi_krgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.padi_krgIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_krg() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_krgIndex);
    }

    @Override
    public void realmSet$tebu_krg(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_krgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_krgIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$wija_krg() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.wija_krgIndex);
    }

    @Override
    public void realmSet$wija_krg(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.wija_krgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.wija_krgIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$padi_bjr() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.padi_bjrIndex);
    }

    @Override
    public void realmSet$padi_bjr(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.padi_bjrIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.padi_bjrIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_bjr() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_bjrIndex);
    }

    @Override
    public void realmSet$tebu_bjr(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_bjrIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_bjrIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$wija_bjr() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.wija_bjrIndex);
    }

    @Override
    public void realmSet$wija_bjr(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.wija_bjrIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.wija_bjrIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_padi_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_padi_olahtanahIndex);
    }

    @Override
    public void realmSet$kb_padi_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_padi_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_padi_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_padi_tumbuh() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_padi_tumbuhIndex);
    }

    @Override
    public void realmSet$kb_padi_tumbuh(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_padi_tumbuhIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_padi_tumbuhIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_padi_panen() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_padi_panenIndex);
    }

    @Override
    public void realmSet$kb_padi_panen(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_padi_panenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_padi_panenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_tebu_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_tebu_olahtanahIndex);
    }

    @Override
    public void realmSet$kb_tebu_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_tebu_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_tebu_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_tebu_mudaIndex);
    }

    @Override
    public void realmSet$kb_tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_tebu_tuaIndex);
    }

    @Override
    public void realmSet$kb_tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_wija_byk_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_wija_byk_airIndex);
    }

    @Override
    public void realmSet$kb_wija_byk_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_wija_byk_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_wija_byk_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_wija_dkt_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_wija_dkt_airIndex);
    }

    @Override
    public void realmSet$kb_wija_dkt_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_wija_dkt_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_wija_dkt_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_gadu() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_gaduIndex);
    }

    @Override
    public void realmSet$kb_gadu(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_gaduIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_gaduIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kb_lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kb_lainIndex);
    }

    @Override
    public void realmSet$kb_lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kb_lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kb_lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jum_dsawah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jum_dsawahIndex);
    }

    @Override
    public void realmSet$jum_dsawah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jum_dsawahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jum_dsawahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$faktor_tersier() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.faktor_tersierIndex);
    }

    @Override
    public void realmSet$faktor_tersier(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.faktor_tersierIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.faktor_tersierIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$air_tersier() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.air_tersierIndex);
    }

    @Override
    public void realmSet$air_tersier(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.air_tersierIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.air_tersierIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$kerusakan() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.kerusakanIndex);
    }

    @Override
    public void realmSet$kerusakan(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.kerusakanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.kerusakanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pelaksana() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.pelaksanaIndex);
    }

    @Override
    public void realmSet$pelaksana(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pelaksanaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.pelaksanaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pelaksanaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.pelaksanaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$verify() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.verifyIndex);
    }

    @Override
    public void realmSet$verify(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.verifyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.verifyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgledit() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgleditIndex);
    }

    @Override
    public void realmSet$tgledit(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgleditIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgleditIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgleditIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgleditIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$deleterec() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deleterecIndex);
    }

    @Override
    public void realmSet$deleterec(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deleterecIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.deleterecIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deleterecIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deleterecIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$flag() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.flagIndex);
    }

    @Override
    public void realmSet$flag(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.flagIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.flagIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insert() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insertIndex);
    }

    @Override
    public void realmSet$insert(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insertIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insertIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insertIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insertIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$update() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.updateIndex);
    }

    @Override
    public void realmSet$update(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.updateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.updateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.updateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.updateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$skip_update() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.skip_updateIndex);
    }

    @Override
    public void realmSet$skip_update(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.skip_updateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.skip_updateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.skip_updateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.skip_updateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$delete() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deleteIndex);
    }

    @Override
    public void realmSet$delete(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deleteIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.deleteIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deleteIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deleteIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rec_baru_server() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.rec_baru_serverIndex);
    }

    @Override
    public void realmSet$rec_baru_server(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.rec_baru_serverIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.rec_baru_serverIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.rec_baru_serverIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.rec_baru_serverIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Blanko0405", 56, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("urut_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thbln", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("poda_air", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_padi", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_palawija", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_gadu", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rs_bero", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_tumbuh", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_panen", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_wija_byk_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_wija_dkt_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_gadu", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_bero", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_airpetak", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("padi_krg", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_krg", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("wija_krg", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("padi_bjr", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_bjr", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("wija_bjr", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_padi_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_padi_tumbuh", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_padi_panen", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_tebu_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_wija_byk_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_wija_dkt_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_gadu", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kb_lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jum_dsawah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("faktor_tersier", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("air_tersier", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kerusakan", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("pelaksana", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("verify", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deleterec", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flag", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("insert", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("update", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("skip_update", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delete", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rec_baru_server", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Blanko0405ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Blanko0405ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Blanko0405";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Blanko0405";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Blanko0405 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Blanko0405 obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
            Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko0405.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko0405.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_Blanko0405RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) obj;
        if (json.has("kd_staf")) {
            if (json.isNull("kd_staf")) {
                objProxy.realmSet$kd_staf(null);
            } else {
                objProxy.realmSet$kd_staf((String) json.getString("kd_staf"));
            }
        }
        if (json.has("kd_mt")) {
            if (json.isNull("kd_mt")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
            } else {
                objProxy.realmSet$kd_mt((int) json.getInt("kd_mt"));
            }
        }
        if (json.has("urut_mt")) {
            if (json.isNull("urut_mt")) {
                objProxy.realmSet$urut_mt(null);
            } else {
                objProxy.realmSet$urut_mt((String) json.getString("urut_mt"));
            }
        }
        if (json.has("thbln")) {
            if (json.isNull("thbln")) {
                objProxy.realmSet$thbln(null);
            } else {
                objProxy.realmSet$thbln((String) json.getString("thbln"));
            }
        }
        if (json.has("poda_air")) {
            if (json.isNull("poda_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'poda_air' to null.");
            } else {
                objProxy.realmSet$poda_air((int) json.getInt("poda_air"));
            }
        }
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("rs_padi")) {
            if (json.isNull("rs_padi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_padi' to null.");
            } else {
                objProxy.realmSet$rs_padi((float) json.getDouble("rs_padi"));
            }
        }
        if (json.has("rs_tebu_muda")) {
            if (json.isNull("rs_tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_tebu_muda' to null.");
            } else {
                objProxy.realmSet$rs_tebu_muda((float) json.getDouble("rs_tebu_muda"));
            }
        }
        if (json.has("rs_tebu_tua")) {
            if (json.isNull("rs_tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_tebu_tua' to null.");
            } else {
                objProxy.realmSet$rs_tebu_tua((float) json.getDouble("rs_tebu_tua"));
            }
        }
        if (json.has("rs_palawija")) {
            if (json.isNull("rs_palawija")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_palawija' to null.");
            } else {
                objProxy.realmSet$rs_palawija((float) json.getDouble("rs_palawija"));
            }
        }
        if (json.has("rs_gadu")) {
            if (json.isNull("rs_gadu")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_gadu' to null.");
            } else {
                objProxy.realmSet$rs_gadu((float) json.getDouble("rs_gadu"));
            }
        }
        if (json.has("rs_lain")) {
            if (json.isNull("rs_lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_lain' to null.");
            } else {
                objProxy.realmSet$rs_lain((float) json.getDouble("rs_lain"));
            }
        }
        if (json.has("rs_bero")) {
            if (json.isNull("rs_bero")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rs_bero' to null.");
            } else {
                objProxy.realmSet$rs_bero((float) json.getDouble("rs_bero"));
            }
        }
        if (json.has("us_padi_olahtanah")) {
            if (json.isNull("us_padi_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_olahtanah' to null.");
            } else {
                objProxy.realmSet$us_padi_olahtanah((float) json.getDouble("us_padi_olahtanah"));
            }
        }
        if (json.has("us_padi_tumbuh")) {
            if (json.isNull("us_padi_tumbuh")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_tumbuh' to null.");
            } else {
                objProxy.realmSet$us_padi_tumbuh((float) json.getDouble("us_padi_tumbuh"));
            }
        }
        if (json.has("us_padi_panen")) {
            if (json.isNull("us_padi_panen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_panen' to null.");
            } else {
                objProxy.realmSet$us_padi_panen((float) json.getDouble("us_padi_panen"));
            }
        }
        if (json.has("us_tebu_olahtanah")) {
            if (json.isNull("us_tebu_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_olahtanah' to null.");
            } else {
                objProxy.realmSet$us_tebu_olahtanah((float) json.getDouble("us_tebu_olahtanah"));
            }
        }
        if (json.has("us_tebu_muda")) {
            if (json.isNull("us_tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_muda' to null.");
            } else {
                objProxy.realmSet$us_tebu_muda((float) json.getDouble("us_tebu_muda"));
            }
        }
        if (json.has("us_tebu_tua")) {
            if (json.isNull("us_tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_tua' to null.");
            } else {
                objProxy.realmSet$us_tebu_tua((float) json.getDouble("us_tebu_tua"));
            }
        }
        if (json.has("us_wija_byk_air")) {
            if (json.isNull("us_wija_byk_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_byk_air' to null.");
            } else {
                objProxy.realmSet$us_wija_byk_air((float) json.getDouble("us_wija_byk_air"));
            }
        }
        if (json.has("us_wija_dkt_air")) {
            if (json.isNull("us_wija_dkt_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_dkt_air' to null.");
            } else {
                objProxy.realmSet$us_wija_dkt_air((float) json.getDouble("us_wija_dkt_air"));
            }
        }
        if (json.has("us_gadu")) {
            if (json.isNull("us_gadu")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_gadu' to null.");
            } else {
                objProxy.realmSet$us_gadu((float) json.getDouble("us_gadu"));
            }
        }
        if (json.has("us_lain")) {
            if (json.isNull("us_lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_lain' to null.");
            } else {
                objProxy.realmSet$us_lain((float) json.getDouble("us_lain"));
            }
        }
        if (json.has("us_bero")) {
            if (json.isNull("us_bero")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_bero' to null.");
            } else {
                objProxy.realmSet$us_bero((float) json.getDouble("us_bero"));
            }
        }
        if (json.has("ka_airpetak")) {
            if (json.isNull("ka_airpetak")) {
                objProxy.realmSet$ka_airpetak(null);
            } else {
                objProxy.realmSet$ka_airpetak((String) json.getString("ka_airpetak"));
            }
        }
        if (json.has("padi_krg")) {
            if (json.isNull("padi_krg")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'padi_krg' to null.");
            } else {
                objProxy.realmSet$padi_krg((float) json.getDouble("padi_krg"));
            }
        }
        if (json.has("tebu_krg")) {
            if (json.isNull("tebu_krg")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_krg' to null.");
            } else {
                objProxy.realmSet$tebu_krg((float) json.getDouble("tebu_krg"));
            }
        }
        if (json.has("wija_krg")) {
            if (json.isNull("wija_krg")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'wija_krg' to null.");
            } else {
                objProxy.realmSet$wija_krg((float) json.getDouble("wija_krg"));
            }
        }
        if (json.has("padi_bjr")) {
            if (json.isNull("padi_bjr")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'padi_bjr' to null.");
            } else {
                objProxy.realmSet$padi_bjr((float) json.getDouble("padi_bjr"));
            }
        }
        if (json.has("tebu_bjr")) {
            if (json.isNull("tebu_bjr")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_bjr' to null.");
            } else {
                objProxy.realmSet$tebu_bjr((float) json.getDouble("tebu_bjr"));
            }
        }
        if (json.has("wija_bjr")) {
            if (json.isNull("wija_bjr")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'wija_bjr' to null.");
            } else {
                objProxy.realmSet$wija_bjr((float) json.getDouble("wija_bjr"));
            }
        }
        if (json.has("kb_padi_olahtanah")) {
            if (json.isNull("kb_padi_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_olahtanah' to null.");
            } else {
                objProxy.realmSet$kb_padi_olahtanah((float) json.getDouble("kb_padi_olahtanah"));
            }
        }
        if (json.has("kb_padi_tumbuh")) {
            if (json.isNull("kb_padi_tumbuh")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_tumbuh' to null.");
            } else {
                objProxy.realmSet$kb_padi_tumbuh((float) json.getDouble("kb_padi_tumbuh"));
            }
        }
        if (json.has("kb_padi_panen")) {
            if (json.isNull("kb_padi_panen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_panen' to null.");
            } else {
                objProxy.realmSet$kb_padi_panen((float) json.getDouble("kb_padi_panen"));
            }
        }
        if (json.has("kb_tebu_olahtanah")) {
            if (json.isNull("kb_tebu_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_olahtanah' to null.");
            } else {
                objProxy.realmSet$kb_tebu_olahtanah((float) json.getDouble("kb_tebu_olahtanah"));
            }
        }
        if (json.has("kb_tebu_muda")) {
            if (json.isNull("kb_tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_muda' to null.");
            } else {
                objProxy.realmSet$kb_tebu_muda((float) json.getDouble("kb_tebu_muda"));
            }
        }
        if (json.has("kb_tebu_tua")) {
            if (json.isNull("kb_tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_tua' to null.");
            } else {
                objProxy.realmSet$kb_tebu_tua((float) json.getDouble("kb_tebu_tua"));
            }
        }
        if (json.has("kb_wija_byk_air")) {
            if (json.isNull("kb_wija_byk_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_wija_byk_air' to null.");
            } else {
                objProxy.realmSet$kb_wija_byk_air((float) json.getDouble("kb_wija_byk_air"));
            }
        }
        if (json.has("kb_wija_dkt_air")) {
            if (json.isNull("kb_wija_dkt_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_wija_dkt_air' to null.");
            } else {
                objProxy.realmSet$kb_wija_dkt_air((float) json.getDouble("kb_wija_dkt_air"));
            }
        }
        if (json.has("kb_gadu")) {
            if (json.isNull("kb_gadu")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_gadu' to null.");
            } else {
                objProxy.realmSet$kb_gadu((float) json.getDouble("kb_gadu"));
            }
        }
        if (json.has("kb_lain")) {
            if (json.isNull("kb_lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kb_lain' to null.");
            } else {
                objProxy.realmSet$kb_lain((float) json.getDouble("kb_lain"));
            }
        }
        if (json.has("jum_dsawah")) {
            if (json.isNull("jum_dsawah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jum_dsawah' to null.");
            } else {
                objProxy.realmSet$jum_dsawah((float) json.getDouble("jum_dsawah"));
            }
        }
        if (json.has("faktor_tersier")) {
            if (json.isNull("faktor_tersier")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'faktor_tersier' to null.");
            } else {
                objProxy.realmSet$faktor_tersier((float) json.getDouble("faktor_tersier"));
            }
        }
        if (json.has("air_tersier")) {
            if (json.isNull("air_tersier")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'air_tersier' to null.");
            } else {
                objProxy.realmSet$air_tersier((float) json.getDouble("air_tersier"));
            }
        }
        if (json.has("kerusakan")) {
            if (json.isNull("kerusakan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kerusakan' to null.");
            } else {
                objProxy.realmSet$kerusakan((float) json.getDouble("kerusakan"));
            }
        }
        if (json.has("pelaksana")) {
            if (json.isNull("pelaksana")) {
                objProxy.realmSet$pelaksana(null);
            } else {
                objProxy.realmSet$pelaksana((String) json.getString("pelaksana"));
            }
        }
        if (json.has("verify")) {
            if (json.isNull("verify")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'verify' to null.");
            } else {
                objProxy.realmSet$verify((int) json.getInt("verify"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        if (json.has("deleterec")) {
            if (json.isNull("deleterec")) {
                objProxy.realmSet$deleterec(null);
            } else {
                objProxy.realmSet$deleterec((String) json.getString("deleterec"));
            }
        }
        if (json.has("flag")) {
            if (json.isNull("flag")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
            } else {
                objProxy.realmSet$flag((boolean) json.getBoolean("flag"));
            }
        }
        if (json.has("insert")) {
            if (json.isNull("insert")) {
                objProxy.realmSet$insert(null);
            } else {
                objProxy.realmSet$insert((String) json.getString("insert"));
            }
        }
        if (json.has("update")) {
            if (json.isNull("update")) {
                objProxy.realmSet$update(null);
            } else {
                objProxy.realmSet$update((String) json.getString("update"));
            }
        }
        if (json.has("skip_update")) {
            if (json.isNull("skip_update")) {
                objProxy.realmSet$skip_update(null);
            } else {
                objProxy.realmSet$skip_update((String) json.getString("skip_update"));
            }
        }
        if (json.has("delete")) {
            if (json.isNull("delete")) {
                objProxy.realmSet$delete(null);
            } else {
                objProxy.realmSet$delete((String) json.getString("delete"));
            }
        }
        if (json.has("rec_baru_server")) {
            if (json.isNull("rec_baru_server")) {
                objProxy.realmSet$rec_baru_server(null);
            } else {
                objProxy.realmSet$rec_baru_server((String) json.getString("rec_baru_server"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.Blanko0405 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Blanko0405 obj = new com.pusair.smopi.Model.Blanko0405();
        final com_pusair_smopi_Model_Blanko0405RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("kd_staf")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_staf((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_staf(null);
                }
            } else if (name.equals("kd_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_mt((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
                }
            } else if (name.equals("urut_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urut_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$urut_mt(null);
                }
            } else if (name.equals("thbln")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thbln((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thbln(null);
                }
            } else if (name.equals("poda_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$poda_air((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'poda_air' to null.");
                }
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("rs_padi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_padi((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_padi' to null.");
                }
            } else if (name.equals("rs_tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_tebu_muda' to null.");
                }
            } else if (name.equals("rs_tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_tebu_tua' to null.");
                }
            } else if (name.equals("rs_palawija")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_palawija((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_palawija' to null.");
                }
            } else if (name.equals("rs_gadu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_gadu((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_gadu' to null.");
                }
            } else if (name.equals("rs_lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_lain' to null.");
                }
            } else if (name.equals("rs_bero")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rs_bero((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rs_bero' to null.");
                }
            } else if (name.equals("us_padi_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_olahtanah' to null.");
                }
            } else if (name.equals("us_padi_tumbuh")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_tumbuh((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_tumbuh' to null.");
                }
            } else if (name.equals("us_padi_panen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_panen((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_panen' to null.");
                }
            } else if (name.equals("us_tebu_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_olahtanah' to null.");
                }
            } else if (name.equals("us_tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_muda' to null.");
                }
            } else if (name.equals("us_tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_tua' to null.");
                }
            } else if (name.equals("us_wija_byk_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_wija_byk_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_byk_air' to null.");
                }
            } else if (name.equals("us_wija_dkt_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_wija_dkt_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_dkt_air' to null.");
                }
            } else if (name.equals("us_gadu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_gadu((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_gadu' to null.");
                }
            } else if (name.equals("us_lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_lain' to null.");
                }
            } else if (name.equals("us_bero")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_bero((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_bero' to null.");
                }
            } else if (name.equals("ka_airpetak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_airpetak((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ka_airpetak(null);
                }
            } else if (name.equals("padi_krg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$padi_krg((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'padi_krg' to null.");
                }
            } else if (name.equals("tebu_krg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_krg((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_krg' to null.");
                }
            } else if (name.equals("wija_krg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wija_krg((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'wija_krg' to null.");
                }
            } else if (name.equals("padi_bjr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$padi_bjr((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'padi_bjr' to null.");
                }
            } else if (name.equals("tebu_bjr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_bjr((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_bjr' to null.");
                }
            } else if (name.equals("wija_bjr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wija_bjr((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'wija_bjr' to null.");
                }
            } else if (name.equals("kb_padi_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_padi_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_olahtanah' to null.");
                }
            } else if (name.equals("kb_padi_tumbuh")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_padi_tumbuh((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_tumbuh' to null.");
                }
            } else if (name.equals("kb_padi_panen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_padi_panen((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_padi_panen' to null.");
                }
            } else if (name.equals("kb_tebu_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_tebu_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_olahtanah' to null.");
                }
            } else if (name.equals("kb_tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_muda' to null.");
                }
            } else if (name.equals("kb_tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_tebu_tua' to null.");
                }
            } else if (name.equals("kb_wija_byk_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_wija_byk_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_wija_byk_air' to null.");
                }
            } else if (name.equals("kb_wija_dkt_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_wija_dkt_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_wija_dkt_air' to null.");
                }
            } else if (name.equals("kb_gadu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_gadu((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_gadu' to null.");
                }
            } else if (name.equals("kb_lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kb_lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kb_lain' to null.");
                }
            } else if (name.equals("jum_dsawah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jum_dsawah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jum_dsawah' to null.");
                }
            } else if (name.equals("faktor_tersier")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$faktor_tersier((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'faktor_tersier' to null.");
                }
            } else if (name.equals("air_tersier")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$air_tersier((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'air_tersier' to null.");
                }
            } else if (name.equals("kerusakan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kerusakan((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kerusakan' to null.");
                }
            } else if (name.equals("pelaksana")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pelaksana((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pelaksana(null);
                }
            } else if (name.equals("verify")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$verify((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'verify' to null.");
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
                }
            } else if (name.equals("deleterec")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deleterec((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deleterec(null);
                }
            } else if (name.equals("flag")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flag((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
                }
            } else if (name.equals("insert")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$insert((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$insert(null);
                }
            } else if (name.equals("update")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$update((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$update(null);
                }
            } else if (name.equals("skip_update")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$skip_update((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$skip_update(null);
                }
            } else if (name.equals("delete")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delete((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$delete(null);
                }
            } else if (name.equals("rec_baru_server")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rec_baru_server((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rec_baru_server(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.Blanko0405 copyOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko0405 object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko0405) cachedRealmObject;
        }

        com.pusair.smopi.Model.Blanko0405 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
            Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Blanko0405 copy(Realm realm, com.pusair.smopi.Model.Blanko0405 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko0405) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Blanko0405 realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Blanko0405.class, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_Blanko0405RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) newObject;
        com_pusair_smopi_Model_Blanko0405RealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectCopy.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectCopy.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$rs_padi(realmObjectSource.realmGet$rs_padi());
        realmObjectCopy.realmSet$rs_tebu_muda(realmObjectSource.realmGet$rs_tebu_muda());
        realmObjectCopy.realmSet$rs_tebu_tua(realmObjectSource.realmGet$rs_tebu_tua());
        realmObjectCopy.realmSet$rs_palawija(realmObjectSource.realmGet$rs_palawija());
        realmObjectCopy.realmSet$rs_gadu(realmObjectSource.realmGet$rs_gadu());
        realmObjectCopy.realmSet$rs_lain(realmObjectSource.realmGet$rs_lain());
        realmObjectCopy.realmSet$rs_bero(realmObjectSource.realmGet$rs_bero());
        realmObjectCopy.realmSet$us_padi_olahtanah(realmObjectSource.realmGet$us_padi_olahtanah());
        realmObjectCopy.realmSet$us_padi_tumbuh(realmObjectSource.realmGet$us_padi_tumbuh());
        realmObjectCopy.realmSet$us_padi_panen(realmObjectSource.realmGet$us_padi_panen());
        realmObjectCopy.realmSet$us_tebu_olahtanah(realmObjectSource.realmGet$us_tebu_olahtanah());
        realmObjectCopy.realmSet$us_tebu_muda(realmObjectSource.realmGet$us_tebu_muda());
        realmObjectCopy.realmSet$us_tebu_tua(realmObjectSource.realmGet$us_tebu_tua());
        realmObjectCopy.realmSet$us_wija_byk_air(realmObjectSource.realmGet$us_wija_byk_air());
        realmObjectCopy.realmSet$us_wija_dkt_air(realmObjectSource.realmGet$us_wija_dkt_air());
        realmObjectCopy.realmSet$us_gadu(realmObjectSource.realmGet$us_gadu());
        realmObjectCopy.realmSet$us_lain(realmObjectSource.realmGet$us_lain());
        realmObjectCopy.realmSet$us_bero(realmObjectSource.realmGet$us_bero());
        realmObjectCopy.realmSet$ka_airpetak(realmObjectSource.realmGet$ka_airpetak());
        realmObjectCopy.realmSet$padi_krg(realmObjectSource.realmGet$padi_krg());
        realmObjectCopy.realmSet$tebu_krg(realmObjectSource.realmGet$tebu_krg());
        realmObjectCopy.realmSet$wija_krg(realmObjectSource.realmGet$wija_krg());
        realmObjectCopy.realmSet$padi_bjr(realmObjectSource.realmGet$padi_bjr());
        realmObjectCopy.realmSet$tebu_bjr(realmObjectSource.realmGet$tebu_bjr());
        realmObjectCopy.realmSet$wija_bjr(realmObjectSource.realmGet$wija_bjr());
        realmObjectCopy.realmSet$kb_padi_olahtanah(realmObjectSource.realmGet$kb_padi_olahtanah());
        realmObjectCopy.realmSet$kb_padi_tumbuh(realmObjectSource.realmGet$kb_padi_tumbuh());
        realmObjectCopy.realmSet$kb_padi_panen(realmObjectSource.realmGet$kb_padi_panen());
        realmObjectCopy.realmSet$kb_tebu_olahtanah(realmObjectSource.realmGet$kb_tebu_olahtanah());
        realmObjectCopy.realmSet$kb_tebu_muda(realmObjectSource.realmGet$kb_tebu_muda());
        realmObjectCopy.realmSet$kb_tebu_tua(realmObjectSource.realmGet$kb_tebu_tua());
        realmObjectCopy.realmSet$kb_wija_byk_air(realmObjectSource.realmGet$kb_wija_byk_air());
        realmObjectCopy.realmSet$kb_wija_dkt_air(realmObjectSource.realmGet$kb_wija_dkt_air());
        realmObjectCopy.realmSet$kb_gadu(realmObjectSource.realmGet$kb_gadu());
        realmObjectCopy.realmSet$kb_lain(realmObjectSource.realmGet$kb_lain());
        realmObjectCopy.realmSet$jum_dsawah(realmObjectSource.realmGet$jum_dsawah());
        realmObjectCopy.realmSet$faktor_tersier(realmObjectSource.realmGet$faktor_tersier());
        realmObjectCopy.realmSet$air_tersier(realmObjectSource.realmGet$air_tersier());
        realmObjectCopy.realmSet$kerusakan(realmObjectSource.realmGet$kerusakan());
        realmObjectCopy.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectCopy.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Blanko0405 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        }
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$poda_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$luas_swiri(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_bero(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_bero(), false);
        String realmGet$ka_airpetak = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$ka_airpetak();
        if (realmGet$ka_airpetak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, realmGet$ka_airpetak, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.padi_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.wija_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.padi_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.wija_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jum_dsawahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$jum_dsawah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.faktor_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$faktor_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.air_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$air_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kerusakan(), false);
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$verify(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko0405 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko0405) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            }
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$poda_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$luas_swiri(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_bero(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_bero(), false);
            String realmGet$ka_airpetak = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$ka_airpetak();
            if (realmGet$ka_airpetak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, realmGet$ka_airpetak, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.padi_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.wija_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.padi_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.wija_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jum_dsawahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$jum_dsawah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.faktor_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$faktor_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.air_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$air_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kerusakan(), false);
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$verify(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko0405 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
        }
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$poda_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$luas_swiri(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rs_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_bero(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_bero(), false);
        String realmGet$ka_airpetak = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$ka_airpetak();
        if (realmGet$ka_airpetak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, realmGet$ka_airpetak, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.padi_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.wija_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_krg(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.padi_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.wija_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_bjr(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kb_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jum_dsawahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$jum_dsawah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.faktor_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$faktor_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.air_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$air_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kerusakan(), false);
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$verify(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0405.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0405ColumnInfo columnInfo = (Blanko0405ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0405.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko0405 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko0405) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
            }
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$poda_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$luas_swiri(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rs_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rs_bero(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$us_bero(), false);
            String realmGet$ka_airpetak = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$ka_airpetak();
            if (realmGet$ka_airpetak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, realmGet$ka_airpetak, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ka_airpetakIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.padi_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.wija_krgIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_krg(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.padi_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$padi_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tebu_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.wija_bjrIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$wija_bjr(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kb_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kb_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jum_dsawahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$jum_dsawah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.faktor_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$faktor_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.air_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$air_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$kerusakan(), false);
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$verify(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0405RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Blanko0405 createDetachedCopy(com.pusair.smopi.Model.Blanko0405 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Blanko0405 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Blanko0405();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Blanko0405) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Blanko0405) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_Blanko0405RealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_Blanko0405RealmProxyInterface realmSource = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$urut_mt(realmSource.realmGet$urut_mt());
        unmanagedCopy.realmSet$thbln(realmSource.realmGet$thbln());
        unmanagedCopy.realmSet$poda_air(realmSource.realmGet$poda_air());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$rs_padi(realmSource.realmGet$rs_padi());
        unmanagedCopy.realmSet$rs_tebu_muda(realmSource.realmGet$rs_tebu_muda());
        unmanagedCopy.realmSet$rs_tebu_tua(realmSource.realmGet$rs_tebu_tua());
        unmanagedCopy.realmSet$rs_palawija(realmSource.realmGet$rs_palawija());
        unmanagedCopy.realmSet$rs_gadu(realmSource.realmGet$rs_gadu());
        unmanagedCopy.realmSet$rs_lain(realmSource.realmGet$rs_lain());
        unmanagedCopy.realmSet$rs_bero(realmSource.realmGet$rs_bero());
        unmanagedCopy.realmSet$us_padi_olahtanah(realmSource.realmGet$us_padi_olahtanah());
        unmanagedCopy.realmSet$us_padi_tumbuh(realmSource.realmGet$us_padi_tumbuh());
        unmanagedCopy.realmSet$us_padi_panen(realmSource.realmGet$us_padi_panen());
        unmanagedCopy.realmSet$us_tebu_olahtanah(realmSource.realmGet$us_tebu_olahtanah());
        unmanagedCopy.realmSet$us_tebu_muda(realmSource.realmGet$us_tebu_muda());
        unmanagedCopy.realmSet$us_tebu_tua(realmSource.realmGet$us_tebu_tua());
        unmanagedCopy.realmSet$us_wija_byk_air(realmSource.realmGet$us_wija_byk_air());
        unmanagedCopy.realmSet$us_wija_dkt_air(realmSource.realmGet$us_wija_dkt_air());
        unmanagedCopy.realmSet$us_gadu(realmSource.realmGet$us_gadu());
        unmanagedCopy.realmSet$us_lain(realmSource.realmGet$us_lain());
        unmanagedCopy.realmSet$us_bero(realmSource.realmGet$us_bero());
        unmanagedCopy.realmSet$ka_airpetak(realmSource.realmGet$ka_airpetak());
        unmanagedCopy.realmSet$padi_krg(realmSource.realmGet$padi_krg());
        unmanagedCopy.realmSet$tebu_krg(realmSource.realmGet$tebu_krg());
        unmanagedCopy.realmSet$wija_krg(realmSource.realmGet$wija_krg());
        unmanagedCopy.realmSet$padi_bjr(realmSource.realmGet$padi_bjr());
        unmanagedCopy.realmSet$tebu_bjr(realmSource.realmGet$tebu_bjr());
        unmanagedCopy.realmSet$wija_bjr(realmSource.realmGet$wija_bjr());
        unmanagedCopy.realmSet$kb_padi_olahtanah(realmSource.realmGet$kb_padi_olahtanah());
        unmanagedCopy.realmSet$kb_padi_tumbuh(realmSource.realmGet$kb_padi_tumbuh());
        unmanagedCopy.realmSet$kb_padi_panen(realmSource.realmGet$kb_padi_panen());
        unmanagedCopy.realmSet$kb_tebu_olahtanah(realmSource.realmGet$kb_tebu_olahtanah());
        unmanagedCopy.realmSet$kb_tebu_muda(realmSource.realmGet$kb_tebu_muda());
        unmanagedCopy.realmSet$kb_tebu_tua(realmSource.realmGet$kb_tebu_tua());
        unmanagedCopy.realmSet$kb_wija_byk_air(realmSource.realmGet$kb_wija_byk_air());
        unmanagedCopy.realmSet$kb_wija_dkt_air(realmSource.realmGet$kb_wija_dkt_air());
        unmanagedCopy.realmSet$kb_gadu(realmSource.realmGet$kb_gadu());
        unmanagedCopy.realmSet$kb_lain(realmSource.realmGet$kb_lain());
        unmanagedCopy.realmSet$jum_dsawah(realmSource.realmGet$jum_dsawah());
        unmanagedCopy.realmSet$faktor_tersier(realmSource.realmGet$faktor_tersier());
        unmanagedCopy.realmSet$air_tersier(realmSource.realmGet$air_tersier());
        unmanagedCopy.realmSet$kerusakan(realmSource.realmGet$kerusakan());
        unmanagedCopy.realmSet$pelaksana(realmSource.realmGet$pelaksana());
        unmanagedCopy.realmSet$verify(realmSource.realmGet$verify());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Blanko0405 update(Realm realm, com.pusair.smopi.Model.Blanko0405 realmObject, com.pusair.smopi.Model.Blanko0405 newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_Blanko0405RealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) realmObject;
        com_pusair_smopi_Model_Blanko0405RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko0405RealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectTarget.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectTarget.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$rs_padi(realmObjectSource.realmGet$rs_padi());
        realmObjectTarget.realmSet$rs_tebu_muda(realmObjectSource.realmGet$rs_tebu_muda());
        realmObjectTarget.realmSet$rs_tebu_tua(realmObjectSource.realmGet$rs_tebu_tua());
        realmObjectTarget.realmSet$rs_palawija(realmObjectSource.realmGet$rs_palawija());
        realmObjectTarget.realmSet$rs_gadu(realmObjectSource.realmGet$rs_gadu());
        realmObjectTarget.realmSet$rs_lain(realmObjectSource.realmGet$rs_lain());
        realmObjectTarget.realmSet$rs_bero(realmObjectSource.realmGet$rs_bero());
        realmObjectTarget.realmSet$us_padi_olahtanah(realmObjectSource.realmGet$us_padi_olahtanah());
        realmObjectTarget.realmSet$us_padi_tumbuh(realmObjectSource.realmGet$us_padi_tumbuh());
        realmObjectTarget.realmSet$us_padi_panen(realmObjectSource.realmGet$us_padi_panen());
        realmObjectTarget.realmSet$us_tebu_olahtanah(realmObjectSource.realmGet$us_tebu_olahtanah());
        realmObjectTarget.realmSet$us_tebu_muda(realmObjectSource.realmGet$us_tebu_muda());
        realmObjectTarget.realmSet$us_tebu_tua(realmObjectSource.realmGet$us_tebu_tua());
        realmObjectTarget.realmSet$us_wija_byk_air(realmObjectSource.realmGet$us_wija_byk_air());
        realmObjectTarget.realmSet$us_wija_dkt_air(realmObjectSource.realmGet$us_wija_dkt_air());
        realmObjectTarget.realmSet$us_gadu(realmObjectSource.realmGet$us_gadu());
        realmObjectTarget.realmSet$us_lain(realmObjectSource.realmGet$us_lain());
        realmObjectTarget.realmSet$us_bero(realmObjectSource.realmGet$us_bero());
        realmObjectTarget.realmSet$ka_airpetak(realmObjectSource.realmGet$ka_airpetak());
        realmObjectTarget.realmSet$padi_krg(realmObjectSource.realmGet$padi_krg());
        realmObjectTarget.realmSet$tebu_krg(realmObjectSource.realmGet$tebu_krg());
        realmObjectTarget.realmSet$wija_krg(realmObjectSource.realmGet$wija_krg());
        realmObjectTarget.realmSet$padi_bjr(realmObjectSource.realmGet$padi_bjr());
        realmObjectTarget.realmSet$tebu_bjr(realmObjectSource.realmGet$tebu_bjr());
        realmObjectTarget.realmSet$wija_bjr(realmObjectSource.realmGet$wija_bjr());
        realmObjectTarget.realmSet$kb_padi_olahtanah(realmObjectSource.realmGet$kb_padi_olahtanah());
        realmObjectTarget.realmSet$kb_padi_tumbuh(realmObjectSource.realmGet$kb_padi_tumbuh());
        realmObjectTarget.realmSet$kb_padi_panen(realmObjectSource.realmGet$kb_padi_panen());
        realmObjectTarget.realmSet$kb_tebu_olahtanah(realmObjectSource.realmGet$kb_tebu_olahtanah());
        realmObjectTarget.realmSet$kb_tebu_muda(realmObjectSource.realmGet$kb_tebu_muda());
        realmObjectTarget.realmSet$kb_tebu_tua(realmObjectSource.realmGet$kb_tebu_tua());
        realmObjectTarget.realmSet$kb_wija_byk_air(realmObjectSource.realmGet$kb_wija_byk_air());
        realmObjectTarget.realmSet$kb_wija_dkt_air(realmObjectSource.realmGet$kb_wija_dkt_air());
        realmObjectTarget.realmSet$kb_gadu(realmObjectSource.realmGet$kb_gadu());
        realmObjectTarget.realmSet$kb_lain(realmObjectSource.realmGet$kb_lain());
        realmObjectTarget.realmSet$jum_dsawah(realmObjectSource.realmGet$jum_dsawah());
        realmObjectTarget.realmSet$faktor_tersier(realmObjectSource.realmGet$faktor_tersier());
        realmObjectTarget.realmSet$air_tersier(realmObjectSource.realmGet$air_tersier());
        realmObjectTarget.realmSet$kerusakan(realmObjectSource.realmGet$kerusakan());
        realmObjectTarget.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectTarget.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectTarget.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectTarget.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectTarget.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectTarget.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectTarget.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectTarget.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectTarget.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Blanko0405 = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_staf:");
        stringBuilder.append(realmGet$kd_staf() != null ? realmGet$kd_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_mt:");
        stringBuilder.append(realmGet$kd_mt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urut_mt:");
        stringBuilder.append(realmGet$urut_mt() != null ? realmGet$urut_mt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thbln:");
        stringBuilder.append(realmGet$thbln() != null ? realmGet$thbln() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{poda_air:");
        stringBuilder.append(realmGet$poda_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_padi:");
        stringBuilder.append(realmGet$rs_padi());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_tebu_muda:");
        stringBuilder.append(realmGet$rs_tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_tebu_tua:");
        stringBuilder.append(realmGet$rs_tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_palawija:");
        stringBuilder.append(realmGet$rs_palawija());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_gadu:");
        stringBuilder.append(realmGet$rs_gadu());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_lain:");
        stringBuilder.append(realmGet$rs_lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rs_bero:");
        stringBuilder.append(realmGet$rs_bero());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_olahtanah:");
        stringBuilder.append(realmGet$us_padi_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_tumbuh:");
        stringBuilder.append(realmGet$us_padi_tumbuh());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_panen:");
        stringBuilder.append(realmGet$us_padi_panen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_olahtanah:");
        stringBuilder.append(realmGet$us_tebu_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_muda:");
        stringBuilder.append(realmGet$us_tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_tua:");
        stringBuilder.append(realmGet$us_tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_wija_byk_air:");
        stringBuilder.append(realmGet$us_wija_byk_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_wija_dkt_air:");
        stringBuilder.append(realmGet$us_wija_dkt_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_gadu:");
        stringBuilder.append(realmGet$us_gadu());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_lain:");
        stringBuilder.append(realmGet$us_lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_bero:");
        stringBuilder.append(realmGet$us_bero());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_airpetak:");
        stringBuilder.append(realmGet$ka_airpetak() != null ? realmGet$ka_airpetak() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{padi_krg:");
        stringBuilder.append(realmGet$padi_krg());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_krg:");
        stringBuilder.append(realmGet$tebu_krg());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wija_krg:");
        stringBuilder.append(realmGet$wija_krg());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{padi_bjr:");
        stringBuilder.append(realmGet$padi_bjr());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_bjr:");
        stringBuilder.append(realmGet$tebu_bjr());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wija_bjr:");
        stringBuilder.append(realmGet$wija_bjr());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_padi_olahtanah:");
        stringBuilder.append(realmGet$kb_padi_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_padi_tumbuh:");
        stringBuilder.append(realmGet$kb_padi_tumbuh());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_padi_panen:");
        stringBuilder.append(realmGet$kb_padi_panen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_tebu_olahtanah:");
        stringBuilder.append(realmGet$kb_tebu_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_tebu_muda:");
        stringBuilder.append(realmGet$kb_tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_tebu_tua:");
        stringBuilder.append(realmGet$kb_tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_wija_byk_air:");
        stringBuilder.append(realmGet$kb_wija_byk_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_wija_dkt_air:");
        stringBuilder.append(realmGet$kb_wija_dkt_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_gadu:");
        stringBuilder.append(realmGet$kb_gadu());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kb_lain:");
        stringBuilder.append(realmGet$kb_lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jum_dsawah:");
        stringBuilder.append(realmGet$jum_dsawah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{faktor_tersier:");
        stringBuilder.append(realmGet$faktor_tersier());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{air_tersier:");
        stringBuilder.append(realmGet$air_tersier());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kerusakan:");
        stringBuilder.append(realmGet$kerusakan());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pelaksana:");
        stringBuilder.append(realmGet$pelaksana() != null ? realmGet$pelaksana() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{verify:");
        stringBuilder.append(realmGet$verify());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deleterec:");
        stringBuilder.append(realmGet$deleterec() != null ? realmGet$deleterec() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flag:");
        stringBuilder.append(realmGet$flag());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insert:");
        stringBuilder.append(realmGet$insert() != null ? realmGet$insert() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{update:");
        stringBuilder.append(realmGet$update() != null ? realmGet$update() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{skip_update:");
        stringBuilder.append(realmGet$skip_update() != null ? realmGet$skip_update() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delete:");
        stringBuilder.append(realmGet$delete() != null ? realmGet$delete() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rec_baru_server:");
        stringBuilder.append(realmGet$rec_baru_server() != null ? realmGet$rec_baru_server() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_pusair_smopi_Model_Blanko0405RealmProxy aBlanko0405 = (com_pusair_smopi_Model_Blanko0405RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlanko0405.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlanko0405.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlanko0405.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
