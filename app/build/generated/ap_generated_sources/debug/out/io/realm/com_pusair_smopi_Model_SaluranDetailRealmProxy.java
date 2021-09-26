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
public class com_pusair_smopi_Model_SaluranDetailRealmProxy extends com.pusair.smopi.Model.SaluranDetail
    implements RealmObjectProxy, com_pusair_smopi_Model_SaluranDetailRealmProxyInterface {

    static final class SaluranDetailColumnInfo extends ColumnInfo {
        long nm_bangtrolIndex;
        long urutanIndex;
        long tmt_bangtrolIndex;
        long kd_saluranIndex;
        long tmt_saluranIndex;
        long kd_jnsbangIndex;
        long nm_bangtrolparIndex;
        long tmt_bangtrolparIndex;
        long hapusIndex;
        long latIndex;
        long lonIndex;
        long petak_tersierIndex;
        long panjangIndex;
        long lebarIndex;
        long tinggiIndex;
        long ruas_salIndex;
        long jum_pintuIndex;
        long nm_jnsbangIndex;

        SaluranDetailColumnInfo(OsSchemaInfo schemaInfo) {
            super(18);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SaluranDetail");
            this.nm_bangtrolIndex = addColumnDetails("nm_bangtrol", "nm_bangtrol", objectSchemaInfo);
            this.urutanIndex = addColumnDetails("urutan", "urutan", objectSchemaInfo);
            this.tmt_bangtrolIndex = addColumnDetails("tmt_bangtrol", "tmt_bangtrol", objectSchemaInfo);
            this.kd_saluranIndex = addColumnDetails("kd_saluran", "kd_saluran", objectSchemaInfo);
            this.tmt_saluranIndex = addColumnDetails("tmt_saluran", "tmt_saluran", objectSchemaInfo);
            this.kd_jnsbangIndex = addColumnDetails("kd_jnsbang", "kd_jnsbang", objectSchemaInfo);
            this.nm_bangtrolparIndex = addColumnDetails("nm_bangtrolpar", "nm_bangtrolpar", objectSchemaInfo);
            this.tmt_bangtrolparIndex = addColumnDetails("tmt_bangtrolpar", "tmt_bangtrolpar", objectSchemaInfo);
            this.hapusIndex = addColumnDetails("hapus", "hapus", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonIndex = addColumnDetails("lon", "lon", objectSchemaInfo);
            this.petak_tersierIndex = addColumnDetails("petak_tersier", "petak_tersier", objectSchemaInfo);
            this.panjangIndex = addColumnDetails("panjang", "panjang", objectSchemaInfo);
            this.lebarIndex = addColumnDetails("lebar", "lebar", objectSchemaInfo);
            this.tinggiIndex = addColumnDetails("tinggi", "tinggi", objectSchemaInfo);
            this.ruas_salIndex = addColumnDetails("ruas_sal", "ruas_sal", objectSchemaInfo);
            this.jum_pintuIndex = addColumnDetails("jum_pintu", "jum_pintu", objectSchemaInfo);
            this.nm_jnsbangIndex = addColumnDetails("nm_jnsbang", "nm_jnsbang", objectSchemaInfo);
        }

        SaluranDetailColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SaluranDetailColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SaluranDetailColumnInfo src = (SaluranDetailColumnInfo) rawSrc;
            final SaluranDetailColumnInfo dst = (SaluranDetailColumnInfo) rawDst;
            dst.nm_bangtrolIndex = src.nm_bangtrolIndex;
            dst.urutanIndex = src.urutanIndex;
            dst.tmt_bangtrolIndex = src.tmt_bangtrolIndex;
            dst.kd_saluranIndex = src.kd_saluranIndex;
            dst.tmt_saluranIndex = src.tmt_saluranIndex;
            dst.kd_jnsbangIndex = src.kd_jnsbangIndex;
            dst.nm_bangtrolparIndex = src.nm_bangtrolparIndex;
            dst.tmt_bangtrolparIndex = src.tmt_bangtrolparIndex;
            dst.hapusIndex = src.hapusIndex;
            dst.latIndex = src.latIndex;
            dst.lonIndex = src.lonIndex;
            dst.petak_tersierIndex = src.petak_tersierIndex;
            dst.panjangIndex = src.panjangIndex;
            dst.lebarIndex = src.lebarIndex;
            dst.tinggiIndex = src.tinggiIndex;
            dst.ruas_salIndex = src.ruas_salIndex;
            dst.jum_pintuIndex = src.jum_pintuIndex;
            dst.nm_jnsbangIndex = src.nm_jnsbangIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SaluranDetailColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.SaluranDetail> proxyState;

    com_pusair_smopi_Model_SaluranDetailRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SaluranDetailColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.SaluranDetail>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'nm_bangtrol' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$urutan() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.urutanIndex);
    }

    @Override
    public void realmSet$urutan(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.urutanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.urutanIndex, value);
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
    public int realmGet$kd_jnsbang() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.kd_jnsbangIndex);
    }

    @Override
    public void realmSet$kd_jnsbang(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.kd_jnsbangIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.kd_jnsbangIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_bangtrolpar() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_bangtrolparIndex);
    }

    @Override
    public void realmSet$nm_bangtrolpar(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_bangtrolparIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_bangtrolparIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_bangtrolparIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_bangtrolparIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt_bangtrolpar() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmt_bangtrolparIndex);
    }

    @Override
    public void realmSet$tmt_bangtrolpar(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmt_bangtrolparIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmt_bangtrolparIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmt_bangtrolparIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmt_bangtrolparIndex, value);
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
    public float realmGet$petak_tersier() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.petak_tersierIndex);
    }

    @Override
    public void realmSet$petak_tersier(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.petak_tersierIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.petak_tersierIndex, value);
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
    public float realmGet$lebar() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.lebarIndex);
    }

    @Override
    public void realmSet$lebar(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.lebarIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.lebarIndex, value);
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
    public int realmGet$ruas_sal() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.ruas_salIndex);
    }

    @Override
    public void realmSet$ruas_sal(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.ruas_salIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.ruas_salIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$jum_pintu() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.jum_pintuIndex);
    }

    @Override
    public void realmSet$jum_pintu(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.jum_pintuIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.jum_pintuIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_jnsbang() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_jnsbangIndex);
    }

    @Override
    public void realmSet$nm_jnsbang(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_jnsbangIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_jnsbangIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_jnsbangIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_jnsbangIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("SaluranDetail", 18, 0);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("urutan", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_saluran", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_jnsbang", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrolpar", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrolpar", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("hapus", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("panjang", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lebar", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tinggi", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ruas_sal", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jum_pintu", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_jnsbang", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SaluranDetailColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SaluranDetailColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SaluranDetail";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SaluranDetail";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.SaluranDetail createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.SaluranDetail obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
            SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
            long pkColumnIndex = columnInfo.nm_bangtrolIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("nm_bangtrol")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("nm_bangtrol"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("nm_bangtrol")) {
                if (json.isNull("nm_bangtrol")) {
                    obj = (io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.SaluranDetail.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.SaluranDetail.class, json.getString("nm_bangtrol"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nm_bangtrol'.");
            }
        }

        final com_pusair_smopi_Model_SaluranDetailRealmProxyInterface objProxy = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) obj;
        if (json.has("urutan")) {
            if (json.isNull("urutan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
            } else {
                objProxy.realmSet$urutan((int) json.getInt("urutan"));
            }
        }
        if (json.has("tmt_bangtrol")) {
            if (json.isNull("tmt_bangtrol")) {
                objProxy.realmSet$tmt_bangtrol(null);
            } else {
                objProxy.realmSet$tmt_bangtrol((String) json.getString("tmt_bangtrol"));
            }
        }
        if (json.has("kd_saluran")) {
            if (json.isNull("kd_saluran")) {
                objProxy.realmSet$kd_saluran(null);
            } else {
                objProxy.realmSet$kd_saluran((String) json.getString("kd_saluran"));
            }
        }
        if (json.has("tmt_saluran")) {
            if (json.isNull("tmt_saluran")) {
                objProxy.realmSet$tmt_saluran(null);
            } else {
                objProxy.realmSet$tmt_saluran((String) json.getString("tmt_saluran"));
            }
        }
        if (json.has("kd_jnsbang")) {
            if (json.isNull("kd_jnsbang")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kd_jnsbang' to null.");
            } else {
                objProxy.realmSet$kd_jnsbang((int) json.getInt("kd_jnsbang"));
            }
        }
        if (json.has("nm_bangtrolpar")) {
            if (json.isNull("nm_bangtrolpar")) {
                objProxy.realmSet$nm_bangtrolpar(null);
            } else {
                objProxy.realmSet$nm_bangtrolpar((String) json.getString("nm_bangtrolpar"));
            }
        }
        if (json.has("tmt_bangtrolpar")) {
            if (json.isNull("tmt_bangtrolpar")) {
                objProxy.realmSet$tmt_bangtrolpar(null);
            } else {
                objProxy.realmSet$tmt_bangtrolpar((String) json.getString("tmt_bangtrolpar"));
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
        if (json.has("petak_tersier")) {
            if (json.isNull("petak_tersier")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
            } else {
                objProxy.realmSet$petak_tersier((float) json.getDouble("petak_tersier"));
            }
        }
        if (json.has("panjang")) {
            if (json.isNull("panjang")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'panjang' to null.");
            } else {
                objProxy.realmSet$panjang((float) json.getDouble("panjang"));
            }
        }
        if (json.has("lebar")) {
            if (json.isNull("lebar")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lebar' to null.");
            } else {
                objProxy.realmSet$lebar((float) json.getDouble("lebar"));
            }
        }
        if (json.has("tinggi")) {
            if (json.isNull("tinggi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tinggi' to null.");
            } else {
                objProxy.realmSet$tinggi((float) json.getDouble("tinggi"));
            }
        }
        if (json.has("ruas_sal")) {
            if (json.isNull("ruas_sal")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_sal' to null.");
            } else {
                objProxy.realmSet$ruas_sal((int) json.getInt("ruas_sal"));
            }
        }
        if (json.has("jum_pintu")) {
            if (json.isNull("jum_pintu")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jum_pintu' to null.");
            } else {
                objProxy.realmSet$jum_pintu((int) json.getInt("jum_pintu"));
            }
        }
        if (json.has("nm_jnsbang")) {
            if (json.isNull("nm_jnsbang")) {
                objProxy.realmSet$nm_jnsbang(null);
            } else {
                objProxy.realmSet$nm_jnsbang((String) json.getString("nm_jnsbang"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.SaluranDetail createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.SaluranDetail obj = new com.pusair.smopi.Model.SaluranDetail();
        final com_pusair_smopi_Model_SaluranDetailRealmProxyInterface objProxy = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("nm_bangtrol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_bangtrol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_bangtrol(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("urutan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urutan((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
                }
            } else if (name.equals("tmt_bangtrol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_bangtrol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_bangtrol(null);
                }
            } else if (name.equals("kd_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_saluran(null);
                }
            } else if (name.equals("tmt_saluran")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_saluran((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_saluran(null);
                }
            } else if (name.equals("kd_jnsbang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_jnsbang((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kd_jnsbang' to null.");
                }
            } else if (name.equals("nm_bangtrolpar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_bangtrolpar((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_bangtrolpar(null);
                }
            } else if (name.equals("tmt_bangtrolpar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_bangtrolpar((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_bangtrolpar(null);
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
            } else if (name.equals("petak_tersier")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$petak_tersier((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
                }
            } else if (name.equals("panjang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$panjang((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'panjang' to null.");
                }
            } else if (name.equals("lebar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lebar((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lebar' to null.");
                }
            } else if (name.equals("tinggi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tinggi((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tinggi' to null.");
                }
            } else if (name.equals("ruas_sal")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ruas_sal((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ruas_sal' to null.");
                }
            } else if (name.equals("jum_pintu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jum_pintu((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jum_pintu' to null.");
                }
            } else if (name.equals("nm_jnsbang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_jnsbang((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_jnsbang(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nm_bangtrol'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.SaluranDetail copyOrUpdate(Realm realm, com.pusair.smopi.Model.SaluranDetail object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.SaluranDetail) cachedRealmObject;
        }

        com.pusair.smopi.Model.SaluranDetail realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
            SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
            long pkColumnIndex = columnInfo.nm_bangtrolIndex;
            String value = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrol();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.SaluranDetail copy(Realm realm, com.pusair.smopi.Model.SaluranDetail newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.SaluranDetail) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.SaluranDetail realmObject = realm.createObjectInternal(com.pusair.smopi.Model.SaluranDetail.class, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) newObject).realmGet$nm_bangtrol(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) newObject;
        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectCopy.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectCopy.realmSet$kd_saluran(realmObjectSource.realmGet$kd_saluran());
        realmObjectCopy.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectCopy.realmSet$kd_jnsbang(realmObjectSource.realmGet$kd_jnsbang());
        realmObjectCopy.realmSet$nm_bangtrolpar(realmObjectSource.realmGet$nm_bangtrolpar());
        realmObjectCopy.realmSet$tmt_bangtrolpar(realmObjectSource.realmGet$tmt_bangtrolpar());
        realmObjectCopy.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectCopy.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectCopy.realmSet$panjang(realmObjectSource.realmGet$panjang());
        realmObjectCopy.realmSet$lebar(realmObjectSource.realmGet$lebar());
        realmObjectCopy.realmSet$tinggi(realmObjectSource.realmGet$tinggi());
        realmObjectCopy.realmSet$ruas_sal(realmObjectSource.realmGet$ruas_sal());
        realmObjectCopy.realmSet$jum_pintu(realmObjectSource.realmGet$jum_pintu());
        realmObjectCopy.realmSet$nm_jnsbang(realmObjectSource.realmGet$nm_jnsbang());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.SaluranDetail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
        long tableNativePtr = table.getNativePtr();
        SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
        long pkColumnIndex = columnInfo.nm_bangtrolIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrol();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$urutan(), false);
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_jnsbangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_jnsbang(), false);
        String realmGet$nm_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrolpar();
        if (realmGet$nm_bangtrolpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, realmGet$nm_bangtrolpar, false);
        }
        String realmGet$tmt_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrolpar();
        if (realmGet$tmt_bangtrolpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, realmGet$tmt_bangtrolpar, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$hapus(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$panjang(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lebarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lebar(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tinggi(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_salIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$ruas_sal(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.jum_pintuIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$jum_pintu(), false);
        String realmGet$nm_jnsbang = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_jnsbang();
        if (realmGet$nm_jnsbang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, realmGet$nm_jnsbang, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
        long tableNativePtr = table.getNativePtr();
        SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
        long pkColumnIndex = columnInfo.nm_bangtrolIndex;
        com.pusair.smopi.Model.SaluranDetail object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.SaluranDetail) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrol();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$urutan(), false);
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_jnsbangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_jnsbang(), false);
            String realmGet$nm_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrolpar();
            if (realmGet$nm_bangtrolpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, realmGet$nm_bangtrolpar, false);
            }
            String realmGet$tmt_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrolpar();
            if (realmGet$tmt_bangtrolpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, realmGet$tmt_bangtrolpar, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$hapus(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$panjang(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lebarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lebar(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tinggi(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_salIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$ruas_sal(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.jum_pintuIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$jum_pintu(), false);
            String realmGet$nm_jnsbang = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_jnsbang();
            if (realmGet$nm_jnsbang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, realmGet$nm_jnsbang, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.SaluranDetail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
        long tableNativePtr = table.getNativePtr();
        SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
        long pkColumnIndex = columnInfo.nm_bangtrolIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrol();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$urutan(), false);
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }
        String realmGet$kd_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_saluran();
        if (realmGet$kd_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
        }
        String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_saluran();
        if (realmGet$tmt_saluran != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_jnsbangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_jnsbang(), false);
        String realmGet$nm_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrolpar();
        if (realmGet$nm_bangtrolpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, realmGet$nm_bangtrolpar, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrolpar();
        if (realmGet$tmt_bangtrolpar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, realmGet$tmt_bangtrolpar, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$hapus(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$panjang(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lebarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lebar(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tinggi(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ruas_salIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$ruas_sal(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.jum_pintuIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$jum_pintu(), false);
        String realmGet$nm_jnsbang = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_jnsbang();
        if (realmGet$nm_jnsbang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, realmGet$nm_jnsbang, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.SaluranDetail.class);
        long tableNativePtr = table.getNativePtr();
        SaluranDetailColumnInfo columnInfo = (SaluranDetailColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.SaluranDetail.class);
        long pkColumnIndex = columnInfo.nm_bangtrolIndex;
        com.pusair.smopi.Model.SaluranDetail object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.SaluranDetail) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrol();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$urutan(), false);
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }
            String realmGet$kd_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_saluran();
            if (realmGet$kd_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, realmGet$kd_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_saluranIndex, rowIndex, false);
            }
            String realmGet$tmt_saluran = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_saluran();
            if (realmGet$tmt_saluran != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, realmGet$tmt_saluran, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_saluranIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_jnsbangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$kd_jnsbang(), false);
            String realmGet$nm_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_bangtrolpar();
            if (realmGet$nm_bangtrolpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, realmGet$nm_bangtrolpar, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolparIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrolpar = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tmt_bangtrolpar();
            if (realmGet$tmt_bangtrolpar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, realmGet$tmt_bangtrolpar, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolparIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.hapusIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$hapus(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.panjangIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$panjang(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lebarIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$lebar(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tinggiIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$tinggi(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ruas_salIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$ruas_sal(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.jum_pintuIndex, rowIndex, ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$jum_pintu(), false);
            String realmGet$nm_jnsbang = ((com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) object).realmGet$nm_jnsbang();
            if (realmGet$nm_jnsbang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, realmGet$nm_jnsbang, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_jnsbangIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.SaluranDetail createDetachedCopy(com.pusair.smopi.Model.SaluranDetail realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.SaluranDetail unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.SaluranDetail();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.SaluranDetail) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.SaluranDetail) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface realmSource = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$nm_bangtrol(realmSource.realmGet$nm_bangtrol());
        unmanagedCopy.realmSet$urutan(realmSource.realmGet$urutan());
        unmanagedCopy.realmSet$tmt_bangtrol(realmSource.realmGet$tmt_bangtrol());
        unmanagedCopy.realmSet$kd_saluran(realmSource.realmGet$kd_saluran());
        unmanagedCopy.realmSet$tmt_saluran(realmSource.realmGet$tmt_saluran());
        unmanagedCopy.realmSet$kd_jnsbang(realmSource.realmGet$kd_jnsbang());
        unmanagedCopy.realmSet$nm_bangtrolpar(realmSource.realmGet$nm_bangtrolpar());
        unmanagedCopy.realmSet$tmt_bangtrolpar(realmSource.realmGet$tmt_bangtrolpar());
        unmanagedCopy.realmSet$hapus(realmSource.realmGet$hapus());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$petak_tersier(realmSource.realmGet$petak_tersier());
        unmanagedCopy.realmSet$panjang(realmSource.realmGet$panjang());
        unmanagedCopy.realmSet$lebar(realmSource.realmGet$lebar());
        unmanagedCopy.realmSet$tinggi(realmSource.realmGet$tinggi());
        unmanagedCopy.realmSet$ruas_sal(realmSource.realmGet$ruas_sal());
        unmanagedCopy.realmSet$jum_pintu(realmSource.realmGet$jum_pintu());
        unmanagedCopy.realmSet$nm_jnsbang(realmSource.realmGet$nm_jnsbang());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.SaluranDetail update(Realm realm, com.pusair.smopi.Model.SaluranDetail realmObject, com.pusair.smopi.Model.SaluranDetail newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_SaluranDetailRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_SaluranDetailRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectTarget.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectTarget.realmSet$kd_saluran(realmObjectSource.realmGet$kd_saluran());
        realmObjectTarget.realmSet$tmt_saluran(realmObjectSource.realmGet$tmt_saluran());
        realmObjectTarget.realmSet$kd_jnsbang(realmObjectSource.realmGet$kd_jnsbang());
        realmObjectTarget.realmSet$nm_bangtrolpar(realmObjectSource.realmGet$nm_bangtrolpar());
        realmObjectTarget.realmSet$tmt_bangtrolpar(realmObjectSource.realmGet$tmt_bangtrolpar());
        realmObjectTarget.realmSet$hapus(realmObjectSource.realmGet$hapus());
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lon(realmObjectSource.realmGet$lon());
        realmObjectTarget.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectTarget.realmSet$panjang(realmObjectSource.realmGet$panjang());
        realmObjectTarget.realmSet$lebar(realmObjectSource.realmGet$lebar());
        realmObjectTarget.realmSet$tinggi(realmObjectSource.realmGet$tinggi());
        realmObjectTarget.realmSet$ruas_sal(realmObjectSource.realmGet$ruas_sal());
        realmObjectTarget.realmSet$jum_pintu(realmObjectSource.realmGet$jum_pintu());
        realmObjectTarget.realmSet$nm_jnsbang(realmObjectSource.realmGet$nm_jnsbang());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SaluranDetail = proxy[");
        stringBuilder.append("{nm_bangtrol:");
        stringBuilder.append(realmGet$nm_bangtrol() != null ? realmGet$nm_bangtrol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urutan:");
        stringBuilder.append(realmGet$urutan());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_bangtrol:");
        stringBuilder.append(realmGet$tmt_bangtrol() != null ? realmGet$tmt_bangtrol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_saluran:");
        stringBuilder.append(realmGet$kd_saluran() != null ? realmGet$kd_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_saluran:");
        stringBuilder.append(realmGet$tmt_saluran() != null ? realmGet$tmt_saluran() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_jnsbang:");
        stringBuilder.append(realmGet$kd_jnsbang());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_bangtrolpar:");
        stringBuilder.append(realmGet$nm_bangtrolpar() != null ? realmGet$nm_bangtrolpar() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt_bangtrolpar:");
        stringBuilder.append(realmGet$tmt_bangtrolpar() != null ? realmGet$tmt_bangtrolpar() : "null");
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
        stringBuilder.append("{petak_tersier:");
        stringBuilder.append(realmGet$petak_tersier());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{panjang:");
        stringBuilder.append(realmGet$panjang());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lebar:");
        stringBuilder.append(realmGet$lebar());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tinggi:");
        stringBuilder.append(realmGet$tinggi());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ruas_sal:");
        stringBuilder.append(realmGet$ruas_sal());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jum_pintu:");
        stringBuilder.append(realmGet$jum_pintu());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_jnsbang:");
        stringBuilder.append(realmGet$nm_jnsbang() != null ? realmGet$nm_jnsbang() : "null");
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
        com_pusair_smopi_Model_SaluranDetailRealmProxy aSaluranDetail = (com_pusair_smopi_Model_SaluranDetailRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSaluranDetail.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSaluranDetail.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSaluranDetail.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
