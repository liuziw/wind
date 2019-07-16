package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableUserRegisterDaoManager;
import com.hyzs.tibmas.core.dbo.UserRegisterDO;
import com.hyzs.tibmas.core.mapper.UserRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserRegisterDaoManagerImpl extends CommonDaoManagerImpl<UserRegisterDO,Long> implements ImmutableUserRegisterDaoManager {

        @Autowired
        private UserRegisterMapper userRegisterMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userRegisterMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserRegisterDO.ID,UserRegisterDO.DB_ID);
            fieldMap.put(UserRegisterDO.DB_ID,UserRegisterDO.DB_ID);

            fieldMap.put(UserRegisterDO.BUS_ID,UserRegisterDO.DB_BUS_ID);
            fieldMap.put(UserRegisterDO.DB_BUS_ID,UserRegisterDO.DB_BUS_ID);

            fieldMap.put(UserRegisterDO.USER_ACCOUNT,UserRegisterDO.DB_USER_ACCOUNT);
            fieldMap.put(UserRegisterDO.DB_USER_ACCOUNT,UserRegisterDO.DB_USER_ACCOUNT);

            fieldMap.put(UserRegisterDO.USER_PASSWORD,UserRegisterDO.DB_USER_PASSWORD);
            fieldMap.put(UserRegisterDO.DB_USER_PASSWORD,UserRegisterDO.DB_USER_PASSWORD);

            fieldMap.put(UserRegisterDO.USER_NAME,UserRegisterDO.DB_USER_NAME);
            fieldMap.put(UserRegisterDO.DB_USER_NAME,UserRegisterDO.DB_USER_NAME);

            fieldMap.put(UserRegisterDO.MOBILE_NO,UserRegisterDO.DB_MOBILE_NO);
            fieldMap.put(UserRegisterDO.DB_MOBILE_NO,UserRegisterDO.DB_MOBILE_NO);

            fieldMap.put(UserRegisterDO.EMAIL,UserRegisterDO.DB_EMAIL);
            fieldMap.put(UserRegisterDO.DB_EMAIL,UserRegisterDO.DB_EMAIL);

            fieldMap.put(UserRegisterDO.JOB,UserRegisterDO.DB_JOB);
            fieldMap.put(UserRegisterDO.DB_JOB,UserRegisterDO.DB_JOB);

            fieldMap.put(UserRegisterDO.BIRTHDAY,UserRegisterDO.DB_BIRTHDAY);
            fieldMap.put(UserRegisterDO.DB_BIRTHDAY,UserRegisterDO.DB_BIRTHDAY);

            fieldMap.put(UserRegisterDO.USER_PHOTO,UserRegisterDO.DB_USER_PHOTO);
            fieldMap.put(UserRegisterDO.DB_USER_PHOTO,UserRegisterDO.DB_USER_PHOTO);

            fieldMap.put(UserRegisterDO.ID_CARD_NO,UserRegisterDO.DB_ID_CARD_NO);
            fieldMap.put(UserRegisterDO.DB_ID_CARD_NO,UserRegisterDO.DB_ID_CARD_NO);

            fieldMap.put(UserRegisterDO.GENDER,UserRegisterDO.DB_GENDER);
            fieldMap.put(UserRegisterDO.DB_GENDER,UserRegisterDO.DB_GENDER);

            fieldMap.put(UserRegisterDO.DEPT_ID,UserRegisterDO.DB_DEPT_ID);
            fieldMap.put(UserRegisterDO.DB_DEPT_ID,UserRegisterDO.DB_DEPT_ID);

            fieldMap.put(UserRegisterDO.EXAMINE_STATUS,UserRegisterDO.DB_EXAMINE_STATUS);
            fieldMap.put(UserRegisterDO.DB_EXAMINE_STATUS,UserRegisterDO.DB_EXAMINE_STATUS);

            fieldMap.put(UserRegisterDO.EXAMINE_USER_ID,UserRegisterDO.DB_EXAMINE_USER_ID);
            fieldMap.put(UserRegisterDO.DB_EXAMINE_USER_ID,UserRegisterDO.DB_EXAMINE_USER_ID);

            fieldMap.put(UserRegisterDO.TEAM_TYPE_CODE,UserRegisterDO.DB_TEAM_TYPE_CODE);
            fieldMap.put(UserRegisterDO.DB_TEAM_TYPE_CODE,UserRegisterDO.DB_TEAM_TYPE_CODE);

            fieldMap.put(UserRegisterDO.GMT_CREATE,UserRegisterDO.DB_GMT_CREATE);
            fieldMap.put(UserRegisterDO.DB_GMT_CREATE,UserRegisterDO.DB_GMT_CREATE);

            fieldMap.put(UserRegisterDO.GMT_MODIFIED,UserRegisterDO.DB_GMT_MODIFIED);
            fieldMap.put(UserRegisterDO.DB_GMT_MODIFIED,UserRegisterDO.DB_GMT_MODIFIED);

            fieldMap.put(UserRegisterDO.IS_DELETED,UserRegisterDO.DB_IS_DELETED);
            fieldMap.put(UserRegisterDO.DB_IS_DELETED,UserRegisterDO.DB_IS_DELETED);

            fieldMap.put(UserRegisterDO.USER_ID_CREATE,UserRegisterDO.DB_USER_ID_CREATE);
            fieldMap.put(UserRegisterDO.DB_USER_ID_CREATE,UserRegisterDO.DB_USER_ID_CREATE);

            fieldMap.put(UserRegisterDO.USER_ID_MODIFIED,UserRegisterDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserRegisterDO.DB_USER_ID_MODIFIED,UserRegisterDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<UserRegisterDO> listByBusId(String busId, String... fieldNames){
            return this.userRegisterMapper.listByBusId(busId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByBusId(String busId, String... fieldNames){
            return this.userRegisterMapper.mapByBusId(busId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByBusId(String busId){
            return this.userRegisterMapper.countByBusId(busId);
        }

        public Integer updateNotNullFieldsByBusId(UserRegisterDO updateDO, String busId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByBusId(updateDO,busId);
        }

        public Integer updateAllFieldsByBusId(UserRegisterDO updateDO,  String busId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByBusId(updateDO,busId);
        }

        public Integer deleteByBusId( String busId){
            return this.userRegisterMapper.deleteByBusId(busId);
        }



        public List<UserRegisterDO> listByInBusId(Collection<String> busIdList, String... fieldNames){
            return this.userRegisterMapper.listByInBusId(busIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInBusId(Collection<String> busIdList, String... fieldNames){
            return this.userRegisterMapper.mapByInBusId(busIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInBusId(Collection<String> busIdList){
            return this.userRegisterMapper.countByInBusId(busIdList);
        }

        public Integer updateNotNullFieldsByInBusId(UserRegisterDO updateDO, Collection<String> busIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInBusId(updateDO,busIdList);
        }

        public Integer updateAllFieldsByInBusId(UserRegisterDO updateDO,  Collection<String> busIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInBusId(updateDO,busIdList);
        }

        public Integer deleteByInBusId( Collection<String> busIdList){
            return this.userRegisterMapper.deleteByInBusId(busIdList);
        }


        public List<UserRegisterDO> listByUserAccount(String userAccount, String... fieldNames){
            return this.userRegisterMapper.listByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserAccount(String userAccount, String... fieldNames){
            return this.userRegisterMapper.mapByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserAccount(String userAccount){
            return this.userRegisterMapper.countByUserAccount(userAccount);
        }

        public Integer updateNotNullFieldsByUserAccount(UserRegisterDO updateDO, String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer updateAllFieldsByUserAccount(UserRegisterDO updateDO,  String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer deleteByUserAccount( String userAccount){
            return this.userRegisterMapper.deleteByUserAccount(userAccount);
        }



        public List<UserRegisterDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.userRegisterMapper.listByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserAccount(Collection<String> userAccountList){
            return this.userRegisterMapper.countByInUserAccount(userAccountList);
        }

        public Integer updateNotNullFieldsByInUserAccount(UserRegisterDO updateDO, Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer updateAllFieldsByInUserAccount(UserRegisterDO updateDO,  Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer deleteByInUserAccount( Collection<String> userAccountList){
            return this.userRegisterMapper.deleteByInUserAccount(userAccountList);
        }


        public List<UserRegisterDO> listByUserPassword(String userPassword, String... fieldNames){
            return this.userRegisterMapper.listByUserPassword(userPassword,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserPassword(String userPassword, String... fieldNames){
            return this.userRegisterMapper.mapByUserPassword(userPassword,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserPassword(String userPassword){
            return this.userRegisterMapper.countByUserPassword(userPassword);
        }

        public Integer updateNotNullFieldsByUserPassword(UserRegisterDO updateDO, String userPassword){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserPassword(updateDO,userPassword);
        }

        public Integer updateAllFieldsByUserPassword(UserRegisterDO updateDO,  String userPassword){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserPassword(updateDO,userPassword);
        }

        public Integer deleteByUserPassword( String userPassword){
            return this.userRegisterMapper.deleteByUserPassword(userPassword);
        }



        public List<UserRegisterDO> listByInUserPassword(Collection<String> userPasswordList, String... fieldNames){
            return this.userRegisterMapper.listByInUserPassword(userPasswordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserPassword(Collection<String> userPasswordList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserPassword(userPasswordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserPassword(Collection<String> userPasswordList){
            return this.userRegisterMapper.countByInUserPassword(userPasswordList);
        }

        public Integer updateNotNullFieldsByInUserPassword(UserRegisterDO updateDO, Collection<String> userPasswordList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserPassword(updateDO,userPasswordList);
        }

        public Integer updateAllFieldsByInUserPassword(UserRegisterDO updateDO,  Collection<String> userPasswordList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserPassword(updateDO,userPasswordList);
        }

        public Integer deleteByInUserPassword( Collection<String> userPasswordList){
            return this.userRegisterMapper.deleteByInUserPassword(userPasswordList);
        }


        public List<UserRegisterDO> listByUserName(String userName, String... fieldNames){
            return this.userRegisterMapper.listByUserName(userName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserName(String userName, String... fieldNames){
            return this.userRegisterMapper.mapByUserName(userName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserName(String userName){
            return this.userRegisterMapper.countByUserName(userName);
        }

        public Integer updateNotNullFieldsByUserName(UserRegisterDO updateDO, String userName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserName(updateDO,userName);
        }

        public Integer updateAllFieldsByUserName(UserRegisterDO updateDO,  String userName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserName(updateDO,userName);
        }

        public Integer deleteByUserName( String userName){
            return this.userRegisterMapper.deleteByUserName(userName);
        }



        public List<UserRegisterDO> listByInUserName(Collection<String> userNameList, String... fieldNames){
            return this.userRegisterMapper.listByInUserName(userNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserName(Collection<String> userNameList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserName(userNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserName(Collection<String> userNameList){
            return this.userRegisterMapper.countByInUserName(userNameList);
        }

        public Integer updateNotNullFieldsByInUserName(UserRegisterDO updateDO, Collection<String> userNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserName(updateDO,userNameList);
        }

        public Integer updateAllFieldsByInUserName(UserRegisterDO updateDO,  Collection<String> userNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserName(updateDO,userNameList);
        }

        public Integer deleteByInUserName( Collection<String> userNameList){
            return this.userRegisterMapper.deleteByInUserName(userNameList);
        }


        public List<UserRegisterDO> listByMobileNo(String mobileNo, String... fieldNames){
            return this.userRegisterMapper.listByMobileNo(mobileNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByMobileNo(String mobileNo, String... fieldNames){
            return this.userRegisterMapper.mapByMobileNo(mobileNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMobileNo(String mobileNo){
            return this.userRegisterMapper.countByMobileNo(mobileNo);
        }

        public Integer updateNotNullFieldsByMobileNo(UserRegisterDO updateDO, String mobileNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByMobileNo(updateDO,mobileNo);
        }

        public Integer updateAllFieldsByMobileNo(UserRegisterDO updateDO,  String mobileNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByMobileNo(updateDO,mobileNo);
        }

        public Integer deleteByMobileNo( String mobileNo){
            return this.userRegisterMapper.deleteByMobileNo(mobileNo);
        }



        public List<UserRegisterDO> listByInMobileNo(Collection<String> mobileNoList, String... fieldNames){
            return this.userRegisterMapper.listByInMobileNo(mobileNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInMobileNo(Collection<String> mobileNoList, String... fieldNames){
            return this.userRegisterMapper.mapByInMobileNo(mobileNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMobileNo(Collection<String> mobileNoList){
            return this.userRegisterMapper.countByInMobileNo(mobileNoList);
        }

        public Integer updateNotNullFieldsByInMobileNo(UserRegisterDO updateDO, Collection<String> mobileNoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInMobileNo(updateDO,mobileNoList);
        }

        public Integer updateAllFieldsByInMobileNo(UserRegisterDO updateDO,  Collection<String> mobileNoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInMobileNo(updateDO,mobileNoList);
        }

        public Integer deleteByInMobileNo( Collection<String> mobileNoList){
            return this.userRegisterMapper.deleteByInMobileNo(mobileNoList);
        }


        public List<UserRegisterDO> listByEmail(String email, String... fieldNames){
            return this.userRegisterMapper.listByEmail(email,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByEmail(String email, String... fieldNames){
            return this.userRegisterMapper.mapByEmail(email,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEmail(String email){
            return this.userRegisterMapper.countByEmail(email);
        }

        public Integer updateNotNullFieldsByEmail(UserRegisterDO updateDO, String email){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByEmail(updateDO,email);
        }

        public Integer updateAllFieldsByEmail(UserRegisterDO updateDO,  String email){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByEmail(updateDO,email);
        }

        public Integer deleteByEmail( String email){
            return this.userRegisterMapper.deleteByEmail(email);
        }



        public List<UserRegisterDO> listByInEmail(Collection<String> emailList, String... fieldNames){
            return this.userRegisterMapper.listByInEmail(emailList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInEmail(Collection<String> emailList, String... fieldNames){
            return this.userRegisterMapper.mapByInEmail(emailList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEmail(Collection<String> emailList){
            return this.userRegisterMapper.countByInEmail(emailList);
        }

        public Integer updateNotNullFieldsByInEmail(UserRegisterDO updateDO, Collection<String> emailList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInEmail(updateDO,emailList);
        }

        public Integer updateAllFieldsByInEmail(UserRegisterDO updateDO,  Collection<String> emailList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInEmail(updateDO,emailList);
        }

        public Integer deleteByInEmail( Collection<String> emailList){
            return this.userRegisterMapper.deleteByInEmail(emailList);
        }


        public List<UserRegisterDO> listByJob(String job, String... fieldNames){
            return this.userRegisterMapper.listByJob(job,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByJob(String job, String... fieldNames){
            return this.userRegisterMapper.mapByJob(job,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByJob(String job){
            return this.userRegisterMapper.countByJob(job);
        }

        public Integer updateNotNullFieldsByJob(UserRegisterDO updateDO, String job){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByJob(updateDO,job);
        }

        public Integer updateAllFieldsByJob(UserRegisterDO updateDO,  String job){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByJob(updateDO,job);
        }

        public Integer deleteByJob( String job){
            return this.userRegisterMapper.deleteByJob(job);
        }



        public List<UserRegisterDO> listByInJob(Collection<String> jobList, String... fieldNames){
            return this.userRegisterMapper.listByInJob(jobList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInJob(Collection<String> jobList, String... fieldNames){
            return this.userRegisterMapper.mapByInJob(jobList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInJob(Collection<String> jobList){
            return this.userRegisterMapper.countByInJob(jobList);
        }

        public Integer updateNotNullFieldsByInJob(UserRegisterDO updateDO, Collection<String> jobList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInJob(updateDO,jobList);
        }

        public Integer updateAllFieldsByInJob(UserRegisterDO updateDO,  Collection<String> jobList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInJob(updateDO,jobList);
        }

        public Integer deleteByInJob( Collection<String> jobList){
            return this.userRegisterMapper.deleteByInJob(jobList);
        }


        public List<UserRegisterDO> listByBirthday(Date birthday, String... fieldNames){
            return this.userRegisterMapper.listByBirthday(birthday,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByBirthday(Date birthday, String... fieldNames){
            return this.userRegisterMapper.mapByBirthday(birthday,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByBirthday(Date birthday){
            return this.userRegisterMapper.countByBirthday(birthday);
        }

        public Integer updateNotNullFieldsByBirthday(UserRegisterDO updateDO, Date birthday){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByBirthday(updateDO,birthday);
        }

        public Integer updateAllFieldsByBirthday(UserRegisterDO updateDO,  Date birthday){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByBirthday(updateDO,birthday);
        }

        public Integer deleteByBirthday( Date birthday){
            return this.userRegisterMapper.deleteByBirthday(birthday);
        }



        public List<UserRegisterDO> listByInBirthday(Collection<Date> birthdayList, String... fieldNames){
            return this.userRegisterMapper.listByInBirthday(birthdayList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInBirthday(Collection<Date> birthdayList, String... fieldNames){
            return this.userRegisterMapper.mapByInBirthday(birthdayList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInBirthday(Collection<Date> birthdayList){
            return this.userRegisterMapper.countByInBirthday(birthdayList);
        }

        public Integer updateNotNullFieldsByInBirthday(UserRegisterDO updateDO, Collection<Date> birthdayList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInBirthday(updateDO,birthdayList);
        }

        public Integer updateAllFieldsByInBirthday(UserRegisterDO updateDO,  Collection<Date> birthdayList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInBirthday(updateDO,birthdayList);
        }

        public Integer deleteByInBirthday( Collection<Date> birthdayList){
            return this.userRegisterMapper.deleteByInBirthday(birthdayList);
        }


        public List<UserRegisterDO> listByUserPhoto(Long userPhoto, String... fieldNames){
            return this.userRegisterMapper.listByUserPhoto(userPhoto,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserPhoto(Long userPhoto, String... fieldNames){
            return this.userRegisterMapper.mapByUserPhoto(userPhoto,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserPhoto(Long userPhoto){
            return this.userRegisterMapper.countByUserPhoto(userPhoto);
        }

        public Integer updateNotNullFieldsByUserPhoto(UserRegisterDO updateDO, Long userPhoto){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserPhoto(updateDO,userPhoto);
        }

        public Integer updateAllFieldsByUserPhoto(UserRegisterDO updateDO,  Long userPhoto){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserPhoto(updateDO,userPhoto);
        }

        public Integer deleteByUserPhoto( Long userPhoto){
            return this.userRegisterMapper.deleteByUserPhoto(userPhoto);
        }



        public List<UserRegisterDO> listByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames){
            return this.userRegisterMapper.listByInUserPhoto(userPhotoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserPhoto(userPhotoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserPhoto(Collection<Long> userPhotoList){
            return this.userRegisterMapper.countByInUserPhoto(userPhotoList);
        }

        public Integer updateNotNullFieldsByInUserPhoto(UserRegisterDO updateDO, Collection<Long> userPhotoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserPhoto(updateDO,userPhotoList);
        }

        public Integer updateAllFieldsByInUserPhoto(UserRegisterDO updateDO,  Collection<Long> userPhotoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserPhoto(updateDO,userPhotoList);
        }

        public Integer deleteByInUserPhoto( Collection<Long> userPhotoList){
            return this.userRegisterMapper.deleteByInUserPhoto(userPhotoList);
        }


        public List<UserRegisterDO> listByIdCardNo(String idCardNo, String... fieldNames){
            return this.userRegisterMapper.listByIdCardNo(idCardNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByIdCardNo(String idCardNo, String... fieldNames){
            return this.userRegisterMapper.mapByIdCardNo(idCardNo,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByIdCardNo(String idCardNo){
            return this.userRegisterMapper.countByIdCardNo(idCardNo);
        }

        public Integer updateNotNullFieldsByIdCardNo(UserRegisterDO updateDO, String idCardNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByIdCardNo(updateDO,idCardNo);
        }

        public Integer updateAllFieldsByIdCardNo(UserRegisterDO updateDO,  String idCardNo){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByIdCardNo(updateDO,idCardNo);
        }

        public Integer deleteByIdCardNo( String idCardNo){
            return this.userRegisterMapper.deleteByIdCardNo(idCardNo);
        }



        public List<UserRegisterDO> listByInIdCardNo(Collection<String> idCardNoList, String... fieldNames){
            return this.userRegisterMapper.listByInIdCardNo(idCardNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInIdCardNo(Collection<String> idCardNoList, String... fieldNames){
            return this.userRegisterMapper.mapByInIdCardNo(idCardNoList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInIdCardNo(Collection<String> idCardNoList){
            return this.userRegisterMapper.countByInIdCardNo(idCardNoList);
        }

        public Integer updateNotNullFieldsByInIdCardNo(UserRegisterDO updateDO, Collection<String> idCardNoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInIdCardNo(updateDO,idCardNoList);
        }

        public Integer updateAllFieldsByInIdCardNo(UserRegisterDO updateDO,  Collection<String> idCardNoList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInIdCardNo(updateDO,idCardNoList);
        }

        public Integer deleteByInIdCardNo( Collection<String> idCardNoList){
            return this.userRegisterMapper.deleteByInIdCardNo(idCardNoList);
        }


        public List<UserRegisterDO> listByGender(Integer gender, String... fieldNames){
            return this.userRegisterMapper.listByGender(gender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByGender(Integer gender, String... fieldNames){
            return this.userRegisterMapper.mapByGender(gender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByGender(Integer gender){
            return this.userRegisterMapper.countByGender(gender);
        }

        public Integer updateNotNullFieldsByGender(UserRegisterDO updateDO, Integer gender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByGender(updateDO,gender);
        }

        public Integer updateAllFieldsByGender(UserRegisterDO updateDO,  Integer gender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByGender(updateDO,gender);
        }

        public Integer deleteByGender( Integer gender){
            return this.userRegisterMapper.deleteByGender(gender);
        }



        public List<UserRegisterDO> listByInGender(Collection<Integer> genderList, String... fieldNames){
            return this.userRegisterMapper.listByInGender(genderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInGender(Collection<Integer> genderList, String... fieldNames){
            return this.userRegisterMapper.mapByInGender(genderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInGender(Collection<Integer> genderList){
            return this.userRegisterMapper.countByInGender(genderList);
        }

        public Integer updateNotNullFieldsByInGender(UserRegisterDO updateDO, Collection<Integer> genderList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInGender(updateDO,genderList);
        }

        public Integer updateAllFieldsByInGender(UserRegisterDO updateDO,  Collection<Integer> genderList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInGender(updateDO,genderList);
        }

        public Integer deleteByInGender( Collection<Integer> genderList){
            return this.userRegisterMapper.deleteByInGender(genderList);
        }


        public List<UserRegisterDO> listByDeptId(Long deptId, String... fieldNames){
            return this.userRegisterMapper.listByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByDeptId(Long deptId, String... fieldNames){
            return this.userRegisterMapper.mapByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptId(Long deptId){
            return this.userRegisterMapper.countByDeptId(deptId);
        }

        public Integer updateNotNullFieldsByDeptId(UserRegisterDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByDeptId(updateDO,deptId);
        }

        public Integer updateAllFieldsByDeptId(UserRegisterDO updateDO,  Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByDeptId(updateDO,deptId);
        }

        public Integer deleteByDeptId( Long deptId){
            return this.userRegisterMapper.deleteByDeptId(deptId);
        }



        public List<UserRegisterDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.userRegisterMapper.listByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.userRegisterMapper.mapByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptId(Collection<Long> deptIdList){
            return this.userRegisterMapper.countByInDeptId(deptIdList);
        }

        public Integer updateNotNullFieldsByInDeptId(UserRegisterDO updateDO, Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer updateAllFieldsByInDeptId(UserRegisterDO updateDO,  Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer deleteByInDeptId( Collection<Long> deptIdList){
            return this.userRegisterMapper.deleteByInDeptId(deptIdList);
        }


        public List<UserRegisterDO> listByExamineStatus(Integer examineStatus, String... fieldNames){
            return this.userRegisterMapper.listByExamineStatus(examineStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByExamineStatus(Integer examineStatus, String... fieldNames){
            return this.userRegisterMapper.mapByExamineStatus(examineStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByExamineStatus(Integer examineStatus){
            return this.userRegisterMapper.countByExamineStatus(examineStatus);
        }

        public Integer updateNotNullFieldsByExamineStatus(UserRegisterDO updateDO, Integer examineStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByExamineStatus(updateDO,examineStatus);
        }

        public Integer updateAllFieldsByExamineStatus(UserRegisterDO updateDO,  Integer examineStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByExamineStatus(updateDO,examineStatus);
        }

        public Integer deleteByExamineStatus( Integer examineStatus){
            return this.userRegisterMapper.deleteByExamineStatus(examineStatus);
        }



        public List<UserRegisterDO> listByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
            return this.userRegisterMapper.listByInExamineStatus(examineStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
            return this.userRegisterMapper.mapByInExamineStatus(examineStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInExamineStatus(Collection<Integer> examineStatusList){
            return this.userRegisterMapper.countByInExamineStatus(examineStatusList);
        }

        public Integer updateNotNullFieldsByInExamineStatus(UserRegisterDO updateDO, Collection<Integer> examineStatusList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInExamineStatus(updateDO,examineStatusList);
        }

        public Integer updateAllFieldsByInExamineStatus(UserRegisterDO updateDO,  Collection<Integer> examineStatusList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInExamineStatus(updateDO,examineStatusList);
        }

        public Integer deleteByInExamineStatus( Collection<Integer> examineStatusList){
            return this.userRegisterMapper.deleteByInExamineStatus(examineStatusList);
        }


        public List<UserRegisterDO> listByExamineUserId(Long examineUserId, String... fieldNames){
            return this.userRegisterMapper.listByExamineUserId(examineUserId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByExamineUserId(Long examineUserId, String... fieldNames){
            return this.userRegisterMapper.mapByExamineUserId(examineUserId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByExamineUserId(Long examineUserId){
            return this.userRegisterMapper.countByExamineUserId(examineUserId);
        }

        public Integer updateNotNullFieldsByExamineUserId(UserRegisterDO updateDO, Long examineUserId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByExamineUserId(updateDO,examineUserId);
        }

        public Integer updateAllFieldsByExamineUserId(UserRegisterDO updateDO,  Long examineUserId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByExamineUserId(updateDO,examineUserId);
        }

        public Integer deleteByExamineUserId( Long examineUserId){
            return this.userRegisterMapper.deleteByExamineUserId(examineUserId);
        }



        public List<UserRegisterDO> listByInExamineUserId(Collection<Long> examineUserIdList, String... fieldNames){
            return this.userRegisterMapper.listByInExamineUserId(examineUserIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInExamineUserId(Collection<Long> examineUserIdList, String... fieldNames){
            return this.userRegisterMapper.mapByInExamineUserId(examineUserIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInExamineUserId(Collection<Long> examineUserIdList){
            return this.userRegisterMapper.countByInExamineUserId(examineUserIdList);
        }

        public Integer updateNotNullFieldsByInExamineUserId(UserRegisterDO updateDO, Collection<Long> examineUserIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInExamineUserId(updateDO,examineUserIdList);
        }

        public Integer updateAllFieldsByInExamineUserId(UserRegisterDO updateDO,  Collection<Long> examineUserIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInExamineUserId(updateDO,examineUserIdList);
        }

        public Integer deleteByInExamineUserId( Collection<Long> examineUserIdList){
            return this.userRegisterMapper.deleteByInExamineUserId(examineUserIdList);
        }


        public List<UserRegisterDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.userRegisterMapper.listByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.userRegisterMapper.mapByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamTypeCode(String teamTypeCode){
            return this.userRegisterMapper.countByTeamTypeCode(teamTypeCode);
        }

        public Integer updateNotNullFieldsByTeamTypeCode(UserRegisterDO updateDO, String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer updateAllFieldsByTeamTypeCode(UserRegisterDO updateDO,  String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer deleteByTeamTypeCode( String teamTypeCode){
            return this.userRegisterMapper.deleteByTeamTypeCode(teamTypeCode);
        }



        public List<UserRegisterDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            return this.userRegisterMapper.listByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            return this.userRegisterMapper.mapByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList){
            return this.userRegisterMapper.countByInTeamTypeCode(teamTypeCodeList);
        }

        public Integer updateNotNullFieldsByInTeamTypeCode(UserRegisterDO updateDO, Collection<String> teamTypeCodeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer updateAllFieldsByInTeamTypeCode(UserRegisterDO updateDO,  Collection<String> teamTypeCodeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer deleteByInTeamTypeCode( Collection<String> teamTypeCodeList){
            return this.userRegisterMapper.deleteByInTeamTypeCode(teamTypeCodeList);
        }


        public List<UserRegisterDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRegisterMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRegisterMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userRegisterMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserRegisterDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserRegisterDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userRegisterMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserRegisterDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRegisterMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.userRegisterMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserRegisterDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserRegisterDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.userRegisterMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserRegisterDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRegisterMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRegisterMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userRegisterMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserRegisterDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserRegisterDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userRegisterMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserRegisterDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRegisterMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRegisterDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRegisterMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.userRegisterMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserRegisterDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserRegisterDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRegisterMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.userRegisterMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

