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
public class com_pusair_smopi_Model_JenisKeadaanRealmProxy extends com.pusair.smopi.Model.JenisKeadaan
    implements RealmObjectProxy, com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface {

    static final class JenisKeadaanColumnInfo extends ColumnInfo {
        long jns_keadaanIndex;
        long nm_keadaanIndex;

        JenisKeadaanColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("JenisKeadaan");
            this.jns_keadaanIndex = addColumnDetails("jns_keadaan", "jns_keadaan", objectSchemaInfo);
            this.nm_keadaanIndex = addColumnDetails("nm_keadaan", "nm_keadaan", objectSchemaInfo);
        }

        JenisKeadaanColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new JenisKeadaanColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final JenisKeadaanColumnInfo src = (JenisKeadaanColumnInfo) rawSrc;
            final JenisKeadaanColumnInfo dst = (JenisKeadaanColumnInfo) rawDst;
            dst.jns_keadaanIndex = src.jns_keadaanIndex;
            dst.nm_keadaanIndex = src.nm_keadaanIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private JenisKeadaanColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.JenisKeadaan> proxyState;

    com_pusair_smopi_Model_JenisKeadaanRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (JenisKeadaanColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.JenisKeadaan>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$jns_keadaan() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.jns_keadaanIndex);
    }

    @Override
    public void realmSet$jns_keadaan(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'jns_keadaan' cannot be changed after object was created.");
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("JenisKeadaan", 2, 0);
        builder.addPersistedProperty("jns_keadaan", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_keadaan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static JenisKeadaanColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new JenisKeadaanColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "JenisKeadaan";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "JenisKeadaan";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.JenisKeadaan createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.JenisKeadaan obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
            JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
            long pkColumnIndex = columnInfo.jns_keadaanIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("jns_keadaan")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("jns_keadaan"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("jns_keadaan")) {
                if (json.isNull("jns_keadaan")) {
                    obj = (io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.JenisKeadaan.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.JenisKeadaan.class, json.getInt("jns_keadaan"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'jns_keadaan'.");
            }
        }

        final com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface objProxy = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) obj;
        if (json.has("nm_keadaan")) {
            if (json.isNull("nm_keadaan")) {
                objProxy.realmSet$nm_keadaan(null);
            } else {
                objProxy.realmSet$nm_keadaan((String) json.getString("nm_keadaan"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.JenisKeadaan createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.JenisKeadaan obj = new com.pusair.smopi.Model.JenisKeadaan();
        final com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface objProxy = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("jns_keadaan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jns_keadaan((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jns_keadaan' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nm_keadaan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_keadaan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_keadaan(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'jns_keadaan'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.JenisKeadaan copyOrUpdate(Realm realm, com.pusair.smopi.Model.JenisKeadaan object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.JenisKeadaan) cachedRealmObject;
        }

        com.pusair.smopi.Model.JenisKeadaan realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
            JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
            long pkColumnIndex = columnInfo.jns_keadaanIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.JenisKeadaan copy(Realm realm, com.pusair.smopi.Model.JenisKeadaan newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.JenisKeadaan) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.JenisKeadaan realmObject = realm.createObjectInternal(com.pusair.smopi.Model.JenisKeadaan.class, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) newObject).realmGet$jns_keadaan(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) newObject;
        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$nm_keadaan(realmObjectSource.realmGet$nm_keadaan());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.JenisKeadaan object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
        long tableNativePtr = table.getNativePtr();
        JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
        long pkColumnIndex = columnInfo.jns_keadaanIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$nm_keadaan = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$nm_keadaan();
        if (realmGet$nm_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
        long tableNativePtr = table.getNativePtr();
        JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
        long pkColumnIndex = columnInfo.jns_keadaanIndex;
        com.pusair.smopi.Model.JenisKeadaan object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.JenisKeadaan) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$nm_keadaan = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$nm_keadaan();
            if (realmGet$nm_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.JenisKeadaan object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
        long tableNativePtr = table.getNativePtr();
        JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
        long pkColumnIndex = columnInfo.jns_keadaanIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
        }
        cache.put(object, rowIndex);
        String realmGet$nm_keadaan = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$nm_keadaan();
        if (realmGet$nm_keadaan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.JenisKeadaan.class);
        long tableNativePtr = table.getNativePtr();
        JenisKeadaanColumnInfo columnInfo = (JenisKeadaanColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.JenisKeadaan.class);
        long pkColumnIndex = columnInfo.jns_keadaanIndex;
        com.pusair.smopi.Model.JenisKeadaan object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.JenisKeadaan) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$jns_keadaan());
            }
            cache.put(object, rowIndex);
            String realmGet$nm_keadaan = ((com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) object).realmGet$nm_keadaan();
            if (realmGet$nm_keadaan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, realmGet$nm_keadaan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_keadaanIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.JenisKeadaan createDetachedCopy(com.pusair.smopi.Model.JenisKeadaan realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.JenisKeadaan unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.JenisKeadaan();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.JenisKeadaan) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.JenisKeadaan) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface realmSource = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$jns_keadaan(realmSource.realmGet$jns_keadaan());
        unmanagedCopy.realmSet$nm_keadaan(realmSource.realmGet$nm_keadaan());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.JenisKeadaan update(Realm realm, com.pusair.smopi.Model.JenisKeadaan realmObject, com.pusair.smopi.Model.JenisKeadaan newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_JenisKeadaanRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$nm_keadaan(realmObjectSource.realmGet$nm_keadaan());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("JenisKeadaan = proxy[");
        stringBuilder.append("{jns_keadaan:");
        stringBuilder.append(realmGet$jns_keadaan());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_keadaan:");
        stringBuilder.append(realmGet$nm_keadaan() != null ? realmGet$nm_keadaan() : "null");
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
        com_pusair_smopi_Model_JenisKeadaanRealmProxy aJenisKeadaan = (com_pusair_smopi_Model_JenisKeadaanRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aJenisKeadaan.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aJenisKeadaan.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aJenisKeadaan.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
