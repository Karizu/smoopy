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
public class com_pusair_smopi_Model_Blanko0123RealmProxy extends com.pusair.smopi.Model.Blanko0123
    implements RealmObjectProxy, com_pusair_smopi_Model_Blanko0123RealmProxyInterface {

    static final class Blanko0123ColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_mtIndex;
        long kd_orgIndex;
        long jenis_ukIndex;
        long urut_mtIndex;
        long padiIndex;
        long tebu_tuaIndex;
        long tebu_mudaIndex;
        long palawijaIndex;
        long lainIndex;
        long beroIndex;
        long luas_swiriIndex;
        long golIndex;
        long tgl_olahIndex;
        long tgleditIndex;
        long tgl_airawIndex;
        long tgl_airakIndex;
        long tgl_mtIndex;
        long verifyIndex;
        long flagIndex;
        long deleterecIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;

        Blanko0123ColumnInfo(OsSchemaInfo schemaInfo) {
            super(27);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Blanko0123");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.kd_orgIndex = addColumnDetails("kd_org", "kd_org", objectSchemaInfo);
            this.jenis_ukIndex = addColumnDetails("jenis_uk", "jenis_uk", objectSchemaInfo);
            this.urut_mtIndex = addColumnDetails("urut_mt", "urut_mt", objectSchemaInfo);
            this.padiIndex = addColumnDetails("padi", "padi", objectSchemaInfo);
            this.tebu_tuaIndex = addColumnDetails("tebu_tua", "tebu_tua", objectSchemaInfo);
            this.tebu_mudaIndex = addColumnDetails("tebu_muda", "tebu_muda", objectSchemaInfo);
            this.palawijaIndex = addColumnDetails("palawija", "palawija", objectSchemaInfo);
            this.lainIndex = addColumnDetails("lain", "lain", objectSchemaInfo);
            this.beroIndex = addColumnDetails("bero", "bero", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.golIndex = addColumnDetails("gol", "gol", objectSchemaInfo);
            this.tgl_olahIndex = addColumnDetails("tgl_olah", "tgl_olah", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
            this.tgl_airawIndex = addColumnDetails("tgl_airaw", "tgl_airaw", objectSchemaInfo);
            this.tgl_airakIndex = addColumnDetails("tgl_airak", "tgl_airak", objectSchemaInfo);
            this.tgl_mtIndex = addColumnDetails("tgl_mt", "tgl_mt", objectSchemaInfo);
            this.verifyIndex = addColumnDetails("verify", "verify", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
        }

        Blanko0123ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Blanko0123ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Blanko0123ColumnInfo src = (Blanko0123ColumnInfo) rawSrc;
            final Blanko0123ColumnInfo dst = (Blanko0123ColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.kd_orgIndex = src.kd_orgIndex;
            dst.jenis_ukIndex = src.jenis_ukIndex;
            dst.urut_mtIndex = src.urut_mtIndex;
            dst.padiIndex = src.padiIndex;
            dst.tebu_tuaIndex = src.tebu_tuaIndex;
            dst.tebu_mudaIndex = src.tebu_mudaIndex;
            dst.palawijaIndex = src.palawijaIndex;
            dst.lainIndex = src.lainIndex;
            dst.beroIndex = src.beroIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.golIndex = src.golIndex;
            dst.tgl_olahIndex = src.tgl_olahIndex;
            dst.tgleditIndex = src.tgleditIndex;
            dst.tgl_airawIndex = src.tgl_airawIndex;
            dst.tgl_airakIndex = src.tgl_airakIndex;
            dst.tgl_mtIndex = src.tgl_mtIndex;
            dst.verifyIndex = src.verifyIndex;
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

    private Blanko0123ColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Blanko0123> proxyState;

    com_pusair_smopi_Model_Blanko0123RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Blanko0123ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Blanko0123>(this);
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
    public String realmGet$kd_org() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_orgIndex);
    }

    @Override
    public void realmSet$kd_org(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_orgIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_orgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_orgIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_orgIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jenis_uk() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jenis_ukIndex);
    }

    @Override
    public void realmSet$jenis_uk(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jenis_ukIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.jenis_ukIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jenis_ukIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jenis_ukIndex, value);
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
    public float realmGet$padi() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.padiIndex);
    }

    @Override
    public void realmSet$padi(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.padiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.padiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_tuaIndex);
    }

    @Override
    public void realmSet$tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_mudaIndex);
    }

    @Override
    public void realmSet$tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$palawija() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.palawijaIndex);
    }

    @Override
    public void realmSet$palawija(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.palawijaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.palawijaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.lainIndex);
    }

    @Override
    public void realmSet$lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$bero() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.beroIndex);
    }

    @Override
    public void realmSet$bero(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.beroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.beroIndex, value);
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
    public String realmGet$gol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.golIndex);
    }

    @Override
    public void realmSet$gol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.golIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.golIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.golIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.golIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_olah() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_olahIndex);
    }

    @Override
    public void realmSet$tgl_olah(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_olahIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_olahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_olahIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_olahIndex, value);
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
    public String realmGet$tgl_airaw() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_airawIndex);
    }

    @Override
    public void realmSet$tgl_airaw(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_airawIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_airawIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_airawIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_airawIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_airak() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_airakIndex);
    }

    @Override
    public void realmSet$tgl_airak(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_airakIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_airakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_airakIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_airakIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_mtIndex);
    }

    @Override
    public void realmSet$tgl_mt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_mtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_mtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_mtIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Blanko0123", 27, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kd_org", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jenis_uk", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("urut_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("padi", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("palawija", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("bero", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("gol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_olah", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_airaw", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_airak", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("verify", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flag", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
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

    public static Blanko0123ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Blanko0123ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Blanko0123";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Blanko0123";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Blanko0123 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Blanko0123 obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
            Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko0123.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko0123.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_Blanko0123RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) obj;
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
        if (json.has("kd_org")) {
            if (json.isNull("kd_org")) {
                objProxy.realmSet$kd_org(null);
            } else {
                objProxy.realmSet$kd_org((String) json.getString("kd_org"));
            }
        }
        if (json.has("jenis_uk")) {
            if (json.isNull("jenis_uk")) {
                objProxy.realmSet$jenis_uk(null);
            } else {
                objProxy.realmSet$jenis_uk((String) json.getString("jenis_uk"));
            }
        }
        if (json.has("urut_mt")) {
            if (json.isNull("urut_mt")) {
                objProxy.realmSet$urut_mt(null);
            } else {
                objProxy.realmSet$urut_mt((String) json.getString("urut_mt"));
            }
        }
        if (json.has("padi")) {
            if (json.isNull("padi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'padi' to null.");
            } else {
                objProxy.realmSet$padi((float) json.getDouble("padi"));
            }
        }
        if (json.has("tebu_tua")) {
            if (json.isNull("tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_tua' to null.");
            } else {
                objProxy.realmSet$tebu_tua((float) json.getDouble("tebu_tua"));
            }
        }
        if (json.has("tebu_muda")) {
            if (json.isNull("tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_muda' to null.");
            } else {
                objProxy.realmSet$tebu_muda((float) json.getDouble("tebu_muda"));
            }
        }
        if (json.has("palawija")) {
            if (json.isNull("palawija")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'palawija' to null.");
            } else {
                objProxy.realmSet$palawija((float) json.getDouble("palawija"));
            }
        }
        if (json.has("lain")) {
            if (json.isNull("lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lain' to null.");
            } else {
                objProxy.realmSet$lain((float) json.getDouble("lain"));
            }
        }
        if (json.has("bero")) {
            if (json.isNull("bero")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bero' to null.");
            } else {
                objProxy.realmSet$bero((float) json.getDouble("bero"));
            }
        }
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("gol")) {
            if (json.isNull("gol")) {
                objProxy.realmSet$gol(null);
            } else {
                objProxy.realmSet$gol((String) json.getString("gol"));
            }
        }
        if (json.has("tgl_olah")) {
            if (json.isNull("tgl_olah")) {
                objProxy.realmSet$tgl_olah(null);
            } else {
                objProxy.realmSet$tgl_olah((String) json.getString("tgl_olah"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        if (json.has("tgl_airaw")) {
            if (json.isNull("tgl_airaw")) {
                objProxy.realmSet$tgl_airaw(null);
            } else {
                objProxy.realmSet$tgl_airaw((String) json.getString("tgl_airaw"));
            }
        }
        if (json.has("tgl_airak")) {
            if (json.isNull("tgl_airak")) {
                objProxy.realmSet$tgl_airak(null);
            } else {
                objProxy.realmSet$tgl_airak((String) json.getString("tgl_airak"));
            }
        }
        if (json.has("tgl_mt")) {
            if (json.isNull("tgl_mt")) {
                objProxy.realmSet$tgl_mt(null);
            } else {
                objProxy.realmSet$tgl_mt((String) json.getString("tgl_mt"));
            }
        }
        if (json.has("verify")) {
            if (json.isNull("verify")) {
                objProxy.realmSet$verify(null);
            } else {
                objProxy.realmSet$verify((String) json.getString("verify"));
            }
        }
        if (json.has("flag")) {
            if (json.isNull("flag")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
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
    public static com.pusair.smopi.Model.Blanko0123 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Blanko0123 obj = new com.pusair.smopi.Model.Blanko0123();
        final com_pusair_smopi_Model_Blanko0123RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) obj;
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
            } else if (name.equals("kd_org")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_org((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_org(null);
                }
            } else if (name.equals("jenis_uk")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jenis_uk((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jenis_uk(null);
                }
            } else if (name.equals("urut_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urut_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$urut_mt(null);
                }
            } else if (name.equals("padi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$padi((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'padi' to null.");
                }
            } else if (name.equals("tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_tua' to null.");
                }
            } else if (name.equals("tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_muda' to null.");
                }
            } else if (name.equals("palawija")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$palawija((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'palawija' to null.");
                }
            } else if (name.equals("lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lain' to null.");
                }
            } else if (name.equals("bero")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bero((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bero' to null.");
                }
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("gol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gol(null);
                }
            } else if (name.equals("tgl_olah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_olah((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_olah(null);
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
                }
            } else if (name.equals("tgl_airaw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_airaw((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_airaw(null);
                }
            } else if (name.equals("tgl_airak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_airak((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_airak(null);
                }
            } else if (name.equals("tgl_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_mt(null);
                }
            } else if (name.equals("verify")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$verify((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$verify(null);
                }
            } else if (name.equals("flag")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flag((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
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

    public static com.pusair.smopi.Model.Blanko0123 copyOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko0123 object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.Blanko0123) cachedRealmObject;
        }

        com.pusair.smopi.Model.Blanko0123 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
            Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Blanko0123 copy(Realm realm, com.pusair.smopi.Model.Blanko0123 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko0123) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Blanko0123 realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Blanko0123.class, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_Blanko0123RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) newObject;
        com_pusair_smopi_Model_Blanko0123RealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$kd_org(realmObjectSource.realmGet$kd_org());
        realmObjectCopy.realmSet$jenis_uk(realmObjectSource.realmGet$jenis_uk());
        realmObjectCopy.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectCopy.realmSet$padi(realmObjectSource.realmGet$padi());
        realmObjectCopy.realmSet$tebu_tua(realmObjectSource.realmGet$tebu_tua());
        realmObjectCopy.realmSet$tebu_muda(realmObjectSource.realmGet$tebu_muda());
        realmObjectCopy.realmSet$palawija(realmObjectSource.realmGet$palawija());
        realmObjectCopy.realmSet$lain(realmObjectSource.realmGet$lain());
        realmObjectCopy.realmSet$bero(realmObjectSource.realmGet$bero());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectCopy.realmSet$tgl_olah(realmObjectSource.realmGet$tgl_olah());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectCopy.realmSet$tgl_airaw(realmObjectSource.realmGet$tgl_airaw());
        realmObjectCopy.realmSet$tgl_airak(realmObjectSource.realmGet$tgl_airak());
        realmObjectCopy.realmSet$tgl_mt(realmObjectSource.realmGet$tgl_mt());
        realmObjectCopy.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Blanko0123 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$kd_org = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_org();
        if (realmGet$kd_org != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
        }
        String realmGet$jenis_uk = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$jenis_uk();
        if (realmGet$jenis_uk != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, realmGet$jenis_uk, false);
        }
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$bero(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$gol = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$gol();
        if (realmGet$gol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
        }
        String realmGet$tgl_olah = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_olah();
        if (realmGet$tgl_olah != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, realmGet$tgl_olah, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airaw();
        if (realmGet$tgl_airaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
        }
        String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airak();
        if (realmGet$tgl_airak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
        }
        String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_mt();
        if (realmGet$tgl_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
        }
        String realmGet$verify = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$verify();
        if (realmGet$verify != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko0123 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko0123) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$kd_org = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_org();
            if (realmGet$kd_org != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
            }
            String realmGet$jenis_uk = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$jenis_uk();
            if (realmGet$jenis_uk != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, realmGet$jenis_uk, false);
            }
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$bero(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$gol = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$gol();
            if (realmGet$gol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
            }
            String realmGet$tgl_olah = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_olah();
            if (realmGet$tgl_olah != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, realmGet$tgl_olah, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airaw();
            if (realmGet$tgl_airaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
            }
            String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airak();
            if (realmGet$tgl_airak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
            }
            String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_mt();
            if (realmGet$tgl_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
            }
            String realmGet$verify = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$verify();
            if (realmGet$verify != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko0123 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$kd_org = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_org();
        if (realmGet$kd_org != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, false);
        }
        String realmGet$jenis_uk = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$jenis_uk();
        if (realmGet$jenis_uk != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, realmGet$jenis_uk, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, false);
        }
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$bero(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$gol = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$gol();
        if (realmGet$gol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.golIndex, rowIndex, false);
        }
        String realmGet$tgl_olah = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_olah();
        if (realmGet$tgl_olah != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, realmGet$tgl_olah, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airaw();
        if (realmGet$tgl_airaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, false);
        }
        String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airak();
        if (realmGet$tgl_airak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, false);
        }
        String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_mt();
        if (realmGet$tgl_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, false);
        }
        String realmGet$verify = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$verify();
        if (realmGet$verify != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.verifyIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko0123.class);
        long tableNativePtr = table.getNativePtr();
        Blanko0123ColumnInfo columnInfo = (Blanko0123ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko0123.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko0123 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko0123) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$kd_org = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$kd_org();
            if (realmGet$kd_org != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, false);
            }
            String realmGet$jenis_uk = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$jenis_uk();
            if (realmGet$jenis_uk != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, realmGet$jenis_uk, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jenis_ukIndex, rowIndex, false);
            }
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$bero(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$gol = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$gol();
            if (realmGet$gol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.golIndex, rowIndex, false);
            }
            String realmGet$tgl_olah = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_olah();
            if (realmGet$tgl_olah != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, realmGet$tgl_olah, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_olahIndex, rowIndex, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airaw();
            if (realmGet$tgl_airaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, false);
            }
            String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_airak();
            if (realmGet$tgl_airak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, false);
            }
            String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$tgl_mt();
            if (realmGet$tgl_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, false);
            }
            String realmGet$verify = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$verify();
            if (realmGet$verify != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.verifyIndex, rowIndex, realmGet$verify, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.verifyIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko0123RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Blanko0123 createDetachedCopy(com.pusair.smopi.Model.Blanko0123 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Blanko0123 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Blanko0123();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Blanko0123) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Blanko0123) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_Blanko0123RealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_Blanko0123RealmProxyInterface realmSource = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$kd_org(realmSource.realmGet$kd_org());
        unmanagedCopy.realmSet$jenis_uk(realmSource.realmGet$jenis_uk());
        unmanagedCopy.realmSet$urut_mt(realmSource.realmGet$urut_mt());
        unmanagedCopy.realmSet$padi(realmSource.realmGet$padi());
        unmanagedCopy.realmSet$tebu_tua(realmSource.realmGet$tebu_tua());
        unmanagedCopy.realmSet$tebu_muda(realmSource.realmGet$tebu_muda());
        unmanagedCopy.realmSet$palawija(realmSource.realmGet$palawija());
        unmanagedCopy.realmSet$lain(realmSource.realmGet$lain());
        unmanagedCopy.realmSet$bero(realmSource.realmGet$bero());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$gol(realmSource.realmGet$gol());
        unmanagedCopy.realmSet$tgl_olah(realmSource.realmGet$tgl_olah());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());
        unmanagedCopy.realmSet$tgl_airaw(realmSource.realmGet$tgl_airaw());
        unmanagedCopy.realmSet$tgl_airak(realmSource.realmGet$tgl_airak());
        unmanagedCopy.realmSet$tgl_mt(realmSource.realmGet$tgl_mt());
        unmanagedCopy.realmSet$verify(realmSource.realmGet$verify());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Blanko0123 update(Realm realm, com.pusair.smopi.Model.Blanko0123 realmObject, com.pusair.smopi.Model.Blanko0123 newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_Blanko0123RealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) realmObject;
        com_pusair_smopi_Model_Blanko0123RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko0123RealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$kd_org(realmObjectSource.realmGet$kd_org());
        realmObjectTarget.realmSet$jenis_uk(realmObjectSource.realmGet$jenis_uk());
        realmObjectTarget.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectTarget.realmSet$padi(realmObjectSource.realmGet$padi());
        realmObjectTarget.realmSet$tebu_tua(realmObjectSource.realmGet$tebu_tua());
        realmObjectTarget.realmSet$tebu_muda(realmObjectSource.realmGet$tebu_muda());
        realmObjectTarget.realmSet$palawija(realmObjectSource.realmGet$palawija());
        realmObjectTarget.realmSet$lain(realmObjectSource.realmGet$lain());
        realmObjectTarget.realmSet$bero(realmObjectSource.realmGet$bero());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectTarget.realmSet$tgl_olah(realmObjectSource.realmGet$tgl_olah());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectTarget.realmSet$tgl_airaw(realmObjectSource.realmGet$tgl_airaw());
        realmObjectTarget.realmSet$tgl_airak(realmObjectSource.realmGet$tgl_airak());
        realmObjectTarget.realmSet$tgl_mt(realmObjectSource.realmGet$tgl_mt());
        realmObjectTarget.realmSet$verify(realmObjectSource.realmGet$verify());
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
        StringBuilder stringBuilder = new StringBuilder("Blanko0123 = proxy[");
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
        stringBuilder.append("{kd_org:");
        stringBuilder.append(realmGet$kd_org() != null ? realmGet$kd_org() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jenis_uk:");
        stringBuilder.append(realmGet$jenis_uk() != null ? realmGet$jenis_uk() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urut_mt:");
        stringBuilder.append(realmGet$urut_mt() != null ? realmGet$urut_mt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{padi:");
        stringBuilder.append(realmGet$padi());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_tua:");
        stringBuilder.append(realmGet$tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_muda:");
        stringBuilder.append(realmGet$tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{palawija:");
        stringBuilder.append(realmGet$palawija());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lain:");
        stringBuilder.append(realmGet$lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bero:");
        stringBuilder.append(realmGet$bero());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gol:");
        stringBuilder.append(realmGet$gol() != null ? realmGet$gol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_olah:");
        stringBuilder.append(realmGet$tgl_olah() != null ? realmGet$tgl_olah() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_airaw:");
        stringBuilder.append(realmGet$tgl_airaw() != null ? realmGet$tgl_airaw() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_airak:");
        stringBuilder.append(realmGet$tgl_airak() != null ? realmGet$tgl_airak() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_mt:");
        stringBuilder.append(realmGet$tgl_mt() != null ? realmGet$tgl_mt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{verify:");
        stringBuilder.append(realmGet$verify() != null ? realmGet$verify() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flag:");
        stringBuilder.append(realmGet$flag());
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
        com_pusair_smopi_Model_Blanko0123RealmProxy aBlanko0123 = (com_pusair_smopi_Model_Blanko0123RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlanko0123.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlanko0123.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlanko0123.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
