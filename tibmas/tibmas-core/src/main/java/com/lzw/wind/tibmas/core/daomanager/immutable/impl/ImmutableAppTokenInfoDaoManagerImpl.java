package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableAppTokenInfoDaoManager;
import com.hyzs.tibmas.core.dbo.AppTokenInfoDO;
import com.hyzs.tibmas.core.mapper.AppTokenInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableAppTokenInfoDaoManagerImpl extends CommonDaoManagerImpl<AppTokenInfoDO,Long> implements ImmutableAppTokenInfoDaoManager {

        @Autowired
        private AppTokenInfoMapper appTokenInfoMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(appTokenInfoMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(AppTokenInfoDO.ID,AppTokenInfoDO.DB_ID);
            fieldMap.put(AppTokenInfoDO.DB_ID,AppTokenInfoDO.DB_ID);

            fieldMap.put(AppTokenInfoDO.USER_ID,AppTokenInfoDO.DB_USER_ID);
            fieldMap.put(AppTokenInfoDO.DB_USER_ID,AppTokenInfoDO.DB_USER_ID);

            fieldMap.put(AppTokenInfoDO.APP_ID,AppTokenInfoDO.DB_APP_ID);
            fieldMap.put(AppTokenInfoDO.DB_APP_ID,AppTokenInfoDO.DB_APP_ID);

            fieldMap.put(AppTokenInfoDO.TOKEN,AppTokenInfoDO.DB_TOKEN);
            fieldMap.put(AppTokenInfoDO.DB_TOKEN,AppTokenInfoDO.DB_TOKEN);

            fieldMap.put(AppTokenInfoDO.REMARK,AppTokenInfoDO.DB_REMARK);
            fieldMap.put(AppTokenInfoDO.DB_REMARK,AppTokenInfoDO.DB_REMARK);

            fieldMap.put(AppTokenInfoDO.SERIAL_NUMBER,AppTokenInfoDO.DB_SERIAL_NUMBER);
            fieldMap.put(AppTokenInfoDO.DB_SERIAL_NUMBER,AppTokenInfoDO.DB_SERIAL_NUMBER);

            fieldMap.put(AppTokenInfoDO.IMEI,AppTokenInfoDO.DB_IMEI);
            fieldMap.put(AppTokenInfoDO.DB_IMEI,AppTokenInfoDO.DB_IMEI);

            fieldMap.put(AppTokenInfoDO.SERVE_AREA,AppTokenInfoDO.DB_SERVE_AREA);
            fieldMap.put(AppTokenInfoDO.DB_SERVE_AREA,AppTokenInfoDO.DB_SERVE_AREA);

            fieldMap.put(AppTokenInfoDO.DEVICE_TYPE,AppTokenInfoDO.DB_DEVICE_TYPE);
            fieldMap.put(AppTokenInfoDO.DB_DEVICE_TYPE,AppTokenInfoDO.DB_DEVICE_TYPE);

            fieldMap.put(AppTokenInfoDO.IS_DELETED,AppTokenInfoDO.DB_IS_DELETED);
            fieldMap.put(AppTokenInfoDO.DB_IS_DELETED,AppTokenInfoDO.DB_IS_DELETED);

            fieldMap.put(AppTokenInfoDO.GMT_CREATE,AppTokenInfoDO.DB_GMT_CREATE);
            fieldMap.put(AppTokenInfoDO.DB_GMT_CREATE,AppTokenInfoDO.DB_GMT_CREATE);

            fieldMap.put(AppTokenInfoDO.GMT_MODIFIED,AppTokenInfoDO.DB_GMT_MODIFIED);
            fieldMap.put(AppTokenInfoDO.DB_GMT_MODIFIED,AppTokenInfoDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public AppTokenInfoDO getById(Long id){
            return this.appTokenInfoMapper.getById(id);
        }



        public List<AppTokenInfoDO> listById(Long id, String... fieldNames){
            return this.appTokenInfoMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapById(Long id, String... fieldNames){
            return this.appTokenInfoMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.appTokenInfoMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(AppTokenInfoDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(AppTokenInfoDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.appTokenInfoMapper.deleteById(id);
        }



        public List<AppTokenInfoDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(AppTokenInfoDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(AppTokenInfoDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInId(idList);
        }


        public List<AppTokenInfoDO> listByUserId(Long userId, String... fieldNames){
            return this.appTokenInfoMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByUserId(Long userId, String... fieldNames){
            return this.appTokenInfoMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.appTokenInfoMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(AppTokenInfoDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(AppTokenInfoDO updateDO,  Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.appTokenInfoMapper.deleteByUserId(userId);
        }



        public List<AppTokenInfoDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            if(CollectionUtils.isEmpty(userIdList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(AppTokenInfoDO updateDO, Collection<Long> userIdList){
            if(CollectionUtils.isEmpty(userIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(AppTokenInfoDO updateDO,  Collection<Long> userIdList){
            if(CollectionUtils.isEmpty(userIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            if(CollectionUtils.isEmpty(userIdList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInUserId(userIdList);
        }


        public List<AppTokenInfoDO> listByAppId(Long appId, String... fieldNames){
            return this.appTokenInfoMapper.listByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByAppId(Long appId, String... fieldNames){
            return this.appTokenInfoMapper.mapByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppId(Long appId){
            return this.appTokenInfoMapper.countByAppId(appId);
        }

        public Integer updateNotNullFieldsByAppId(AppTokenInfoDO updateDO, Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByAppId(updateDO,appId);
        }

        public Integer updateAllFieldsByAppId(AppTokenInfoDO updateDO,  Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByAppId(updateDO,appId);
        }

        public Integer deleteByAppId( Long appId){
            return this.appTokenInfoMapper.deleteByAppId(appId);
        }



        public List<AppTokenInfoDO> listByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppId(Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInAppId(appIdList);
        }

        public Integer updateNotNullFieldsByInAppId(AppTokenInfoDO updateDO, Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInAppId(updateDO,appIdList);
        }

        public Integer updateAllFieldsByInAppId(AppTokenInfoDO updateDO,  Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInAppId(updateDO,appIdList);
        }

        public Integer deleteByInAppId( Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInAppId(appIdList);
        }


        public List<AppTokenInfoDO> listByToken(String token, String... fieldNames){
            return this.appTokenInfoMapper.listByToken(token,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByToken(String token, String... fieldNames){
            return this.appTokenInfoMapper.mapByToken(token,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByToken(String token){
            return this.appTokenInfoMapper.countByToken(token);
        }

        public Integer updateNotNullFieldsByToken(AppTokenInfoDO updateDO, String token){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByToken(updateDO,token);
        }

        public Integer updateAllFieldsByToken(AppTokenInfoDO updateDO,  String token){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByToken(updateDO,token);
        }

        public Integer deleteByToken( String token){
            return this.appTokenInfoMapper.deleteByToken(token);
        }



        public List<AppTokenInfoDO> listByInToken(Collection<String> tokenList, String... fieldNames){
            if(CollectionUtils.isEmpty(tokenList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInToken(tokenList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInToken(Collection<String> tokenList, String... fieldNames){
            if(CollectionUtils.isEmpty(tokenList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInToken(tokenList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInToken(Collection<String> tokenList){
            if(CollectionUtils.isEmpty(tokenList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInToken(tokenList);
        }

        public Integer updateNotNullFieldsByInToken(AppTokenInfoDO updateDO, Collection<String> tokenList){
            if(CollectionUtils.isEmpty(tokenList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInToken(updateDO,tokenList);
        }

        public Integer updateAllFieldsByInToken(AppTokenInfoDO updateDO,  Collection<String> tokenList){
            if(CollectionUtils.isEmpty(tokenList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInToken(updateDO,tokenList);
        }

        public Integer deleteByInToken( Collection<String> tokenList){
            if(CollectionUtils.isEmpty(tokenList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInToken(tokenList);
        }


        public List<AppTokenInfoDO> listByRemark(String remark, String... fieldNames){
            return this.appTokenInfoMapper.listByRemark(remark,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByRemark(String remark, String... fieldNames){
            return this.appTokenInfoMapper.mapByRemark(remark,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRemark(String remark){
            return this.appTokenInfoMapper.countByRemark(remark);
        }

        public Integer updateNotNullFieldsByRemark(AppTokenInfoDO updateDO, String remark){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByRemark(updateDO,remark);
        }

        public Integer updateAllFieldsByRemark(AppTokenInfoDO updateDO,  String remark){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByRemark(updateDO,remark);
        }

        public Integer deleteByRemark( String remark){
            return this.appTokenInfoMapper.deleteByRemark(remark);
        }



        public List<AppTokenInfoDO> listByInRemark(Collection<String> remarkList, String... fieldNames){
            if(CollectionUtils.isEmpty(remarkList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInRemark(remarkList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInRemark(Collection<String> remarkList, String... fieldNames){
            if(CollectionUtils.isEmpty(remarkList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInRemark(remarkList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRemark(Collection<String> remarkList){
            if(CollectionUtils.isEmpty(remarkList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInRemark(remarkList);
        }

        public Integer updateNotNullFieldsByInRemark(AppTokenInfoDO updateDO, Collection<String> remarkList){
            if(CollectionUtils.isEmpty(remarkList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInRemark(updateDO,remarkList);
        }

        public Integer updateAllFieldsByInRemark(AppTokenInfoDO updateDO,  Collection<String> remarkList){
            if(CollectionUtils.isEmpty(remarkList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInRemark(updateDO,remarkList);
        }

        public Integer deleteByInRemark( Collection<String> remarkList){
            if(CollectionUtils.isEmpty(remarkList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInRemark(remarkList);
        }


        public List<AppTokenInfoDO> listBySerialNumber(String serialNumber, String... fieldNames){
            return this.appTokenInfoMapper.listBySerialNumber(serialNumber,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapBySerialNumber(String serialNumber, String... fieldNames){
            return this.appTokenInfoMapper.mapBySerialNumber(serialNumber,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySerialNumber(String serialNumber){
            return this.appTokenInfoMapper.countBySerialNumber(serialNumber);
        }

        public Integer updateNotNullFieldsBySerialNumber(AppTokenInfoDO updateDO, String serialNumber){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsBySerialNumber(updateDO,serialNumber);
        }

        public Integer updateAllFieldsBySerialNumber(AppTokenInfoDO updateDO,  String serialNumber){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsBySerialNumber(updateDO,serialNumber);
        }

        public Integer deleteBySerialNumber( String serialNumber){
            return this.appTokenInfoMapper.deleteBySerialNumber(serialNumber);
        }



        public List<AppTokenInfoDO> listByInSerialNumber(Collection<String> serialNumberList, String... fieldNames){
            if(CollectionUtils.isEmpty(serialNumberList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInSerialNumber(serialNumberList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInSerialNumber(Collection<String> serialNumberList, String... fieldNames){
            if(CollectionUtils.isEmpty(serialNumberList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInSerialNumber(serialNumberList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSerialNumber(Collection<String> serialNumberList){
            if(CollectionUtils.isEmpty(serialNumberList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInSerialNumber(serialNumberList);
        }

        public Integer updateNotNullFieldsByInSerialNumber(AppTokenInfoDO updateDO, Collection<String> serialNumberList){
            if(CollectionUtils.isEmpty(serialNumberList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInSerialNumber(updateDO,serialNumberList);
        }

        public Integer updateAllFieldsByInSerialNumber(AppTokenInfoDO updateDO,  Collection<String> serialNumberList){
            if(CollectionUtils.isEmpty(serialNumberList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInSerialNumber(updateDO,serialNumberList);
        }

        public Integer deleteByInSerialNumber( Collection<String> serialNumberList){
            if(CollectionUtils.isEmpty(serialNumberList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInSerialNumber(serialNumberList);
        }


        public List<AppTokenInfoDO> listByImei(String imei, String... fieldNames){
            return this.appTokenInfoMapper.listByImei(imei,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByImei(String imei, String... fieldNames){
            return this.appTokenInfoMapper.mapByImei(imei,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByImei(String imei){
            return this.appTokenInfoMapper.countByImei(imei);
        }

        public Integer updateNotNullFieldsByImei(AppTokenInfoDO updateDO, String imei){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByImei(updateDO,imei);
        }

        public Integer updateAllFieldsByImei(AppTokenInfoDO updateDO,  String imei){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByImei(updateDO,imei);
        }

        public Integer deleteByImei( String imei){
            return this.appTokenInfoMapper.deleteByImei(imei);
        }



        public List<AppTokenInfoDO> listByInImei(Collection<String> imeiList, String... fieldNames){
            if(CollectionUtils.isEmpty(imeiList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInImei(imeiList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInImei(Collection<String> imeiList, String... fieldNames){
            if(CollectionUtils.isEmpty(imeiList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInImei(imeiList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInImei(Collection<String> imeiList){
            if(CollectionUtils.isEmpty(imeiList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInImei(imeiList);
        }

        public Integer updateNotNullFieldsByInImei(AppTokenInfoDO updateDO, Collection<String> imeiList){
            if(CollectionUtils.isEmpty(imeiList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInImei(updateDO,imeiList);
        }

        public Integer updateAllFieldsByInImei(AppTokenInfoDO updateDO,  Collection<String> imeiList){
            if(CollectionUtils.isEmpty(imeiList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInImei(updateDO,imeiList);
        }

        public Integer deleteByInImei( Collection<String> imeiList){
            if(CollectionUtils.isEmpty(imeiList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInImei(imeiList);
        }


        public List<AppTokenInfoDO> listByServeArea(String serveArea, String... fieldNames){
            return this.appTokenInfoMapper.listByServeArea(serveArea,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByServeArea(String serveArea, String... fieldNames){
            return this.appTokenInfoMapper.mapByServeArea(serveArea,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByServeArea(String serveArea){
            return this.appTokenInfoMapper.countByServeArea(serveArea);
        }

        public Integer updateNotNullFieldsByServeArea(AppTokenInfoDO updateDO, String serveArea){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByServeArea(updateDO,serveArea);
        }

        public Integer updateAllFieldsByServeArea(AppTokenInfoDO updateDO,  String serveArea){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByServeArea(updateDO,serveArea);
        }

        public Integer deleteByServeArea( String serveArea){
            return this.appTokenInfoMapper.deleteByServeArea(serveArea);
        }



        public List<AppTokenInfoDO> listByInServeArea(Collection<String> serveAreaList, String... fieldNames){
            if(CollectionUtils.isEmpty(serveAreaList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInServeArea(serveAreaList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInServeArea(Collection<String> serveAreaList, String... fieldNames){
            if(CollectionUtils.isEmpty(serveAreaList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInServeArea(serveAreaList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInServeArea(Collection<String> serveAreaList){
            if(CollectionUtils.isEmpty(serveAreaList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInServeArea(serveAreaList);
        }

        public Integer updateNotNullFieldsByInServeArea(AppTokenInfoDO updateDO, Collection<String> serveAreaList){
            if(CollectionUtils.isEmpty(serveAreaList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInServeArea(updateDO,serveAreaList);
        }

        public Integer updateAllFieldsByInServeArea(AppTokenInfoDO updateDO,  Collection<String> serveAreaList){
            if(CollectionUtils.isEmpty(serveAreaList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInServeArea(updateDO,serveAreaList);
        }

        public Integer deleteByInServeArea( Collection<String> serveAreaList){
            if(CollectionUtils.isEmpty(serveAreaList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInServeArea(serveAreaList);
        }


        public List<AppTokenInfoDO> listByDeviceType(Integer deviceType, String... fieldNames){
            return this.appTokenInfoMapper.listByDeviceType(deviceType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByDeviceType(Integer deviceType, String... fieldNames){
            return this.appTokenInfoMapper.mapByDeviceType(deviceType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeviceType(Integer deviceType){
            return this.appTokenInfoMapper.countByDeviceType(deviceType);
        }

        public Integer updateNotNullFieldsByDeviceType(AppTokenInfoDO updateDO, Integer deviceType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByDeviceType(updateDO,deviceType);
        }

        public Integer updateAllFieldsByDeviceType(AppTokenInfoDO updateDO,  Integer deviceType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByDeviceType(updateDO,deviceType);
        }

        public Integer deleteByDeviceType( Integer deviceType){
            return this.appTokenInfoMapper.deleteByDeviceType(deviceType);
        }



        public List<AppTokenInfoDO> listByInDeviceType(Collection<Integer> deviceTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                return new ArrayList<>(0);
            }
            return this.appTokenInfoMapper.listByInDeviceType(deviceTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AppTokenInfoDO> mapByInDeviceType(Collection<Integer> deviceTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                 return new HashMap<>();
            }
            return this.appTokenInfoMapper.mapByInDeviceType(deviceTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeviceType(Collection<Integer> deviceTypeList){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                   return 0;
             }
            return this.appTokenInfoMapper.countByInDeviceType(deviceTypeList);
        }

        public Integer updateNotNullFieldsByInDeviceType(AppTokenInfoDO updateDO, Collection<Integer> deviceTypeList){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateNotNullFieldsByInDeviceType(updateDO,deviceTypeList);
        }

        public Integer updateAllFieldsByInDeviceType(AppTokenInfoDO updateDO,  Collection<Integer> deviceTypeList){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.appTokenInfoMapper.updateAllFieldsByInDeviceType(updateDO,deviceTypeList);
        }

        public Integer deleteByInDeviceType( Collection<Integer> deviceTypeList){
            if(CollectionUtils.isEmpty(deviceTypeList)){
                           return 0;
             }
            return this.appTokenInfoMapper.deleteByInDeviceType(deviceTypeList);
        }


}

