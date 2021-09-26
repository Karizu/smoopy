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
public class com_pusair_smopi_Model_Blanko08RealmProxy extends com.pusair.smopi.Model.Blanko08
    implements RealmObjectProxy, com_pusair_smopi_Model_Blanko08RealmProxyInterface {

    static final class Blanko08ColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_mtIndex;
        long thblnIndex;
        long poda_airIndex;
        long tglIndex;
        long h_bendungIndex;
        long q_bendungIndex;
        long h_ki_ambilIndex;
        long q_ki_ambilIndex;
        long h_ka_ambilIndex;
        long q_ka_ambilIndex;
        long qsungaiIndex;
        long qsungai_rataIndex;
        long qef_kiIndex;
        long qef_kaIndex;
        long pelaksanaIndex;
        long verifyIndex;
        long sungaiIndex;
        long bendungIndex;
        long tgleditIndex;
        long flagIndex;
        long deleterecIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;

        Blanko08ColumnInfo(OsSchemaInfo schemaInfo) {
            super(28);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Blanko08");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.thblnIndex = addColumnDetails("thbln", "thbln", objectSchemaInfo);
            this.poda_airIndex = addColumnDetails("poda_air", "poda_air", objectSchemaInfo);
            this.tglIndex = addColumnDetails("tgl", "tgl", objectSchemaInfo);
            this.h_bendungIndex = addColumnDetails("h_bendung", "h_bendung", objectSchemaInfo);
            this.q_bendungIndex = addColumnDetails("q_bendung", "q_bendung", objectSchemaInfo);
            this.h_ki_ambilIndex = addColumnDetails("h_ki_ambil", "h_ki_ambil", objectSchemaInfo);
            this.q_ki_ambilIndex = addColumnDetails("q_ki_ambil", "q_ki_ambil", objectSchemaInfo);
            this.h_ka_ambilIndex = addColumnDetails("h_ka_ambil", "h_ka_ambil", objectSchemaInfo);
            this.q_ka_ambilIndex = addColumnDetails("q_ka_ambil", "q_ka_ambil", objectSchemaInfo);
            this.qsungaiIndex = addColumnDetails("qsungai", "qsungai", objectSchemaInfo);
            this.qsungai_rataIndex = addColumnDetails("qsungai_rata", "qsungai_rata", objectSchemaInfo);
            this.qef_kiIndex = addColumnDetails("qef_ki", "qef_ki", objectSchemaInfo);
            this.qef_kaIndex = addColumnDetails("qef_ka", "qef_ka", objectSchemaInfo);
            this.pelaksanaIndex = addColumnDetails("pelaksana", "pelaksana", objectSchemaInfo);
            this.verifyIndex = addColumnDetails("verify", "verify", objectSchemaInfo);
            this.sungaiIndex = addColumnDetails("sungai", "sungai", objectSchemaInfo);
            this.bendungIndex = addColumnDetails("bendung", "bendung", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
        }

        Blanko08ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Blanko08ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Blanko08ColumnInfo src = (Blanko08ColumnInfo) rawSrc;
            final Blanko08ColumnInfo dst = (Blanko08ColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.thblnIndex = src.thblnIndex;
            dst.poda_airIndex = src.poda_airIndex;
            dst.tglIndex = src.tglIndex;
            dst.h_bendungIndex = src.h_bendungIndex;
            dst.q_bendungIndex = src.q_bendungIndex;
            dst.h_ki_ambilIndex = src.h_ki_ambilIndex;
            dst.q_ki_ambilIndex = src.q_ki_ambilIndex;
            dst.h_ka_ambilIndex = src.h_ka_ambilIndex;
            dst.q_ka_ambilIndex = src.q_ka_ambilIndex;
            dst.qsungaiIndex = src.qsungaiIndex;
            dst.qsungai_rataIndex = src.qsungai_rataIndex;
            dst.qef_kiIndex = src.qef_kiIndex;
            dst.qef_kaIndex = src.qef_kaIndex;
            dst.pelaksanaIndex = src.pelaksanaIndex;
            dst.verifyIndex = src.verifyIndex;
            dst.sungaiIndex = src.sungaiIndex;
            dst.bendungIndex = src.bendungIndex;
            dst.tgleditIndex = src.tgleditIndex;
            dst.flagIndex = src.flagIndex;
            dst.deleterecIndex = src.deleterecIndex;
            dst.insertIndex = src.insertIndex;
            dst.updateIndex = src.updateIndex;
            dst.skip_updateIndex = src.skip_updateIndex;
            dst.deleteIndex = src.deleteIndex;
            dst.rec_baru_serverIndex = src.rec_baru_serverIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Blanko08ColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Blanko08> proxyState;

    com_pusair_smopi_Model_Blanko08RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Blanko08ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Blanko08>(this);
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
    public String realmGet$tgl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tglIndex);
    }

    @Override
    public void realmSet$tgl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tglIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tglIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tglIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tglIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$h_bendung() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.h_bendungIndex);
    }

    @Override
    public void realmSet$h_bendung(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.h_bendungIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.h_bendungIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$q_bendung() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.q_bendungIndex);
    }

    @Override
    public void realmSet$q_bendung(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.q_bendungIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.q_bendungIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$h_ki_ambil() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.h_ki_ambilIndex);
    }

    @Override
    public void realmSet$h_ki_ambil(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.h_ki_ambilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.h_ki_ambilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$q_ki_ambil() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.q_ki_ambilIndex);
    }

    @Override
    public void realmSet$q_ki_ambil(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.q_ki_ambilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.q_ki_ambilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$h_ka_ambil() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.h_ka_ambilIndex);
    }

    @Override
    public void realmSet$h_ka_ambil(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.h_ka_ambilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.h_ka_ambilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$q_ka_ambil() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.q_ka_ambilIndex);
    }

    @Override
    public void realmSet$q_ka_ambil(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.q_ka_ambilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.q_ka_ambilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qsungai() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qsungaiIndex);
    }

    @Override
    public void realmSet$qsungai(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qsungaiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qsungaiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qsungai_rata() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qsungai_rataIndex);
    }

    @Override
    public void realmSet$qsungai_rata(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qsungai_rataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qsungai_rataIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$qef_ki() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.qef_kiIndex);
    }

    @Override
    public void realmSet$qef_ki(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.qef_kiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.qef_kiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.qef_kiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.qef_kiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$qef_ka() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.qef_kaIndex);
    }

    @Override
    public void realmSet$qef_ka(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.qef_kaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.qef_kaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.qef_kaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.qef_kaIndex, value);
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
    public String realmGet$verify() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.verifyIndex);
    }

    @Override
    public void realmSet$verify(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.verifyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.verifyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.verifyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.verifyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sungai() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sungaiIndex);
    }

    @Override
    public void realmSet$sungai(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sungaiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.sungaiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sungaiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sungaiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bendung() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bendungIndex);
    }

    @Override
    public void realmSet$bendung(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bendungIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.bendungIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bendungIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bendungIndex, value);
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
    public Boolean realmGet$flag() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.flagIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.flagIndex);
    }

    @Override
    public void realmSet$flag(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.flagIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.flagIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.flagIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.flagIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Blanko08", 28, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thbln", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("poda_air", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("h_bendung", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("q_bendung", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("h_ki_ambil", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("q_ki_ambil", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("h_ka_ambil", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("q_ka_ambil", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qsungai", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qsungai_rata", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qef_ki", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("qef_ka", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pelaksana", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("verify", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sungai", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bendung", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flag", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deleterec", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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

    public static Blanko08ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Blanko08ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Blanko08";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Blanko08";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Blanko08 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Blanko08 obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
            Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_Blanko08RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko08RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko08.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko08RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko08.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_Blanko08RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) obj;
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
        if (json.has("tgl")) {
            if (json.isNull("tgl")) {
                objProxy.realmSet$tgl(null);
            } else {
                objProxy.realmSet$tgl((String) json.getString("tgl"));
            }
        }
        if (json.has("h_bendung")) {
            if (json.isNull("h_bendung")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'h_bendung' to null.");
            } else {
                objProxy.realmSet$h_bendung((float) json.getDouble("h_bendung"));
            }
        }
        if (json.has("q_bendung")) {
            if (json.isNull("q_bendung")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'q_bendung' to null.");
            } else {
                objProxy.realmSet$q_bendung((float) json.getDouble("q_bendung"));
            }
        }
        if (json.has("h_ki_ambil")) {
            if (json.isNull("h_ki_ambil")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'h_ki_ambil' to null.");
            } else {
                objProxy.realmSet$h_ki_ambil((float) json.getDouble("h_ki_ambil"));
            }
        }
        if (json.has("q_ki_ambil")) {
            if (json.isNull("q_ki_ambil")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'q_ki_ambil' to null.");
            } else {
                objProxy.realmSet$q_ki_ambil((float) json.getDouble("q_ki_ambil"));
            }
        }
        if (json.has("h_ka_ambil")) {
            if (json.isNull("h_ka_ambil")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'h_ka_ambil' to null.");
            } else {
                objProxy.realmSet$h_ka_ambil((float) json.getDouble("h_ka_ambil"));
            }
        }
        if (json.has("q_ka_ambil")) {
            if (json.isNull("q_ka_ambil")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'q_ka_ambil' to null.");
            } else {
                objProxy.realmSet$q_ka_ambil((float) json.getDouble("q_ka_ambil"));
            }
        }
        if (json.has("qsungai")) {
            if (json.isNull("qsungai")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qsungai' to null.");
            } else {
                objProxy.realmSet$qsungai((float) json.getDouble("qsungai"));
            }
        }
        if (json.has("qsungai_rata")) {
            if (json.isNull("qsungai_rata")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qsungai_rata' to null.");
            } else {
                objProxy.realmSet$qsungai_rata((float) json.getDouble("qsungai_rata"));
            }
        }
        if (json.has("qef_ki")) {
            if (json.isNull("qef_ki")) {
                objProxy.realmSet$qef_ki(null);
            } else {
                objProxy.realmSet$qef_ki((String) json.getString("qef_ki"));
            }
        }
        if (json.has("qef_ka")) {
            if (json.isNull("qef_ka")) {
                objProxy.realmSet$qef_ka(null);
            } else {
                objProxy.realmSet$qef_ka((String) json.getString("qef_ka"));
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
                objProxy.realmSet$verify(null);
            } else {
                objProxy.realmSet$verify((String) json.getString("verify"));
            }
        }
        if (json.has("sungai")) {
            if (json.isNull("sungai")) {
                objProxy.realmSet$sungai(null);
            } else {
                objProxy.realmSet$sungai((String) json.getString("sungai"));
            }
        }
        if (json.has("bendung")) {
            if (json.isNull("bendung")) {
                objProxy.realmSet$bendung(null);
            } else {
                objProxy.realmSet$bendung((String) json.getString("bendung"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        if (json.has("flag")) {
            if (json.isNull("flag")) {
                objProxy.realmSet$flag(null);
            } else {
                objProxy.realmSet$flag((boolean) json.getBoolean("flag"));
            }
        }
        if (json.has("deleterec")) {
            if (json.isNull("deleterec")) {
                objProxy.realmSet$deleterec(null);
            } else {
                objProxy.realmSet$deleterec((String) json.getString("deleterec"));
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
    public static com.pusair.smopi.Model.Blanko08 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Blanko08 obj = new com.pusair.smopi.Model.Blanko08();
        final com_pusair_smopi_Model_Blanko08RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) obj;
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
            } else if (name.equals("tgl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl(null);
                }
            } else if (name.equals("h_bendung")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$h_bendung((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'h_bendung' to null.");
                }
            } else if (name.equals("q_bendung")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$q_bendung((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'q_bendung' to null.");
                }
            } else if (name.equals("h_ki_ambil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$h_ki_ambil((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'h_ki_ambil' to null.");
                }
            } else if (name.equals("q_ki_ambil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$q_ki_ambil((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'q_ki_ambil' to null.");
                }
            } else if (name.equals("h_ka_ambil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$h_ka_ambil((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'h_ka_ambil' to null.");
                }
            } else if (name.equals("q_ka_ambil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$q_ka_ambil((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'q_ka_ambil' to null.");
                }
            } else if (name.equals("qsungai")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qsungai((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qsungai' to null.");
                }
            } else if (name.equals("qsungai_rata")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qsungai_rata((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qsungai_rata' to null.");
                }
            } else if (name.equals("qef_ki")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qef_ki((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$qef_ki(null);
                }
            } else if (name.equals("qef_ka")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qef_ka((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$qef_ka(null);
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
                    objProxy.realmSet$verify((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$verify(null);
                }
            } else if (name.equals("sungai")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sungai((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sungai(null);
                }
            } else if (name.equals("bendung")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bendung((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bendung(null);
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
                }
            } else if (name.equals("flag")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flag((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$flag(null);
                }
            } else if (name.equals("deleterec")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deleterec((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deleterec(null);
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

    public static com.pusair.smopi.Model.Blanko08 copyOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko08 object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.Blanko08) cachedRealmObject;
        }

        com.pusair.smopi.Model.Blanko08 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
            Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_Blanko08RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Blanko08 copy(Realm realm, com.pusair.smopi.Model.Blanko08 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko08) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Blanko08 realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Blanko08.class, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_Blanko08RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) newObject;
        com_pusair_smopi_Model_Blanko08RealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectCopy.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectCopy.realmSet$tgl(realmObjectSource.realmGet$tgl());
        realmObjectCopy.realmSet$h_bendung(realmObjectSource.realmGet$h_bendung());
        realmObjectCopy.realmSet$q_bendung(realmObjectSource.realmGet$q_bendung());
        realmObjectCopy.realmSet$h_ki_ambil(realmObjectSource.realmGet$h_ki_ambil());
        realmObjectCopy.realmSet$q_ki_ambil(realmObjectSource.realmGet$q_ki_ambil());
        realmObjectCopy.realmSet$h_ka_ambil(realmObjectSource.realmGet$h_ka_ambil());
        realmObjectCopy.realmSet$q_ka_ambil(realmObjectSource.realmGet$q_ka_ambil());
        realmObjectCopy.realmSet$qsungai(realmObjectSource.realmGet$qsungai());
        realmObjectCopy.realmSet$qsungai_rata(realmObjectSource.realmGet$qsungai_rata());
        realmObjectCopy.realmSet$qef_ki(realmObjectSource.realmGet$qef_ki());
        realmObjectCopy.realmSet$qef_ka(realmObjectSource.realmGet$qef_ka());
        realmObjectCopy.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectCopy.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectCopy.realmSet$sungai(realmObjectSource.realmGet$sungai());
        realmObjectCopy.realmSet$bendung(realmObjectSource.realmGet$bendung());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Blanko08 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
        long tableNativePtr = table.getNativePtr();
        Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$poda_air(), false);
        String realmGet$tgl = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgl();
        if (realmGet$tgl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglIndex, rowIndex, realmGet$tgl, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_bendung(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_bendung(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ki_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ki_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ka_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ka_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsungaiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsungai_rataIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai_rata(), false);
        String realmGet$qef_ki = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ki();
        if (realmGet$qef_ki != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, realmGet$qef_ki, false);
        }
        String realmGet$qef_ka = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ka();
        if (realmGet$qef_ka != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, realmGet$qef_ka, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        }
        String realmGet$verify = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$verify();
        if (realmGet$verify != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
        }
        String realmGet$sungai = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$sungai();
        if (realmGet$sungai != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sungaiIndex, rowIndex, realmGet$sungai, false);
        }
        String realmGet$bendung = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$bendung();
        if (realmGet$bendung != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bendungIndex, rowIndex, realmGet$bendung, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        Boolean realmGet$flag = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$flag();
        if (realmGet$flag != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, realmGet$flag, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
        long tableNativePtr = table.getNativePtr();
        Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko08 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko08) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$poda_air(), false);
            String realmGet$tgl = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgl();
            if (realmGet$tgl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglIndex, rowIndex, realmGet$tgl, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_bendung(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_bendung(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ki_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ki_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ka_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ka_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsungaiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsungai_rataIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai_rata(), false);
            String realmGet$qef_ki = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ki();
            if (realmGet$qef_ki != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, realmGet$qef_ki, false);
            }
            String realmGet$qef_ka = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ka();
            if (realmGet$qef_ka != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, realmGet$qef_ka, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            }
            String realmGet$verify = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$verify();
            if (realmGet$verify != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
            }
            String realmGet$sungai = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$sungai();
            if (realmGet$sungai != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sungaiIndex, rowIndex, realmGet$sungai, false);
            }
            String realmGet$bendung = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$bendung();
            if (realmGet$bendung != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bendungIndex, rowIndex, realmGet$bendung, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            Boolean realmGet$flag = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$flag();
            if (realmGet$flag != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, realmGet$flag, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko08 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
        long tableNativePtr = table.getNativePtr();
        Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$poda_air(), false);
        String realmGet$tgl = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgl();
        if (realmGet$tgl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglIndex, rowIndex, realmGet$tgl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tglIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_bendung(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_bendung(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ki_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ki_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.h_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ka_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.q_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ka_ambil(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsungaiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsungai_rataIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai_rata(), false);
        String realmGet$qef_ki = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ki();
        if (realmGet$qef_ki != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, realmGet$qef_ki, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, false);
        }
        String realmGet$qef_ka = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ka();
        if (realmGet$qef_ka != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, realmGet$qef_ka, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
        }
        String realmGet$verify = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$verify();
        if (realmGet$verify != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.verifyIndex, rowIndex, false);
        }
        String realmGet$sungai = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$sungai();
        if (realmGet$sungai != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sungaiIndex, rowIndex, realmGet$sungai, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sungaiIndex, rowIndex, false);
        }
        String realmGet$bendung = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$bendung();
        if (realmGet$bendung != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bendungIndex, rowIndex, realmGet$bendung, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bendungIndex, rowIndex, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        Boolean realmGet$flag = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$flag();
        if (realmGet$flag != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, realmGet$flag, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.flagIndex, rowIndex, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko08.class);
        long tableNativePtr = table.getNativePtr();
        Blanko08ColumnInfo columnInfo = (Blanko08ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko08.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko08 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko08) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$poda_air(), false);
            String realmGet$tgl = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgl();
            if (realmGet$tgl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglIndex, rowIndex, realmGet$tgl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tglIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_bendung(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_bendungIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_bendung(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ki_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_ki_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ki_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.h_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$h_ka_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.q_ka_ambilIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$q_ka_ambil(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsungaiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsungai_rataIndex, rowIndex, ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qsungai_rata(), false);
            String realmGet$qef_ki = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ki();
            if (realmGet$qef_ki != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, realmGet$qef_ki, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.qef_kiIndex, rowIndex, false);
            }
            String realmGet$qef_ka = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$qef_ka();
            if (realmGet$qef_ka != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, realmGet$qef_ka, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.qef_kaIndex, rowIndex, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
            }
            String realmGet$verify = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$verify();
            if (realmGet$verify != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.verifyIndex, rowIndex, false);
            }
            String realmGet$sungai = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$sungai();
            if (realmGet$sungai != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sungaiIndex, rowIndex, realmGet$sungai, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sungaiIndex, rowIndex, false);
            }
            String realmGet$bendung = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$bendung();
            if (realmGet$bendung != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bendungIndex, rowIndex, realmGet$bendung, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bendungIndex, rowIndex, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            Boolean realmGet$flag = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$flag();
            if (realmGet$flag != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, realmGet$flag, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.flagIndex, rowIndex, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko08RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Blanko08 createDetachedCopy(com.pusair.smopi.Model.Blanko08 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Blanko08 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Blanko08();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Blanko08) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Blanko08) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_Blanko08RealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_Blanko08RealmProxyInterface realmSource = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$thbln(realmSource.realmGet$thbln());
        unmanagedCopy.realmSet$poda_air(realmSource.realmGet$poda_air());
        unmanagedCopy.realmSet$tgl(realmSource.realmGet$tgl());
        unmanagedCopy.realmSet$h_bendung(realmSource.realmGet$h_bendung());
        unmanagedCopy.realmSet$q_bendung(realmSource.realmGet$q_bendung());
        unmanagedCopy.realmSet$h_ki_ambil(realmSource.realmGet$h_ki_ambil());
        unmanagedCopy.realmSet$q_ki_ambil(realmSource.realmGet$q_ki_ambil());
        unmanagedCopy.realmSet$h_ka_ambil(realmSource.realmGet$h_ka_ambil());
        unmanagedCopy.realmSet$q_ka_ambil(realmSource.realmGet$q_ka_ambil());
        unmanagedCopy.realmSet$qsungai(realmSource.realmGet$qsungai());
        unmanagedCopy.realmSet$qsungai_rata(realmSource.realmGet$qsungai_rata());
        unmanagedCopy.realmSet$qef_ki(realmSource.realmGet$qef_ki());
        unmanagedCopy.realmSet$qef_ka(realmSource.realmGet$qef_ka());
        unmanagedCopy.realmSet$pelaksana(realmSource.realmGet$pelaksana());
        unmanagedCopy.realmSet$verify(realmSource.realmGet$verify());
        unmanagedCopy.realmSet$sungai(realmSource.realmGet$sungai());
        unmanagedCopy.realmSet$bendung(realmSource.realmGet$bendung());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Blanko08 update(Realm realm, com.pusair.smopi.Model.Blanko08 realmObject, com.pusair.smopi.Model.Blanko08 newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_Blanko08RealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) realmObject;
        com_pusair_smopi_Model_Blanko08RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko08RealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectTarget.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectTarget.realmSet$tgl(realmObjectSource.realmGet$tgl());
        realmObjectTarget.realmSet$h_bendung(realmObjectSource.realmGet$h_bendung());
        realmObjectTarget.realmSet$q_bendung(realmObjectSource.realmGet$q_bendung());
        realmObjectTarget.realmSet$h_ki_ambil(realmObjectSource.realmGet$h_ki_ambil());
        realmObjectTarget.realmSet$q_ki_ambil(realmObjectSource.realmGet$q_ki_ambil());
        realmObjectTarget.realmSet$h_ka_ambil(realmObjectSource.realmGet$h_ka_ambil());
        realmObjectTarget.realmSet$q_ka_ambil(realmObjectSource.realmGet$q_ka_ambil());
        realmObjectTarget.realmSet$qsungai(realmObjectSource.realmGet$qsungai());
        realmObjectTarget.realmSet$qsungai_rata(realmObjectSource.realmGet$qsungai_rata());
        realmObjectTarget.realmSet$qef_ki(realmObjectSource.realmGet$qef_ki());
        realmObjectTarget.realmSet$qef_ka(realmObjectSource.realmGet$qef_ka());
        realmObjectTarget.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectTarget.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectTarget.realmSet$sungai(realmObjectSource.realmGet$sungai());
        realmObjectTarget.realmSet$bendung(realmObjectSource.realmGet$bendung());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectTarget.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectTarget.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
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
        StringBuilder stringBuilder = new StringBuilder("Blanko08 = proxy[");
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
        stringBuilder.append("{thbln:");
        stringBuilder.append(realmGet$thbln() != null ? realmGet$thbln() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{poda_air:");
        stringBuilder.append(realmGet$poda_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl:");
        stringBuilder.append(realmGet$tgl() != null ? realmGet$tgl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{h_bendung:");
        stringBuilder.append(realmGet$h_bendung());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{q_bendung:");
        stringBuilder.append(realmGet$q_bendung());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{h_ki_ambil:");
        stringBuilder.append(realmGet$h_ki_ambil());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{q_ki_ambil:");
        stringBuilder.append(realmGet$q_ki_ambil());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{h_ka_ambil:");
        stringBuilder.append(realmGet$h_ka_ambil());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{q_ka_ambil:");
        stringBuilder.append(realmGet$q_ka_ambil());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qsungai:");
        stringBuilder.append(realmGet$qsungai());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qsungai_rata:");
        stringBuilder.append(realmGet$qsungai_rata());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qef_ki:");
        stringBuilder.append(realmGet$qef_ki() != null ? realmGet$qef_ki() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qef_ka:");
        stringBuilder.append(realmGet$qef_ka() != null ? realmGet$qef_ka() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pelaksana:");
        stringBuilder.append(realmGet$pelaksana() != null ? realmGet$pelaksana() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{verify:");
        stringBuilder.append(realmGet$verify() != null ? realmGet$verify() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sungai:");
        stringBuilder.append(realmGet$sungai() != null ? realmGet$sungai() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bendung:");
        stringBuilder.append(realmGet$bendung() != null ? realmGet$bendung() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flag:");
        stringBuilder.append(realmGet$flag() != null ? realmGet$flag() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deleterec:");
        stringBuilder.append(realmGet$deleterec() != null ? realmGet$deleterec() : "null");
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
        com_pusair_smopi_Model_Blanko08RealmProxy aBlanko08 = (com_pusair_smopi_Model_Blanko08RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlanko08.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlanko08.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlanko08.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
