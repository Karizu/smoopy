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
public class com_pusair_smopi_Model_Blanko04BangtrolRealmProxy extends com.pusair.smopi.Model.Blanko04Bangtrol
    implements RealmObjectProxy, com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface {

    static final class Blanko04BangtrolColumnInfo extends ColumnInfo {
        long idIndex;
        long kd_stafIndex;
        long kd_mtIndex;
        long urut_mtIndex;
        long thblnIndex;
        long poda_airIndex;
        long nm_bangtrolIndex;
        long tmt_bangtrolIndex;
        long luas_swiriIndex;
        long us_padi_olahtanahIndex;
        long us_padi_tumbuhIndex;
        long us_padi_panenIndex;
        long us_tebu_olahtanahIndex;
        long us_tebu_mudaIndex;
        long us_tebu_tuaIndex;
        long us_wija_byk_airIndex;
        long us_wija_dkt_airIndex;
        long us_gaduIndex;
        long us_lainIndex;
        long us_beroIndex;
        long tgleditIndex;
        long ka_padi_olahtanahIndex;
        long ka_padi_tumbuhIndex;
        long ka_padi_panenIndex;
        long ka_tebu_olahtanahIndex;
        long ka_tebu_mudaIndex;
        long ka_tebu_tuaIndex;
        long ka_wija_byk_airIndex;
        long ka_wija_dkt_airIndex;
        long keb_air_bangtrolIndex;
        long urutanIndex;
        long petak_tersierIndex;
        long petak_tersier_rcnIndex;
        long padiIndex;
        long tebu_tuaIndex;
        long tebu_mudaIndex;
        long palawijaIndex;
        long lainIndex;
        long beroIndex;
        long golIndex;
        long tgl_airawIndex;
        long tgl_airakIndex;
        long tgl_mtIndex;
        long flagIndex;
        long deleterecIndex;
        long insertIndex;
        long updateIndex;
        long skip_updateIndex;
        long deleteIndex;
        long rec_baru_serverIndex;

        Blanko04BangtrolColumnInfo(OsSchemaInfo schemaInfo) {
            super(50);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Blanko04Bangtrol");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kd_mtIndex = addColumnDetails("kd_mt", "kd_mt", objectSchemaInfo);
            this.urut_mtIndex = addColumnDetails("urut_mt", "urut_mt", objectSchemaInfo);
            this.thblnIndex = addColumnDetails("thbln", "thbln", objectSchemaInfo);
            this.poda_airIndex = addColumnDetails("poda_air", "poda_air", objectSchemaInfo);
            this.nm_bangtrolIndex = addColumnDetails("nm_bangtrol", "nm_bangtrol", objectSchemaInfo);
            this.tmt_bangtrolIndex = addColumnDetails("tmt_bangtrol", "tmt_bangtrol", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.us_padi_olahtanahIndex = addColumnDetails("us_padi_olahtanah", "us_padi_olahtanah", objectSchemaInfo);
            this.us_padi_tumbuhIndex = addColumnDetails("us_padi_tumbuh", "us_padi_tumbuh", objectSchemaInfo);
            this.us_padi_panenIndex = addColumnDetails("us_padi_panen", "us_padi_panen", objectSchemaInfo);
            this.us_tebu_olahtanahIndex = addColumnDetails("us_tebu_olahtanah", "us_tebu_olahtanah", objectSchemaInfo);
            this.us_tebu_mudaIndex = addColumnDetails("us_tebu_muda", "us_tebu_muda", objectSchemaInfo);
            this.us_tebu_tuaIndex = addColumnDetails("us_tebu_tua", "us_tebu_tua", objectSchemaInfo);
            this.us_wija_byk_airIndex = addColumnDetails("us_wija_byk_air", "us_wija_byk_air", objectSchemaInfo);
            this.us_wija_dkt_airIndex = addColumnDetails("us_wija_dkt_air", "us_wija_dkt_air", objectSchemaInfo);
            this.us_gaduIndex = addColumnDetails("us_gadu", "us_gadu", objectSchemaInfo);
            this.us_lainIndex = addColumnDetails("us_lain", "us_lain", objectSchemaInfo);
            this.us_beroIndex = addColumnDetails("us_bero", "us_bero", objectSchemaInfo);
            this.tgleditIndex = addColumnDetails("tgledit", "tgledit", objectSchemaInfo);
            this.ka_padi_olahtanahIndex = addColumnDetails("ka_padi_olahtanah", "ka_padi_olahtanah", objectSchemaInfo);
            this.ka_padi_tumbuhIndex = addColumnDetails("ka_padi_tumbuh", "ka_padi_tumbuh", objectSchemaInfo);
            this.ka_padi_panenIndex = addColumnDetails("ka_padi_panen", "ka_padi_panen", objectSchemaInfo);
            this.ka_tebu_olahtanahIndex = addColumnDetails("ka_tebu_olahtanah", "ka_tebu_olahtanah", objectSchemaInfo);
            this.ka_tebu_mudaIndex = addColumnDetails("ka_tebu_muda", "ka_tebu_muda", objectSchemaInfo);
            this.ka_tebu_tuaIndex = addColumnDetails("ka_tebu_tua", "ka_tebu_tua", objectSchemaInfo);
            this.ka_wija_byk_airIndex = addColumnDetails("ka_wija_byk_air", "ka_wija_byk_air", objectSchemaInfo);
            this.ka_wija_dkt_airIndex = addColumnDetails("ka_wija_dkt_air", "ka_wija_dkt_air", objectSchemaInfo);
            this.keb_air_bangtrolIndex = addColumnDetails("keb_air_bangtrol", "keb_air_bangtrol", objectSchemaInfo);
            this.urutanIndex = addColumnDetails("urutan", "urutan", objectSchemaInfo);
            this.petak_tersierIndex = addColumnDetails("petak_tersier", "petak_tersier", objectSchemaInfo);
            this.petak_tersier_rcnIndex = addColumnDetails("petak_tersier_rcn", "petak_tersier_rcn", objectSchemaInfo);
            this.padiIndex = addColumnDetails("padi", "padi", objectSchemaInfo);
            this.tebu_tuaIndex = addColumnDetails("tebu_tua", "tebu_tua", objectSchemaInfo);
            this.tebu_mudaIndex = addColumnDetails("tebu_muda", "tebu_muda", objectSchemaInfo);
            this.palawijaIndex = addColumnDetails("palawija", "palawija", objectSchemaInfo);
            this.lainIndex = addColumnDetails("lain", "lain", objectSchemaInfo);
            this.beroIndex = addColumnDetails("bero", "bero", objectSchemaInfo);
            this.golIndex = addColumnDetails("gol", "gol", objectSchemaInfo);
            this.tgl_airawIndex = addColumnDetails("tgl_airaw", "tgl_airaw", objectSchemaInfo);
            this.tgl_airakIndex = addColumnDetails("tgl_airak", "tgl_airak", objectSchemaInfo);
            this.tgl_mtIndex = addColumnDetails("tgl_mt", "tgl_mt", objectSchemaInfo);
            this.flagIndex = addColumnDetails("flag", "flag", objectSchemaInfo);
            this.deleterecIndex = addColumnDetails("deleterec", "deleterec", objectSchemaInfo);
            this.insertIndex = addColumnDetails("insert", "insert", objectSchemaInfo);
            this.updateIndex = addColumnDetails("update", "update", objectSchemaInfo);
            this.skip_updateIndex = addColumnDetails("skip_update", "skip_update", objectSchemaInfo);
            this.deleteIndex = addColumnDetails("delete", "delete", objectSchemaInfo);
            this.rec_baru_serverIndex = addColumnDetails("rec_baru_server", "rec_baru_server", objectSchemaInfo);
        }

        Blanko04BangtrolColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Blanko04BangtrolColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Blanko04BangtrolColumnInfo src = (Blanko04BangtrolColumnInfo) rawSrc;
            final Blanko04BangtrolColumnInfo dst = (Blanko04BangtrolColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kd_mtIndex = src.kd_mtIndex;
            dst.urut_mtIndex = src.urut_mtIndex;
            dst.thblnIndex = src.thblnIndex;
            dst.poda_airIndex = src.poda_airIndex;
            dst.nm_bangtrolIndex = src.nm_bangtrolIndex;
            dst.tmt_bangtrolIndex = src.tmt_bangtrolIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.us_padi_olahtanahIndex = src.us_padi_olahtanahIndex;
            dst.us_padi_tumbuhIndex = src.us_padi_tumbuhIndex;
            dst.us_padi_panenIndex = src.us_padi_panenIndex;
            dst.us_tebu_olahtanahIndex = src.us_tebu_olahtanahIndex;
            dst.us_tebu_mudaIndex = src.us_tebu_mudaIndex;
            dst.us_tebu_tuaIndex = src.us_tebu_tuaIndex;
            dst.us_wija_byk_airIndex = src.us_wija_byk_airIndex;
            dst.us_wija_dkt_airIndex = src.us_wija_dkt_airIndex;
            dst.us_gaduIndex = src.us_gaduIndex;
            dst.us_lainIndex = src.us_lainIndex;
            dst.us_beroIndex = src.us_beroIndex;
            dst.tgleditIndex = src.tgleditIndex;
            dst.ka_padi_olahtanahIndex = src.ka_padi_olahtanahIndex;
            dst.ka_padi_tumbuhIndex = src.ka_padi_tumbuhIndex;
            dst.ka_padi_panenIndex = src.ka_padi_panenIndex;
            dst.ka_tebu_olahtanahIndex = src.ka_tebu_olahtanahIndex;
            dst.ka_tebu_mudaIndex = src.ka_tebu_mudaIndex;
            dst.ka_tebu_tuaIndex = src.ka_tebu_tuaIndex;
            dst.ka_wija_byk_airIndex = src.ka_wija_byk_airIndex;
            dst.ka_wija_dkt_airIndex = src.ka_wija_dkt_airIndex;
            dst.keb_air_bangtrolIndex = src.keb_air_bangtrolIndex;
            dst.urutanIndex = src.urutanIndex;
            dst.petak_tersierIndex = src.petak_tersierIndex;
            dst.petak_tersier_rcnIndex = src.petak_tersier_rcnIndex;
            dst.padiIndex = src.padiIndex;
            dst.tebu_tuaIndex = src.tebu_tuaIndex;
            dst.tebu_mudaIndex = src.tebu_mudaIndex;
            dst.palawijaIndex = src.palawijaIndex;
            dst.lainIndex = src.lainIndex;
            dst.beroIndex = src.beroIndex;
            dst.golIndex = src.golIndex;
            dst.tgl_airawIndex = src.tgl_airawIndex;
            dst.tgl_airakIndex = src.tgl_airakIndex;
            dst.tgl_mtIndex = src.tgl_mtIndex;
            dst.flagIndex = src.flagIndex;
            dst.deleterecIndex = src.deleterecIndex;
            dst.insertIndex = src.insertIndex;
            dst.updateIndex = src.updateIndex;
            dst.skip_updateIndex = src.skip_updateIndex;
            dst.deleteIndex = src.deleteIndex;
            dst.rec_baru_serverIndex = src.rec_baru_serverIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Blanko04BangtrolColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.Blanko04Bangtrol> proxyState;

    com_pusair_smopi_Model_Blanko04BangtrolRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Blanko04BangtrolColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.Blanko04Bangtrol>(this);
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
    public String realmGet$urut_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urut_mtIndex);
    }

    @Override
    public void realmSet$urut_mt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urut_mtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urut_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urut_mtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urut_mtIndex, value);
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
    public int realmGet$poda_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.poda_airIndex);
    }

    @Override
    public void realmSet$poda_air(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.poda_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.poda_airIndex, value);
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
    public float realmGet$us_padi_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_olahtanahIndex);
    }

    @Override
    public void realmSet$us_padi_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_padi_tumbuh() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_tumbuhIndex);
    }

    @Override
    public void realmSet$us_padi_tumbuh(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_tumbuhIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_tumbuhIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_padi_panen() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_padi_panenIndex);
    }

    @Override
    public void realmSet$us_padi_panen(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_padi_panenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_padi_panenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_olahtanahIndex);
    }

    @Override
    public void realmSet$us_tebu_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_mudaIndex);
    }

    @Override
    public void realmSet$us_tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_tebu_tuaIndex);
    }

    @Override
    public void realmSet$us_tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_wija_byk_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_wija_byk_airIndex);
    }

    @Override
    public void realmSet$us_wija_byk_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_wija_byk_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_wija_byk_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_wija_dkt_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_wija_dkt_airIndex);
    }

    @Override
    public void realmSet$us_wija_dkt_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_wija_dkt_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_wija_dkt_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_gadu() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_gaduIndex);
    }

    @Override
    public void realmSet$us_gadu(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_gaduIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_gaduIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_lainIndex);
    }

    @Override
    public void realmSet$us_lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$us_bero() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.us_beroIndex);
    }

    @Override
    public void realmSet$us_bero(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.us_beroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.us_beroIndex, value);
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
    public float realmGet$ka_padi_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_padi_olahtanahIndex);
    }

    @Override
    public void realmSet$ka_padi_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_padi_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_padi_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_padi_tumbuh() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_padi_tumbuhIndex);
    }

    @Override
    public void realmSet$ka_padi_tumbuh(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_padi_tumbuhIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_padi_tumbuhIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_padi_panen() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_padi_panenIndex);
    }

    @Override
    public void realmSet$ka_padi_panen(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_padi_panenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_padi_panenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_tebu_olahtanah() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_tebu_olahtanahIndex);
    }

    @Override
    public void realmSet$ka_tebu_olahtanah(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_tebu_olahtanahIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_tebu_olahtanahIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_tebu_mudaIndex);
    }

    @Override
    public void realmSet$ka_tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_tebu_tuaIndex);
    }

    @Override
    public void realmSet$ka_tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_wija_byk_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_wija_byk_airIndex);
    }

    @Override
    public void realmSet$ka_wija_byk_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_wija_byk_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_wija_byk_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$ka_wija_dkt_air() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ka_wija_dkt_airIndex);
    }

    @Override
    public void realmSet$ka_wija_dkt_air(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ka_wija_dkt_airIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ka_wija_dkt_airIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$keb_air_bangtrol() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.keb_air_bangtrolIndex);
    }

    @Override
    public void realmSet$keb_air_bangtrol(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.keb_air_bangtrolIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.keb_air_bangtrolIndex, value);
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
    public float realmGet$padi() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.padiIndex);
    }

    @Override
    public void realmSet$padi(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.padiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.padiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_tua() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_tuaIndex);
    }

    @Override
    public void realmSet$tebu_tua(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_tuaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_tuaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$tebu_muda() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tebu_mudaIndex);
    }

    @Override
    public void realmSet$tebu_muda(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.tebu_mudaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.tebu_mudaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$palawija() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.palawijaIndex);
    }

    @Override
    public void realmSet$palawija(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.palawijaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.palawijaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$lain() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.lainIndex);
    }

    @Override
    public void realmSet$lain(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.lainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.lainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$bero() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.beroIndex);
    }

    @Override
    public void realmSet$bero(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.beroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.beroIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$gol() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.golIndex);
    }

    @Override
    public void realmSet$gol(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.golIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.golIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_airaw() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_airawIndex);
    }

    @Override
    public void realmSet$tgl_airaw(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_airawIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_airawIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_airawIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_airawIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_airak() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_airakIndex);
    }

    @Override
    public void realmSet$tgl_airak(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_airakIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_airakIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_airakIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_airakIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tgl_mt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tgl_mtIndex);
    }

    @Override
    public void realmSet$tgl_mt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tgl_mtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tgl_mtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tgl_mtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tgl_mtIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Blanko04Bangtrol", 50, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_mt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("urut_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thbln", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("poda_air", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_tumbuh", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_padi_panen", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_wija_byk_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_wija_dkt_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_gadu", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("us_bero", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgledit", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ka_padi_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_padi_tumbuh", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_padi_panen", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_tebu_olahtanah", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_wija_byk_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("ka_wija_dkt_air", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("keb_air_bangtrol", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("urutan", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier_rcn", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("padi", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_tua", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tebu_muda", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("palawija", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lain", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("bero", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("gol", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tgl_airaw", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_airak", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tgl_mt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flag", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("deleterec", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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

    public static Blanko04BangtrolColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Blanko04BangtrolColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Blanko04Bangtrol";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Blanko04Bangtrol";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.Blanko04Bangtrol createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pusair.smopi.Model.Blanko04Bangtrol obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
            Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko04Bangtrol.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.Blanko04Bangtrol.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) obj;
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
        if (json.has("urut_mt")) {
            if (json.isNull("urut_mt")) {
                objProxy.realmSet$urut_mt(null);
            } else {
                objProxy.realmSet$urut_mt((String) json.getString("urut_mt"));
            }
        }
        if (json.has("thbln")) {
            if (json.isNull("thbln")) {
                objProxy.realmSet$thbln(null);
            } else {
                objProxy.realmSet$thbln((String) json.getString("thbln"));
            }
        }
        if (json.has("poda_air")) {
            if (json.isNull("poda_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'poda_air' to null.");
            } else {
                objProxy.realmSet$poda_air((int) json.getInt("poda_air"));
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
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("us_padi_olahtanah")) {
            if (json.isNull("us_padi_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_olahtanah' to null.");
            } else {
                objProxy.realmSet$us_padi_olahtanah((float) json.getDouble("us_padi_olahtanah"));
            }
        }
        if (json.has("us_padi_tumbuh")) {
            if (json.isNull("us_padi_tumbuh")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_tumbuh' to null.");
            } else {
                objProxy.realmSet$us_padi_tumbuh((float) json.getDouble("us_padi_tumbuh"));
            }
        }
        if (json.has("us_padi_panen")) {
            if (json.isNull("us_padi_panen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_panen' to null.");
            } else {
                objProxy.realmSet$us_padi_panen((float) json.getDouble("us_padi_panen"));
            }
        }
        if (json.has("us_tebu_olahtanah")) {
            if (json.isNull("us_tebu_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_olahtanah' to null.");
            } else {
                objProxy.realmSet$us_tebu_olahtanah((float) json.getDouble("us_tebu_olahtanah"));
            }
        }
        if (json.has("us_tebu_muda")) {
            if (json.isNull("us_tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_muda' to null.");
            } else {
                objProxy.realmSet$us_tebu_muda((float) json.getDouble("us_tebu_muda"));
            }
        }
        if (json.has("us_tebu_tua")) {
            if (json.isNull("us_tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_tua' to null.");
            } else {
                objProxy.realmSet$us_tebu_tua((float) json.getDouble("us_tebu_tua"));
            }
        }
        if (json.has("us_wija_byk_air")) {
            if (json.isNull("us_wija_byk_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_byk_air' to null.");
            } else {
                objProxy.realmSet$us_wija_byk_air((float) json.getDouble("us_wija_byk_air"));
            }
        }
        if (json.has("us_wija_dkt_air")) {
            if (json.isNull("us_wija_dkt_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_dkt_air' to null.");
            } else {
                objProxy.realmSet$us_wija_dkt_air((float) json.getDouble("us_wija_dkt_air"));
            }
        }
        if (json.has("us_gadu")) {
            if (json.isNull("us_gadu")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_gadu' to null.");
            } else {
                objProxy.realmSet$us_gadu((float) json.getDouble("us_gadu"));
            }
        }
        if (json.has("us_lain")) {
            if (json.isNull("us_lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_lain' to null.");
            } else {
                objProxy.realmSet$us_lain((float) json.getDouble("us_lain"));
            }
        }
        if (json.has("us_bero")) {
            if (json.isNull("us_bero")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'us_bero' to null.");
            } else {
                objProxy.realmSet$us_bero((float) json.getDouble("us_bero"));
            }
        }
        if (json.has("tgledit")) {
            if (json.isNull("tgledit")) {
                objProxy.realmSet$tgledit(null);
            } else {
                objProxy.realmSet$tgledit((String) json.getString("tgledit"));
            }
        }
        if (json.has("ka_padi_olahtanah")) {
            if (json.isNull("ka_padi_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_olahtanah' to null.");
            } else {
                objProxy.realmSet$ka_padi_olahtanah((float) json.getDouble("ka_padi_olahtanah"));
            }
        }
        if (json.has("ka_padi_tumbuh")) {
            if (json.isNull("ka_padi_tumbuh")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_tumbuh' to null.");
            } else {
                objProxy.realmSet$ka_padi_tumbuh((float) json.getDouble("ka_padi_tumbuh"));
            }
        }
        if (json.has("ka_padi_panen")) {
            if (json.isNull("ka_padi_panen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_panen' to null.");
            } else {
                objProxy.realmSet$ka_padi_panen((float) json.getDouble("ka_padi_panen"));
            }
        }
        if (json.has("ka_tebu_olahtanah")) {
            if (json.isNull("ka_tebu_olahtanah")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_olahtanah' to null.");
            } else {
                objProxy.realmSet$ka_tebu_olahtanah((float) json.getDouble("ka_tebu_olahtanah"));
            }
        }
        if (json.has("ka_tebu_muda")) {
            if (json.isNull("ka_tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_muda' to null.");
            } else {
                objProxy.realmSet$ka_tebu_muda((float) json.getDouble("ka_tebu_muda"));
            }
        }
        if (json.has("ka_tebu_tua")) {
            if (json.isNull("ka_tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_tua' to null.");
            } else {
                objProxy.realmSet$ka_tebu_tua((float) json.getDouble("ka_tebu_tua"));
            }
        }
        if (json.has("ka_wija_byk_air")) {
            if (json.isNull("ka_wija_byk_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_wija_byk_air' to null.");
            } else {
                objProxy.realmSet$ka_wija_byk_air((float) json.getDouble("ka_wija_byk_air"));
            }
        }
        if (json.has("ka_wija_dkt_air")) {
            if (json.isNull("ka_wija_dkt_air")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ka_wija_dkt_air' to null.");
            } else {
                objProxy.realmSet$ka_wija_dkt_air((float) json.getDouble("ka_wija_dkt_air"));
            }
        }
        if (json.has("keb_air_bangtrol")) {
            if (json.isNull("keb_air_bangtrol")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'keb_air_bangtrol' to null.");
            } else {
                objProxy.realmSet$keb_air_bangtrol((float) json.getDouble("keb_air_bangtrol"));
            }
        }
        if (json.has("urutan")) {
            if (json.isNull("urutan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
            } else {
                objProxy.realmSet$urutan((int) json.getInt("urutan"));
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
        if (json.has("padi")) {
            if (json.isNull("padi")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'padi' to null.");
            } else {
                objProxy.realmSet$padi((float) json.getDouble("padi"));
            }
        }
        if (json.has("tebu_tua")) {
            if (json.isNull("tebu_tua")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_tua' to null.");
            } else {
                objProxy.realmSet$tebu_tua((float) json.getDouble("tebu_tua"));
            }
        }
        if (json.has("tebu_muda")) {
            if (json.isNull("tebu_muda")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_muda' to null.");
            } else {
                objProxy.realmSet$tebu_muda((float) json.getDouble("tebu_muda"));
            }
        }
        if (json.has("palawija")) {
            if (json.isNull("palawija")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'palawija' to null.");
            } else {
                objProxy.realmSet$palawija((float) json.getDouble("palawija"));
            }
        }
        if (json.has("lain")) {
            if (json.isNull("lain")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lain' to null.");
            } else {
                objProxy.realmSet$lain((float) json.getDouble("lain"));
            }
        }
        if (json.has("bero")) {
            if (json.isNull("bero")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bero' to null.");
            } else {
                objProxy.realmSet$bero((float) json.getDouble("bero"));
            }
        }
        if (json.has("gol")) {
            if (json.isNull("gol")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'gol' to null.");
            } else {
                objProxy.realmSet$gol((int) json.getInt("gol"));
            }
        }
        if (json.has("tgl_airaw")) {
            if (json.isNull("tgl_airaw")) {
                objProxy.realmSet$tgl_airaw(null);
            } else {
                objProxy.realmSet$tgl_airaw((String) json.getString("tgl_airaw"));
            }
        }
        if (json.has("tgl_airak")) {
            if (json.isNull("tgl_airak")) {
                objProxy.realmSet$tgl_airak(null);
            } else {
                objProxy.realmSet$tgl_airak((String) json.getString("tgl_airak"));
            }
        }
        if (json.has("tgl_mt")) {
            if (json.isNull("tgl_mt")) {
                objProxy.realmSet$tgl_mt(null);
            } else {
                objProxy.realmSet$tgl_mt((String) json.getString("tgl_mt"));
            }
        }
        if (json.has("flag")) {
            if (json.isNull("flag")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
            } else {
                objProxy.realmSet$flag((boolean) json.getBoolean("flag"));
            }
        }
        if (json.has("deleterec")) {
            if (json.isNull("deleterec")) {
                objProxy.realmSet$deleterec(null);
            } else {
                objProxy.realmSet$deleterec((String) json.getString("deleterec"));
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
    public static com.pusair.smopi.Model.Blanko04Bangtrol createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.Blanko04Bangtrol obj = new com.pusair.smopi.Model.Blanko04Bangtrol();
        final com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface objProxy = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) obj;
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
            } else if (name.equals("urut_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urut_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$urut_mt(null);
                }
            } else if (name.equals("thbln")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thbln((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thbln(null);
                }
            } else if (name.equals("poda_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$poda_air((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'poda_air' to null.");
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
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("us_padi_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_olahtanah' to null.");
                }
            } else if (name.equals("us_padi_tumbuh")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_tumbuh((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_tumbuh' to null.");
                }
            } else if (name.equals("us_padi_panen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_padi_panen((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_padi_panen' to null.");
                }
            } else if (name.equals("us_tebu_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_olahtanah' to null.");
                }
            } else if (name.equals("us_tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_muda' to null.");
                }
            } else if (name.equals("us_tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_tebu_tua' to null.");
                }
            } else if (name.equals("us_wija_byk_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_wija_byk_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_byk_air' to null.");
                }
            } else if (name.equals("us_wija_dkt_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_wija_dkt_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_wija_dkt_air' to null.");
                }
            } else if (name.equals("us_gadu")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_gadu((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_gadu' to null.");
                }
            } else if (name.equals("us_lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_lain' to null.");
                }
            } else if (name.equals("us_bero")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$us_bero((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'us_bero' to null.");
                }
            } else if (name.equals("tgledit")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgledit((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgledit(null);
                }
            } else if (name.equals("ka_padi_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_padi_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_olahtanah' to null.");
                }
            } else if (name.equals("ka_padi_tumbuh")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_padi_tumbuh((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_tumbuh' to null.");
                }
            } else if (name.equals("ka_padi_panen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_padi_panen((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_padi_panen' to null.");
                }
            } else if (name.equals("ka_tebu_olahtanah")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_tebu_olahtanah((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_olahtanah' to null.");
                }
            } else if (name.equals("ka_tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_muda' to null.");
                }
            } else if (name.equals("ka_tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_tebu_tua' to null.");
                }
            } else if (name.equals("ka_wija_byk_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_wija_byk_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_wija_byk_air' to null.");
                }
            } else if (name.equals("ka_wija_dkt_air")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ka_wija_dkt_air((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ka_wija_dkt_air' to null.");
                }
            } else if (name.equals("keb_air_bangtrol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$keb_air_bangtrol((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'keb_air_bangtrol' to null.");
                }
            } else if (name.equals("urutan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urutan((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'urutan' to null.");
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
            } else if (name.equals("padi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$padi((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'padi' to null.");
                }
            } else if (name.equals("tebu_tua")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_tua((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_tua' to null.");
                }
            } else if (name.equals("tebu_muda")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tebu_muda((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tebu_muda' to null.");
                }
            } else if (name.equals("palawija")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$palawija((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'palawija' to null.");
                }
            } else if (name.equals("lain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lain((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lain' to null.");
                }
            } else if (name.equals("bero")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bero((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bero' to null.");
                }
            } else if (name.equals("gol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gol((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gol' to null.");
                }
            } else if (name.equals("tgl_airaw")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_airaw((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_airaw(null);
                }
            } else if (name.equals("tgl_airak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_airak((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_airak(null);
                }
            } else if (name.equals("tgl_mt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tgl_mt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tgl_mt(null);
                }
            } else if (name.equals("flag")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flag((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'flag' to null.");
                }
            } else if (name.equals("deleterec")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deleterec((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deleterec(null);
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

    public static com.pusair.smopi.Model.Blanko04Bangtrol copyOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko04Bangtrol object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.Blanko04Bangtrol) cachedRealmObject;
        }

        com.pusair.smopi.Model.Blanko04Bangtrol realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
            Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.Blanko04Bangtrol copy(Realm realm, com.pusair.smopi.Model.Blanko04Bangtrol newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.Blanko04Bangtrol) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.Blanko04Bangtrol realmObject = realm.createObjectInternal(com.pusair.smopi.Model.Blanko04Bangtrol.class, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) newObject;
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectCopy.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectCopy.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectCopy.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectCopy.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectCopy.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectCopy.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$us_padi_olahtanah(realmObjectSource.realmGet$us_padi_olahtanah());
        realmObjectCopy.realmSet$us_padi_tumbuh(realmObjectSource.realmGet$us_padi_tumbuh());
        realmObjectCopy.realmSet$us_padi_panen(realmObjectSource.realmGet$us_padi_panen());
        realmObjectCopy.realmSet$us_tebu_olahtanah(realmObjectSource.realmGet$us_tebu_olahtanah());
        realmObjectCopy.realmSet$us_tebu_muda(realmObjectSource.realmGet$us_tebu_muda());
        realmObjectCopy.realmSet$us_tebu_tua(realmObjectSource.realmGet$us_tebu_tua());
        realmObjectCopy.realmSet$us_wija_byk_air(realmObjectSource.realmGet$us_wija_byk_air());
        realmObjectCopy.realmSet$us_wija_dkt_air(realmObjectSource.realmGet$us_wija_dkt_air());
        realmObjectCopy.realmSet$us_gadu(realmObjectSource.realmGet$us_gadu());
        realmObjectCopy.realmSet$us_lain(realmObjectSource.realmGet$us_lain());
        realmObjectCopy.realmSet$us_bero(realmObjectSource.realmGet$us_bero());
        realmObjectCopy.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectCopy.realmSet$ka_padi_olahtanah(realmObjectSource.realmGet$ka_padi_olahtanah());
        realmObjectCopy.realmSet$ka_padi_tumbuh(realmObjectSource.realmGet$ka_padi_tumbuh());
        realmObjectCopy.realmSet$ka_padi_panen(realmObjectSource.realmGet$ka_padi_panen());
        realmObjectCopy.realmSet$ka_tebu_olahtanah(realmObjectSource.realmGet$ka_tebu_olahtanah());
        realmObjectCopy.realmSet$ka_tebu_muda(realmObjectSource.realmGet$ka_tebu_muda());
        realmObjectCopy.realmSet$ka_tebu_tua(realmObjectSource.realmGet$ka_tebu_tua());
        realmObjectCopy.realmSet$ka_wija_byk_air(realmObjectSource.realmGet$ka_wija_byk_air());
        realmObjectCopy.realmSet$ka_wija_dkt_air(realmObjectSource.realmGet$ka_wija_dkt_air());
        realmObjectCopy.realmSet$keb_air_bangtrol(realmObjectSource.realmGet$keb_air_bangtrol());
        realmObjectCopy.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectCopy.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectCopy.realmSet$petak_tersier_rcn(realmObjectSource.realmGet$petak_tersier_rcn());
        realmObjectCopy.realmSet$padi(realmObjectSource.realmGet$padi());
        realmObjectCopy.realmSet$tebu_tua(realmObjectSource.realmGet$tebu_tua());
        realmObjectCopy.realmSet$tebu_muda(realmObjectSource.realmGet$tebu_muda());
        realmObjectCopy.realmSet$palawija(realmObjectSource.realmGet$palawija());
        realmObjectCopy.realmSet$lain(realmObjectSource.realmGet$lain());
        realmObjectCopy.realmSet$bero(realmObjectSource.realmGet$bero());
        realmObjectCopy.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectCopy.realmSet$tgl_airaw(realmObjectSource.realmGet$tgl_airaw());
        realmObjectCopy.realmSet$tgl_airak(realmObjectSource.realmGet$tgl_airak());
        realmObjectCopy.realmSet$tgl_mt(realmObjectSource.realmGet$tgl_mt());
        realmObjectCopy.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectCopy.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
        realmObjectCopy.realmSet$insert(realmObjectSource.realmGet$insert());
        realmObjectCopy.realmSet$update(realmObjectSource.realmGet$update());
        realmObjectCopy.realmSet$skip_update(realmObjectSource.realmGet$skip_update());
        realmObjectCopy.realmSet$delete(realmObjectSource.realmGet$delete());
        realmObjectCopy.realmSet$rec_baru_server(realmObjectSource.realmGet$rec_baru_server());
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.Blanko04Bangtrol object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long tableNativePtr = table.getNativePtr();
        Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        }
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$poda_air(), false);
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$luas_swiri(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_bero(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.keb_air_bangtrolIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$keb_air_bangtrol(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urutan(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$bero(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.golIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$gol(), false);
        String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airaw();
        if (realmGet$tgl_airaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
        }
        String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airak();
        if (realmGet$tgl_airak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
        }
        String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_mt();
        if (realmGet$tgl_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long tableNativePtr = table.getNativePtr();
        Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko04Bangtrol object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko04Bangtrol) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            }
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$poda_air(), false);
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$luas_swiri(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_bero(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.keb_air_bangtrolIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$keb_air_bangtrol(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urutan(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$bero(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.golIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$gol(), false);
            String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airaw();
            if (realmGet$tgl_airaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
            }
            String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airak();
            if (realmGet$tgl_airak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
            }
            String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_mt();
            if (realmGet$tgl_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.Blanko04Bangtrol object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long tableNativePtr = table.getNativePtr();
        Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$id();
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
        String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_staf();
        if (realmGet$kd_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_mt(), false);
        String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urut_mt();
        if (realmGet$urut_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
        }
        String realmGet$thbln = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$thbln();
        if (realmGet$thbln != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$poda_air(), false);
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$luas_swiri(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_gadu(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_bero(), false);
        String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgledit();
        if (realmGet$tgledit != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_tumbuh(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_panen(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_olahtanah(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_byk_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_dkt_air(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.keb_air_bangtrolIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$keb_air_bangtrol(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urutan(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$padi(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_tua(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_muda(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$palawija(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$lain(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$bero(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.golIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$gol(), false);
        String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airaw();
        if (realmGet$tgl_airaw != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, false);
        }
        String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airak();
        if (realmGet$tgl_airak != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, false);
        }
        String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_mt();
        if (realmGet$tgl_mt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$flag(), false);
        String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$deleterec();
        if (realmGet$deleterec != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
        }
        String realmGet$insert = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$insert();
        if (realmGet$insert != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
        }
        String realmGet$update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$update();
        if (realmGet$update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
        }
        String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$skip_update();
        if (realmGet$skip_update != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
        }
        String realmGet$delete = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$delete();
        if (realmGet$delete != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
        }
        String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$rec_baru_server();
        if (realmGet$rec_baru_server != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long tableNativePtr = table.getNativePtr();
        Blanko04BangtrolColumnInfo columnInfo = (Blanko04BangtrolColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pusair.smopi.Model.Blanko04Bangtrol object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.Blanko04Bangtrol) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$id();
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
            String realmGet$kd_staf = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_staf();
            if (realmGet$kd_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, realmGet$kd_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.kd_mtIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$kd_mt(), false);
            String realmGet$urut_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urut_mt();
            if (realmGet$urut_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, realmGet$urut_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urut_mtIndex, rowIndex, false);
            }
            String realmGet$thbln = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$thbln();
            if (realmGet$thbln != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thblnIndex, rowIndex, realmGet$thbln, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thblnIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.poda_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$poda_air(), false);
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$luas_swiri(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_gaduIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_gadu(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.us_beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$us_bero(), false);
            String realmGet$tgledit = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgledit();
            if (realmGet$tgledit != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgleditIndex, rowIndex, realmGet$tgledit, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgleditIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_tumbuhIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_tumbuh(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_padi_panenIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_padi_panen(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_olahtanahIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_olahtanah(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_byk_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_byk_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ka_wija_dkt_airIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$ka_wija_dkt_air(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.keb_air_bangtrolIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$keb_air_bangtrol(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.urutanIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$urutan(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.petak_tersier_rcnIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$petak_tersier_rcn(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.padiIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$padi(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_tuaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_tua(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.tebu_mudaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tebu_muda(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.palawijaIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$palawija(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.lainIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$lain(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.beroIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$bero(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.golIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$gol(), false);
            String realmGet$tgl_airaw = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airaw();
            if (realmGet$tgl_airaw != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, realmGet$tgl_airaw, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airawIndex, rowIndex, false);
            }
            String realmGet$tgl_airak = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_airak();
            if (realmGet$tgl_airak != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, realmGet$tgl_airak, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_airakIndex, rowIndex, false);
            }
            String realmGet$tgl_mt = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$tgl_mt();
            if (realmGet$tgl_mt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, realmGet$tgl_mt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tgl_mtIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.flagIndex, rowIndex, ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$flag(), false);
            String realmGet$deleterec = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$deleterec();
            if (realmGet$deleterec != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleterecIndex, rowIndex, realmGet$deleterec, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleterecIndex, rowIndex, false);
            }
            String realmGet$insert = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$insert();
            if (realmGet$insert != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.insertIndex, rowIndex, realmGet$insert, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.insertIndex, rowIndex, false);
            }
            String realmGet$update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$update();
            if (realmGet$update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.updateIndex, rowIndex, realmGet$update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateIndex, rowIndex, false);
            }
            String realmGet$skip_update = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$skip_update();
            if (realmGet$skip_update != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, realmGet$skip_update, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.skip_updateIndex, rowIndex, false);
            }
            String realmGet$delete = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$delete();
            if (realmGet$delete != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deleteIndex, rowIndex, realmGet$delete, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deleteIndex, rowIndex, false);
            }
            String realmGet$rec_baru_server = ((com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) object).realmGet$rec_baru_server();
            if (realmGet$rec_baru_server != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, realmGet$rec_baru_server, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rec_baru_serverIndex, rowIndex, false);
            }
        }
    }

    public static com.pusair.smopi.Model.Blanko04Bangtrol createDetachedCopy(com.pusair.smopi.Model.Blanko04Bangtrol realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.Blanko04Bangtrol unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.Blanko04Bangtrol();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.Blanko04Bangtrol) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.Blanko04Bangtrol) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface realmSource = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kd_mt(realmSource.realmGet$kd_mt());
        unmanagedCopy.realmSet$urut_mt(realmSource.realmGet$urut_mt());
        unmanagedCopy.realmSet$thbln(realmSource.realmGet$thbln());
        unmanagedCopy.realmSet$poda_air(realmSource.realmGet$poda_air());
        unmanagedCopy.realmSet$nm_bangtrol(realmSource.realmGet$nm_bangtrol());
        unmanagedCopy.realmSet$tmt_bangtrol(realmSource.realmGet$tmt_bangtrol());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$us_padi_olahtanah(realmSource.realmGet$us_padi_olahtanah());
        unmanagedCopy.realmSet$us_padi_tumbuh(realmSource.realmGet$us_padi_tumbuh());
        unmanagedCopy.realmSet$us_padi_panen(realmSource.realmGet$us_padi_panen());
        unmanagedCopy.realmSet$us_tebu_olahtanah(realmSource.realmGet$us_tebu_olahtanah());
        unmanagedCopy.realmSet$us_tebu_muda(realmSource.realmGet$us_tebu_muda());
        unmanagedCopy.realmSet$us_tebu_tua(realmSource.realmGet$us_tebu_tua());
        unmanagedCopy.realmSet$us_wija_byk_air(realmSource.realmGet$us_wija_byk_air());
        unmanagedCopy.realmSet$us_wija_dkt_air(realmSource.realmGet$us_wija_dkt_air());
        unmanagedCopy.realmSet$us_gadu(realmSource.realmGet$us_gadu());
        unmanagedCopy.realmSet$us_lain(realmSource.realmGet$us_lain());
        unmanagedCopy.realmSet$us_bero(realmSource.realmGet$us_bero());
        unmanagedCopy.realmSet$tgledit(realmSource.realmGet$tgledit());
        unmanagedCopy.realmSet$ka_padi_olahtanah(realmSource.realmGet$ka_padi_olahtanah());
        unmanagedCopy.realmSet$ka_padi_tumbuh(realmSource.realmGet$ka_padi_tumbuh());
        unmanagedCopy.realmSet$ka_padi_panen(realmSource.realmGet$ka_padi_panen());
        unmanagedCopy.realmSet$ka_tebu_olahtanah(realmSource.realmGet$ka_tebu_olahtanah());
        unmanagedCopy.realmSet$ka_tebu_muda(realmSource.realmGet$ka_tebu_muda());
        unmanagedCopy.realmSet$ka_tebu_tua(realmSource.realmGet$ka_tebu_tua());
        unmanagedCopy.realmSet$ka_wija_byk_air(realmSource.realmGet$ka_wija_byk_air());
        unmanagedCopy.realmSet$ka_wija_dkt_air(realmSource.realmGet$ka_wija_dkt_air());
        unmanagedCopy.realmSet$keb_air_bangtrol(realmSource.realmGet$keb_air_bangtrol());
        unmanagedCopy.realmSet$urutan(realmSource.realmGet$urutan());
        unmanagedCopy.realmSet$petak_tersier(realmSource.realmGet$petak_tersier());
        unmanagedCopy.realmSet$petak_tersier_rcn(realmSource.realmGet$petak_tersier_rcn());
        unmanagedCopy.realmSet$padi(realmSource.realmGet$padi());
        unmanagedCopy.realmSet$tebu_tua(realmSource.realmGet$tebu_tua());
        unmanagedCopy.realmSet$tebu_muda(realmSource.realmGet$tebu_muda());
        unmanagedCopy.realmSet$palawija(realmSource.realmGet$palawija());
        unmanagedCopy.realmSet$lain(realmSource.realmGet$lain());
        unmanagedCopy.realmSet$bero(realmSource.realmGet$bero());
        unmanagedCopy.realmSet$gol(realmSource.realmGet$gol());
        unmanagedCopy.realmSet$tgl_airaw(realmSource.realmGet$tgl_airaw());
        unmanagedCopy.realmSet$tgl_airak(realmSource.realmGet$tgl_airak());
        unmanagedCopy.realmSet$tgl_mt(realmSource.realmGet$tgl_mt());
        unmanagedCopy.realmSet$flag(realmSource.realmGet$flag());
        unmanagedCopy.realmSet$deleterec(realmSource.realmGet$deleterec());
        unmanagedCopy.realmSet$insert(realmSource.realmGet$insert());
        unmanagedCopy.realmSet$update(realmSource.realmGet$update());
        unmanagedCopy.realmSet$skip_update(realmSource.realmGet$skip_update());
        unmanagedCopy.realmSet$delete(realmSource.realmGet$delete());
        unmanagedCopy.realmSet$rec_baru_server(realmSource.realmGet$rec_baru_server());

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.Blanko04Bangtrol update(Realm realm, com.pusair.smopi.Model.Blanko04Bangtrol realmObject, com.pusair.smopi.Model.Blanko04Bangtrol newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$kd_staf(realmObjectSource.realmGet$kd_staf());
        realmObjectTarget.realmSet$kd_mt(realmObjectSource.realmGet$kd_mt());
        realmObjectTarget.realmSet$urut_mt(realmObjectSource.realmGet$urut_mt());
        realmObjectTarget.realmSet$thbln(realmObjectSource.realmGet$thbln());
        realmObjectTarget.realmSet$poda_air(realmObjectSource.realmGet$poda_air());
        realmObjectTarget.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectTarget.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$us_padi_olahtanah(realmObjectSource.realmGet$us_padi_olahtanah());
        realmObjectTarget.realmSet$us_padi_tumbuh(realmObjectSource.realmGet$us_padi_tumbuh());
        realmObjectTarget.realmSet$us_padi_panen(realmObjectSource.realmGet$us_padi_panen());
        realmObjectTarget.realmSet$us_tebu_olahtanah(realmObjectSource.realmGet$us_tebu_olahtanah());
        realmObjectTarget.realmSet$us_tebu_muda(realmObjectSource.realmGet$us_tebu_muda());
        realmObjectTarget.realmSet$us_tebu_tua(realmObjectSource.realmGet$us_tebu_tua());
        realmObjectTarget.realmSet$us_wija_byk_air(realmObjectSource.realmGet$us_wija_byk_air());
        realmObjectTarget.realmSet$us_wija_dkt_air(realmObjectSource.realmGet$us_wija_dkt_air());
        realmObjectTarget.realmSet$us_gadu(realmObjectSource.realmGet$us_gadu());
        realmObjectTarget.realmSet$us_lain(realmObjectSource.realmGet$us_lain());
        realmObjectTarget.realmSet$us_bero(realmObjectSource.realmGet$us_bero());
        realmObjectTarget.realmSet$tgledit(realmObjectSource.realmGet$tgledit());
        realmObjectTarget.realmSet$ka_padi_olahtanah(realmObjectSource.realmGet$ka_padi_olahtanah());
        realmObjectTarget.realmSet$ka_padi_tumbuh(realmObjectSource.realmGet$ka_padi_tumbuh());
        realmObjectTarget.realmSet$ka_padi_panen(realmObjectSource.realmGet$ka_padi_panen());
        realmObjectTarget.realmSet$ka_tebu_olahtanah(realmObjectSource.realmGet$ka_tebu_olahtanah());
        realmObjectTarget.realmSet$ka_tebu_muda(realmObjectSource.realmGet$ka_tebu_muda());
        realmObjectTarget.realmSet$ka_tebu_tua(realmObjectSource.realmGet$ka_tebu_tua());
        realmObjectTarget.realmSet$ka_wija_byk_air(realmObjectSource.realmGet$ka_wija_byk_air());
        realmObjectTarget.realmSet$ka_wija_dkt_air(realmObjectSource.realmGet$ka_wija_dkt_air());
        realmObjectTarget.realmSet$keb_air_bangtrol(realmObjectSource.realmGet$keb_air_bangtrol());
        realmObjectTarget.realmSet$urutan(realmObjectSource.realmGet$urutan());
        realmObjectTarget.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectTarget.realmSet$petak_tersier_rcn(realmObjectSource.realmGet$petak_tersier_rcn());
        realmObjectTarget.realmSet$padi(realmObjectSource.realmGet$padi());
        realmObjectTarget.realmSet$tebu_tua(realmObjectSource.realmGet$tebu_tua());
        realmObjectTarget.realmSet$tebu_muda(realmObjectSource.realmGet$tebu_muda());
        realmObjectTarget.realmSet$palawija(realmObjectSource.realmGet$palawija());
        realmObjectTarget.realmSet$lain(realmObjectSource.realmGet$lain());
        realmObjectTarget.realmSet$bero(realmObjectSource.realmGet$bero());
        realmObjectTarget.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectTarget.realmSet$tgl_airaw(realmObjectSource.realmGet$tgl_airaw());
        realmObjectTarget.realmSet$tgl_airak(realmObjectSource.realmGet$tgl_airak());
        realmObjectTarget.realmSet$tgl_mt(realmObjectSource.realmGet$tgl_mt());
        realmObjectTarget.realmSet$flag(realmObjectSource.realmGet$flag());
        realmObjectTarget.realmSet$deleterec(realmObjectSource.realmGet$deleterec());
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
        StringBuilder stringBuilder = new StringBuilder("Blanko04Bangtrol = proxy[");
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
        stringBuilder.append("{urut_mt:");
        stringBuilder.append(realmGet$urut_mt() != null ? realmGet$urut_mt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thbln:");
        stringBuilder.append(realmGet$thbln() != null ? realmGet$thbln() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{poda_air:");
        stringBuilder.append(realmGet$poda_air());
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
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_olahtanah:");
        stringBuilder.append(realmGet$us_padi_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_tumbuh:");
        stringBuilder.append(realmGet$us_padi_tumbuh());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_padi_panen:");
        stringBuilder.append(realmGet$us_padi_panen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_olahtanah:");
        stringBuilder.append(realmGet$us_tebu_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_muda:");
        stringBuilder.append(realmGet$us_tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_tebu_tua:");
        stringBuilder.append(realmGet$us_tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_wija_byk_air:");
        stringBuilder.append(realmGet$us_wija_byk_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_wija_dkt_air:");
        stringBuilder.append(realmGet$us_wija_dkt_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_gadu:");
        stringBuilder.append(realmGet$us_gadu());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_lain:");
        stringBuilder.append(realmGet$us_lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{us_bero:");
        stringBuilder.append(realmGet$us_bero());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgledit:");
        stringBuilder.append(realmGet$tgledit() != null ? realmGet$tgledit() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_padi_olahtanah:");
        stringBuilder.append(realmGet$ka_padi_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_padi_tumbuh:");
        stringBuilder.append(realmGet$ka_padi_tumbuh());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_padi_panen:");
        stringBuilder.append(realmGet$ka_padi_panen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_tebu_olahtanah:");
        stringBuilder.append(realmGet$ka_tebu_olahtanah());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_tebu_muda:");
        stringBuilder.append(realmGet$ka_tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_tebu_tua:");
        stringBuilder.append(realmGet$ka_tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_wija_byk_air:");
        stringBuilder.append(realmGet$ka_wija_byk_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ka_wija_dkt_air:");
        stringBuilder.append(realmGet$ka_wija_dkt_air());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keb_air_bangtrol:");
        stringBuilder.append(realmGet$keb_air_bangtrol());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urutan:");
        stringBuilder.append(realmGet$urutan());
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
        stringBuilder.append("{padi:");
        stringBuilder.append(realmGet$padi());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_tua:");
        stringBuilder.append(realmGet$tebu_tua());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tebu_muda:");
        stringBuilder.append(realmGet$tebu_muda());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{palawija:");
        stringBuilder.append(realmGet$palawija());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lain:");
        stringBuilder.append(realmGet$lain());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bero:");
        stringBuilder.append(realmGet$bero());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gol:");
        stringBuilder.append(realmGet$gol());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_airaw:");
        stringBuilder.append(realmGet$tgl_airaw() != null ? realmGet$tgl_airaw() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_airak:");
        stringBuilder.append(realmGet$tgl_airak() != null ? realmGet$tgl_airak() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tgl_mt:");
        stringBuilder.append(realmGet$tgl_mt() != null ? realmGet$tgl_mt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flag:");
        stringBuilder.append(realmGet$flag());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deleterec:");
        stringBuilder.append(realmGet$deleterec() != null ? realmGet$deleterec() : "null");
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
        com_pusair_smopi_Model_Blanko04BangtrolRealmProxy aBlanko04Bangtrol = (com_pusair_smopi_Model_Blanko04BangtrolRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBlanko04Bangtrol.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBlanko04Bangtrol.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBlanko04Bangtrol.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
