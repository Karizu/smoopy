package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class SmopiRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(16);
        modelClasses.add(com.pusair.smopi.Model.Blanko0123.class);
        modelClasses.add(com.pusair.smopi.Model.Blanko0405.class);
        modelClasses.add(com.pusair.smopi.Model.Blanko04Bangtrol.class);
        modelClasses.add(com.pusair.smopi.Model.Blanko06.class);
        modelClasses.add(com.pusair.smopi.Model.Blanko08.class);
        modelClasses.add(com.pusair.smopi.Model.BlankoP01.class);
        modelClasses.add(com.pusair.smopi.Model.BlankoP01Detail.class);
        modelClasses.add(com.pusair.smopi.Model.DaerahIrigasi.class);
        modelClasses.add(com.pusair.smopi.Model.GroupIp3a.class);
        modelClasses.add(com.pusair.smopi.Model.JenisKeadaan.class);
        modelClasses.add(com.pusair.smopi.Model.MusimTanam.class);
        modelClasses.add(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class);
        modelClasses.add(com.pusair.smopi.Model.RentangMusimTanam.class);
        modelClasses.add(com.pusair.smopi.Model.Saluran.class);
        modelClasses.add(com.pusair.smopi.Model.SaluranDetail.class);
        modelClasses.add(com.pusair.smopi.Model.User.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(16);
        infoMap.put(com.pusair.smopi.Model.Blanko0123.class, io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.Blanko0405.class, io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.Blanko04Bangtrol.class, io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.Blanko06.class, io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.Blanko08.class, io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.BlankoP01.class, io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.BlankoP01Detail.class, io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.DaerahIrigasi.class, io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.GroupIp3a.class, io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.JenisKeadaan.class, io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.MusimTanam.class, io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class, io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.RentangMusimTanam.class, io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.Saluran.class, io.realm.com_pusair_smopi_Model_SaluranRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.SaluranDetail.class, io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pusair.smopi.Model.User.class, io.realm.com_pusair_smopi_Model_UserRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return io.realm.com_pusair_smopi_Model_SaluranRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return io.realm.com_pusair_smopi_Model_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return "Blanko0123";
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return "Blanko0405";
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return "Blanko04Bangtrol";
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return "Blanko06";
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return "Blanko08";
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return "BlankoP01";
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return "BlankoP01Detail";
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return "DaerahIrigasi";
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return "GroupIp3a";
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return "JenisKeadaan";
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return "MusimTanam";
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return "PodaLaporanDaerahIrigasi";
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return "RentangMusimTanam";
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return "Saluran";
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return "SaluranDetail";
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return "User";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_Blanko06RealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_Blanko08RealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_SaluranRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy());
            }
            if (clazz.equals(com.pusair.smopi.Model.User.class)) {
                return clazz.cast(new io.realm.com_pusair_smopi_Model_UserRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Blanko0123) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Blanko0405) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Blanko04Bangtrol) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Blanko06) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Blanko08) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01Detail) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.DaerahIrigasi) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.GroupIp3a) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.JenisKeadaan) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.MusimTanam) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.RentangMusimTanam) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.Saluran) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.SaluranDetail) obj, update, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_UserRealmProxy.copyOrUpdate(realm, (com.pusair.smopi.Model.User) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko0123) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko0405) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko04Bangtrol) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko06) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko08) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insert(realm, (com.pusair.smopi.Model.BlankoP01) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insert(realm, (com.pusair.smopi.Model.BlankoP01Detail) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insert(realm, (com.pusair.smopi.Model.DaerahIrigasi) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insert(realm, (com.pusair.smopi.Model.GroupIp3a) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insert(realm, (com.pusair.smopi.Model.JenisKeadaan) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insert(realm, (com.pusair.smopi.Model.MusimTanam) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insert(realm, (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insert(realm, (com.pusair.smopi.Model.RentangMusimTanam) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insert(realm, (com.pusair.smopi.Model.Saluran) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insert(realm, (com.pusair.smopi.Model.SaluranDetail) object, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            io.realm.com_pusair_smopi_Model_UserRealmProxy.insert(realm, (com.pusair.smopi.Model.User) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
                io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko0123) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
                io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko0405) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
                io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko04Bangtrol) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
                io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko06) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
                io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insert(realm, (com.pusair.smopi.Model.Blanko08) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
                io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insert(realm, (com.pusair.smopi.Model.BlankoP01) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
                io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insert(realm, (com.pusair.smopi.Model.BlankoP01Detail) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
                io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insert(realm, (com.pusair.smopi.Model.DaerahIrigasi) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
                io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insert(realm, (com.pusair.smopi.Model.GroupIp3a) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
                io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insert(realm, (com.pusair.smopi.Model.JenisKeadaan) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
                io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insert(realm, (com.pusair.smopi.Model.MusimTanam) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
                io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insert(realm, (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
                io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insert(realm, (com.pusair.smopi.Model.RentangMusimTanam) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
                io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insert(realm, (com.pusair.smopi.Model.Saluran) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
                io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insert(realm, (com.pusair.smopi.Model.SaluranDetail) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
                io.realm.com_pusair_smopi_Model_UserRealmProxy.insert(realm, (com.pusair.smopi.Model.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
                    io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
                    io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
                    io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
                    io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
                    io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
                    io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
                    io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
                    io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
                    io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
                    io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
                    io.realm.com_pusair_smopi_Model_UserRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko0123) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko0405) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko04Bangtrol) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko06) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko08) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01Detail) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.DaerahIrigasi) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.GroupIp3a) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.JenisKeadaan) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.MusimTanam) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.RentangMusimTanam) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Saluran) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.SaluranDetail) obj, cache);
        } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            io.realm.com_pusair_smopi_Model_UserRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.User) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
                io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko0123) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
                io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko0405) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
                io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko04Bangtrol) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
                io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko06) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
                io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Blanko08) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
                io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
                io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.BlankoP01Detail) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
                io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.DaerahIrigasi) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
                io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.GroupIp3a) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
                io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.JenisKeadaan) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
                io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.MusimTanam) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
                io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
                io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.RentangMusimTanam) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
                io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.Saluran) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
                io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.SaluranDetail) object, cache);
            } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
                io.realm.com_pusair_smopi_Model_UserRealmProxy.insertOrUpdate(realm, (com.pusair.smopi.Model.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
                    io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
                    io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
                    io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
                    io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
                    io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
                    io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
                    io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
                    io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
                    io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
                    io.realm.com_pusair_smopi_Model_SaluranRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
                    io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pusair.smopi.Model.User.class)) {
                    io.realm.com_pusair_smopi_Model_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.pusair.smopi.Model.Blanko0123.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0123RealmProxy.createDetachedCopy((com.pusair.smopi.Model.Blanko0123) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko0405.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko0405RealmProxy.createDetachedCopy((com.pusair.smopi.Model.Blanko0405) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko04Bangtrol.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko04BangtrolRealmProxy.createDetachedCopy((com.pusair.smopi.Model.Blanko04Bangtrol) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko06.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko06RealmProxy.createDetachedCopy((com.pusair.smopi.Model.Blanko06) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Blanko08.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_Blanko08RealmProxy.createDetachedCopy((com.pusair.smopi.Model.Blanko08) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01RealmProxy.createDetachedCopy((com.pusair.smopi.Model.BlankoP01) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.BlankoP01Detail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_BlankoP01DetailRealmProxy.createDetachedCopy((com.pusair.smopi.Model.BlankoP01Detail) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.DaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_DaerahIrigasiRealmProxy.createDetachedCopy((com.pusair.smopi.Model.DaerahIrigasi) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.GroupIp3a.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_GroupIp3aRealmProxy.createDetachedCopy((com.pusair.smopi.Model.GroupIp3a) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.JenisKeadaan.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_JenisKeadaanRealmProxy.createDetachedCopy((com.pusair.smopi.Model.JenisKeadaan) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.MusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_MusimTanamRealmProxy.createDetachedCopy((com.pusair.smopi.Model.MusimTanam) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.PodaLaporanDaerahIrigasi.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_PodaLaporanDaerahIrigasiRealmProxy.createDetachedCopy((com.pusair.smopi.Model.PodaLaporanDaerahIrigasi) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.RentangMusimTanam.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_RentangMusimTanamRealmProxy.createDetachedCopy((com.pusair.smopi.Model.RentangMusimTanam) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.Saluran.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranRealmProxy.createDetachedCopy((com.pusair.smopi.Model.Saluran) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.SaluranDetail.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_SaluranDetailRealmProxy.createDetachedCopy((com.pusair.smopi.Model.SaluranDetail) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pusair.smopi.Model.User.class)) {
            return clazz.cast(io.realm.com_pusair_smopi_Model_UserRealmProxy.createDetachedCopy((com.pusair.smopi.Model.User) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
