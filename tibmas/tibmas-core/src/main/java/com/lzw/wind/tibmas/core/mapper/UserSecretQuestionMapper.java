package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.UserSecretQuestionDO;
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
public interface UserSecretQuestionMapper extends CommonMapper<UserSecretQuestionDO,Long> {

        public List<UserSecretQuestionDO> listByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserAccount(@Param("userAccount") String userAccount);

        public default UserSecretQuestionDO singleResultByUserAccount(String userAccount, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserAccount(String userAccount, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userAccount") String userAccount);

        public Integer updateAllFieldsByUserAccount(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userAccount") String userAccount);

        public Integer deleteByUserAccount(@Param("userAccount") String userAccount);




        public List<UserSecretQuestionDO> listByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public default UserSecretQuestionDO singleResultByInUserAccount(Collection<String> userAccountList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserAccount(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer updateAllFieldsByInUserAccount(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer deleteByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public List<UserSecretQuestionDO> listByQuestionId(@Param("questionId") Long questionId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByQuestionId(@Param("questionId") Long questionId, @Param("fieldNames") String[] fieldNames);

        public Integer countByQuestionId(@Param("questionId") Long questionId);

        public default UserSecretQuestionDO singleResultByQuestionId(Long questionId, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionId(questionId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByQuestionId(Long questionId, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionId(questionId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionId(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionId") Long questionId);

        public Integer updateAllFieldsByQuestionId(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionId") Long questionId);

        public Integer deleteByQuestionId(@Param("questionId") Long questionId);




        public List<UserSecretQuestionDO> listByInQuestionId(@Param("questionIdList") Collection<Long> questionIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInQuestionId(@Param("questionIdList") Collection<Long> questionIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInQuestionId(@Param("questionIdList") Collection<Long> questionIdList);

        public default UserSecretQuestionDO singleResultByInQuestionId(Collection<Long> questionIdList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInQuestionId(questionIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInQuestionId(Collection<Long> questionIdList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInQuestionId(questionIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInQuestionId(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionIdList") Collection<Long> questionIdList);

        public Integer updateAllFieldsByInQuestionId(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionIdList") Collection<Long> questionIdList);

        public Integer deleteByInQuestionId(@Param("questionIdList") Collection<Long> questionIdList);

        public List<UserSecretQuestionDO> listByQuestionAnswer(@Param("questionAnswer") String questionAnswer, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByQuestionAnswer(@Param("questionAnswer") String questionAnswer, @Param("fieldNames") String[] fieldNames);

        public Integer countByQuestionAnswer(@Param("questionAnswer") String questionAnswer);

        public default UserSecretQuestionDO singleResultByQuestionAnswer(String questionAnswer, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionAnswer(questionAnswer,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByQuestionAnswer(String questionAnswer, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionAnswer(questionAnswer,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionAnswer(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionAnswer") String questionAnswer);

        public Integer updateAllFieldsByQuestionAnswer(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionAnswer") String questionAnswer);

        public Integer deleteByQuestionAnswer(@Param("questionAnswer") String questionAnswer);




        public List<UserSecretQuestionDO> listByInQuestionAnswer(@Param("questionAnswerList") Collection<String> questionAnswerList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInQuestionAnswer(@Param("questionAnswerList") Collection<String> questionAnswerList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInQuestionAnswer(@Param("questionAnswerList") Collection<String> questionAnswerList);

        public default UserSecretQuestionDO singleResultByInQuestionAnswer(Collection<String> questionAnswerList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInQuestionAnswer(questionAnswerList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInQuestionAnswer(Collection<String> questionAnswerList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInQuestionAnswer(questionAnswerList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInQuestionAnswer(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionAnswerList") Collection<String> questionAnswerList);

        public Integer updateAllFieldsByInQuestionAnswer(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("questionAnswerList") Collection<String> questionAnswerList);

        public Integer deleteByInQuestionAnswer(@Param("questionAnswerList") Collection<String> questionAnswerList);

        public List<UserSecretQuestionDO> listBySeq(@Param("seq") Integer seq, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapBySeq(@Param("seq") Integer seq, @Param("fieldNames") String[] fieldNames);

        public Integer countBySeq(@Param("seq") Integer seq);

        public default UserSecretQuestionDO singleResultBySeq(Integer seq, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingBySeq(Integer seq, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("seq") Integer seq);

        public Integer updateAllFieldsBySeq(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("seq") Integer seq);

        public Integer deleteBySeq(@Param("seq") Integer seq);




        public List<UserSecretQuestionDO> listByInSeq(@Param("seqList") Collection<Integer> seqList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInSeq(@Param("seqList") Collection<Integer> seqList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSeq(@Param("seqList") Collection<Integer> seqList);

        public default UserSecretQuestionDO singleResultByInSeq(Collection<Integer> seqList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInSeq(Collection<Integer> seqList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSeq(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("seqList") Collection<Integer> seqList);

        public Integer updateAllFieldsByInSeq(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("seqList") Collection<Integer> seqList);

        public Integer deleteByInSeq(@Param("seqList") Collection<Integer> seqList);

        public List<UserSecretQuestionDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserSecretQuestionDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserSecretQuestionDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserSecretQuestionDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserSecretQuestionDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserSecretQuestionDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserIdModified(Long userIdModified, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserSecretQuestionDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserSecretQuestionDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserSecretQuestionDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserSecretQuestionDO, T> mapper, String[] fieldNames){
             List<UserSecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserSecretQuestionDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
