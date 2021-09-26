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
public class com_pusair_smopi_Model_SaluranRealmProxy extends com.pusair.smopi.Model.Saluran
    implements RealmObjectProxy, com_pusair_smopi_Model_SaluranRealmProxyInterface {

    static final class SaluranColumnInfo extends ColumnInfo {
        long kd_saluranIndex;
        long nm_saluranIndex;
        long jns_saluranIndex;
        long tmt_saluranIndex;
        long panjangIndex;
        long kd_diIndex;
        long tmt_diIndex;
        long kd_saluranparIndex;
        long tmt_saluranparIndex;
        long kd_bangbilIndex;
        long hapusIndex;
        long latIndex;
        long lonIndex;
        long nm_bangtrolbilIndex;
        long tmt_bangtrolbilIndex;
        long lebar_dasarIndex;
        long tinggiIndex;
        long ruas_awIndex;
        long ruas_akIndex;
        long jns_bangbilIndex;

        SaluranColumnInfo(OsSchemaInfo schemaInfo) {
            super(20);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Saluran");
            this.kd_saluranIndex = addColumnDetails("kd_saluran", "kd_saluran", objectSchemaInfo);
            this.nm_saluranIndex = addColumnDetails("nm_saluran", "nm_saluran", objectSchemaInfo);
            this.jns_saluranIndex = addColumnDetails("jns_saluran", "jns_saluran", objectSchemaInfo);
            this.tmt_saluranIndex = addColumnDetails("tmt_saluran", "tmt_saluran", objectSchemaInfo);
            this.panjangIndex = addColumnDetails("panjang", "panjang", objectSchemaInfo);
            this.kd_diIndex = addColumnDetails("kd_di", "kd_di", objectSchemaInfo);
            this.tmt_diIndex = addColumnDetails("tmt_di", "tmt_di", objectSchemaInfo);
            this.kd_saluranparIndex = addColumnDetails("kd_saluranpar", "kd_saluranpar", objectSchemaInfo);
            this.tmt_saluranparIndex = addColumnDetails("tmt_saluranpar", "tmt_saluranpar", objectSchemaInfo);
            this.kd_bangbilIndex = addColumnDetails("kd_bangbil", "kd_bangbil", objectSchemaInfo);
            this.hapusIndex = addColumnDetails("hapus", "hapus", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonIndex = addColumnDetails("lon", "lon", objectSchemaInfo);
            this.nm_bangtrolbilIndex = addColumnDetails("nm_bangtrolbil", "nm_bangtrolbil", objectSchemaInfo);
            this.tmt_bangtrolbilIndex = addColumnDetails("tmt_bangtrolbil", "tmt_bangtrolbil", objectSchemaInfo);
            this.lebar_dasarIndex = addColumnDetails("lebar_dasar", "lebar_dasar", objectSchemaInfo);
            this.tinggiIndex = addColumnDetails("tinggi", "tinggi", objectSchemaInfo);
            this.ruas_awIndex = addColumnDetails("ruas_aw", "ruas_aw", objectSchemaInfo);
            this.ruas_akIndex = addColumnDetails("ruas_ak", "ruas_ak", objectSchemaInfo);
            this.jns_bangbilIndex = addColumnDetails("jns_bangbil", "jns_bangbil", objectSchemaInfo);
        }

        SaluranColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SaluranColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SaluranColumnInfo src = (SaluranColumnInfo) rawSrc;
            final SaluranColumnInfo dst = (SaluranColumnInfo) rawDst;
            dst.kd_saluranIndex = src.kd_saluranIndex;
            dst.nm_saluranIndex = src.nm_saluranIndex;
            dst.jns_saluranIndex = src.jns_saluranIndex;
            dst.tmt_saluranIndex = src.tmt_saluranIndex;
            dst.panjangIndex = src.panjangIndex;
            dst.kd_diIndex = src.kd_diIndex;
            dst.tmt_diIndex = src.tmt_diIndex;
            dst.kd_saluranparIndex = src.kd_saluranparIndex;
            dst.tmt_saluranparIndex = src.tmt_saluranparIndex;
            dst.kd_bangbilIndex = src.kd_bangbilIndex;
            dst.hapusIndex = src.hapusIndex;
            dst.latIndex = src.latIndex;
            dst.lonIndex = src.lonIndex;
            dst.nm_bangtrolbilIndex = src.nm_bangtrolbilIndex;
            dst.tmt_bangtrolbilIndex = src.tmt_bangtrolbilIndex;
            dst.lebar_dasarIndex = src.lebar_dasarIndex;
            dst.tinggiIndex = src.tinggiIndex;
            dst.ruas_awIndex = src.ruas_awIndex;
            dst.ruas_akIndex = src.ruas_akIndex;
            dst.jns_bangbilIndex = src.jns_bangbilIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SaluranColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Saluran> proxyState;

    com_pusair_smopi_Model_SaluranRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SaluranColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Saluran>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'kd_saluran' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_saluran() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_saluranIndex);
    }

    @Override
    public void realmSet$nm_saluran(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_saluranIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_saluranIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_saluranIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_saluranIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jns_saluran() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jns_saluranIndex);
    }

    @Override
    public void realmSet$jns_saluran(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jns_saluranIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.jns_saluranIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jns_saluranIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jns_saluranIndex, value);
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
    public float realmGet$panjang() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.panjangIndex);
    }

    @Override
    public void realmSet$panjang(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.panjangIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.panjangIndex, value);
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
    public String realmGet$kd_saluranpar() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_saluranparIndex);
    }

    @Override
    public void realmSet$kd_saluranpar(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_saluranparIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_saluranparIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_saluranparIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_saluranparIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_saluranpar() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_saluranparIndex);
    }

    @Override
    public void realmSet$tmt_saluranpar(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_saluranparIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_saluranparIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_saluranparIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_saluranparIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_bangbil() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_bangbilIndex);
    }

    @Override
    public void realmSet$kd_bangbil(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_bangbilIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_bangbilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_bangbilIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_bangbilIndex, value);
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
    public double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$lon() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lonIndex);
    }

    @Override
    public void realmSet$lon(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.lonIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.lonIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_bangtrolbil() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_bangtrolbilIndex);
    }

    @Override
    public void realmSet$nm_bangtrolbil(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_bangtrolbilIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_bangtrolbilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_bangtrolbilIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_bangtrolbilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_bangtrolbil() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_bangtrolbilIndex);
    }

    @Override
    public void realmSet$tmt_bangtrolbil(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_bangtrolbilIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_bangtrolbilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_bangtrolbilIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_bangtrolbilIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$lebar_dasar() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.lebar_dasarIndex);
    }

    @Override
    public void realmSet$lebar_dasar(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.lebar_dasarIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.lebar_dasarIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tinggi() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tinggiIndex);
    }

    @Override
    public void realmSet$tinggi(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tinggiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tinggiIndex, value);
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
    public String realmGet$jns_bangbil() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jns_bangbilIndex);
    }

    @Override
    public void realmSet$jns_bangbil(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jns_bangbilIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.jns_bangbilIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jns_bangbilIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jns_bangbilIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Saluran", 20, 0);
        builder.addPersistedProperty("kd_saluran", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jns_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("panjang", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kd_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_saluranpar", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_saluranpar", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_bangbil", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("hapus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrolbil", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrolbil", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lebar_dasar", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tinggi", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ruas_aw", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ruas_ak", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jns_bangbil", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SaluranColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SaluranColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Saluran";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Saluran";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Saluran createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Saluran obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
            SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
            long pkColumnIndex = columnInfo.kd_saluranIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("kd_saluran")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("kd_saluran"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_SaluranRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("kd_saluran")) {
                if (json.isNull("kd_saluran")) {
                    obj = (io.realm.com_pusair_smopi_Model_SaluranRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Saluran.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_SaluranRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Saluran.class, json.getString("kd_saluran"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_saluran'.");
            }
        }

        final com_pusair_smopi_Model_SaluranRealmProxyInterface objProxy = (com_pusair_smopi_Model_SaluranRealmProxyInterface) obj;
        if (json.has("nm_saluran")) {
            if (json.isNull("nm_saluran")) {
                objProxy.realmSet$nm_saluran(null);
            } else {
                objProxy.realmSet$nm_saluran((String) json.getString("nm_saluran"));
            }
        }
        if (json.has("jns_saluran")) {
            if (json.isNull("jns_saluran")) {
                objProxy.realmSet$jns_saluran(null);
            } else {
                objProxy.realmSet$jns_saluran((String) json.getString("jns_saluran"));
            }
        }
        if (json.has("tmt_saluran")) {
            if (json.isNull("tmt_saluran")) {
                objProxy.realmSet$tmt_saluran(null);
            } else {
                objProxy.realmSet$tmt_saluran((String) json.getString("tmt_saluran"));
            }
        }
        if (json.has("panjang")) {
            if (json.isNull("panjang")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'panjang' to null.");
            } else {
                objProxy.realmSet$panjang((float) json.getDouble("panjang"));
            }
        }
        if (json.has("kd_di")) {
            if (json.isNull("kd_di")) {
                objProxy.realmSet$kd_di(null);
            } else {
                objProxy.realmSet$kd_di((String) json.getString("kd_di"));
            }
        }
        if (json.has("tmt_di")) {
            if (json.isNull("tmt_di")) {
                objProxy.realmSet$tmt_di(null);
            } else {
                objProxy.realmSet$tmt_di((String) json.getString("tmt_di"));
            }
        }
        if (json.has("kd_saluranpar")) {
            if (json.isNull("kd_saluranpar")) {
                objProxy.realmSet$kd_saluranpar(null);
            } else {
                objProxy.realmSet$kd_saluranpar((String) json.getString("kd_saluranpar"));
            }
        }
        if (json.has("tmt_saluranpar")) {
            if (json.isNull("tmt_saluranpar")) {
                objProxy.realmSet$tmt_saluranpar(null);
            } else {
                objProxy.realmSet$tmt_saluranpar((String) json.getString("tmt_saluranpar"));
            }
        }
        if (json.has("kd_bangbil")) {
            if (json.isNull("kd_bangbil")) {
                objProxy.realmSet$kd_bangbil(null);
            } else {
                objProxy.realmSet$kd_bangbil((String) json.getString("kd_bangbil"));
            }
        }
        if (json.has("hapus")) {
            if (json.isNull("hapus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hapus' to null.");
            } else {
                objProxy.realmSet$hapus((int) json.getInt("hapus"));
            }
        }
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lon")) {
            if (json.isNull("lon")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lon' to null.");
            } else {
                objProxy.realmSet$lon((double) json.getDouble("lon"));
            }
        }
        if (json.has("nm_bangtrolbil")) {
            if (json.isNull("nm_bangtrolbil")) {
                objProxy.realmSet$nm_bangtrolbil(null);
            } else {
                objProxy.realmSet$nm_bangtrolbil((String) json.getString("nm_bangtrolbil"));
            }
        }
        if (json.has("tmt_bangtrolbil")) {
            if (json.isNull("tmt_bangtrolbil")) {
                objProxy.realmSet$tmt_bangtrolbil(null);
            } else {
                objProxy.realmSet$tmt_bangtrolbil((String) json.getString("tmt_bangtrolbil"));
            }
        }
        if (json.has("lebar_dasar")) {
            if (json.isNull("lebar_dasar")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lebar_dasar' to null.");
            } else {
                objProxy.realmSet$lebar_dasar((float) json.getDouble("lebar_dasar"));
            }
        }
        if (json.has("tinggi")) {
            if (json.isNull("tinggi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tinggi' to null.");
            } else {
                objProxy.realmSet$tinggi((float) json.getDouble("tinggi"));
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
        if (json.has("jns_bangbil")) {
            if (json.isNull("jns_bangbil")) {
                objProxy.realmSet$jns_bangbil(null);
            } else {
                objProxy.realmSet$jns_bangbil((String) json.getString("jns_bangbil"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.Saluran createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Saluran obj = new com.pusair.smopi.Model.Saluran();
        final com_pusair_smopi_Model_SaluranRealmProxyInterface objProxy = (com_pusair_smopi_Model_SaluranRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("kd_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_saluran(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nm_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_saluran(null);
                }
            } else if (name.equals("jns_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jns_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jns_saluran(null);
                }
            } else if (name.equals("tmt_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_saluran(null);
                }
            } else if (name.equals("panjang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$panjang((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'panjang' to null.");
                }
            } else if (name.equals("kd_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_di(null);
                }
            } else if (name.equals("tmt_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_di(null);
                }
            } else if (name.equals("kd_saluranpar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_saluranpar((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_saluranpar(null);
                }
            } else if (name.equals("tmt_saluranpar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_saluranpar((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_saluranpar(null);
                }
            } else if (name.equals("kd_bangbil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_bangbil((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_bangbil(null);
                }
            } else if (name.equals("hapus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hapus((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hapus' to null.");
                }
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
                }
            } else if (name.equals("lon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lon((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lon' to null.");
                }
            } else if (name.equals("nm_bangtrolbil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_bangtrolbil((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_bangtrolbil(null);
                }
            } else if (name.equals("tmt_bangtrolbil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_bangtrolbil((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_bangtrolbil(null);
                }
            } else if (name.equals("lebar_dasar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lebar_dasar((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lebar_dasar' to null.");
                }
            } else if (name.equals("tinggi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tinggi((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tinggi' to null.");
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
            } else if (name.equals("jns_bangbil")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jns_bangbil((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jns_bangbil(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_saluran'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.Saluran copyOrUpdate(Realm realm, com.pusair.smopi.Model.Saluran object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.Saluran) cachedRealmObject;
        }

        com.pusair.smopi.Model.Saluran realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
            SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
            long pkColumnIndex = columnInfo.kd_saluranIndex;
            String value = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluran();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_SaluranRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Saluran copy(Realm realm, com.pusair.smopi.Model.Saluran newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Saluran) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Saluran realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Saluran.class, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) newObject).realmGet$kd_saluran(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_SaluranRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_SaluranRealmProxyInterface) newObject;
        com_pusair_smopi_Model_SaluranRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_SaluranRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$nm_saluran(realmObjectSource.realmGet$nm_saluran());
        realmObjectCopy.realmSet$jns_saluran(realmObjectSource.realmGet$jns_saluran());
        realmObjectCopy.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectCopy.realmSet$panjang(realmObjectSource.realmGet$panjang());
        realmObjectCopy.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectCopy.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectCopy.realmSet$kd_saluranpar(realmObjectSource.realmGet$kd_saluranpar());
        realmObjectCopy.realmSet$tmt_saluranpar(realmObjectSource.realmGet$tmt_saluranpar());
        realmObjectCopy.realmSet$kd_bangbil(realmObjectSource.realmGet$kd_bangbil());
        realmObjectCopy.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectCopy.realmSet$nm_bangtrolbil(realmObjectSource.realmGet$nm_bangtrolbil());
        realmObjectCopy.realmSet$tmt_bangtrolbil(realmObjectSource.realmGet$tmt_bangtrolbil());
        realmObjectCopy.realmSet$lebar_dasar(realmObjectSource.realmGet$lebar_dasar());
        realmObjectCopy.realmSet$tinggi(realmObjectSource.realmGet$tinggi());
        realmObjectCopy.realmSet$ruas_aw(realmObjectSource.realmGet$ruas_aw());
        realmObjectCopy.realmSet$ruas_ak(realmObjectSource.realmGet$ruas_ak());
        realmObjectCopy.realmSet$jns_bangbil(realmObjectSource.realmGet$jns_bangbil());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Saluran object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
        long tableNativePtr = table.getNativePtr();
        SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
        long pkColumnIndex = columnInfo.kd_saluranIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluran();
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
        String realmGet$nm_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_saluran();
        if (realmGet$nm_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, realmGet$nm_saluran, false);
        }
        String realmGet$jns_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_saluran();
        if (realmGet$jns_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, realmGet$jns_saluran, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$panjang(), false);
        String realmGet$kd_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        }
        String realmGet$kd_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluranpar();
        if (realmGet$kd_saluranpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, realmGet$kd_saluranpar, false);
        }
        String realmGet$tmt_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluranpar();
        if (realmGet$tmt_saluranpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, realmGet$tmt_saluranpar, false);
        }
        String realmGet$kd_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_bangbil();
        if (realmGet$kd_bangbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, realmGet$kd_bangbil, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$hapus(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lon(), false);
        String realmGet$nm_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_bangtrolbil();
        if (realmGet$nm_bangtrolbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, realmGet$nm_bangtrolbil, false);
        }
        String realmGet$tmt_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_bangtrolbil();
        if (realmGet$tmt_bangtrolbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, realmGet$tmt_bangtrolbil, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.lebar_dasarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lebar_dasar(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tinggi(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_aw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_ak(), false);
        String realmGet$jns_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_bangbil();
        if (realmGet$jns_bangbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, realmGet$jns_bangbil, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
        long tableNativePtr = table.getNativePtr();
        SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
        long pkColumnIndex = columnInfo.kd_saluranIndex;
        com.pusair.smopi.Model.Saluran object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Saluran) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluran();
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
            String realmGet$nm_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_saluran();
            if (realmGet$nm_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, realmGet$nm_saluran, false);
            }
            String realmGet$jns_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_saluran();
            if (realmGet$jns_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, realmGet$jns_saluran, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$panjang(), false);
            String realmGet$kd_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            }
            String realmGet$kd_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluranpar();
            if (realmGet$kd_saluranpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, realmGet$kd_saluranpar, false);
            }
            String realmGet$tmt_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluranpar();
            if (realmGet$tmt_saluranpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, realmGet$tmt_saluranpar, false);
            }
            String realmGet$kd_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_bangbil();
            if (realmGet$kd_bangbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, realmGet$kd_bangbil, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$hapus(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lon(), false);
            String realmGet$nm_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_bangtrolbil();
            if (realmGet$nm_bangtrolbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, realmGet$nm_bangtrolbil, false);
            }
            String realmGet$tmt_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_bangtrolbil();
            if (realmGet$tmt_bangtrolbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, realmGet$tmt_bangtrolbil, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.lebar_dasarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lebar_dasar(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tinggi(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_aw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_ak(), false);
            String realmGet$jns_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_bangbil();
            if (realmGet$jns_bangbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, realmGet$jns_bangbil, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Saluran object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
        long tableNativePtr = table.getNativePtr();
        SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
        long pkColumnIndex = columnInfo.kd_saluranIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluran();
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
        String realmGet$nm_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_saluran();
        if (realmGet$nm_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, realmGet$nm_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, false);
        }
        String realmGet$jns_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_saluran();
        if (realmGet$jns_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, realmGet$jns_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$panjang(), false);
        String realmGet$kd_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
        }
        String realmGet$kd_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluranpar();
        if (realmGet$kd_saluranpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, realmGet$kd_saluranpar, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, false);
        }
        String realmGet$tmt_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluranpar();
        if (realmGet$tmt_saluranpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, realmGet$tmt_saluranpar, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, false);
        }
        String realmGet$kd_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_bangbil();
        if (realmGet$kd_bangbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, realmGet$kd_bangbil, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$hapus(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lon(), false);
        String realmGet$nm_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_bangtrolbil();
        if (realmGet$nm_bangtrolbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, realmGet$nm_bangtrolbil, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_bangtrolbil();
        if (realmGet$tmt_bangtrolbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, realmGet$tmt_bangtrolbil, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.lebar_dasarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lebar_dasar(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tinggi(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_aw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_ak(), false);
        String realmGet$jns_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_bangbil();
        if (realmGet$jns_bangbil != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, realmGet$jns_bangbil, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Saluran.class);
        long tableNativePtr = table.getNativePtr();
        SaluranColumnInfo columnInfo = (SaluranColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Saluran.class);
        long pkColumnIndex = columnInfo.kd_saluranIndex;
        com.pusair.smopi.Model.Saluran object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Saluran) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluran();
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
            String realmGet$nm_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_saluran();
            if (realmGet$nm_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, realmGet$nm_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_saluranIndex, rowIndex, false);
            }
            String realmGet$jns_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_saluran();
            if (realmGet$jns_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, realmGet$jns_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jns_saluranIndex, rowIndex, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$panjang(), false);
            String realmGet$kd_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
            }
            String realmGet$kd_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_saluranpar();
            if (realmGet$kd_saluranpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, realmGet$kd_saluranpar, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranparIndex, rowIndex, false);
            }
            String realmGet$tmt_saluranpar = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_saluranpar();
            if (realmGet$tmt_saluranpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, realmGet$tmt_saluranpar, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranparIndex, rowIndex, false);
            }
            String realmGet$kd_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$kd_bangbil();
            if (realmGet$kd_bangbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, realmGet$kd_bangbil, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_bangbilIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$hapus(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lon(), false);
            String realmGet$nm_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$nm_bangtrolbil();
            if (realmGet$nm_bangtrolbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, realmGet$nm_bangtrolbil, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolbilIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrolbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tmt_bangtrolbil();
            if (realmGet$tmt_bangtrolbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, realmGet$tmt_bangtrolbil, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolbilIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.lebar_dasarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$lebar_dasar(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$tinggi(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_awIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_aw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_akIndex, rowIndex, ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$ruas_ak(), false);
            String realmGet$jns_bangbil = ((com_pusair_smopi_Model_SaluranRealmProxyInterface) object).realmGet$jns_bangbil();
            if (realmGet$jns_bangbil != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, realmGet$jns_bangbil, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jns_bangbilIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Saluran createDetachedCopy(com.pusair.smopi.Model.Saluran realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Saluran unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Saluran();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Saluran) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Saluran) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_SaluranRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_SaluranRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_SaluranRealmProxyInterface realmSource = (com_pusair_smopi_Model_SaluranRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$kd_saluran(realmSource.realmGet$kd_saluran());
        unmanagedCopy.realmSet$nm_saluran(realmSource.realmGet$nm_saluran());
        unmanagedCopy.realmSet$jns_saluran(realmSource.realmGet$jns_saluran());
        unmanagedCopy.realmSet$tmt_saluran(realmSource.realmGet$tmt_saluran());
        unmanagedCopy.realmSet$panjang(realmSource.realmGet$panjang());
        unmanagedCopy.realmSet$kd_di(realmSource.realmGet$kd_di());
        unmanagedCopy.realmSet$tmt_di(realmSource.realmGet$tmt_di());
        unmanagedCopy.realmSet$kd_saluranpar(realmSource.realmGet$kd_saluranpar());
        unmanagedCopy.realmSet$tmt_saluranpar(realmSource.realmGet$tmt_saluranpar());
        unmanagedCopy.realmSet$kd_bangbil(realmSource.realmGet$kd_bangbil());
        unmanagedCopy.realmSet$hapus(realmSource.realmGet$hapus());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$nm_bangtrolbil(realmSource.realmGet$nm_bangtrolbil());
        unmanagedCopy.realmSet$tmt_bangtrolbil(realmSource.realmGet$tmt_bangtrolbil());
        unmanagedCopy.realmSet$lebar_dasar(realmSource.realmGet$lebar_dasar());
        unmanagedCopy.realmSet$tinggi(realmSource.realmGet$tinggi());
        unmanagedCopy.realmSet$ruas_aw(realmSource.realmGet$ruas_aw());
        unmanagedCopy.realmSet$ruas_ak(realmSource.realmGet$ruas_ak());
        unmanagedCopy.realmSet$jns_bangbil(realmSource.realmGet$jns_bangbil());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Saluran update(Realm realm, com.pusair.smopi.Model.Saluran realmObject, com.pusair.smopi.Model.Saluran newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_SaluranRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_SaluranRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_SaluranRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_SaluranRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$nm_saluran(realmObjectSource.realmGet$nm_saluran());
        realmObjectTarget.realmSet$jns_saluran(realmObjectSource.realmGet$jns_saluran());
        realmObjectTarget.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectTarget.realmSet$panjang(realmObjectSource.realmGet$panjang());
        realmObjectTarget.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectTarget.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectTarget.realmSet$kd_saluranpar(realmObjectSource.realmGet$kd_saluranpar());
        realmObjectTarget.realmSet$tmt_saluranpar(realmObjectSource.realmGet$tmt_saluranpar());
        realmObjectTarget.realmSet$kd_bangbil(realmObjectSource.realmGet$kd_bangbil());
        realmObjectTarget.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectTarget.realmSet$nm_bangtrolbil(realmObjectSource.realmGet$nm_bangtrolbil());
        realmObjectTarget.realmSet$tmt_bangtrolbil(realmObjectSource.realmGet$tmt_bangtrolbil());
        realmObjectTarget.realmSet$lebar_dasar(realmObjectSource.realmGet$lebar_dasar());
        realmObjectTarget.realmSet$tinggi(realmObjectSource.realmGet$tinggi());
        realmObjectTarget.realmSet$ruas_aw(realmObjectSource.realmGet$ruas_aw());
        realmObjectTarget.realmSet$ruas_ak(realmObjectSource.realmGet$ruas_ak());
        realmObjectTarget.realmSet$jns_bangbil(realmObjectSource.realmGet$jns_bangbil());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Saluran = proxy[");
        stringBuilder.append("{kd_saluran:");
        stringBuilder.append(realmGet$kd_saluran() != null ? realmGet$kd_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_saluran:");
        stringBuilder.append(realmGet$nm_saluran() != null ? realmGet$nm_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jns_saluran:");
        stringBuilder.append(realmGet$jns_saluran() != null ? realmGet$jns_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_saluran:");
        stringBuilder.append(realmGet$tmt_saluran() != null ? realmGet$tmt_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{panjang:");
        stringBuilder.append(realmGet$panjang());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_di:");
        stringBuilder.append(realmGet$kd_di() != null ? realmGet$kd_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_di:");
        stringBuilder.append(realmGet$tmt_di() != null ? realmGet$tmt_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_saluranpar:");
        stringBuilder.append(realmGet$kd_saluranpar() != null ? realmGet$kd_saluranpar() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_saluranpar:");
        stringBuilder.append(realmGet$tmt_saluranpar() != null ? realmGet$tmt_saluranpar() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_bangbil:");
        stringBuilder.append(realmGet$kd_bangbil() != null ? realmGet$kd_bangbil() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hapus:");
        stringBuilder.append(realmGet$hapus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lon:");
        stringBuilder.append(realmGet$lon());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_bangtrolbil:");
        stringBuilder.append(realmGet$nm_bangtrolbil() != null ? realmGet$nm_bangtrolbil() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_bangtrolbil:");
        stringBuilder.append(realmGet$tmt_bangtrolbil() != null ? realmGet$tmt_bangtrolbil() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lebar_dasar:");
        stringBuilder.append(realmGet$lebar_dasar());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tinggi:");
        stringBuilder.append(realmGet$tinggi());
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
        stringBuilder.append("{jns_bangbil:");
        stringBuilder.append(realmGet$jns_bangbil() != null ? realmGet$jns_bangbil() : "null");
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
        com_pusair_smopi_Model_SaluranRealmProxy aSaluran = (com_pusair_smopi_Model_SaluranRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSaluran.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSaluran.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSaluran.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
