package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Mapper
public interface UserMapper extends CommonMapper<UserDO,Long> {


        public UserDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<UserDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default UserDO singleResultById(Long id, String[] fieldNames){
             List<UserDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingById(Long id, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") UserDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") UserDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<UserDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default UserDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<UserDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInId(Collection<Long> idList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") UserDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") UserDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<UserDO> listByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserAccount(@Param("userAccount") String userAccount);

        public default UserDO singleResultByUserAccount(String userAccount, String[] fieldNames){
             List<UserDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserAccount(String userAccount, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(@Param("updateDO") UserDO updateDO, @Param("userAccount") String userAccount);

        public Integer updateAllFieldsByUserAccount(@Param("updateDO") UserDO updateDO, @Param("userAccount") String userAccount);

        public Integer deleteByUserAccount(@Param("userAccount") String userAccount);




        public List<UserDO> listByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public default UserDO singleResultByInUserAccount(Collection<String> userAccountList, String[] fieldNames){
             List<UserDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserAccount(@Param("updateDO") UserDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer updateAllFieldsByInUserAccount(@Param("updateDO") UserDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer deleteByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public List<UserDO> listByUserPassword(@Param("userPassword") String userPassword, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserPassword(@Param("userPassword") String userPassword, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserPassword(@Param("userPassword") String userPassword);

        public default UserDO singleResultByUserPassword(String userPassword, String[] fieldNames){
             List<UserDO> list=this.listByUserPassword(userPassword,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserPassword(String userPassword, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserPassword(userPassword,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPassword(@Param("updateDO") UserDO updateDO, @Param("userPassword") String userPassword);

        public Integer updateAllFieldsByUserPassword(@Param("updateDO") UserDO updateDO, @Param("userPassword") String userPassword);

        public Integer deleteByUserPassword(@Param("userPassword") String userPassword);




        public List<UserDO> listByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList);

        public default UserDO singleResultByInUserPassword(Collection<String> userPasswordList, String[] fieldNames){
             List<UserDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserPassword(Collection<String> userPasswordList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserPassword(@Param("updateDO") UserDO updateDO, @Param("userPasswordList") Collection<String> userPasswordList);

        public Integer updateAllFieldsByInUserPassword(@Param("updateDO") UserDO updateDO, @Param("userPasswordList") Collection<String> userPasswordList);

        public Integer deleteByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList);

        public List<UserDO> listByUpdatePasswordTime(@Param("updatePasswordTime") Date updatePasswordTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUpdatePasswordTime(@Param("updatePasswordTime") Date updatePasswordTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByUpdatePasswordTime(@Param("updatePasswordTime") Date updatePasswordTime);

        public default UserDO singleResultByUpdatePasswordTime(Date updatePasswordTime, String[] fieldNames){
             List<UserDO> list=this.listByUpdatePasswordTime(updatePasswordTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUpdatePasswordTime(Date updatePasswordTime, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUpdatePasswordTime(updatePasswordTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUpdatePasswordTime(@Param("updateDO") UserDO updateDO, @Param("updatePasswordTime") Date updatePasswordTime);

        public Integer updateAllFieldsByUpdatePasswordTime(@Param("updateDO") UserDO updateDO, @Param("updatePasswordTime") Date updatePasswordTime);

        public Integer deleteByUpdatePasswordTime(@Param("updatePasswordTime") Date updatePasswordTime);




        public List<UserDO> listByInUpdatePasswordTime(@Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUpdatePasswordTime(@Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUpdatePasswordTime(@Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList);

        public default UserDO singleResultByInUpdatePasswordTime(Collection<Date> updatePasswordTimeList, String[] fieldNames){
             List<UserDO> list=this.listByInUpdatePasswordTime(updatePasswordTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUpdatePasswordTime(Collection<Date> updatePasswordTimeList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUpdatePasswordTime(updatePasswordTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUpdatePasswordTime(@Param("updateDO") UserDO updateDO, @Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList);

        public Integer updateAllFieldsByInUpdatePasswordTime(@Param("updateDO") UserDO updateDO, @Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList);

        public Integer deleteByInUpdatePasswordTime(@Param("updatePasswordTimeList") Collection<Date> updatePasswordTimeList);

        public List<UserDO> listByUserName(@Param("userName") String userName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserName(@Param("userName") String userName, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserName(@Param("userName") String userName);

        public default UserDO singleResultByUserName(String userName, String[] fieldNames){
             List<UserDO> list=this.listByUserName(userName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserName(String userName, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserName(userName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserName(@Param("updateDO") UserDO updateDO, @Param("userName") String userName);

        public Integer updateAllFieldsByUserName(@Param("updateDO") UserDO updateDO, @Param("userName") String userName);

        public Integer deleteByUserName(@Param("userName") String userName);




        public List<UserDO> listByInUserName(@Param("userNameList") Collection<String> userNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserName(@Param("userNameList") Collection<String> userNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserName(@Param("userNameList") Collection<String> userNameList);

        public default UserDO singleResultByInUserName(Collection<String> userNameList, String[] fieldNames){
             List<UserDO> list=this.listByInUserName(userNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserName(Collection<String> userNameList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserName(userNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserName(@Param("updateDO") UserDO updateDO, @Param("userNameList") Collection<String> userNameList);

        public Integer updateAllFieldsByInUserName(@Param("updateDO") UserDO updateDO, @Param("userNameList") Collection<String> userNameList);

        public Integer deleteByInUserName(@Param("userNameList") Collection<String> userNameList);

        public List<UserDO> listByMobileNo(@Param("mobileNo") String mobileNo, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByMobileNo(@Param("mobileNo") String mobileNo, @Param("fieldNames") String[] fieldNames);

        public Integer countByMobileNo(@Param("mobileNo") String mobileNo);

        public default UserDO singleResultByMobileNo(String mobileNo, String[] fieldNames){
             List<UserDO> list=this.listByMobileNo(mobileNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByMobileNo(String mobileNo, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByMobileNo(mobileNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMobileNo(@Param("updateDO") UserDO updateDO, @Param("mobileNo") String mobileNo);

        public Integer updateAllFieldsByMobileNo(@Param("updateDO") UserDO updateDO, @Param("mobileNo") String mobileNo);

        public Integer deleteByMobileNo(@Param("mobileNo") String mobileNo);




        public List<UserDO> listByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList);

        public default UserDO singleResultByInMobileNo(Collection<String> mobileNoList, String[] fieldNames){
             List<UserDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInMobileNo(Collection<String> mobileNoList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMobileNo(@Param("updateDO") UserDO updateDO, @Param("mobileNoList") Collection<String> mobileNoList);

        public Integer updateAllFieldsByInMobileNo(@Param("updateDO") UserDO updateDO, @Param("mobileNoList") Collection<String> mobileNoList);

        public Integer deleteByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList);

        public List<UserDO> listByEmail(@Param("email") String email, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByEmail(@Param("email") String email, @Param("fieldNames") String[] fieldNames);

        public Integer countByEmail(@Param("email") String email);

        public default UserDO singleResultByEmail(String email, String[] fieldNames){
             List<UserDO> list=this.listByEmail(email,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByEmail(String email, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByEmail(email,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEmail(@Param("updateDO") UserDO updateDO, @Param("email") String email);

        public Integer updateAllFieldsByEmail(@Param("updateDO") UserDO updateDO, @Param("email") String email);

        public Integer deleteByEmail(@Param("email") String email);




        public List<UserDO> listByInEmail(@Param("emailList") Collection<String> emailList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInEmail(@Param("emailList") Collection<String> emailList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEmail(@Param("emailList") Collection<String> emailList);

        public default UserDO singleResultByInEmail(Collection<String> emailList, String[] fieldNames){
             List<UserDO> list=this.listByInEmail(emailList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInEmail(Collection<String> emailList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInEmail(emailList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEmail(@Param("updateDO") UserDO updateDO, @Param("emailList") Collection<String> emailList);

        public Integer updateAllFieldsByInEmail(@Param("updateDO") UserDO updateDO, @Param("emailList") Collection<String> emailList);

        public Integer deleteByInEmail(@Param("emailList") Collection<String> emailList);

        public List<UserDO> listByJob(@Param("job") String job, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByJob(@Param("job") String job, @Param("fieldNames") String[] fieldNames);

        public Integer countByJob(@Param("job") String job);

        public default UserDO singleResultByJob(String job, String[] fieldNames){
             List<UserDO> list=this.listByJob(job,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByJob(String job, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByJob(job,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByJob(@Param("updateDO") UserDO updateDO, @Param("job") String job);

        public Integer updateAllFieldsByJob(@Param("updateDO") UserDO updateDO, @Param("job") String job);

        public Integer deleteByJob(@Param("job") String job);




        public List<UserDO> listByInJob(@Param("jobList") Collection<String> jobList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInJob(@Param("jobList") Collection<String> jobList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInJob(@Param("jobList") Collection<String> jobList);

        public default UserDO singleResultByInJob(Collection<String> jobList, String[] fieldNames){
             List<UserDO> list=this.listByInJob(jobList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInJob(Collection<String> jobList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInJob(jobList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInJob(@Param("updateDO") UserDO updateDO, @Param("jobList") Collection<String> jobList);

        public Integer updateAllFieldsByInJob(@Param("updateDO") UserDO updateDO, @Param("jobList") Collection<String> jobList);

        public Integer deleteByInJob(@Param("jobList") Collection<String> jobList);

        public List<UserDO> listByBirthday(@Param("birthday") Date birthday, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByBirthday(@Param("birthday") Date birthday, @Param("fieldNames") String[] fieldNames);

        public Integer countByBirthday(@Param("birthday") Date birthday);

        public default UserDO singleResultByBirthday(Date birthday, String[] fieldNames){
             List<UserDO> list=this.listByBirthday(birthday,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByBirthday(Date birthday, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByBirthday(birthday,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBirthday(@Param("updateDO") UserDO updateDO, @Param("birthday") Date birthday);

        public Integer updateAllFieldsByBirthday(@Param("updateDO") UserDO updateDO, @Param("birthday") Date birthday);

        public Integer deleteByBirthday(@Param("birthday") Date birthday);




        public List<UserDO> listByInBirthday(@Param("birthdayList") Collection<Date> birthdayList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInBirthday(@Param("birthdayList") Collection<Date> birthdayList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInBirthday(@Param("birthdayList") Collection<Date> birthdayList);

        public default UserDO singleResultByInBirthday(Collection<Date> birthdayList, String[] fieldNames){
             List<UserDO> list=this.listByInBirthday(birthdayList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInBirthday(Collection<Date> birthdayList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInBirthday(birthdayList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInBirthday(@Param("updateDO") UserDO updateDO, @Param("birthdayList") Collection<Date> birthdayList);

        public Integer updateAllFieldsByInBirthday(@Param("updateDO") UserDO updateDO, @Param("birthdayList") Collection<Date> birthdayList);

        public Integer deleteByInBirthday(@Param("birthdayList") Collection<Date> birthdayList);

        public List<UserDO> listByUserPhoto(@Param("userPhoto") Long userPhoto, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserPhoto(@Param("userPhoto") Long userPhoto, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserPhoto(@Param("userPhoto") Long userPhoto);

        public default UserDO singleResultByUserPhoto(Long userPhoto, String[] fieldNames){
             List<UserDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserPhoto(Long userPhoto, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPhoto(@Param("updateDO") UserDO updateDO, @Param("userPhoto") Long userPhoto);

        public Integer updateAllFieldsByUserPhoto(@Param("updateDO") UserDO updateDO, @Param("userPhoto") Long userPhoto);

        public Integer deleteByUserPhoto(@Param("userPhoto") Long userPhoto);




        public List<UserDO> listByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList);

        public default UserDO singleResultByInUserPhoto(Collection<Long> userPhotoList, String[] fieldNames){
             List<UserDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserPhoto(Collection<Long> userPhotoList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserPhoto(@Param("updateDO") UserDO updateDO, @Param("userPhotoList") Collection<Long> userPhotoList);

        public Integer updateAllFieldsByInUserPhoto(@Param("updateDO") UserDO updateDO, @Param("userPhotoList") Collection<Long> userPhotoList);

        public Integer deleteByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList);

        public List<UserDO> listByIdCardNo(@Param("idCardNo") String idCardNo, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByIdCardNo(@Param("idCardNo") String idCardNo, @Param("fieldNames") String[] fieldNames);

        public Integer countByIdCardNo(@Param("idCardNo") String idCardNo);

        public default UserDO singleResultByIdCardNo(String idCardNo, String[] fieldNames){
             List<UserDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByIdCardNo(String idCardNo, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIdCardNo(@Param("updateDO") UserDO updateDO, @Param("idCardNo") String idCardNo);

        public Integer updateAllFieldsByIdCardNo(@Param("updateDO") UserDO updateDO, @Param("idCardNo") String idCardNo);

        public Integer deleteByIdCardNo(@Param("idCardNo") String idCardNo);




        public List<UserDO> listByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList);

        public default UserDO singleResultByInIdCardNo(Collection<String> idCardNoList, String[] fieldNames){
             List<UserDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInIdCardNo(Collection<String> idCardNoList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInIdCardNo(@Param("updateDO") UserDO updateDO, @Param("idCardNoList") Collection<String> idCardNoList);

        public Integer updateAllFieldsByInIdCardNo(@Param("updateDO") UserDO updateDO, @Param("idCardNoList") Collection<String> idCardNoList);

        public Integer deleteByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList);

        public List<UserDO> listByGender(@Param("gender") Integer gender, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByGender(@Param("gender") Integer gender, @Param("fieldNames") String[] fieldNames);

        public Integer countByGender(@Param("gender") Integer gender);

        public default UserDO singleResultByGender(Integer gender, String[] fieldNames){
             List<UserDO> list=this.listByGender(gender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByGender(Integer gender, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByGender(gender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByGender(@Param("updateDO") UserDO updateDO, @Param("gender") Integer gender);

        public Integer updateAllFieldsByGender(@Param("updateDO") UserDO updateDO, @Param("gender") Integer gender);

        public Integer deleteByGender(@Param("gender") Integer gender);




        public List<UserDO> listByInGender(@Param("genderList") Collection<Integer> genderList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInGender(@Param("genderList") Collection<Integer> genderList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInGender(@Param("genderList") Collection<Integer> genderList);

        public default UserDO singleResultByInGender(Collection<Integer> genderList, String[] fieldNames){
             List<UserDO> list=this.listByInGender(genderList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInGender(Collection<Integer> genderList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInGender(genderList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInGender(@Param("updateDO") UserDO updateDO, @Param("genderList") Collection<Integer> genderList);

        public Integer updateAllFieldsByInGender(@Param("updateDO") UserDO updateDO, @Param("genderList") Collection<Integer> genderList);

        public Integer deleteByInGender(@Param("genderList") Collection<Integer> genderList);

        public List<UserDO> listByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptId(@Param("deptId") Long deptId);

        public default UserDO singleResultByDeptId(Long deptId, String[] fieldNames){
             List<UserDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByDeptId(Long deptId, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(@Param("updateDO") UserDO updateDO, @Param("deptId") Long deptId);

        public Integer updateAllFieldsByDeptId(@Param("updateDO") UserDO updateDO, @Param("deptId") Long deptId);

        public Integer deleteByDeptId(@Param("deptId") Long deptId);




        public List<UserDO> listByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public default UserDO singleResultByInDeptId(Collection<Long> deptIdList, String[] fieldNames){
             List<UserDO> list=this.listByInDeptId(deptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInDeptId(deptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptId(@Param("updateDO") UserDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer updateAllFieldsByInDeptId(@Param("updateDO") UserDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer deleteByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public List<UserDO> listByAddress(@Param("address") String address, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByAddress(@Param("address") String address, @Param("fieldNames") String[] fieldNames);

        public Integer countByAddress(@Param("address") String address);

        public default UserDO singleResultByAddress(String address, String[] fieldNames){
             List<UserDO> list=this.listByAddress(address,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByAddress(String address, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByAddress(address,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAddress(@Param("updateDO") UserDO updateDO, @Param("address") String address);

        public Integer updateAllFieldsByAddress(@Param("updateDO") UserDO updateDO, @Param("address") String address);

        public Integer deleteByAddress(@Param("address") String address);




        public List<UserDO> listByInAddress(@Param("addressList") Collection<String> addressList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInAddress(@Param("addressList") Collection<String> addressList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAddress(@Param("addressList") Collection<String> addressList);

        public default UserDO singleResultByInAddress(Collection<String> addressList, String[] fieldNames){
             List<UserDO> list=this.listByInAddress(addressList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInAddress(Collection<String> addressList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInAddress(addressList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAddress(@Param("updateDO") UserDO updateDO, @Param("addressList") Collection<String> addressList);

        public Integer updateAllFieldsByInAddress(@Param("updateDO") UserDO updateDO, @Param("addressList") Collection<String> addressList);

        public Integer deleteByInAddress(@Param("addressList") Collection<String> addressList);

        public List<UserDO> listByLocked(@Param("locked") Integer locked, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByLocked(@Param("locked") Integer locked, @Param("fieldNames") String[] fieldNames);

        public Integer countByLocked(@Param("locked") Integer locked);

        public default UserDO singleResultByLocked(Integer locked, String[] fieldNames){
             List<UserDO> list=this.listByLocked(locked,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLocked(Integer locked, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByLocked(locked,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLocked(@Param("updateDO") UserDO updateDO, @Param("locked") Integer locked);

        public Integer updateAllFieldsByLocked(@Param("updateDO") UserDO updateDO, @Param("locked") Integer locked);

        public Integer deleteByLocked(@Param("locked") Integer locked);




        public List<UserDO> listByInLocked(@Param("lockedList") Collection<Integer> lockedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInLocked(@Param("lockedList") Collection<Integer> lockedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLocked(@Param("lockedList") Collection<Integer> lockedList);

        public default UserDO singleResultByInLocked(Collection<Integer> lockedList, String[] fieldNames){
             List<UserDO> list=this.listByInLocked(lockedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInLocked(Collection<Integer> lockedList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInLocked(lockedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLocked(@Param("updateDO") UserDO updateDO, @Param("lockedList") Collection<Integer> lockedList);

        public Integer updateAllFieldsByInLocked(@Param("updateDO") UserDO updateDO, @Param("lockedList") Collection<Integer> lockedList);

        public Integer deleteByInLocked(@Param("lockedList") Collection<Integer> lockedList);

        public List<UserDO> listByLockedTime(@Param("lockedTime") Date lockedTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByLockedTime(@Param("lockedTime") Date lockedTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByLockedTime(@Param("lockedTime") Date lockedTime);

        public default UserDO singleResultByLockedTime(Date lockedTime, String[] fieldNames){
             List<UserDO> list=this.listByLockedTime(lockedTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLockedTime(Date lockedTime, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByLockedTime(lockedTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLockedTime(@Param("updateDO") UserDO updateDO, @Param("lockedTime") Date lockedTime);

        public Integer updateAllFieldsByLockedTime(@Param("updateDO") UserDO updateDO, @Param("lockedTime") Date lockedTime);

        public Integer deleteByLockedTime(@Param("lockedTime") Date lockedTime);




        public List<UserDO> listByInLockedTime(@Param("lockedTimeList") Collection<Date> lockedTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInLockedTime(@Param("lockedTimeList") Collection<Date> lockedTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLockedTime(@Param("lockedTimeList") Collection<Date> lockedTimeList);

        public default UserDO singleResultByInLockedTime(Collection<Date> lockedTimeList, String[] fieldNames){
             List<UserDO> list=this.listByInLockedTime(lockedTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInLockedTime(Collection<Date> lockedTimeList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInLockedTime(lockedTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLockedTime(@Param("updateDO") UserDO updateDO, @Param("lockedTimeList") Collection<Date> lockedTimeList);

        public Integer updateAllFieldsByInLockedTime(@Param("updateDO") UserDO updateDO, @Param("lockedTimeList") Collection<Date> lockedTimeList);

        public Integer deleteByInLockedTime(@Param("lockedTimeList") Collection<Date> lockedTimeList);

        public List<UserDO> listByEnabled(@Param("enabled") Integer enabled, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByEnabled(@Param("enabled") Integer enabled, @Param("fieldNames") String[] fieldNames);

        public Integer countByEnabled(@Param("enabled") Integer enabled);

        public default UserDO singleResultByEnabled(Integer enabled, String[] fieldNames){
             List<UserDO> list=this.listByEnabled(enabled,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByEnabled(Integer enabled, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByEnabled(enabled,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEnabled(@Param("updateDO") UserDO updateDO, @Param("enabled") Integer enabled);

        public Integer updateAllFieldsByEnabled(@Param("updateDO") UserDO updateDO, @Param("enabled") Integer enabled);

        public Integer deleteByEnabled(@Param("enabled") Integer enabled);




        public List<UserDO> listByInEnabled(@Param("enabledList") Collection<Integer> enabledList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInEnabled(@Param("enabledList") Collection<Integer> enabledList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEnabled(@Param("enabledList") Collection<Integer> enabledList);

        public default UserDO singleResultByInEnabled(Collection<Integer> enabledList, String[] fieldNames){
             List<UserDO> list=this.listByInEnabled(enabledList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInEnabled(Collection<Integer> enabledList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInEnabled(enabledList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEnabled(@Param("updateDO") UserDO updateDO, @Param("enabledList") Collection<Integer> enabledList);

        public Integer updateAllFieldsByInEnabled(@Param("updateDO") UserDO updateDO, @Param("enabledList") Collection<Integer> enabledList);

        public Integer deleteByInEnabled(@Param("enabledList") Collection<Integer> enabledList);

        public List<UserDO> listByExpired(@Param("expired") Integer expired, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByExpired(@Param("expired") Integer expired, @Param("fieldNames") String[] fieldNames);

        public Integer countByExpired(@Param("expired") Integer expired);

        public default UserDO singleResultByExpired(Integer expired, String[] fieldNames){
             List<UserDO> list=this.listByExpired(expired,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByExpired(Integer expired, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByExpired(expired,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExpired(@Param("updateDO") UserDO updateDO, @Param("expired") Integer expired);

        public Integer updateAllFieldsByExpired(@Param("updateDO") UserDO updateDO, @Param("expired") Integer expired);

        public Integer deleteByExpired(@Param("expired") Integer expired);




        public List<UserDO> listByInExpired(@Param("expiredList") Collection<Integer> expiredList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInExpired(@Param("expiredList") Collection<Integer> expiredList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInExpired(@Param("expiredList") Collection<Integer> expiredList);

        public default UserDO singleResultByInExpired(Collection<Integer> expiredList, String[] fieldNames){
             List<UserDO> list=this.listByInExpired(expiredList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInExpired(Collection<Integer> expiredList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInExpired(expiredList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInExpired(@Param("updateDO") UserDO updateDO, @Param("expiredList") Collection<Integer> expiredList);

        public Integer updateAllFieldsByInExpired(@Param("updateDO") UserDO updateDO, @Param("expiredList") Collection<Integer> expiredList);

        public Integer deleteByInExpired(@Param("expiredList") Collection<Integer> expiredList);

        public List<UserDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserIdModified(Long userIdModified, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public List<UserDO> listByLeaderId(@Param("leaderId") Long leaderId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByLeaderId(@Param("leaderId") Long leaderId, @Param("fieldNames") String[] fieldNames);

        public Integer countByLeaderId(@Param("leaderId") Long leaderId);

        public default UserDO singleResultByLeaderId(Long leaderId, String[] fieldNames){
             List<UserDO> list=this.listByLeaderId(leaderId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLeaderId(Long leaderId, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByLeaderId(leaderId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLeaderId(@Param("updateDO") UserDO updateDO, @Param("leaderId") Long leaderId);

        public Integer updateAllFieldsByLeaderId(@Param("updateDO") UserDO updateDO, @Param("leaderId") Long leaderId);

        public Integer deleteByLeaderId(@Param("leaderId") Long leaderId);




        public List<UserDO> listByInLeaderId(@Param("leaderIdList") Collection<Long> leaderIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserDO> mapByInLeaderId(@Param("leaderIdList") Collection<Long> leaderIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLeaderId(@Param("leaderIdList") Collection<Long> leaderIdList);

        public default UserDO singleResultByInLeaderId(Collection<Long> leaderIdList, String[] fieldNames){
             List<UserDO> list=this.listByInLeaderId(leaderIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByInLeaderId(Collection<Long> leaderIdList, Function<UserDO, T> mapper, String[] fieldNames){
             List<UserDO> list=this.listByInLeaderId(leaderIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLeaderId(@Param("updateDO") UserDO updateDO, @Param("leaderIdList") Collection<Long> leaderIdList);

        public Integer updateAllFieldsByInLeaderId(@Param("updateDO") UserDO updateDO, @Param("leaderIdList") Collection<Long> leaderIdList);

        public Integer deleteByInLeaderId(@Param("leaderIdList") Collection<Long> leaderIdList);


}
