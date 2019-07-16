package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableSysConfigDaoManager;
import com.hyzs.tibmas.core.dbo.SysConfigDO;
import com.hyzs.tibmas.core.mapper.SysConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSysConfigDaoManagerImpl extends CommonDaoManagerImpl<SysConfigDO,Long> implements ImmutableSysConfigDaoManager {

        @Autowired
        private SysConfigMapper sysConfigMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(sysConfigMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SysConfigDO.ID,SysConfigDO.DB_ID);
            fieldMap.put(SysConfigDO.DB_ID,SysConfigDO.DB_ID);

            fieldMap.put(SysConfigDO.CONFIG_KEY,SysConfigDO.DB_CONFIG_KEY);
            fieldMap.put(SysConfigDO.DB_CONFIG_KEY,SysConfigDO.DB_CONFIG_KEY);

            fieldMap.put(SysConfigDO.CONFIG_VALUE,SysConfigDO.DB_CONFIG_VALUE);
            fieldMap.put(SysConfigDO.DB_CONFIG_VALUE,SysConfigDO.DB_CONFIG_VALUE);

            fieldMap.put(SysConfigDO.REMARK,SysConfigDO.DB_REMARK);
            fieldMap.put(SysConfigDO.DB_REMARK,SysConfigDO.DB_REMARK);

            fieldMap.put(SysConfigDO.GMT_CREATE,SysConfigDO.DB_GMT_CREATE);
            fieldMap.put(SysConfigDO.DB_GMT_CREATE,SysConfigDO.DB_GMT_CREATE);

            fieldMap.put(SysConfigDO.USER_ID_CREATE,SysConfigDO.DB_USER_ID_CREATE);
            fieldMap.put(SysConfigDO.DB_USER_ID_CREATE,SysConfigDO.DB_USER_ID_CREATE);

            fieldMap.put(SysConfigDO.GMT_MODIFIED,SysConfigDO.DB_GMT_MODIFIED);
            fieldMap.put(SysConfigDO.DB_GMT_MODIFIED,SysConfigDO.DB_GMT_MODIFIED);

            fieldMap.put(SysConfigDO.USER_ID_MODIFIED,SysConfigDO.DB_USER_ID_MODIFIED);
            fieldMap.put(SysConfigDO.DB_USER_ID_MODIFIED,SysConfigDO.DB_USER_ID_MODIFIED);

            fieldMap.put(SysConfigDO.IS_DELETED,SysConfigDO.DB_IS_DELETED);
            fieldMap.put(SysConfigDO.DB_IS_DELETED,SysConfigDO.DB_IS_DELETED);



            super.setFieldNameMap(fieldMap);
        }



        public List<SysConfigDO> listByConfigKey(String configKey, String... fieldNames){
            return this.sysConfigMapper.listByConfigKey(configKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByConfigKey(String configKey, String... fieldNames){
            return this.sysConfigMapper.mapByConfigKey(configKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByConfigKey(String configKey){
            return this.sysConfigMapper.countByConfigKey(configKey);
        }

        public Integer updateNotNullFieldsByConfigKey(SysConfigDO updateDO, String configKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByConfigKey(updateDO,configKey);
        }

        public Integer updateAllFieldsByConfigKey(SysConfigDO updateDO,  String configKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByConfigKey(updateDO,configKey);
        }

        public Integer deleteByConfigKey( String configKey){
            return this.sysConfigMapper.deleteByConfigKey(configKey);
        }



        public List<SysConfigDO> listByInConfigKey(Collection<String> configKeyList, String... fieldNames){
            return this.sysConfigMapper.listByInConfigKey(configKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByInConfigKey(Collection<String> configKeyList, String... fieldNames){
            return this.sysConfigMapper.mapByInConfigKey(configKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInConfigKey(Collection<String> configKeyList){
            return this.sysConfigMapper.countByInConfigKey(configKeyList);
        }

        public Integer updateNotNullFieldsByInConfigKey(SysConfigDO updateDO, Collection<String> configKeyList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByInConfigKey(updateDO,configKeyList);
        }

        public Integer updateAllFieldsByInConfigKey(SysConfigDO updateDO,  Collection<String> configKeyList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByInConfigKey(updateDO,configKeyList);
        }

        public Integer deleteByInConfigKey( Collection<String> configKeyList){
            return this.sysConfigMapper.deleteByInConfigKey(configKeyList);
        }


        public List<SysConfigDO> listByConfigValue(String configValue, String... fieldNames){
            return this.sysConfigMapper.listByConfigValue(configValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByConfigValue(String configValue, String... fieldNames){
            return this.sysConfigMapper.mapByConfigValue(configValue,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByConfigValue(String configValue){
            return this.sysConfigMapper.countByConfigValue(configValue);
        }

        public Integer updateNotNullFieldsByConfigValue(SysConfigDO updateDO, String configValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByConfigValue(updateDO,configValue);
        }

        public Integer updateAllFieldsByConfigValue(SysConfigDO updateDO,  String configValue){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByConfigValue(updateDO,configValue);
        }

        public Integer deleteByConfigValue( String configValue){
            return this.sysConfigMapper.deleteByConfigValue(configValue);
        }



        public List<SysConfigDO> listByInConfigValue(Collection<String> configValueList, String... fieldNames){
            return this.sysConfigMapper.listByInConfigValue(configValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByInConfigValue(Collection<String> configValueList, String... fieldNames){
            return this.sysConfigMapper.mapByInConfigValue(configValueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInConfigValue(Collection<String> configValueList){
            return this.sysConfigMapper.countByInConfigValue(configValueList);
        }

        public Integer updateNotNullFieldsByInConfigValue(SysConfigDO updateDO, Collection<String> configValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByInConfigValue(updateDO,configValueList);
        }

        public Integer updateAllFieldsByInConfigValue(SysConfigDO updateDO,  Collection<String> configValueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByInConfigValue(updateDO,configValueList);
        }

        public Integer deleteByInConfigValue( Collection<String> configValueList){
            return this.sysConfigMapper.deleteByInConfigValue(configValueList);
        }


        public List<SysConfigDO> listByRemark(String remark, String... fieldNames){
            return this.sysConfigMapper.listByRemark(remark,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByRemark(String remark, String... fieldNames){
            return this.sysConfigMapper.mapByRemark(remark,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRemark(String remark){
            return this.sysConfigMapper.countByRemark(remark);
        }

        public Integer updateNotNullFieldsByRemark(SysConfigDO updateDO, String remark){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByRemark(updateDO,remark);
        }

        public Integer updateAllFieldsByRemark(SysConfigDO updateDO,  String remark){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByRemark(updateDO,remark);
        }

        public Integer deleteByRemark( String remark){
            return this.sysConfigMapper.deleteByRemark(remark);
        }



        public List<SysConfigDO> listByInRemark(Collection<String> remarkList, String... fieldNames){
            return this.sysConfigMapper.listByInRemark(remarkList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByInRemark(Collection<String> remarkList, String... fieldNames){
            return this.sysConfigMapper.mapByInRemark(remarkList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRemark(Collection<String> remarkList){
            return this.sysConfigMapper.countByInRemark(remarkList);
        }

        public Integer updateNotNullFieldsByInRemark(SysConfigDO updateDO, Collection<String> remarkList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByInRemark(updateDO,remarkList);
        }

        public Integer updateAllFieldsByInRemark(SysConfigDO updateDO,  Collection<String> remarkList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByInRemark(updateDO,remarkList);
        }

        public Integer deleteByInRemark( Collection<String> remarkList){
            return this.sysConfigMapper.deleteByInRemark(remarkList);
        }


        public List<SysConfigDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.sysConfigMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.sysConfigMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.sysConfigMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(SysConfigDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(SysConfigDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.sysConfigMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<SysConfigDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.sysConfigMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.sysConfigMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.sysConfigMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(SysConfigDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(SysConfigDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.sysConfigMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<SysConfigDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.sysConfigMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.sysConfigMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.sysConfigMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(SysConfigDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(SysConfigDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.sysConfigMapper.deleteByUserIdModified(userIdModified);
        }



        public List<SysConfigDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.sysConfigMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SysConfigDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.sysConfigMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.sysConfigMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(SysConfigDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(SysConfigDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.sysConfigMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.sysConfigMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

