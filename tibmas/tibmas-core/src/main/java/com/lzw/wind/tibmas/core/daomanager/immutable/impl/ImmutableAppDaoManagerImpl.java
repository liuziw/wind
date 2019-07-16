package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableAppDaoManager;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.mapper.AppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableAppDaoManagerImpl extends CommonDaoManagerImpl<AppDO,Long> implements ImmutableAppDaoManager {

        @Autowired
        private AppMapper appMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(appMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(AppDO.ID,AppDO.DB_ID);
            fieldMap.put(AppDO.DB_ID,AppDO.DB_ID);

            fieldMap.put(AppDO.APP_CODE,AppDO.DB_APP_CODE);
            fieldMap.put(AppDO.DB_APP_CODE,AppDO.DB_APP_CODE);

            fieldMap.put(AppDO.APP_NAME,AppDO.DB_APP_NAME);
            fieldMap.put(AppDO.DB_APP_NAME,AppDO.DB_APP_NAME);

            fieldMap.put(AppDO.APP_ICON,AppDO.DB_APP_ICON);
            fieldMap.put(AppDO.DB_APP_ICON,AppDO.DB_APP_ICON);

            fieldMap.put(AppDO.APP_DESC,AppDO.DB_APP_DESC);
            fieldMap.put(AppDO.DB_APP_DESC,AppDO.DB_APP_DESC);

            fieldMap.put(AppDO.APP_URL,AppDO.DB_APP_URL);
            fieldMap.put(AppDO.DB_APP_URL,AppDO.DB_APP_URL);

            fieldMap.put(AppDO.ACCESS_KEY,AppDO.DB_ACCESS_KEY);
            fieldMap.put(AppDO.DB_ACCESS_KEY,AppDO.DB_ACCESS_KEY);

            fieldMap.put(AppDO.ACCESS_KEY_PLAIN,AppDO.DB_ACCESS_KEY_PLAIN);
            fieldMap.put(AppDO.DB_ACCESS_KEY_PLAIN,AppDO.DB_ACCESS_KEY_PLAIN);

            fieldMap.put(AppDO.IS_DELETED,AppDO.DB_IS_DELETED);
            fieldMap.put(AppDO.DB_IS_DELETED,AppDO.DB_IS_DELETED);

            fieldMap.put(AppDO.GMT_CREATE,AppDO.DB_GMT_CREATE);
            fieldMap.put(AppDO.DB_GMT_CREATE,AppDO.DB_GMT_CREATE);

            fieldMap.put(AppDO.GMT_MODIFIED,AppDO.DB_GMT_MODIFIED);
            fieldMap.put(AppDO.DB_GMT_MODIFIED,AppDO.DB_GMT_MODIFIED);

            fieldMap.put(AppDO.USER_ID_CREATE,AppDO.DB_USER_ID_CREATE);
            fieldMap.put(AppDO.DB_USER_ID_CREATE,AppDO.DB_USER_ID_CREATE);

            fieldMap.put(AppDO.USER_ID_MODIFIED,AppDO.DB_USER_ID_MODIFIED);
            fieldMap.put(AppDO.DB_USER_ID_MODIFIED,AppDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public AppDO getById(Long id){
            return this.appMapper.getById(id);
        }



        public List<AppDO> listById(Long id, String... fieldNames){
            return this.appMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapById(Long id, String... fieldNames){
            return this.appMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.appMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(AppDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(AppDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.appMapper.deleteById(id);
        }



        public List<AppDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.appMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(AppDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(AppDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.appMapper.deleteByInId(idList);
        }


        public List<AppDO> listByAppCode(String appCode, String... fieldNames){
            return this.appMapper.listByAppCode(appCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAppCode(String appCode, String... fieldNames){
            return this.appMapper.mapByAppCode(appCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppCode(String appCode){
            return this.appMapper.countByAppCode(appCode);
        }

        public Integer updateNotNullFieldsByAppCode(AppDO updateDO, String appCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAppCode(updateDO,appCode);
        }

        public Integer updateAllFieldsByAppCode(AppDO updateDO,  String appCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAppCode(updateDO,appCode);
        }

        public Integer deleteByAppCode( String appCode){
            return this.appMapper.deleteByAppCode(appCode);
        }



        public List<AppDO> listByInAppCode(Collection<String> appCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(appCodeList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAppCode(appCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAppCode(Collection<String> appCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(appCodeList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAppCode(appCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppCode(Collection<String> appCodeList){
            if(CollectionUtils.isEmpty(appCodeList)){
                   return 0;
             }
            return this.appMapper.countByInAppCode(appCodeList);
        }

        public Integer updateNotNullFieldsByInAppCode(AppDO updateDO, Collection<String> appCodeList){
            if(CollectionUtils.isEmpty(appCodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAppCode(updateDO,appCodeList);
        }

        public Integer updateAllFieldsByInAppCode(AppDO updateDO,  Collection<String> appCodeList){
            if(CollectionUtils.isEmpty(appCodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAppCode(updateDO,appCodeList);
        }

        public Integer deleteByInAppCode( Collection<String> appCodeList){
            if(CollectionUtils.isEmpty(appCodeList)){
                           return 0;
             }
            return this.appMapper.deleteByInAppCode(appCodeList);
        }


        public List<AppDO> listByAppName(String appName, String... fieldNames){
            return this.appMapper.listByAppName(appName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAppName(String appName, String... fieldNames){
            return this.appMapper.mapByAppName(appName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppName(String appName){
            return this.appMapper.countByAppName(appName);
        }

        public Integer updateNotNullFieldsByAppName(AppDO updateDO, String appName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAppName(updateDO,appName);
        }

        public Integer updateAllFieldsByAppName(AppDO updateDO,  String appName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAppName(updateDO,appName);
        }

        public Integer deleteByAppName( String appName){
            return this.appMapper.deleteByAppName(appName);
        }



        public List<AppDO> listByInAppName(Collection<String> appNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(appNameList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAppName(appNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAppName(Collection<String> appNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(appNameList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAppName(appNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppName(Collection<String> appNameList){
            if(CollectionUtils.isEmpty(appNameList)){
                   return 0;
             }
            return this.appMapper.countByInAppName(appNameList);
        }

        public Integer updateNotNullFieldsByInAppName(AppDO updateDO, Collection<String> appNameList){
            if(CollectionUtils.isEmpty(appNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAppName(updateDO,appNameList);
        }

        public Integer updateAllFieldsByInAppName(AppDO updateDO,  Collection<String> appNameList){
            if(CollectionUtils.isEmpty(appNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAppName(updateDO,appNameList);
        }

        public Integer deleteByInAppName( Collection<String> appNameList){
            if(CollectionUtils.isEmpty(appNameList)){
                           return 0;
             }
            return this.appMapper.deleteByInAppName(appNameList);
        }


        public List<AppDO> listByAppIcon(Long appIcon, String... fieldNames){
            return this.appMapper.listByAppIcon(appIcon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAppIcon(Long appIcon, String... fieldNames){
            return this.appMapper.mapByAppIcon(appIcon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppIcon(Long appIcon){
            return this.appMapper.countByAppIcon(appIcon);
        }

        public Integer updateNotNullFieldsByAppIcon(AppDO updateDO, Long appIcon){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAppIcon(updateDO,appIcon);
        }

        public Integer updateAllFieldsByAppIcon(AppDO updateDO,  Long appIcon){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAppIcon(updateDO,appIcon);
        }

        public Integer deleteByAppIcon( Long appIcon){
            return this.appMapper.deleteByAppIcon(appIcon);
        }



        public List<AppDO> listByInAppIcon(Collection<Long> appIconList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIconList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAppIcon(appIconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAppIcon(Collection<Long> appIconList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIconList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAppIcon(appIconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppIcon(Collection<Long> appIconList){
            if(CollectionUtils.isEmpty(appIconList)){
                   return 0;
             }
            return this.appMapper.countByInAppIcon(appIconList);
        }

        public Integer updateNotNullFieldsByInAppIcon(AppDO updateDO, Collection<Long> appIconList){
            if(CollectionUtils.isEmpty(appIconList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAppIcon(updateDO,appIconList);
        }

        public Integer updateAllFieldsByInAppIcon(AppDO updateDO,  Collection<Long> appIconList){
            if(CollectionUtils.isEmpty(appIconList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAppIcon(updateDO,appIconList);
        }

        public Integer deleteByInAppIcon( Collection<Long> appIconList){
            if(CollectionUtils.isEmpty(appIconList)){
                           return 0;
             }
            return this.appMapper.deleteByInAppIcon(appIconList);
        }


        public List<AppDO> listByAppDesc(String appDesc, String... fieldNames){
            return this.appMapper.listByAppDesc(appDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAppDesc(String appDesc, String... fieldNames){
            return this.appMapper.mapByAppDesc(appDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppDesc(String appDesc){
            return this.appMapper.countByAppDesc(appDesc);
        }

        public Integer updateNotNullFieldsByAppDesc(AppDO updateDO, String appDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAppDesc(updateDO,appDesc);
        }

        public Integer updateAllFieldsByAppDesc(AppDO updateDO,  String appDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAppDesc(updateDO,appDesc);
        }

        public Integer deleteByAppDesc( String appDesc){
            return this.appMapper.deleteByAppDesc(appDesc);
        }



        public List<AppDO> listByInAppDesc(Collection<String> appDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(appDescList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAppDesc(appDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAppDesc(Collection<String> appDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(appDescList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAppDesc(appDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppDesc(Collection<String> appDescList){
            if(CollectionUtils.isEmpty(appDescList)){
                   return 0;
             }
            return this.appMapper.countByInAppDesc(appDescList);
        }

        public Integer updateNotNullFieldsByInAppDesc(AppDO updateDO, Collection<String> appDescList){
            if(CollectionUtils.isEmpty(appDescList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAppDesc(updateDO,appDescList);
        }

        public Integer updateAllFieldsByInAppDesc(AppDO updateDO,  Collection<String> appDescList){
            if(CollectionUtils.isEmpty(appDescList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAppDesc(updateDO,appDescList);
        }

        public Integer deleteByInAppDesc( Collection<String> appDescList){
            if(CollectionUtils.isEmpty(appDescList)){
                           return 0;
             }
            return this.appMapper.deleteByInAppDesc(appDescList);
        }


        public List<AppDO> listByAppUrl(String appUrl, String... fieldNames){
            return this.appMapper.listByAppUrl(appUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAppUrl(String appUrl, String... fieldNames){
            return this.appMapper.mapByAppUrl(appUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppUrl(String appUrl){
            return this.appMapper.countByAppUrl(appUrl);
        }

        public Integer updateNotNullFieldsByAppUrl(AppDO updateDO, String appUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAppUrl(updateDO,appUrl);
        }

        public Integer updateAllFieldsByAppUrl(AppDO updateDO,  String appUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAppUrl(updateDO,appUrl);
        }

        public Integer deleteByAppUrl( String appUrl){
            return this.appMapper.deleteByAppUrl(appUrl);
        }



        public List<AppDO> listByInAppUrl(Collection<String> appUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(appUrlList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAppUrl(appUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAppUrl(Collection<String> appUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(appUrlList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAppUrl(appUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppUrl(Collection<String> appUrlList){
            if(CollectionUtils.isEmpty(appUrlList)){
                   return 0;
             }
            return this.appMapper.countByInAppUrl(appUrlList);
        }

        public Integer updateNotNullFieldsByInAppUrl(AppDO updateDO, Collection<String> appUrlList){
            if(CollectionUtils.isEmpty(appUrlList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAppUrl(updateDO,appUrlList);
        }

        public Integer updateAllFieldsByInAppUrl(AppDO updateDO,  Collection<String> appUrlList){
            if(CollectionUtils.isEmpty(appUrlList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAppUrl(updateDO,appUrlList);
        }

        public Integer deleteByInAppUrl( Collection<String> appUrlList){
            if(CollectionUtils.isEmpty(appUrlList)){
                           return 0;
             }
            return this.appMapper.deleteByInAppUrl(appUrlList);
        }


        public List<AppDO> listByAccessKey(String accessKey, String... fieldNames){
            return this.appMapper.listByAccessKey(accessKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAccessKey(String accessKey, String... fieldNames){
            return this.appMapper.mapByAccessKey(accessKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAccessKey(String accessKey){
            return this.appMapper.countByAccessKey(accessKey);
        }

        public Integer updateNotNullFieldsByAccessKey(AppDO updateDO, String accessKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAccessKey(updateDO,accessKey);
        }

        public Integer updateAllFieldsByAccessKey(AppDO updateDO,  String accessKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAccessKey(updateDO,accessKey);
        }

        public Integer deleteByAccessKey( String accessKey){
            return this.appMapper.deleteByAccessKey(accessKey);
        }



        public List<AppDO> listByInAccessKey(Collection<String> accessKeyList, String... fieldNames){
            if(CollectionUtils.isEmpty(accessKeyList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAccessKey(accessKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAccessKey(Collection<String> accessKeyList, String... fieldNames){
            if(CollectionUtils.isEmpty(accessKeyList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAccessKey(accessKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAccessKey(Collection<String> accessKeyList){
            if(CollectionUtils.isEmpty(accessKeyList)){
                   return 0;
             }
            return this.appMapper.countByInAccessKey(accessKeyList);
        }

        public Integer updateNotNullFieldsByInAccessKey(AppDO updateDO, Collection<String> accessKeyList){
            if(CollectionUtils.isEmpty(accessKeyList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAccessKey(updateDO,accessKeyList);
        }

        public Integer updateAllFieldsByInAccessKey(AppDO updateDO,  Collection<String> accessKeyList){
            if(CollectionUtils.isEmpty(accessKeyList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAccessKey(updateDO,accessKeyList);
        }

        public Integer deleteByInAccessKey( Collection<String> accessKeyList){
            if(CollectionUtils.isEmpty(accessKeyList)){
                           return 0;
             }
            return this.appMapper.deleteByInAccessKey(accessKeyList);
        }


        public List<AppDO> listByAccessKeyPlain(String accessKeyPlain, String... fieldNames){
            return this.appMapper.listByAccessKeyPlain(accessKeyPlain,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByAccessKeyPlain(String accessKeyPlain, String... fieldNames){
            return this.appMapper.mapByAccessKeyPlain(accessKeyPlain,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAccessKeyPlain(String accessKeyPlain){
            return this.appMapper.countByAccessKeyPlain(accessKeyPlain);
        }

        public Integer updateNotNullFieldsByAccessKeyPlain(AppDO updateDO, String accessKeyPlain){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByAccessKeyPlain(updateDO,accessKeyPlain);
        }

        public Integer updateAllFieldsByAccessKeyPlain(AppDO updateDO,  String accessKeyPlain){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByAccessKeyPlain(updateDO,accessKeyPlain);
        }

        public Integer deleteByAccessKeyPlain( String accessKeyPlain){
            return this.appMapper.deleteByAccessKeyPlain(accessKeyPlain);
        }



        public List<AppDO> listByInAccessKeyPlain(Collection<String> accessKeyPlainList, String... fieldNames){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInAccessKeyPlain(accessKeyPlainList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInAccessKeyPlain(Collection<String> accessKeyPlainList, String... fieldNames){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInAccessKeyPlain(accessKeyPlainList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAccessKeyPlain(Collection<String> accessKeyPlainList){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                   return 0;
             }
            return this.appMapper.countByInAccessKeyPlain(accessKeyPlainList);
        }

        public Integer updateNotNullFieldsByInAccessKeyPlain(AppDO updateDO, Collection<String> accessKeyPlainList){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInAccessKeyPlain(updateDO,accessKeyPlainList);
        }

        public Integer updateAllFieldsByInAccessKeyPlain(AppDO updateDO,  Collection<String> accessKeyPlainList){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInAccessKeyPlain(updateDO,accessKeyPlainList);
        }

        public Integer deleteByInAccessKeyPlain( Collection<String> accessKeyPlainList){
            if(CollectionUtils.isEmpty(accessKeyPlainList)){
                           return 0;
             }
            return this.appMapper.deleteByInAccessKeyPlain(accessKeyPlainList);
        }


        public List<AppDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.appMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.appMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.appMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(AppDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(AppDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.appMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<AppDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.appMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(AppDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(AppDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.appMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<AppDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.appMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.appMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.appMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(AppDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(AppDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.appMapper.deleteByUserIdModified(userIdModified);
        }



        public List<AppDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.appMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.appMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.appMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(AppDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(AppDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.appMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

