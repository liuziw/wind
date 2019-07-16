package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableAreaDaoManager;
import com.hyzs.tibmas.core.dbo.AreaDO;
import com.hyzs.tibmas.core.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableAreaDaoManagerImpl extends CommonDaoManagerImpl<AreaDO,Long> implements ImmutableAreaDaoManager {

        @Autowired
        private AreaMapper areaMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(areaMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(AreaDO.ID,AreaDO.DB_ID);
            fieldMap.put(AreaDO.DB_ID,AreaDO.DB_ID);

            fieldMap.put(AreaDO.CODE,AreaDO.DB_CODE);
            fieldMap.put(AreaDO.DB_CODE,AreaDO.DB_CODE);

            fieldMap.put(AreaDO.NAME,AreaDO.DB_NAME);
            fieldMap.put(AreaDO.DB_NAME,AreaDO.DB_NAME);

            fieldMap.put(AreaDO.PID,AreaDO.DB_PID);
            fieldMap.put(AreaDO.DB_PID,AreaDO.DB_PID);

            fieldMap.put(AreaDO.PCODE,AreaDO.DB_PCODE);
            fieldMap.put(AreaDO.DB_PCODE,AreaDO.DB_PCODE);

            fieldMap.put(AreaDO.LONGITUDE,AreaDO.DB_LONGITUDE);
            fieldMap.put(AreaDO.DB_LONGITUDE,AreaDO.DB_LONGITUDE);

            fieldMap.put(AreaDO.LATITUDE,AreaDO.DB_LATITUDE);
            fieldMap.put(AreaDO.DB_LATITUDE,AreaDO.DB_LATITUDE);

            fieldMap.put(AreaDO.LEVEL_PATH,AreaDO.DB_LEVEL_PATH);
            fieldMap.put(AreaDO.DB_LEVEL_PATH,AreaDO.DB_LEVEL_PATH);

            fieldMap.put(AreaDO.LEVEL,AreaDO.DB_LEVEL);
            fieldMap.put(AreaDO.DB_LEVEL,AreaDO.DB_LEVEL);

            fieldMap.put(AreaDO.DEEP,AreaDO.DB_DEEP);
            fieldMap.put(AreaDO.DB_DEEP,AreaDO.DB_DEEP);

            fieldMap.put(AreaDO.GMT_CREATE,AreaDO.DB_GMT_CREATE);
            fieldMap.put(AreaDO.DB_GMT_CREATE,AreaDO.DB_GMT_CREATE);

            fieldMap.put(AreaDO.GMT_MODIFIED,AreaDO.DB_GMT_MODIFIED);
            fieldMap.put(AreaDO.DB_GMT_MODIFIED,AreaDO.DB_GMT_MODIFIED);

            fieldMap.put(AreaDO.IS_DELETED,AreaDO.DB_IS_DELETED);
            fieldMap.put(AreaDO.DB_IS_DELETED,AreaDO.DB_IS_DELETED);

            fieldMap.put(AreaDO.USER_ID_CREATE,AreaDO.DB_USER_ID_CREATE);
            fieldMap.put(AreaDO.DB_USER_ID_CREATE,AreaDO.DB_USER_ID_CREATE);

            fieldMap.put(AreaDO.USER_ID_MODIFIED,AreaDO.DB_USER_ID_MODIFIED);
            fieldMap.put(AreaDO.DB_USER_ID_MODIFIED,AreaDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public AreaDO getById(Long id){
            return this.areaMapper.getById(id);
        }



        public List<AreaDO> listById(Long id, String... fieldNames){
            return this.areaMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapById(Long id, String... fieldNames){
            return this.areaMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.areaMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(AreaDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(AreaDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.areaMapper.deleteById(id);
        }



        public List<AreaDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.areaMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(AreaDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(AreaDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.areaMapper.deleteByInId(idList);
        }


        public List<AreaDO> listByCode(Long code, String... fieldNames){
            return this.areaMapper.listByCode(code,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByCode(Long code, String... fieldNames){
            return this.areaMapper.mapByCode(code,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByCode(Long code){
            return this.areaMapper.countByCode(code);
        }

        public Integer updateNotNullFieldsByCode(AreaDO updateDO, Long code){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByCode(updateDO,code);
        }

        public Integer updateAllFieldsByCode(AreaDO updateDO,  Long code){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByCode(updateDO,code);
        }

        public Integer deleteByCode( Long code){
            return this.areaMapper.deleteByCode(code);
        }



        public List<AreaDO> listByInCode(Collection<Long> codeList, String... fieldNames){
            if(CollectionUtils.isEmpty(codeList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInCode(codeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInCode(Collection<Long> codeList, String... fieldNames){
            if(CollectionUtils.isEmpty(codeList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInCode(codeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInCode(Collection<Long> codeList){
            if(CollectionUtils.isEmpty(codeList)){
                   return 0;
             }
            return this.areaMapper.countByInCode(codeList);
        }

        public Integer updateNotNullFieldsByInCode(AreaDO updateDO, Collection<Long> codeList){
            if(CollectionUtils.isEmpty(codeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInCode(updateDO,codeList);
        }

        public Integer updateAllFieldsByInCode(AreaDO updateDO,  Collection<Long> codeList){
            if(CollectionUtils.isEmpty(codeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInCode(updateDO,codeList);
        }

        public Integer deleteByInCode( Collection<Long> codeList){
            if(CollectionUtils.isEmpty(codeList)){
                           return 0;
             }
            return this.areaMapper.deleteByInCode(codeList);
        }


        public List<AreaDO> listByName(String name, String... fieldNames){
            return this.areaMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByName(String name, String... fieldNames){
            return this.areaMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.areaMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(AreaDO updateDO, String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(AreaDO updateDO,  String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.areaMapper.deleteByName(name);
        }



        public List<AreaDO> listByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInName(Collection<String> nameList, String... fieldNames){
            if(CollectionUtils.isEmpty(nameList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                   return 0;
             }
            return this.areaMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(AreaDO updateDO, Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(AreaDO updateDO,  Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            if(CollectionUtils.isEmpty(nameList)){
                           return 0;
             }
            return this.areaMapper.deleteByInName(nameList);
        }


        public List<AreaDO> listByPid(Long pid, String... fieldNames){
            return this.areaMapper.listByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByPid(Long pid, String... fieldNames){
            return this.areaMapper.mapByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPid(Long pid){
            return this.areaMapper.countByPid(pid);
        }

        public Integer updateNotNullFieldsByPid(AreaDO updateDO, Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByPid(updateDO,pid);
        }

        public Integer updateAllFieldsByPid(AreaDO updateDO,  Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByPid(updateDO,pid);
        }

        public Integer deleteByPid( Long pid){
            return this.areaMapper.deleteByPid(pid);
        }



        public List<AreaDO> listByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPid(Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                   return 0;
             }
            return this.areaMapper.countByInPid(pidList);
        }

        public Integer updateNotNullFieldsByInPid(AreaDO updateDO, Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInPid(updateDO,pidList);
        }

        public Integer updateAllFieldsByInPid(AreaDO updateDO,  Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInPid(updateDO,pidList);
        }

        public Integer deleteByInPid( Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            return this.areaMapper.deleteByInPid(pidList);
        }


        public List<AreaDO> listByPcode(Long pcode, String... fieldNames){
            return this.areaMapper.listByPcode(pcode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByPcode(Long pcode, String... fieldNames){
            return this.areaMapper.mapByPcode(pcode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPcode(Long pcode){
            return this.areaMapper.countByPcode(pcode);
        }

        public Integer updateNotNullFieldsByPcode(AreaDO updateDO, Long pcode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByPcode(updateDO,pcode);
        }

        public Integer updateAllFieldsByPcode(AreaDO updateDO,  Long pcode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByPcode(updateDO,pcode);
        }

        public Integer deleteByPcode( Long pcode){
            return this.areaMapper.deleteByPcode(pcode);
        }



        public List<AreaDO> listByInPcode(Collection<Long> pcodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(pcodeList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInPcode(pcodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInPcode(Collection<Long> pcodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(pcodeList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInPcode(pcodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPcode(Collection<Long> pcodeList){
            if(CollectionUtils.isEmpty(pcodeList)){
                   return 0;
             }
            return this.areaMapper.countByInPcode(pcodeList);
        }

        public Integer updateNotNullFieldsByInPcode(AreaDO updateDO, Collection<Long> pcodeList){
            if(CollectionUtils.isEmpty(pcodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInPcode(updateDO,pcodeList);
        }

        public Integer updateAllFieldsByInPcode(AreaDO updateDO,  Collection<Long> pcodeList){
            if(CollectionUtils.isEmpty(pcodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInPcode(updateDO,pcodeList);
        }

        public Integer deleteByInPcode( Collection<Long> pcodeList){
            if(CollectionUtils.isEmpty(pcodeList)){
                           return 0;
             }
            return this.areaMapper.deleteByInPcode(pcodeList);
        }


        public List<AreaDO> listByLongitude(String longitude, String... fieldNames){
            return this.areaMapper.listByLongitude(longitude,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByLongitude(String longitude, String... fieldNames){
            return this.areaMapper.mapByLongitude(longitude,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLongitude(String longitude){
            return this.areaMapper.countByLongitude(longitude);
        }

        public Integer updateNotNullFieldsByLongitude(AreaDO updateDO, String longitude){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByLongitude(updateDO,longitude);
        }

        public Integer updateAllFieldsByLongitude(AreaDO updateDO,  String longitude){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByLongitude(updateDO,longitude);
        }

        public Integer deleteByLongitude( String longitude){
            return this.areaMapper.deleteByLongitude(longitude);
        }



        public List<AreaDO> listByInLongitude(Collection<String> longitudeList, String... fieldNames){
            if(CollectionUtils.isEmpty(longitudeList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInLongitude(longitudeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInLongitude(Collection<String> longitudeList, String... fieldNames){
            if(CollectionUtils.isEmpty(longitudeList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInLongitude(longitudeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLongitude(Collection<String> longitudeList){
            if(CollectionUtils.isEmpty(longitudeList)){
                   return 0;
             }
            return this.areaMapper.countByInLongitude(longitudeList);
        }

        public Integer updateNotNullFieldsByInLongitude(AreaDO updateDO, Collection<String> longitudeList){
            if(CollectionUtils.isEmpty(longitudeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInLongitude(updateDO,longitudeList);
        }

        public Integer updateAllFieldsByInLongitude(AreaDO updateDO,  Collection<String> longitudeList){
            if(CollectionUtils.isEmpty(longitudeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInLongitude(updateDO,longitudeList);
        }

        public Integer deleteByInLongitude( Collection<String> longitudeList){
            if(CollectionUtils.isEmpty(longitudeList)){
                           return 0;
             }
            return this.areaMapper.deleteByInLongitude(longitudeList);
        }


        public List<AreaDO> listByLatitude(String latitude, String... fieldNames){
            return this.areaMapper.listByLatitude(latitude,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByLatitude(String latitude, String... fieldNames){
            return this.areaMapper.mapByLatitude(latitude,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLatitude(String latitude){
            return this.areaMapper.countByLatitude(latitude);
        }

        public Integer updateNotNullFieldsByLatitude(AreaDO updateDO, String latitude){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByLatitude(updateDO,latitude);
        }

        public Integer updateAllFieldsByLatitude(AreaDO updateDO,  String latitude){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByLatitude(updateDO,latitude);
        }

        public Integer deleteByLatitude( String latitude){
            return this.areaMapper.deleteByLatitude(latitude);
        }



        public List<AreaDO> listByInLatitude(Collection<String> latitudeList, String... fieldNames){
            if(CollectionUtils.isEmpty(latitudeList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInLatitude(latitudeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInLatitude(Collection<String> latitudeList, String... fieldNames){
            if(CollectionUtils.isEmpty(latitudeList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInLatitude(latitudeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLatitude(Collection<String> latitudeList){
            if(CollectionUtils.isEmpty(latitudeList)){
                   return 0;
             }
            return this.areaMapper.countByInLatitude(latitudeList);
        }

        public Integer updateNotNullFieldsByInLatitude(AreaDO updateDO, Collection<String> latitudeList){
            if(CollectionUtils.isEmpty(latitudeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInLatitude(updateDO,latitudeList);
        }

        public Integer updateAllFieldsByInLatitude(AreaDO updateDO,  Collection<String> latitudeList){
            if(CollectionUtils.isEmpty(latitudeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInLatitude(updateDO,latitudeList);
        }

        public Integer deleteByInLatitude( Collection<String> latitudeList){
            if(CollectionUtils.isEmpty(latitudeList)){
                           return 0;
             }
            return this.areaMapper.deleteByInLatitude(latitudeList);
        }


        public List<AreaDO> listByLevelPath(String levelPath, String... fieldNames){
            return this.areaMapper.listByLevelPath(levelPath,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByLevelPath(String levelPath, String... fieldNames){
            return this.areaMapper.mapByLevelPath(levelPath,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLevelPath(String levelPath){
            return this.areaMapper.countByLevelPath(levelPath);
        }

        public Integer updateNotNullFieldsByLevelPath(AreaDO updateDO, String levelPath){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByLevelPath(updateDO,levelPath);
        }

        public Integer updateAllFieldsByLevelPath(AreaDO updateDO,  String levelPath){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByLevelPath(updateDO,levelPath);
        }

        public Integer deleteByLevelPath( String levelPath){
            return this.areaMapper.deleteByLevelPath(levelPath);
        }



        public List<AreaDO> listByInLevelPath(Collection<String> levelPathList, String... fieldNames){
            if(CollectionUtils.isEmpty(levelPathList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInLevelPath(levelPathList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInLevelPath(Collection<String> levelPathList, String... fieldNames){
            if(CollectionUtils.isEmpty(levelPathList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInLevelPath(levelPathList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLevelPath(Collection<String> levelPathList){
            if(CollectionUtils.isEmpty(levelPathList)){
                   return 0;
             }
            return this.areaMapper.countByInLevelPath(levelPathList);
        }

        public Integer updateNotNullFieldsByInLevelPath(AreaDO updateDO, Collection<String> levelPathList){
            if(CollectionUtils.isEmpty(levelPathList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInLevelPath(updateDO,levelPathList);
        }

        public Integer updateAllFieldsByInLevelPath(AreaDO updateDO,  Collection<String> levelPathList){
            if(CollectionUtils.isEmpty(levelPathList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInLevelPath(updateDO,levelPathList);
        }

        public Integer deleteByInLevelPath( Collection<String> levelPathList){
            if(CollectionUtils.isEmpty(levelPathList)){
                           return 0;
             }
            return this.areaMapper.deleteByInLevelPath(levelPathList);
        }


        public List<AreaDO> listByLevel(Integer level, String... fieldNames){
            return this.areaMapper.listByLevel(level,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByLevel(Integer level, String... fieldNames){
            return this.areaMapper.mapByLevel(level,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLevel(Integer level){
            return this.areaMapper.countByLevel(level);
        }

        public Integer updateNotNullFieldsByLevel(AreaDO updateDO, Integer level){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByLevel(updateDO,level);
        }

        public Integer updateAllFieldsByLevel(AreaDO updateDO,  Integer level){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByLevel(updateDO,level);
        }

        public Integer deleteByLevel( Integer level){
            return this.areaMapper.deleteByLevel(level);
        }



        public List<AreaDO> listByInLevel(Collection<Integer> levelList, String... fieldNames){
            if(CollectionUtils.isEmpty(levelList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInLevel(levelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInLevel(Collection<Integer> levelList, String... fieldNames){
            if(CollectionUtils.isEmpty(levelList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInLevel(levelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLevel(Collection<Integer> levelList){
            if(CollectionUtils.isEmpty(levelList)){
                   return 0;
             }
            return this.areaMapper.countByInLevel(levelList);
        }

        public Integer updateNotNullFieldsByInLevel(AreaDO updateDO, Collection<Integer> levelList){
            if(CollectionUtils.isEmpty(levelList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInLevel(updateDO,levelList);
        }

        public Integer updateAllFieldsByInLevel(AreaDO updateDO,  Collection<Integer> levelList){
            if(CollectionUtils.isEmpty(levelList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInLevel(updateDO,levelList);
        }

        public Integer deleteByInLevel( Collection<Integer> levelList){
            if(CollectionUtils.isEmpty(levelList)){
                           return 0;
             }
            return this.areaMapper.deleteByInLevel(levelList);
        }


        public List<AreaDO> listByDeep(Integer deep, String... fieldNames){
            return this.areaMapper.listByDeep(deep,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByDeep(Integer deep, String... fieldNames){
            return this.areaMapper.mapByDeep(deep,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeep(Integer deep){
            return this.areaMapper.countByDeep(deep);
        }

        public Integer updateNotNullFieldsByDeep(AreaDO updateDO, Integer deep){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByDeep(updateDO,deep);
        }

        public Integer updateAllFieldsByDeep(AreaDO updateDO,  Integer deep){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByDeep(updateDO,deep);
        }

        public Integer deleteByDeep( Integer deep){
            return this.areaMapper.deleteByDeep(deep);
        }



        public List<AreaDO> listByInDeep(Collection<Integer> deepList, String... fieldNames){
            if(CollectionUtils.isEmpty(deepList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInDeep(deepList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInDeep(Collection<Integer> deepList, String... fieldNames){
            if(CollectionUtils.isEmpty(deepList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInDeep(deepList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeep(Collection<Integer> deepList){
            if(CollectionUtils.isEmpty(deepList)){
                   return 0;
             }
            return this.areaMapper.countByInDeep(deepList);
        }

        public Integer updateNotNullFieldsByInDeep(AreaDO updateDO, Collection<Integer> deepList){
            if(CollectionUtils.isEmpty(deepList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInDeep(updateDO,deepList);
        }

        public Integer updateAllFieldsByInDeep(AreaDO updateDO,  Collection<Integer> deepList){
            if(CollectionUtils.isEmpty(deepList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInDeep(updateDO,deepList);
        }

        public Integer deleteByInDeep( Collection<Integer> deepList){
            if(CollectionUtils.isEmpty(deepList)){
                           return 0;
             }
            return this.areaMapper.deleteByInDeep(deepList);
        }


        public List<AreaDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.areaMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.areaMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.areaMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(AreaDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(AreaDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.areaMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<AreaDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.areaMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(AreaDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(AreaDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.areaMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<AreaDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.areaMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.areaMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.areaMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(AreaDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(AreaDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.areaMapper.deleteByUserIdModified(userIdModified);
        }



        public List<AreaDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.areaMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,AreaDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.areaMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.areaMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(AreaDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(AreaDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.areaMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.areaMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

