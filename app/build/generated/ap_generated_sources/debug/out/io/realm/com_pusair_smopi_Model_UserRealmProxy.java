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
public class com_pusair_smopi_Model_UserRealmProxy extends com.pusair.smopi.Model.User
    implements RealmObjectProxy, com_pusair_smopi_Model_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long nm_usrIndex;
        long passwdIndex;
        long previlIndex;
        long nm_stafIndex;
        long nrpIndex;
        long golIndex;
        long nohpIndex;
        long pendidikanIndex;
        long kd_propIndex;
        long kd_bwsIndex;
        long kd_diIndex;
        long tmt_diIndex;
        long kd_kabIndex;
        long kd_stafIndex;
        long kecamatanIndex;
        long luas_swiriIndex;
        long wil_kerjaIndex;
        long petak_tersierIndex;
        long aktifIndex;
        long kd_jbtkasiIndex;
        long kd_stafbossIndex;
        long nm_diIndex;
        long id_ppaIndex;
        long nm_ppaIndex;
        long nm_bangtrolIndex;
        long tmt_bangtrolIndex;
        long daerahIrigasiIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(27);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.nm_usrIndex = addColumnDetails("nm_usr", "nm_usr", objectSchemaInfo);
            this.passwdIndex = addColumnDetails("passwd", "passwd", objectSchemaInfo);
            this.previlIndex = addColumnDetails("previl", "previl", objectSchemaInfo);
            this.nm_stafIndex = addColumnDetails("nm_staf", "nm_staf", objectSchemaInfo);
            this.nrpIndex = addColumnDetails("nrp", "nrp", objectSchemaInfo);
            this.golIndex = addColumnDetails("gol", "gol", objectSchemaInfo);
            this.nohpIndex = addColumnDetails("nohp", "nohp", objectSchemaInfo);
            this.pendidikanIndex = addColumnDetails("pendidikan", "pendidikan", objectSchemaInfo);
            this.kd_propIndex = addColumnDetails("kd_prop", "kd_prop", objectSchemaInfo);
            this.kd_bwsIndex = addColumnDetails("kd_bws", "kd_bws", objectSchemaInfo);
            this.kd_diIndex = addColumnDetails("kd_di", "kd_di", objectSchemaInfo);
            this.tmt_diIndex = addColumnDetails("tmt_di", "tmt_di", objectSchemaInfo);
            this.kd_kabIndex = addColumnDetails("kd_kab", "kd_kab", objectSchemaInfo);
            this.kd_stafIndex = addColumnDetails("kd_staf", "kd_staf", objectSchemaInfo);
            this.kecamatanIndex = addColumnDetails("kecamatan", "kecamatan", objectSchemaInfo);
            this.luas_swiriIndex = addColumnDetails("luas_swiri", "luas_swiri", objectSchemaInfo);
            this.wil_kerjaIndex = addColumnDetails("wil_kerja", "wil_kerja", objectSchemaInfo);
            this.petak_tersierIndex = addColumnDetails("petak_tersier", "petak_tersier", objectSchemaInfo);
            this.aktifIndex = addColumnDetails("aktif", "aktif", objectSchemaInfo);
            this.kd_jbtkasiIndex = addColumnDetails("kd_jbtkasi", "kd_jbtkasi", objectSchemaInfo);
            this.kd_stafbossIndex = addColumnDetails("kd_stafboss", "kd_stafboss", objectSchemaInfo);
            this.nm_diIndex = addColumnDetails("nm_di", "nm_di", objectSchemaInfo);
            this.id_ppaIndex = addColumnDetails("id_ppa", "id_ppa", objectSchemaInfo);
            this.nm_ppaIndex = addColumnDetails("nm_ppa", "nm_ppa", objectSchemaInfo);
            this.nm_bangtrolIndex = addColumnDetails("nm_bangtrol", "nm_bangtrol", objectSchemaInfo);
            this.tmt_bangtrolIndex = addColumnDetails("tmt_bangtrol", "tmt_bangtrol", objectSchemaInfo);
            this.daerahIrigasiIndex = addColumnDetails("daerahIrigasi", "daerahIrigasi", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.nm_usrIndex = src.nm_usrIndex;
            dst.passwdIndex = src.passwdIndex;
            dst.previlIndex = src.previlIndex;
            dst.nm_stafIndex = src.nm_stafIndex;
            dst.nrpIndex = src.nrpIndex;
            dst.golIndex = src.golIndex;
            dst.nohpIndex = src.nohpIndex;
            dst.pendidikanIndex = src.pendidikanIndex;
            dst.kd_propIndex = src.kd_propIndex;
            dst.kd_bwsIndex = src.kd_bwsIndex;
            dst.kd_diIndex = src.kd_diIndex;
            dst.tmt_diIndex = src.tmt_diIndex;
            dst.kd_kabIndex = src.kd_kabIndex;
            dst.kd_stafIndex = src.kd_stafIndex;
            dst.kecamatanIndex = src.kecamatanIndex;
            dst.luas_swiriIndex = src.luas_swiriIndex;
            dst.wil_kerjaIndex = src.wil_kerjaIndex;
            dst.petak_tersierIndex = src.petak_tersierIndex;
            dst.aktifIndex = src.aktifIndex;
            dst.kd_jbtkasiIndex = src.kd_jbtkasiIndex;
            dst.kd_stafbossIndex = src.kd_stafbossIndex;
            dst.nm_diIndex = src.nm_diIndex;
            dst.id_ppaIndex = src.id_ppaIndex;
            dst.nm_ppaIndex = src.nm_ppaIndex;
            dst.nm_bangtrolIndex = src.nm_bangtrolIndex;
            dst.tmt_bangtrolIndex = src.tmt_bangtrolIndex;
            dst.daerahIrigasiIndex = src.daerahIrigasiIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.pusair.smopi.Model.User> proxyState;

    com_pusair_smopi_Model_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pusair.smopi.Model.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_usr() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_usrIndex);
    }

    @Override
    public void realmSet$nm_usr(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_usrIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_usrIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_usrIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_usrIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$passwd() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwdIndex);
    }

    @Override
    public void realmSet$passwd(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$previl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.previlIndex);
    }

    @Override
    public void realmSet$previl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.previlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.previlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.previlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.previlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_staf() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_stafIndex);
    }

    @Override
    public void realmSet$nm_staf(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_stafIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_stafIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_stafIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_stafIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nrp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nrpIndex);
    }

    @Override
    public void realmSet$nrp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nrpIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nrpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nrpIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nrpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$gol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.golIndex);
    }

    @Override
    public void realmSet$gol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.golIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.golIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.golIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.golIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nohp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nohpIndex);
    }

    @Override
    public void realmSet$nohp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nohpIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nohpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nohpIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nohpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pendidikan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.pendidikanIndex);
    }

    @Override
    public void realmSet$pendidikan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pendidikanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.pendidikanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pendidikanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.pendidikanIndex, value);
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
    public String realmGet$kd_bws() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_bwsIndex);
    }

    @Override
    public void realmSet$kd_bws(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_bwsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_bwsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_bwsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_bwsIndex, value);
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
    public String realmGet$kd_staf() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_stafIndex);
    }

    @Override
    public void realmSet$kd_staf(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'kd_staf' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kecamatan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kecamatanIndex);
    }

    @Override
    public void realmSet$kecamatan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kecamatanIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kecamatanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kecamatanIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kecamatanIndex, value);
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
    public String realmGet$wil_kerja() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.wil_kerjaIndex);
    }

    @Override
    public void realmSet$wil_kerja(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.wil_kerjaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.wil_kerjaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.wil_kerjaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.wil_kerjaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$petak_tersier() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.petak_tersierIndex);
    }

    @Override
    public void realmSet$petak_tersier(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.petak_tersierIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.petak_tersierIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$aktif() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.aktifIndex);
    }

    @Override
    public void realmSet$aktif(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.aktifIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.aktifIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.aktifIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.aktifIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_jbtkasi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_jbtkasiIndex);
    }

    @Override
    public void realmSet$kd_jbtkasi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_jbtkasiIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_jbtkasiIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_jbtkasiIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_jbtkasiIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kd_stafboss() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kd_stafbossIndex);
    }

    @Override
    public void realmSet$kd_stafboss(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kd_stafbossIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kd_stafbossIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kd_stafbossIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kd_stafbossIndex, value);
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
    public String realmGet$id_ppa() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_ppaIndex);
    }

    @Override
    public void realmSet$id_ppa(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.id_ppaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.id_ppaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.id_ppaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.id_ppaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nm_ppa() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nm_ppaIndex);
    }

    @Override
    public void realmSet$nm_ppa(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nm_ppaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nm_ppaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nm_ppaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nm_ppaIndex, value);
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
    public com.pusair.smopi.Model.DaerahIrigasi realmGet$daerahIrigasi() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.daerahIrigasiIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.pusair.smopi.Model.DaerahIrigasi.class, proxyState.getRow$realm().getLink(columnInfo.daerahIrigasiIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$daerahIrigasi(com.pusair.smopi.Model.DaerahIrigasi value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("daerahIrigasi")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.daerahIrigasiIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.daerahIrigasiIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.daerahIrigasiIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.daerahIrigasiIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 27, 0);
        builder.addPersistedProperty("nm_usr", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("passwd", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("previl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_staf", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nrp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("gol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nohp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pendidikan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_prop", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_bws", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_kab", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_staf", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kecamatan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("luas_swiri", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("wil_kerja", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("petak_tersier", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("aktif", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_jbtkasi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kd_stafboss", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_di", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id_ppa", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_ppa", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nm_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tmt_bangtrol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("daerahIrigasi", RealmFieldType.OBJECT, "DaerahIrigasi");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.pusair.smopi.Model.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.pusair.smopi.Model.User obj = null;
        if (update) {
            Table table = realm.getTable(com.pusair.smopi.Model.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
            long pkColumnIndex = columnInfo.kd_stafIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("kd_staf")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("kd_staf"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pusair_smopi_Model_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("daerahIrigasi")) {
                excludeFields.add("daerahIrigasi");
            }
            if (json.has("kd_staf")) {
                if (json.isNull("kd_staf")) {
                    obj = (io.realm.com_pusair_smopi_Model_UserRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pusair_smopi_Model_UserRealmProxy) realm.createObjectInternal(com.pusair.smopi.Model.User.class, json.getString("kd_staf"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_staf'.");
            }
        }

        final com_pusair_smopi_Model_UserRealmProxyInterface objProxy = (com_pusair_smopi_Model_UserRealmProxyInterface) obj;
        if (json.has("nm_usr")) {
            if (json.isNull("nm_usr")) {
                objProxy.realmSet$nm_usr(null);
            } else {
                objProxy.realmSet$nm_usr((String) json.getString("nm_usr"));
            }
        }
        if (json.has("passwd")) {
            if (json.isNull("passwd")) {
                objProxy.realmSet$passwd(null);
            } else {
                objProxy.realmSet$passwd((String) json.getString("passwd"));
            }
        }
        if (json.has("previl")) {
            if (json.isNull("previl")) {
                objProxy.realmSet$previl(null);
            } else {
                objProxy.realmSet$previl((String) json.getString("previl"));
            }
        }
        if (json.has("nm_staf")) {
            if (json.isNull("nm_staf")) {
                objProxy.realmSet$nm_staf(null);
            } else {
                objProxy.realmSet$nm_staf((String) json.getString("nm_staf"));
            }
        }
        if (json.has("nrp")) {
            if (json.isNull("nrp")) {
                objProxy.realmSet$nrp(null);
            } else {
                objProxy.realmSet$nrp((String) json.getString("nrp"));
            }
        }
        if (json.has("gol")) {
            if (json.isNull("gol")) {
                objProxy.realmSet$gol(null);
            } else {
                objProxy.realmSet$gol((String) json.getString("gol"));
            }
        }
        if (json.has("nohp")) {
            if (json.isNull("nohp")) {
                objProxy.realmSet$nohp(null);
            } else {
                objProxy.realmSet$nohp((String) json.getString("nohp"));
            }
        }
        if (json.has("pendidikan")) {
            if (json.isNull("pendidikan")) {
                objProxy.realmSet$pendidikan(null);
            } else {
                objProxy.realmSet$pendidikan((String) json.getString("pendidikan"));
            }
        }
        if (json.has("kd_prop")) {
            if (json.isNull("kd_prop")) {
                objProxy.realmSet$kd_prop(null);
            } else {
                objProxy.realmSet$kd_prop((String) json.getString("kd_prop"));
            }
        }
        if (json.has("kd_bws")) {
            if (json.isNull("kd_bws")) {
                objProxy.realmSet$kd_bws(null);
            } else {
                objProxy.realmSet$kd_bws((String) json.getString("kd_bws"));
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
        if (json.has("kd_kab")) {
            if (json.isNull("kd_kab")) {
                objProxy.realmSet$kd_kab(null);
            } else {
                objProxy.realmSet$kd_kab((String) json.getString("kd_kab"));
            }
        }
        if (json.has("kecamatan")) {
            if (json.isNull("kecamatan")) {
                objProxy.realmSet$kecamatan(null);
            } else {
                objProxy.realmSet$kecamatan((String) json.getString("kecamatan"));
            }
        }
        if (json.has("luas_swiri")) {
            if (json.isNull("luas_swiri")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
            } else {
                objProxy.realmSet$luas_swiri((float) json.getDouble("luas_swiri"));
            }
        }
        if (json.has("wil_kerja")) {
            if (json.isNull("wil_kerja")) {
                objProxy.realmSet$wil_kerja(null);
            } else {
                objProxy.realmSet$wil_kerja((String) json.getString("wil_kerja"));
            }
        }
        if (json.has("petak_tersier")) {
            if (json.isNull("petak_tersier")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
            } else {
                objProxy.realmSet$petak_tersier((int) json.getInt("petak_tersier"));
            }
        }
        if (json.has("aktif")) {
            if (json.isNull("aktif")) {
                objProxy.realmSet$aktif(null);
            } else {
                objProxy.realmSet$aktif((String) json.getString("aktif"));
            }
        }
        if (json.has("kd_jbtkasi")) {
            if (json.isNull("kd_jbtkasi")) {
                objProxy.realmSet$kd_jbtkasi(null);
            } else {
                objProxy.realmSet$kd_jbtkasi((String) json.getString("kd_jbtkasi"));
            }
        }
        if (json.has("kd_stafboss")) {
            if (json.isNull("kd_stafboss")) {
                objProxy.realmSet$kd_stafboss(null);
            } else {
                objProxy.realmSet$kd_stafboss((String) json.getString("kd_stafboss"));
            }
        }
        if (json.has("nm_di")) {
            if (json.isNull("nm_di")) {
                objProxy.realmSet$nm_di(null);
            } else {
                objProxy.realmSet$nm_di((String) json.getString("nm_di"));
            }
        }
        if (json.has("id_ppa")) {
            if (json.isNull("id_ppa")) {
                objProxy.realmSet$id_ppa(null);
            } else {
                objProxy.realmSet$id_ppa((String) json.getString("id_ppa"));
            }
        }
        if (json.has("nm_ppa")) {
            if (json.isNull("nm_ppa")) {
                objProxy.realmSet$nm_ppa(null);
            } else {
                objProxy.realmSet$nm_ppa((String) json.getString("nm_ppa"));
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
        if (json.has("daerahIrigasi")) {
            if (json.isNull("daerahIrigasi")) {
                objProxy.realmSet$daerahIrigasi(null);
            } else {
                com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("daerahIrigasi"), update);
                objProxy.realmSet$daerahIrigasi(daerahIrigasiObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pusair.smopi.Model.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pusair.smopi.Model.User obj = new com.pusair.smopi.Model.User();
        final com_pusair_smopi_Model_UserRealmProxyInterface objProxy = (com_pusair_smopi_Model_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("nm_usr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_usr((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_usr(null);
                }
            } else if (name.equals("passwd")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$passwd((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$passwd(null);
                }
            } else if (name.equals("previl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$previl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$previl(null);
                }
            } else if (name.equals("nm_staf")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_staf((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_staf(null);
                }
            } else if (name.equals("nrp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nrp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nrp(null);
                }
            } else if (name.equals("gol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gol(null);
                }
            } else if (name.equals("nohp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nohp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nohp(null);
                }
            } else if (name.equals("pendidikan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pendidikan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pendidikan(null);
                }
            } else if (name.equals("kd_prop")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_prop((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_prop(null);
                }
            } else if (name.equals("kd_bws")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_bws((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_bws(null);
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
            } else if (name.equals("kd_kab")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_kab((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_kab(null);
                }
            } else if (name.equals("kd_staf")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_staf((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_staf(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("kecamatan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kecamatan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kecamatan(null);
                }
            } else if (name.equals("luas_swiri")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$luas_swiri((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'luas_swiri' to null.");
                }
            } else if (name.equals("wil_kerja")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wil_kerja((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$wil_kerja(null);
                }
            } else if (name.equals("petak_tersier")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$petak_tersier((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'petak_tersier' to null.");
                }
            } else if (name.equals("aktif")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$aktif((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$aktif(null);
                }
            } else if (name.equals("kd_jbtkasi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_jbtkasi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_jbtkasi(null);
                }
            } else if (name.equals("kd_stafboss")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kd_stafboss((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kd_stafboss(null);
                }
            } else if (name.equals("nm_di")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_di((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_di(null);
                }
            } else if (name.equals("id_ppa")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_ppa((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_ppa(null);
                }
            } else if (name.equals("nm_ppa")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nm_ppa((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nm_ppa(null);
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
            } else if (name.equals("daerahIrigasi")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$daerahIrigasi(null);
                } else {
                    com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$daerahIrigasi(daerahIrigasiObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'kd_staf'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.pusair.smopi.Model.User copyOrUpdate(Realm realm, com.pusair.smopi.Model.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.pusair.smopi.Model.User) cachedRealmObject;
        }

        com.pusair.smopi.Model.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pusair.smopi.Model.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
            long pkColumnIndex = columnInfo.kd_stafIndex;
            String value = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_staf();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pusair_smopi_Model_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.pusair.smopi.Model.User copy(Realm realm, com.pusair.smopi.Model.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pusair.smopi.Model.User) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.pusair.smopi.Model.User realmObject = realm.createObjectInternal(com.pusair.smopi.Model.User.class, ((com_pusair_smopi_Model_UserRealmProxyInterface) newObject).realmGet$kd_staf(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_pusair_smopi_Model_UserRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_UserRealmProxyInterface) newObject;
        com_pusair_smopi_Model_UserRealmProxyInterface realmObjectCopy = (com_pusair_smopi_Model_UserRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$nm_usr(realmObjectSource.realmGet$nm_usr());
        realmObjectCopy.realmSet$passwd(realmObjectSource.realmGet$passwd());
        realmObjectCopy.realmSet$previl(realmObjectSource.realmGet$previl());
        realmObjectCopy.realmSet$nm_staf(realmObjectSource.realmGet$nm_staf());
        realmObjectCopy.realmSet$nrp(realmObjectSource.realmGet$nrp());
        realmObjectCopy.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectCopy.realmSet$nohp(realmObjectSource.realmGet$nohp());
        realmObjectCopy.realmSet$pendidikan(realmObjectSource.realmGet$pendidikan());
        realmObjectCopy.realmSet$kd_prop(realmObjectSource.realmGet$kd_prop());
        realmObjectCopy.realmSet$kd_bws(realmObjectSource.realmGet$kd_bws());
        realmObjectCopy.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectCopy.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectCopy.realmSet$kd_kab(realmObjectSource.realmGet$kd_kab());
        realmObjectCopy.realmSet$kecamatan(realmObjectSource.realmGet$kecamatan());
        realmObjectCopy.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectCopy.realmSet$wil_kerja(realmObjectSource.realmGet$wil_kerja());
        realmObjectCopy.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectCopy.realmSet$aktif(realmObjectSource.realmGet$aktif());
        realmObjectCopy.realmSet$kd_jbtkasi(realmObjectSource.realmGet$kd_jbtkasi());
        realmObjectCopy.realmSet$kd_stafboss(realmObjectSource.realmGet$kd_stafboss());
        realmObjectCopy.realmSet$nm_di(realmObjectSource.realmGet$nm_di());
        realmObjectCopy.realmSet$id_ppa(realmObjectSource.realmGet$id_ppa());
        realmObjectCopy.realmSet$nm_ppa(realmObjectSource.realmGet$nm_ppa());
        realmObjectCopy.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectCopy.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());

        com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = realmObjectSource.realmGet$daerahIrigasi();
        if (daerahIrigasiObj == null) {
            realmObjectCopy.realmSet$daerahIrigasi(null);
        } else {
            com.pusair.smopi.Model.DaerahIrigasi cachedaerahIrigasi = (com.pusair.smopi.Model.DaerahIrigasi) cache.get(daerahIrigasiObj);
            if (cachedaerahIrigasi != null) {
                realmObjectCopy.realmSet$daerahIrigasi(cachedaerahIrigasi);
            } else {
                realmObjectCopy.realmSet$daerahIrigasi(com_pusair_smopi_Model_DaerahIrigasiRealmProxy.copyOrUpdate(realm, daerahIrigasiObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, com.pusair.smopi.Model.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
        long pkColumnIndex = columnInfo.kd_stafIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_staf();
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
        String realmGet$nm_usr = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_usr();
        if (realmGet$nm_usr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, realmGet$nm_usr, false);
        }
        String realmGet$passwd = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
        }
        String realmGet$previl = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$previl();
        if (realmGet$previl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.previlIndex, rowIndex, realmGet$previl, false);
        }
        String realmGet$nm_staf = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_staf();
        if (realmGet$nm_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, realmGet$nm_staf, false);
        }
        String realmGet$nrp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nrp();
        if (realmGet$nrp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nrpIndex, rowIndex, realmGet$nrp, false);
        }
        String realmGet$gol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$gol();
        if (realmGet$gol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
        }
        String realmGet$nohp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nohp();
        if (realmGet$nohp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nohpIndex, rowIndex, realmGet$nohp, false);
        }
        String realmGet$pendidikan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$pendidikan();
        if (realmGet$pendidikan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, realmGet$pendidikan, false);
        }
        String realmGet$kd_prop = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_prop();
        if (realmGet$kd_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
        }
        String realmGet$kd_bws = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_bws();
        if (realmGet$kd_bws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, realmGet$kd_bws, false);
        }
        String realmGet$kd_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        }
        String realmGet$kd_kab = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_kab();
        if (realmGet$kd_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
        }
        String realmGet$kecamatan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kecamatan();
        if (realmGet$kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, realmGet$kecamatan, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$wil_kerja = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$wil_kerja();
        if (realmGet$wil_kerja != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, realmGet$wil_kerja, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$petak_tersier(), false);
        String realmGet$aktif = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$aktif();
        if (realmGet$aktif != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aktifIndex, rowIndex, realmGet$aktif, false);
        }
        String realmGet$kd_jbtkasi = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_jbtkasi();
        if (realmGet$kd_jbtkasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, realmGet$kd_jbtkasi, false);
        }
        String realmGet$kd_stafboss = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_stafboss();
        if (realmGet$kd_stafboss != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, realmGet$kd_stafboss, false);
        }
        String realmGet$nm_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_di();
        if (realmGet$nm_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
        }
        String realmGet$id_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$id_ppa();
        if (realmGet$id_ppa != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, realmGet$id_ppa, false);
        }
        String realmGet$nm_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_ppa();
        if (realmGet$nm_ppa != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, realmGet$nm_ppa, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        }

        com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$daerahIrigasi();
        if (daerahIrigasiObj != null) {
            Long cachedaerahIrigasi = cache.get(daerahIrigasiObj);
            if (cachedaerahIrigasi == null) {
                cachedaerahIrigasi = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insert(realm, daerahIrigasiObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.daerahIrigasiIndex, rowIndex, cachedaerahIrigasi, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
        long pkColumnIndex = columnInfo.kd_stafIndex;
        com.pusair.smopi.Model.User object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_staf();
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
            String realmGet$nm_usr = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_usr();
            if (realmGet$nm_usr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, realmGet$nm_usr, false);
            }
            String realmGet$passwd = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
            }
            String realmGet$previl = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$previl();
            if (realmGet$previl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.previlIndex, rowIndex, realmGet$previl, false);
            }
            String realmGet$nm_staf = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_staf();
            if (realmGet$nm_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, realmGet$nm_staf, false);
            }
            String realmGet$nrp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nrp();
            if (realmGet$nrp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nrpIndex, rowIndex, realmGet$nrp, false);
            }
            String realmGet$gol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$gol();
            if (realmGet$gol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
            }
            String realmGet$nohp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nohp();
            if (realmGet$nohp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nohpIndex, rowIndex, realmGet$nohp, false);
            }
            String realmGet$pendidikan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$pendidikan();
            if (realmGet$pendidikan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, realmGet$pendidikan, false);
            }
            String realmGet$kd_prop = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_prop();
            if (realmGet$kd_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
            }
            String realmGet$kd_bws = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_bws();
            if (realmGet$kd_bws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, realmGet$kd_bws, false);
            }
            String realmGet$kd_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            }
            String realmGet$kd_kab = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_kab();
            if (realmGet$kd_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
            }
            String realmGet$kecamatan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kecamatan();
            if (realmGet$kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, realmGet$kecamatan, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$wil_kerja = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$wil_kerja();
            if (realmGet$wil_kerja != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, realmGet$wil_kerja, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$petak_tersier(), false);
            String realmGet$aktif = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$aktif();
            if (realmGet$aktif != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aktifIndex, rowIndex, realmGet$aktif, false);
            }
            String realmGet$kd_jbtkasi = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_jbtkasi();
            if (realmGet$kd_jbtkasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, realmGet$kd_jbtkasi, false);
            }
            String realmGet$kd_stafboss = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_stafboss();
            if (realmGet$kd_stafboss != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, realmGet$kd_stafboss, false);
            }
            String realmGet$nm_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_di();
            if (realmGet$nm_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
            }
            String realmGet$id_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$id_ppa();
            if (realmGet$id_ppa != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, realmGet$id_ppa, false);
            }
            String realmGet$nm_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_ppa();
            if (realmGet$nm_ppa != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, realmGet$nm_ppa, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            }

            com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$daerahIrigasi();
            if (daerahIrigasiObj != null) {
                Long cachedaerahIrigasi = cache.get(daerahIrigasiObj);
                if (cachedaerahIrigasi == null) {
                    cachedaerahIrigasi = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insert(realm, daerahIrigasiObj, cache);
                }
                table.setLink(columnInfo.daerahIrigasiIndex, rowIndex, cachedaerahIrigasi, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pusair.smopi.Model.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pusair.smopi.Model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
        long pkColumnIndex = columnInfo.kd_stafIndex;
        String primaryKeyValue = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_staf();
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
        String realmGet$nm_usr = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_usr();
        if (realmGet$nm_usr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, realmGet$nm_usr, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, false);
        }
        String realmGet$passwd = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwdIndex, rowIndex, false);
        }
        String realmGet$previl = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$previl();
        if (realmGet$previl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.previlIndex, rowIndex, realmGet$previl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.previlIndex, rowIndex, false);
        }
        String realmGet$nm_staf = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_staf();
        if (realmGet$nm_staf != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, realmGet$nm_staf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, false);
        }
        String realmGet$nrp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nrp();
        if (realmGet$nrp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nrpIndex, rowIndex, realmGet$nrp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nrpIndex, rowIndex, false);
        }
        String realmGet$gol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$gol();
        if (realmGet$gol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.golIndex, rowIndex, false);
        }
        String realmGet$nohp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nohp();
        if (realmGet$nohp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nohpIndex, rowIndex, realmGet$nohp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nohpIndex, rowIndex, false);
        }
        String realmGet$pendidikan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$pendidikan();
        if (realmGet$pendidikan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, realmGet$pendidikan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, false);
        }
        String realmGet$kd_prop = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_prop();
        if (realmGet$kd_prop != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_propIndex, rowIndex, false);
        }
        String realmGet$kd_bws = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_bws();
        if (realmGet$kd_bws != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, realmGet$kd_bws, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, false);
        }
        String realmGet$kd_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_di();
        if (realmGet$kd_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
        }
        String realmGet$tmt_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_di();
        if (realmGet$tmt_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
        }
        String realmGet$kd_kab = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_kab();
        if (realmGet$kd_kab != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, false);
        }
        String realmGet$kecamatan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kecamatan();
        if (realmGet$kecamatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, realmGet$kecamatan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$luas_swiri(), false);
        String realmGet$wil_kerja = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$wil_kerja();
        if (realmGet$wil_kerja != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, realmGet$wil_kerja, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$petak_tersier(), false);
        String realmGet$aktif = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$aktif();
        if (realmGet$aktif != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aktifIndex, rowIndex, realmGet$aktif, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.aktifIndex, rowIndex, false);
        }
        String realmGet$kd_jbtkasi = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_jbtkasi();
        if (realmGet$kd_jbtkasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, realmGet$kd_jbtkasi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, false);
        }
        String realmGet$kd_stafboss = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_stafboss();
        if (realmGet$kd_stafboss != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, realmGet$kd_stafboss, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, false);
        }
        String realmGet$nm_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_di();
        if (realmGet$nm_di != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_diIndex, rowIndex, false);
        }
        String realmGet$id_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$id_ppa();
        if (realmGet$id_ppa != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, realmGet$id_ppa, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, false);
        }
        String realmGet$nm_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_ppa();
        if (realmGet$nm_ppa != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, realmGet$nm_ppa, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, false);
        }
        String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_bangtrol();
        if (realmGet$nm_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
        }
        String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_bangtrol();
        if (realmGet$tmt_bangtrol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
        }

        com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$daerahIrigasi();
        if (daerahIrigasiObj != null) {
            Long cachedaerahIrigasi = cache.get(daerahIrigasiObj);
            if (cachedaerahIrigasi == null) {
                cachedaerahIrigasi = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insertOrUpdate(realm, daerahIrigasiObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.daerahIrigasiIndex, rowIndex, cachedaerahIrigasi, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.daerahIrigasiIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pusair.smopi.Model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pusair.smopi.Model.User.class);
        long pkColumnIndex = columnInfo.kd_stafIndex;
        com.pusair.smopi.Model.User object = null;
        while (objects.hasNext()) {
            object = (com.pusair.smopi.Model.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_staf();
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
            String realmGet$nm_usr = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_usr();
            if (realmGet$nm_usr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, realmGet$nm_usr, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_usrIndex, rowIndex, false);
            }
            String realmGet$passwd = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwdIndex, rowIndex, false);
            }
            String realmGet$previl = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$previl();
            if (realmGet$previl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.previlIndex, rowIndex, realmGet$previl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.previlIndex, rowIndex, false);
            }
            String realmGet$nm_staf = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_staf();
            if (realmGet$nm_staf != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, realmGet$nm_staf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_stafIndex, rowIndex, false);
            }
            String realmGet$nrp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nrp();
            if (realmGet$nrp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nrpIndex, rowIndex, realmGet$nrp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nrpIndex, rowIndex, false);
            }
            String realmGet$gol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$gol();
            if (realmGet$gol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.golIndex, rowIndex, realmGet$gol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.golIndex, rowIndex, false);
            }
            String realmGet$nohp = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nohp();
            if (realmGet$nohp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nohpIndex, rowIndex, realmGet$nohp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nohpIndex, rowIndex, false);
            }
            String realmGet$pendidikan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$pendidikan();
            if (realmGet$pendidikan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, realmGet$pendidikan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pendidikanIndex, rowIndex, false);
            }
            String realmGet$kd_prop = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_prop();
            if (realmGet$kd_prop != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_propIndex, rowIndex, realmGet$kd_prop, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_propIndex, rowIndex, false);
            }
            String realmGet$kd_bws = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_bws();
            if (realmGet$kd_bws != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, realmGet$kd_bws, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_bwsIndex, rowIndex, false);
            }
            String realmGet$kd_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_di();
            if (realmGet$kd_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_diIndex, rowIndex, realmGet$kd_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_diIndex, rowIndex, false);
            }
            String realmGet$tmt_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_di();
            if (realmGet$tmt_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, realmGet$tmt_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_diIndex, rowIndex, false);
            }
            String realmGet$kd_kab = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_kab();
            if (realmGet$kd_kab != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, realmGet$kd_kab, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_kabIndex, rowIndex, false);
            }
            String realmGet$kecamatan = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kecamatan();
            if (realmGet$kecamatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, realmGet$kecamatan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kecamatanIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.luas_swiriIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$luas_swiri(), false);
            String realmGet$wil_kerja = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$wil_kerja();
            if (realmGet$wil_kerja != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, realmGet$wil_kerja, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.wil_kerjaIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.petak_tersierIndex, rowIndex, ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$petak_tersier(), false);
            String realmGet$aktif = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$aktif();
            if (realmGet$aktif != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aktifIndex, rowIndex, realmGet$aktif, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.aktifIndex, rowIndex, false);
            }
            String realmGet$kd_jbtkasi = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_jbtkasi();
            if (realmGet$kd_jbtkasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, realmGet$kd_jbtkasi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_jbtkasiIndex, rowIndex, false);
            }
            String realmGet$kd_stafboss = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$kd_stafboss();
            if (realmGet$kd_stafboss != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, realmGet$kd_stafboss, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kd_stafbossIndex, rowIndex, false);
            }
            String realmGet$nm_di = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_di();
            if (realmGet$nm_di != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_diIndex, rowIndex, realmGet$nm_di, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_diIndex, rowIndex, false);
            }
            String realmGet$id_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$id_ppa();
            if (realmGet$id_ppa != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, realmGet$id_ppa, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.id_ppaIndex, rowIndex, false);
            }
            String realmGet$nm_ppa = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_ppa();
            if (realmGet$nm_ppa != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, realmGet$nm_ppa, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_ppaIndex, rowIndex, false);
            }
            String realmGet$nm_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$nm_bangtrol();
            if (realmGet$nm_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, realmGet$nm_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nm_bangtrolIndex, rowIndex, false);
            }
            String realmGet$tmt_bangtrol = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$tmt_bangtrol();
            if (realmGet$tmt_bangtrol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, realmGet$tmt_bangtrol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tmt_bangtrolIndex, rowIndex, false);
            }

            com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = ((com_pusair_smopi_Model_UserRealmProxyInterface) object).realmGet$daerahIrigasi();
            if (daerahIrigasiObj != null) {
                Long cachedaerahIrigasi = cache.get(daerahIrigasiObj);
                if (cachedaerahIrigasi == null) {
                    cachedaerahIrigasi = com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insertOrUpdate(realm, daerahIrigasiObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.daerahIrigasiIndex, rowIndex, cachedaerahIrigasi, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.daerahIrigasiIndex, rowIndex);
            }
        }
    }

    public static com.pusair.smopi.Model.User createDetachedCopy(com.pusair.smopi.Model.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pusair.smopi.Model.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pusair.smopi.Model.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pusair.smopi.Model.User) cachedObject.object;
            }
            unmanagedObject = (com.pusair.smopi.Model.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pusair_smopi_Model_UserRealmProxyInterface unmanagedCopy = (com_pusair_smopi_Model_UserRealmProxyInterface) unmanagedObject;
        com_pusair_smopi_Model_UserRealmProxyInterface realmSource = (com_pusair_smopi_Model_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$nm_usr(realmSource.realmGet$nm_usr());
        unmanagedCopy.realmSet$passwd(realmSource.realmGet$passwd());
        unmanagedCopy.realmSet$previl(realmSource.realmGet$previl());
        unmanagedCopy.realmSet$nm_staf(realmSource.realmGet$nm_staf());
        unmanagedCopy.realmSet$nrp(realmSource.realmGet$nrp());
        unmanagedCopy.realmSet$gol(realmSource.realmGet$gol());
        unmanagedCopy.realmSet$nohp(realmSource.realmGet$nohp());
        unmanagedCopy.realmSet$pendidikan(realmSource.realmGet$pendidikan());
        unmanagedCopy.realmSet$kd_prop(realmSource.realmGet$kd_prop());
        unmanagedCopy.realmSet$kd_bws(realmSource.realmGet$kd_bws());
        unmanagedCopy.realmSet$kd_di(realmSource.realmGet$kd_di());
        unmanagedCopy.realmSet$tmt_di(realmSource.realmGet$tmt_di());
        unmanagedCopy.realmSet$kd_kab(realmSource.realmGet$kd_kab());
        unmanagedCopy.realmSet$kd_staf(realmSource.realmGet$kd_staf());
        unmanagedCopy.realmSet$kecamatan(realmSource.realmGet$kecamatan());
        unmanagedCopy.realmSet$luas_swiri(realmSource.realmGet$luas_swiri());
        unmanagedCopy.realmSet$wil_kerja(realmSource.realmGet$wil_kerja());
        unmanagedCopy.realmSet$petak_tersier(realmSource.realmGet$petak_tersier());
        unmanagedCopy.realmSet$aktif(realmSource.realmGet$aktif());
        unmanagedCopy.realmSet$kd_jbtkasi(realmSource.realmGet$kd_jbtkasi());
        unmanagedCopy.realmSet$kd_stafboss(realmSource.realmGet$kd_stafboss());
        unmanagedCopy.realmSet$nm_di(realmSource.realmGet$nm_di());
        unmanagedCopy.realmSet$id_ppa(realmSource.realmGet$id_ppa());
        unmanagedCopy.realmSet$nm_ppa(realmSource.realmGet$nm_ppa());
        unmanagedCopy.realmSet$nm_bangtrol(realmSource.realmGet$nm_bangtrol());
        unmanagedCopy.realmSet$tmt_bangtrol(realmSource.realmGet$tmt_bangtrol());

        // Deep copy of daerahIrigasi
        unmanagedCopy.realmSet$daerahIrigasi(com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createDetachedCopy(realmSource.realmGet$daerahIrigasi(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    static com.pusair.smopi.Model.User update(Realm realm, com.pusair.smopi.Model.User realmObject, com.pusair.smopi.Model.User newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_pusair_smopi_Model_UserRealmProxyInterface realmObjectTarget = (com_pusair_smopi_Model_UserRealmProxyInterface) realmObject;
        com_pusair_smopi_Model_UserRealmProxyInterface realmObjectSource = (com_pusair_smopi_Model_UserRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$nm_usr(realmObjectSource.realmGet$nm_usr());
        realmObjectTarget.realmSet$passwd(realmObjectSource.realmGet$passwd());
        realmObjectTarget.realmSet$previl(realmObjectSource.realmGet$previl());
        realmObjectTarget.realmSet$nm_staf(realmObjectSource.realmGet$nm_staf());
        realmObjectTarget.realmSet$nrp(realmObjectSource.realmGet$nrp());
        realmObjectTarget.realmSet$gol(realmObjectSource.realmGet$gol());
        realmObjectTarget.realmSet$nohp(realmObjectSource.realmGet$nohp());
        realmObjectTarget.realmSet$pendidikan(realmObjectSource.realmGet$pendidikan());
        realmObjectTarget.realmSet$kd_prop(realmObjectSource.realmGet$kd_prop());
        realmObjectTarget.realmSet$kd_bws(realmObjectSource.realmGet$kd_bws());
        realmObjectTarget.realmSet$kd_di(realmObjectSource.realmGet$kd_di());
        realmObjectTarget.realmSet$tmt_di(realmObjectSource.realmGet$tmt_di());
        realmObjectTarget.realmSet$kd_kab(realmObjectSource.realmGet$kd_kab());
        realmObjectTarget.realmSet$kecamatan(realmObjectSource.realmGet$kecamatan());
        realmObjectTarget.realmSet$luas_swiri(realmObjectSource.realmGet$luas_swiri());
        realmObjectTarget.realmSet$wil_kerja(realmObjectSource.realmGet$wil_kerja());
        realmObjectTarget.realmSet$petak_tersier(realmObjectSource.realmGet$petak_tersier());
        realmObjectTarget.realmSet$aktif(realmObjectSource.realmGet$aktif());
        realmObjectTarget.realmSet$kd_jbtkasi(realmObjectSource.realmGet$kd_jbtkasi());
        realmObjectTarget.realmSet$kd_stafboss(realmObjectSource.realmGet$kd_stafboss());
        realmObjectTarget.realmSet$nm_di(realmObjectSource.realmGet$nm_di());
        realmObjectTarget.realmSet$id_ppa(realmObjectSource.realmGet$id_ppa());
        realmObjectTarget.realmSet$nm_ppa(realmObjectSource.realmGet$nm_ppa());
        realmObjectTarget.realmSet$nm_bangtrol(realmObjectSource.realmGet$nm_bangtrol());
        realmObjectTarget.realmSet$tmt_bangtrol(realmObjectSource.realmGet$tmt_bangtrol());
        com.pusair.smopi.Model.DaerahIrigasi daerahIrigasiObj = realmObjectSource.realmGet$daerahIrigasi();
        if (daerahIrigasiObj == null) {
            realmObjectTarget.realmSet$daerahIrigasi(null);
        } else {
            com.pusair.smopi.Model.DaerahIrigasi cachedaerahIrigasi = (com.pusair.smopi.Model.DaerahIrigasi) cache.get(daerahIrigasiObj);
            if (cachedaerahIrigasi != null) {
                realmObjectTarget.realmSet$daerahIrigasi(cachedaerahIrigasi);
            } else {
                realmObjectTarget.realmSet$daerahIrigasi(com_pusair_smopi_Model_DaerahIrigasiRealmProxy.copyOrUpdate(realm, daerahIrigasiObj, true, cache));
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{nm_usr:");
        stringBuilder.append(realmGet$nm_usr() != null ? realmGet$nm_usr() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{passwd:");
        stringBuilder.append(realmGet$passwd() != null ? realmGet$passwd() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{previl:");
        stringBuilder.append(realmGet$previl() != null ? realmGet$previl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_staf:");
        stringBuilder.append(realmGet$nm_staf() != null ? realmGet$nm_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nrp:");
        stringBuilder.append(realmGet$nrp() != null ? realmGet$nrp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gol:");
        stringBuilder.append(realmGet$gol() != null ? realmGet$gol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nohp:");
        stringBuilder.append(realmGet$nohp() != null ? realmGet$nohp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pendidikan:");
        stringBuilder.append(realmGet$pendidikan() != null ? realmGet$pendidikan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_prop:");
        stringBuilder.append(realmGet$kd_prop() != null ? realmGet$kd_prop() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_bws:");
        stringBuilder.append(realmGet$kd_bws() != null ? realmGet$kd_bws() : "null");
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
        stringBuilder.append("{kd_kab:");
        stringBuilder.append(realmGet$kd_kab() != null ? realmGet$kd_kab() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_staf:");
        stringBuilder.append(realmGet$kd_staf() != null ? realmGet$kd_staf() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kecamatan:");
        stringBuilder.append(realmGet$kecamatan() != null ? realmGet$kecamatan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{luas_swiri:");
        stringBuilder.append(realmGet$luas_swiri());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wil_kerja:");
        stringBuilder.append(realmGet$wil_kerja() != null ? realmGet$wil_kerja() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{petak_tersier:");
        stringBuilder.append(realmGet$petak_tersier());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{aktif:");
        stringBuilder.append(realmGet$aktif() != null ? realmGet$aktif() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_jbtkasi:");
        stringBuilder.append(realmGet$kd_jbtkasi() != null ? realmGet$kd_jbtkasi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kd_stafboss:");
        stringBuilder.append(realmGet$kd_stafboss() != null ? realmGet$kd_stafboss() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_di:");
        stringBuilder.append(realmGet$nm_di() != null ? realmGet$nm_di() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_ppa:");
        stringBuilder.append(realmGet$id_ppa() != null ? realmGet$id_ppa() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nm_ppa:");
        stringBuilder.append(realmGet$nm_ppa() != null ? realmGet$nm_ppa() : "null");
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
        stringBuilder.append("{daerahIrigasi:");
        stringBuilder.append(realmGet$daerahIrigasi() != null ? "DaerahIrigasi" : "null");
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
        com_pusair_smopi_Model_UserRealmProxy aUser = (com_pusair_smopi_Model_UserRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUser.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUser.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
