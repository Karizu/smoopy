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
public class com_pusair_smopi_Model_MusimTanamRealmProxy extends com.pusair.smopi.Model.MusimTanam
    implements RealmObjectProxy, com_pusair_smopi_Model_MusimTanamRealmProxyInterface {

    static final class MusimTanamColumnInfo extends ColumnInfo {
        long kd_mtIndex;
        long thn_mtIndex;

        MusimTanamColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MusimTanam");
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.thn_mtIndex = addColumnDetails("thn_mt", "thn_mt", objectSchemaInfo);
        }

        MusimTanamColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MusimTanamColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MusimTanamColumnInfo src = (MusimTanamColumnInfo) rawSrc;
            final MusimTanamColumnInfo dst = (MusimTanamColumnInfo) rawDst;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.thn_mtIndex = src.thn_mtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MusimTanamColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.MusimTanam> proxyState;

    com_pusair_smopi_Model_MusimTanamRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MusimTanamColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.MusimTanam>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'kd_mt' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thn_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thn_mtIndex);
    }

    @Override
    public void realmSet$thn_mt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thn_mtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thn_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thn_mtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thn_mtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MusimTanam", 2, 0);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thn_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MusimTanamColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MusimTanamColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MusimTanam";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MusimTanam";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.MusimTanam createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.MusimTanam obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
            MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
            long pkColumnIndex = columnInfo.kd_mtIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("kd_mt")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("kd_mt"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("kd_mt")) {
                if (json.isNull("kd_mt")) {
                    obj = (io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.MusimTanam.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.MusimTanam.class, json.getInt("kd_mt"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_mt'.");
            }
        }

        final com_pusair_smopi_Model_MusimTanamRealmProxyInterface objProxy = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) obj;
        if (json.has("thn_mt")) {
            if (json.isNull("thn_mt")) {
                objProxy.realmSet$thn_mt(null);
            } else {
                objProxy.realmSet$thn_mt((String) json.getString("thn_mt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.MusimTanam createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.MusimTanam obj = new com.pusair.smopi.Model.MusimTanam();
        final com_pusair_smopi_Model_MusimTanamRealmProxyInterface objProxy = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("kd_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_mt((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("thn_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thn_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thn_mt(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_mt'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.MusimTanam copyOrUpdate(Realm realm, com.pusair.smopi.Model.MusimTanam object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.MusimTanam) cachedRealmObject;
        }

        com.pusair.smopi.Model.MusimTanam realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
            MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
            long pkColumnIndex = columnInfo.kd_mtIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.MusimTanam copy(Realm realm, com.pusair.smopi.Model.MusimTanam newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.MusimTanam) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.MusimTanam realmObject = realm.createObjectInternal(com.pusair.smopi.Model.MusimTanam.class, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) newObject).realmGet$kd_mt(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_MusimTanamRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) newObject;
        com_pusair_smopi_Model_MusimTanamRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$thn_mt(realmObjectSource.realmGet$thn_mt());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.MusimTanam object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
        long pkColumnIndex = columnInfo.kd_mtIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$thn_mt = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$thn_mt();
        if (realmGet$thn_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, realmGet$thn_mt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
        long pkColumnIndex = columnInfo.kd_mtIndex;
        com.pusair.smopi.Model.MusimTanam object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.MusimTanam) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$thn_mt = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$thn_mt();
            if (realmGet$thn_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, realmGet$thn_mt, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.MusimTanam object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
        long pkColumnIndex = columnInfo.kd_mtIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
        }
        cache.put(object, rowIndex);
        String realmGet$thn_mt = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$thn_mt();
        if (realmGet$thn_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, realmGet$thn_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.MusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        MusimTanamColumnInfo columnInfo = (MusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.MusimTanam.class);
        long pkColumnIndex = columnInfo.kd_mtIndex;
        com.pusair.smopi.Model.MusimTanam object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.MusimTanam) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$kd_mt());
            }
            cache.put(object, rowIndex);
            String realmGet$thn_mt = ((com_pusair_smopi_Model_MusimTanamRealmProxyInterface) object).realmGet$thn_mt();
            if (realmGet$thn_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, realmGet$thn_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thn_mtIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.MusimTanam createDetachedCopy(com.pusair.smopi.Model.MusimTanam realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.MusimTanam unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.MusimTanam();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.MusimTanam) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.MusimTanam) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_MusimTanamRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_MusimTanamRealmProxyInterface realmSource = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$thn_mt(realmSource.realmGet$thn_mt());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.MusimTanam update(Realm realm, com.pusair.smopi.Model.MusimTanam realmObject, com.pusair.smopi.Model.MusimTanam newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_MusimTanamRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_MusimTanamRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_MusimTanamRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$thn_mt(realmObjectSource.realmGet$thn_mt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MusimTanam = proxy[");
        stringBuilder.append("{kd_mt:");
        stringBuilder.append(realmGet$kd_mt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thn_mt:");
        stringBuilder.append(realmGet$thn_mt() != null ? realmGet$thn_mt() : "null");
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
        com_pusair_smopi_Model_MusimTanamRealmProxy aMusimTanam = (com_pusair_smopi_Model_MusimTanamRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMusimTanam.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMusimTanam.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMusimTanam.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
