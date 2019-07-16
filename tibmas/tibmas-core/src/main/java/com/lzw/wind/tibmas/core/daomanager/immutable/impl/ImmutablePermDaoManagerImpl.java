package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutablePermDaoManager;
import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.mapper.PermMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutablePermDaoManagerImpl extends CommonDaoManagerImpl<PermDO,Long> implements ImmutablePermDaoManager {

        @Autowired
        private PermMapper permMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(permMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(PermDO.ID,PermDO.DB_ID);
            fieldMap.put(PermDO.DB_ID,PermDO.DB_ID);

            fieldMap.put(PermDO.PID,PermDO.DB_PID);
            fieldMap.put(PermDO.DB_PID,PermDO.DB_PID);

            fieldMap.put(PermDO.PERM_CODE,PermDO.DB_PERM_CODE);
            fieldMap.put(PermDO.DB_PERM_CODE,PermDO.DB_PERM_CODE);

            fieldMap.put(PermDO.PERM_NAME,PermDO.DB_PERM_NAME);
            fieldMap.put(PermDO.DB_PERM_NAME,PermDO.DB_PERM_NAME);

            fieldMap.put(PermDO.PERM_TYPE,PermDO.DB_PERM_TYPE);
            fieldMap.put(PermDO.DB_PERM_TYPE,PermDO.DB_PERM_TYPE);

            fieldMap.put(PermDO.PERM_URL,PermDO.DB_PERM_URL);
            fieldMap.put(PermDO.DB_PERM_URL,PermDO.DB_PERM_URL);

            fieldMap.put(PermDO.PERM_DESC,PermDO.DB_PERM_DESC);
            fieldMap.put(PermDO.DB_PERM_DESC,PermDO.DB_PERM_DESC);

            fieldMap.put(PermDO.PERM_ICON,PermDO.DB_PERM_ICON);
            fieldMap.put(PermDO.DB_PERM_ICON,PermDO.DB_PERM_ICON);

            fieldMap.put(PermDO.PERM_ICON_URL,PermDO.DB_PERM_ICON_URL);
            fieldMap.put(PermDO.DB_PERM_ICON_URL,PermDO.DB_PERM_ICON_URL);

            fieldMap.put(PermDO.APP_ID,PermDO.DB_APP_ID);
            fieldMap.put(PermDO.DB_APP_ID,PermDO.DB_APP_ID);

            fieldMap.put(PermDO.SEQ,PermDO.DB_SEQ);
            fieldMap.put(PermDO.DB_SEQ,PermDO.DB_SEQ);

            fieldMap.put(PermDO.ENABLE_STATUS,PermDO.DB_ENABLE_STATUS);
            fieldMap.put(PermDO.DB_ENABLE_STATUS,PermDO.DB_ENABLE_STATUS);

            fieldMap.put(PermDO.IS_DELETED,PermDO.DB_IS_DELETED);
            fieldMap.put(PermDO.DB_IS_DELETED,PermDO.DB_IS_DELETED);

            fieldMap.put(PermDO.GMT_CREATE,PermDO.DB_GMT_CREATE);
            fieldMap.put(PermDO.DB_GMT_CREATE,PermDO.DB_GMT_CREATE);

            fieldMap.put(PermDO.GMT_MODIFIED,PermDO.DB_GMT_MODIFIED);
            fieldMap.put(PermDO.DB_GMT_MODIFIED,PermDO.DB_GMT_MODIFIED);

            fieldMap.put(PermDO.USER_ID_CREATE,PermDO.DB_USER_ID_CREATE);
            fieldMap.put(PermDO.DB_USER_ID_CREATE,PermDO.DB_USER_ID_CREATE);

            fieldMap.put(PermDO.USER_ID_MODIFIED,PermDO.DB_USER_ID_MODIFIED);
            fieldMap.put(PermDO.DB_USER_ID_MODIFIED,PermDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public PermDO getById(Long id){
            return this.permMapper.getById(id);
        }



        public List<PermDO> listById(Long id, String... fieldNames){
            return this.permMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapById(Long id, String... fieldNames){
            return this.permMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.permMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(PermDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(PermDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.permMapper.deleteById(id);
        }



        public List<PermDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.permMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(PermDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(PermDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.permMapper.deleteByInId(idList);
        }


        public List<PermDO> listByPid(Long pid, String... fieldNames){
            return this.permMapper.listByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPid(Long pid, String... fieldNames){
            return this.permMapper.mapByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPid(Long pid){
            return this.permMapper.countByPid(pid);
        }

        public Integer updateNotNullFieldsByPid(PermDO updateDO, Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPid(updateDO,pid);
        }

        public Integer updateAllFieldsByPid(PermDO updateDO,  Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPid(updateDO,pid);
        }

        public Integer deleteByPid( Long pid){
            return this.permMapper.deleteByPid(pid);
        }



        public List<PermDO> listByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPid(Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                   return 0;
             }
            return this.permMapper.countByInPid(pidList);
        }

        public Integer updateNotNullFieldsByInPid(PermDO updateDO, Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPid(updateDO,pidList);
        }

        public Integer updateAllFieldsByInPid(PermDO updateDO,  Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPid(updateDO,pidList);
        }

        public Integer deleteByInPid( Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            return this.permMapper.deleteByInPid(pidList);
        }


        public List<PermDO> listByPermCode(String permCode, String... fieldNames){
            return this.permMapper.listByPermCode(permCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermCode(String permCode, String... fieldNames){
            return this.permMapper.mapByPermCode(permCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermCode(String permCode){
            return this.permMapper.countByPermCode(permCode);
        }

        public Integer updateNotNullFieldsByPermCode(PermDO updateDO, String permCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermCode(updateDO,permCode);
        }

        public Integer updateAllFieldsByPermCode(PermDO updateDO,  String permCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermCode(updateDO,permCode);
        }

        public Integer deleteByPermCode( String permCode){
            return this.permMapper.deleteByPermCode(permCode);
        }



        public List<PermDO> listByInPermCode(Collection<String> permCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(permCodeList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermCode(permCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermCode(Collection<String> permCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(permCodeList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermCode(permCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermCode(Collection<String> permCodeList){
            if(CollectionUtils.isEmpty(permCodeList)){
                   return 0;
             }
            return this.permMapper.countByInPermCode(permCodeList);
        }

        public Integer updateNotNullFieldsByInPermCode(PermDO updateDO, Collection<String> permCodeList){
            if(CollectionUtils.isEmpty(permCodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermCode(updateDO,permCodeList);
        }

        public Integer updateAllFieldsByInPermCode(PermDO updateDO,  Collection<String> permCodeList){
            if(CollectionUtils.isEmpty(permCodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermCode(updateDO,permCodeList);
        }

        public Integer deleteByInPermCode( Collection<String> permCodeList){
            if(CollectionUtils.isEmpty(permCodeList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermCode(permCodeList);
        }


        public List<PermDO> listByPermName(String permName, String... fieldNames){
            return this.permMapper.listByPermName(permName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermName(String permName, String... fieldNames){
            return this.permMapper.mapByPermName(permName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermName(String permName){
            return this.permMapper.countByPermName(permName);
        }

        public Integer updateNotNullFieldsByPermName(PermDO updateDO, String permName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermName(updateDO,permName);
        }

        public Integer updateAllFieldsByPermName(PermDO updateDO,  String permName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermName(updateDO,permName);
        }

        public Integer deleteByPermName( String permName){
            return this.permMapper.deleteByPermName(permName);
        }



        public List<PermDO> listByInPermName(Collection<String> permNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(permNameList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermName(permNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermName(Collection<String> permNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(permNameList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermName(permNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermName(Collection<String> permNameList){
            if(CollectionUtils.isEmpty(permNameList)){
                   return 0;
             }
            return this.permMapper.countByInPermName(permNameList);
        }

        public Integer updateNotNullFieldsByInPermName(PermDO updateDO, Collection<String> permNameList){
            if(CollectionUtils.isEmpty(permNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermName(updateDO,permNameList);
        }

        public Integer updateAllFieldsByInPermName(PermDO updateDO,  Collection<String> permNameList){
            if(CollectionUtils.isEmpty(permNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermName(updateDO,permNameList);
        }

        public Integer deleteByInPermName( Collection<String> permNameList){
            if(CollectionUtils.isEmpty(permNameList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermName(permNameList);
        }


        public List<PermDO> listByPermType(Integer permType, String... fieldNames){
            return this.permMapper.listByPermType(permType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermType(Integer permType, String... fieldNames){
            return this.permMapper.mapByPermType(permType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermType(Integer permType){
            return this.permMapper.countByPermType(permType);
        }

        public Integer updateNotNullFieldsByPermType(PermDO updateDO, Integer permType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermType(updateDO,permType);
        }

        public Integer updateAllFieldsByPermType(PermDO updateDO,  Integer permType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermType(updateDO,permType);
        }

        public Integer deleteByPermType( Integer permType){
            return this.permMapper.deleteByPermType(permType);
        }



        public List<PermDO> listByInPermType(Collection<Integer> permTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(permTypeList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermType(permTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermType(Collection<Integer> permTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(permTypeList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermType(permTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermType(Collection<Integer> permTypeList){
            if(CollectionUtils.isEmpty(permTypeList)){
                   return 0;
             }
            return this.permMapper.countByInPermType(permTypeList);
        }

        public Integer updateNotNullFieldsByInPermType(PermDO updateDO, Collection<Integer> permTypeList){
            if(CollectionUtils.isEmpty(permTypeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermType(updateDO,permTypeList);
        }

        public Integer updateAllFieldsByInPermType(PermDO updateDO,  Collection<Integer> permTypeList){
            if(CollectionUtils.isEmpty(permTypeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermType(updateDO,permTypeList);
        }

        public Integer deleteByInPermType( Collection<Integer> permTypeList){
            if(CollectionUtils.isEmpty(permTypeList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermType(permTypeList);
        }


        public List<PermDO> listByPermUrl(String permUrl, String... fieldNames){
            return this.permMapper.listByPermUrl(permUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermUrl(String permUrl, String... fieldNames){
            return this.permMapper.mapByPermUrl(permUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermUrl(String permUrl){
            return this.permMapper.countByPermUrl(permUrl);
        }

        public Integer updateNotNullFieldsByPermUrl(PermDO updateDO, String permUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermUrl(updateDO,permUrl);
        }

        public Integer updateAllFieldsByPermUrl(PermDO updateDO,  String permUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermUrl(updateDO,permUrl);
        }

        public Integer deleteByPermUrl( String permUrl){
            return this.permMapper.deleteByPermUrl(permUrl);
        }



        public List<PermDO> listByInPermUrl(Collection<String> permUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(permUrlList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermUrl(permUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermUrl(Collection<String> permUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(permUrlList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermUrl(permUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermUrl(Collection<String> permUrlList){
            if(CollectionUtils.isEmpty(permUrlList)){
                   return 0;
             }
            return this.permMapper.countByInPermUrl(permUrlList);
        }

        public Integer updateNotNullFieldsByInPermUrl(PermDO updateDO, Collection<String> permUrlList){
            if(CollectionUtils.isEmpty(permUrlList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermUrl(updateDO,permUrlList);
        }

        public Integer updateAllFieldsByInPermUrl(PermDO updateDO,  Collection<String> permUrlList){
            if(CollectionUtils.isEmpty(permUrlList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermUrl(updateDO,permUrlList);
        }

        public Integer deleteByInPermUrl( Collection<String> permUrlList){
            if(CollectionUtils.isEmpty(permUrlList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermUrl(permUrlList);
        }


        public List<PermDO> listByPermDesc(String permDesc, String... fieldNames){
            return this.permMapper.listByPermDesc(permDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermDesc(String permDesc, String... fieldNames){
            return this.permMapper.mapByPermDesc(permDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermDesc(String permDesc){
            return this.permMapper.countByPermDesc(permDesc);
        }

        public Integer updateNotNullFieldsByPermDesc(PermDO updateDO, String permDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermDesc(updateDO,permDesc);
        }

        public Integer updateAllFieldsByPermDesc(PermDO updateDO,  String permDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermDesc(updateDO,permDesc);
        }

        public Integer deleteByPermDesc( String permDesc){
            return this.permMapper.deleteByPermDesc(permDesc);
        }



        public List<PermDO> listByInPermDesc(Collection<String> permDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(permDescList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermDesc(permDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermDesc(Collection<String> permDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(permDescList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermDesc(permDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermDesc(Collection<String> permDescList){
            if(CollectionUtils.isEmpty(permDescList)){
                   return 0;
             }
            return this.permMapper.countByInPermDesc(permDescList);
        }

        public Integer updateNotNullFieldsByInPermDesc(PermDO updateDO, Collection<String> permDescList){
            if(CollectionUtils.isEmpty(permDescList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermDesc(updateDO,permDescList);
        }

        public Integer updateAllFieldsByInPermDesc(PermDO updateDO,  Collection<String> permDescList){
            if(CollectionUtils.isEmpty(permDescList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermDesc(updateDO,permDescList);
        }

        public Integer deleteByInPermDesc( Collection<String> permDescList){
            if(CollectionUtils.isEmpty(permDescList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermDesc(permDescList);
        }


        public List<PermDO> listByPermIcon(Long permIcon, String... fieldNames){
            return this.permMapper.listByPermIcon(permIcon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermIcon(Long permIcon, String... fieldNames){
            return this.permMapper.mapByPermIcon(permIcon,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermIcon(Long permIcon){
            return this.permMapper.countByPermIcon(permIcon);
        }

        public Integer updateNotNullFieldsByPermIcon(PermDO updateDO, Long permIcon){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermIcon(updateDO,permIcon);
        }

        public Integer updateAllFieldsByPermIcon(PermDO updateDO,  Long permIcon){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermIcon(updateDO,permIcon);
        }

        public Integer deleteByPermIcon( Long permIcon){
            return this.permMapper.deleteByPermIcon(permIcon);
        }



        public List<PermDO> listByInPermIcon(Collection<Long> permIconList, String... fieldNames){
            if(CollectionUtils.isEmpty(permIconList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermIcon(permIconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermIcon(Collection<Long> permIconList, String... fieldNames){
            if(CollectionUtils.isEmpty(permIconList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermIcon(permIconList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermIcon(Collection<Long> permIconList){
            if(CollectionUtils.isEmpty(permIconList)){
                   return 0;
             }
            return this.permMapper.countByInPermIcon(permIconList);
        }

        public Integer updateNotNullFieldsByInPermIcon(PermDO updateDO, Collection<Long> permIconList){
            if(CollectionUtils.isEmpty(permIconList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermIcon(updateDO,permIconList);
        }

        public Integer updateAllFieldsByInPermIcon(PermDO updateDO,  Collection<Long> permIconList){
            if(CollectionUtils.isEmpty(permIconList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermIcon(updateDO,permIconList);
        }

        public Integer deleteByInPermIcon( Collection<Long> permIconList){
            if(CollectionUtils.isEmpty(permIconList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermIcon(permIconList);
        }


        public List<PermDO> listByPermIconUrl(String permIconUrl, String... fieldNames){
            return this.permMapper.listByPermIconUrl(permIconUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByPermIconUrl(String permIconUrl, String... fieldNames){
            return this.permMapper.mapByPermIconUrl(permIconUrl,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermIconUrl(String permIconUrl){
            return this.permMapper.countByPermIconUrl(permIconUrl);
        }

        public Integer updateNotNullFieldsByPermIconUrl(PermDO updateDO, String permIconUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByPermIconUrl(updateDO,permIconUrl);
        }

        public Integer updateAllFieldsByPermIconUrl(PermDO updateDO,  String permIconUrl){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByPermIconUrl(updateDO,permIconUrl);
        }

        public Integer deleteByPermIconUrl( String permIconUrl){
            return this.permMapper.deleteByPermIconUrl(permIconUrl);
        }



        public List<PermDO> listByInPermIconUrl(Collection<String> permIconUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInPermIconUrl(permIconUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInPermIconUrl(Collection<String> permIconUrlList, String... fieldNames){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInPermIconUrl(permIconUrlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermIconUrl(Collection<String> permIconUrlList){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                   return 0;
             }
            return this.permMapper.countByInPermIconUrl(permIconUrlList);
        }

        public Integer updateNotNullFieldsByInPermIconUrl(PermDO updateDO, Collection<String> permIconUrlList){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInPermIconUrl(updateDO,permIconUrlList);
        }

        public Integer updateAllFieldsByInPermIconUrl(PermDO updateDO,  Collection<String> permIconUrlList){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInPermIconUrl(updateDO,permIconUrlList);
        }

        public Integer deleteByInPermIconUrl( Collection<String> permIconUrlList){
            if(CollectionUtils.isEmpty(permIconUrlList)){
                           return 0;
             }
            return this.permMapper.deleteByInPermIconUrl(permIconUrlList);
        }


        public List<PermDO> listByAppId(Long appId, String... fieldNames){
            return this.permMapper.listByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByAppId(Long appId, String... fieldNames){
            return this.permMapper.mapByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppId(Long appId){
            return this.permMapper.countByAppId(appId);
        }

        public Integer updateNotNullFieldsByAppId(PermDO updateDO, Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByAppId(updateDO,appId);
        }

        public Integer updateAllFieldsByAppId(PermDO updateDO,  Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByAppId(updateDO,appId);
        }

        public Integer deleteByAppId( Long appId){
            return this.permMapper.deleteByAppId(appId);
        }



        public List<PermDO> listByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppId(Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                   return 0;
             }
            return this.permMapper.countByInAppId(appIdList);
        }

        public Integer updateNotNullFieldsByInAppId(PermDO updateDO, Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInAppId(updateDO,appIdList);
        }

        public Integer updateAllFieldsByInAppId(PermDO updateDO,  Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInAppId(updateDO,appIdList);
        }

        public Integer deleteByInAppId( Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            return this.permMapper.deleteByInAppId(appIdList);
        }


        public List<PermDO> listBySeq(Long seq, String... fieldNames){
            return this.permMapper.listBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapBySeq(Long seq, String... fieldNames){
            return this.permMapper.mapBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySeq(Long seq){
            return this.permMapper.countBySeq(seq);
        }

        public Integer updateNotNullFieldsBySeq(PermDO updateDO, Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsBySeq(updateDO,seq);
        }

        public Integer updateAllFieldsBySeq(PermDO updateDO,  Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsBySeq(updateDO,seq);
        }

        public Integer deleteBySeq( Long seq){
            return this.permMapper.deleteBySeq(seq);
        }



        public List<PermDO> listByInSeq(Collection<Long> seqList, String... fieldNames){
            if(CollectionUtils.isEmpty(seqList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInSeq(Collection<Long> seqList, String... fieldNames){
            if(CollectionUtils.isEmpty(seqList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSeq(Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                   return 0;
             }
            return this.permMapper.countByInSeq(seqList);
        }

        public Integer updateNotNullFieldsByInSeq(PermDO updateDO, Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInSeq(updateDO,seqList);
        }

        public Integer updateAllFieldsByInSeq(PermDO updateDO,  Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInSeq(updateDO,seqList);
        }

        public Integer deleteByInSeq( Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                           return 0;
             }
            return this.permMapper.deleteByInSeq(seqList);
        }


        public List<PermDO> listByEnableStatus(Integer enableStatus, String... fieldNames){
            return this.permMapper.listByEnableStatus(enableStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByEnableStatus(Integer enableStatus, String... fieldNames){
            return this.permMapper.mapByEnableStatus(enableStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEnableStatus(Integer enableStatus){
            return this.permMapper.countByEnableStatus(enableStatus);
        }

        public Integer updateNotNullFieldsByEnableStatus(PermDO updateDO, Integer enableStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByEnableStatus(updateDO,enableStatus);
        }

        public Integer updateAllFieldsByEnableStatus(PermDO updateDO,  Integer enableStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByEnableStatus(updateDO,enableStatus);
        }

        public Integer deleteByEnableStatus( Integer enableStatus){
            return this.permMapper.deleteByEnableStatus(enableStatus);
        }



        public List<PermDO> listByInEnableStatus(Collection<Integer> enableStatusList, String... fieldNames){
            if(CollectionUtils.isEmpty(enableStatusList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInEnableStatus(enableStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInEnableStatus(Collection<Integer> enableStatusList, String... fieldNames){
            if(CollectionUtils.isEmpty(enableStatusList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInEnableStatus(enableStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEnableStatus(Collection<Integer> enableStatusList){
            if(CollectionUtils.isEmpty(enableStatusList)){
                   return 0;
             }
            return this.permMapper.countByInEnableStatus(enableStatusList);
        }

        public Integer updateNotNullFieldsByInEnableStatus(PermDO updateDO, Collection<Integer> enableStatusList){
            if(CollectionUtils.isEmpty(enableStatusList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInEnableStatus(updateDO,enableStatusList);
        }

        public Integer updateAllFieldsByInEnableStatus(PermDO updateDO,  Collection<Integer> enableStatusList){
            if(CollectionUtils.isEmpty(enableStatusList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInEnableStatus(updateDO,enableStatusList);
        }

        public Integer deleteByInEnableStatus( Collection<Integer> enableStatusList){
            if(CollectionUtils.isEmpty(enableStatusList)){
                           return 0;
             }
            return this.permMapper.deleteByInEnableStatus(enableStatusList);
        }


        public List<PermDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.permMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.permMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.permMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(PermDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(PermDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.permMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<PermDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.permMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(PermDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(PermDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.permMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<PermDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.permMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.permMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.permMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(PermDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(PermDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.permMapper.deleteByUserIdModified(userIdModified);
        }



        public List<PermDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.permMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,PermDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.permMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.permMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(PermDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(PermDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.permMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.permMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

