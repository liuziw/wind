package com.lzw.wind.test.daomanager.immutable.impl;

import com.lzw.wind.test.dbo.UserDO;
import com.hyzs.gz.common.dao.manager.DOChecker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.lzw.wind.test.daomanager.immutable.ImmutableUserDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserDaoManagerImpl extends CommonDaoManagerImpl<UserDO,Long> implements ImmutableUserDaoManager {

        @Autowired
        private UserMapper userMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserDO.ID,UserDO.DB_ID);
            fieldMap.put(UserDO.DB_ID,UserDO.DB_ID);

            fieldMap.put(UserDO.USER_ACCOUNT,UserDO.DB_USER_ACCOUNT);
            fieldMap.put(UserDO.DB_USER_ACCOUNT,UserDO.DB_USER_ACCOUNT);

            fieldMap.put(UserDO.USER_PASSWORD,UserDO.DB_USER_PASSWORD);
            fieldMap.put(UserDO.DB_USER_PASSWORD,UserDO.DB_USER_PASSWORD);

            fieldMap.put(UserDO.UPDATE_PASSWORD_TIME,UserDO.DB_UPDATE_PASSWORD_TIME);
            fieldMap.put(UserDO.DB_UPDATE_PASSWORD_TIME,UserDO.DB_UPDATE_PASSWORD_TIME);

            fieldMap.put(UserDO.USER_NAME,UserDO.DB_USER_NAME);
            fieldMap.put(UserDO.DB_USER_NAME,UserDO.DB_USER_NAME);

            fieldMap.put(UserDO.MOBILE_NO,UserDO.DB_MOBILE_NO);
            fieldMap.put(UserDO.DB_MOBILE_NO,UserDO.DB_MOBILE_NO);

            fieldMap.put(UserDO.EMAIL,UserDO.DB_EMAIL);
            fieldMap.put(UserDO.DB_EMAIL,UserDO.DB_EMAIL);

            fieldMap.put(UserDO.JOB,UserDO.DB_JOB);
            fieldMap.put(UserDO.DB_JOB,UserDO.DB_JOB);

            fieldMap.put(UserDO.BIRTHDAY,UserDO.DB_BIRTHDAY);
            fieldMap.put(UserDO.DB_BIRTHDAY,UserDO.DB_BIRTHDAY);

            fieldMap.put(UserDO.USER_PHOTO,UserDO.DB_USER_PHOTO);
            fieldMap.put(UserDO.DB_USER_PHOTO,UserDO.DB_USER_PHOTO);

            fieldMap.put(UserDO.ID_CARD_NO,UserDO.DB_ID_CARD_NO);
            fieldMap.put(UserDO.DB_ID_CARD_NO,UserDO.DB_ID_CARD_NO);

            fieldMap.put(UserDO.GENDER,UserDO.DB_GENDER);
            fieldMap.put(UserDO.DB_GENDER,UserDO.DB_GENDER);

            fieldMap.put(UserDO.DEPT_ID,UserDO.DB_DEPT_ID);
            fieldMap.put(UserDO.DB_DEPT_ID,UserDO.DB_DEPT_ID);

            fieldMap.put(UserDO.ADDRESS,UserDO.DB_ADDRESS);
            fieldMap.put(UserDO.DB_ADDRESS,UserDO.DB_ADDRESS);

            fieldMap.put(UserDO.LOCKED,UserDO.DB_LOCKED);
            fieldMap.put(UserDO.DB_LOCKED,UserDO.DB_LOCKED);

            fieldMap.put(UserDO.LOCKED_TIME,UserDO.DB_LOCKED_TIME);
            fieldMap.put(UserDO.DB_LOCKED_TIME,UserDO.DB_LOCKED_TIME);

            fieldMap.put(UserDO.ENABLED,UserDO.DB_ENABLED);
            fieldMap.put(UserDO.DB_ENABLED,UserDO.DB_ENABLED);

            fieldMap.put(UserDO.EXPIRED,UserDO.DB_EXPIRED);
            fieldMap.put(UserDO.DB_EXPIRED,UserDO.DB_EXPIRED);

            fieldMap.put(UserDO.IS_DELETED,UserDO.DB_IS_DELETED);
            fieldMap.put(UserDO.DB_IS_DELETED,UserDO.DB_IS_DELETED);

            fieldMap.put(UserDO.GMT_CREATE,UserDO.DB_GMT_CREATE);
            fieldMap.put(UserDO.DB_GMT_CREATE,UserDO.DB_GMT_CREATE);

            fieldMap.put(UserDO.GMT_MODIFIED,UserDO.DB_GMT_MODIFIED);
            fieldMap.put(UserDO.DB_GMT_MODIFIED,UserDO.DB_GMT_MODIFIED);

            fieldMap.put(UserDO.USER_ID_CREATE,UserDO.DB_USER_ID_CREATE);
            fieldMap.put(UserDO.DB_USER_ID_CREATE,UserDO.DB_USER_ID_CREATE);

            fieldMap.put(UserDO.USER_ID_MODIFIED,UserDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserDO.DB_USER_ID_MODIFIED,UserDO.DB_USER_ID_MODIFIED);

            fieldMap.put(UserDO.LEADER_ID,UserDO.DB_LEADER_ID);
            fieldMap.put(UserDO.DB_LEADER_ID,UserDO.DB_LEADER_ID);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public UserDO getById(Long id){
            return this.userMapper.getById(id);
        }



        public List<UserDO> listById(Long id, String... fieldNames){
            return this.userMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapById(Long id, String... fieldNames){
            return this.userMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.userMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(UserDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(UserDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.userMapper.deleteById(id);
        }



        public List<UserDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.userMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(UserDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(UserDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.userMapper.deleteByInId(idList);
        }


        public List<UserDO> listByUserAccount(String userAccount, String... fieldNames){
            return this.userMapper.listByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserAccount(String userAccount, String... fieldNames){
            return this.userMapper.mapByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserAccount(String userAccount){
            return this.userMapper.countByUserAccount(userAccount);
        }

        public Integer updateNotNullFieldsByUserAccount(UserDO updateDO, String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer updateAllFieldsByUserAccount(UserDO updateDO,  String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer deleteByUserAccount( String userAccount){
            return this.userMapper.deleteByUserAccount(userAccount);
        }



        public List<UserDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            if(CollectionUtils.isEmpty(userAccountList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            if(CollectionUtils.isEmpty(userAccountList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserAccount(Collection<String> userAccountList){
            if(CollectionUtils.isEmpty(userAccountList)){
                   return 0;
             }
            return this.userMapper.countByInUserAccount(userAccountList);
        }

        public Integer updateNotNullFieldsByInUserAccount(UserDO updateDO, Collection<String> userAccountList){
            if(CollectionUtils.isEmpty(userAccountList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer updateAllFieldsByInUserAccount(UserDO updateDO,  Collection<String> userAccountList){
            if(CollectionUtils.isEmpty(userAccountList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer deleteByInUserAccount( Collection<String> userAccountList){
            if(CollectionUtils.isEmpty(userAccountList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserAccount(userAccountList);
        }


        public List<UserDO> listByUserPassword(String userPassword, String... fieldNames){
            return this.userMapper.listByUserPassword(userPassword,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserPassword(String userPassword, String... fieldNames){
            return this.userMapper.mapByUserPassword(userPassword,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserPassword(String userPassword){
            return this.userMapper.countByUserPassword(userPassword);
        }

        public Integer updateNotNullFieldsByUserPassword(UserDO updateDO, String userPassword){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserPassword(updateDO,userPassword);
        }

        public Integer updateAllFieldsByUserPassword(UserDO updateDO,  String userPassword){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserPassword(updateDO,userPassword);
        }

        public Integer deleteByUserPassword( String userPassword){
            return this.userMapper.deleteByUserPassword(userPassword);
        }



        public List<UserDO> listByInUserPassword(Collection<String> userPasswordList, String... fieldNames){
            if(CollectionUtils.isEmpty(userPasswordList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserPassword(userPasswordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserPassword(Collection<String> userPasswordList, String... fieldNames){
            if(CollectionUtils.isEmpty(userPasswordList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserPassword(userPasswordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserPassword(Collection<String> userPasswordList){
            if(CollectionUtils.isEmpty(userPasswordList)){
                   return 0;
             }
            return this.userMapper.countByInUserPassword(userPasswordList);
        }

        public Integer updateNotNullFieldsByInUserPassword(UserDO updateDO, Collection<String> userPasswordList){
            if(CollectionUtils.isEmpty(userPasswordList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserPassword(updateDO,userPasswordList);
        }

        public Integer updateAllFieldsByInUserPassword(UserDO updateDO,  Collection<String> userPasswordList){
            if(CollectionUtils.isEmpty(userPasswordList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserPassword(updateDO,userPasswordList);
        }

        public Integer deleteByInUserPassword( Collection<String> userPasswordList){
            if(CollectionUtils.isEmpty(userPasswordList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserPassword(userPasswordList);
        }


        public List<UserDO> listByUpdatePasswordTime(java.util.Date updatePasswordTime, String... fieldNames){
            return this.userMapper.listByUpdatePasswordTime(updatePasswordTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUpdatePasswordTime(java.util.Date updatePasswordTime, String... fieldNames){
            return this.userMapper.mapByUpdatePasswordTime(updatePasswordTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUpdatePasswordTime(java.util.Date updatePasswordTime){
            return this.userMapper.countByUpdatePasswordTime(updatePasswordTime);
        }

        public Integer updateNotNullFieldsByUpdatePasswordTime(UserDO updateDO, java.util.Date updatePasswordTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUpdatePasswordTime(updateDO,updatePasswordTime);
        }

        public Integer updateAllFieldsByUpdatePasswordTime(UserDO updateDO,  java.util.Date updatePasswordTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUpdatePasswordTime(updateDO,updatePasswordTime);
        }

        public Integer deleteByUpdatePasswordTime( java.util.Date updatePasswordTime){
            return this.userMapper.deleteByUpdatePasswordTime(updatePasswordTime);
        }



        public List<UserDO> listByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUpdatePasswordTime(updatePasswordTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUpdatePasswordTime(updatePasswordTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                   return 0;
             }
            return this.userMapper.countByInUpdatePasswordTime(updatePasswordTimeList);
        }

        public Integer updateNotNullFieldsByInUpdatePasswordTime(UserDO updateDO, Collection<java.util.Date> updatePasswordTimeList){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUpdatePasswordTime(updateDO,updatePasswordTimeList);
        }

        public Integer updateAllFieldsByInUpdatePasswordTime(UserDO updateDO,  Collection<java.util.Date> updatePasswordTimeList){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUpdatePasswordTime(updateDO,updatePasswordTimeList);
        }

        public Integer deleteByInUpdatePasswordTime( Collection<java.util.Date> updatePasswordTimeList){
            if(CollectionUtils.isEmpty(updatePasswordTimeList)){
                           return 0;
             }
            return this.userMapper.deleteByInUpdatePasswordTime(updatePasswordTimeList);
        }


        public List<UserDO> listByUserName(String userName, String... fieldNames){
            return this.userMapper.listByUserName(userName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserName(String userName, String... fieldNames){
            return this.userMapper.mapByUserName(userName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserName(String userName){
            return this.userMapper.countByUserName(userName);
        }

        public Integer updateNotNullFieldsByUserName(UserDO updateDO, String userName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserName(updateDO,userName);
        }

        public Integer updateAllFieldsByUserName(UserDO updateDO,  String userName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserName(updateDO,userName);
        }

        public Integer deleteByUserName( String userName){
            return this.userMapper.deleteByUserName(userName);
        }



        public List<UserDO> listByInUserName(Collection<String> userNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(userNameList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserName(userNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserName(Collection<String> userNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(userNameList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserName(userNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserName(Collection<String> userNameList){
            if(CollectionUtils.isEmpty(userNameList)){
                   return 0;
             }
            return this.userMapper.countByInUserName(userNameList);
        }

        public Integer updateNotNullFieldsByInUserName(UserDO updateDO, Collection<String> userNameList){
            if(CollectionUtils.isEmpty(userNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserName(updateDO,userNameList);
        }

        public Integer updateAllFieldsByInUserName(UserDO updateDO,  Collection<String> userNameList){
            if(CollectionUtils.isEmpty(userNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserName(updateDO,userNameList);
        }

        public Integer deleteByInUserName( Collection<String> userNameList){
            if(CollectionUtils.isEmpty(userNameList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserName(userNameList);
        }


        public List<UserDO> listByMobileNo(String mobileNo, String... fieldNames){
            return this.userMapper.listByMobileNo(mobileNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByMobileNo(String mobileNo, String... fieldNames){
            return this.userMapper.mapByMobileNo(mobileNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMobileNo(String mobileNo){
            return this.userMapper.countByMobileNo(mobileNo);
        }

        public Integer updateNotNullFieldsByMobileNo(UserDO updateDO, String mobileNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByMobileNo(updateDO,mobileNo);
        }

        public Integer updateAllFieldsByMobileNo(UserDO updateDO,  String mobileNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByMobileNo(updateDO,mobileNo);
        }

        public Integer deleteByMobileNo( String mobileNo){
            return this.userMapper.deleteByMobileNo(mobileNo);
        }



        public List<UserDO> listByInMobileNo(Collection<String> mobileNoList, String... fieldNames){
            if(CollectionUtils.isEmpty(mobileNoList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInMobileNo(mobileNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInMobileNo(Collection<String> mobileNoList, String... fieldNames){
            if(CollectionUtils.isEmpty(mobileNoList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInMobileNo(mobileNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMobileNo(Collection<String> mobileNoList){
            if(CollectionUtils.isEmpty(mobileNoList)){
                   return 0;
             }
            return this.userMapper.countByInMobileNo(mobileNoList);
        }

        public Integer updateNotNullFieldsByInMobileNo(UserDO updateDO, Collection<String> mobileNoList){
            if(CollectionUtils.isEmpty(mobileNoList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInMobileNo(updateDO,mobileNoList);
        }

        public Integer updateAllFieldsByInMobileNo(UserDO updateDO,  Collection<String> mobileNoList){
            if(CollectionUtils.isEmpty(mobileNoList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInMobileNo(updateDO,mobileNoList);
        }

        public Integer deleteByInMobileNo( Collection<String> mobileNoList){
            if(CollectionUtils.isEmpty(mobileNoList)){
                           return 0;
             }
            return this.userMapper.deleteByInMobileNo(mobileNoList);
        }


        public List<UserDO> listByEmail(String email, String... fieldNames){
            return this.userMapper.listByEmail(email,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByEmail(String email, String... fieldNames){
            return this.userMapper.mapByEmail(email,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEmail(String email){
            return this.userMapper.countByEmail(email);
        }

        public Integer updateNotNullFieldsByEmail(UserDO updateDO, String email){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByEmail(updateDO,email);
        }

        public Integer updateAllFieldsByEmail(UserDO updateDO,  String email){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByEmail(updateDO,email);
        }

        public Integer deleteByEmail( String email){
            return this.userMapper.deleteByEmail(email);
        }



        public List<UserDO> listByInEmail(Collection<String> emailList, String... fieldNames){
            if(CollectionUtils.isEmpty(emailList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInEmail(emailList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInEmail(Collection<String> emailList, String... fieldNames){
            if(CollectionUtils.isEmpty(emailList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInEmail(emailList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEmail(Collection<String> emailList){
            if(CollectionUtils.isEmpty(emailList)){
                   return 0;
             }
            return this.userMapper.countByInEmail(emailList);
        }

        public Integer updateNotNullFieldsByInEmail(UserDO updateDO, Collection<String> emailList){
            if(CollectionUtils.isEmpty(emailList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInEmail(updateDO,emailList);
        }

        public Integer updateAllFieldsByInEmail(UserDO updateDO,  Collection<String> emailList){
            if(CollectionUtils.isEmpty(emailList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInEmail(updateDO,emailList);
        }

        public Integer deleteByInEmail( Collection<String> emailList){
            if(CollectionUtils.isEmpty(emailList)){
                           return 0;
             }
            return this.userMapper.deleteByInEmail(emailList);
        }


        public List<UserDO> listByJob(String job, String... fieldNames){
            return this.userMapper.listByJob(job,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByJob(String job, String... fieldNames){
            return this.userMapper.mapByJob(job,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByJob(String job){
            return this.userMapper.countByJob(job);
        }

        public Integer updateNotNullFieldsByJob(UserDO updateDO, String job){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByJob(updateDO,job);
        }

        public Integer updateAllFieldsByJob(UserDO updateDO,  String job){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByJob(updateDO,job);
        }

        public Integer deleteByJob( String job){
            return this.userMapper.deleteByJob(job);
        }



        public List<UserDO> listByInJob(Collection<String> jobList, String... fieldNames){
            if(CollectionUtils.isEmpty(jobList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInJob(jobList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInJob(Collection<String> jobList, String... fieldNames){
            if(CollectionUtils.isEmpty(jobList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInJob(jobList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInJob(Collection<String> jobList){
            if(CollectionUtils.isEmpty(jobList)){
                   return 0;
             }
            return this.userMapper.countByInJob(jobList);
        }

        public Integer updateNotNullFieldsByInJob(UserDO updateDO, Collection<String> jobList){
            if(CollectionUtils.isEmpty(jobList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInJob(updateDO,jobList);
        }

        public Integer updateAllFieldsByInJob(UserDO updateDO,  Collection<String> jobList){
            if(CollectionUtils.isEmpty(jobList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInJob(updateDO,jobList);
        }

        public Integer deleteByInJob( Collection<String> jobList){
            if(CollectionUtils.isEmpty(jobList)){
                           return 0;
             }
            return this.userMapper.deleteByInJob(jobList);
        }


        public List<UserDO> listByBirthday(java.util.Date birthday, String... fieldNames){
            return this.userMapper.listByBirthday(birthday,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByBirthday(java.util.Date birthday, String... fieldNames){
            return this.userMapper.mapByBirthday(birthday,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByBirthday(java.util.Date birthday){
            return this.userMapper.countByBirthday(birthday);
        }

        public Integer updateNotNullFieldsByBirthday(UserDO updateDO, java.util.Date birthday){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByBirthday(updateDO,birthday);
        }

        public Integer updateAllFieldsByBirthday(UserDO updateDO,  java.util.Date birthday){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByBirthday(updateDO,birthday);
        }

        public Integer deleteByBirthday( java.util.Date birthday){
            return this.userMapper.deleteByBirthday(birthday);
        }



        public List<UserDO> listByInBirthday(Collection<java.util.Date> birthdayList, String... fieldNames){
            if(CollectionUtils.isEmpty(birthdayList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInBirthday(birthdayList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInBirthday(Collection<java.util.Date> birthdayList, String... fieldNames){
            if(CollectionUtils.isEmpty(birthdayList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInBirthday(birthdayList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInBirthday(Collection<java.util.Date> birthdayList){
            if(CollectionUtils.isEmpty(birthdayList)){
                   return 0;
             }
            return this.userMapper.countByInBirthday(birthdayList);
        }

        public Integer updateNotNullFieldsByInBirthday(UserDO updateDO, Collection<java.util.Date> birthdayList){
            if(CollectionUtils.isEmpty(birthdayList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInBirthday(updateDO,birthdayList);
        }

        public Integer updateAllFieldsByInBirthday(UserDO updateDO,  Collection<java.util.Date> birthdayList){
            if(CollectionUtils.isEmpty(birthdayList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInBirthday(updateDO,birthdayList);
        }

        public Integer deleteByInBirthday( Collection<java.util.Date> birthdayList){
            if(CollectionUtils.isEmpty(birthdayList)){
                           return 0;
             }
            return this.userMapper.deleteByInBirthday(birthdayList);
        }


        public List<UserDO> listByUserPhoto(Long userPhoto, String... fieldNames){
            return this.userMapper.listByUserPhoto(userPhoto,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserPhoto(Long userPhoto, String... fieldNames){
            return this.userMapper.mapByUserPhoto(userPhoto,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserPhoto(Long userPhoto){
            return this.userMapper.countByUserPhoto(userPhoto);
        }

        public Integer updateNotNullFieldsByUserPhoto(UserDO updateDO, Long userPhoto){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserPhoto(updateDO,userPhoto);
        }

        public Integer updateAllFieldsByUserPhoto(UserDO updateDO,  Long userPhoto){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserPhoto(updateDO,userPhoto);
        }

        public Integer deleteByUserPhoto( Long userPhoto){
            return this.userMapper.deleteByUserPhoto(userPhoto);
        }



        public List<UserDO> listByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames){
            if(CollectionUtils.isEmpty(userPhotoList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserPhoto(userPhotoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames){
            if(CollectionUtils.isEmpty(userPhotoList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserPhoto(userPhotoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserPhoto(Collection<Long> userPhotoList){
            if(CollectionUtils.isEmpty(userPhotoList)){
                   return 0;
             }
            return this.userMapper.countByInUserPhoto(userPhotoList);
        }

        public Integer updateNotNullFieldsByInUserPhoto(UserDO updateDO, Collection<Long> userPhotoList){
            if(CollectionUtils.isEmpty(userPhotoList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserPhoto(updateDO,userPhotoList);
        }

        public Integer updateAllFieldsByInUserPhoto(UserDO updateDO,  Collection<Long> userPhotoList){
            if(CollectionUtils.isEmpty(userPhotoList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserPhoto(updateDO,userPhotoList);
        }

        public Integer deleteByInUserPhoto( Collection<Long> userPhotoList){
            if(CollectionUtils.isEmpty(userPhotoList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserPhoto(userPhotoList);
        }


        public List<UserDO> listByIdCardNo(String idCardNo, String... fieldNames){
            return this.userMapper.listByIdCardNo(idCardNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByIdCardNo(String idCardNo, String... fieldNames){
            return this.userMapper.mapByIdCardNo(idCardNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByIdCardNo(String idCardNo){
            return this.userMapper.countByIdCardNo(idCardNo);
        }

        public Integer updateNotNullFieldsByIdCardNo(UserDO updateDO, String idCardNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByIdCardNo(updateDO,idCardNo);
        }

        public Integer updateAllFieldsByIdCardNo(UserDO updateDO,  String idCardNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByIdCardNo(updateDO,idCardNo);
        }

        public Integer deleteByIdCardNo( String idCardNo){
            return this.userMapper.deleteByIdCardNo(idCardNo);
        }



        public List<UserDO> listByInIdCardNo(Collection<String> idCardNoList, String... fieldNames){
            if(CollectionUtils.isEmpty(idCardNoList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInIdCardNo(idCardNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInIdCardNo(Collection<String> idCardNoList, String... fieldNames){
            if(CollectionUtils.isEmpty(idCardNoList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInIdCardNo(idCardNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInIdCardNo(Collection<String> idCardNoList){
            if(CollectionUtils.isEmpty(idCardNoList)){
                   return 0;
             }
            return this.userMapper.countByInIdCardNo(idCardNoList);
        }

        public Integer updateNotNullFieldsByInIdCardNo(UserDO updateDO, Collection<String> idCardNoList){
            if(CollectionUtils.isEmpty(idCardNoList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInIdCardNo(updateDO,idCardNoList);
        }

        public Integer updateAllFieldsByInIdCardNo(UserDO updateDO,  Collection<String> idCardNoList){
            if(CollectionUtils.isEmpty(idCardNoList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInIdCardNo(updateDO,idCardNoList);
        }

        public Integer deleteByInIdCardNo( Collection<String> idCardNoList){
            if(CollectionUtils.isEmpty(idCardNoList)){
                           return 0;
             }
            return this.userMapper.deleteByInIdCardNo(idCardNoList);
        }


        public List<UserDO> listByGender(Integer gender, String... fieldNames){
            return this.userMapper.listByGender(gender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByGender(Integer gender, String... fieldNames){
            return this.userMapper.mapByGender(gender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByGender(Integer gender){
            return this.userMapper.countByGender(gender);
        }

        public Integer updateNotNullFieldsByGender(UserDO updateDO, Integer gender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByGender(updateDO,gender);
        }

        public Integer updateAllFieldsByGender(UserDO updateDO,  Integer gender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByGender(updateDO,gender);
        }

        public Integer deleteByGender( Integer gender){
            return this.userMapper.deleteByGender(gender);
        }



        public List<UserDO> listByInGender(Collection<Integer> genderList, String... fieldNames){
            if(CollectionUtils.isEmpty(genderList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInGender(genderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInGender(Collection<Integer> genderList, String... fieldNames){
            if(CollectionUtils.isEmpty(genderList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInGender(genderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInGender(Collection<Integer> genderList){
            if(CollectionUtils.isEmpty(genderList)){
                   return 0;
             }
            return this.userMapper.countByInGender(genderList);
        }

        public Integer updateNotNullFieldsByInGender(UserDO updateDO, Collection<Integer> genderList){
            if(CollectionUtils.isEmpty(genderList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInGender(updateDO,genderList);
        }

        public Integer updateAllFieldsByInGender(UserDO updateDO,  Collection<Integer> genderList){
            if(CollectionUtils.isEmpty(genderList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInGender(updateDO,genderList);
        }

        public Integer deleteByInGender( Collection<Integer> genderList){
            if(CollectionUtils.isEmpty(genderList)){
                           return 0;
             }
            return this.userMapper.deleteByInGender(genderList);
        }


        public List<UserDO> listByDeptId(Long deptId, String... fieldNames){
            return this.userMapper.listByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByDeptId(Long deptId, String... fieldNames){
            return this.userMapper.mapByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptId(Long deptId){
            return this.userMapper.countByDeptId(deptId);
        }

        public Integer updateNotNullFieldsByDeptId(UserDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByDeptId(updateDO,deptId);
        }

        public Integer updateAllFieldsByDeptId(UserDO updateDO,  Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByDeptId(updateDO,deptId);
        }

        public Integer deleteByDeptId( Long deptId){
            return this.userMapper.deleteByDeptId(deptId);
        }



        public List<UserDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptIdList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptIdList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptId(Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                   return 0;
             }
            return this.userMapper.countByInDeptId(deptIdList);
        }

        public Integer updateNotNullFieldsByInDeptId(UserDO updateDO, Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer updateAllFieldsByInDeptId(UserDO updateDO,  Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer deleteByInDeptId( Collection<Long> deptIdList){
            if(CollectionUtils.isEmpty(deptIdList)){
                           return 0;
             }
            return this.userMapper.deleteByInDeptId(deptIdList);
        }


        public List<UserDO> listByAddress(String address, String... fieldNames){
            return this.userMapper.listByAddress(address,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByAddress(String address, String... fieldNames){
            return this.userMapper.mapByAddress(address,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAddress(String address){
            return this.userMapper.countByAddress(address);
        }

        public Integer updateNotNullFieldsByAddress(UserDO updateDO, String address){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByAddress(updateDO,address);
        }

        public Integer updateAllFieldsByAddress(UserDO updateDO,  String address){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByAddress(updateDO,address);
        }

        public Integer deleteByAddress( String address){
            return this.userMapper.deleteByAddress(address);
        }



        public List<UserDO> listByInAddress(Collection<String> addressList, String... fieldNames){
            if(CollectionUtils.isEmpty(addressList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInAddress(addressList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInAddress(Collection<String> addressList, String... fieldNames){
            if(CollectionUtils.isEmpty(addressList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInAddress(addressList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAddress(Collection<String> addressList){
            if(CollectionUtils.isEmpty(addressList)){
                   return 0;
             }
            return this.userMapper.countByInAddress(addressList);
        }

        public Integer updateNotNullFieldsByInAddress(UserDO updateDO, Collection<String> addressList){
            if(CollectionUtils.isEmpty(addressList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInAddress(updateDO,addressList);
        }

        public Integer updateAllFieldsByInAddress(UserDO updateDO,  Collection<String> addressList){
            if(CollectionUtils.isEmpty(addressList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInAddress(updateDO,addressList);
        }

        public Integer deleteByInAddress( Collection<String> addressList){
            if(CollectionUtils.isEmpty(addressList)){
                           return 0;
             }
            return this.userMapper.deleteByInAddress(addressList);
        }


        public List<UserDO> listByLocked(Integer locked, String... fieldNames){
            return this.userMapper.listByLocked(locked,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByLocked(Integer locked, String... fieldNames){
            return this.userMapper.mapByLocked(locked,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLocked(Integer locked){
            return this.userMapper.countByLocked(locked);
        }

        public Integer updateNotNullFieldsByLocked(UserDO updateDO, Integer locked){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByLocked(updateDO,locked);
        }

        public Integer updateAllFieldsByLocked(UserDO updateDO,  Integer locked){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByLocked(updateDO,locked);
        }

        public Integer deleteByLocked( Integer locked){
            return this.userMapper.deleteByLocked(locked);
        }



        public List<UserDO> listByInLocked(Collection<Integer> lockedList, String... fieldNames){
            if(CollectionUtils.isEmpty(lockedList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInLocked(lockedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInLocked(Collection<Integer> lockedList, String... fieldNames){
            if(CollectionUtils.isEmpty(lockedList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInLocked(lockedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLocked(Collection<Integer> lockedList){
            if(CollectionUtils.isEmpty(lockedList)){
                   return 0;
             }
            return this.userMapper.countByInLocked(lockedList);
        }

        public Integer updateNotNullFieldsByInLocked(UserDO updateDO, Collection<Integer> lockedList){
            if(CollectionUtils.isEmpty(lockedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInLocked(updateDO,lockedList);
        }

        public Integer updateAllFieldsByInLocked(UserDO updateDO,  Collection<Integer> lockedList){
            if(CollectionUtils.isEmpty(lockedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInLocked(updateDO,lockedList);
        }

        public Integer deleteByInLocked( Collection<Integer> lockedList){
            if(CollectionUtils.isEmpty(lockedList)){
                           return 0;
             }
            return this.userMapper.deleteByInLocked(lockedList);
        }


        public List<UserDO> listByLockedTime(java.util.Date lockedTime, String... fieldNames){
            return this.userMapper.listByLockedTime(lockedTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByLockedTime(java.util.Date lockedTime, String... fieldNames){
            return this.userMapper.mapByLockedTime(lockedTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLockedTime(java.util.Date lockedTime){
            return this.userMapper.countByLockedTime(lockedTime);
        }

        public Integer updateNotNullFieldsByLockedTime(UserDO updateDO, java.util.Date lockedTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByLockedTime(updateDO,lockedTime);
        }

        public Integer updateAllFieldsByLockedTime(UserDO updateDO,  java.util.Date lockedTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByLockedTime(updateDO,lockedTime);
        }

        public Integer deleteByLockedTime( java.util.Date lockedTime){
            return this.userMapper.deleteByLockedTime(lockedTime);
        }



        public List<UserDO> listByInLockedTime(Collection<java.util.Date> lockedTimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInLockedTime(lockedTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInLockedTime(Collection<java.util.Date> lockedTimeList, String... fieldNames){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInLockedTime(lockedTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLockedTime(Collection<java.util.Date> lockedTimeList){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                   return 0;
             }
            return this.userMapper.countByInLockedTime(lockedTimeList);
        }

        public Integer updateNotNullFieldsByInLockedTime(UserDO updateDO, Collection<java.util.Date> lockedTimeList){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInLockedTime(updateDO,lockedTimeList);
        }

        public Integer updateAllFieldsByInLockedTime(UserDO updateDO,  Collection<java.util.Date> lockedTimeList){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInLockedTime(updateDO,lockedTimeList);
        }

        public Integer deleteByInLockedTime( Collection<java.util.Date> lockedTimeList){
            if(CollectionUtils.isEmpty(lockedTimeList)){
                           return 0;
             }
            return this.userMapper.deleteByInLockedTime(lockedTimeList);
        }


        public List<UserDO> listByEnabled(Integer enabled, String... fieldNames){
            return this.userMapper.listByEnabled(enabled,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByEnabled(Integer enabled, String... fieldNames){
            return this.userMapper.mapByEnabled(enabled,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEnabled(Integer enabled){
            return this.userMapper.countByEnabled(enabled);
        }

        public Integer updateNotNullFieldsByEnabled(UserDO updateDO, Integer enabled){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByEnabled(updateDO,enabled);
        }

        public Integer updateAllFieldsByEnabled(UserDO updateDO,  Integer enabled){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByEnabled(updateDO,enabled);
        }

        public Integer deleteByEnabled( Integer enabled){
            return this.userMapper.deleteByEnabled(enabled);
        }



        public List<UserDO> listByInEnabled(Collection<Integer> enabledList, String... fieldNames){
            if(CollectionUtils.isEmpty(enabledList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInEnabled(enabledList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInEnabled(Collection<Integer> enabledList, String... fieldNames){
            if(CollectionUtils.isEmpty(enabledList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInEnabled(enabledList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEnabled(Collection<Integer> enabledList){
            if(CollectionUtils.isEmpty(enabledList)){
                   return 0;
             }
            return this.userMapper.countByInEnabled(enabledList);
        }

        public Integer updateNotNullFieldsByInEnabled(UserDO updateDO, Collection<Integer> enabledList){
            if(CollectionUtils.isEmpty(enabledList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInEnabled(updateDO,enabledList);
        }

        public Integer updateAllFieldsByInEnabled(UserDO updateDO,  Collection<Integer> enabledList){
            if(CollectionUtils.isEmpty(enabledList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInEnabled(updateDO,enabledList);
        }

        public Integer deleteByInEnabled( Collection<Integer> enabledList){
            if(CollectionUtils.isEmpty(enabledList)){
                           return 0;
             }
            return this.userMapper.deleteByInEnabled(enabledList);
        }


        public List<UserDO> listByExpired(Integer expired, String... fieldNames){
            return this.userMapper.listByExpired(expired,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByExpired(Integer expired, String... fieldNames){
            return this.userMapper.mapByExpired(expired,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByExpired(Integer expired){
            return this.userMapper.countByExpired(expired);
        }

        public Integer updateNotNullFieldsByExpired(UserDO updateDO, Integer expired){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByExpired(updateDO,expired);
        }

        public Integer updateAllFieldsByExpired(UserDO updateDO,  Integer expired){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByExpired(updateDO,expired);
        }

        public Integer deleteByExpired( Integer expired){
            return this.userMapper.deleteByExpired(expired);
        }



        public List<UserDO> listByInExpired(Collection<Integer> expiredList, String... fieldNames){
            if(CollectionUtils.isEmpty(expiredList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInExpired(expiredList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInExpired(Collection<Integer> expiredList, String... fieldNames){
            if(CollectionUtils.isEmpty(expiredList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInExpired(expiredList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInExpired(Collection<Integer> expiredList){
            if(CollectionUtils.isEmpty(expiredList)){
                   return 0;
             }
            return this.userMapper.countByInExpired(expiredList);
        }

        public Integer updateNotNullFieldsByInExpired(UserDO updateDO, Collection<Integer> expiredList){
            if(CollectionUtils.isEmpty(expiredList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInExpired(updateDO,expiredList);
        }

        public Integer updateAllFieldsByInExpired(UserDO updateDO,  Collection<Integer> expiredList){
            if(CollectionUtils.isEmpty(expiredList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInExpired(updateDO,expiredList);
        }

        public Integer deleteByInExpired( Collection<Integer> expiredList){
            if(CollectionUtils.isEmpty(expiredList)){
                           return 0;
             }
            return this.userMapper.deleteByInExpired(expiredList);
        }


        public List<UserDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.userMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.userMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.userMapper.deleteByInUserIdModified(userIdModifiedList);
        }


        public List<UserDO> listByLeaderId(Long leaderId, String... fieldNames){
            return this.userMapper.listByLeaderId(leaderId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByLeaderId(Long leaderId, String... fieldNames){
            return this.userMapper.mapByLeaderId(leaderId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByLeaderId(Long leaderId){
            return this.userMapper.countByLeaderId(leaderId);
        }

        public Integer updateNotNullFieldsByLeaderId(UserDO updateDO, Long leaderId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByLeaderId(updateDO,leaderId);
        }

        public Integer updateAllFieldsByLeaderId(UserDO updateDO,  Long leaderId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByLeaderId(updateDO,leaderId);
        }

        public Integer deleteByLeaderId( Long leaderId){
            return this.userMapper.deleteByLeaderId(leaderId);
        }



        public List<UserDO> listByInLeaderId(Collection<Long> leaderIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(leaderIdList)){
                return new ArrayList<>(0);
            }
            return this.userMapper.listByInLeaderId(leaderIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserDO> mapByInLeaderId(Collection<Long> leaderIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(leaderIdList)){
                 return new HashMap<>();
            }
            return this.userMapper.mapByInLeaderId(leaderIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInLeaderId(Collection<Long> leaderIdList){
            if(CollectionUtils.isEmpty(leaderIdList)){
                   return 0;
             }
            return this.userMapper.countByInLeaderId(leaderIdList);
        }

        public Integer updateNotNullFieldsByInLeaderId(UserDO updateDO, Collection<Long> leaderIdList){
            if(CollectionUtils.isEmpty(leaderIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateNotNullFieldsByInLeaderId(updateDO,leaderIdList);
        }

        public Integer updateAllFieldsByInLeaderId(UserDO updateDO,  Collection<Long> leaderIdList){
            if(CollectionUtils.isEmpty(leaderIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userMapper.updateAllFieldsByInLeaderId(updateDO,leaderIdList);
        }

        public Integer deleteByInLeaderId( Collection<Long> leaderIdList){
            if(CollectionUtils.isEmpty(leaderIdList)){
                           return 0;
             }
            return this.userMapper.deleteByInLeaderId(leaderIdList);
        }


}

