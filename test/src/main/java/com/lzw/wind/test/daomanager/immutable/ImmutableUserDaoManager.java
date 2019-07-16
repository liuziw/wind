package com.lzw.wind.test.daomanager.immutable;

import com.lzw.wind.test.dbo.UserDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableUserDaoManager extends CommonDaoManager<UserDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public UserDO getById(Long id);

        public List<UserDO> listById(Long id, String... fieldNames);

        public Map<Long,UserDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default UserDO singleResultById(Long id,String... fieldNames){
             List<UserDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingById(Long id, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(UserDO updateDO, Long id);

        public Integer updateAllFieldsById(UserDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<UserDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,UserDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default UserDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<UserDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInId(Collection<Long> idList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(UserDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(UserDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<UserDO> listByUserAccount(String userAccount, String... fieldNames);

        public Map<Long,UserDO> mapByUserAccount(String userAccount, String... fieldNames);

        public Integer countByUserAccount(String userAccount);

        public default UserDO singleResultByUserAccount(String userAccount,String... fieldNames){
             List<UserDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserAccount(String userAccount, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(UserDO updateDO, String userAccount);

        public Integer updateAllFieldsByUserAccount(UserDO updateDO,  String userAccount);

        public Integer deleteByUserAccount( String userAccount);






        public List<UserDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Integer countByInUserAccount(Collection<String> userAccountList);

         public default UserDO singleResultByInUserAccount(Collection<String> userAccountList,String... fieldNames){
              List<UserDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserAccount(UserDO updateDO, Collection<String> userAccountList);

         public Integer updateAllFieldsByInUserAccount(UserDO updateDO,  Collection<String> userAccountList);

         public Integer deleteByInUserAccount( Collection<String> userAccountList);
        public List<UserDO> listByUserPassword(String userPassword, String... fieldNames);

        public Map<Long,UserDO> mapByUserPassword(String userPassword, String... fieldNames);

        public Integer countByUserPassword(String userPassword);

        public default UserDO singleResultByUserPassword(String userPassword,String... fieldNames){
             List<UserDO> list=this.listByUserPassword(userPassword,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserPassword(String userPassword, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserPassword(userPassword,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPassword(UserDO updateDO, String userPassword);

        public Integer updateAllFieldsByUserPassword(UserDO updateDO,  String userPassword);

        public Integer deleteByUserPassword( String userPassword);






        public List<UserDO> listByInUserPassword(Collection<String> userPasswordList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserPassword(Collection<String> userPasswordList, String... fieldNames);

         public Integer countByInUserPassword(Collection<String> userPasswordList);

         public default UserDO singleResultByInUserPassword(Collection<String> userPasswordList,String... fieldNames){
              List<UserDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserPassword(Collection<String> userPasswordList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserPassword(UserDO updateDO, Collection<String> userPasswordList);

         public Integer updateAllFieldsByInUserPassword(UserDO updateDO,  Collection<String> userPasswordList);

         public Integer deleteByInUserPassword( Collection<String> userPasswordList);
        public List<UserDO> listByUpdatePasswordTime(java.util.Date updatePasswordTime, String... fieldNames);

        public Map<Long,UserDO> mapByUpdatePasswordTime(java.util.Date updatePasswordTime, String... fieldNames);

        public Integer countByUpdatePasswordTime(java.util.Date updatePasswordTime);

        public default UserDO singleResultByUpdatePasswordTime(java.util.Date updatePasswordTime,String... fieldNames){
             List<UserDO> list=this.listByUpdatePasswordTime(updatePasswordTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUpdatePasswordTime(java.util.Date updatePasswordTime, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUpdatePasswordTime(updatePasswordTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUpdatePasswordTime(UserDO updateDO, java.util.Date updatePasswordTime);

        public Integer updateAllFieldsByUpdatePasswordTime(UserDO updateDO,  java.util.Date updatePasswordTime);

        public Integer deleteByUpdatePasswordTime( java.util.Date updatePasswordTime);






        public List<UserDO> listByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList, String... fieldNames);

         public Map<Long,UserDO> mapByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList, String... fieldNames);

         public Integer countByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList);

         public default UserDO singleResultByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList,String... fieldNames){
              List<UserDO> list=this.listByInUpdatePasswordTime(updatePasswordTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUpdatePasswordTime(Collection<java.util.Date> updatePasswordTimeList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUpdatePasswordTime(updatePasswordTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUpdatePasswordTime(UserDO updateDO, Collection<java.util.Date> updatePasswordTimeList);

         public Integer updateAllFieldsByInUpdatePasswordTime(UserDO updateDO,  Collection<java.util.Date> updatePasswordTimeList);

         public Integer deleteByInUpdatePasswordTime( Collection<java.util.Date> updatePasswordTimeList);
        public List<UserDO> listByUserName(String userName, String... fieldNames);

        public Map<Long,UserDO> mapByUserName(String userName, String... fieldNames);

        public Integer countByUserName(String userName);

        public default UserDO singleResultByUserName(String userName,String... fieldNames){
             List<UserDO> list=this.listByUserName(userName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserName(String userName, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserName(userName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserName(UserDO updateDO, String userName);

        public Integer updateAllFieldsByUserName(UserDO updateDO,  String userName);

        public Integer deleteByUserName( String userName);






        public List<UserDO> listByInUserName(Collection<String> userNameList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserName(Collection<String> userNameList, String... fieldNames);

         public Integer countByInUserName(Collection<String> userNameList);

         public default UserDO singleResultByInUserName(Collection<String> userNameList,String... fieldNames){
              List<UserDO> list=this.listByInUserName(userNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserName(Collection<String> userNameList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserName(userNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserName(UserDO updateDO, Collection<String> userNameList);

         public Integer updateAllFieldsByInUserName(UserDO updateDO,  Collection<String> userNameList);

         public Integer deleteByInUserName( Collection<String> userNameList);
        public List<UserDO> listByMobileNo(String mobileNo, String... fieldNames);

        public Map<Long,UserDO> mapByMobileNo(String mobileNo, String... fieldNames);

        public Integer countByMobileNo(String mobileNo);

        public default UserDO singleResultByMobileNo(String mobileNo,String... fieldNames){
             List<UserDO> list=this.listByMobileNo(mobileNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByMobileNo(String mobileNo, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByMobileNo(mobileNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMobileNo(UserDO updateDO, String mobileNo);

        public Integer updateAllFieldsByMobileNo(UserDO updateDO,  String mobileNo);

        public Integer deleteByMobileNo( String mobileNo);






        public List<UserDO> listByInMobileNo(Collection<String> mobileNoList, String... fieldNames);

         public Map<Long,UserDO> mapByInMobileNo(Collection<String> mobileNoList, String... fieldNames);

         public Integer countByInMobileNo(Collection<String> mobileNoList);

         public default UserDO singleResultByInMobileNo(Collection<String> mobileNoList,String... fieldNames){
              List<UserDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInMobileNo(Collection<String> mobileNoList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMobileNo(UserDO updateDO, Collection<String> mobileNoList);

         public Integer updateAllFieldsByInMobileNo(UserDO updateDO,  Collection<String> mobileNoList);

         public Integer deleteByInMobileNo( Collection<String> mobileNoList);
        public List<UserDO> listByEmail(String email, String... fieldNames);

        public Map<Long,UserDO> mapByEmail(String email, String... fieldNames);

        public Integer countByEmail(String email);

        public default UserDO singleResultByEmail(String email,String... fieldNames){
             List<UserDO> list=this.listByEmail(email,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByEmail(String email, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByEmail(email,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEmail(UserDO updateDO, String email);

        public Integer updateAllFieldsByEmail(UserDO updateDO,  String email);

        public Integer deleteByEmail( String email);






        public List<UserDO> listByInEmail(Collection<String> emailList, String... fieldNames);

         public Map<Long,UserDO> mapByInEmail(Collection<String> emailList, String... fieldNames);

         public Integer countByInEmail(Collection<String> emailList);

         public default UserDO singleResultByInEmail(Collection<String> emailList,String... fieldNames){
              List<UserDO> list=this.listByInEmail(emailList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInEmail(Collection<String> emailList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInEmail(emailList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEmail(UserDO updateDO, Collection<String> emailList);

         public Integer updateAllFieldsByInEmail(UserDO updateDO,  Collection<String> emailList);

         public Integer deleteByInEmail( Collection<String> emailList);
        public List<UserDO> listByJob(String job, String... fieldNames);

        public Map<Long,UserDO> mapByJob(String job, String... fieldNames);

        public Integer countByJob(String job);

        public default UserDO singleResultByJob(String job,String... fieldNames){
             List<UserDO> list=this.listByJob(job,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByJob(String job, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByJob(job,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByJob(UserDO updateDO, String job);

        public Integer updateAllFieldsByJob(UserDO updateDO,  String job);

        public Integer deleteByJob( String job);






        public List<UserDO> listByInJob(Collection<String> jobList, String... fieldNames);

         public Map<Long,UserDO> mapByInJob(Collection<String> jobList, String... fieldNames);

         public Integer countByInJob(Collection<String> jobList);

         public default UserDO singleResultByInJob(Collection<String> jobList,String... fieldNames){
              List<UserDO> list=this.listByInJob(jobList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInJob(Collection<String> jobList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInJob(jobList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInJob(UserDO updateDO, Collection<String> jobList);

         public Integer updateAllFieldsByInJob(UserDO updateDO,  Collection<String> jobList);

         public Integer deleteByInJob( Collection<String> jobList);
        public List<UserDO> listByBirthday(java.util.Date birthday, String... fieldNames);

        public Map<Long,UserDO> mapByBirthday(java.util.Date birthday, String... fieldNames);

        public Integer countByBirthday(java.util.Date birthday);

        public default UserDO singleResultByBirthday(java.util.Date birthday,String... fieldNames){
             List<UserDO> list=this.listByBirthday(birthday,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByBirthday(java.util.Date birthday, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByBirthday(birthday,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBirthday(UserDO updateDO, java.util.Date birthday);

        public Integer updateAllFieldsByBirthday(UserDO updateDO,  java.util.Date birthday);

        public Integer deleteByBirthday( java.util.Date birthday);






        public List<UserDO> listByInBirthday(Collection<java.util.Date> birthdayList, String... fieldNames);

         public Map<Long,UserDO> mapByInBirthday(Collection<java.util.Date> birthdayList, String... fieldNames);

         public Integer countByInBirthday(Collection<java.util.Date> birthdayList);

         public default UserDO singleResultByInBirthday(Collection<java.util.Date> birthdayList,String... fieldNames){
              List<UserDO> list=this.listByInBirthday(birthdayList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInBirthday(Collection<java.util.Date> birthdayList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInBirthday(birthdayList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInBirthday(UserDO updateDO, Collection<java.util.Date> birthdayList);

         public Integer updateAllFieldsByInBirthday(UserDO updateDO,  Collection<java.util.Date> birthdayList);

         public Integer deleteByInBirthday( Collection<java.util.Date> birthdayList);
        public List<UserDO> listByUserPhoto(Long userPhoto, String... fieldNames);

        public Map<Long,UserDO> mapByUserPhoto(Long userPhoto, String... fieldNames);

        public Integer countByUserPhoto(Long userPhoto);

        public default UserDO singleResultByUserPhoto(Long userPhoto,String... fieldNames){
             List<UserDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserPhoto(Long userPhoto, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPhoto(UserDO updateDO, Long userPhoto);

        public Integer updateAllFieldsByUserPhoto(UserDO updateDO,  Long userPhoto);

        public Integer deleteByUserPhoto( Long userPhoto);






        public List<UserDO> listByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames);

         public Integer countByInUserPhoto(Collection<Long> userPhotoList);

         public default UserDO singleResultByInUserPhoto(Collection<Long> userPhotoList,String... fieldNames){
              List<UserDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserPhoto(Collection<Long> userPhotoList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserPhoto(UserDO updateDO, Collection<Long> userPhotoList);

         public Integer updateAllFieldsByInUserPhoto(UserDO updateDO,  Collection<Long> userPhotoList);

         public Integer deleteByInUserPhoto( Collection<Long> userPhotoList);
        public List<UserDO> listByIdCardNo(String idCardNo, String... fieldNames);

        public Map<Long,UserDO> mapByIdCardNo(String idCardNo, String... fieldNames);

        public Integer countByIdCardNo(String idCardNo);

        public default UserDO singleResultByIdCardNo(String idCardNo,String... fieldNames){
             List<UserDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByIdCardNo(String idCardNo, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIdCardNo(UserDO updateDO, String idCardNo);

        public Integer updateAllFieldsByIdCardNo(UserDO updateDO,  String idCardNo);

        public Integer deleteByIdCardNo( String idCardNo);






        public List<UserDO> listByInIdCardNo(Collection<String> idCardNoList, String... fieldNames);

         public Map<Long,UserDO> mapByInIdCardNo(Collection<String> idCardNoList, String... fieldNames);

         public Integer countByInIdCardNo(Collection<String> idCardNoList);

         public default UserDO singleResultByInIdCardNo(Collection<String> idCardNoList,String... fieldNames){
              List<UserDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInIdCardNo(Collection<String> idCardNoList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInIdCardNo(UserDO updateDO, Collection<String> idCardNoList);

         public Integer updateAllFieldsByInIdCardNo(UserDO updateDO,  Collection<String> idCardNoList);

         public Integer deleteByInIdCardNo( Collection<String> idCardNoList);
        public List<UserDO> listByGender(Integer gender, String... fieldNames);

        public Map<Long,UserDO> mapByGender(Integer gender, String... fieldNames);

        public Integer countByGender(Integer gender);

        public default UserDO singleResultByGender(Integer gender,String... fieldNames){
             List<UserDO> list=this.listByGender(gender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByGender(Integer gender, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByGender(gender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByGender(UserDO updateDO, Integer gender);

        public Integer updateAllFieldsByGender(UserDO updateDO,  Integer gender);

        public Integer deleteByGender( Integer gender);






        public List<UserDO> listByInGender(Collection<Integer> genderList, String... fieldNames);

         public Map<Long,UserDO> mapByInGender(Collection<Integer> genderList, String... fieldNames);

         public Integer countByInGender(Collection<Integer> genderList);

         public default UserDO singleResultByInGender(Collection<Integer> genderList,String... fieldNames){
              List<UserDO> list=this.listByInGender(genderList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInGender(Collection<Integer> genderList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInGender(genderList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInGender(UserDO updateDO, Collection<Integer> genderList);

         public Integer updateAllFieldsByInGender(UserDO updateDO,  Collection<Integer> genderList);

         public Integer deleteByInGender( Collection<Integer> genderList);
        public List<UserDO> listByDeptId(Long deptId, String... fieldNames);

        public Map<Long,UserDO> mapByDeptId(Long deptId, String... fieldNames);

        public Integer countByDeptId(Long deptId);

        public default UserDO singleResultByDeptId(Long deptId,String... fieldNames){
             List<UserDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByDeptId(Long deptId, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(UserDO updateDO, Long deptId);

        public Integer updateAllFieldsByDeptId(UserDO updateDO,  Long deptId);

        public Integer deleteByDeptId( Long deptId);






        public List<UserDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Map<Long,UserDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Integer countByInDeptId(Collection<Long> deptIdList);

         public default UserDO singleResultByInDeptId(Collection<Long> deptIdList,String... fieldNames){
              List<UserDO> list=this.listByInDeptId(deptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInDeptId(deptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptId(UserDO updateDO, Collection<Long> deptIdList);

         public Integer updateAllFieldsByInDeptId(UserDO updateDO,  Collection<Long> deptIdList);

         public Integer deleteByInDeptId( Collection<Long> deptIdList);
        public List<UserDO> listByAddress(String address, String... fieldNames);

        public Map<Long,UserDO> mapByAddress(String address, String... fieldNames);

        public Integer countByAddress(String address);

        public default UserDO singleResultByAddress(String address,String... fieldNames){
             List<UserDO> list=this.listByAddress(address,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByAddress(String address, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByAddress(address,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAddress(UserDO updateDO, String address);

        public Integer updateAllFieldsByAddress(UserDO updateDO,  String address);

        public Integer deleteByAddress( String address);






        public List<UserDO> listByInAddress(Collection<String> addressList, String... fieldNames);

         public Map<Long,UserDO> mapByInAddress(Collection<String> addressList, String... fieldNames);

         public Integer countByInAddress(Collection<String> addressList);

         public default UserDO singleResultByInAddress(Collection<String> addressList,String... fieldNames){
              List<UserDO> list=this.listByInAddress(addressList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInAddress(Collection<String> addressList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInAddress(addressList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAddress(UserDO updateDO, Collection<String> addressList);

         public Integer updateAllFieldsByInAddress(UserDO updateDO,  Collection<String> addressList);

         public Integer deleteByInAddress( Collection<String> addressList);
        public List<UserDO> listByLocked(Integer locked, String... fieldNames);

        public Map<Long,UserDO> mapByLocked(Integer locked, String... fieldNames);

        public Integer countByLocked(Integer locked);

        public default UserDO singleResultByLocked(Integer locked,String... fieldNames){
             List<UserDO> list=this.listByLocked(locked,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLocked(Integer locked, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByLocked(locked,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLocked(UserDO updateDO, Integer locked);

        public Integer updateAllFieldsByLocked(UserDO updateDO,  Integer locked);

        public Integer deleteByLocked( Integer locked);






        public List<UserDO> listByInLocked(Collection<Integer> lockedList, String... fieldNames);

         public Map<Long,UserDO> mapByInLocked(Collection<Integer> lockedList, String... fieldNames);

         public Integer countByInLocked(Collection<Integer> lockedList);

         public default UserDO singleResultByInLocked(Collection<Integer> lockedList,String... fieldNames){
              List<UserDO> list=this.listByInLocked(lockedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInLocked(Collection<Integer> lockedList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInLocked(lockedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLocked(UserDO updateDO, Collection<Integer> lockedList);

         public Integer updateAllFieldsByInLocked(UserDO updateDO,  Collection<Integer> lockedList);

         public Integer deleteByInLocked( Collection<Integer> lockedList);
        public List<UserDO> listByLockedTime(java.util.Date lockedTime, String... fieldNames);

        public Map<Long,UserDO> mapByLockedTime(java.util.Date lockedTime, String... fieldNames);

        public Integer countByLockedTime(java.util.Date lockedTime);

        public default UserDO singleResultByLockedTime(java.util.Date lockedTime,String... fieldNames){
             List<UserDO> list=this.listByLockedTime(lockedTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLockedTime(java.util.Date lockedTime, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByLockedTime(lockedTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLockedTime(UserDO updateDO, java.util.Date lockedTime);

        public Integer updateAllFieldsByLockedTime(UserDO updateDO,  java.util.Date lockedTime);

        public Integer deleteByLockedTime( java.util.Date lockedTime);






        public List<UserDO> listByInLockedTime(Collection<java.util.Date> lockedTimeList, String... fieldNames);

         public Map<Long,UserDO> mapByInLockedTime(Collection<java.util.Date> lockedTimeList, String... fieldNames);

         public Integer countByInLockedTime(Collection<java.util.Date> lockedTimeList);

         public default UserDO singleResultByInLockedTime(Collection<java.util.Date> lockedTimeList,String... fieldNames){
              List<UserDO> list=this.listByInLockedTime(lockedTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInLockedTime(Collection<java.util.Date> lockedTimeList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInLockedTime(lockedTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLockedTime(UserDO updateDO, Collection<java.util.Date> lockedTimeList);

         public Integer updateAllFieldsByInLockedTime(UserDO updateDO,  Collection<java.util.Date> lockedTimeList);

         public Integer deleteByInLockedTime( Collection<java.util.Date> lockedTimeList);
        public List<UserDO> listByEnabled(Integer enabled, String... fieldNames);

        public Map<Long,UserDO> mapByEnabled(Integer enabled, String... fieldNames);

        public Integer countByEnabled(Integer enabled);

        public default UserDO singleResultByEnabled(Integer enabled,String... fieldNames){
             List<UserDO> list=this.listByEnabled(enabled,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByEnabled(Integer enabled, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByEnabled(enabled,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEnabled(UserDO updateDO, Integer enabled);

        public Integer updateAllFieldsByEnabled(UserDO updateDO,  Integer enabled);

        public Integer deleteByEnabled( Integer enabled);






        public List<UserDO> listByInEnabled(Collection<Integer> enabledList, String... fieldNames);

         public Map<Long,UserDO> mapByInEnabled(Collection<Integer> enabledList, String... fieldNames);

         public Integer countByInEnabled(Collection<Integer> enabledList);

         public default UserDO singleResultByInEnabled(Collection<Integer> enabledList,String... fieldNames){
              List<UserDO> list=this.listByInEnabled(enabledList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInEnabled(Collection<Integer> enabledList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInEnabled(enabledList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEnabled(UserDO updateDO, Collection<Integer> enabledList);

         public Integer updateAllFieldsByInEnabled(UserDO updateDO,  Collection<Integer> enabledList);

         public Integer deleteByInEnabled( Collection<Integer> enabledList);
        public List<UserDO> listByExpired(Integer expired, String... fieldNames);

        public Map<Long,UserDO> mapByExpired(Integer expired, String... fieldNames);

        public Integer countByExpired(Integer expired);

        public default UserDO singleResultByExpired(Integer expired,String... fieldNames){
             List<UserDO> list=this.listByExpired(expired,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByExpired(Integer expired, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByExpired(expired,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExpired(UserDO updateDO, Integer expired);

        public Integer updateAllFieldsByExpired(UserDO updateDO,  Integer expired);

        public Integer deleteByExpired( Integer expired);






        public List<UserDO> listByInExpired(Collection<Integer> expiredList, String... fieldNames);

         public Map<Long,UserDO> mapByInExpired(Collection<Integer> expiredList, String... fieldNames);

         public Integer countByInExpired(Collection<Integer> expiredList);

         public default UserDO singleResultByInExpired(Collection<Integer> expiredList,String... fieldNames){
              List<UserDO> list=this.listByInExpired(expiredList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInExpired(Collection<Integer> expiredList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInExpired(expiredList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInExpired(UserDO updateDO, Collection<Integer> expiredList);

         public Integer updateAllFieldsByInExpired(UserDO updateDO,  Collection<Integer> expiredList);

         public Integer deleteByInExpired( Collection<Integer> expiredList);
        public List<UserDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserDO singleResultByUserIdCreate(Long userIdCreate,String... fieldNames){
             List<UserDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserDO updateDO,  Long userIdCreate);

        public Integer deleteByUserIdCreate( Long userIdCreate);






        public List<UserDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList,String... fieldNames){
              List<UserDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserDO updateDO,  Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList);
        public List<UserDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserDO singleResultByUserIdModified(Long userIdModified,String... fieldNames){
             List<UserDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByUserIdModified(Long userIdModified, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserDO updateDO,  Long userIdModified);

        public Integer deleteByUserIdModified( Long userIdModified);






        public List<UserDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList,String... fieldNames){
              List<UserDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserDO updateDO,  Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList);
        public List<UserDO> listByLeaderId(Long leaderId, String... fieldNames);

        public Map<Long,UserDO> mapByLeaderId(Long leaderId, String... fieldNames);

        public Integer countByLeaderId(Long leaderId);

        public default UserDO singleResultByLeaderId(Long leaderId,String... fieldNames){
             List<UserDO> list=this.listByLeaderId(leaderId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserDO>> groupingByLeaderId(Long leaderId, Function<UserDO, T> mapper, String... fieldNames){
             List<UserDO> list=this.listByLeaderId(leaderId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLeaderId(UserDO updateDO, Long leaderId);

        public Integer updateAllFieldsByLeaderId(UserDO updateDO,  Long leaderId);

        public Integer deleteByLeaderId( Long leaderId);






        public List<UserDO> listByInLeaderId(Collection<Long> leaderIdList, String... fieldNames);

         public Map<Long,UserDO> mapByInLeaderId(Collection<Long> leaderIdList, String... fieldNames);

         public Integer countByInLeaderId(Collection<Long> leaderIdList);

         public default UserDO singleResultByInLeaderId(Collection<Long> leaderIdList,String... fieldNames){
              List<UserDO> list=this.listByInLeaderId(leaderIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserDO>> groupingByInLeaderId(Collection<Long> leaderIdList, Function<UserDO, T> mapper, String... fieldNames){
              List<UserDO> list=this.listByInLeaderId(leaderIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLeaderId(UserDO updateDO, Collection<Long> leaderIdList);

         public Integer updateAllFieldsByInLeaderId(UserDO updateDO,  Collection<Long> leaderIdList);

         public Integer deleteByInLeaderId( Collection<Long> leaderIdList);


}

