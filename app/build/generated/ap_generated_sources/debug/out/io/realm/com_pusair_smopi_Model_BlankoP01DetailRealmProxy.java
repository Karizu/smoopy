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
public class com_pusair_smopi_Model_BlankoP01DetailRealmProxy extends com.pusair.smopi.Model.BlankoP01Detail
    implements RealmObjectProxy, com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface {

    static final class BlankoP01DetailColumnInfo extends ColumnInfo {
        long idIndex;
        long id_b01Index;
        long cbyaIndex;
        long jns_keadaanIndex;
        long nm_keadaanIndex;
        long deskripsiIndex;
        long jumlahIndex;
        long kerusakanIndex;
        long satuanIndex;
        long ruas_awIndex;
        long ruas_akIndex;
        long id_b06Index;
        long id_bcpIndex;
        long pk_waktuIndex;
        long tgledit_detilIndex;
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

        BlankoP01DetailColumnInfo(OsSchemaInfo schemaInfo) {
            super(36);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BlankoP01Detail");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.id_b01Index = addColumnDetails("id_b01", "id_b01", objectSchemaInfo);
            this.cbyaIndex = addColumnDetails("cbya", "cbya", objectSchemaInfo);
            this.jns_keadaanIndex = addColumnDetails("jns_keadaan", "jns_keadaan", objectSchemaInfo);
            this.nm_keadaanIndex = addColumnDetails("nm_keadaan", "nm_keadaan", objectSchemaInfo);
            this.deskripsiIndex = addColumnDetails("deskripsi", "deskripsi", objectSchemaInfo);
            this.jumlahIndex = addColumnDetails("jumlah", "jumlah", objectSchemaInfo);
            this.kerusakanIndex = addColumnDetails("kerusakan", "kerusakan", objectSchemaInfo);
            this.satuanIndex = addColumnDetails("satuan", "satuan", objectSchemaInfo);
            this.ruas_awIndex = addColumnDetails("ruas_aw", "ruas_aw", objectSchemaInfo);
            this.ruas_akIndex = addColumnDetails("ruas_ak", "ruas_ak", objectSchemaInfo);
            this.id_b06Index = addColumnDetails("id_b06", "id_b06", objectSchemaInfo);
            this.id_bcpIndex = addColumnDetails("id_bcp", "id_bcp", objectSchemaInfo);
            this.pk_waktuIndex = addColumnDetails("pk_waktu", "pk_waktu", objectSchemaInfo);
            this.tgledit_detilIndex = addColumnDetails("tgledit_detil", "tgledit_detil", objectSchemaInfo);
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

        BlankoP01DetailColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BlankoP01DetailColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BlankoP01DetailColumnInfo src = (BlankoP01DetailColumnInfo) rawSrc;
            final BlankoP01DetailColumnInfo dst = (BlankoP01DetailColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.id_b01Index = src.id_b01Index;
            dst.cbyaIndex = src.cbyaIndex;
            dst.jns_keadaanIndex = src.jns_keadaanIndex;
            dst.nm_keadaanIndex = src.nm_keadaanIndex;
            dst.deskripsiIndex = src.deskripsiIndex;
            dst.jumlahIndex = src.jumlahIndex;
            dst.kerusakanIndex = src.kerusakanIndex;
            dst.satuanIndex = src.satuanIndex;
            dst.ruas_awIndex = src.ruas_awIndex;
            dst.ruas_akIndex = src.ruas_akIndex;
            dst.id_b06Index = src.id_b06Index;
            dst.id_bcpIndex = src.id_bcpIndex;
            dst.pk_waktuIndex = src.pk_waktuIndex;
            dst.tgledit_detilIndex = src.tgledit_detilIndex;
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

    private BlankoP01DetailColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.BlankoP01Detail> proxyState;

    com_pusair_smopi_Model_BlankoP01DetailRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BlankoP01DetailColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.BlankoP01Detail>(this);
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
    public int realmGet$id_b01() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.id_b01Index);
    }

    @Override
    public void realmSet$id_b01(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.id_b01Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.id_b01Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cbya() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cbyaIndex);
    }

    @Override
    public void realmSet$cbya(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cbyaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cbyaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cbyaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cbyaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jns_keadaan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jns_keadaanIndex);
    }

    @Override
    public void realmSet$jns_keadaan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jns_keadaanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.jns_keadaanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jns_keadaanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jns_keadaanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_keadaan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_keadaanIndex);
    }

    @Override
    public void realmSet$nm_keadaan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_keadaanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_keadaanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_keadaanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_keadaanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$deskripsi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deskripsiIndex);
    }

    @Override
    public void realmSet$deskripsi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deskripsiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.deskripsiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deskripsiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deskripsiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jumlah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jumlahIndex);
    }

    @Override
    public void realmSet$jumlah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jumlahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jumlahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kerusakan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kerusakanIndex);
    }

    @Override
    public void realmSet$kerusakan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kerusakanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kerusakanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kerusakanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kerusakanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$satuan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.satuanIndex);
    }

    @Override
    public void realmSet$satuan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.satuanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.satuanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.satuanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.satuanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$ruas_aw() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.ruas_awIndex);
    }

    @Override
    public void realmSet$ruas_aw(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.ruas_awIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.ruas_awIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$ruas_ak() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.ruas_akIndex);
    }

    @Override
    public void realmSet$ruas_ak(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.ruas_akIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.ruas_akIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id_b06() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.id_b06Index);
    }

    @Override
    public void realmSet$id_b06(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.id_b06Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.id_b06Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id_bcp() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.id_bcpIndex);
    }

    @Override
    public void realmSet$id_bcp(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.id_bcpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.id_bcpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pk_waktu() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.pk_waktuIndex);
    }

    @Override
    public void realmSet$pk_waktu(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pk_waktuIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.pk_waktuIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pk_waktuIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.pk_waktuIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgledit_detil() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgledit_detilIndex);
    }

    @Override
    public void realmSet$tgledit_detil(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgledit_detilIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgledit_detilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgledit_detilIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgledit_detilIndex, value);
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
    public String realmGet$areal_layanan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.areal_layananIndex);
    }

    @Override
    public void realmSet$areal_layanan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.areal_layananIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.areal_layananIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.areal_layananIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.areal_layananIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BlankoP01Detail", 36, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id_b01", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cbya", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jns_keadaan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_keadaan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deskripsi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jumlah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kerusakan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("satuan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ruas_aw", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ruas_ak", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("id_b06", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("id_bcp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("pk_waktu", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgledit_detil", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_inspeksi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pelaksana", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("usulan_tindakan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("areal_layanan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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

    public static BlankoP01DetailColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BlankoP01DetailColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BlankoP01Detail";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BlankoP01Detail";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.BlankoP01Detail createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.BlankoP01Detail obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
            BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01Detail.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01Detail.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface objProxy = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) obj;
        if (json.has("id_b01")) {
            if (json.isNull("id_b01")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id_b01' to null.");
            } else {
                objProxy.realmSet$id_b01((int) json.getInt("id_b01"));
            }
        }
        if (json.has("cbya")) {
            if (json.isNull("cbya")) {
                objProxy.realmSet$cbya(null);
            } else {
                objProxy.realmSet$cbya((String) json.getString("cbya"));
            }
        }
        if (json.has("jns_keadaan")) {
            if (json.isNull("jns_keadaan")) {
                objProxy.realmSet$jns_keadaan(null);
            } else {
                objProxy.realmSet$jns_keadaan((String) json.getString("jns_keadaan"));
            }
        }
        if (json.has("nm_keadaan")) {
            if (json.isNull("nm_keadaan")) {
                objProxy.realmSet$nm_keadaan(null);
            } else {
                objProxy.realmSet$nm_keadaan((String) json.getString("nm_keadaan"));
            }
        }
        if (json.has("deskripsi")) {
            if (json.isNull("deskripsi")) {
                objProxy.realmSet$deskripsi(null);
            } else {
                objProxy.realmSet$deskripsi((String) json.getString("deskripsi"));
            }
        }
        if (json.has("jumlah")) {
            if (json.isNull("jumlah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jumlah' to null.");
            } else {
                objProxy.realmSet$jumlah((float) json.getDouble("jumlah"));
            }
        }
        if (json.has("kerusakan")) {
            if (json.isNull("kerusakan")) {
                objProxy.realmSet$kerusakan(null);
            } else {
                objProxy.realmSet$kerusakan((String) json.getString("kerusakan"));
            }
        }
        if (json.has("satuan")) {
            if (json.isNull("satuan")) {
                objProxy.realmSet$satuan(null);
            } else {
                objProxy.realmSet$satuan((String) json.getString("satuan"));
            }
        }
        if (json.has("ruas_aw")) {
            if (json.isNull("ruas_aw")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_aw' to null.");
            } else {
                objProxy.realmSet$ruas_aw((int) json.getInt("ruas_aw"));
            }
        }
        if (json.has("ruas_ak")) {
            if (json.isNull("ruas_ak")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_ak' to null.");
            } else {
                objProxy.realmSet$ruas_ak((int) json.getInt("ruas_ak"));
            }
        }
        if (json.has("id_b06")) {
            if (json.isNull("id_b06")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id_b06' to null.");
            } else {
                objProxy.realmSet$id_b06((int) json.getInt("id_b06"));
            }
        }
        if (json.has("id_bcp")) {
            if (json.isNull("id_bcp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id_bcp' to null.");
            } else {
                objProxy.realmSet$id_bcp((int) json.getInt("id_bcp"));
            }
        }
        if (json.has("pk_waktu")) {
            if (json.isNull("pk_waktu")) {
                objProxy.realmSet$pk_waktu(null);
            } else {
                objProxy.realmSet$pk_waktu((String) json.getString("pk_waktu"));
            }
        }
        if (json.has("tgledit_detil")) {
            if (json.isNull("tgledit_detil")) {
                objProxy.realmSet$tgledit_detil(null);
            } else {
                objProxy.realmSet$tgledit_detil((String) json.getString("tgledit_detil"));
            }
        }
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
                objProxy.realmSet$areal_layanan(null);
            } else {
                objProxy.realmSet$areal_layanan((String) json.getString("areal_layanan"));
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
    public static com.pusair.smopi.Model.BlankoP01Detail createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.BlankoP01Detail obj = new com.pusair.smopi.Model.BlankoP01Detail();
        final com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface objProxy = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) obj;
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
            } else if (name.equals("id_b01")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_b01((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id_b01' to null.");
                }
            } else if (name.equals("cbya")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cbya((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cbya(null);
                }
            } else if (name.equals("jns_keadaan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jns_keadaan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jns_keadaan(null);
                }
            } else if (name.equals("nm_keadaan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_keadaan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_keadaan(null);
                }
            } else if (name.equals("deskripsi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deskripsi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deskripsi(null);
                }
            } else if (name.equals("jumlah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jumlah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jumlah' to null.");
                }
            } else if (name.equals("kerusakan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kerusakan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kerusakan(null);
                }
            } else if (name.equals("satuan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$satuan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$satuan(null);
                }
            } else if (name.equals("ruas_aw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ruas_aw((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_aw' to null.");
                }
            } else if (name.equals("ruas_ak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ruas_ak((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_ak' to null.");
                }
            } else if (name.equals("id_b06")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_b06((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id_b06' to null.");
                }
            } else if (name.equals("id_bcp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_bcp((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id_bcp' to null.");
                }
            } else if (name.equals("pk_waktu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pk_waktu((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pk_waktu(null);
                }
            } else if (name.equals("tgledit_detil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit_detil((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit_detil(null);
                }
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
                    objProxy.realmSet$areal_layanan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$areal_layanan(null);
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
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.BlankoP01Detail copyOrUpdate(Realm realm, com.pusair.smopi.Model.BlankoP01Detail object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.BlankoP01Detail) cachedRealmObject;
        }

        com.pusair.smopi.Model.BlankoP01Detail realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
            BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.BlankoP01Detail copy(Realm realm, com.pusair.smopi.Model.BlankoP01Detail newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.BlankoP01Detail) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.BlankoP01Detail realmObject = realm.createObjectInternal(com.pusair.smopi.Model.BlankoP01Detail.class, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) newObject;
        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id_b01(realmObjectSource.realmGet$id_b01());
        realmObjectCopy.realmSet$cbya(realmObjectSource.realmGet$cbya());
        realmObjectCopy.realmSet$jns_keadaan(realmObjectSource.realmGet$jns_keadaan());
        realmObjectCopy.realmSet$nm_keadaan(realmObjectSource.realmGet$nm_keadaan());
        realmObjectCopy.realmSet$deskripsi(realmObjectSource.realmGet$deskripsi());
        realmObjectCopy.realmSet$jumlah(realmObjectSource.realmGet$jumlah());
        realmObjectCopy.realmSet$kerusakan(realmObjectSource.realmGet$kerusakan());
        realmObjectCopy.realmSet$satuan(realmObjectSource.realmGet$satuan());
        realmObjectCopy.realmSet$ruas_aw(realmObjectSource.realmGet$ruas_aw());
        realmObjectCopy.realmSet$ruas_ak(realmObjectSource.realmGet$ruas_ak());
        realmObjectCopy.realmSet$id_b06(realmObjectSource.realmGet$id_b06());
        realmObjectCopy.realmSet$id_bcp(realmObjectSource.realmGet$id_bcp());
        realmObjectCopy.realmSet$pk_waktu(realmObjectSource.realmGet$pk_waktu());
        realmObjectCopy.realmSet$tgledit_detil(realmObjectSource.realmGet$tgledit_detil());
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

    public static long insert(Realm realm, com.pusair.smopi.Model.BlankoP01Detail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.id_b01Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b01(), false);
        String realmGet$cbya = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$cbya();
        if (realmGet$cbya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cbyaIndex, rowIndex, realmGet$cbya, false);
        }
        String realmGet$jns_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jns_keadaan();
        if (realmGet$jns_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, realmGet$jns_keadaan, false);
        }
        String realmGet$nm_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_keadaan();
        if (realmGet$nm_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
        }
        String realmGet$deskripsi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deskripsi();
        if (realmGet$deskripsi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, realmGet$deskripsi, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.jumlahIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jumlah(), false);
        String realmGet$kerusakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kerusakan();
        if (realmGet$kerusakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, realmGet$kerusakan, false);
        }
        String realmGet$satuan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$satuan();
        if (realmGet$satuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.satuanIndex, rowIndex, realmGet$satuan, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_aw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_ak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.id_b06Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b06(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.id_bcpIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_bcp(), false);
        String realmGet$pk_waktu = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pk_waktu();
        if (realmGet$pk_waktu != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, realmGet$pk_waktu, false);
        }
        String realmGet$tgledit_detil = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit_detil();
        if (realmGet$tgledit_detil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, realmGet$tgledit_detil, false);
        }
        String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgl_inspeksi();
        if (realmGet$tgl_inspeksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }
        String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        }
        String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$usulan_tindakan();
        if (realmGet$usulan_tindakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
        }
        String realmGet$areal_layanan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$areal_layanan();
        if (realmGet$areal_layanan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, realmGet$areal_layanan, false);
        }
        String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$desa_kecamatan();
        if (realmGet$desa_kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordl(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordb(), false);
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tglrekam();
        if (realmGet$tglrekam != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.BlankoP01Detail object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.BlankoP01Detail) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.id_b01Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b01(), false);
            String realmGet$cbya = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$cbya();
            if (realmGet$cbya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cbyaIndex, rowIndex, realmGet$cbya, false);
            }
            String realmGet$jns_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jns_keadaan();
            if (realmGet$jns_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, realmGet$jns_keadaan, false);
            }
            String realmGet$nm_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_keadaan();
            if (realmGet$nm_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
            }
            String realmGet$deskripsi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deskripsi();
            if (realmGet$deskripsi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, realmGet$deskripsi, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.jumlahIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jumlah(), false);
            String realmGet$kerusakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kerusakan();
            if (realmGet$kerusakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, realmGet$kerusakan, false);
            }
            String realmGet$satuan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$satuan();
            if (realmGet$satuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.satuanIndex, rowIndex, realmGet$satuan, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_aw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_ak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.id_b06Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b06(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.id_bcpIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_bcp(), false);
            String realmGet$pk_waktu = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pk_waktu();
            if (realmGet$pk_waktu != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, realmGet$pk_waktu, false);
            }
            String realmGet$tgledit_detil = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit_detil();
            if (realmGet$tgledit_detil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, realmGet$tgledit_detil, false);
            }
            String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgl_inspeksi();
            if (realmGet$tgl_inspeksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }
            String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            }
            String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$usulan_tindakan();
            if (realmGet$usulan_tindakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
            }
            String realmGet$areal_layanan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$areal_layanan();
            if (realmGet$areal_layanan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, realmGet$areal_layanan, false);
            }
            String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$desa_kecamatan();
            if (realmGet$desa_kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordl(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordb(), false);
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tglrekam();
            if (realmGet$tglrekam != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.BlankoP01Detail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.id_b01Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b01(), false);
        String realmGet$cbya = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$cbya();
        if (realmGet$cbya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cbyaIndex, rowIndex, realmGet$cbya, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cbyaIndex, rowIndex, false);
        }
        String realmGet$jns_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jns_keadaan();
        if (realmGet$jns_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, realmGet$jns_keadaan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, false);
        }
        String realmGet$nm_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_keadaan();
        if (realmGet$nm_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, false);
        }
        String realmGet$deskripsi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deskripsi();
        if (realmGet$deskripsi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, realmGet$deskripsi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.jumlahIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jumlah(), false);
        String realmGet$kerusakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kerusakan();
        if (realmGet$kerusakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, realmGet$kerusakan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, false);
        }
        String realmGet$satuan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$satuan();
        if (realmGet$satuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.satuanIndex, rowIndex, realmGet$satuan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.satuanIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_aw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_ak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.id_b06Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b06(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.id_bcpIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_bcp(), false);
        String realmGet$pk_waktu = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pk_waktu();
        if (realmGet$pk_waktu != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, realmGet$pk_waktu, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, false);
        }
        String realmGet$tgledit_detil = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit_detil();
        if (realmGet$tgledit_detil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, realmGet$tgledit_detil, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, false);
        }
        String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgl_inspeksi();
        if (realmGet$tgl_inspeksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }
        String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
        }
        String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$usulan_tindakan();
        if (realmGet$usulan_tindakan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, false);
        }
        String realmGet$areal_layanan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$areal_layanan();
        if (realmGet$areal_layanan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, realmGet$areal_layanan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, false);
        }
        String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$desa_kecamatan();
        if (realmGet$desa_kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordl(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordb(), false);
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tglrekam();
        if (realmGet$tglrekam != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, false);
        }
        String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.BlankoP01Detail.class);
        long tableNativePtr = table.getNativePtr();
        BlankoP01DetailColumnInfo columnInfo = (BlankoP01DetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.BlankoP01Detail.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.BlankoP01Detail object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.BlankoP01Detail) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.id_b01Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b01(), false);
            String realmGet$cbya = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$cbya();
            if (realmGet$cbya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cbyaIndex, rowIndex, realmGet$cbya, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cbyaIndex, rowIndex, false);
            }
            String realmGet$jns_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jns_keadaan();
            if (realmGet$jns_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, realmGet$jns_keadaan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jns_keadaanIndex, rowIndex, false);
            }
            String realmGet$nm_keadaan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_keadaan();
            if (realmGet$nm_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, false);
            }
            String realmGet$deskripsi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deskripsi();
            if (realmGet$deskripsi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, realmGet$deskripsi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deskripsiIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.jumlahIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$jumlah(), false);
            String realmGet$kerusakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kerusakan();
            if (realmGet$kerusakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, realmGet$kerusakan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kerusakanIndex, rowIndex, false);
            }
            String realmGet$satuan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$satuan();
            if (realmGet$satuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.satuanIndex, rowIndex, realmGet$satuan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.satuanIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_aw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$ruas_ak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.id_b06Index, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_b06(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.id_bcpIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$id_bcp(), false);
            String realmGet$pk_waktu = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pk_waktu();
            if (realmGet$pk_waktu != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, realmGet$pk_waktu, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pk_waktuIndex, rowIndex, false);
            }
            String realmGet$tgledit_detil = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit_detil();
            if (realmGet$tgledit_detil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, realmGet$tgledit_detil, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgledit_detilIndex, rowIndex, false);
            }
            String realmGet$tgl_inspeksi = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgl_inspeksi();
            if (realmGet$tgl_inspeksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, realmGet$tgl_inspeksi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_inspeksiIndex, rowIndex, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }
            String realmGet$kd_staf = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            String realmGet$pelaksana = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
            }
            String realmGet$usulan_tindakan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$usulan_tindakan();
            if (realmGet$usulan_tindakan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, realmGet$usulan_tindakan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.usulan_tindakanIndex, rowIndex, false);
            }
            String realmGet$areal_layanan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$areal_layanan();
            if (realmGet$areal_layanan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, realmGet$areal_layanan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.areal_layananIndex, rowIndex, false);
            }
            String realmGet$desa_kecamatan = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$desa_kecamatan();
            if (realmGet$desa_kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, realmGet$desa_kecamatan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.desa_kecamatanIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordlIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordl(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.koordbIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$koordb(), false);
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            String realmGet$tglrekam = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$tglrekam();
            if (realmGet$tglrekam != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, realmGet$tglrekam, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tglrekamIndex, rowIndex, false);
            }
            String realmGet$deleterec = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.BlankoP01Detail createDetachedCopy(com.pusair.smopi.Model.BlankoP01Detail realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.BlankoP01Detail unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.BlankoP01Detail();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.BlankoP01Detail) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.BlankoP01Detail) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface realmSource = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$id_b01(realmSource.realmGet$id_b01());
        unmanagedCopy.realmSet$cbya(realmSource.realmGet$cbya());
        unmanagedCopy.realmSet$jns_keadaan(realmSource.realmGet$jns_keadaan());
        unmanagedCopy.realmSet$nm_keadaan(realmSource.realmGet$nm_keadaan());
        unmanagedCopy.realmSet$deskripsi(realmSource.realmGet$deskripsi());
        unmanagedCopy.realmSet$jumlah(realmSource.realmGet$jumlah());
        unmanagedCopy.realmSet$kerusakan(realmSource.realmGet$kerusakan());
        unmanagedCopy.realmSet$satuan(realmSource.realmGet$satuan());
        unmanagedCopy.realmSet$ruas_aw(realmSource.realmGet$ruas_aw());
        unmanagedCopy.realmSet$ruas_ak(realmSource.realmGet$ruas_ak());
        unmanagedCopy.realmSet$id_b06(realmSource.realmGet$id_b06());
        unmanagedCopy.realmSet$id_bcp(realmSource.realmGet$id_bcp());
        unmanagedCopy.realmSet$pk_waktu(realmSource.realmGet$pk_waktu());
        unmanagedCopy.realmSet$tgledit_detil(realmSource.realmGet$tgledit_detil());
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

    static com.pusair.smopi.Model.BlankoP01Detail update(Realm realm, com.pusair.smopi.Model.BlankoP01Detail realmObject, com.pusair.smopi.Model.BlankoP01Detail newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_BlankoP01DetailRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$id_b01(realmObjectSource.realmGet$id_b01());
        realmObjectTarget.realmSet$cbya(realmObjectSource.realmGet$cbya());
        realmObjectTarget.realmSet$jns_keadaan(realmObjectSource.realmGet$jns_keadaan());
        realmObjectTarget.realmSet$nm_keadaan(realmObjectSource.realmGet$nm_keadaan());
        realmObjectTarget.realmSet$deskripsi(realmObjectSource.realmGet$deskripsi());
        realmObjectTarget.realmSet$jumlah(realmObjectSource.realmGet$jumlah());
        realmObjectTarget.realmSet$kerusakan(realmObjectSource.realmGet$kerusakan());
        realmObjectTarget.realmSet$satuan(realmObjectSource.realmGet$satuan());
        realmObjectTarget.realmSet$ruas_aw(realmObjectSource.realmGet$ruas_aw());
        realmObjectTarget.realmSet$ruas_ak(realmObjectSource.realmGet$ruas_ak());
        realmObjectTarget.realmSet$id_b06(realmObjectSource.realmGet$id_b06());
        realmObjectTarget.realmSet$id_bcp(realmObjectSource.realmGet$id_bcp());
        realmObjectTarget.realmSet$pk_waktu(realmObjectSource.realmGet$pk_waktu());
        realmObjectTarget.realmSet$tgledit_detil(realmObjectSource.realmGet$tgledit_detil());
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
        StringBuilder stringBuilder = new StringBuilder("BlankoP01Detail = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_b01:");
        stringBuilder.append(realmGet$id_b01());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cbya:");
        stringBuilder.append(realmGet$cbya() != null ? realmGet$cbya() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jns_keadaan:");
        stringBuilder.append(realmGet$jns_keadaan() != null ? realmGet$jns_keadaan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_keadaan:");
        stringBuilder.append(realmGet$nm_keadaan() != null ? realmGet$nm_keadaan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deskripsi:");
        stringBuilder.append(realmGet$deskripsi() != null ? realmGet$deskripsi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jumlah:");
        stringBuilder.append(realmGet$jumlah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kerusakan:");
        stringBuilder.append(realmGet$kerusakan() != null ? realmGet$kerusakan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{satuan:");
        stringBuilder.append(realmGet$satuan() != null ? realmGet$satuan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ruas_aw:");
        stringBuilder.append(realmGet$ruas_aw());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ruas_ak:");
        stringBuilder.append(realmGet$ruas_ak());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_b06:");
        stringBuilder.append(realmGet$id_b06());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_bcp:");
        stringBuilder.append(realmGet$id_bcp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pk_waktu:");
        stringBuilder.append(realmGet$pk_waktu() != null ? realmGet$pk_waktu() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit_detil:");
        stringBuilder.append(realmGet$tgledit_detil() != null ? realmGet$tgledit_detil() : "null");
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
        stringBuilder.append(realmGet$areal_layanan() != null ? realmGet$areal_layanan() : "null");
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
        com_pusair_smopi_Model_BlankoP01DetailRealmProxy aBlankoP01Detail = (com_pusair_smopi_Model_BlankoP01DetailRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlankoP01Detail.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlankoP01Detail.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlankoP01Detail.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
