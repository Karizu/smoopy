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
public class com_pusair_smopi_Model_GroupIp3aRealmProxy extends com.pusair.smopi.Model.GroupIp3a
    implements RealmObjectProxy, com_pusair_smopi_Model_GroupIp3aRealmProxyInterface {

    static final class GroupIp3aColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_orgIndex;
        long luas_swiriIndex;
        long tgleditIndex;

        GroupIp3aColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GroupIp3a");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_orgIndex = addColumnDetails("kd_org", "kd_org", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
        }

        GroupIp3aColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupIp3aColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupIp3aColumnInfo src = (GroupIp3aColumnInfo) rawSrc;
            final GroupIp3aColumnInfo dst = (GroupIp3aColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_orgIndex = src.kd_orgIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.tgleditIndex = src.tgleditIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupIp3aColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.GroupIp3a> proxyState;

    com_pusair_smopi_Model_GroupIp3aRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupIp3aColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.GroupIp3a>(this);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("GroupIp3a", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_org", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupIp3aColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupIp3aColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GroupIp3a";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GroupIp3a";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.GroupIp3a createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.GroupIp3a obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
            GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.GroupIp3a.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.GroupIp3a.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_GroupIp3aRealmProxyInterface objProxy = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) obj;
        if (json.has("kd_staf")) {
            if (json.isNull("kd_staf")) {
                objProxy.realmSet$kd_staf(null);
            } else {
                objProxy.realmSet$kd_staf((String) json.getString("kd_staf"));
            }
        }
        if (json.has("kd_org")) {
            if (json.isNull("kd_org")) {
                objProxy.realmSet$kd_org(null);
            } else {
                objProxy.realmSet$kd_org((String) json.getString("kd_org"));
            }
        }
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.GroupIp3a createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.GroupIp3a obj = new com.pusair.smopi.Model.GroupIp3a();
        final com_pusair_smopi_Model_GroupIp3aRealmProxyInterface objProxy = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) obj;
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
            } else if (name.equals("kd_org")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_org((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_org(null);
                }
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
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

    public static com.pusair.smopi.Model.GroupIp3a copyOrUpdate(Realm realm, com.pusair.smopi.Model.GroupIp3a object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.GroupIp3a) cachedRealmObject;
        }

        com.pusair.smopi.Model.GroupIp3a realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
            GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.GroupIp3a copy(Realm realm, com.pusair.smopi.Model.GroupIp3a newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.GroupIp3a) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.GroupIp3a realmObject = realm.createObjectInternal(com.pusair.smopi.Model.GroupIp3a.class, ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) newObject;
        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_org(realmObjectSource.realmGet$kd_org());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.GroupIp3a object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
        long tableNativePtr = table.getNativePtr();
        GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        String realmGet$kd_org = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_org();
        if (realmGet$kd_org != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
        long tableNativePtr = table.getNativePtr();
        GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.GroupIp3a object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.GroupIp3a) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            String realmGet$kd_org = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_org();
            if (realmGet$kd_org != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.GroupIp3a object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
        long tableNativePtr = table.getNativePtr();
        GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        String realmGet$kd_org = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_org();
        if (realmGet$kd_org != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.GroupIp3a.class);
        long tableNativePtr = table.getNativePtr();
        GroupIp3aColumnInfo columnInfo = (GroupIp3aColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.GroupIp3a.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.GroupIp3a object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.GroupIp3a) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            String realmGet$kd_org = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$kd_org();
            if (realmGet$kd_org != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, realmGet$kd_org, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_orgIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.GroupIp3a createDetachedCopy(com.pusair.smopi.Model.GroupIp3a realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.GroupIp3a unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.GroupIp3a();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.GroupIp3a) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.GroupIp3a) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface realmSource = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_org(realmSource.realmGet$kd_org());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.GroupIp3a update(Realm realm, com.pusair.smopi.Model.GroupIp3a realmObject, com.pusair.smopi.Model.GroupIp3a newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_GroupIp3aRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_GroupIp3aRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_org(realmObjectSource.realmGet$kd_org());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("GroupIp3a = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_staf:");
        stringBuilder.append(realmGet$kd_staf() != null ? realmGet$kd_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_org:");
        stringBuilder.append(realmGet$kd_org() != null ? realmGet$kd_org() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
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
        com_pusair_smopi_Model_GroupIp3aRealmProxy aGroupIp3a = (com_pusair_smopi_Model_GroupIp3aRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGroupIp3a.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroupIp3a.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGroupIp3a.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
