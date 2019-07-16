package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.OpenUserDO;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
@Mapper
public interface OpenUserMapper extends CommonMapper<OpenUserDO,Long> {

        public List<OpenUserDO> listByOpenId(@Param("openId") String openId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByOpenId(@Param("openId") String openId, @Param("fieldNames") String[] fieldNames);

        public Integer countByOpenId(@Param("openId") String openId);

        public default OpenUserDO singleResultByOpenId(String openId, String[] fieldNames){
             List<OpenUserDO> list=this.listByOpenId(openId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByOpenId(String openId, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByOpenId(openId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOpenId(@Param("updateDO") OpenUserDO updateDO, @Param("openId") String openId);

        public Integer updateAllFieldsByOpenId(@Param("updateDO") OpenUserDO updateDO, @Param("openId") String openId);

        public Integer deleteByOpenId(@Param("openId") String openId);




        public List<OpenUserDO> listByInOpenId(@Param("openIdList") Collection<String> openIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInOpenId(@Param("openIdList") Collection<String> openIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInOpenId(@Param("openIdList") Collection<String> openIdList);

        public default OpenUserDO singleResultByInOpenId(Collection<String> openIdList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInOpenId(openIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInOpenId(Collection<String> openIdList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInOpenId(openIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOpenId(@Param("updateDO") OpenUserDO updateDO, @Param("openIdList") Collection<String> openIdList);

        public Integer updateAllFieldsByInOpenId(@Param("updateDO") OpenUserDO updateDO, @Param("openIdList") Collection<String> openIdList);

        public Integer deleteByInOpenId(@Param("openIdList") Collection<String> openIdList);

        public List<OpenUserDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default OpenUserDO singleResultByUserId(Long userId, String[] fieldNames){
             List<OpenUserDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByUserId(Long userId, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") OpenUserDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") OpenUserDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<OpenUserDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default OpenUserDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInUserId(Collection<Long> userIdList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") OpenUserDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") OpenUserDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<OpenUserDO> listByExamineStatus(@Param("examineStatus") Integer examineStatus, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByExamineStatus(@Param("examineStatus") Integer examineStatus, @Param("fieldNames") String[] fieldNames);

        public Integer countByExamineStatus(@Param("examineStatus") Integer examineStatus);

        public default OpenUserDO singleResultByExamineStatus(Integer examineStatus, String[] fieldNames){
             List<OpenUserDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByExamineStatus(Integer examineStatus, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByExamineStatus(examineStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByExamineStatus(@Param("updateDO") OpenUserDO updateDO, @Param("examineStatus") Integer examineStatus);

        public Integer updateAllFieldsByExamineStatus(@Param("updateDO") OpenUserDO updateDO, @Param("examineStatus") Integer examineStatus);

        public Integer deleteByExamineStatus(@Param("examineStatus") Integer examineStatus);




        public List<OpenUserDO> listByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList);

        public default OpenUserDO singleResultByInExamineStatus(Collection<Integer> examineStatusList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInExamineStatus(Collection<Integer> examineStatusList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInExamineStatus(examineStatusList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInExamineStatus(@Param("updateDO") OpenUserDO updateDO, @Param("examineStatusList") Collection<Integer> examineStatusList);

        public Integer updateAllFieldsByInExamineStatus(@Param("updateDO") OpenUserDO updateDO, @Param("examineStatusList") Collection<Integer> examineStatusList);

        public Integer deleteByInExamineStatus(@Param("examineStatusList") Collection<Integer> examineStatusList);

        public List<OpenUserDO> listByWxHeadImg(@Param("wxHeadImg") String wxHeadImg, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByWxHeadImg(@Param("wxHeadImg") String wxHeadImg, @Param("fieldNames") String[] fieldNames);

        public Integer countByWxHeadImg(@Param("wxHeadImg") String wxHeadImg);

        public default OpenUserDO singleResultByWxHeadImg(String wxHeadImg, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxHeadImg(wxHeadImg,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxHeadImg(String wxHeadImg, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxHeadImg(wxHeadImg,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxHeadImg(@Param("updateDO") OpenUserDO updateDO, @Param("wxHeadImg") String wxHeadImg);

        public Integer updateAllFieldsByWxHeadImg(@Param("updateDO") OpenUserDO updateDO, @Param("wxHeadImg") String wxHeadImg);

        public Integer deleteByWxHeadImg(@Param("wxHeadImg") String wxHeadImg);




        public List<OpenUserDO> listByInWxHeadImg(@Param("wxHeadImgList") Collection<String> wxHeadImgList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInWxHeadImg(@Param("wxHeadImgList") Collection<String> wxHeadImgList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInWxHeadImg(@Param("wxHeadImgList") Collection<String> wxHeadImgList);

        public default OpenUserDO singleResultByInWxHeadImg(Collection<String> wxHeadImgList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxHeadImg(wxHeadImgList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInWxHeadImg(Collection<String> wxHeadImgList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxHeadImg(wxHeadImgList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInWxHeadImg(@Param("updateDO") OpenUserDO updateDO, @Param("wxHeadImgList") Collection<String> wxHeadImgList);

        public Integer updateAllFieldsByInWxHeadImg(@Param("updateDO") OpenUserDO updateDO, @Param("wxHeadImgList") Collection<String> wxHeadImgList);

        public Integer deleteByInWxHeadImg(@Param("wxHeadImgList") Collection<String> wxHeadImgList);

        public List<OpenUserDO> listByNickName(@Param("nickName") String nickName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByNickName(@Param("nickName") String nickName, @Param("fieldNames") String[] fieldNames);

        public Integer countByNickName(@Param("nickName") String nickName);

        public default OpenUserDO singleResultByNickName(String nickName, String[] fieldNames){
             List<OpenUserDO> list=this.listByNickName(nickName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByNickName(String nickName, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByNickName(nickName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByNickName(@Param("updateDO") OpenUserDO updateDO, @Param("nickName") String nickName);

        public Integer updateAllFieldsByNickName(@Param("updateDO") OpenUserDO updateDO, @Param("nickName") String nickName);

        public Integer deleteByNickName(@Param("nickName") String nickName);




        public List<OpenUserDO> listByInNickName(@Param("nickNameList") Collection<String> nickNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInNickName(@Param("nickNameList") Collection<String> nickNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInNickName(@Param("nickNameList") Collection<String> nickNameList);

        public default OpenUserDO singleResultByInNickName(Collection<String> nickNameList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInNickName(nickNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInNickName(Collection<String> nickNameList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInNickName(nickNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInNickName(@Param("updateDO") OpenUserDO updateDO, @Param("nickNameList") Collection<String> nickNameList);

        public Integer updateAllFieldsByInNickName(@Param("updateDO") OpenUserDO updateDO, @Param("nickNameList") Collection<String> nickNameList);

        public Integer deleteByInNickName(@Param("nickNameList") Collection<String> nickNameList);

        public List<OpenUserDO> listByWxPhoneNum(@Param("wxPhoneNum") String wxPhoneNum, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByWxPhoneNum(@Param("wxPhoneNum") String wxPhoneNum, @Param("fieldNames") String[] fieldNames);

        public Integer countByWxPhoneNum(@Param("wxPhoneNum") String wxPhoneNum);

        public default OpenUserDO singleResultByWxPhoneNum(String wxPhoneNum, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxPhoneNum(wxPhoneNum,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxPhoneNum(String wxPhoneNum, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxPhoneNum(wxPhoneNum,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxPhoneNum(@Param("updateDO") OpenUserDO updateDO, @Param("wxPhoneNum") String wxPhoneNum);

        public Integer updateAllFieldsByWxPhoneNum(@Param("updateDO") OpenUserDO updateDO, @Param("wxPhoneNum") String wxPhoneNum);

        public Integer deleteByWxPhoneNum(@Param("wxPhoneNum") String wxPhoneNum);




        public List<OpenUserDO> listByInWxPhoneNum(@Param("wxPhoneNumList") Collection<String> wxPhoneNumList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInWxPhoneNum(@Param("wxPhoneNumList") Collection<String> wxPhoneNumList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInWxPhoneNum(@Param("wxPhoneNumList") Collection<String> wxPhoneNumList);

        public default OpenUserDO singleResultByInWxPhoneNum(Collection<String> wxPhoneNumList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxPhoneNum(wxPhoneNumList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInWxPhoneNum(Collection<String> wxPhoneNumList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxPhoneNum(wxPhoneNumList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInWxPhoneNum(@Param("updateDO") OpenUserDO updateDO, @Param("wxPhoneNumList") Collection<String> wxPhoneNumList);

        public Integer updateAllFieldsByInWxPhoneNum(@Param("updateDO") OpenUserDO updateDO, @Param("wxPhoneNumList") Collection<String> wxPhoneNumList);

        public Integer deleteByInWxPhoneNum(@Param("wxPhoneNumList") Collection<String> wxPhoneNumList);

        public List<OpenUserDO> listByWxGender(@Param("wxGender") Integer wxGender, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByWxGender(@Param("wxGender") Integer wxGender, @Param("fieldNames") String[] fieldNames);

        public Integer countByWxGender(@Param("wxGender") Integer wxGender);

        public default OpenUserDO singleResultByWxGender(Integer wxGender, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxGender(wxGender,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxGender(Integer wxGender, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxGender(wxGender,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxGender(@Param("updateDO") OpenUserDO updateDO, @Param("wxGender") Integer wxGender);

        public Integer updateAllFieldsByWxGender(@Param("updateDO") OpenUserDO updateDO, @Param("wxGender") Integer wxGender);

        public Integer deleteByWxGender(@Param("wxGender") Integer wxGender);




        public List<OpenUserDO> listByInWxGender(@Param("wxGenderList") Collection<Integer> wxGenderList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInWxGender(@Param("wxGenderList") Collection<Integer> wxGenderList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInWxGender(@Param("wxGenderList") Collection<Integer> wxGenderList);

        public default OpenUserDO singleResultByInWxGender(Collection<Integer> wxGenderList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxGender(wxGenderList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInWxGender(Collection<Integer> wxGenderList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxGender(wxGenderList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInWxGender(@Param("updateDO") OpenUserDO updateDO, @Param("wxGenderList") Collection<Integer> wxGenderList);

        public Integer updateAllFieldsByInWxGender(@Param("updateDO") OpenUserDO updateDO, @Param("wxGenderList") Collection<Integer> wxGenderList);

        public Integer deleteByInWxGender(@Param("wxGenderList") Collection<Integer> wxGenderList);

        public List<OpenUserDO> listByWxAppId(@Param("wxAppId") String wxAppId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByWxAppId(@Param("wxAppId") String wxAppId, @Param("fieldNames") String[] fieldNames);

        public Integer countByWxAppId(@Param("wxAppId") String wxAppId);

        public default OpenUserDO singleResultByWxAppId(String wxAppId, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxAppId(wxAppId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByWxAppId(String wxAppId, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByWxAppId(wxAppId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByWxAppId(@Param("updateDO") OpenUserDO updateDO, @Param("wxAppId") String wxAppId);

        public Integer updateAllFieldsByWxAppId(@Param("updateDO") OpenUserDO updateDO, @Param("wxAppId") String wxAppId);

        public Integer deleteByWxAppId(@Param("wxAppId") String wxAppId);




        public List<OpenUserDO> listByInWxAppId(@Param("wxAppIdList") Collection<String> wxAppIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInWxAppId(@Param("wxAppIdList") Collection<String> wxAppIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInWxAppId(@Param("wxAppIdList") Collection<String> wxAppIdList);

        public default OpenUserDO singleResultByInWxAppId(Collection<String> wxAppIdList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxAppId(wxAppIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInWxAppId(Collection<String> wxAppIdList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInWxAppId(wxAppIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInWxAppId(@Param("updateDO") OpenUserDO updateDO, @Param("wxAppIdList") Collection<String> wxAppIdList);

        public Integer updateAllFieldsByInWxAppId(@Param("updateDO") OpenUserDO updateDO, @Param("wxAppIdList") Collection<String> wxAppIdList);

        public Integer deleteByInWxAppId(@Param("wxAppIdList") Collection<String> wxAppIdList);

        public List<OpenUserDO> listByUnionId(@Param("unionId") String unionId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByUnionId(@Param("unionId") String unionId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUnionId(@Param("unionId") String unionId);

        public default OpenUserDO singleResultByUnionId(String unionId, String[] fieldNames){
             List<OpenUserDO> list=this.listByUnionId(unionId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByUnionId(String unionId, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByUnionId(unionId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUnionId(@Param("updateDO") OpenUserDO updateDO, @Param("unionId") String unionId);

        public Integer updateAllFieldsByUnionId(@Param("updateDO") OpenUserDO updateDO, @Param("unionId") String unionId);

        public Integer deleteByUnionId(@Param("unionId") String unionId);




        public List<OpenUserDO> listByInUnionId(@Param("unionIdList") Collection<String> unionIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OpenUserDO> mapByInUnionId(@Param("unionIdList") Collection<String> unionIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUnionId(@Param("unionIdList") Collection<String> unionIdList);

        public default OpenUserDO singleResultByInUnionId(Collection<String> unionIdList, String[] fieldNames){
             List<OpenUserDO> list=this.listByInUnionId(unionIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OpenUserDO>> groupingByInUnionId(Collection<String> unionIdList, Function<OpenUserDO, T> mapper, String[] fieldNames){
             List<OpenUserDO> list=this.listByInUnionId(unionIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUnionId(@Param("updateDO") OpenUserDO updateDO, @Param("unionIdList") Collection<String> unionIdList);

        public Integer updateAllFieldsByInUnionId(@Param("updateDO") OpenUserDO updateDO, @Param("unionIdList") Collection<String> unionIdList);

        public Integer deleteByInUnionId(@Param("unionIdList") Collection<String> unionIdList);


}
