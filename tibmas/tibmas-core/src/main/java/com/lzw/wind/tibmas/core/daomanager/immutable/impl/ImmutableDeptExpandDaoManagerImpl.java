package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableDeptExpandDaoManager;
import com.lzw.wind.tibmas.core.dbo.DeptExpandDO;
import com.lzw.wind.tibmas.core.mapper.DeptExpandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableDeptExpandDaoManagerImpl extends CommonDaoManagerImpl<DeptExpandDO,Long> implements ImmutableDeptExpandDaoManager {

        @Autowired
        private DeptExpandMapper deptExpandMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(deptExpandMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(DeptExpandDO.ID,DeptExpandDO.DB_ID);
            fieldMap.put(DeptExpandDO.DB_ID,DeptExpandDO.DB_ID);

            fieldMap.put(DeptExpandDO.PROPERTY_NAME,DeptExpandDO.DB_PROPERTY_NAME);
            fieldMap.put(DeptExpandDO.DB_PROPERTY_NAME,DeptExpandDO.DB_PROPERTY_NAME);

            fieldMap.put(DeptExpandDO.PROPERTY_VALUE,DeptExpandDO.DB_PROPERTY_VALUE);
            fieldMap.put(DeptExpandDO.DB_PROPERTY_VALUE,DeptExpandDO.DB_PROPERTY_VALUE);

            fieldMap.put(DeptExpandDO.DEPT_ID,DeptExpandDO.DB_DEPT_ID);
            fieldMap.put(DeptExpandDO.DB_DEPT_ID,DeptExpandDO.DB_DEPT_ID);

            fieldMap.put(DeptExpandDO.GMT_CREATE,DeptExpandDO.DB_GMT_CREATE);
            fieldMap.put(DeptExpandDO.DB_GMT_CREATE,DeptExpandDO.DB_GMT_CREATE);

            fieldMap.put(DeptExpandDO.GMT_MODIFIED,DeptExpandDO.DB_GMT_MODIFIED);
            fieldMap.put(DeptExpandDO.DB_GMT_MODIFIED,DeptExpandDO.DB_GMT_MODIFIED);

            fieldMap.put(DeptExpandDO.IS_DELETED,DeptExpandDO.DB_IS_DELETED);
            fieldMap.put(DeptExpandDO.DB_IS_DELETED,DeptExpandDO.DB_IS_DELETED);

            fieldMap.put(DeptExpandDO.USER_ID_CREATE,DeptExpandDO.DB_USER_ID_CREATE);
            fieldMap.put(DeptExpandDO.DB_USER_ID_CREATE,DeptExpandDO.DB_USER_ID_CREATE);

            fieldMap.put(DeptExpandDO.USER_ID_MODIFIED,DeptExpandDO.DB_USER_ID_MODIFIED);
            fieldMap.put(DeptExpandDO.DB_USER_ID_MODIFIED,DeptExpandDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public DeptExpandDO getById(Long id){
            return this.deptExpandMapper.getById(id);
        }



        public List<DeptExpandDO> listById(Long id, String... fieldNames){
            return this.deptExpandMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapById(Long id, String... fieldNames){
            return this.deptExpandMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.deptExpandMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(DeptExpandDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(DeptExpandDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.deptExpandMapper.deleteById(id);
        }



        public List<DeptExpandDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(DeptExpandDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(DeptExpandDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInId(idList);
        }


        public List<DeptExpandDO> listByPropertyName(String propertyName, String... fieldNames){
            return this.deptExpandMapper.listByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByPropertyName(String propertyName, String... fieldNames){
            return this.deptExpandMapper.mapByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyName(String propertyName){
            return this.deptExpandMapper.countByPropertyName(propertyName);
        }

        public Integer updateNotNullFieldsByPropertyName(DeptExpandDO updateDO, String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer updateAllFieldsByPropertyName(DeptExpandDO updateDO,  String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer deleteByPropertyName( String propertyName){
            return this.deptExpandMapper.deleteByPropertyName(propertyName);
        }



        public List<DeptExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(propertyNameList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(propertyNameList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyName(Collection<String> propertyNameList){
            if(CollectionUtils.isEmpty(propertyNameList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInPropertyName(propertyNameList);
        }

        public Integer updateNotNullFieldsByInPropertyName(DeptExpandDO updateDO, Collection<String> propertyNameList){
            if(CollectionUtils.isEmpty(propertyNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer updateAllFieldsByInPropertyName(DeptExpandDO updateDO,  Collection<String> propertyNameList){
            if(CollectionUtils.isEmpty(propertyNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer deleteByInPropertyName( Collection<String> propertyNameList){
            if(CollectionUtils.isEmpty(propertyNameList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInPropertyName(propertyNameList);
        }


        public List<DeptExpandDO> listByPropertyValue(String propertyValue, String... fieldNames){
            return this.deptExpandMapper.listByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames){
            return this.deptExpandMapper.mapByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyValue(String propertyValue){
            return this.deptExpandMapper.countByPropertyValue(propertyValue);
        }

        public Integer updateNotNullFieldsByPropertyValue(DeptExpandDO updateDO, String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer updateAllFieldsByPropertyValue(DeptExpandDO updateDO,  String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer deleteByPropertyValue( String propertyValue){
            return this.deptExpandMapper.deleteByPropertyValue(propertyValue);
        }



        public List<DeptExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            if(CollectionUtils.isEmpty(propertyValueList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            if(CollectionUtils.isEmpty(propertyValueList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyValue(Collection<String> propertyValueList){
            if(CollectionUtils.isEmpty(propertyValueList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInPropertyValue(propertyValueList);
        }

        public Integer updateNotNullFieldsByInPropertyValue(DeptExpandDO updateDO, Collection<String> propertyValueList){
            if(CollectionUtils.isEmpty(propertyValueList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer updateAllFieldsByInPropertyValue(DeptExpandDO updateDO,  Collection<String> propertyValueList){
            if(CollectionUtils.isEmpty(propertyValueList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer deleteByInPropertyValue( Collection<String> propertyValueList){
            if(CollectionUtils.isEmpty(propertyValueList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInPropertyValue(propertyValueList);
        }


        public List<DeptExpandDO> listByDeptId(Long deptId, String... fieldNames){
            return this.deptExpandMapper.listByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByDeptId(Long deptId, String... fieldNames){
            return this.deptExpandMapper.mapByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptId(Long deptId){
            return this.deptExpandMapper.countByDeptId(deptId);
        }

        public Integer updateNotNullFieldsByDeptId(DeptExpandDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByDeptId(updateDO,deptId);
        }

        public Integer updateAllFieldsByDeptId(DeptExpandDO updateDO,  Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByDeptId(updateDO,deptId);
        }

        public Integer deleteByDeptId( Long deptId){
            return this.deptExpandMapper.deleteByDeptId(deptId);
        }



        public List<DeptExpandDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptIdList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptIdList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptId(Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInDeptId(deptIdList);
        }

        public Integer updateNotNullFieldsByInDeptId(DeptExpandDO updateDO, Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer updateAllFieldsByInDeptId(DeptExpandDO updateDO,  Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer deleteByInDeptId( Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInDeptId(deptIdList);
        }


        public List<DeptExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptExpandMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptExpandMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.deptExpandMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(DeptExpandDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(DeptExpandDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.deptExpandMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<DeptExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(DeptExpandDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(DeptExpandDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<DeptExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptExpandMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptExpandMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.deptExpandMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(DeptExpandDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(DeptExpandDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.deptExpandMapper.deleteByUserIdModified(userIdModified);
        }



        public List<DeptExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.deptExpandMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.deptExpandMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.deptExpandMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(DeptExpandDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(DeptExpandDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptExpandMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.deptExpandMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

