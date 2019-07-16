package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.UserRegisterDO;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableUserRegisterDaoManager extends CommonDaoManager<UserRegisterDO,Long> {


        public List<UserRegisterDO> listByBusId(String busId, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByBusId(String busId, String... fieldNames);

        public Integer countByBusId(String busId);

        public default UserRegisterDO singleResultByBusId(String busId, String... fieldNames){
             List<UserRegisterDO> list=this.listByBusId(busId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByBusId(String busId, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByBusId(busId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBusId(UserRegisterDO updateDO, String busId);

        public Integer updateAllFieldsByBusId(UserRegisterDO updateDO, String busId);

        public Integer deleteByBusId(String busId);






        public List<UserRegisterDO> listByInBusId(Collection<String> busIdList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInBusId(Collection<String> busIdList, String... fieldNames);

         public Integer countByInBusId(Collection<String> busIdList);

         public default UserRegisterDO singleResultByInBusId(Collection<String> busIdList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInBusId(busIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInBusId(Collection<String> busIdList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInBusId(busIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInBusId(UserRegisterDO updateDO, Collection<String> busIdList);

         public Integer updateAllFieldsByInBusId(UserRegisterDO updateDO, Collection<String> busIdList);

         public Integer deleteByInBusId(Collection<String> busIdList);
        public List<UserRegisterDO> listByUserAccount(String userAccount, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserAccount(String userAccount, String... fieldNames);

        public Integer countByUserAccount(String userAccount);

        public default UserRegisterDO singleResultByUserAccount(String userAccount, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserAccount(String userAccount, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(UserRegisterDO updateDO, String userAccount);

        public Integer updateAllFieldsByUserAccount(UserRegisterDO updateDO, String userAccount);

        public Integer deleteByUserAccount(String userAccount);






        public List<UserRegisterDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Integer countByInUserAccount(Collection<String> userAccountList);

         public default UserRegisterDO singleResultByInUserAccount(Collection<String> userAccountList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserAccount(UserRegisterDO updateDO, Collection<String> userAccountList);

         public Integer updateAllFieldsByInUserAccount(UserRegisterDO updateDO, Collection<String> userAccountList);

         public Integer deleteByInUserAccount(Collection<String> userAccountList);
        public List<UserRegisterDO> listByUserPassword(String userPassword, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserPassword(String userPassword, String... fieldNames);

        public Integer countByUserPassword(String userPassword);

        public default UserRegisterDO singleResultByUserPassword(String userPassword, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserPassword(userPassword,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserPassword(String userPassword, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserPassword(userPassword,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPassword(UserRegisterDO updateDO, String userPassword);

        public Integer updateAllFieldsByUserPassword(UserRegisterDO updateDO, String userPassword);

        public Integer deleteByUserPassword(String userPassword);






        public List<UserRegisterDO> listByInUserPassword(Collection<String> userPasswordList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserPassword(Collection<String> userPasswordList, String... fieldNames);

         public Integer countByInUserPassword(Collection<String> userPasswordList);

         public default UserRegisterDO singleResultByInUserPassword(Collection<String> userPasswordList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserPassword(Collection<String> userPasswordList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserPassword(userPasswordList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserPassword(UserRegisterDO updateDO, Collection<String> userPasswordList);

         public Integer updateAllFieldsByInUserPassword(UserRegisterDO updateDO, Collection<String> userPasswordList);

         public Integer deleteByInUserPassword(Collection<String> userPasswordList);
        public List<UserRegisterDO> listByUserName(String userName, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserName(String userName, String... fieldNames);

        public Integer countByUserName(String userName);

        public default UserRegisterDO singleResultByUserName(String userName, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserName(userName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserName(String userName, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserName(userName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserName(UserRegisterDO updateDO, String userName);

        public Integer updateAllFieldsByUserName(UserRegisterDO updateDO, String userName);

        public Integer deleteByUserName(String userName);






        public List<UserRegisterDO> listByInUserName(Collection<String> userNameList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserName(Collection<String> userNameList, String... fieldNames);

         public Integer countByInUserName(Collection<String> userNameList);

         public default UserRegisterDO singleResultByInUserName(Collection<String> userNameList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserName(userNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserName(Collection<String> userNameList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserName(userNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserName(UserRegisterDO updateDO, Collection<String> userNameList);

         public Integer updateAllFieldsByInUserName(UserRegisterDO updateDO, Collection<String> userNameList);

         public Integer deleteByInUserName(Collection<String> userNameList);
        public List<UserRegisterDO> listByMobileNo(String mobileNo, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByMobileNo(String mobileNo, String... fieldNames);

        public Integer countByMobileNo(String mobileNo);

        public default UserRegisterDO singleResultByMobileNo(String mobileNo, String... fieldNames){
             List<UserRegisterDO> list=this.listByMobileNo(mobileNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByMobileNo(String mobileNo, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByMobileNo(mobileNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMobileNo(UserRegisterDO updateDO, String mobileNo);

        public Integer updateAllFieldsByMobileNo(UserRegisterDO updateDO, String mobileNo);

        public Integer deleteByMobileNo(String mobileNo);






        public List<UserRegisterDO> listByInMobileNo(Collection<String> mobileNoList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInMobileNo(Collection<String> mobileNoList, String... fieldNames);

         public Integer countByInMobileNo(Collection<String> mobileNoList);

         public default UserRegisterDO singleResultByInMobileNo(Collection<String> mobileNoList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInMobileNo(Collection<String> mobileNoList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInMobileNo(mobileNoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMobileNo(UserRegisterDO updateDO, Collection<String> mobileNoList);

         public Integer updateAllFieldsByInMobileNo(UserRegisterDO updateDO, Collection<String> mobileNoList);

         public Integer deleteByInMobileNo(Collection<String> mobileNoList);
        public List<UserRegisterDO> listByEmail(String email, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByEmail(String email, String... fieldNames);

        public Integer countByEmail(String email);

        public default UserRegisterDO singleResultByEmail(String email, String... fieldNames){
             List<UserRegisterDO> list=this.listByEmail(email,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByEmail(String email, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByEmail(email,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEmail(UserRegisterDO updateDO, String email);

        public Integer updateAllFieldsByEmail(UserRegisterDO updateDO, String email);

        public Integer deleteByEmail(String email);






        public List<UserRegisterDO> listByInEmail(Collection<String> emailList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInEmail(Collection<String> emailList, String... fieldNames);

         public Integer countByInEmail(Collection<String> emailList);

         public default UserRegisterDO singleResultByInEmail(Collection<String> emailList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInEmail(emailList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInEmail(Collection<String> emailList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInEmail(emailList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEmail(UserRegisterDO updateDO, Collection<String> emailList);

         public Integer updateAllFieldsByInEmail(UserRegisterDO updateDO, Collection<String> emailList);

         public Integer deleteByInEmail(Collection<String> emailList);
        public List<UserRegisterDO> listByJob(String job, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByJob(String job, String... fieldNames);

        public Integer countByJob(String job);

        public default UserRegisterDO singleResultByJob(String job, String... fieldNames){
             List<UserRegisterDO> list=this.listByJob(job,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByJob(String job, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByJob(job,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByJob(UserRegisterDO updateDO, String job);

        public Integer updateAllFieldsByJob(UserRegisterDO updateDO, String job);

        public Integer deleteByJob(String job);






        public List<UserRegisterDO> listByInJob(Collection<String> jobList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInJob(Collection<String> jobList, String... fieldNames);

         public Integer countByInJob(Collection<String> jobList);

         public default UserRegisterDO singleResultByInJob(Collection<String> jobList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInJob(jobList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInJob(Collection<String> jobList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInJob(jobList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInJob(UserRegisterDO updateDO, Collection<String> jobList);

         public Integer updateAllFieldsByInJob(UserRegisterDO updateDO, Collection<String> jobList);

         public Integer deleteByInJob(Collection<String> jobList);
        public List<UserRegisterDO> listByBirthday(Date birthday, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByBirthday(Date birthday, String... fieldNames);

        public Integer countByBirthday(Date birthday);

        public default UserRegisterDO singleResultByBirthday(Date birthday, String... fieldNames){
             List<UserRegisterDO> list=this.listByBirthday(birthday,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByBirthday(Date birthday, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByBirthday(birthday,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByBirthday(UserRegisterDO updateDO, Date birthday);

        public Integer updateAllFieldsByBirthday(UserRegisterDO updateDO, Date birthday);

        public Integer deleteByBirthday(Date birthday);






        public List<UserRegisterDO> listByInBirthday(Collection<Date> birthdayList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInBirthday(Collection<Date> birthdayList, String... fieldNames);

         public Integer countByInBirthday(Collection<Date> birthdayList);

         public default UserRegisterDO singleResultByInBirthday(Collection<Date> birthdayList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInBirthday(birthdayList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInBirthday(Collection<Date> birthdayList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInBirthday(birthdayList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInBirthday(UserRegisterDO updateDO, Collection<Date> birthdayList);

         public Integer updateAllFieldsByInBirthday(UserRegisterDO updateDO, Collection<Date> birthdayList);

         public Integer deleteByInBirthday(Collection<Date> birthdayList);
        public List<UserRegisterDO> listByUserPhoto(Long userPhoto, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserPhoto(Long userPhoto, String... fieldNames);

        public Integer countByUserPhoto(Long userPhoto);

        public default UserRegisterDO singleResultByUserPhoto(Long userPhoto, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserPhoto(Long userPhoto, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserPhoto(userPhoto,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserPhoto(UserRegisterDO updateDO, Long userPhoto);

        public Integer updateAllFieldsByUserPhoto(UserRegisterDO updateDO, Long userPhoto);

        public Integer deleteByUserPhoto(Long userPhoto);






        public List<UserRegisterDO> listByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames);

         public Integer countByInUserPhoto(Collection<Long> userPhotoList);

         public default UserRegisterDO singleResultByInUserPhoto(Collection<Long> userPhotoList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserPhoto(Collection<Long> userPhotoList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserPhoto(userPhotoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserPhoto(UserRegisterDO updateDO, Collection<Long> userPhotoList);

         public Integer updateAllFieldsByInUserPhoto(UserRegisterDO updateDO, Collection<Long> userPhotoList);

         public Integer deleteByInUserPhoto(Collection<Long> userPhotoList);
        public List<UserRegisterDO> listByIdCardNo(String idCardNo, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByIdCardNo(String idCardNo, String... fieldNames);

        public Integer countByIdCardNo(String idCardNo);

        public default UserRegisterDO singleResultByIdCardNo(String idCardNo, String... fieldNames){
             List<UserRegisterDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByIdCardNo(String idCardNo, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByIdCardNo(idCardNo,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIdCardNo(UserRegisterDO updateDO, String idCardNo);

        public Integer updateAllFieldsByIdCardNo(UserRegisterDO updateDO, String idCardNo);

        public Integer deleteByIdCardNo(String idCardNo);






        public List<UserRegisterDO> listByInIdCardNo(Collection<String> idCardNoList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInIdCardNo(Collection<String> idCardNoList, String... fieldNames);

         public Integer countByInIdCardNo(Collection<String> idCardNoList);

         public default UserRegisterDO singleResultByInIdCardNo(Collection<String> idCardNoList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInIdCardNo(Collection<String> idCardNoList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInIdCardNo(idCardNoList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInIdCardNo(UserRegisterDO updateDO, Collection<String> idCardNoList);

         public Integer updateAllFieldsByInIdCardNo(UserRegisterDO updateDO, Collection<String> idCardNoList);

         public Integer deleteByInIdCardNo(Collection<String> idCardNoList);
        public List<UserRegisterDO> listByGender(Integer gender, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByGender(Integer gender, String... fieldNames);

        public Integer countByGender(Integer gender);

        public default UserRegisterDO singleResultByGender(Integer gender, String... fieldNames){
             List<UserRegisterDO> list=this.listByGender(gender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByGender(Integer gender, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByGender(gender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByGender(UserRegisterDO updateDO, Integer gender);

        public Integer updateAllFieldsByGender(UserRegisterDO updateDO, Integer gender);

        public Integer deleteByGender(Integer gender);






        public List<UserRegisterDO> listByInGender(Collection<Integer> genderList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInGender(Collection<Integer> genderList, String... fieldNames);

         public Integer countByInGender(Collection<Integer> genderList);

         public default UserRegisterDO singleResultByInGender(Collection<Integer> genderList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInGender(genderList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInGender(Collection<Integer> genderList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInGender(genderList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInGender(UserRegisterDO updateDO, Collection<Integer> genderList);

         public Integer updateAllFieldsByInGender(UserRegisterDO updateDO, Collection<Integer> genderList);

         public Integer deleteByInGender(Collection<Integer> genderList);
        public List<UserRegisterDO> listByDeptId(Long deptId, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByDeptId(Long deptId, String... fieldNames);

        public Integer countByDeptId(Long deptId);

        public default UserRegisterDO singleResultByDeptId(Long deptId, String... fieldNames){
             List<UserRegisterDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByDeptId(Long deptId, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(UserRegisterDO updateDO, Long deptId);

        public Integer updateAllFieldsByDeptId(UserRegisterDO updateDO, Long deptId);

        public Integer deleteByDeptId(Long deptId);






        public List<UserRegisterDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Integer countByInDeptId(Collection<Long> deptIdList);

         public default UserRegisterDO singleResultByInDeptId(Collection<Long> deptIdList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInDeptId(deptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInDeptId(deptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptId(UserRegisterDO updateDO, Collection<Long> deptIdList);

         public Integer updateAllFieldsByInDeptId(UserRegisterDO updateDO, Collection<Long> deptIdList);

         public Integer deleteByInDeptId(Collection<Long> deptIdList);
        public List<UserRegisterDO> listByExamineStatus(Integer examineStatus, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByExamineStatus(Integer examineStatus, String... fieldNames);

        public Integer countByExamineStatus(Integer examineStatus);

        public default UserRegisterDO singleResultByExamineStatus(Integer examineStatus, String... fieldNames){
             List<UserRegisterDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByExamineStatus(Integer examineStatus, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineStatus(UserRegisterDO updateDO, Integer examineStatus);

        public Integer updateAllFieldsByExamineStatus(UserRegisterDO updateDO, Integer examineStatus);

        public Integer deleteByExamineStatus(Integer examineStatus);






        public List<UserRegisterDO> listByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames);

         public Integer countByInExamineStatus(Collection<Integer> examineStatusList);

         public default UserRegisterDO singleResultByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInExamineStatus(Collection<Integer> examineStatusList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInExamineStatus(UserRegisterDO updateDO, Collection<Integer> examineStatusList);

         public Integer updateAllFieldsByInExamineStatus(UserRegisterDO updateDO, Collection<Integer> examineStatusList);

         public Integer deleteByInExamineStatus(Collection<Integer> examineStatusList);
        public List<UserRegisterDO> listByExamineUserId(Long examineUserId, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByExamineUserId(Long examineUserId, String... fieldNames);

        public Integer countByExamineUserId(Long examineUserId);

        public default UserRegisterDO singleResultByExamineUserId(Long examineUserId, String... fieldNames){
             List<UserRegisterDO> list=this.listByExamineUserId(examineUserId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByExamineUserId(Long examineUserId, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByExamineUserId(examineUserId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineUserId(UserRegisterDO updateDO, Long examineUserId);

        public Integer updateAllFieldsByExamineUserId(UserRegisterDO updateDO, Long examineUserId);

        public Integer deleteByExamineUserId(Long examineUserId);






        public List<UserRegisterDO> listByInExamineUserId(Collection<Long> examineUserIdList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInExamineUserId(Collection<Long> examineUserIdList, String... fieldNames);

         public Integer countByInExamineUserId(Collection<Long> examineUserIdList);

         public default UserRegisterDO singleResultByInExamineUserId(Collection<Long> examineUserIdList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInExamineUserId(examineUserIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInExamineUserId(Collection<Long> examineUserIdList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInExamineUserId(examineUserIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInExamineUserId(UserRegisterDO updateDO, Collection<Long> examineUserIdList);

         public Integer updateAllFieldsByInExamineUserId(UserRegisterDO updateDO, Collection<Long> examineUserIdList);

         public Integer deleteByInExamineUserId(Collection<Long> examineUserIdList);
        public List<UserRegisterDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Integer countByTeamTypeCode(String teamTypeCode);

        public default UserRegisterDO singleResultByTeamTypeCode(String teamTypeCode, String... fieldNames){
             List<UserRegisterDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByTeamTypeCode(String teamTypeCode, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(UserRegisterDO updateDO, String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(UserRegisterDO updateDO, String teamTypeCode);

        public Integer deleteByTeamTypeCode(String teamTypeCode);






        public List<UserRegisterDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList);

         public default UserRegisterDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamTypeCode(UserRegisterDO updateDO, Collection<String> teamTypeCodeList);

         public Integer updateAllFieldsByInTeamTypeCode(UserRegisterDO updateDO, Collection<String> teamTypeCodeList);

         public Integer deleteByInTeamTypeCode(Collection<String> teamTypeCodeList);
        public List<UserRegisterDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserRegisterDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserRegisterDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserRegisterDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<UserRegisterDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserRegisterDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserRegisterDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserRegisterDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<UserRegisterDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserRegisterDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserRegisterDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterDO>> groupingByUserIdModified(Long userIdModified, Function<UserRegisterDO, T> mapper, String... fieldNames){
             List<UserRegisterDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserRegisterDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserRegisterDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<UserRegisterDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserRegisterDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserRegisterDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRegisterDO, T> mapper, String... fieldNames){
              List<UserRegisterDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserRegisterDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserRegisterDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

