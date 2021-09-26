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
public class com_pusair_smopi_Model_Blanko06RealmProxy extends com.pusair.smopi.Model.Blanko06
    implements RealmObjectProxy, com_pusair_smopi_Model_Blanko06RealmProxyInterface {

    static final class Blanko06ColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_mtIndex;
        long thblnIndex;
        long nm_bangtrolIndex;
        long tmt_bangtrolIndex;
        long urutanIndex;
        long tg01Index;
        long tg02Index;
        long tg03Index;
        long tg04Index;
        long tg05Index;
        long tg06Index;
        long tg07Index;
        long tg08Index;
        long tg09Index;
        long tg10Index;
        long tg11Index;
        long tg12Index;
        long tg13Index;
        long tg14Index;
        long tg15Index;
        long tg16Index;
        long tg17Index;
        long tg18Index;
        long tg19Index;
        long tg20Index;
        long tg21Index;
        long tg22Index;
        long tg23Index;
        long tg24Index;
        long tg25Index;
        long tg26Index;
        long tg27Index;
        long tg28Index;
        long tg29Index;
        long tg30Index;
        long tg31Index;
        long jdebit1Index;
        long rata1Index;
        long rata2Index;
        long rata3Index;
        long rata4Index;
        long cara_ukur1Index;
        long cara_ukur2Index;
        long cara_ukur3Index;
        long cara_ukur4Index;
        long kon_ukur1Index;
        long kon_ukur2Index;
        long kon_ukur3Index;
        long kon_ukur4Index;
        long jdebit2Index;
        long jdebit3Index;
        long jdebit4Index;
        long qlIndex;
        long ql1Index;
        long ql2Index;
        long ql3Index;
        long ql4Index;
        long qhIndex;
        long qh1Index;
        long qh2Index;
        long qh3Index;
        long qh4Index;
        long qsIndex;
        long qs1Index;
        long qs2Index;
        long qs3Index;
        long qs4Index;
        long pelaksanaIndex;
        long verifyIndex;
        long petak_tersierIndex;
        long petak_tersier_rcnIndex;
        long deleterecIndex;
        long flagIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;
        long tgleditIndex;

        Blanko06ColumnInfo(OsSchemaInfo schemaInfo) {
            super(81);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Blanko06");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.thblnIndex = addColumnDetails("thbln", "thbln", objectSchemaInfo);
            this.nm_bangtrolIndex = addColumnDetails("nm_bangtrol", "nm_bangtrol", objectSchemaInfo);
            this.tmt_bangtrolIndex = addColumnDetails("tmt_bangtrol", "tmt_bangtrol", objectSchemaInfo);
            this.urutanIndex = addColumnDetails("urutan", "urutan", objectSchemaInfo);
            this.tg01Index = addColumnDetails("tg01", "tg01", objectSchemaInfo);
            this.tg02Index = addColumnDetails("tg02", "tg02", objectSchemaInfo);
            this.tg03Index = addColumnDetails("tg03", "tg03", objectSchemaInfo);
            this.tg04Index = addColumnDetails("tg04", "tg04", objectSchemaInfo);
            this.tg05Index = addColumnDetails("tg05", "tg05", objectSchemaInfo);
            this.tg06Index = addColumnDetails("tg06", "tg06", objectSchemaInfo);
            this.tg07Index = addColumnDetails("tg07", "tg07", objectSchemaInfo);
            this.tg08Index = addColumnDetails("tg08", "tg08", objectSchemaInfo);
            this.tg09Index = addColumnDetails("tg09", "tg09", objectSchemaInfo);
            this.tg10Index = addColumnDetails("tg10", "tg10", objectSchemaInfo);
            this.tg11Index = addColumnDetails("tg11", "tg11", objectSchemaInfo);
            this.tg12Index = addColumnDetails("tg12", "tg12", objectSchemaInfo);
            this.tg13Index = addColumnDetails("tg13", "tg13", objectSchemaInfo);
            this.tg14Index = addColumnDetails("tg14", "tg14", objectSchemaInfo);
            this.tg15Index = addColumnDetails("tg15", "tg15", objectSchemaInfo);
            this.tg16Index = addColumnDetails("tg16", "tg16", objectSchemaInfo);
            this.tg17Index = addColumnDetails("tg17", "tg17", objectSchemaInfo);
            this.tg18Index = addColumnDetails("tg18", "tg18", objectSchemaInfo);
            this.tg19Index = addColumnDetails("tg19", "tg19", objectSchemaInfo);
            this.tg20Index = addColumnDetails("tg20", "tg20", objectSchemaInfo);
            this.tg21Index = addColumnDetails("tg21", "tg21", objectSchemaInfo);
            this.tg22Index = addColumnDetails("tg22", "tg22", objectSchemaInfo);
            this.tg23Index = addColumnDetails("tg23", "tg23", objectSchemaInfo);
            this.tg24Index = addColumnDetails("tg24", "tg24", objectSchemaInfo);
            this.tg25Index = addColumnDetails("tg25", "tg25", objectSchemaInfo);
            this.tg26Index = addColumnDetails("tg26", "tg26", objectSchemaInfo);
            this.tg27Index = addColumnDetails("tg27", "tg27", objectSchemaInfo);
            this.tg28Index = addColumnDetails("tg28", "tg28", objectSchemaInfo);
            this.tg29Index = addColumnDetails("tg29", "tg29", objectSchemaInfo);
            this.tg30Index = addColumnDetails("tg30", "tg30", objectSchemaInfo);
            this.tg31Index = addColumnDetails("tg31", "tg31", objectSchemaInfo);
            this.jdebit1Index = addColumnDetails("jdebit1", "jdebit1", objectSchemaInfo);
            this.rata1Index = addColumnDetails("rata1", "rata1", objectSchemaInfo);
            this.rata2Index = addColumnDetails("rata2", "rata2", objectSchemaInfo);
            this.rata3Index = addColumnDetails("rata3", "rata3", objectSchemaInfo);
            this.rata4Index = addColumnDetails("rata4", "rata4", objectSchemaInfo);
            this.cara_ukur1Index = addColumnDetails("cara_ukur1", "cara_ukur1", objectSchemaInfo);
            this.cara_ukur2Index = addColumnDetails("cara_ukur2", "cara_ukur2", objectSchemaInfo);
            this.cara_ukur3Index = addColumnDetails("cara_ukur3", "cara_ukur3", objectSchemaInfo);
            this.cara_ukur4Index = addColumnDetails("cara_ukur4", "cara_ukur4", objectSchemaInfo);
            this.kon_ukur1Index = addColumnDetails("kon_ukur1", "kon_ukur1", objectSchemaInfo);
            this.kon_ukur2Index = addColumnDetails("kon_ukur2", "kon_ukur2", objectSchemaInfo);
            this.kon_ukur3Index = addColumnDetails("kon_ukur3", "kon_ukur3", objectSchemaInfo);
            this.kon_ukur4Index = addColumnDetails("kon_ukur4", "kon_ukur4", objectSchemaInfo);
            this.jdebit2Index = addColumnDetails("jdebit2", "jdebit2", objectSchemaInfo);
            this.jdebit3Index = addColumnDetails("jdebit3", "jdebit3", objectSchemaInfo);
            this.jdebit4Index = addColumnDetails("jdebit4", "jdebit4", objectSchemaInfo);
            this.qlIndex = addColumnDetails("ql", "ql", objectSchemaInfo);
            this.ql1Index = addColumnDetails("ql1", "ql1", objectSchemaInfo);
            this.ql2Index = addColumnDetails("ql2", "ql2", objectSchemaInfo);
            this.ql3Index = addColumnDetails("ql3", "ql3", objectSchemaInfo);
            this.ql4Index = addColumnDetails("ql4", "ql4", objectSchemaInfo);
            this.qhIndex = addColumnDetails("qh", "qh", objectSchemaInfo);
            this.qh1Index = addColumnDetails("qh1", "qh1", objectSchemaInfo);
            this.qh2Index = addColumnDetails("qh2", "qh2", objectSchemaInfo);
            this.qh3Index = addColumnDetails("qh3", "qh3", objectSchemaInfo);
            this.qh4Index = addColumnDetails("qh4", "qh4", objectSchemaInfo);
            this.qsIndex = addColumnDetails("qs", "qs", objectSchemaInfo);
            this.qs1Index = addColumnDetails("qs1", "qs1", objectSchemaInfo);
            this.qs2Index = addColumnDetails("qs2", "qs2", objectSchemaInfo);
            this.qs3Index = addColumnDetails("qs3", "qs3", objectSchemaInfo);
            this.qs4Index = addColumnDetails("qs4", "qs4", objectSchemaInfo);
            this.pelaksanaIndex = addColumnDetails("pelaksana", "pelaksana", objectSchemaInfo);
            this.verifyIndex = addColumnDetails("verify", "verify", objectSchemaInfo);
            this.petak_tersierIndex = addColumnDetails("petak_tersier", "petak_tersier", objectSchemaInfo);
            this.petak_tersier_rcnIndex = addColumnDetails("petak_tersier_rcn", "petak_tersier_rcn", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
        }

        Blanko06ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Blanko06ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Blanko06ColumnInfo src = (Blanko06ColumnInfo) rawSrc;
            final Blanko06ColumnInfo dst = (Blanko06ColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.thblnIndex = src.thblnIndex;
            dst.nm_bangtrolIndex = src.nm_bangtrolIndex;
            dst.tmt_bangtrolIndex = src.tmt_bangtrolIndex;
            dst.urutanIndex = src.urutanIndex;
            dst.tg01Index = src.tg01Index;
            dst.tg02Index = src.tg02Index;
            dst.tg03Index = src.tg03Index;
            dst.tg04Index = src.tg04Index;
            dst.tg05Index = src.tg05Index;
            dst.tg06Index = src.tg06Index;
            dst.tg07Index = src.tg07Index;
            dst.tg08Index = src.tg08Index;
            dst.tg09Index = src.tg09Index;
            dst.tg10Index = src.tg10Index;
            dst.tg11Index = src.tg11Index;
            dst.tg12Index = src.tg12Index;
            dst.tg13Index = src.tg13Index;
            dst.tg14Index = src.tg14Index;
            dst.tg15Index = src.tg15Index;
            dst.tg16Index = src.tg16Index;
            dst.tg17Index = src.tg17Index;
            dst.tg18Index = src.tg18Index;
            dst.tg19Index = src.tg19Index;
            dst.tg20Index = src.tg20Index;
            dst.tg21Index = src.tg21Index;
            dst.tg22Index = src.tg22Index;
            dst.tg23Index = src.tg23Index;
            dst.tg24Index = src.tg24Index;
            dst.tg25Index = src.tg25Index;
            dst.tg26Index = src.tg26Index;
            dst.tg27Index = src.tg27Index;
            dst.tg28Index = src.tg28Index;
            dst.tg29Index = src.tg29Index;
            dst.tg30Index = src.tg30Index;
            dst.tg31Index = src.tg31Index;
            dst.jdebit1Index = src.jdebit1Index;
            dst.rata1Index = src.rata1Index;
            dst.rata2Index = src.rata2Index;
            dst.rata3Index = src.rata3Index;
            dst.rata4Index = src.rata4Index;
            dst.cara_ukur1Index = src.cara_ukur1Index;
            dst.cara_ukur2Index = src.cara_ukur2Index;
            dst.cara_ukur3Index = src.cara_ukur3Index;
            dst.cara_ukur4Index = src.cara_ukur4Index;
            dst.kon_ukur1Index = src.kon_ukur1Index;
            dst.kon_ukur2Index = src.kon_ukur2Index;
            dst.kon_ukur3Index = src.kon_ukur3Index;
            dst.kon_ukur4Index = src.kon_ukur4Index;
            dst.jdebit2Index = src.jdebit2Index;
            dst.jdebit3Index = src.jdebit3Index;
            dst.jdebit4Index = src.jdebit4Index;
            dst.qlIndex = src.qlIndex;
            dst.ql1Index = src.ql1Index;
            dst.ql2Index = src.ql2Index;
            dst.ql3Index = src.ql3Index;
            dst.ql4Index = src.ql4Index;
            dst.qhIndex = src.qhIndex;
            dst.qh1Index = src.qh1Index;
            dst.qh2Index = src.qh2Index;
            dst.qh3Index = src.qh3Index;
            dst.qh4Index = src.qh4Index;
            dst.qsIndex = src.qsIndex;
            dst.qs1Index = src.qs1Index;
            dst.qs2Index = src.qs2Index;
            dst.qs3Index = src.qs3Index;
            dst.qs4Index = src.qs4Index;
            dst.pelaksanaIndex = src.pelaksanaIndex;
            dst.verifyIndex = src.verifyIndex;
            dst.petak_tersierIndex = src.petak_tersierIndex;
            dst.petak_tersier_rcnIndex = src.petak_tersier_rcnIndex;
            dst.deleterecIndex = src.deleterecIndex;
            dst.flagIndex = src.flagIndex;
            dst.insertIndex = src.insertIndex;
            dst.updateIndex = src.updateIndex;
            dst.skip_updateIndex = src.skip_updateIndex;
            dst.deleteIndex = src.deleteIndex;
            dst.rec_baru_serverIndex = src.rec_baru_serverIndex;
            dst.tgleditIndex = src.tgleditIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Blanko06ColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Blanko06> proxyState;

    com_pusair_smopi_Model_Blanko06RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Blanko06ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Blanko06>(this);
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
    public String realmGet$thbln() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thblnIndex);
    }

    @Override
    public void realmSet$thbln(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thblnIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thblnIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thblnIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thblnIndex, value);
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
    public float realmGet$tg01() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg01Index);
    }

    @Override
    public void realmSet$tg01(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg01Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg01Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg02() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg02Index);
    }

    @Override
    public void realmSet$tg02(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg02Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg02Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg03() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg03Index);
    }

    @Override
    public void realmSet$tg03(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg03Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg03Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg04() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg04Index);
    }

    @Override
    public void realmSet$tg04(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg04Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg04Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg05() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg05Index);
    }

    @Override
    public void realmSet$tg05(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg05Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg05Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg06() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg06Index);
    }

    @Override
    public void realmSet$tg06(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg06Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg06Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg07() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg07Index);
    }

    @Override
    public void realmSet$tg07(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg07Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg07Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg08() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg08Index);
    }

    @Override
    public void realmSet$tg08(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg08Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg08Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg09() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg09Index);
    }

    @Override
    public void realmSet$tg09(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg09Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg09Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg10() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg10Index);
    }

    @Override
    public void realmSet$tg10(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg10Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg10Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg11() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg11Index);
    }

    @Override
    public void realmSet$tg11(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg11Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg11Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg12() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg12Index);
    }

    @Override
    public void realmSet$tg12(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg12Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg12Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg13() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg13Index);
    }

    @Override
    public void realmSet$tg13(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg13Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg13Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg14() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg14Index);
    }

    @Override
    public void realmSet$tg14(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg14Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg14Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg15() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg15Index);
    }

    @Override
    public void realmSet$tg15(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg15Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg15Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg16() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg16Index);
    }

    @Override
    public void realmSet$tg16(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg16Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg16Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg17() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg17Index);
    }

    @Override
    public void realmSet$tg17(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg17Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg17Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg18() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg18Index);
    }

    @Override
    public void realmSet$tg18(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg18Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg18Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg19() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg19Index);
    }

    @Override
    public void realmSet$tg19(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg19Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg19Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg20() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg20Index);
    }

    @Override
    public void realmSet$tg20(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg20Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg20Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg21() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg21Index);
    }

    @Override
    public void realmSet$tg21(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg21Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg21Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg22() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg22Index);
    }

    @Override
    public void realmSet$tg22(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg22Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg22Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg23() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg23Index);
    }

    @Override
    public void realmSet$tg23(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg23Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg23Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg24() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg24Index);
    }

    @Override
    public void realmSet$tg24(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg24Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg24Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg25() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg25Index);
    }

    @Override
    public void realmSet$tg25(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg25Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg25Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg26() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg26Index);
    }

    @Override
    public void realmSet$tg26(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg26Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg26Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg27() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg27Index);
    }

    @Override
    public void realmSet$tg27(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg27Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg27Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg28() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg28Index);
    }

    @Override
    public void realmSet$tg28(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg28Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg28Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg29() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg29Index);
    }

    @Override
    public void realmSet$tg29(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg29Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg29Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg30() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg30Index);
    }

    @Override
    public void realmSet$tg30(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg30Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg30Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tg31() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tg31Index);
    }

    @Override
    public void realmSet$tg31(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tg31Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tg31Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jdebit1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jdebit1Index);
    }

    @Override
    public void realmSet$jdebit1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jdebit1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jdebit1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rata1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rata1Index);
    }

    @Override
    public void realmSet$rata1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rata1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rata1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rata2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rata2Index);
    }

    @Override
    public void realmSet$rata2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rata2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rata2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rata3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rata3Index);
    }

    @Override
    public void realmSet$rata3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rata3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rata3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$rata4() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.rata4Index);
    }

    @Override
    public void realmSet$rata4(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.rata4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.rata4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cara_ukur1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cara_ukur1Index);
    }

    @Override
    public void realmSet$cara_ukur1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cara_ukur1Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cara_ukur1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cara_ukur1Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cara_ukur1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cara_ukur2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cara_ukur2Index);
    }

    @Override
    public void realmSet$cara_ukur2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cara_ukur2Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cara_ukur2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cara_ukur2Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cara_ukur2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cara_ukur3() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cara_ukur3Index);
    }

    @Override
    public void realmSet$cara_ukur3(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cara_ukur3Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cara_ukur3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cara_ukur3Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cara_ukur3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cara_ukur4() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cara_ukur4Index);
    }

    @Override
    public void realmSet$cara_ukur4(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cara_ukur4Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cara_ukur4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cara_ukur4Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cara_ukur4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kon_ukur1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kon_ukur1Index);
    }

    @Override
    public void realmSet$kon_ukur1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kon_ukur1Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kon_ukur1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kon_ukur1Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kon_ukur1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kon_ukur2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kon_ukur2Index);
    }

    @Override
    public void realmSet$kon_ukur2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kon_ukur2Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kon_ukur2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kon_ukur2Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kon_ukur2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kon_ukur3() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kon_ukur3Index);
    }

    @Override
    public void realmSet$kon_ukur3(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kon_ukur3Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kon_ukur3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kon_ukur3Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kon_ukur3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kon_ukur4() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kon_ukur4Index);
    }

    @Override
    public void realmSet$kon_ukur4(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kon_ukur4Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kon_ukur4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kon_ukur4Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kon_ukur4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jdebit2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jdebit2Index);
    }

    @Override
    public void realmSet$jdebit2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jdebit2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jdebit2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jdebit3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jdebit3Index);
    }

    @Override
    public void realmSet$jdebit3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jdebit3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jdebit3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$jdebit4() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.jdebit4Index);
    }

    @Override
    public void realmSet$jdebit4(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.jdebit4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.jdebit4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ql() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qlIndex);
    }

    @Override
    public void realmSet$ql(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ql1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ql1Index);
    }

    @Override
    public void realmSet$ql1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ql1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ql1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ql2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ql2Index);
    }

    @Override
    public void realmSet$ql2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ql2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ql2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ql3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ql3Index);
    }

    @Override
    public void realmSet$ql3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ql3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ql3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ql4() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ql4Index);
    }

    @Override
    public void realmSet$ql4(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ql4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ql4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qh() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qhIndex);
    }

    @Override
    public void realmSet$qh(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qhIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qhIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qh1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qh1Index);
    }

    @Override
    public void realmSet$qh1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qh1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qh1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qh2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qh2Index);
    }

    @Override
    public void realmSet$qh2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qh2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qh2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qh3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qh3Index);
    }

    @Override
    public void realmSet$qh3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qh3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qh3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qh4() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qh4Index);
    }

    @Override
    public void realmSet$qh4(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qh4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qh4Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qs() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qsIndex);
    }

    @Override
    public void realmSet$qs(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qs1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qs1Index);
    }

    @Override
    public void realmSet$qs1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qs1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qs1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qs2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qs2Index);
    }

    @Override
    public void realmSet$qs2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qs2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qs2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qs3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qs3Index);
    }

    @Override
    public void realmSet$qs3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qs3Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qs3Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$qs4() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.qs4Index);
    }

    @Override
    public void realmSet$qs4(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.qs4Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.qs4Index, value);
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
    public int realmGet$verify() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.verifyIndex);
    }

    @Override
    public void realmSet$verify(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.verifyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.verifyIndex, value);
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
    public float realmGet$petak_tersier_rcn() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.petak_tersier_rcnIndex);
    }

    @Override
    public void realmSet$petak_tersier_rcn(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.petak_tersier_rcnIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.petak_tersier_rcnIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Blanko06", 81, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thbln", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("urutan", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg01", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg02", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg03", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg04", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg05", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg06", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg07", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg08", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg09", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg10", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg11", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg12", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg13", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg14", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg15", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg16", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg17", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg18", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg19", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg20", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg21", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg22", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg23", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg24", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg25", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg26", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg27", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg28", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg29", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg30", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tg31", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jdebit1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rata1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rata2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rata3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rata4", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cara_ukur1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cara_ukur2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cara_ukur3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cara_ukur4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kon_ukur1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kon_ukur2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kon_ukur3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kon_ukur4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jdebit2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jdebit3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jdebit4", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ql", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ql1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ql2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ql3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ql4", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qh", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qh1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qh2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qh3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qh4", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qs", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qs1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qs2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qs3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qs4", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("pelaksana", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("verify", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier_rcn", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("deleterec", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flag", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("insert", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("update", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("skip_update", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delete", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rec_baru_server", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Blanko06ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Blanko06ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Blanko06";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Blanko06";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Blanko06 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Blanko06 obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
            Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_Blanko06RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko06RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko06.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko06RealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko06.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_Blanko06RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) obj;
        if (json.has("kd_staf")) {
            if (json.isNull("kd_staf")) {
                objProxy.realmSet$kd_staf(null);
            } else {
                objProxy.realmSet$kd_staf((String) json.getString("kd_staf"));
            }
        }
        if (json.has("kd_mt")) {
            if (json.isNull("kd_mt")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
            } else {
                objProxy.realmSet$kd_mt((int) json.getInt("kd_mt"));
            }
        }
        if (json.has("thbln")) {
            if (json.isNull("thbln")) {
                objProxy.realmSet$thbln(null);
            } else {
                objProxy.realmSet$thbln((String) json.getString("thbln"));
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
        if (json.has("urutan")) {
            if (json.isNull("urutan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
            } else {
                objProxy.realmSet$urutan((int) json.getInt("urutan"));
            }
        }
        if (json.has("tg01")) {
            if (json.isNull("tg01")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg01' to null.");
            } else {
                objProxy.realmSet$tg01((float) json.getDouble("tg01"));
            }
        }
        if (json.has("tg02")) {
            if (json.isNull("tg02")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg02' to null.");
            } else {
                objProxy.realmSet$tg02((float) json.getDouble("tg02"));
            }
        }
        if (json.has("tg03")) {
            if (json.isNull("tg03")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg03' to null.");
            } else {
                objProxy.realmSet$tg03((float) json.getDouble("tg03"));
            }
        }
        if (json.has("tg04")) {
            if (json.isNull("tg04")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg04' to null.");
            } else {
                objProxy.realmSet$tg04((float) json.getDouble("tg04"));
            }
        }
        if (json.has("tg05")) {
            if (json.isNull("tg05")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg05' to null.");
            } else {
                objProxy.realmSet$tg05((float) json.getDouble("tg05"));
            }
        }
        if (json.has("tg06")) {
            if (json.isNull("tg06")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg06' to null.");
            } else {
                objProxy.realmSet$tg06((float) json.getDouble("tg06"));
            }
        }
        if (json.has("tg07")) {
            if (json.isNull("tg07")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg07' to null.");
            } else {
                objProxy.realmSet$tg07((float) json.getDouble("tg07"));
            }
        }
        if (json.has("tg08")) {
            if (json.isNull("tg08")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg08' to null.");
            } else {
                objProxy.realmSet$tg08((float) json.getDouble("tg08"));
            }
        }
        if (json.has("tg09")) {
            if (json.isNull("tg09")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg09' to null.");
            } else {
                objProxy.realmSet$tg09((float) json.getDouble("tg09"));
            }
        }
        if (json.has("tg10")) {
            if (json.isNull("tg10")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg10' to null.");
            } else {
                objProxy.realmSet$tg10((float) json.getDouble("tg10"));
            }
        }
        if (json.has("tg11")) {
            if (json.isNull("tg11")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg11' to null.");
            } else {
                objProxy.realmSet$tg11((float) json.getDouble("tg11"));
            }
        }
        if (json.has("tg12")) {
            if (json.isNull("tg12")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg12' to null.");
            } else {
                objProxy.realmSet$tg12((float) json.getDouble("tg12"));
            }
        }
        if (json.has("tg13")) {
            if (json.isNull("tg13")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg13' to null.");
            } else {
                objProxy.realmSet$tg13((float) json.getDouble("tg13"));
            }
        }
        if (json.has("tg14")) {
            if (json.isNull("tg14")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg14' to null.");
            } else {
                objProxy.realmSet$tg14((float) json.getDouble("tg14"));
            }
        }
        if (json.has("tg15")) {
            if (json.isNull("tg15")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg15' to null.");
            } else {
                objProxy.realmSet$tg15((float) json.getDouble("tg15"));
            }
        }
        if (json.has("tg16")) {
            if (json.isNull("tg16")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg16' to null.");
            } else {
                objProxy.realmSet$tg16((float) json.getDouble("tg16"));
            }
        }
        if (json.has("tg17")) {
            if (json.isNull("tg17")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg17' to null.");
            } else {
                objProxy.realmSet$tg17((float) json.getDouble("tg17"));
            }
        }
        if (json.has("tg18")) {
            if (json.isNull("tg18")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg18' to null.");
            } else {
                objProxy.realmSet$tg18((float) json.getDouble("tg18"));
            }
        }
        if (json.has("tg19")) {
            if (json.isNull("tg19")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg19' to null.");
            } else {
                objProxy.realmSet$tg19((float) json.getDouble("tg19"));
            }
        }
        if (json.has("tg20")) {
            if (json.isNull("tg20")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg20' to null.");
            } else {
                objProxy.realmSet$tg20((float) json.getDouble("tg20"));
            }
        }
        if (json.has("tg21")) {
            if (json.isNull("tg21")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg21' to null.");
            } else {
                objProxy.realmSet$tg21((float) json.getDouble("tg21"));
            }
        }
        if (json.has("tg22")) {
            if (json.isNull("tg22")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg22' to null.");
            } else {
                objProxy.realmSet$tg22((float) json.getDouble("tg22"));
            }
        }
        if (json.has("tg23")) {
            if (json.isNull("tg23")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg23' to null.");
            } else {
                objProxy.realmSet$tg23((float) json.getDouble("tg23"));
            }
        }
        if (json.has("tg24")) {
            if (json.isNull("tg24")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg24' to null.");
            } else {
                objProxy.realmSet$tg24((float) json.getDouble("tg24"));
            }
        }
        if (json.has("tg25")) {
            if (json.isNull("tg25")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg25' to null.");
            } else {
                objProxy.realmSet$tg25((float) json.getDouble("tg25"));
            }
        }
        if (json.has("tg26")) {
            if (json.isNull("tg26")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg26' to null.");
            } else {
                objProxy.realmSet$tg26((float) json.getDouble("tg26"));
            }
        }
        if (json.has("tg27")) {
            if (json.isNull("tg27")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg27' to null.");
            } else {
                objProxy.realmSet$tg27((float) json.getDouble("tg27"));
            }
        }
        if (json.has("tg28")) {
            if (json.isNull("tg28")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg28' to null.");
            } else {
                objProxy.realmSet$tg28((float) json.getDouble("tg28"));
            }
        }
        if (json.has("tg29")) {
            if (json.isNull("tg29")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg29' to null.");
            } else {
                objProxy.realmSet$tg29((float) json.getDouble("tg29"));
            }
        }
        if (json.has("tg30")) {
            if (json.isNull("tg30")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg30' to null.");
            } else {
                objProxy.realmSet$tg30((float) json.getDouble("tg30"));
            }
        }
        if (json.has("tg31")) {
            if (json.isNull("tg31")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tg31' to null.");
            } else {
                objProxy.realmSet$tg31((float) json.getDouble("tg31"));
            }
        }
        if (json.has("jdebit1")) {
            if (json.isNull("jdebit1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit1' to null.");
            } else {
                objProxy.realmSet$jdebit1((float) json.getDouble("jdebit1"));
            }
        }
        if (json.has("rata1")) {
            if (json.isNull("rata1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rata1' to null.");
            } else {
                objProxy.realmSet$rata1((float) json.getDouble("rata1"));
            }
        }
        if (json.has("rata2")) {
            if (json.isNull("rata2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rata2' to null.");
            } else {
                objProxy.realmSet$rata2((float) json.getDouble("rata2"));
            }
        }
        if (json.has("rata3")) {
            if (json.isNull("rata3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rata3' to null.");
            } else {
                objProxy.realmSet$rata3((float) json.getDouble("rata3"));
            }
        }
        if (json.has("rata4")) {
            if (json.isNull("rata4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rata4' to null.");
            } else {
                objProxy.realmSet$rata4((float) json.getDouble("rata4"));
            }
        }
        if (json.has("cara_ukur1")) {
            if (json.isNull("cara_ukur1")) {
                objProxy.realmSet$cara_ukur1(null);
            } else {
                objProxy.realmSet$cara_ukur1((String) json.getString("cara_ukur1"));
            }
        }
        if (json.has("cara_ukur2")) {
            if (json.isNull("cara_ukur2")) {
                objProxy.realmSet$cara_ukur2(null);
            } else {
                objProxy.realmSet$cara_ukur2((String) json.getString("cara_ukur2"));
            }
        }
        if (json.has("cara_ukur3")) {
            if (json.isNull("cara_ukur3")) {
                objProxy.realmSet$cara_ukur3(null);
            } else {
                objProxy.realmSet$cara_ukur3((String) json.getString("cara_ukur3"));
            }
        }
        if (json.has("cara_ukur4")) {
            if (json.isNull("cara_ukur4")) {
                objProxy.realmSet$cara_ukur4(null);
            } else {
                objProxy.realmSet$cara_ukur4((String) json.getString("cara_ukur4"));
            }
        }
        if (json.has("kon_ukur1")) {
            if (json.isNull("kon_ukur1")) {
                objProxy.realmSet$kon_ukur1(null);
            } else {
                objProxy.realmSet$kon_ukur1((String) json.getString("kon_ukur1"));
            }
        }
        if (json.has("kon_ukur2")) {
            if (json.isNull("kon_ukur2")) {
                objProxy.realmSet$kon_ukur2(null);
            } else {
                objProxy.realmSet$kon_ukur2((String) json.getString("kon_ukur2"));
            }
        }
        if (json.has("kon_ukur3")) {
            if (json.isNull("kon_ukur3")) {
                objProxy.realmSet$kon_ukur3(null);
            } else {
                objProxy.realmSet$kon_ukur3((String) json.getString("kon_ukur3"));
            }
        }
        if (json.has("kon_ukur4")) {
            if (json.isNull("kon_ukur4")) {
                objProxy.realmSet$kon_ukur4(null);
            } else {
                objProxy.realmSet$kon_ukur4((String) json.getString("kon_ukur4"));
            }
        }
        if (json.has("jdebit2")) {
            if (json.isNull("jdebit2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit2' to null.");
            } else {
                objProxy.realmSet$jdebit2((float) json.getDouble("jdebit2"));
            }
        }
        if (json.has("jdebit3")) {
            if (json.isNull("jdebit3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit3' to null.");
            } else {
                objProxy.realmSet$jdebit3((float) json.getDouble("jdebit3"));
            }
        }
        if (json.has("jdebit4")) {
            if (json.isNull("jdebit4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit4' to null.");
            } else {
                objProxy.realmSet$jdebit4((float) json.getDouble("jdebit4"));
            }
        }
        if (json.has("ql")) {
            if (json.isNull("ql")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ql' to null.");
            } else {
                objProxy.realmSet$ql((float) json.getDouble("ql"));
            }
        }
        if (json.has("ql1")) {
            if (json.isNull("ql1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ql1' to null.");
            } else {
                objProxy.realmSet$ql1((float) json.getDouble("ql1"));
            }
        }
        if (json.has("ql2")) {
            if (json.isNull("ql2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ql2' to null.");
            } else {
                objProxy.realmSet$ql2((float) json.getDouble("ql2"));
            }
        }
        if (json.has("ql3")) {
            if (json.isNull("ql3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ql3' to null.");
            } else {
                objProxy.realmSet$ql3((float) json.getDouble("ql3"));
            }
        }
        if (json.has("ql4")) {
            if (json.isNull("ql4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ql4' to null.");
            } else {
                objProxy.realmSet$ql4((float) json.getDouble("ql4"));
            }
        }
        if (json.has("qh")) {
            if (json.isNull("qh")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qh' to null.");
            } else {
                objProxy.realmSet$qh((float) json.getDouble("qh"));
            }
        }
        if (json.has("qh1")) {
            if (json.isNull("qh1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qh1' to null.");
            } else {
                objProxy.realmSet$qh1((float) json.getDouble("qh1"));
            }
        }
        if (json.has("qh2")) {
            if (json.isNull("qh2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qh2' to null.");
            } else {
                objProxy.realmSet$qh2((float) json.getDouble("qh2"));
            }
        }
        if (json.has("qh3")) {
            if (json.isNull("qh3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qh3' to null.");
            } else {
                objProxy.realmSet$qh3((float) json.getDouble("qh3"));
            }
        }
        if (json.has("qh4")) {
            if (json.isNull("qh4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qh4' to null.");
            } else {
                objProxy.realmSet$qh4((float) json.getDouble("qh4"));
            }
        }
        if (json.has("qs")) {
            if (json.isNull("qs")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qs' to null.");
            } else {
                objProxy.realmSet$qs((float) json.getDouble("qs"));
            }
        }
        if (json.has("qs1")) {
            if (json.isNull("qs1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qs1' to null.");
            } else {
                objProxy.realmSet$qs1((float) json.getDouble("qs1"));
            }
        }
        if (json.has("qs2")) {
            if (json.isNull("qs2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qs2' to null.");
            } else {
                objProxy.realmSet$qs2((float) json.getDouble("qs2"));
            }
        }
        if (json.has("qs3")) {
            if (json.isNull("qs3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qs3' to null.");
            } else {
                objProxy.realmSet$qs3((float) json.getDouble("qs3"));
            }
        }
        if (json.has("qs4")) {
            if (json.isNull("qs4")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qs4' to null.");
            } else {
                objProxy.realmSet$qs4((float) json.getDouble("qs4"));
            }
        }
        if (json.has("pelaksana")) {
            if (json.isNull("pelaksana")) {
                objProxy.realmSet$pelaksana(null);
            } else {
                objProxy.realmSet$pelaksana((String) json.getString("pelaksana"));
            }
        }
        if (json.has("verify")) {
            if (json.isNull("verify")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'verify' to null.");
            } else {
                objProxy.realmSet$verify((int) json.getInt("verify"));
            }
        }
        if (json.has("petak_tersier")) {
            if (json.isNull("petak_tersier")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
            } else {
                objProxy.realmSet$petak_tersier((float) json.getDouble("petak_tersier"));
            }
        }
        if (json.has("petak_tersier_rcn")) {
            if (json.isNull("petak_tersier_rcn")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier_rcn' to null.");
            } else {
                objProxy.realmSet$petak_tersier_rcn((float) json.getDouble("petak_tersier_rcn"));
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
    public static com.pusair.smopi.Model.Blanko06 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Blanko06 obj = new com.pusair.smopi.Model.Blanko06();
        final com_pusair_smopi_Model_Blanko06RealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) obj;
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
            } else if (name.equals("kd_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_mt((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kd_mt' to null.");
                }
            } else if (name.equals("thbln")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thbln((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thbln(null);
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
            } else if (name.equals("urutan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urutan((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
                }
            } else if (name.equals("tg01")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg01((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg01' to null.");
                }
            } else if (name.equals("tg02")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg02((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg02' to null.");
                }
            } else if (name.equals("tg03")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg03((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg03' to null.");
                }
            } else if (name.equals("tg04")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg04((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg04' to null.");
                }
            } else if (name.equals("tg05")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg05((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg05' to null.");
                }
            } else if (name.equals("tg06")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg06((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg06' to null.");
                }
            } else if (name.equals("tg07")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg07((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg07' to null.");
                }
            } else if (name.equals("tg08")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg08((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg08' to null.");
                }
            } else if (name.equals("tg09")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg09((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg09' to null.");
                }
            } else if (name.equals("tg10")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg10((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg10' to null.");
                }
            } else if (name.equals("tg11")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg11((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg11' to null.");
                }
            } else if (name.equals("tg12")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg12((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg12' to null.");
                }
            } else if (name.equals("tg13")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg13((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg13' to null.");
                }
            } else if (name.equals("tg14")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg14((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg14' to null.");
                }
            } else if (name.equals("tg15")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg15((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg15' to null.");
                }
            } else if (name.equals("tg16")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg16((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg16' to null.");
                }
            } else if (name.equals("tg17")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg17((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg17' to null.");
                }
            } else if (name.equals("tg18")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg18((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg18' to null.");
                }
            } else if (name.equals("tg19")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg19((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg19' to null.");
                }
            } else if (name.equals("tg20")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg20((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg20' to null.");
                }
            } else if (name.equals("tg21")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg21((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg21' to null.");
                }
            } else if (name.equals("tg22")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg22((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg22' to null.");
                }
            } else if (name.equals("tg23")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg23((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg23' to null.");
                }
            } else if (name.equals("tg24")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg24((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg24' to null.");
                }
            } else if (name.equals("tg25")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg25((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg25' to null.");
                }
            } else if (name.equals("tg26")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg26((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg26' to null.");
                }
            } else if (name.equals("tg27")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg27((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg27' to null.");
                }
            } else if (name.equals("tg28")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg28((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg28' to null.");
                }
            } else if (name.equals("tg29")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg29((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg29' to null.");
                }
            } else if (name.equals("tg30")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg30((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg30' to null.");
                }
            } else if (name.equals("tg31")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tg31((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tg31' to null.");
                }
            } else if (name.equals("jdebit1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jdebit1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit1' to null.");
                }
            } else if (name.equals("rata1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rata1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rata1' to null.");
                }
            } else if (name.equals("rata2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rata2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rata2' to null.");
                }
            } else if (name.equals("rata3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rata3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rata3' to null.");
                }
            } else if (name.equals("rata4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rata4((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'rata4' to null.");
                }
            } else if (name.equals("cara_ukur1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cara_ukur1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cara_ukur1(null);
                }
            } else if (name.equals("cara_ukur2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cara_ukur2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cara_ukur2(null);
                }
            } else if (name.equals("cara_ukur3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cara_ukur3((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cara_ukur3(null);
                }
            } else if (name.equals("cara_ukur4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cara_ukur4((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cara_ukur4(null);
                }
            } else if (name.equals("kon_ukur1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kon_ukur1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kon_ukur1(null);
                }
            } else if (name.equals("kon_ukur2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kon_ukur2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kon_ukur2(null);
                }
            } else if (name.equals("kon_ukur3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kon_ukur3((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kon_ukur3(null);
                }
            } else if (name.equals("kon_ukur4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kon_ukur4((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kon_ukur4(null);
                }
            } else if (name.equals("jdebit2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jdebit2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit2' to null.");
                }
            } else if (name.equals("jdebit3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jdebit3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit3' to null.");
                }
            } else if (name.equals("jdebit4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jdebit4((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jdebit4' to null.");
                }
            } else if (name.equals("ql")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ql((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ql' to null.");
                }
            } else if (name.equals("ql1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ql1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ql1' to null.");
                }
            } else if (name.equals("ql2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ql2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ql2' to null.");
                }
            } else if (name.equals("ql3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ql3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ql3' to null.");
                }
            } else if (name.equals("ql4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ql4((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ql4' to null.");
                }
            } else if (name.equals("qh")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qh((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qh' to null.");
                }
            } else if (name.equals("qh1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qh1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qh1' to null.");
                }
            } else if (name.equals("qh2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qh2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qh2' to null.");
                }
            } else if (name.equals("qh3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qh3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qh3' to null.");
                }
            } else if (name.equals("qh4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qh4((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qh4' to null.");
                }
            } else if (name.equals("qs")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qs((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qs' to null.");
                }
            } else if (name.equals("qs1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qs1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qs1' to null.");
                }
            } else if (name.equals("qs2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qs2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qs2' to null.");
                }
            } else if (name.equals("qs3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qs3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qs3' to null.");
                }
            } else if (name.equals("qs4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qs4((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qs4' to null.");
                }
            } else if (name.equals("pelaksana")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pelaksana((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pelaksana(null);
                }
            } else if (name.equals("verify")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$verify((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'verify' to null.");
                }
            } else if (name.equals("petak_tersier")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$petak_tersier((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
                }
            } else if (name.equals("petak_tersier_rcn")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$petak_tersier_rcn((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier_rcn' to null.");
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

    public static com.pusair.smopi.Model.Blanko06 copyOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko06 object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.Blanko06) cachedRealmObject;
        }

        com.pusair.smopi.Model.Blanko06 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
            Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_Blanko06RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Blanko06 copy(Realm realm, com.pusair.smopi.Model.Blanko06 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko06) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Blanko06 realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Blanko06.class, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_Blanko06RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) newObject;
        com_pusair_smopi_Model_Blanko06RealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectCopy.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectCopy.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectCopy.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectCopy.realmSet$tg01(realmObjectSource.realmGet$tg01());
        realmObjectCopy.realmSet$tg02(realmObjectSource.realmGet$tg02());
        realmObjectCopy.realmSet$tg03(realmObjectSource.realmGet$tg03());
        realmObjectCopy.realmSet$tg04(realmObjectSource.realmGet$tg04());
        realmObjectCopy.realmSet$tg05(realmObjectSource.realmGet$tg05());
        realmObjectCopy.realmSet$tg06(realmObjectSource.realmGet$tg06());
        realmObjectCopy.realmSet$tg07(realmObjectSource.realmGet$tg07());
        realmObjectCopy.realmSet$tg08(realmObjectSource.realmGet$tg08());
        realmObjectCopy.realmSet$tg09(realmObjectSource.realmGet$tg09());
        realmObjectCopy.realmSet$tg10(realmObjectSource.realmGet$tg10());
        realmObjectCopy.realmSet$tg11(realmObjectSource.realmGet$tg11());
        realmObjectCopy.realmSet$tg12(realmObjectSource.realmGet$tg12());
        realmObjectCopy.realmSet$tg13(realmObjectSource.realmGet$tg13());
        realmObjectCopy.realmSet$tg14(realmObjectSource.realmGet$tg14());
        realmObjectCopy.realmSet$tg15(realmObjectSource.realmGet$tg15());
        realmObjectCopy.realmSet$tg16(realmObjectSource.realmGet$tg16());
        realmObjectCopy.realmSet$tg17(realmObjectSource.realmGet$tg17());
        realmObjectCopy.realmSet$tg18(realmObjectSource.realmGet$tg18());
        realmObjectCopy.realmSet$tg19(realmObjectSource.realmGet$tg19());
        realmObjectCopy.realmSet$tg20(realmObjectSource.realmGet$tg20());
        realmObjectCopy.realmSet$tg21(realmObjectSource.realmGet$tg21());
        realmObjectCopy.realmSet$tg22(realmObjectSource.realmGet$tg22());
        realmObjectCopy.realmSet$tg23(realmObjectSource.realmGet$tg23());
        realmObjectCopy.realmSet$tg24(realmObjectSource.realmGet$tg24());
        realmObjectCopy.realmSet$tg25(realmObjectSource.realmGet$tg25());
        realmObjectCopy.realmSet$tg26(realmObjectSource.realmGet$tg26());
        realmObjectCopy.realmSet$tg27(realmObjectSource.realmGet$tg27());
        realmObjectCopy.realmSet$tg28(realmObjectSource.realmGet$tg28());
        realmObjectCopy.realmSet$tg29(realmObjectSource.realmGet$tg29());
        realmObjectCopy.realmSet$tg30(realmObjectSource.realmGet$tg30());
        realmObjectCopy.realmSet$tg31(realmObjectSource.realmGet$tg31());
        realmObjectCopy.realmSet$jdebit1(realmObjectSource.realmGet$jdebit1());
        realmObjectCopy.realmSet$rata1(realmObjectSource.realmGet$rata1());
        realmObjectCopy.realmSet$rata2(realmObjectSource.realmGet$rata2());
        realmObjectCopy.realmSet$rata3(realmObjectSource.realmGet$rata3());
        realmObjectCopy.realmSet$rata4(realmObjectSource.realmGet$rata4());
        realmObjectCopy.realmSet$cara_ukur1(realmObjectSource.realmGet$cara_ukur1());
        realmObjectCopy.realmSet$cara_ukur2(realmObjectSource.realmGet$cara_ukur2());
        realmObjectCopy.realmSet$cara_ukur3(realmObjectSource.realmGet$cara_ukur3());
        realmObjectCopy.realmSet$cara_ukur4(realmObjectSource.realmGet$cara_ukur4());
        realmObjectCopy.realmSet$kon_ukur1(realmObjectSource.realmGet$kon_ukur1());
        realmObjectCopy.realmSet$kon_ukur2(realmObjectSource.realmGet$kon_ukur2());
        realmObjectCopy.realmSet$kon_ukur3(realmObjectSource.realmGet$kon_ukur3());
        realmObjectCopy.realmSet$kon_ukur4(realmObjectSource.realmGet$kon_ukur4());
        realmObjectCopy.realmSet$jdebit2(realmObjectSource.realmGet$jdebit2());
        realmObjectCopy.realmSet$jdebit3(realmObjectSource.realmGet$jdebit3());
        realmObjectCopy.realmSet$jdebit4(realmObjectSource.realmGet$jdebit4());
        realmObjectCopy.realmSet$ql(realmObjectSource.realmGet$ql());
        realmObjectCopy.realmSet$ql1(realmObjectSource.realmGet$ql1());
        realmObjectCopy.realmSet$ql2(realmObjectSource.realmGet$ql2());
        realmObjectCopy.realmSet$ql3(realmObjectSource.realmGet$ql3());
        realmObjectCopy.realmSet$ql4(realmObjectSource.realmGet$ql4());
        realmObjectCopy.realmSet$qh(realmObjectSource.realmGet$qh());
        realmObjectCopy.realmSet$qh1(realmObjectSource.realmGet$qh1());
        realmObjectCopy.realmSet$qh2(realmObjectSource.realmGet$qh2());
        realmObjectCopy.realmSet$qh3(realmObjectSource.realmGet$qh3());
        realmObjectCopy.realmSet$qh4(realmObjectSource.realmGet$qh4());
        realmObjectCopy.realmSet$qs(realmObjectSource.realmGet$qs());
        realmObjectCopy.realmSet$qs1(realmObjectSource.realmGet$qs1());
        realmObjectCopy.realmSet$qs2(realmObjectSource.realmGet$qs2());
        realmObjectCopy.realmSet$qs3(realmObjectSource.realmGet$qs3());
        realmObjectCopy.realmSet$qs4(realmObjectSource.realmGet$qs4());
        realmObjectCopy.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectCopy.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectCopy.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectCopy.realmSet$petak_tersier_rcn(realmObjectSource.realmGet$petak_tersier_rcn());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Blanko06 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
        long tableNativePtr = table.getNativePtr();
        Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$urutan(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg01Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg01(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg02Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg02(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg03Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg03(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg04Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg04(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg05Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg05(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg06Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg06(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg07Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg07(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg08Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg08(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg09Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg09(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg10Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg10(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg11Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg11(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg12Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg12(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg13Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg13(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg14Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg14(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg15Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg15(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg16Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg16(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg17Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg17(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg18Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg18(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg19Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg19(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg20Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg20(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg21Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg21(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg22Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg22(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg23Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg23(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg24Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg24(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg25Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg25(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg26Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg26(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg27Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg27(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg28Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg28(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg29Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg29(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg30Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg30(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg31Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg31(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata4(), false);
        String realmGet$cara_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur1();
        if (realmGet$cara_ukur1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, realmGet$cara_ukur1, false);
        }
        String realmGet$cara_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur2();
        if (realmGet$cara_ukur2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, realmGet$cara_ukur2, false);
        }
        String realmGet$cara_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur3();
        if (realmGet$cara_ukur3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, realmGet$cara_ukur3, false);
        }
        String realmGet$cara_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur4();
        if (realmGet$cara_ukur4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, realmGet$cara_ukur4, false);
        }
        String realmGet$kon_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur1();
        if (realmGet$kon_ukur1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, realmGet$kon_ukur1, false);
        }
        String realmGet$kon_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur2();
        if (realmGet$kon_ukur2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, realmGet$kon_ukur2, false);
        }
        String realmGet$kon_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur3();
        if (realmGet$kon_ukur3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, realmGet$kon_ukur3, false);
        }
        String realmGet$kon_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur4();
        if (realmGet$kon_ukur4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, realmGet$kon_ukur4, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qlIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs4(), false);
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$verify(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
        long tableNativePtr = table.getNativePtr();
        Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko06 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko06) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$urutan(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg01Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg01(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg02Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg02(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg03Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg03(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg04Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg04(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg05Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg05(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg06Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg06(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg07Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg07(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg08Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg08(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg09Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg09(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg10Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg10(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg11Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg11(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg12Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg12(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg13Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg13(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg14Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg14(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg15Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg15(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg16Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg16(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg17Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg17(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg18Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg18(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg19Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg19(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg20Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg20(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg21Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg21(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg22Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg22(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg23Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg23(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg24Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg24(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg25Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg25(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg26Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg26(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg27Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg27(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg28Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg28(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg29Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg29(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg30Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg30(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg31Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg31(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata4(), false);
            String realmGet$cara_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur1();
            if (realmGet$cara_ukur1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, realmGet$cara_ukur1, false);
            }
            String realmGet$cara_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur2();
            if (realmGet$cara_ukur2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, realmGet$cara_ukur2, false);
            }
            String realmGet$cara_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur3();
            if (realmGet$cara_ukur3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, realmGet$cara_ukur3, false);
            }
            String realmGet$cara_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur4();
            if (realmGet$cara_ukur4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, realmGet$cara_ukur4, false);
            }
            String realmGet$kon_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur1();
            if (realmGet$kon_ukur1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, realmGet$kon_ukur1, false);
            }
            String realmGet$kon_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur2();
            if (realmGet$kon_ukur2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, realmGet$kon_ukur2, false);
            }
            String realmGet$kon_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur3();
            if (realmGet$kon_ukur3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, realmGet$kon_ukur3, false);
            }
            String realmGet$kon_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur4();
            if (realmGet$kon_ukur4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, realmGet$kon_ukur4, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qlIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs4(), false);
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$verify(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko06 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
        long tableNativePtr = table.getNativePtr();
        Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$urutan(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg01Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg01(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg02Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg02(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg03Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg03(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg04Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg04(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg05Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg05(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg06Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg06(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg07Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg07(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg08Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg08(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg09Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg09(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg10Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg10(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg11Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg11(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg12Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg12(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg13Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg13(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg14Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg14(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg15Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg15(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg16Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg16(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg17Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg17(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg18Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg18(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg19Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg19(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg20Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg20(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg21Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg21(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg22Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg22(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg23Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg23(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg24Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg24(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg25Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg25(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg26Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg26(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg27Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg27(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg28Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg28(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg29Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg29(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg30Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg30(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tg31Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg31(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.rata4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata4(), false);
        String realmGet$cara_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur1();
        if (realmGet$cara_ukur1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, realmGet$cara_ukur1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, false);
        }
        String realmGet$cara_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur2();
        if (realmGet$cara_ukur2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, realmGet$cara_ukur2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, false);
        }
        String realmGet$cara_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur3();
        if (realmGet$cara_ukur3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, realmGet$cara_ukur3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, false);
        }
        String realmGet$cara_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur4();
        if (realmGet$cara_ukur4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, realmGet$cara_ukur4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, false);
        }
        String realmGet$kon_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur1();
        if (realmGet$kon_ukur1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, realmGet$kon_ukur1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, false);
        }
        String realmGet$kon_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur2();
        if (realmGet$kon_ukur2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, realmGet$kon_ukur2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, false);
        }
        String realmGet$kon_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur3();
        if (realmGet$kon_ukur3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, realmGet$kon_ukur3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, false);
        }
        String realmGet$kon_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur4();
        if (realmGet$kon_ukur4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, realmGet$kon_ukur4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qlIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ql4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qh4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh4(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qsIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.qs4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs4(), false);
        String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$pelaksana();
        if (realmGet$pelaksana != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$verify(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko06.class);
        long tableNativePtr = table.getNativePtr();
        Blanko06ColumnInfo columnInfo = (Blanko06ColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko06.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko06 object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko06) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$urutan(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg01Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg01(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg02Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg02(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg03Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg03(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg04Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg04(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg05Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg05(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg06Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg06(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg07Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg07(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg08Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg08(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg09Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg09(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg10Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg10(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg11Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg11(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg12Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg12(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg13Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg13(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg14Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg14(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg15Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg15(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg16Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg16(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg17Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg17(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg18Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg18(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg19Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg19(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg20Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg20(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg21Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg21(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg22Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg22(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg23Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg23(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg24Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg24(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg25Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg25(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg26Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg26(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg27Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg27(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg28Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg28(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg29Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg29(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg30Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg30(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tg31Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tg31(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.rata4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rata4(), false);
            String realmGet$cara_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur1();
            if (realmGet$cara_ukur1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, realmGet$cara_ukur1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur1Index, rowIndex, false);
            }
            String realmGet$cara_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur2();
            if (realmGet$cara_ukur2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, realmGet$cara_ukur2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur2Index, rowIndex, false);
            }
            String realmGet$cara_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur3();
            if (realmGet$cara_ukur3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, realmGet$cara_ukur3, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur3Index, rowIndex, false);
            }
            String realmGet$cara_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$cara_ukur4();
            if (realmGet$cara_ukur4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, realmGet$cara_ukur4, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cara_ukur4Index, rowIndex, false);
            }
            String realmGet$kon_ukur1 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur1();
            if (realmGet$kon_ukur1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, realmGet$kon_ukur1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur1Index, rowIndex, false);
            }
            String realmGet$kon_ukur2 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur2();
            if (realmGet$kon_ukur2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, realmGet$kon_ukur2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur2Index, rowIndex, false);
            }
            String realmGet$kon_ukur3 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur3();
            if (realmGet$kon_ukur3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, realmGet$kon_ukur3, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur3Index, rowIndex, false);
            }
            String realmGet$kon_ukur4 = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$kon_ukur4();
            if (realmGet$kon_ukur4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, realmGet$kon_ukur4, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kon_ukur4Index, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.jdebit4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$jdebit4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qlIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ql4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$ql4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qh4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qh4(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qsIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs1Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs2Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs3Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.qs4Index, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$qs4(), false);
            String realmGet$pelaksana = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$pelaksana();
            if (realmGet$pelaksana != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, realmGet$pelaksana, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pelaksanaIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.verifyIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$verify(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko06RealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Blanko06 createDetachedCopy(com.pusair.smopi.Model.Blanko06 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Blanko06 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Blanko06();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Blanko06) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Blanko06) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_Blanko06RealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_Blanko06RealmProxyInterface realmSource = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$thbln(realmSource.realmGet$thbln());
        unmanagedCopy.realmSet$nm_bangtrol(realmSource.realmGet$nm_bangtrol());
        unmanagedCopy.realmSet$tmt_bangtrol(realmSource.realmGet$tmt_bangtrol());
        unmanagedCopy.realmSet$urutan(realmSource.realmGet$urutan());
        unmanagedCopy.realmSet$tg01(realmSource.realmGet$tg01());
        unmanagedCopy.realmSet$tg02(realmSource.realmGet$tg02());
        unmanagedCopy.realmSet$tg03(realmSource.realmGet$tg03());
        unmanagedCopy.realmSet$tg04(realmSource.realmGet$tg04());
        unmanagedCopy.realmSet$tg05(realmSource.realmGet$tg05());
        unmanagedCopy.realmSet$tg06(realmSource.realmGet$tg06());
        unmanagedCopy.realmSet$tg07(realmSource.realmGet$tg07());
        unmanagedCopy.realmSet$tg08(realmSource.realmGet$tg08());
        unmanagedCopy.realmSet$tg09(realmSource.realmGet$tg09());
        unmanagedCopy.realmSet$tg10(realmSource.realmGet$tg10());
        unmanagedCopy.realmSet$tg11(realmSource.realmGet$tg11());
        unmanagedCopy.realmSet$tg12(realmSource.realmGet$tg12());
        unmanagedCopy.realmSet$tg13(realmSource.realmGet$tg13());
        unmanagedCopy.realmSet$tg14(realmSource.realmGet$tg14());
        unmanagedCopy.realmSet$tg15(realmSource.realmGet$tg15());
        unmanagedCopy.realmSet$tg16(realmSource.realmGet$tg16());
        unmanagedCopy.realmSet$tg17(realmSource.realmGet$tg17());
        unmanagedCopy.realmSet$tg18(realmSource.realmGet$tg18());
        unmanagedCopy.realmSet$tg19(realmSource.realmGet$tg19());
        unmanagedCopy.realmSet$tg20(realmSource.realmGet$tg20());
        unmanagedCopy.realmSet$tg21(realmSource.realmGet$tg21());
        unmanagedCopy.realmSet$tg22(realmSource.realmGet$tg22());
        unmanagedCopy.realmSet$tg23(realmSource.realmGet$tg23());
        unmanagedCopy.realmSet$tg24(realmSource.realmGet$tg24());
        unmanagedCopy.realmSet$tg25(realmSource.realmGet$tg25());
        unmanagedCopy.realmSet$tg26(realmSource.realmGet$tg26());
        unmanagedCopy.realmSet$tg27(realmSource.realmGet$tg27());
        unmanagedCopy.realmSet$tg28(realmSource.realmGet$tg28());
        unmanagedCopy.realmSet$tg29(realmSource.realmGet$tg29());
        unmanagedCopy.realmSet$tg30(realmSource.realmGet$tg30());
        unmanagedCopy.realmSet$tg31(realmSource.realmGet$tg31());
        unmanagedCopy.realmSet$jdebit1(realmSource.realmGet$jdebit1());
        unmanagedCopy.realmSet$rata1(realmSource.realmGet$rata1());
        unmanagedCopy.realmSet$rata2(realmSource.realmGet$rata2());
        unmanagedCopy.realmSet$rata3(realmSource.realmGet$rata3());
        unmanagedCopy.realmSet$rata4(realmSource.realmGet$rata4());
        unmanagedCopy.realmSet$cara_ukur1(realmSource.realmGet$cara_ukur1());
        unmanagedCopy.realmSet$cara_ukur2(realmSource.realmGet$cara_ukur2());
        unmanagedCopy.realmSet$cara_ukur3(realmSource.realmGet$cara_ukur3());
        unmanagedCopy.realmSet$cara_ukur4(realmSource.realmGet$cara_ukur4());
        unmanagedCopy.realmSet$kon_ukur1(realmSource.realmGet$kon_ukur1());
        unmanagedCopy.realmSet$kon_ukur2(realmSource.realmGet$kon_ukur2());
        unmanagedCopy.realmSet$kon_ukur3(realmSource.realmGet$kon_ukur3());
        unmanagedCopy.realmSet$kon_ukur4(realmSource.realmGet$kon_ukur4());
        unmanagedCopy.realmSet$jdebit2(realmSource.realmGet$jdebit2());
        unmanagedCopy.realmSet$jdebit3(realmSource.realmGet$jdebit3());
        unmanagedCopy.realmSet$jdebit4(realmSource.realmGet$jdebit4());
        unmanagedCopy.realmSet$ql(realmSource.realmGet$ql());
        unmanagedCopy.realmSet$ql1(realmSource.realmGet$ql1());
        unmanagedCopy.realmSet$ql2(realmSource.realmGet$ql2());
        unmanagedCopy.realmSet$ql3(realmSource.realmGet$ql3());
        unmanagedCopy.realmSet$ql4(realmSource.realmGet$ql4());
        unmanagedCopy.realmSet$qh(realmSource.realmGet$qh());
        unmanagedCopy.realmSet$qh1(realmSource.realmGet$qh1());
        unmanagedCopy.realmSet$qh2(realmSource.realmGet$qh2());
        unmanagedCopy.realmSet$qh3(realmSource.realmGet$qh3());
        unmanagedCopy.realmSet$qh4(realmSource.realmGet$qh4());
        unmanagedCopy.realmSet$qs(realmSource.realmGet$qs());
        unmanagedCopy.realmSet$qs1(realmSource.realmGet$qs1());
        unmanagedCopy.realmSet$qs2(realmSource.realmGet$qs2());
        unmanagedCopy.realmSet$qs3(realmSource.realmGet$qs3());
        unmanagedCopy.realmSet$qs4(realmSource.realmGet$qs4());
        unmanagedCopy.realmSet$pelaksana(realmSource.realmGet$pelaksana());
        unmanagedCopy.realmSet$verify(realmSource.realmGet$verify());
        unmanagedCopy.realmSet$petak_tersier(realmSource.realmGet$petak_tersier());
        unmanagedCopy.realmSet$petak_tersier_rcn(realmSource.realmGet$petak_tersier_rcn());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Blanko06 update(Realm realm, com.pusair.smopi.Model.Blanko06 realmObject, com.pusair.smopi.Model.Blanko06 newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_Blanko06RealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) realmObject;
        com_pusair_smopi_Model_Blanko06RealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko06RealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectTarget.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectTarget.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectTarget.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectTarget.realmSet$tg01(realmObjectSource.realmGet$tg01());
        realmObjectTarget.realmSet$tg02(realmObjectSource.realmGet$tg02());
        realmObjectTarget.realmSet$tg03(realmObjectSource.realmGet$tg03());
        realmObjectTarget.realmSet$tg04(realmObjectSource.realmGet$tg04());
        realmObjectTarget.realmSet$tg05(realmObjectSource.realmGet$tg05());
        realmObjectTarget.realmSet$tg06(realmObjectSource.realmGet$tg06());
        realmObjectTarget.realmSet$tg07(realmObjectSource.realmGet$tg07());
        realmObjectTarget.realmSet$tg08(realmObjectSource.realmGet$tg08());
        realmObjectTarget.realmSet$tg09(realmObjectSource.realmGet$tg09());
        realmObjectTarget.realmSet$tg10(realmObjectSource.realmGet$tg10());
        realmObjectTarget.realmSet$tg11(realmObjectSource.realmGet$tg11());
        realmObjectTarget.realmSet$tg12(realmObjectSource.realmGet$tg12());
        realmObjectTarget.realmSet$tg13(realmObjectSource.realmGet$tg13());
        realmObjectTarget.realmSet$tg14(realmObjectSource.realmGet$tg14());
        realmObjectTarget.realmSet$tg15(realmObjectSource.realmGet$tg15());
        realmObjectTarget.realmSet$tg16(realmObjectSource.realmGet$tg16());
        realmObjectTarget.realmSet$tg17(realmObjectSource.realmGet$tg17());
        realmObjectTarget.realmSet$tg18(realmObjectSource.realmGet$tg18());
        realmObjectTarget.realmSet$tg19(realmObjectSource.realmGet$tg19());
        realmObjectTarget.realmSet$tg20(realmObjectSource.realmGet$tg20());
        realmObjectTarget.realmSet$tg21(realmObjectSource.realmGet$tg21());
        realmObjectTarget.realmSet$tg22(realmObjectSource.realmGet$tg22());
        realmObjectTarget.realmSet$tg23(realmObjectSource.realmGet$tg23());
        realmObjectTarget.realmSet$tg24(realmObjectSource.realmGet$tg24());
        realmObjectTarget.realmSet$tg25(realmObjectSource.realmGet$tg25());
        realmObjectTarget.realmSet$tg26(realmObjectSource.realmGet$tg26());
        realmObjectTarget.realmSet$tg27(realmObjectSource.realmGet$tg27());
        realmObjectTarget.realmSet$tg28(realmObjectSource.realmGet$tg28());
        realmObjectTarget.realmSet$tg29(realmObjectSource.realmGet$tg29());
        realmObjectTarget.realmSet$tg30(realmObjectSource.realmGet$tg30());
        realmObjectTarget.realmSet$tg31(realmObjectSource.realmGet$tg31());
        realmObjectTarget.realmSet$jdebit1(realmObjectSource.realmGet$jdebit1());
        realmObjectTarget.realmSet$rata1(realmObjectSource.realmGet$rata1());
        realmObjectTarget.realmSet$rata2(realmObjectSource.realmGet$rata2());
        realmObjectTarget.realmSet$rata3(realmObjectSource.realmGet$rata3());
        realmObjectTarget.realmSet$rata4(realmObjectSource.realmGet$rata4());
        realmObjectTarget.realmSet$cara_ukur1(realmObjectSource.realmGet$cara_ukur1());
        realmObjectTarget.realmSet$cara_ukur2(realmObjectSource.realmGet$cara_ukur2());
        realmObjectTarget.realmSet$cara_ukur3(realmObjectSource.realmGet$cara_ukur3());
        realmObjectTarget.realmSet$cara_ukur4(realmObjectSource.realmGet$cara_ukur4());
        realmObjectTarget.realmSet$kon_ukur1(realmObjectSource.realmGet$kon_ukur1());
        realmObjectTarget.realmSet$kon_ukur2(realmObjectSource.realmGet$kon_ukur2());
        realmObjectTarget.realmSet$kon_ukur3(realmObjectSource.realmGet$kon_ukur3());
        realmObjectTarget.realmSet$kon_ukur4(realmObjectSource.realmGet$kon_ukur4());
        realmObjectTarget.realmSet$jdebit2(realmObjectSource.realmGet$jdebit2());
        realmObjectTarget.realmSet$jdebit3(realmObjectSource.realmGet$jdebit3());
        realmObjectTarget.realmSet$jdebit4(realmObjectSource.realmGet$jdebit4());
        realmObjectTarget.realmSet$ql(realmObjectSource.realmGet$ql());
        realmObjectTarget.realmSet$ql1(realmObjectSource.realmGet$ql1());
        realmObjectTarget.realmSet$ql2(realmObjectSource.realmGet$ql2());
        realmObjectTarget.realmSet$ql3(realmObjectSource.realmGet$ql3());
        realmObjectTarget.realmSet$ql4(realmObjectSource.realmGet$ql4());
        realmObjectTarget.realmSet$qh(realmObjectSource.realmGet$qh());
        realmObjectTarget.realmSet$qh1(realmObjectSource.realmGet$qh1());
        realmObjectTarget.realmSet$qh2(realmObjectSource.realmGet$qh2());
        realmObjectTarget.realmSet$qh3(realmObjectSource.realmGet$qh3());
        realmObjectTarget.realmSet$qh4(realmObjectSource.realmGet$qh4());
        realmObjectTarget.realmSet$qs(realmObjectSource.realmGet$qs());
        realmObjectTarget.realmSet$qs1(realmObjectSource.realmGet$qs1());
        realmObjectTarget.realmSet$qs2(realmObjectSource.realmGet$qs2());
        realmObjectTarget.realmSet$qs3(realmObjectSource.realmGet$qs3());
        realmObjectTarget.realmSet$qs4(realmObjectSource.realmGet$qs4());
        realmObjectTarget.realmSet$pelaksana(realmObjectSource.realmGet$pelaksana());
        realmObjectTarget.realmSet$verify(realmObjectSource.realmGet$verify());
        realmObjectTarget.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectTarget.realmSet$petak_tersier_rcn(realmObjectSource.realmGet$petak_tersier_rcn());
        realmObjectTarget.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectTarget.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectTarget.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectTarget.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectTarget.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectTarget.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectTarget.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Blanko06 = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_staf:");
        stringBuilder.append(realmGet$kd_staf() != null ? realmGet$kd_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_mt:");
        stringBuilder.append(realmGet$kd_mt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thbln:");
        stringBuilder.append(realmGet$thbln() != null ? realmGet$thbln() : "null");
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
        stringBuilder.append("{urutan:");
        stringBuilder.append(realmGet$urutan());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg01:");
        stringBuilder.append(realmGet$tg01());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg02:");
        stringBuilder.append(realmGet$tg02());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg03:");
        stringBuilder.append(realmGet$tg03());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg04:");
        stringBuilder.append(realmGet$tg04());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg05:");
        stringBuilder.append(realmGet$tg05());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg06:");
        stringBuilder.append(realmGet$tg06());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg07:");
        stringBuilder.append(realmGet$tg07());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg08:");
        stringBuilder.append(realmGet$tg08());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg09:");
        stringBuilder.append(realmGet$tg09());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg10:");
        stringBuilder.append(realmGet$tg10());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg11:");
        stringBuilder.append(realmGet$tg11());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg12:");
        stringBuilder.append(realmGet$tg12());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg13:");
        stringBuilder.append(realmGet$tg13());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg14:");
        stringBuilder.append(realmGet$tg14());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg15:");
        stringBuilder.append(realmGet$tg15());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg16:");
        stringBuilder.append(realmGet$tg16());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg17:");
        stringBuilder.append(realmGet$tg17());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg18:");
        stringBuilder.append(realmGet$tg18());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg19:");
        stringBuilder.append(realmGet$tg19());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg20:");
        stringBuilder.append(realmGet$tg20());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg21:");
        stringBuilder.append(realmGet$tg21());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg22:");
        stringBuilder.append(realmGet$tg22());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg23:");
        stringBuilder.append(realmGet$tg23());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg24:");
        stringBuilder.append(realmGet$tg24());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg25:");
        stringBuilder.append(realmGet$tg25());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg26:");
        stringBuilder.append(realmGet$tg26());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg27:");
        stringBuilder.append(realmGet$tg27());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg28:");
        stringBuilder.append(realmGet$tg28());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg29:");
        stringBuilder.append(realmGet$tg29());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg30:");
        stringBuilder.append(realmGet$tg30());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tg31:");
        stringBuilder.append(realmGet$tg31());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jdebit1:");
        stringBuilder.append(realmGet$jdebit1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rata1:");
        stringBuilder.append(realmGet$rata1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rata2:");
        stringBuilder.append(realmGet$rata2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rata3:");
        stringBuilder.append(realmGet$rata3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rata4:");
        stringBuilder.append(realmGet$rata4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cara_ukur1:");
        stringBuilder.append(realmGet$cara_ukur1() != null ? realmGet$cara_ukur1() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cara_ukur2:");
        stringBuilder.append(realmGet$cara_ukur2() != null ? realmGet$cara_ukur2() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cara_ukur3:");
        stringBuilder.append(realmGet$cara_ukur3() != null ? realmGet$cara_ukur3() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cara_ukur4:");
        stringBuilder.append(realmGet$cara_ukur4() != null ? realmGet$cara_ukur4() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kon_ukur1:");
        stringBuilder.append(realmGet$kon_ukur1() != null ? realmGet$kon_ukur1() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kon_ukur2:");
        stringBuilder.append(realmGet$kon_ukur2() != null ? realmGet$kon_ukur2() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kon_ukur3:");
        stringBuilder.append(realmGet$kon_ukur3() != null ? realmGet$kon_ukur3() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kon_ukur4:");
        stringBuilder.append(realmGet$kon_ukur4() != null ? realmGet$kon_ukur4() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jdebit2:");
        stringBuilder.append(realmGet$jdebit2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jdebit3:");
        stringBuilder.append(realmGet$jdebit3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jdebit4:");
        stringBuilder.append(realmGet$jdebit4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ql:");
        stringBuilder.append(realmGet$ql());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ql1:");
        stringBuilder.append(realmGet$ql1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ql2:");
        stringBuilder.append(realmGet$ql2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ql3:");
        stringBuilder.append(realmGet$ql3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ql4:");
        stringBuilder.append(realmGet$ql4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qh:");
        stringBuilder.append(realmGet$qh());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qh1:");
        stringBuilder.append(realmGet$qh1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qh2:");
        stringBuilder.append(realmGet$qh2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qh3:");
        stringBuilder.append(realmGet$qh3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qh4:");
        stringBuilder.append(realmGet$qh4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qs:");
        stringBuilder.append(realmGet$qs());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qs1:");
        stringBuilder.append(realmGet$qs1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qs2:");
        stringBuilder.append(realmGet$qs2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qs3:");
        stringBuilder.append(realmGet$qs3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qs4:");
        stringBuilder.append(realmGet$qs4());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pelaksana:");
        stringBuilder.append(realmGet$pelaksana() != null ? realmGet$pelaksana() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{verify:");
        stringBuilder.append(realmGet$verify());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{petak_tersier:");
        stringBuilder.append(realmGet$petak_tersier());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{petak_tersier_rcn:");
        stringBuilder.append(realmGet$petak_tersier_rcn());
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
        com_pusair_smopi_Model_Blanko06RealmProxy aBlanko06 = (com_pusair_smopi_Model_Blanko06RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlanko06.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlanko06.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlanko06.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
