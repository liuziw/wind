package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.OpenUserDO;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableOpenUserDaoManager extends CommonDaoManager<OpenUserDO,Long> {


        public List<OpenUserDO> listByOpenId(String openId, String... fieldNames);

        public Map<Long,OpenUserDO> mapByOpenId(String openId, String... fieldNames);

        public Integer countByOpenId(String openId);

        public default OpenUserDO singleResultByOpenId(String openId, String... fieldNames){
             List<OpenUserDO> list=this.listByOpenId(openId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByOpenId(String openId, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByOpenId(openId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOpenId(OpenUserDO updateDO, String openId);

        public Integer updateAllFieldsByOpenId(OpenUserDO updateDO, String openId);

        public Integer deleteByOpenId(String openId);






        public List<OpenUserDO> listByInOpenId(Collection<String> openIdList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInOpenId(Collection<String> openIdList, String... fieldNames);

         public Integer countByInOpenId(Collection<String> openIdList);

         public default OpenUserDO singleResultByInOpenId(Collection<String> openIdList, String... fieldNames){
              List<OpenUserDO> list=this.listByInOpenId(openIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInOpenId(Collection<String> openIdList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInOpenId(openIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOpenId(OpenUserDO updateDO, Collection<String> openIdList);

         public Integer updateAllFieldsByInOpenId(OpenUserDO updateDO, Collection<String> openIdList);

         public Integer deleteByInOpenId(Collection<String> openIdList);
        public List<OpenUserDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,OpenUserDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default OpenUserDO singleResultByUserId(Long userId, String... fieldNames){
             List<OpenUserDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByUserId(Long userId, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(OpenUserDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(OpenUserDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<OpenUserDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default OpenUserDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<OpenUserDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInUserId(Collection<Long> userIdList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(OpenUserDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(OpenUserDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<OpenUserDO> listByExamineStatus(Integer examineStatus, String... fieldNames);

        public Map<Long,OpenUserDO> mapByExamineStatus(Integer examineStatus, String... fieldNames);

        public Integer countByExamineStatus(Integer examineStatus);

        public default OpenUserDO singleResultByExamineStatus(Integer examineStatus, String... fieldNames){
             List<OpenUserDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByExamineStatus(Integer examineStatus, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineStatus(OpenUserDO updateDO, Integer examineStatus);

        public Integer updateAllFieldsByExamineStatus(OpenUserDO updateDO, Integer examineStatus);

        public Integer deleteByExamineStatus(Integer examineStatus);






        public List<OpenUserDO> listByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames);

         public Integer countByInExamineStatus(Collection<Integer> examineStatusList);

         public default OpenUserDO singleResultByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
              List<OpenUserDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInExamineStatus(Collection<Integer> examineStatusList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInExamineStatus(OpenUserDO updateDO, Collection<Integer> examineStatusList);

         public Integer updateAllFieldsByInExamineStatus(OpenUserDO updateDO, Collection<Integer> examineStatusList);

         public Integer deleteByInExamineStatus(Collection<Integer> examineStatusList);
        public List<OpenUserDO> listByWxHeadImg(String wxHeadImg, String... fieldNames);

        public Map<Long,OpenUserDO> mapByWxHeadImg(String wxHeadImg, String... fieldNames);

        public Integer countByWxHeadImg(String wxHeadImg);

        public default OpenUserDO singleResultByWxHeadImg(String wxHeadImg, String... fieldNames){
             List<OpenUserDO> list=this.listByWxHeadImg(wxHeadImg,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxHeadImg(String wxHeadImg, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByWxHeadImg(wxHeadImg,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxHeadImg(OpenUserDO updateDO, String wxHeadImg);

        public Integer updateAllFieldsByWxHeadImg(OpenUserDO updateDO, String wxHeadImg);

        public Integer deleteByWxHeadImg(String wxHeadImg);






        public List<OpenUserDO> listByInWxHeadImg(Collection<String> wxHeadImgList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInWxHeadImg(Collection<String> wxHeadImgList, String... fieldNames);

         public Integer countByInWxHeadImg(Collection<String> wxHeadImgList);

         public default OpenUserDO singleResultByInWxHeadImg(Collection<String> wxHeadImgList, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxHeadImg(wxHeadImgList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInWxHeadImg(Collection<String> wxHeadImgList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxHeadImg(wxHeadImgList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInWxHeadImg(OpenUserDO updateDO, Collection<String> wxHeadImgList);

         public Integer updateAllFieldsByInWxHeadImg(OpenUserDO updateDO, Collection<String> wxHeadImgList);

         public Integer deleteByInWxHeadImg(Collection<String> wxHeadImgList);
        public List<OpenUserDO> listByNickName(String nickName, String... fieldNames);

        public Map<Long,OpenUserDO> mapByNickName(String nickName, String... fieldNames);

        public Integer countByNickName(String nickName);

        public default OpenUserDO singleResultByNickName(String nickName, String... fieldNames){
             List<OpenUserDO> list=this.listByNickName(nickName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByNickName(String nickName, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByNickName(nickName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByNickName(OpenUserDO updateDO, String nickName);

        public Integer updateAllFieldsByNickName(OpenUserDO updateDO, String nickName);

        public Integer deleteByNickName(String nickName);






        public List<OpenUserDO> listByInNickName(Collection<String> nickNameList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInNickName(Collection<String> nickNameList, String... fieldNames);

         public Integer countByInNickName(Collection<String> nickNameList);

         public default OpenUserDO singleResultByInNickName(Collection<String> nickNameList, String... fieldNames){
              List<OpenUserDO> list=this.listByInNickName(nickNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInNickName(Collection<String> nickNameList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInNickName(nickNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInNickName(OpenUserDO updateDO, Collection<String> nickNameList);

         public Integer updateAllFieldsByInNickName(OpenUserDO updateDO, Collection<String> nickNameList);

         public Integer deleteByInNickName(Collection<String> nickNameList);
        public List<OpenUserDO> listByWxPhoneNum(String wxPhoneNum, String... fieldNames);

        public Map<Long,OpenUserDO> mapByWxPhoneNum(String wxPhoneNum, String... fieldNames);

        public Integer countByWxPhoneNum(String wxPhoneNum);

        public default OpenUserDO singleResultByWxPhoneNum(String wxPhoneNum, String... fieldNames){
             List<OpenUserDO> list=this.listByWxPhoneNum(wxPhoneNum,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxPhoneNum(String wxPhoneNum, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByWxPhoneNum(wxPhoneNum,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxPhoneNum(OpenUserDO updateDO, String wxPhoneNum);

        public Integer updateAllFieldsByWxPhoneNum(OpenUserDO updateDO, String wxPhoneNum);

        public Integer deleteByWxPhoneNum(String wxPhoneNum);






        public List<OpenUserDO> listByInWxPhoneNum(Collection<String> wxPhoneNumList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInWxPhoneNum(Collection<String> wxPhoneNumList, String... fieldNames);

         public Integer countByInWxPhoneNum(Collection<String> wxPhoneNumList);

         public default OpenUserDO singleResultByInWxPhoneNum(Collection<String> wxPhoneNumList, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxPhoneNum(wxPhoneNumList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInWxPhoneNum(Collection<String> wxPhoneNumList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxPhoneNum(wxPhoneNumList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInWxPhoneNum(OpenUserDO updateDO, Collection<String> wxPhoneNumList);

         public Integer updateAllFieldsByInWxPhoneNum(OpenUserDO updateDO, Collection<String> wxPhoneNumList);

         public Integer deleteByInWxPhoneNum(Collection<String> wxPhoneNumList);
        public List<OpenUserDO> listByWxGender(Integer wxGender, String... fieldNames);

        public Map<Long,OpenUserDO> mapByWxGender(Integer wxGender, String... fieldNames);

        public Integer countByWxGender(Integer wxGender);

        public default OpenUserDO singleResultByWxGender(Integer wxGender, String... fieldNames){
             List<OpenUserDO> list=this.listByWxGender(wxGender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxGender(Integer wxGender, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByWxGender(wxGender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxGender(OpenUserDO updateDO, Integer wxGender);

        public Integer updateAllFieldsByWxGender(OpenUserDO updateDO, Integer wxGender);

        public Integer deleteByWxGender(Integer wxGender);






        public List<OpenUserDO> listByInWxGender(Collection<Integer> wxGenderList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInWxGender(Collection<Integer> wxGenderList, String... fieldNames);

         public Integer countByInWxGender(Collection<Integer> wxGenderList);

         public default OpenUserDO singleResultByInWxGender(Collection<Integer> wxGenderList, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxGender(wxGenderList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInWxGender(Collection<Integer> wxGenderList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxGender(wxGenderList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInWxGender(OpenUserDO updateDO, Collection<Integer> wxGenderList);

         public Integer updateAllFieldsByInWxGender(OpenUserDO updateDO, Collection<Integer> wxGenderList);

         public Integer deleteByInWxGender(Collection<Integer> wxGenderList);
        public List<OpenUserDO> listByWxAppId(String wxAppId, String... fieldNames);

        public Map<Long,OpenUserDO> mapByWxAppId(String wxAppId, String... fieldNames);

        public Integer countByWxAppId(String wxAppId);

        public default OpenUserDO singleResultByWxAppId(String wxAppId, String... fieldNames){
             List<OpenUserDO> list=this.listByWxAppId(wxAppId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxAppId(String wxAppId, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByWxAppId(wxAppId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxAppId(OpenUserDO updateDO, String wxAppId);

        public Integer updateAllFieldsByWxAppId(OpenUserDO updateDO, String wxAppId);

        public Integer deleteByWxAppId(String wxAppId);






        public List<OpenUserDO> listByInWxAppId(Collection<String> wxAppIdList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInWxAppId(Collection<String> wxAppIdList, String... fieldNames);

         public Integer countByInWxAppId(Collection<String> wxAppIdList);

         public default OpenUserDO singleResultByInWxAppId(Collection<String> wxAppIdList, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxAppId(wxAppIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInWxAppId(Collection<String> wxAppIdList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInWxAppId(wxAppIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInWxAppId(OpenUserDO updateDO, Collection<String> wxAppIdList);

         public Integer updateAllFieldsByInWxAppId(OpenUserDO updateDO, Collection<String> wxAppIdList);

         public Integer deleteByInWxAppId(Collection<String> wxAppIdList);
        public List<OpenUserDO> listByUnionId(String unionId, String... fieldNames);

        public Map<Long,OpenUserDO> mapByUnionId(String unionId, String... fieldNames);

        public Integer countByUnionId(String unionId);

        public default OpenUserDO singleResultByUnionId(String unionId, String... fieldNames){
             List<OpenUserDO> list=this.listByUnionId(unionId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByUnionId(String unionId, Function<OpenUserDO, T> mapper, String... fieldNames){
             List<OpenUserDO> list=this.listByUnionId(unionId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUnionId(OpenUserDO updateDO, String unionId);

        public Integer updateAllFieldsByUnionId(OpenUserDO updateDO, String unionId);

        public Integer deleteByUnionId(String unionId);






        public List<OpenUserDO> listByInUnionId(Collection<String> unionIdList, String... fieldNames);

         public Map<Long,OpenUserDO> mapByInUnionId(Collection<String> unionIdList, String... fieldNames);

         public Integer countByInUnionId(Collection<String> unionIdList);

         public default OpenUserDO singleResultByInUnionId(Collection<String> unionIdList, String... fieldNames){
              List<OpenUserDO> list=this.listByInUnionId(unionIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OpenUserDO>> groupingByInUnionId(Collection<String> unionIdList, Function<OpenUserDO, T> mapper, String... fieldNames){
              List<OpenUserDO> list=this.listByInUnionId(unionIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUnionId(OpenUserDO updateDO, Collection<String> unionIdList);

         public Integer updateAllFieldsByInUnionId(OpenUserDO updateDO, Collection<String> unionIdList);

         public Integer deleteByInUnionId(Collection<String> unionIdList);


}

