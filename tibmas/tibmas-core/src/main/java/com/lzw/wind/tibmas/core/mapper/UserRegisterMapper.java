package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.UserRegisterDO;
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
public interface UserRegisterMapper extends CommonMapper<UserRegisterDO,Long> {

        public List<UserRegisterDO> listByBusId(@Param("busId") String busId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByBusId(@Param("busId") String busId, @Param("fieldNames") String[] fieldNames);

        public Integer countByBusId(@Param("busId") String busId);

        public default UserRegisterDO singleResultByBusId(String busId, String[] fieldNames){
             List<UserRegisterDO> list=this.listByBusId(busId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByBusId(String busId, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByBusId(busId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBusId(@Param("updateDO") UserRegisterDO updateDO, @Param("busId") String busId);

        public Integer updateAllFieldsByBusId(@Param("updateDO") UserRegisterDO updateDO, @Param("busId") String busId);

        public Integer deleteByBusId(@Param("busId") String busId);




        public List<UserRegisterDO> listByInBusId(@Param("busIdList") Collection<String> busIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInBusId(@Param("busIdList") Collection<String> busIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInBusId(@Param("busIdList") Collection<String> busIdList);

        public default UserRegisterDO singleResultByInBusId(Collection<String> busIdList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInBusId(busIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInBusId(Collection<String> busIdList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInBusId(busIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInBusId(@Param("updateDO") UserRegisterDO updateDO, @Param("busIdList") Collection<String> busIdList);

        public Integer updateAllFieldsByInBusId(@Param("updateDO") UserRegisterDO updateDO, @Param("busIdList") Collection<String> busIdList);

        public Integer deleteByInBusId(@Param("busIdList") Collection<String> busIdList);

        public List<UserRegisterDO> listByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserAccount(@Param("userAccount") String userAccount);

        public default UserRegisterDO singleResultByUserAccount(String userAccount, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserAccount(String userAccount, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(@Param("updateDO") UserRegisterDO updateDO, @Param("userAccount") String userAccount);

        public Integer updateAllFieldsByUserAccount(@Param("updateDO") UserRegisterDO updateDO, @Param("userAccount") String userAccount);

        public Integer deleteByUserAccount(@Param("userAccount") String userAccount);




        public List<UserRegisterDO> listByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public default UserRegisterDO singleResultByInUserAccount(Collection<String> userAccountList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserAccount(@Param("updateDO") UserRegisterDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer updateAllFieldsByInUserAccount(@Param("updateDO") UserRegisterDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer deleteByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public List<UserRegisterDO> listByUserPassword(@Param("userPassword") String userPassword, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserPassword(@Param("userPassword") String userPassword, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserPassword(@Param("userPassword") String userPassword);

        public default UserRegisterDO singleResultByUserPassword(String userPassword, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserPassword(userPassword,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserPassword(String userPassword, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserPassword(userPassword,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPassword(@Param("updateDO") UserRegisterDO updateDO, @Param("userPassword") String userPassword);

        public Integer updateAllFieldsByUserPassword(@Param("updateDO") UserRegisterDO updateDO, @Param("userPassword") String userPassword);

        public Integer deleteByUserPassword(@Param("userPassword") String userPassword);




        public List<UserRegisterDO> listByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList);

        public default UserRegisterDO singleResultByInUserPassword(Collection<String> userPasswordList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserPassword(Collection<String> userPasswordList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserPassword(@Param("updateDO") UserRegisterDO updateDO, @Param("userPasswordList") Collection<String> userPasswordList);

        public Integer updateAllFieldsByInUserPassword(@Param("updateDO") UserRegisterDO updateDO, @Param("userPasswordList") Collection<String> userPasswordList);

        public Integer deleteByInUserPassword(@Param("userPasswordList") Collection<String> userPasswordList);

        public List<UserRegisterDO> listByUserName(@Param("userName") String userName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserName(@Param("userName") String userName, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserName(@Param("userName") String userName);

        public default UserRegisterDO singleResultByUserName(String userName, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserName(userName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserName(String userName, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserName(userName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserName(@Param("updateDO") UserRegisterDO updateDO, @Param("userName") String userName);

        public Integer updateAllFieldsByUserName(@Param("updateDO") UserRegisterDO updateDO, @Param("userName") String userName);

        public Integer deleteByUserName(@Param("userName") String userName);




        public List<UserRegisterDO> listByInUserName(@Param("userNameList") Collection<String> userNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserName(@Param("userNameList") Collection<String> userNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserName(@Param("userNameList") Collection<String> userNameList);

        public default UserRegisterDO singleResultByInUserName(Collection<String> userNameList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserName(userNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserName(Collection<String> userNameList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserName(userNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserName(@Param("updateDO") UserRegisterDO updateDO, @Param("userNameList") Collection<String> userNameList);

        public Integer updateAllFieldsByInUserName(@Param("updateDO") UserRegisterDO updateDO, @Param("userNameList") Collection<String> userNameList);

        public Integer deleteByInUserName(@Param("userNameList") Collection<String> userNameList);

        public List<UserRegisterDO> listByMobileNo(@Param("mobileNo") String mobileNo, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByMobileNo(@Param("mobileNo") String mobileNo, @Param("fieldNames") String[] fieldNames);

        public Integer countByMobileNo(@Param("mobileNo") String mobileNo);

        public default UserRegisterDO singleResultByMobileNo(String mobileNo, String[] fieldNames){
             List<UserRegisterDO> list=this.listByMobileNo(mobileNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByMobileNo(String mobileNo, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByMobileNo(mobileNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMobileNo(@Param("updateDO") UserRegisterDO updateDO, @Param("mobileNo") String mobileNo);

        public Integer updateAllFieldsByMobileNo(@Param("updateDO") UserRegisterDO updateDO, @Param("mobileNo") String mobileNo);

        public Integer deleteByMobileNo(@Param("mobileNo") String mobileNo);




        public List<UserRegisterDO> listByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList);

        public default UserRegisterDO singleResultByInMobileNo(Collection<String> mobileNoList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInMobileNo(Collection<String> mobileNoList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMobileNo(@Param("updateDO") UserRegisterDO updateDO, @Param("mobileNoList") Collection<String> mobileNoList);

        public Integer updateAllFieldsByInMobileNo(@Param("updateDO") UserRegisterDO updateDO, @Param("mobileNoList") Collection<String> mobileNoList);

        public Integer deleteByInMobileNo(@Param("mobileNoList") Collection<String> mobileNoList);

        public List<UserRegisterDO> listByEmail(@Param("email") String email, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByEmail(@Param("email") String email, @Param("fieldNames") String[] fieldNames);

        public Integer countByEmail(@Param("email") String email);

        public default UserRegisterDO singleResultByEmail(String email, String[] fieldNames){
             List<UserRegisterDO> list=this.listByEmail(email,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByEmail(String email, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByEmail(email,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEmail(@Param("updateDO") UserRegisterDO updateDO, @Param("email") String email);

        public Integer updateAllFieldsByEmail(@Param("updateDO") UserRegisterDO updateDO, @Param("email") String email);

        public Integer deleteByEmail(@Param("email") String email);




        public List<UserRegisterDO> listByInEmail(@Param("emailList") Collection<String> emailList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInEmail(@Param("emailList") Collection<String> emailList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEmail(@Param("emailList") Collection<String> emailList);

        public default UserRegisterDO singleResultByInEmail(Collection<String> emailList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInEmail(emailList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInEmail(Collection<String> emailList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInEmail(emailList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEmail(@Param("updateDO") UserRegisterDO updateDO, @Param("emailList") Collection<String> emailList);

        public Integer updateAllFieldsByInEmail(@Param("updateDO") UserRegisterDO updateDO, @Param("emailList") Collection<String> emailList);

        public Integer deleteByInEmail(@Param("emailList") Collection<String> emailList);

        public List<UserRegisterDO> listByJob(@Param("job") String job, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByJob(@Param("job") String job, @Param("fieldNames") String[] fieldNames);

        public Integer countByJob(@Param("job") String job);

        public default UserRegisterDO singleResultByJob(String job, String[] fieldNames){
             List<UserRegisterDO> list=this.listByJob(job,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByJob(String job, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByJob(job,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByJob(@Param("updateDO") UserRegisterDO updateDO, @Param("job") String job);

        public Integer updateAllFieldsByJob(@Param("updateDO") UserRegisterDO updateDO, @Param("job") String job);

        public Integer deleteByJob(@Param("job") String job);




        public List<UserRegisterDO> listByInJob(@Param("jobList") Collection<String> jobList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInJob(@Param("jobList") Collection<String> jobList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInJob(@Param("jobList") Collection<String> jobList);

        public default UserRegisterDO singleResultByInJob(Collection<String> jobList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInJob(jobList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInJob(Collection<String> jobList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInJob(jobList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInJob(@Param("updateDO") UserRegisterDO updateDO, @Param("jobList") Collection<String> jobList);

        public Integer updateAllFieldsByInJob(@Param("updateDO") UserRegisterDO updateDO, @Param("jobList") Collection<String> jobList);

        public Integer deleteByInJob(@Param("jobList") Collection<String> jobList);

        public List<UserRegisterDO> listByBirthday(@Param("birthday") Date birthday, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByBirthday(@Param("birthday") Date birthday, @Param("fieldNames") String[] fieldNames);

        public Integer countByBirthday(@Param("birthday") Date birthday);

        public default UserRegisterDO singleResultByBirthday(Date birthday, String[] fieldNames){
             List<UserRegisterDO> list=this.listByBirthday(birthday,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByBirthday(Date birthday, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByBirthday(birthday,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBirthday(@Param("updateDO") UserRegisterDO updateDO, @Param("birthday") Date birthday);

        public Integer updateAllFieldsByBirthday(@Param("updateDO") UserRegisterDO updateDO, @Param("birthday") Date birthday);

        public Integer deleteByBirthday(@Param("birthday") Date birthday);




        public List<UserRegisterDO> listByInBirthday(@Param("birthdayList") Collection<Date> birthdayList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInBirthday(@Param("birthdayList") Collection<Date> birthdayList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInBirthday(@Param("birthdayList") Collection<Date> birthdayList);

        public default UserRegisterDO singleResultByInBirthday(Collection<Date> birthdayList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInBirthday(birthdayList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInBirthday(Collection<Date> birthdayList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInBirthday(birthdayList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInBirthday(@Param("updateDO") UserRegisterDO updateDO, @Param("birthdayList") Collection<Date> birthdayList);

        public Integer updateAllFieldsByInBirthday(@Param("updateDO") UserRegisterDO updateDO, @Param("birthdayList") Collection<Date> birthdayList);

        public Integer deleteByInBirthday(@Param("birthdayList") Collection<Date> birthdayList);

        public List<UserRegisterDO> listByUserPhoto(@Param("userPhoto") Long userPhoto, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserPhoto(@Param("userPhoto") Long userPhoto, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserPhoto(@Param("userPhoto") Long userPhoto);

        public default UserRegisterDO singleResultByUserPhoto(Long userPhoto, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserPhoto(Long userPhoto, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPhoto(@Param("updateDO") UserRegisterDO updateDO, @Param("userPhoto") Long userPhoto);

        public Integer updateAllFieldsByUserPhoto(@Param("updateDO") UserRegisterDO updateDO, @Param("userPhoto") Long userPhoto);

        public Integer deleteByUserPhoto(@Param("userPhoto") Long userPhoto);




        public List<UserRegisterDO> listByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList);

        public default UserRegisterDO singleResultByInUserPhoto(Collection<Long> userPhotoList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserPhoto(Collection<Long> userPhotoList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserPhoto(@Param("updateDO") UserRegisterDO updateDO, @Param("userPhotoList") Collection<Long> userPhotoList);

        public Integer updateAllFieldsByInUserPhoto(@Param("updateDO") UserRegisterDO updateDO, @Param("userPhotoList") Collection<Long> userPhotoList);

        public Integer deleteByInUserPhoto(@Param("userPhotoList") Collection<Long> userPhotoList);

        public List<UserRegisterDO> listByIdCardNo(@Param("idCardNo") String idCardNo, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByIdCardNo(@Param("idCardNo") String idCardNo, @Param("fieldNames") String[] fieldNames);

        public Integer countByIdCardNo(@Param("idCardNo") String idCardNo);

        public default UserRegisterDO singleResultByIdCardNo(String idCardNo, String[] fieldNames){
             List<UserRegisterDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByIdCardNo(String idCardNo, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIdCardNo(@Param("updateDO") UserRegisterDO updateDO, @Param("idCardNo") String idCardNo);

        public Integer updateAllFieldsByIdCardNo(@Param("updateDO") UserRegisterDO updateDO, @Param("idCardNo") String idCardNo);

        public Integer deleteByIdCardNo(@Param("idCardNo") String idCardNo);




        public List<UserRegisterDO> listByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList);

        public default UserRegisterDO singleResultByInIdCardNo(Collection<String> idCardNoList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInIdCardNo(Collection<String> idCardNoList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInIdCardNo(@Param("updateDO") UserRegisterDO updateDO, @Param("idCardNoList") Collection<String> idCardNoList);

        public Integer updateAllFieldsByInIdCardNo(@Param("updateDO") UserRegisterDO updateDO, @Param("idCardNoList") Collection<String> idCardNoList);

        public Integer deleteByInIdCardNo(@Param("idCardNoList") Collection<String> idCardNoList);

        public List<UserRegisterDO> listByGender(@Param("gender") Integer gender, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByGender(@Param("gender") Integer gender, @Param("fieldNames") String[] fieldNames);

        public Integer countByGender(@Param("gender") Integer gender);

        public default UserRegisterDO singleResultByGender(Integer gender, String[] fieldNames){
             List<UserRegisterDO> list=this.listByGender(gender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByGender(Integer gender, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByGender(gender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByGender(@Param("updateDO") UserRegisterDO updateDO, @Param("gender") Integer gender);

        public Integer updateAllFieldsByGender(@Param("updateDO") UserRegisterDO updateDO, @Param("gender") Integer gender);

        public Integer deleteByGender(@Param("gender") Integer gender);




        public List<UserRegisterDO> listByInGender(@Param("genderList") Collection<Integer> genderList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInGender(@Param("genderList") Collection<Integer> genderList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInGender(@Param("genderList") Collection<Integer> genderList);

        public default UserRegisterDO singleResultByInGender(Collection<Integer> genderList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInGender(genderList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInGender(Collection<Integer> genderList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInGender(genderList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInGender(@Param("updateDO") UserRegisterDO updateDO, @Param("genderList") Collection<Integer> genderList);

        public Integer updateAllFieldsByInGender(@Param("updateDO") UserRegisterDO updateDO, @Param("genderList") Collection<Integer> genderList);

        public Integer deleteByInGender(@Param("genderList") Collection<Integer> genderList);

        public List<UserRegisterDO> listByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptId(@Param("deptId") Long deptId);

        public default UserRegisterDO singleResultByDeptId(Long deptId, String[] fieldNames){
             List<UserRegisterDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByDeptId(Long deptId, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(@Param("updateDO") UserRegisterDO updateDO, @Param("deptId") Long deptId);

        public Integer updateAllFieldsByDeptId(@Param("updateDO") UserRegisterDO updateDO, @Param("deptId") Long deptId);

        public Integer deleteByDeptId(@Param("deptId") Long deptId);




        public List<UserRegisterDO> listByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public default UserRegisterDO singleResultByInDeptId(Collection<Long> deptIdList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInDeptId(deptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInDeptId(deptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptId(@Param("updateDO") UserRegisterDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer updateAllFieldsByInDeptId(@Param("updateDO") UserRegisterDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer deleteByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public List<UserRegisterDO> listByExamineStatus(@Param("examineStatus") Integer examineStatus, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByExamineStatus(@Param("examineStatus") Integer examineStatus, @Param("fieldNames") String[] fieldNames);

        public Integer countByExamineStatus(@Param("examineStatus") Integer examineStatus);

        public default UserRegisterDO singleResultByExamineStatus(Integer examineStatus, String[] fieldNames){
             List<UserRegisterDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByExamineStatus(Integer examineStatus, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineStatus(@Param("updateDO") UserRegisterDO updateDO, @Param("examineStatus") Integer examineStatus);

        public Integer updateAllFieldsByExamineStatus(@Param("updateDO") UserRegisterDO updateDO, @Param("examineStatus") Integer examineStatus);

        public Integer deleteByExamineStatus(@Param("examineStatus") Integer examineStatus);




        public List<UserRegisterDO> listByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList);

        public default UserRegisterDO singleResultByInExamineStatus(Collection<Integer> examineStatusList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInExamineStatus(Collection<Integer> examineStatusList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInExamineStatus(@Param("updateDO") UserRegisterDO updateDO, @Param("examineStatusList") Collection<Integer> examineStatusList);

        public Integer updateAllFieldsByInExamineStatus(@Param("updateDO") UserRegisterDO updateDO, @Param("examineStatusList") Collection<Integer> examineStatusList);

        public Integer deleteByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList);

        public List<UserRegisterDO> listByExamineUserId(@Param("examineUserId") Long examineUserId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByExamineUserId(@Param("examineUserId") Long examineUserId, @Param("fieldNames") String[] fieldNames);

        public Integer countByExamineUserId(@Param("examineUserId") Long examineUserId);

        public default UserRegisterDO singleResultByExamineUserId(Long examineUserId, String[] fieldNames){
             List<UserRegisterDO> list=this.listByExamineUserId(examineUserId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByExamineUserId(Long examineUserId, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByExamineUserId(examineUserId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineUserId(@Param("updateDO") UserRegisterDO updateDO, @Param("examineUserId") Long examineUserId);

        public Integer updateAllFieldsByExamineUserId(@Param("updateDO") UserRegisterDO updateDO, @Param("examineUserId") Long examineUserId);

        public Integer deleteByExamineUserId(@Param("examineUserId") Long examineUserId);




        public List<UserRegisterDO> listByInExamineUserId(@Param("examineUserIdList") Collection<Long> examineUserIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInExamineUserId(@Param("examineUserIdList") Collection<Long> examineUserIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInExamineUserId(@Param("examineUserIdList") Collection<Long> examineUserIdList);

        public default UserRegisterDO singleResultByInExamineUserId(Collection<Long> examineUserIdList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInExamineUserId(examineUserIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInExamineUserId(Collection<Long> examineUserIdList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInExamineUserId(examineUserIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInExamineUserId(@Param("updateDO") UserRegisterDO updateDO, @Param("examineUserIdList") Collection<Long> examineUserIdList);

        public Integer updateAllFieldsByInExamineUserId(@Param("updateDO") UserRegisterDO updateDO, @Param("examineUserIdList") Collection<Long> examineUserIdList);

        public Integer deleteByInExamineUserId(@Param("examineUserIdList") Collection<Long> examineUserIdList);

        public List<UserRegisterDO> listByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);

        public default UserRegisterDO singleResultByTeamTypeCode(String teamTypeCode, String[] fieldNames){
             List<UserRegisterDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByTeamTypeCode(String teamTypeCode, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(@Param("updateDO") UserRegisterDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(@Param("updateDO") UserRegisterDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer deleteByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);




        public List<UserRegisterDO> listByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public default UserRegisterDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamTypeCode(@Param("updateDO") UserRegisterDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer updateAllFieldsByInTeamTypeCode(@Param("updateDO") UserRegisterDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer deleteByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public List<UserRegisterDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserRegisterDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserRegisterDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserRegisterDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserRegisterDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserRegisterDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserIdModified(Long userIdModified, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserRegisterDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserRegisterDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRegisterDO, T> mapper, String[] fieldNames){
             List<UserRegisterDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserRegisterDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
