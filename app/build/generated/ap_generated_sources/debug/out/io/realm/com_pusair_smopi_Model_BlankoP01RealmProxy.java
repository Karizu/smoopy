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
public class com_pusair_smopi_Model_BlankoP01RealmProxy extends com.pusair.smopi.Model.BlankoP01
    implements RealmObjectProxy, com_pusair_smopi_Model_BlankoP01RealmProxyInterface {

    static final class BlankoP01ColumnInfo extends ColumnInfo {
        long id_b01Index;
        long tgl_inspeksiIndex;
        long tmt_saluranIndex;
        long nm_bangtrolIndex;
        long tmt_bangtrolIndex;
        long kd_stafIndex;
        long pelaksanaIndex;
        long usulan_tindakanIndex;
        long areal_layananIndex;
        long desa_kecamatanIndex;
        long koordlIndex;
        long koordbIndex;
        long kd_saluranIndex;
        long tgleditIndex;
        long tglrekamIndex;
        long deleterecIndex;
        long flagIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;

        BlankoP01ColumnInfo(OsSchemaInfo schemaInfo) {
            super(22);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BlankoP01");
            this.id_b01Index = addColumnDetails("id_b01", "id_b01", objectSchemaInfo);
            this.tgl_inspeksiIndex = addColumnDetails("tgl_inspeksi", "tgl_inspeksi", objectSchemaInfo);
            this.tmt_saluranIndex = addColumnDetails("tmt_saluran", "tmt_saluran", objectSchemaInfo);
            this.nm_bangtrolIndex = addColumnDetails("nm_bangtrol", "nm_bangtrol", objectSchemaInfo);
            this.tmt_bangtrolIndex = addColumnDetails("tmt_bangtrol", "tmt_bangtrol", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.pelaksanaIndex = addColumnDetails("pelaksana", "pelaksana", objectSchemaInfo);
            this.usulan_tindakanIndex = addColumnDetails("usulan_tindakan", "usulan_tindakan", objectSchemaInfo);
            this.areal_layananIndex = addColumnDetails("areal_layanan", "areal_layanan", objectSchemaInfo);
            this.desa_kecamatanIndex = addColumnDetails("desa_kecamatan", "desa_kecamatan", objectSchemaInfo);
            this.koordlIndex = addColumnDetails("koordl", "koordl", objectSchemaInfo);
            this.koordbIndex = addColumnDetails("koordb", "koordb", objectSchemaInfo);
            this.kd_saluranIndex = addColumnDetails("kd_saluran", "kd_saluran", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
            this.tglrekamIndex = addColumnDetails("tglrekam", "tglrekam", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
        }

        BlankoP01ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BlankoP01ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BlankoP01ColumnInfo src = (BlankoP01ColumnInfo) rawSrc;
            final BlankoP01ColumnInfo dst = (BlankoP01ColumnInfo) rawDst;
            dst.id_b01Index = src.id_b01Index;
            dst.tgl_inspeksiIndex = src.tgl_inspeksiIndex;
            dst.tmt_saluranIndex = src.tmt_saluranIndex;
            dst.nm_bangtrolIndex = src.nm_bangtrolIndex;
            dst.tmt_bangtrolIndex = src.tmt_bangtrolIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.pelaksanaIndex = src.pelaksanaIndex;
            dst.usulan_tindakanIndex = src.usulan_tindakanIndex;
            dst.areal_layananIndex = src.areal_layananIndex;
            dst.desa_kecamatanIndex = src.desa_kecamatanIndex;
            dst.koordlIndex = src.koordlIndex;
            dst.koordbIndex = src.koordbIndex;
            dst.kd_saluranIndex = src.kd_saluranIndex;
            dst.tgleditIndex = src.tgleditIndex;
            dst.tglrekamIndex = src.tglrekamIndex;
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

    private BlankoP01ColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.BlankoP01> proxyState;

    com_pusair_smopi_Model_BlankoP01RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BlankoP01ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.BlankoP01>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id_b01() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.id_b01Index);
    }

    @Override
    public void realmSet$id_b01(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_b01' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_inspeksi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_inspeksiIndex);
    }

    @Override
    public void realmSet$tgl_inspeksi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_inspeksiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_inspeksiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_inspeksiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_inspeksiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_saluran() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_saluranIndex);
    }

    @Override
    public void realmSet$tmt_saluran(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_saluranIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_saluranIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_saluranIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_saluranIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_bangtrol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_bangtrolIndex);
    }

    @Override
    public void realmSet$nm_bangtrol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_bangtrolIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_bangtrolIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_bangtrolIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_bangtrolIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_bangtrol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_bangtrolIndex);
    }

    @Override
    public void realmSet$tmt_bangtrol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_bangtrolIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_bangtrolIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_bangtrolIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_bangtrolIndex, value);
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
    public String realmGet$usulan_tindakan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.usulan_tindakanIndex);
    }

    @Override
    public void realmSet$usulan_tindakan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.usulan_tindakanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.usulan_tindakanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.usulan_tindakanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.usulan_tindakanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$areal_layanan() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.areal_layananIndex);
    }

    @Override
    public void realmSet$areal_layanan(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.areal_layananIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.areal_layananIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desa_kecamatan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.desa_kecamatanIndex);
    }

    @Override
    public void realmSet$desa_kecamatan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.desa_kecamatanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.desa_kecamatanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.desa_kecamatanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.desa_kecamatanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$koordl() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.koordlIndex);
    }

    @Override
    public void realmSet$koordl(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.koordlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.koordlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$koordb() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.koordbIndex);
    }

    @Override
    public void realmSet$koordb(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.koordbIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.koordbIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_saluran() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_saluranIndex);
    }

    @Override
    public void realmSet$kd_saluran(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_saluranIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_saluranIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_saluranIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_saluranIndex, value);
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
    public String realmGet$tglrekam() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tglrekamIndex);
    }

    @Override
    public void realmSet$tglrekam(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tglrekamIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tglrekamIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tglrekamIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tglrekamIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BlankoP01", 22, 0);
        builder.addPersistedProperty("id_b01", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgl_inspeksi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pelaksana", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("usulan_tindakan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("areal_layanan", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("desa_kecamatan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("koordl", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("koordb", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kd_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tglrekam", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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

    public static BlankoP01ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BlankoP01ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BlankoP01";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BlankoP01";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.BlankoP01 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.BlankoP01 obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
            BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
            long pkColumnIndex = columnInfo.id_b01Index;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id_b01")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id_b01"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_b01")) {
                if (json.isNull("id_b01")) {
                    obj = (io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01.class, json.getInt("id_b01"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_b01'.");
            }
        }

        final com_pusair_smopi_Model_BlankoP01RealmProxyInterface objProxy = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) obj;
        if (json.has("tgl_inspeksi")) {
            if (json.isNull("tgl_inspeksi")) {
                objProxy.realmSet$tgl_inspeksi(null);
            } else {
                objProxy.realmSet$tgl_inspeksi((String) json.getString("tgl_inspeksi"));
            }
        }
        if (json.has("tmt_saluran")) {
            if (json.isNull("tmt_saluran")) {
                objProxy.realmSet$tmt_saluran(null);
            } else {
                objProxy.realmSet$tmt_saluran((String) json.getString("tmt_saluran"));
            }
        }
        if (json.has("nm_bangtrol")) {
            if (json.isNull("nm_bangtrol")) {
                objProxy.realmSet$nm_bangtrol(null);
            } else {
                objProxy.realmSet$nm_bangtrol((String) json.getString("nm_bangtrol"));
            }
        }
        if (json.has("tmt_bangtrol")) {
            if (json.isNull("tmt_bangtrol")) {
                objProxy.realmSet$tmt_bangtrol(null);
            } else {
                objProxy.realmSet$tmt_bangtrol((String) json.getString("tmt_bangtrol"));
            }
        }
        if (json.has("kd_staf")) {
            if (json.isNull("kd_staf")) {
                objProxy.realmSet$kd_staf(null);
            } else {
                objProxy.realmSet$kd_staf((String) json.getString("kd_staf"));
            }
        }
        if (json.has("pelaksana")) {
            if (json.isNull("pelaksana")) {
                objProxy.realmSet$pelaksana(null);
            } else {
                objProxy.realmSet$pelaksana((String) json.getString("pelaksana"));
            }
        }
        if (json.has("usulan_tindakan")) {
            if (json.isNull("usulan_tindakan")) {
                objProxy.realmSet$usulan_tindakan(null);
            } else {
                objProxy.realmSet$usulan_tindakan((String) json.getString("usulan_tindakan"));
            }
        }
        if (json.has("areal_layanan")) {
            if (json.isNull("areal_layanan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'areal_layanan' to null.");
            } else {
                objProxy.realmSet$areal_layanan((float) json.getDouble("areal_layanan"));
            }
        }
        if (json.has("desa_kecamatan")) {
            if (json.isNull("desa_kecamatan")) {
                objProxy.realmSet$desa_kecamatan(null);
            } else {
                objProxy.realmSet$desa_kecamatan((String) json.getString("desa_kecamatan"));
            }
        }
        if (json.has("koordl")) {
            if (json.isNull("koordl")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'koordl' to null.");
            } else {
                objProxy.realmSet$koordl((double) json.getDouble("koordl"));
            }
        }
        if (json.has("koordb")) {
            if (json.isNull("koordb")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'koordb' to null.");
            } else {
                objProxy.realmSet$koordb((double) json.getDouble("koordb"));
            }
        }
        if (json.has("kd_saluran")) {
            if (json.isNull("kd_saluran")) {
                objProxy.realmSet$kd_saluran(null);
            } else {
                objProxy.realmSet$kd_saluran((String) json.getString("kd_saluran"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        if (json.has("tglrekam")) {
            if (json.isNull("tglrekam")) {
                objProxy.realmSet$tglrekam(null);
            } else {
                objProxy.realmSet$tglrekam((String) json.getString("tglrekam"));
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
    public static com.pusair.smopi.Model.BlankoP01 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.BlankoP01 obj = new com.pusair.smopi.Model.BlankoP01();
        final com_pusair_smopi_Model_BlankoP01RealmProxyInterface objProxy = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_b01")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_b01((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id_b01' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("tgl_inspeksi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_inspeksi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_inspeksi(null);
                }
            } else if (name.equals("tmt_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_saluran(null);
                }
            } else if (name.equals("nm_bangtrol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_bangtrol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_bangtrol(null);
                }
            } else if (name.equals("tmt_bangtrol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_bangtrol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_bangtrol(null);
                }
            } else if (name.equals("kd_staf")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_staf((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_staf(null);
                }
            } else if (name.equals("pelaksana")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pelaksana((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pelaksana(null);
                }
            } else if (name.equals("usulan_tindakan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$usulan_tindakan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$usulan_tindakan(null);
                }
            } else if (name.equals("areal_layanan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$areal_layanan((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'areal_layanan' to null.");
                }
            } else if (name.equals("desa_kecamatan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desa_kecamatan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desa_kecamatan(null);
                }
            } else if (name.equals("koordl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$koordl((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'koordl' to null.");
                }
            } else if (name.equals("koordb")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$koordb((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'koordb' to null.");
                }
            } else if (name.equals("kd_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_saluran(null);
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
                }
            } else if (name.equals("tglrekam")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tglrekam((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tglrekam(null);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_b01'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.BlankoP01 copyOrUpdate(Realm realm, com.pusair.smopi.Model.BlankoP01 object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.BlankoP01) cachedRealmObject;
        }

        com.pusair.smopi.Model.BlankoP01 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
            BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
            long pkColumnIndex = columnInfo.id_b01Index;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.BlankoP01 copy(Realm realm, com.pusair.smopi.Model.BlankoP01 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.BlankoP01) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.BlankoP01 realmObject = realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01.class, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) newObject).realmGet$id_b01(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_BlankoP01RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) newObject;
        com_pusair_smopi_Model_BlankoP01RealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$tgl_inspeksi(realmObjectSource.realmGet$tgl_inspeksi());
        realmObjectCopy.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectCopy.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectCopy.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectCopy.realmSet$usulan_tindakan(realmObjectSource.realmGet$usulan_tindakan());
        realmObjectCopy.realmSet$areal_layanan(realmObjectSource.realmGet$areal_layanan());
        realmObjectCopy.realmSet$desa_kecamatan(realmObjectSource.realmGet$desa_kecamatan());
        realmObjectCopy.realmSet$koordl(realmObjectSource.realmGet$koordl());
        realmObjectCopy.realmSet$koordb(realmObjectSource.realmGet$koordb());
        realmObjectCopy.realmSet$kd_saluran(realmObjectSource.realmGet$kd_saluran());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectCopy.realmSet$tglrekam(realmObjectSource.realmGet$tglrekam());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.BlankoP01 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
        long pkColumnIndex = columnInfo.id_b01Index;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgl_inspeksi();
        if (realmGet$tgl_inspeksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }
        String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        }
        String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$usulan_tindakan();
        if (realmGet$usulan_tindakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$areal_layanan(), false);
        String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$desa_kecamatan();
        if (realmGet$desa_kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordl(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordb(), false);
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tglrekam();
        if (realmGet$tglrekam != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
        long pkColumnIndex = columnInfo.id_b01Index;
        com.pusair.smopi.Model.BlankoP01 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.BlankoP01) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgl_inspeksi();
            if (realmGet$tgl_inspeksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }
            String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            }
            String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$usulan_tindakan();
            if (realmGet$usulan_tindakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$areal_layanan(), false);
            String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$desa_kecamatan();
            if (realmGet$desa_kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordl(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordb(), false);
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tglrekam();
            if (realmGet$tglrekam != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.BlankoP01 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
        long pkColumnIndex = columnInfo.id_b01Index;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
        }
        cache.put(object, rowIndex);
        String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgl_inspeksi();
        if (realmGet$tgl_inspeksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }
        String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
        }
        String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$usulan_tindakan();
        if (realmGet$usulan_tindakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$areal_layanan(), false);
        String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$desa_kecamatan();
        if (realmGet$desa_kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordl(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordb(), false);
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tglrekam();
        if (realmGet$tglrekam != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01ColumnInfo columnInfo = (BlankoP01ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01.class);
        long pkColumnIndex = columnInfo.id_b01Index;
        com.pusair.smopi.Model.BlankoP01 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.BlankoP01) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$id_b01());
            }
            cache.put(object, rowIndex);
            String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgl_inspeksi();
            if (realmGet$tgl_inspeksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }
            String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
            }
            String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$usulan_tindakan();
            if (realmGet$usulan_tindakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$areal_layanan(), false);
            String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$desa_kecamatan();
            if (realmGet$desa_kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordl(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$koordb(), false);
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$tglrekam();
            if (realmGet$tglrekam != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.BlankoP01 createDetachedCopy(com.pusair.smopi.Model.BlankoP01 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.BlankoP01 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.BlankoP01();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.BlankoP01) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.BlankoP01) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_BlankoP01RealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_BlankoP01RealmProxyInterface realmSource = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_b01(realmSource.realmGet$id_b01());
        unmanagedCopy.realmSet$tgl_inspeksi(realmSource.realmGet$tgl_inspeksi());
        unmanagedCopy.realmSet$tmt_saluran(realmSource.realmGet$tmt_saluran());
        unmanagedCopy.realmSet$nm_bangtrol(realmSource.realmGet$nm_bangtrol());
        unmanagedCopy.realmSet$tmt_bangtrol(realmSource.realmGet$tmt_bangtrol());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$pelaksana(realmSource.realmGet$pelaksana());
        unmanagedCopy.realmSet$usulan_tindakan(realmSource.realmGet$usulan_tindakan());
        unmanagedCopy.realmSet$areal_layanan(realmSource.realmGet$areal_layanan());
        unmanagedCopy.realmSet$desa_kecamatan(realmSource.realmGet$desa_kecamatan());
        unmanagedCopy.realmSet$koordl(realmSource.realmGet$koordl());
        unmanagedCopy.realmSet$koordb(realmSource.realmGet$koordb());
        unmanagedCopy.realmSet$kd_saluran(realmSource.realmGet$kd_saluran());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());
        unmanagedCopy.realmSet$tglrekam(realmSource.realmGet$tglrekam());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.BlankoP01 update(Realm realm, com.pusair.smopi.Model.BlankoP01 realmObject, com.pusair.smopi.Model.BlankoP01 newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_BlankoP01RealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) realmObject;
        com_pusair_smopi_Model_BlankoP01RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_BlankoP01RealmProxyInterface) newObject;
        realmObjectTarget.realmSet$tgl_inspeksi(realmObjectSource.realmGet$tgl_inspeksi());
        realmObjectTarget.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectTarget.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectTarget.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectTarget.realmSet$usulan_tindakan(realmObjectSource.realmGet$usulan_tindakan());
        realmObjectTarget.realmSet$areal_layanan(realmObjectSource.realmGet$areal_layanan());
        realmObjectTarget.realmSet$desa_kecamatan(realmObjectSource.realmGet$desa_kecamatan());
        realmObjectTarget.realmSet$koordl(realmObjectSource.realmGet$koordl());
        realmObjectTarget.realmSet$koordb(realmObjectSource.realmGet$koordb());
        realmObjectTarget.realmSet$kd_saluran(realmObjectSource.realmGet$kd_saluran());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectTarget.realmSet$tglrekam(realmObjectSource.realmGet$tglrekam());
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
        StringBuilder stringBuilder = new StringBuilder("BlankoP01 = proxy[");
        stringBuilder.append("{id_b01:");
        stringBuilder.append(realmGet$id_b01());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_inspeksi:");
        stringBuilder.append(realmGet$tgl_inspeksi() != null ? realmGet$tgl_inspeksi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_saluran:");
        stringBuilder.append(realmGet$tmt_saluran() != null ? realmGet$tmt_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_bangtrol:");
        stringBuilder.append(realmGet$nm_bangtrol() != null ? realmGet$nm_bangtrol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_bangtrol:");
        stringBuilder.append(realmGet$tmt_bangtrol() != null ? realmGet$tmt_bangtrol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_staf:");
        stringBuilder.append(realmGet$kd_staf() != null ? realmGet$kd_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pelaksana:");
        stringBuilder.append(realmGet$pelaksana() != null ? realmGet$pelaksana() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{usulan_tindakan:");
        stringBuilder.append(realmGet$usulan_tindakan() != null ? realmGet$usulan_tindakan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{areal_layanan:");
        stringBuilder.append(realmGet$areal_layanan());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desa_kecamatan:");
        stringBuilder.append(realmGet$desa_kecamatan() != null ? realmGet$desa_kecamatan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{koordl:");
        stringBuilder.append(realmGet$koordl());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{koordb:");
        stringBuilder.append(realmGet$koordb());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_saluran:");
        stringBuilder.append(realmGet$kd_saluran() != null ? realmGet$kd_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tglrekam:");
        stringBuilder.append(realmGet$tglrekam() != null ? realmGet$tglrekam() : "null");
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
        com_pusair_smopi_Model_BlankoP01RealmProxy aBlankoP01 = (com_pusair_smopi_Model_BlankoP01RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlankoP01.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlankoP01.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlankoP01.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
