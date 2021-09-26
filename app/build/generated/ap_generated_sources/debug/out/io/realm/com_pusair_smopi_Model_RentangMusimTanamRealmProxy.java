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
public class com_pusair_smopi_Model_RentangMusimTanamRealmProxy extends com.pusair.smopi.Model.RentangMusimTanam
    implements RealmObjectProxy, com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface {

    static final class RentangMusimTanamColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_diIndex;
        long tmt_diIndex;
        long kd_mtIndex;
        long blnawIndex;
        long thnawIndex;
        long blnakIndex;
        long thnakIndex;
        long podawIndex;
        long podakIndex;

        RentangMusimTanamColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RentangMusimTanam");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_diIndex = addColumnDetails("kd_di", "kd_di", objectSchemaInfo);
            this.tmt_diIndex = addColumnDetails("tmt_di", "tmt_di", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.blnawIndex = addColumnDetails("blnaw", "blnaw", objectSchemaInfo);
            this.thnawIndex = addColumnDetails("thnaw", "thnaw", objectSchemaInfo);
            this.blnakIndex = addColumnDetails("blnak", "blnak", objectSchemaInfo);
            this.thnakIndex = addColumnDetails("thnak", "thnak", objectSchemaInfo);
            this.podawIndex = addColumnDetails("podaw", "podaw", objectSchemaInfo);
            this.podakIndex = addColumnDetails("podak", "podak", objectSchemaInfo);
        }

        RentangMusimTanamColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RentangMusimTanamColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RentangMusimTanamColumnInfo src = (RentangMusimTanamColumnInfo) rawSrc;
            final RentangMusimTanamColumnInfo dst = (RentangMusimTanamColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_diIndex = src.kd_diIndex;
            dst.tmt_diIndex = src.tmt_diIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.blnawIndex = src.blnawIndex;
            dst.thnawIndex = src.thnawIndex;
            dst.blnakIndex = src.blnakIndex;
            dst.thnakIndex = src.thnakIndex;
            dst.podawIndex = src.podawIndex;
            dst.podakIndex = src.podakIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RentangMusimTanamColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.RentangMusimTanam> proxyState;

    com_pusair_smopi_Model_RentangMusimTanamRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RentangMusimTanamColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.RentangMusimTanam>(this);
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
    public int realmGet$blnaw() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.blnawIndex);
    }

    @Override
    public void realmSet$blnaw(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.blnawIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.blnawIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thnaw() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thnawIndex);
    }

    @Override
    public void realmSet$thnaw(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thnawIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thnawIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thnawIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thnawIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$blnak() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.blnakIndex);
    }

    @Override
    public void realmSet$blnak(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.blnakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.blnakIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thnak() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thnakIndex);
    }

    @Override
    public void realmSet$thnak(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thnakIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thnakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thnakIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thnakIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$podaw() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.podawIndex);
    }

    @Override
    public void realmSet$podaw(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.podawIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.podawIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$podak() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.podakIndex);
    }

    @Override
    public void realmSet$podak(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.podakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.podakIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RentangMusimTanam", 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("blnaw", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thnaw", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("blnak", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thnak", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("podaw", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("podak", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentangMusimTanamColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RentangMusimTanamColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RentangMusimTanam";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentangMusimTanam";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.RentangMusimTanam createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.RentangMusimTanam obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
            RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.RentangMusimTanam.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.RentangMusimTanam.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface objProxy = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) obj;
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
        if (json.has("kd_mt")) {
            if (json.isNull("kd_mt")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
            } else {
                objProxy.realmSet$kd_mt((int) json.getInt("kd_mt"));
            }
        }
        if (json.has("blnaw")) {
            if (json.isNull("blnaw")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'blnaw' to null.");
            } else {
                objProxy.realmSet$blnaw((int) json.getInt("blnaw"));
            }
        }
        if (json.has("thnaw")) {
            if (json.isNull("thnaw")) {
                objProxy.realmSet$thnaw(null);
            } else {
                objProxy.realmSet$thnaw((String) json.getString("thnaw"));
            }
        }
        if (json.has("blnak")) {
            if (json.isNull("blnak")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'blnak' to null.");
            } else {
                objProxy.realmSet$blnak((int) json.getInt("blnak"));
            }
        }
        if (json.has("thnak")) {
            if (json.isNull("thnak")) {
                objProxy.realmSet$thnak(null);
            } else {
                objProxy.realmSet$thnak((String) json.getString("thnak"));
            }
        }
        if (json.has("podaw")) {
            if (json.isNull("podaw")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'podaw' to null.");
            } else {
                objProxy.realmSet$podaw((int) json.getInt("podaw"));
            }
        }
        if (json.has("podak")) {
            if (json.isNull("podak")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'podak' to null.");
            } else {
                objProxy.realmSet$podak((int) json.getInt("podak"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.RentangMusimTanam createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.RentangMusimTanam obj = new com.pusair.smopi.Model.RentangMusimTanam();
        final com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface objProxy = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) obj;
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
            } else if (name.equals("kd_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_mt((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
                }
            } else if (name.equals("blnaw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blnaw((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'blnaw' to null.");
                }
            } else if (name.equals("thnaw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thnaw((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thnaw(null);
                }
            } else if (name.equals("blnak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blnak((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'blnak' to null.");
                }
            } else if (name.equals("thnak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thnak((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thnak(null);
                }
            } else if (name.equals("podaw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$podaw((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'podaw' to null.");
                }
            } else if (name.equals("podak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$podak((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'podak' to null.");
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

    public static com.pusair.smopi.Model.RentangMusimTanam copyOrUpdate(Realm realm, com.pusair.smopi.Model.RentangMusimTanam object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.RentangMusimTanam) cachedRealmObject;
        }

        com.pusair.smopi.Model.RentangMusimTanam realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
            RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.RentangMusimTanam copy(Realm realm, com.pusair.smopi.Model.RentangMusimTanam newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.RentangMusimTanam) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.RentangMusimTanam realmObject = realm.createObjectInternal(com.pusair.smopi.Model.RentangMusimTanam.class, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) newObject;
        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectCopy.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$blnaw(realmObjectSource.realmGet$blnaw());
        realmObjectCopy.realmSet$thnaw(realmObjectSource.realmGet$thnaw());
        realmObjectCopy.realmSet$blnak(realmObjectSource.realmGet$blnak());
        realmObjectCopy.realmSet$thnak(realmObjectSource.realmGet$thnak());
        realmObjectCopy.realmSet$podaw(realmObjectSource.realmGet$podaw());
        realmObjectCopy.realmSet$podak(realmObjectSource.realmGet$podak());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.RentangMusimTanam object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_mt(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.blnawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnaw(), false);
        String realmGet$thnaw = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnaw();
        if (realmGet$thnaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thnawIndex, rowIndex, realmGet$thnaw, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.blnakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnak(), false);
        String realmGet$thnak = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnak();
        if (realmGet$thnak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thnakIndex, rowIndex, realmGet$thnak, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.podawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podaw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.podakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podak(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.RentangMusimTanam object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.RentangMusimTanam) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_mt(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.blnawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnaw(), false);
            String realmGet$thnaw = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnaw();
            if (realmGet$thnaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thnawIndex, rowIndex, realmGet$thnaw, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.blnakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnak(), false);
            String realmGet$thnak = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnak();
            if (realmGet$thnak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thnakIndex, rowIndex, realmGet$thnak, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.podawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podaw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.podakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podak(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.RentangMusimTanam object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_mt(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.blnawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnaw(), false);
        String realmGet$thnaw = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnaw();
        if (realmGet$thnaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thnawIndex, rowIndex, realmGet$thnaw, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thnawIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.blnakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnak(), false);
        String realmGet$thnak = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnak();
        if (realmGet$thnak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thnakIndex, rowIndex, realmGet$thnak, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thnakIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.podawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podaw(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.podakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podak(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.RentangMusimTanam.class);
        long tableNativePtr = table.getNativePtr();
        RentangMusimTanamColumnInfo columnInfo = (RentangMusimTanamColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.RentangMusimTanam.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.RentangMusimTanam object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.RentangMusimTanam) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$kd_mt(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.blnawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnaw(), false);
            String realmGet$thnaw = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnaw();
            if (realmGet$thnaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thnawIndex, rowIndex, realmGet$thnaw, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thnawIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.blnakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$blnak(), false);
            String realmGet$thnak = ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$thnak();
            if (realmGet$thnak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thnakIndex, rowIndex, realmGet$thnak, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thnakIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.podawIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podaw(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.podakIndex, rowIndex, ((com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) object).realmGet$podak(), false);
        }
    }

    public static com.pusair.smopi.Model.RentangMusimTanam createDetachedCopy(com.pusair.smopi.Model.RentangMusimTanam realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.RentangMusimTanam unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.RentangMusimTanam();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.RentangMusimTanam) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.RentangMusimTanam) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface realmSource = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_di(realmSource.realmGet$kd_di());
        unmanagedCopy.realmSet$tmt_di(realmSource.realmGet$tmt_di());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$blnaw(realmSource.realmGet$blnaw());
        unmanagedCopy.realmSet$thnaw(realmSource.realmGet$thnaw());
        unmanagedCopy.realmSet$blnak(realmSource.realmGet$blnak());
        unmanagedCopy.realmSet$thnak(realmSource.realmGet$thnak());
        unmanagedCopy.realmSet$podaw(realmSource.realmGet$podaw());
        unmanagedCopy.realmSet$podak(realmSource.realmGet$podak());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.RentangMusimTanam update(Realm realm, com.pusair.smopi.Model.RentangMusimTanam realmObject, com.pusair.smopi.Model.RentangMusimTanam newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_RentangMusimTanamRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectTarget.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$blnaw(realmObjectSource.realmGet$blnaw());
        realmObjectTarget.realmSet$thnaw(realmObjectSource.realmGet$thnaw());
        realmObjectTarget.realmSet$blnak(realmObjectSource.realmGet$blnak());
        realmObjectTarget.realmSet$thnak(realmObjectSource.realmGet$thnak());
        realmObjectTarget.realmSet$podaw(realmObjectSource.realmGet$podaw());
        realmObjectTarget.realmSet$podak(realmObjectSource.realmGet$podak());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RentangMusimTanam = proxy[");
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
        stringBuilder.append("{kd_mt:");
        stringBuilder.append(realmGet$kd_mt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blnaw:");
        stringBuilder.append(realmGet$blnaw());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thnaw:");
        stringBuilder.append(realmGet$thnaw() != null ? realmGet$thnaw() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blnak:");
        stringBuilder.append(realmGet$blnak());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thnak:");
        stringBuilder.append(realmGet$thnak() != null ? realmGet$thnak() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{podaw:");
        stringBuilder.append(realmGet$podaw());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{podak:");
        stringBuilder.append(realmGet$podak());
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
        com_pusair_smopi_Model_RentangMusimTanamRealmProxy aRentangMusimTanam = (com_pusair_smopi_Model_RentangMusimTanamRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRentangMusimTanam.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRentangMusimTanam.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRentangMusimTanam.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
