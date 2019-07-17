package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableUserRegisterExpandDaoManager;
import com.lzw.wind.tibmas.core.dbo.UserRegisterExpandDO;
import com.lzw.wind.tibmas.core.mapper.UserRegisterExpandMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserRegisterExpandDaoManagerImpl extends CommonDaoManagerImpl<UserRegisterExpandDO,Long> implements ImmutableUserRegisterExpandDaoManager {

        @Autowired
        private UserRegisterExpandMapper userRegisterExpandMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userRegisterExpandMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserRegisterExpandDO.ID,UserRegisterExpandDO.DB_ID);
            fieldMap.put(UserRegisterExpandDO.DB_ID,UserRegisterExpandDO.DB_ID);

            fieldMap.put(UserRegisterExpandDO.PROPERTY_NAME,UserRegisterExpandDO.DB_PROPERTY_NAME);
            fieldMap.put(UserRegisterExpandDO.DB_PROPERTY_NAME,UserRegisterExpandDO.DB_PROPERTY_NAME);

            fieldMap.put(UserRegisterExpandDO.PROPERTY_VALUE,UserRegisterExpandDO.DB_PROPERTY_VALUE);
            fieldMap.put(UserRegisterExpandDO.DB_PROPERTY_VALUE,UserRegisterExpandDO.DB_PROPERTY_VALUE);

            fieldMap.put(UserRegisterExpandDO.REGISTER_ID,UserRegisterExpandDO.DB_REGISTER_ID);
            fieldMap.put(UserRegisterExpandDO.DB_REGISTER_ID,UserRegisterExpandDO.DB_REGISTER_ID);

            fieldMap.put(UserRegisterExpandDO.GMT_CREATE,UserRegisterExpandDO.DB_GMT_CREATE);
            fieldMap.put(UserRegisterExpandDO.DB_GMT_CREATE,UserRegisterExpandDO.DB_GMT_CREATE);

            fieldMap.put(UserRegisterExpandDO.GMT_MODIFIED,UserRegisterExpandDO.DB_GMT_MODIFIED);
            fieldMap.put(UserRegisterExpandDO.DB_GMT_MODIFIED,UserRegisterExpandDO.DB_GMT_MODIFIED);

            fieldMap.put(UserRegisterExpandDO.IS_DELETED,UserRegisterExpandDO.DB_IS_DELETED);
            fieldMap.put(UserRegisterExpandDO.DB_IS_DELETED,UserRegisterExpandDO.DB_IS_DELETED);

            fieldMap.put(UserRegisterExpandDO.USER_ID_CREATE,UserRegisterExpandDO.DB_USER_ID_CREATE);
            fieldMap.put(UserRegisterExpandDO.DB_USER_ID_CREATE,UserRegisterExpandDO.DB_USER_ID_CREATE);

            fieldMap.put(UserRegisterExpandDO.USER_ID_MODIFIED,UserRegisterExpandDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserRegisterExpandDO.DB_USER_ID_MODIFIED,UserRegisterExpandDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<UserRegisterExpandDO> listByPropertyName(String propertyName, String... fieldNames){
            return this.userRegisterExpandMapper.listByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByPropertyName(String propertyName, String... fieldNames){
            return this.userRegisterExpandMapper.mapByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyName(String propertyName){
            return this.userRegisterExpandMapper.countByPropertyName(propertyName);
        }

        public Integer updateNotNullFieldsByPropertyName(UserRegisterExpandDO updateDO, String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer updateAllFieldsByPropertyName(UserRegisterExpandDO updateDO,  String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer deleteByPropertyName( String propertyName){
            return this.userRegisterExpandMapper.deleteByPropertyName(propertyName);
        }



        public List<UserRegisterExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            return this.userRegisterExpandMapper.listByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            return this.userRegisterExpandMapper.mapByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyName(Collection<String> propertyNameList){
            return this.userRegisterExpandMapper.countByInPropertyName(propertyNameList);
        }

        public Integer updateNotNullFieldsByInPropertyName(UserRegisterExpandDO updateDO, Collection<String> propertyNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer updateAllFieldsByInPropertyName(UserRegisterExpandDO updateDO,  Collection<String> propertyNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer deleteByInPropertyName( Collection<String> propertyNameList){
            return this.userRegisterExpandMapper.deleteByInPropertyName(propertyNameList);
        }


        public List<UserRegisterExpandDO> listByPropertyValue(String propertyValue, String... fieldNames){
            return this.userRegisterExpandMapper.listByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames){
            return this.userRegisterExpandMapper.mapByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyValue(String propertyValue){
            return this.userRegisterExpandMapper.countByPropertyValue(propertyValue);
        }

        public Integer updateNotNullFieldsByPropertyValue(UserRegisterExpandDO updateDO, String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer updateAllFieldsByPropertyValue(UserRegisterExpandDO updateDO,  String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer deleteByPropertyValue( String propertyValue){
            return this.userRegisterExpandMapper.deleteByPropertyValue(propertyValue);
        }



        public List<UserRegisterExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            return this.userRegisterExpandMapper.listByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            return this.userRegisterExpandMapper.mapByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyValue(Collection<String> propertyValueList){
            return this.userRegisterExpandMapper.countByInPropertyValue(propertyValueList);
        }

        public Integer updateNotNullFieldsByInPropertyValue(UserRegisterExpandDO updateDO, Collection<String> propertyValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer updateAllFieldsByInPropertyValue(UserRegisterExpandDO updateDO,  Collection<String> propertyValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer deleteByInPropertyValue( Collection<String> propertyValueList){
            return this.userRegisterExpandMapper.deleteByInPropertyValue(propertyValueList);
        }


        public List<UserRegisterExpandDO> listByRegisterId(Long registerId, String... fieldNames){
            return this.userRegisterExpandMapper.listByRegisterId(registerId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByRegisterId(Long registerId, String... fieldNames){
            return this.userRegisterExpandMapper.mapByRegisterId(registerId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRegisterId(Long registerId){
            return this.userRegisterExpandMapper.countByRegisterId(registerId);
        }

        public Integer updateNotNullFieldsByRegisterId(UserRegisterExpandDO updateDO, Long registerId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByRegisterId(updateDO,registerId);
        }

        public Integer updateAllFieldsByRegisterId(UserRegisterExpandDO updateDO,  Long registerId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByRegisterId(updateDO,registerId);
        }

        public Integer deleteByRegisterId( Long registerId){
            return this.userRegisterExpandMapper.deleteByRegisterId(registerId);
        }



        public List<UserRegisterExpandDO> listByInRegisterId(Collection<Long> registerIdList, String... fieldNames){
            return this.userRegisterExpandMapper.listByInRegisterId(registerIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByInRegisterId(Collection<Long> registerIdList, String... fieldNames){
            return this.userRegisterExpandMapper.mapByInRegisterId(registerIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRegisterId(Collection<Long> registerIdList){
            return this.userRegisterExpandMapper.countByInRegisterId(registerIdList);
        }

        public Integer updateNotNullFieldsByInRegisterId(UserRegisterExpandDO updateDO, Collection<Long> registerIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByInRegisterId(updateDO,registerIdList);
        }

        public Integer updateAllFieldsByInRegisterId(UserRegisterExpandDO updateDO,  Collection<Long> registerIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByInRegisterId(updateDO,registerIdList);
        }

        public Integer deleteByInRegisterId( Collection<Long> registerIdList){
            return this.userRegisterExpandMapper.deleteByInRegisterId(registerIdList);
        }


        public List<UserRegisterExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRegisterExpandMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRegisterExpandMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userRegisterExpandMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserRegisterExpandDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserRegisterExpandDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userRegisterExpandMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserRegisterExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRegisterExpandMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRegisterExpandMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.userRegisterExpandMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserRegisterExpandDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserRegisterExpandDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.userRegisterExpandMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserRegisterExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRegisterExpandMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRegisterExpandMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userRegisterExpandMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserRegisterExpandDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserRegisterExpandDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userRegisterExpandMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserRegisterExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRegisterExpandMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRegisterExpandMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.userRegisterExpandMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserRegisterExpandDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserRegisterExpandDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterExpandMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.userRegisterExpandMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

