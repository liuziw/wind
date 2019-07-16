package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableLoginFailDaoManager;
import com.hyzs.tibmas.core.dbo.LoginFailDO;
import com.hyzs.tibmas.core.mapper.LoginFailMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableLoginFailDaoManagerImpl extends CommonDaoManagerImpl<LoginFailDO,Long> implements ImmutableLoginFailDaoManager {

        @Autowired
        private LoginFailMapper loginFailMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(loginFailMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(LoginFailDO.ID,LoginFailDO.DB_ID);
            fieldMap.put(LoginFailDO.DB_ID,LoginFailDO.DB_ID);

            fieldMap.put(LoginFailDO.USER_ACCOUNT,LoginFailDO.DB_USER_ACCOUNT);
            fieldMap.put(LoginFailDO.DB_USER_ACCOUNT,LoginFailDO.DB_USER_ACCOUNT);

            fieldMap.put(LoginFailDO.IS_DELETED,LoginFailDO.DB_IS_DELETED);
            fieldMap.put(LoginFailDO.DB_IS_DELETED,LoginFailDO.DB_IS_DELETED);

            fieldMap.put(LoginFailDO.GMT_CREATE,LoginFailDO.DB_GMT_CREATE);
            fieldMap.put(LoginFailDO.DB_GMT_CREATE,LoginFailDO.DB_GMT_CREATE);

            fieldMap.put(LoginFailDO.GMT_MODIFIED,LoginFailDO.DB_GMT_MODIFIED);
            fieldMap.put(LoginFailDO.DB_GMT_MODIFIED,LoginFailDO.DB_GMT_MODIFIED);

            fieldMap.put(LoginFailDO.USER_ID_CREATE,LoginFailDO.DB_USER_ID_CREATE);
            fieldMap.put(LoginFailDO.DB_USER_ID_CREATE,LoginFailDO.DB_USER_ID_CREATE);

            fieldMap.put(LoginFailDO.USER_ID_MODIFIED,LoginFailDO.DB_USER_ID_MODIFIED);
            fieldMap.put(LoginFailDO.DB_USER_ID_MODIFIED,LoginFailDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<LoginFailDO> listByUserAccount(String userAccount, String... fieldNames){
            return this.loginFailMapper.listByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByUserAccount(String userAccount, String... fieldNames){
            return this.loginFailMapper.mapByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserAccount(String userAccount){
            return this.loginFailMapper.countByUserAccount(userAccount);
        }

        public Integer updateNotNullFieldsByUserAccount(LoginFailDO updateDO, String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer updateAllFieldsByUserAccount(LoginFailDO updateDO,  String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer deleteByUserAccount( String userAccount){
            return this.loginFailMapper.deleteByUserAccount(userAccount);
        }



        public List<LoginFailDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.loginFailMapper.listByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.loginFailMapper.mapByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserAccount(Collection<String> userAccountList){
            return this.loginFailMapper.countByInUserAccount(userAccountList);
        }

        public Integer updateNotNullFieldsByInUserAccount(LoginFailDO updateDO, Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer updateAllFieldsByInUserAccount(LoginFailDO updateDO,  Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer deleteByInUserAccount( Collection<String> userAccountList){
            return this.loginFailMapper.deleteByInUserAccount(userAccountList);
        }


        public List<LoginFailDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.loginFailMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.loginFailMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.loginFailMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(LoginFailDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(LoginFailDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.loginFailMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<LoginFailDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.loginFailMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.loginFailMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.loginFailMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(LoginFailDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(LoginFailDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.loginFailMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<LoginFailDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.loginFailMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.loginFailMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.loginFailMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(LoginFailDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(LoginFailDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.loginFailMapper.deleteByUserIdModified(userIdModified);
        }



        public List<LoginFailDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.loginFailMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,LoginFailDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.loginFailMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.loginFailMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(LoginFailDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(LoginFailDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.loginFailMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.loginFailMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

