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
public class com_pusair_smopi_Model_DaerahIrigasiRealmProxy extends com.pusair.smopi.Model.DaerahIrigasi
    implements RealmObjectProxy, com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface {

    static final class DaerahIrigasiColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_diIndex;
        long nm_diIndex;
        long klasifikasiIndex;
        long thn_bangunIndex;
        long luas_swiriIndex;
        long kewenanganIndex;
        long sumberIndex;
        long nm_sumberIndex;
        long tmt_diIndex;
        long kd_dasIndex;
        long tmt_dasIndex;
        long hapusIndex;
        long kd_wsIndex;
        long tmt_wsIndex;
        long fprIndex;
        long perkolasiIndex;
        long kd_kabIndex;
        long kd_propIndex;
        long kd_pulauIndex;
        long nm_wsIndex;
        long luas_wsIndex;
        long stok_airIndex;
        long nm_kabIndex;
        long nm_propIndex;
        long kriteria_wsIndex;

        DaerahIrigasiColumnInfo(OsSchemaInfo schemaInfo) {
            super(26);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("DaerahIrigasi");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_diIndex = addColumnDetails("kd_di", "kd_di", objectSchemaInfo);
            this.nm_diIndex = addColumnDetails("nm_di", "nm_di", objectSchemaInfo);
            this.klasifikasiIndex = addColumnDetails("klasifikasi", "klasifikasi", objectSchemaInfo);
            this.thn_bangunIndex = addColumnDetails("thn_bangun", "thn_bangun", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.kewenanganIndex = addColumnDetails("kewenangan", "kewenangan", objectSchemaInfo);
            this.sumberIndex = addColumnDetails("sumber", "sumber", objectSchemaInfo);
            this.nm_sumberIndex = addColumnDetails("nm_sumber", "nm_sumber", objectSchemaInfo);
            this.tmt_diIndex = addColumnDetails("tmt_di", "tmt_di", objectSchemaInfo);
            this.kd_dasIndex = addColumnDetails("kd_das", "kd_das", objectSchemaInfo);
            this.tmt_dasIndex = addColumnDetails("tmt_das", "tmt_das", objectSchemaInfo);
            this.hapusIndex = addColumnDetails("hapus", "hapus", objectSchemaInfo);
            this.kd_wsIndex = addColumnDetails("kd_ws", "kd_ws", objectSchemaInfo);
            this.tmt_wsIndex = addColumnDetails("tmt_ws", "tmt_ws", objectSchemaInfo);
            this.fprIndex = addColumnDetails("fpr", "fpr", objectSchemaInfo);
            this.perkolasiIndex = addColumnDetails("perkolasi", "perkolasi", objectSchemaInfo);
            this.kd_kabIndex = addColumnDetails("kd_kab", "kd_kab", objectSchemaInfo);
            this.kd_propIndex = addColumnDetails("kd_prop", "kd_prop", objectSchemaInfo);
            this.kd_pulauIndex = addColumnDetails("kd_pulau", "kd_pulau", objectSchemaInfo);
            this.nm_wsIndex = addColumnDetails("nm_ws", "nm_ws", objectSchemaInfo);
            this.luas_wsIndex = addColumnDetails("luas_ws", "luas_ws", objectSchemaInfo);
            this.stok_airIndex = addColumnDetails("stok_air", "stok_air", objectSchemaInfo);
            this.nm_kabIndex = addColumnDetails("nm_kab", "nm_kab", objectSchemaInfo);
            this.nm_propIndex = addColumnDetails("nm_prop", "nm_prop", objectSchemaInfo);
            this.kriteria_wsIndex = addColumnDetails("kriteria_ws", "kriteria_ws", objectSchemaInfo);
        }

        DaerahIrigasiColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DaerahIrigasiColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DaerahIrigasiColumnInfo src = (DaerahIrigasiColumnInfo) rawSrc;
            final DaerahIrigasiColumnInfo dst = (DaerahIrigasiColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_diIndex = src.kd_diIndex;
            dst.nm_diIndex = src.nm_diIndex;
            dst.klasifikasiIndex = src.klasifikasiIndex;
            dst.thn_bangunIndex = src.thn_bangunIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.kewenanganIndex = src.kewenanganIndex;
            dst.sumberIndex = src.sumberIndex;
            dst.nm_sumberIndex = src.nm_sumberIndex;
            dst.tmt_diIndex = src.tmt_diIndex;
            dst.kd_dasIndex = src.kd_dasIndex;
            dst.tmt_dasIndex = src.tmt_dasIndex;
            dst.hapusIndex = src.hapusIndex;
            dst.kd_wsIndex = src.kd_wsIndex;
            dst.tmt_wsIndex = src.tmt_wsIndex;
            dst.fprIndex = src.fprIndex;
            dst.perkolasiIndex = src.perkolasiIndex;
            dst.kd_kabIndex = src.kd_kabIndex;
            dst.kd_propIndex = src.kd_propIndex;
            dst.kd_pulauIndex = src.kd_pulauIndex;
            dst.nm_wsIndex = src.nm_wsIndex;
            dst.luas_wsIndex = src.luas_wsIndex;
            dst.stok_airIndex = src.stok_airIndex;
            dst.nm_kabIndex = src.nm_kabIndex;
            dst.nm_propIndex = src.nm_propIndex;
            dst.kriteria_wsIndex = src.kriteria_wsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DaerahIrigasiColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.DaerahIrigasi> proxyState;

    com_pusair_smopi_Model_DaerahIrigasiRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DaerahIrigasiColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.DaerahIrigasi>(this);
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
    public String realmGet$kd_di() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_diIndex);
    }

    @Override
    public void realmSet$kd_di(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_diIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_diIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_diIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_diIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_di() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_diIndex);
    }

    @Override
    public void realmSet$nm_di(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_diIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_diIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_diIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_diIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$klasifikasi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.klasifikasiIndex);
    }

    @Override
    public void realmSet$klasifikasi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.klasifikasiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.klasifikasiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.klasifikasiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.klasifikasiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thn_bangun() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thn_bangunIndex);
    }

    @Override
    public void realmSet$thn_bangun(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thn_bangunIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thn_bangunIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thn_bangunIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thn_bangunIndex, value);
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
    public String realmGet$kewenangan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kewenanganIndex);
    }

    @Override
    public void realmSet$kewenangan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kewenanganIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kewenanganIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kewenanganIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kewenanganIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sumberIndex);
    }

    @Override
    public void realmSet$sumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sumberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.sumberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sumberIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sumberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_sumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_sumberIndex);
    }

    @Override
    public void realmSet$nm_sumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_sumberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_sumberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_sumberIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_sumberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_di() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_diIndex);
    }

    @Override
    public void realmSet$tmt_di(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_diIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_diIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_diIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_diIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_das() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_dasIndex);
    }

    @Override
    public void realmSet$kd_das(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_dasIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_dasIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_dasIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_dasIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_das() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_dasIndex);
    }

    @Override
    public void realmSet$tmt_das(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_dasIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_dasIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_dasIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_dasIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$hapus() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.hapusIndex);
    }

    @Override
    public void realmSet$hapus(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.hapusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.hapusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_ws() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_wsIndex);
    }

    @Override
    public void realmSet$kd_ws(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_wsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_wsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_wsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_wsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_ws() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_wsIndex);
    }

    @Override
    public void realmSet$tmt_ws(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_wsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_wsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_wsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_wsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$fpr() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.fprIndex);
    }

    @Override
    public void realmSet$fpr(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.fprIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.fprIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$perkolasi() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.perkolasiIndex);
    }

    @Override
    public void realmSet$perkolasi(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.perkolasiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.perkolasiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_kab() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_kabIndex);
    }

    @Override
    public void realmSet$kd_kab(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_kabIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_kabIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_kabIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_kabIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_prop() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_propIndex);
    }

    @Override
    public void realmSet$kd_prop(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_propIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_propIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_propIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_propIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_pulau() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_pulauIndex);
    }

    @Override
    public void realmSet$kd_pulau(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_pulauIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_pulauIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_pulauIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_pulauIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_ws() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_wsIndex);
    }

    @Override
    public void realmSet$nm_ws(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_wsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_wsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_wsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_wsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$luas_ws() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.luas_wsIndex);
    }

    @Override
    public void realmSet$luas_ws(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.luas_wsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.luas_wsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$stok_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.stok_airIndex);
    }

    @Override
    public void realmSet$stok_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.stok_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.stok_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_kab() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_kabIndex);
    }

    @Override
    public void realmSet$nm_kab(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_kabIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_kabIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_kabIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_kabIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_prop() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_propIndex);
    }

    @Override
    public void realmSet$nm_prop(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_propIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_propIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_propIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_propIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kriteria_ws() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kriteria_wsIndex);
    }

    @Override
    public void realmSet$kriteria_ws(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kriteria_wsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kriteria_wsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kriteria_wsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kriteria_wsIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("DaerahIrigasi", 26, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("klasifikasi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thn_bangun", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kewenangan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_sumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_das", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_das", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("hapus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kd_ws", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_ws", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fpr", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("perkolasi", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kd_kab", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_prop", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_pulau", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_ws", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("luas_ws", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("stok_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_kab", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_prop", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kriteria_ws", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DaerahIrigasiColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DaerahIrigasiColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "DaerahIrigasi";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DaerahIrigasi";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.DaerahIrigasi createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.DaerahIrigasi obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
            DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.DaerahIrigasi.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.DaerahIrigasi.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface objProxy = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) obj;
        if (json.has("kd_di")) {
            if (json.isNull("kd_di")) {
                objProxy.realmSet$kd_di(null);
            } else {
                objProxy.realmSet$kd_di((String) json.getString("kd_di"));
            }
        }
        if (json.has("nm_di")) {
            if (json.isNull("nm_di")) {
                objProxy.realmSet$nm_di(null);
            } else {
                objProxy.realmSet$nm_di((String) json.getString("nm_di"));
            }
        }
        if (json.has("klasifikasi")) {
            if (json.isNull("klasifikasi")) {
                objProxy.realmSet$klasifikasi(null);
            } else {
                objProxy.realmSet$klasifikasi((String) json.getString("klasifikasi"));
            }
        }
        if (json.has("thn_bangun")) {
            if (json.isNull("thn_bangun")) {
                objProxy.realmSet$thn_bangun(null);
            } else {
                objProxy.realmSet$thn_bangun((String) json.getString("thn_bangun"));
            }
        }
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("kewenangan")) {
            if (json.isNull("kewenangan")) {
                objProxy.realmSet$kewenangan(null);
            } else {
                objProxy.realmSet$kewenangan((String) json.getString("kewenangan"));
            }
        }
        if (json.has("sumber")) {
            if (json.isNull("sumber")) {
                objProxy.realmSet$sumber(null);
            } else {
                objProxy.realmSet$sumber((String) json.getString("sumber"));
            }
        }
        if (json.has("nm_sumber")) {
            if (json.isNull("nm_sumber")) {
                objProxy.realmSet$nm_sumber(null);
            } else {
                objProxy.realmSet$nm_sumber((String) json.getString("nm_sumber"));
            }
        }
        if (json.has("tmt_di")) {
            if (json.isNull("tmt_di")) {
                objProxy.realmSet$tmt_di(null);
            } else {
                objProxy.realmSet$tmt_di((String) json.getString("tmt_di"));
            }
        }
        if (json.has("kd_das")) {
            if (json.isNull("kd_das")) {
                objProxy.realmSet$kd_das(null);
            } else {
                objProxy.realmSet$kd_das((String) json.getString("kd_das"));
            }
        }
        if (json.has("tmt_das")) {
            if (json.isNull("tmt_das")) {
                objProxy.realmSet$tmt_das(null);
            } else {
                objProxy.realmSet$tmt_das((String) json.getString("tmt_das"));
            }
        }
        if (json.has("hapus")) {
            if (json.isNull("hapus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hapus' to null.");
            } else {
                objProxy.realmSet$hapus((int) json.getInt("hapus"));
            }
        }
        if (json.has("kd_ws")) {
            if (json.isNull("kd_ws")) {
                objProxy.realmSet$kd_ws(null);
            } else {
                objProxy.realmSet$kd_ws((String) json.getString("kd_ws"));
            }
        }
        if (json.has("tmt_ws")) {
            if (json.isNull("tmt_ws")) {
                objProxy.realmSet$tmt_ws(null);
            } else {
                objProxy.realmSet$tmt_ws((String) json.getString("tmt_ws"));
            }
        }
        if (json.has("fpr")) {
            if (json.isNull("fpr")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fpr' to null.");
            } else {
                objProxy.realmSet$fpr((float) json.getDouble("fpr"));
            }
        }
        if (json.has("perkolasi")) {
            if (json.isNull("perkolasi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'perkolasi' to null.");
            } else {
                objProxy.realmSet$perkolasi((int) json.getInt("perkolasi"));
            }
        }
        if (json.has("kd_kab")) {
            if (json.isNull("kd_kab")) {
                objProxy.realmSet$kd_kab(null);
            } else {
                objProxy.realmSet$kd_kab((String) json.getString("kd_kab"));
            }
        }
        if (json.has("kd_prop")) {
            if (json.isNull("kd_prop")) {
                objProxy.realmSet$kd_prop(null);
            } else {
                objProxy.realmSet$kd_prop((String) json.getString("kd_prop"));
            }
        }
        if (json.has("kd_pulau")) {
            if (json.isNull("kd_pulau")) {
                objProxy.realmSet$kd_pulau(null);
            } else {
                objProxy.realmSet$kd_pulau((String) json.getString("kd_pulau"));
            }
        }
        if (json.has("nm_ws")) {
            if (json.isNull("nm_ws")) {
                objProxy.realmSet$nm_ws(null);
            } else {
                objProxy.realmSet$nm_ws((String) json.getString("nm_ws"));
            }
        }
        if (json.has("luas_ws")) {
            if (json.isNull("luas_ws")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_ws' to null.");
            } else {
                objProxy.realmSet$luas_ws((float) json.getDouble("luas_ws"));
            }
        }
        if (json.has("stok_air")) {
            if (json.isNull("stok_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'stok_air' to null.");
            } else {
                objProxy.realmSet$stok_air((float) json.getDouble("stok_air"));
            }
        }
        if (json.has("nm_kab")) {
            if (json.isNull("nm_kab")) {
                objProxy.realmSet$nm_kab(null);
            } else {
                objProxy.realmSet$nm_kab((String) json.getString("nm_kab"));
            }
        }
        if (json.has("nm_prop")) {
            if (json.isNull("nm_prop")) {
                objProxy.realmSet$nm_prop(null);
            } else {
                objProxy.realmSet$nm_prop((String) json.getString("nm_prop"));
            }
        }
        if (json.has("kriteria_ws")) {
            if (json.isNull("kriteria_ws")) {
                objProxy.realmSet$kriteria_ws(null);
            } else {
                objProxy.realmSet$kriteria_ws((String) json.getString("kriteria_ws"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.DaerahIrigasi createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.DaerahIrigasi obj = new com.pusair.smopi.Model.DaerahIrigasi();
        final com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface objProxy = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) obj;
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
            } else if (name.equals("kd_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_di(null);
                }
            } else if (name.equals("nm_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_di(null);
                }
            } else if (name.equals("klasifikasi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$klasifikasi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$klasifikasi(null);
                }
            } else if (name.equals("thn_bangun")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thn_bangun((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thn_bangun(null);
                }
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("kewenangan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kewenangan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kewenangan(null);
                }
            } else if (name.equals("sumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sumber(null);
                }
            } else if (name.equals("nm_sumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_sumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_sumber(null);
                }
            } else if (name.equals("tmt_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_di(null);
                }
            } else if (name.equals("kd_das")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_das((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_das(null);
                }
            } else if (name.equals("tmt_das")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_das((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_das(null);
                }
            } else if (name.equals("hapus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hapus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hapus' to null.");
                }
            } else if (name.equals("kd_ws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_ws((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_ws(null);
                }
            } else if (name.equals("tmt_ws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_ws((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_ws(null);
                }
            } else if (name.equals("fpr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fpr((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'fpr' to null.");
                }
            } else if (name.equals("perkolasi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$perkolasi((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'perkolasi' to null.");
                }
            } else if (name.equals("kd_kab")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_kab((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_kab(null);
                }
            } else if (name.equals("kd_prop")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_prop((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_prop(null);
                }
            } else if (name.equals("kd_pulau")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_pulau((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_pulau(null);
                }
            } else if (name.equals("nm_ws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_ws((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_ws(null);
                }
            } else if (name.equals("luas_ws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_ws((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_ws' to null.");
                }
            } else if (name.equals("stok_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$stok_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'stok_air' to null.");
                }
            } else if (name.equals("nm_kab")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_kab((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_kab(null);
                }
            } else if (name.equals("nm_prop")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_prop((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_prop(null);
                }
            } else if (name.equals("kriteria_ws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kriteria_ws((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kriteria_ws(null);
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

    public static com.pusair.smopi.Model.DaerahIrigasi copyOrUpdate(Realm realm, com.pusair.smopi.Model.DaerahIrigasi object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.DaerahIrigasi) cachedRealmObject;
        }

        com.pusair.smopi.Model.DaerahIrigasi realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
            DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.DaerahIrigasi copy(Realm realm, com.pusair.smopi.Model.DaerahIrigasi newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.DaerahIrigasi) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.DaerahIrigasi realmObject = realm.createObjectInternal(com.pusair.smopi.Model.DaerahIrigasi.class, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) newObject;
        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectCopy.realmSet$nm_di(realmObjectSource.realmGet$nm_di());
        realmObjectCopy.realmSet$klasifikasi(realmObjectSource.realmGet$klasifikasi());
        realmObjectCopy.realmSet$thn_bangun(realmObjectSource.realmGet$thn_bangun());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$kewenangan(realmObjectSource.realmGet$kewenangan());
        realmObjectCopy.realmSet$sumber(realmObjectSource.realmGet$sumber());
        realmObjectCopy.realmSet$nm_sumber(realmObjectSource.realmGet$nm_sumber());
        realmObjectCopy.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectCopy.realmSet$kd_das(realmObjectSource.realmGet$kd_das());
        realmObjectCopy.realmSet$tmt_das(realmObjectSource.realmGet$tmt_das());
        realmObjectCopy.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectCopy.realmSet$kd_ws(realmObjectSource.realmGet$kd_ws());
        realmObjectCopy.realmSet$tmt_ws(realmObjectSource.realmGet$tmt_ws());
        realmObjectCopy.realmSet$fpr(realmObjectSource.realmGet$fpr());
        realmObjectCopy.realmSet$perkolasi(realmObjectSource.realmGet$perkolasi());
        realmObjectCopy.realmSet$kd_kab(realmObjectSource.realmGet$kd_kab());
        realmObjectCopy.realmSet$kd_prop(realmObjectSource.realmGet$kd_prop());
        realmObjectCopy.realmSet$kd_pulau(realmObjectSource.realmGet$kd_pulau());
        realmObjectCopy.realmSet$nm_ws(realmObjectSource.realmGet$nm_ws());
        realmObjectCopy.realmSet$luas_ws(realmObjectSource.realmGet$luas_ws());
        realmObjectCopy.realmSet$stok_air(realmObjectSource.realmGet$stok_air());
        realmObjectCopy.realmSet$nm_kab(realmObjectSource.realmGet$nm_kab());
        realmObjectCopy.realmSet$nm_prop(realmObjectSource.realmGet$nm_prop());
        realmObjectCopy.realmSet$kriteria_ws(realmObjectSource.realmGet$kriteria_ws());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.DaerahIrigasi object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        }
        String realmGet$nm_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_di();
        if (realmGet$nm_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
        }
        String realmGet$klasifikasi = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$klasifikasi();
        if (realmGet$klasifikasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, realmGet$klasifikasi, false);
        }
        String realmGet$thn_bangun = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$thn_bangun();
        if (realmGet$thn_bangun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, realmGet$thn_bangun, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$kewenangan = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kewenangan();
        if (realmGet$kewenangan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, realmGet$kewenangan, false);
        }
        String realmGet$sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$sumber();
        if (realmGet$sumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sumberIndex, rowIndex, realmGet$sumber, false);
        }
        String realmGet$nm_sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_sumber();
        if (realmGet$nm_sumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, realmGet$nm_sumber, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        }
        String realmGet$kd_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_das();
        if (realmGet$kd_das != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, realmGet$kd_das, false);
        }
        String realmGet$tmt_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_das();
        if (realmGet$tmt_das != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, realmGet$tmt_das, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$hapus(), false);
        String realmGet$kd_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_ws();
        if (realmGet$kd_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, realmGet$kd_ws, false);
        }
        String realmGet$tmt_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_ws();
        if (realmGet$tmt_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, realmGet$tmt_ws, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.fprIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$fpr(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.perkolasiIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$perkolasi(), false);
        String realmGet$kd_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_kab();
        if (realmGet$kd_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
        }
        String realmGet$kd_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_prop();
        if (realmGet$kd_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
        }
        String realmGet$kd_pulau = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_pulau();
        if (realmGet$kd_pulau != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, realmGet$kd_pulau, false);
        }
        String realmGet$nm_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_ws();
        if (realmGet$nm_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, realmGet$nm_ws, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_wsIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_ws(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.stok_airIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$stok_air(), false);
        String realmGet$nm_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_kab();
        if (realmGet$nm_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, realmGet$nm_kab, false);
        }
        String realmGet$nm_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_prop();
        if (realmGet$nm_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_propIndex, rowIndex, realmGet$nm_prop, false);
        }
        String realmGet$kriteria_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kriteria_ws();
        if (realmGet$kriteria_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, realmGet$kriteria_ws, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.DaerahIrigasi object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.DaerahIrigasi) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            }
            String realmGet$nm_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_di();
            if (realmGet$nm_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
            }
            String realmGet$klasifikasi = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$klasifikasi();
            if (realmGet$klasifikasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, realmGet$klasifikasi, false);
            }
            String realmGet$thn_bangun = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$thn_bangun();
            if (realmGet$thn_bangun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, realmGet$thn_bangun, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$kewenangan = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kewenangan();
            if (realmGet$kewenangan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, realmGet$kewenangan, false);
            }
            String realmGet$sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$sumber();
            if (realmGet$sumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sumberIndex, rowIndex, realmGet$sumber, false);
            }
            String realmGet$nm_sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_sumber();
            if (realmGet$nm_sumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, realmGet$nm_sumber, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            }
            String realmGet$kd_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_das();
            if (realmGet$kd_das != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, realmGet$kd_das, false);
            }
            String realmGet$tmt_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_das();
            if (realmGet$tmt_das != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, realmGet$tmt_das, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$hapus(), false);
            String realmGet$kd_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_ws();
            if (realmGet$kd_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, realmGet$kd_ws, false);
            }
            String realmGet$tmt_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_ws();
            if (realmGet$tmt_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, realmGet$tmt_ws, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.fprIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$fpr(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.perkolasiIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$perkolasi(), false);
            String realmGet$kd_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_kab();
            if (realmGet$kd_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
            }
            String realmGet$kd_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_prop();
            if (realmGet$kd_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
            }
            String realmGet$kd_pulau = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_pulau();
            if (realmGet$kd_pulau != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, realmGet$kd_pulau, false);
            }
            String realmGet$nm_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_ws();
            if (realmGet$nm_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, realmGet$nm_ws, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_wsIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_ws(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.stok_airIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$stok_air(), false);
            String realmGet$nm_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_kab();
            if (realmGet$nm_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, realmGet$nm_kab, false);
            }
            String realmGet$nm_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_prop();
            if (realmGet$nm_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_propIndex, rowIndex, realmGet$nm_prop, false);
            }
            String realmGet$kriteria_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kriteria_ws();
            if (realmGet$kriteria_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, realmGet$kriteria_ws, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.DaerahIrigasi object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
        }
        String realmGet$nm_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_di();
        if (realmGet$nm_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_diIndex, rowIndex, false);
        }
        String realmGet$klasifikasi = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$klasifikasi();
        if (realmGet$klasifikasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, realmGet$klasifikasi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, false);
        }
        String realmGet$thn_bangun = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$thn_bangun();
        if (realmGet$thn_bangun != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, realmGet$thn_bangun, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$kewenangan = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kewenangan();
        if (realmGet$kewenangan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, realmGet$kewenangan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, false);
        }
        String realmGet$sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$sumber();
        if (realmGet$sumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sumberIndex, rowIndex, realmGet$sumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sumberIndex, rowIndex, false);
        }
        String realmGet$nm_sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_sumber();
        if (realmGet$nm_sumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, realmGet$nm_sumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
        }
        String realmGet$kd_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_das();
        if (realmGet$kd_das != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, realmGet$kd_das, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, false);
        }
        String realmGet$tmt_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_das();
        if (realmGet$tmt_das != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, realmGet$tmt_das, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$hapus(), false);
        String realmGet$kd_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_ws();
        if (realmGet$kd_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, realmGet$kd_ws, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, false);
        }
        String realmGet$tmt_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_ws();
        if (realmGet$tmt_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, realmGet$tmt_ws, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.fprIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$fpr(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.perkolasiIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$perkolasi(), false);
        String realmGet$kd_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_kab();
        if (realmGet$kd_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, false);
        }
        String realmGet$kd_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_prop();
        if (realmGet$kd_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_propIndex, rowIndex, false);
        }
        String realmGet$kd_pulau = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_pulau();
        if (realmGet$kd_pulau != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, realmGet$kd_pulau, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, false);
        }
        String realmGet$nm_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_ws();
        if (realmGet$nm_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, realmGet$nm_ws, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_wsIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_ws(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.stok_airIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$stok_air(), false);
        String realmGet$nm_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_kab();
        if (realmGet$nm_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, realmGet$nm_kab, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, false);
        }
        String realmGet$nm_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_prop();
        if (realmGet$nm_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_propIndex, rowIndex, realmGet$nm_prop, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_propIndex, rowIndex, false);
        }
        String realmGet$kriteria_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kriteria_ws();
        if (realmGet$kriteria_ws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, realmGet$kriteria_ws, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.DaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        DaerahIrigasiColumnInfo columnInfo = (DaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.DaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.DaerahIrigasi object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.DaerahIrigasi) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
            }
            String realmGet$nm_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_di();
            if (realmGet$nm_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_diIndex, rowIndex, false);
            }
            String realmGet$klasifikasi = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$klasifikasi();
            if (realmGet$klasifikasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, realmGet$klasifikasi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.klasifikasiIndex, rowIndex, false);
            }
            String realmGet$thn_bangun = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$thn_bangun();
            if (realmGet$thn_bangun != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, realmGet$thn_bangun, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thn_bangunIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$kewenangan = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kewenangan();
            if (realmGet$kewenangan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, realmGet$kewenangan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kewenanganIndex, rowIndex, false);
            }
            String realmGet$sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$sumber();
            if (realmGet$sumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sumberIndex, rowIndex, realmGet$sumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sumberIndex, rowIndex, false);
            }
            String realmGet$nm_sumber = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_sumber();
            if (realmGet$nm_sumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, realmGet$nm_sumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_sumberIndex, rowIndex, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
            }
            String realmGet$kd_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_das();
            if (realmGet$kd_das != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, realmGet$kd_das, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_dasIndex, rowIndex, false);
            }
            String realmGet$tmt_das = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_das();
            if (realmGet$tmt_das != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, realmGet$tmt_das, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_dasIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$hapus(), false);
            String realmGet$kd_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_ws();
            if (realmGet$kd_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, realmGet$kd_ws, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_wsIndex, rowIndex, false);
            }
            String realmGet$tmt_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$tmt_ws();
            if (realmGet$tmt_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, realmGet$tmt_ws, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_wsIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.fprIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$fpr(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.perkolasiIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$perkolasi(), false);
            String realmGet$kd_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_kab();
            if (realmGet$kd_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, false);
            }
            String realmGet$kd_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_prop();
            if (realmGet$kd_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_propIndex, rowIndex, false);
            }
            String realmGet$kd_pulau = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kd_pulau();
            if (realmGet$kd_pulau != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, realmGet$kd_pulau, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_pulauIndex, rowIndex, false);
            }
            String realmGet$nm_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_ws();
            if (realmGet$nm_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, realmGet$nm_ws, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_wsIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_wsIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$luas_ws(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.stok_airIndex, rowIndex, ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$stok_air(), false);
            String realmGet$nm_kab = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_kab();
            if (realmGet$nm_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, realmGet$nm_kab, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_kabIndex, rowIndex, false);
            }
            String realmGet$nm_prop = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$nm_prop();
            if (realmGet$nm_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_propIndex, rowIndex, realmGet$nm_prop, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_propIndex, rowIndex, false);
            }
            String realmGet$kriteria_ws = ((com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) object).realmGet$kriteria_ws();
            if (realmGet$kriteria_ws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, realmGet$kriteria_ws, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kriteria_wsIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.DaerahIrigasi createDetachedCopy(com.pusair.smopi.Model.DaerahIrigasi realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.DaerahIrigasi unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.DaerahIrigasi();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.DaerahIrigasi) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.DaerahIrigasi) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface realmSource = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_di(realmSource.realmGet$kd_di());
        unmanagedCopy.realmSet$nm_di(realmSource.realmGet$nm_di());
        unmanagedCopy.realmSet$klasifikasi(realmSource.realmGet$klasifikasi());
        unmanagedCopy.realmSet$thn_bangun(realmSource.realmGet$thn_bangun());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$kewenangan(realmSource.realmGet$kewenangan());
        unmanagedCopy.realmSet$sumber(realmSource.realmGet$sumber());
        unmanagedCopy.realmSet$nm_sumber(realmSource.realmGet$nm_sumber());
        unmanagedCopy.realmSet$tmt_di(realmSource.realmGet$tmt_di());
        unmanagedCopy.realmSet$kd_das(realmSource.realmGet$kd_das());
        unmanagedCopy.realmSet$tmt_das(realmSource.realmGet$tmt_das());
        unmanagedCopy.realmSet$hapus(realmSource.realmGet$hapus());
        unmanagedCopy.realmSet$kd_ws(realmSource.realmGet$kd_ws());
        unmanagedCopy.realmSet$tmt_ws(realmSource.realmGet$tmt_ws());
        unmanagedCopy.realmSet$fpr(realmSource.realmGet$fpr());
        unmanagedCopy.realmSet$perkolasi(realmSource.realmGet$perkolasi());
        unmanagedCopy.realmSet$kd_kab(realmSource.realmGet$kd_kab());
        unmanagedCopy.realmSet$kd_prop(realmSource.realmGet$kd_prop());
        unmanagedCopy.realmSet$kd_pulau(realmSource.realmGet$kd_pulau());
        unmanagedCopy.realmSet$nm_ws(realmSource.realmGet$nm_ws());
        unmanagedCopy.realmSet$luas_ws(realmSource.realmGet$luas_ws());
        unmanagedCopy.realmSet$stok_air(realmSource.realmGet$stok_air());
        unmanagedCopy.realmSet$nm_kab(realmSource.realmGet$nm_kab());
        unmanagedCopy.realmSet$nm_prop(realmSource.realmGet$nm_prop());
        unmanagedCopy.realmSet$kriteria_ws(realmSource.realmGet$kriteria_ws());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.DaerahIrigasi update(Realm realm, com.pusair.smopi.Model.DaerahIrigasi realmObject, com.pusair.smopi.Model.DaerahIrigasi newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_DaerahIrigasiRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectTarget.realmSet$nm_di(realmObjectSource.realmGet$nm_di());
        realmObjectTarget.realmSet$klasifikasi(realmObjectSource.realmGet$klasifikasi());
        realmObjectTarget.realmSet$thn_bangun(realmObjectSource.realmGet$thn_bangun());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$kewenangan(realmObjectSource.realmGet$kewenangan());
        realmObjectTarget.realmSet$sumber(realmObjectSource.realmGet$sumber());
        realmObjectTarget.realmSet$nm_sumber(realmObjectSource.realmGet$nm_sumber());
        realmObjectTarget.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectTarget.realmSet$kd_das(realmObjectSource.realmGet$kd_das());
        realmObjectTarget.realmSet$tmt_das(realmObjectSource.realmGet$tmt_das());
        realmObjectTarget.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectTarget.realmSet$kd_ws(realmObjectSource.realmGet$kd_ws());
        realmObjectTarget.realmSet$tmt_ws(realmObjectSource.realmGet$tmt_ws());
        realmObjectTarget.realmSet$fpr(realmObjectSource.realmGet$fpr());
        realmObjectTarget.realmSet$perkolasi(realmObjectSource.realmGet$perkolasi());
        realmObjectTarget.realmSet$kd_kab(realmObjectSource.realmGet$kd_kab());
        realmObjectTarget.realmSet$kd_prop(realmObjectSource.realmGet$kd_prop());
        realmObjectTarget.realmSet$kd_pulau(realmObjectSource.realmGet$kd_pulau());
        realmObjectTarget.realmSet$nm_ws(realmObjectSource.realmGet$nm_ws());
        realmObjectTarget.realmSet$luas_ws(realmObjectSource.realmGet$luas_ws());
        realmObjectTarget.realmSet$stok_air(realmObjectSource.realmGet$stok_air());
        realmObjectTarget.realmSet$nm_kab(realmObjectSource.realmGet$nm_kab());
        realmObjectTarget.realmSet$nm_prop(realmObjectSource.realmGet$nm_prop());
        realmObjectTarget.realmSet$kriteria_ws(realmObjectSource.realmGet$kriteria_ws());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("DaerahIrigasi = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_di:");
        stringBuilder.append(realmGet$kd_di() != null ? realmGet$kd_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_di:");
        stringBuilder.append(realmGet$nm_di() != null ? realmGet$nm_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{klasifikasi:");
        stringBuilder.append(realmGet$klasifikasi() != null ? realmGet$klasifikasi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thn_bangun:");
        stringBuilder.append(realmGet$thn_bangun() != null ? realmGet$thn_bangun() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kewenangan:");
        stringBuilder.append(realmGet$kewenangan() != null ? realmGet$kewenangan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sumber:");
        stringBuilder.append(realmGet$sumber() != null ? realmGet$sumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_sumber:");
        stringBuilder.append(realmGet$nm_sumber() != null ? realmGet$nm_sumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_di:");
        stringBuilder.append(realmGet$tmt_di() != null ? realmGet$tmt_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_das:");
        stringBuilder.append(realmGet$kd_das() != null ? realmGet$kd_das() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_das:");
        stringBuilder.append(realmGet$tmt_das() != null ? realmGet$tmt_das() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hapus:");
        stringBuilder.append(realmGet$hapus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_ws:");
        stringBuilder.append(realmGet$kd_ws() != null ? realmGet$kd_ws() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_ws:");
        stringBuilder.append(realmGet$tmt_ws() != null ? realmGet$tmt_ws() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fpr:");
        stringBuilder.append(realmGet$fpr());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{perkolasi:");
        stringBuilder.append(realmGet$perkolasi());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_kab:");
        stringBuilder.append(realmGet$kd_kab() != null ? realmGet$kd_kab() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_prop:");
        stringBuilder.append(realmGet$kd_prop() != null ? realmGet$kd_prop() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_pulau:");
        stringBuilder.append(realmGet$kd_pulau() != null ? realmGet$kd_pulau() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_ws:");
        stringBuilder.append(realmGet$nm_ws() != null ? realmGet$nm_ws() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_ws:");
        stringBuilder.append(realmGet$luas_ws());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{stok_air:");
        stringBuilder.append(realmGet$stok_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_kab:");
        stringBuilder.append(realmGet$nm_kab() != null ? realmGet$nm_kab() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_prop:");
        stringBuilder.append(realmGet$nm_prop() != null ? realmGet$nm_prop() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kriteria_ws:");
        stringBuilder.append(realmGet$kriteria_ws() != null ? realmGet$kriteria_ws() : "null");
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
        com_pusair_smopi_Model_DaerahIrigasiRealmProxy aDaerahIrigasi = (com_pusair_smopi_Model_DaerahIrigasiRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aDaerahIrigasi.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDaerahIrigasi.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aDaerahIrigasi.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
