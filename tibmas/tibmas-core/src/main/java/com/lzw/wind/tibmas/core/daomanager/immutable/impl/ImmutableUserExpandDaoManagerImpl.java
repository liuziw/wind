package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableUserExpandDaoManager;
import com.hyzs.tibmas.core.dbo.UserExpandDO;
import com.hyzs.tibmas.core.mapper.UserExpandMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserExpandDaoManagerImpl extends CommonDaoManagerImpl<UserExpandDO,Long> implements ImmutableUserExpandDaoManager {

        @Autowired
        private UserExpandMapper userExpandMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userExpandMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserExpandDO.ID,UserExpandDO.DB_ID);
            fieldMap.put(UserExpandDO.DB_ID,UserExpandDO.DB_ID);

            fieldMap.put(UserExpandDO.PROPERTY_NAME,UserExpandDO.DB_PROPERTY_NAME);
            fieldMap.put(UserExpandDO.DB_PROPERTY_NAME,UserExpandDO.DB_PROPERTY_NAME);

            fieldMap.put(UserExpandDO.PROPERTY_VALUE,UserExpandDO.DB_PROPERTY_VALUE);
            fieldMap.put(UserExpandDO.DB_PROPERTY_VALUE,UserExpandDO.DB_PROPERTY_VALUE);

            fieldMap.put(UserExpandDO.USER_ID,UserExpandDO.DB_USER_ID);
            fieldMap.put(UserExpandDO.DB_USER_ID,UserExpandDO.DB_USER_ID);

            fieldMap.put(UserExpandDO.GMT_CREATE,UserExpandDO.DB_GMT_CREATE);
            fieldMap.put(UserExpandDO.DB_GMT_CREATE,UserExpandDO.DB_GMT_CREATE);

            fieldMap.put(UserExpandDO.GMT_MODIFIED,UserExpandDO.DB_GMT_MODIFIED);
            fieldMap.put(UserExpandDO.DB_GMT_MODIFIED,UserExpandDO.DB_GMT_MODIFIED);

            fieldMap.put(UserExpandDO.IS_DELETED,UserExpandDO.DB_IS_DELETED);
            fieldMap.put(UserExpandDO.DB_IS_DELETED,UserExpandDO.DB_IS_DELETED);

            fieldMap.put(UserExpandDO.USER_ID_CREATE,UserExpandDO.DB_USER_ID_CREATE);
            fieldMap.put(UserExpandDO.DB_USER_ID_CREATE,UserExpandDO.DB_USER_ID_CREATE);

            fieldMap.put(UserExpandDO.USER_ID_MODIFIED,UserExpandDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserExpandDO.DB_USER_ID_MODIFIED,UserExpandDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<UserExpandDO> listByPropertyName(String propertyName, String... fieldNames){
            return this.userExpandMapper.listByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByPropertyName(String propertyName, String... fieldNames){
            return this.userExpandMapper.mapByPropertyName(propertyName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyName(String propertyName){
            return this.userExpandMapper.countByPropertyName(propertyName);
        }

        public Integer updateNotNullFieldsByPropertyName(UserExpandDO updateDO, String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer updateAllFieldsByPropertyName(UserExpandDO updateDO,  String propertyName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByPropertyName(updateDO,propertyName);
        }

        public Integer deleteByPropertyName( String propertyName){
            return this.userExpandMapper.deleteByPropertyName(propertyName);
        }



        public List<UserExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            return this.userExpandMapper.listByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
            return this.userExpandMapper.mapByInPropertyName(propertyNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyName(Collection<String> propertyNameList){
            return this.userExpandMapper.countByInPropertyName(propertyNameList);
        }

        public Integer updateNotNullFieldsByInPropertyName(UserExpandDO updateDO, Collection<String> propertyNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer updateAllFieldsByInPropertyName(UserExpandDO updateDO,  Collection<String> propertyNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByInPropertyName(updateDO,propertyNameList);
        }

        public Integer deleteByInPropertyName( Collection<String> propertyNameList){
            return this.userExpandMapper.deleteByInPropertyName(propertyNameList);
        }


        public List<UserExpandDO> listByPropertyValue(String propertyValue, String... fieldNames){
            return this.userExpandMapper.listByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames){
            return this.userExpandMapper.mapByPropertyValue(propertyValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPropertyValue(String propertyValue){
            return this.userExpandMapper.countByPropertyValue(propertyValue);
        }

        public Integer updateNotNullFieldsByPropertyValue(UserExpandDO updateDO, String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer updateAllFieldsByPropertyValue(UserExpandDO updateDO,  String propertyValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByPropertyValue(updateDO,propertyValue);
        }

        public Integer deleteByPropertyValue( String propertyValue){
            return this.userExpandMapper.deleteByPropertyValue(propertyValue);
        }



        public List<UserExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            return this.userExpandMapper.listByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
            return this.userExpandMapper.mapByInPropertyValue(propertyValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPropertyValue(Collection<String> propertyValueList){
            return this.userExpandMapper.countByInPropertyValue(propertyValueList);
        }

        public Integer updateNotNullFieldsByInPropertyValue(UserExpandDO updateDO, Collection<String> propertyValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer updateAllFieldsByInPropertyValue(UserExpandDO updateDO,  Collection<String> propertyValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByInPropertyValue(updateDO,propertyValueList);
        }

        public Integer deleteByInPropertyValue( Collection<String> propertyValueList){
            return this.userExpandMapper.deleteByInPropertyValue(propertyValueList);
        }


        public List<UserExpandDO> listByUserId(Long userId, String... fieldNames){
            return this.userExpandMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByUserId(Long userId, String... fieldNames){
            return this.userExpandMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.userExpandMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(UserExpandDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(UserExpandDO updateDO,  Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.userExpandMapper.deleteByUserId(userId);
        }



        public List<UserExpandDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.userExpandMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.userExpandMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            return this.userExpandMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(UserExpandDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(UserExpandDO updateDO,  Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            return this.userExpandMapper.deleteByInUserId(userIdList);
        }


        public List<UserExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userExpandMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userExpandMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userExpandMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserExpandDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserExpandDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userExpandMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userExpandMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userExpandMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.userExpandMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserExpandDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserExpandDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.userExpandMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userExpandMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userExpandMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userExpandMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserExpandDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserExpandDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userExpandMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userExpandMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userExpandMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.userExpandMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserExpandDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserExpandDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userExpandMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.userExpandMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

