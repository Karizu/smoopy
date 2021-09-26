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
public class com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy extends com.pusair.smopi.Model.PodaLaporanDaerahIrigasi
    implements RealmObjectProxy, com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface {

    static final class PodaLaporanDaerahIrigasiColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_diIndex;
        long tmt_diIndex;
        long periodaIndex;
        long tmtIndex;

        PodaLaporanDaerahIrigasiColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PodaLaporanDaerahIrigasi");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_diIndex = addColumnDetails("kd_di", "kd_di", objectSchemaInfo);
            this.tmt_diIndex = addColumnDetails("tmt_di", "tmt_di", objectSchemaInfo);
            this.periodaIndex = addColumnDetails("perioda", "perioda", objectSchemaInfo);
            this.tmtIndex = addColumnDetails("tmt", "tmt", objectSchemaInfo);
        }

        PodaLaporanDaerahIrigasiColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PodaLaporanDaerahIrigasiColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PodaLaporanDaerahIrigasiColumnInfo src = (PodaLaporanDaerahIrigasiColumnInfo) rawSrc;
            final PodaLaporanDaerahIrigasiColumnInfo dst = (PodaLaporanDaerahIrigasiColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_diIndex = src.kd_diIndex;
            dst.tmt_diIndex = src.tmt_diIndex;
            dst.periodaIndex = src.periodaIndex;
            dst.tmtIndex = src.tmtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PodaLaporanDaerahIrigasiColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.PodaLaporanDaerahIrigasi> proxyState;

    com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.PodaLaporanDaerahIrigasi>(this);
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
    public int realmGet$perioda() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.periodaIndex);
    }

    @Override
    public void realmSet$perioda(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.periodaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.periodaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tmt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tmtIndex);
    }

    @Override
    public void realmSet$tmt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tmtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tmtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tmtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tmtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PodaLaporanDaerahIrigasi", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("perioda", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tmt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PodaLaporanDaerahIrigasiColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PodaLaporanDaerahIrigasiColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PodaLaporanDaerahIrigasi";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PodaLaporanDaerahIrigasi";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
            PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface objProxy = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) obj;
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
        if (json.has("perioda")) {
            if (json.isNull("perioda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'perioda' to null.");
            } else {
                objProxy.realmSet$perioda((int) json.getInt("perioda"));
            }
        }
        if (json.has("tmt")) {
            if (json.isNull("tmt")) {
                objProxy.realmSet$tmt(null);
            } else {
                objProxy.realmSet$tmt((String) json.getString("tmt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.PodaLaporanDaerahIrigasi obj = new com.pusair.smopi.Model.PodaLaporanDaerahIrigasi();
        final com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface objProxy = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) obj;
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
            } else if (name.equals("tmt_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt_di(null);
                }
            } else if (name.equals("perioda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$perioda((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'perioda' to null.");
                }
            } else if (name.equals("tmt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tmt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tmt(null);
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

    public static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi copyOrUpdate(Realm realm, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) cachedRealmObject;
        }

        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
            PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi copy(Realm realm, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi realmObject = realm.createObjectInternal(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class, ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) newObject;
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectCopy.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectCopy.realmSet$perioda(realmObjectSource.realmGet$perioda());
        realmObjectCopy.realmSet$tmt(realmObjectSource.realmGet$tmt());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.periodaIndex, rowIndex, ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$perioda(), false);
        String realmGet$tmt = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt();
        if (realmGet$tmt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmtIndex, rowIndex, realmGet$tmt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.periodaIndex, rowIndex, ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$perioda(), false);
            String realmGet$tmt = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt();
            if (realmGet$tmt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmtIndex, rowIndex, realmGet$tmt, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.periodaIndex, rowIndex, ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$perioda(), false);
        String realmGet$tmt = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt();
        if (realmGet$tmt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmtIndex, rowIndex, realmGet$tmt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long tableNativePtr = table.getNativePtr();
        PodaLaporanDaerahIrigasiColumnInfo columnInfo = (PodaLaporanDaerahIrigasiColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.periodaIndex, rowIndex, ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$perioda(), false);
            String realmGet$tmt = ((com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) object).realmGet$tmt();
            if (realmGet$tmt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmtIndex, rowIndex, realmGet$tmt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmtIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi createDetachedCopy(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.PodaLaporanDaerahIrigasi unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.PodaLaporanDaerahIrigasi();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface realmSource = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_di(realmSource.realmGet$kd_di());
        unmanagedCopy.realmSet$tmt_di(realmSource.realmGet$tmt_di());
        unmanagedCopy.realmSet$perioda(realmSource.realmGet$perioda());
        unmanagedCopy.realmSet$tmt(realmSource.realmGet$tmt());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.PodaLaporanDaerahIrigasi update(Realm realm, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi realmObject, com.pusair.smopi.Model.PodaLaporanDaerahIrigasi newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectTarget.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectTarget.realmSet$perioda(realmObjectSource.realmGet$perioda());
        realmObjectTarget.realmSet$tmt(realmObjectSource.realmGet$tmt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PodaLaporanDaerahIrigasi = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
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
        stringBuilder.append("{perioda:");
        stringBuilder.append(realmGet$perioda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tmt:");
        stringBuilder.append(realmGet$tmt() != null ? realmGet$tmt() : "null");
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
        com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy aPodaLaporanDaerahIrigasi = (com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPodaLaporanDaerahIrigasi.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPodaLaporanDaerahIrigasi.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPodaLaporanDaerahIrigasi.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
