package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.UserSecretQuestionDO;
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
public interface ImmutableUserSecretQuestionDaoManager extends CommonDaoManager<UserSecretQuestionDO,Long> {


        public List<UserSecretQuestionDO> listByUserAccount(String userAccount, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapByUserAccount(String userAccount, String... fieldNames);

        public Integer countByUserAccount(String userAccount);

        public default UserSecretQuestionDO singleResultByUserAccount(String userAccount, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserAccount(String userAccount, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(UserSecretQuestionDO updateDO, String userAccount);

        public Integer updateAllFieldsByUserAccount(UserSecretQuestionDO updateDO, String userAccount);

        public Integer deleteByUserAccount(String userAccount);






        public List<UserSecretQuestionDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Integer countByInUserAccount(Collection<String> userAccountList);

         public default UserSecretQuestionDO singleResultByInUserAccount(Collection<String> userAccountList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserAccount(UserSecretQuestionDO updateDO, Collection<String> userAccountList);

         public Integer updateAllFieldsByInUserAccount(UserSecretQuestionDO updateDO, Collection<String> userAccountList);

         public Integer deleteByInUserAccount(Collection<String> userAccountList);
        public List<UserSecretQuestionDO> listByQuestionId(Long questionId, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapByQuestionId(Long questionId, String... fieldNames);

        public Integer countByQuestionId(Long questionId);

        public default UserSecretQuestionDO singleResultByQuestionId(Long questionId, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionId(questionId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByQuestionId(Long questionId, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionId(questionId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionId(UserSecretQuestionDO updateDO, Long questionId);

        public Integer updateAllFieldsByQuestionId(UserSecretQuestionDO updateDO, Long questionId);

        public Integer deleteByQuestionId(Long questionId);






        public List<UserSecretQuestionDO> listByInQuestionId(Collection<Long> questionIdList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInQuestionId(Collection<Long> questionIdList, String... fieldNames);

         public Integer countByInQuestionId(Collection<Long> questionIdList);

         public default UserSecretQuestionDO singleResultByInQuestionId(Collection<Long> questionIdList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInQuestionId(questionIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInQuestionId(Collection<Long> questionIdList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInQuestionId(questionIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInQuestionId(UserSecretQuestionDO updateDO, Collection<Long> questionIdList);

         public Integer updateAllFieldsByInQuestionId(UserSecretQuestionDO updateDO, Collection<Long> questionIdList);

         public Integer deleteByInQuestionId(Collection<Long> questionIdList);
        public List<UserSecretQuestionDO> listByQuestionAnswer(String questionAnswer, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapByQuestionAnswer(String questionAnswer, String... fieldNames);

        public Integer countByQuestionAnswer(String questionAnswer);

        public default UserSecretQuestionDO singleResultByQuestionAnswer(String questionAnswer, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionAnswer(questionAnswer,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByQuestionAnswer(String questionAnswer, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByQuestionAnswer(questionAnswer,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionAnswer(UserSecretQuestionDO updateDO, String questionAnswer);

        public Integer updateAllFieldsByQuestionAnswer(UserSecretQuestionDO updateDO, String questionAnswer);

        public Integer deleteByQuestionAnswer(String questionAnswer);






        public List<UserSecretQuestionDO> listByInQuestionAnswer(Collection<String> questionAnswerList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInQuestionAnswer(Collection<String> questionAnswerList, String... fieldNames);

         public Integer countByInQuestionAnswer(Collection<String> questionAnswerList);

         public default UserSecretQuestionDO singleResultByInQuestionAnswer(Collection<String> questionAnswerList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInQuestionAnswer(questionAnswerList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInQuestionAnswer(Collection<String> questionAnswerList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInQuestionAnswer(questionAnswerList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInQuestionAnswer(UserSecretQuestionDO updateDO, Collection<String> questionAnswerList);

         public Integer updateAllFieldsByInQuestionAnswer(UserSecretQuestionDO updateDO, Collection<String> questionAnswerList);

         public Integer deleteByInQuestionAnswer(Collection<String> questionAnswerList);
        public List<UserSecretQuestionDO> listBySeq(Integer seq, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapBySeq(Integer seq, String... fieldNames);

        public Integer countBySeq(Integer seq);

        public default UserSecretQuestionDO singleResultBySeq(Integer seq, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingBySeq(Integer seq, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(UserSecretQuestionDO updateDO, Integer seq);

        public Integer updateAllFieldsBySeq(UserSecretQuestionDO updateDO, Integer seq);

        public Integer deleteBySeq(Integer seq);






        public List<UserSecretQuestionDO> listByInSeq(Collection<Integer> seqList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInSeq(Collection<Integer> seqList, String... fieldNames);

         public Integer countByInSeq(Collection<Integer> seqList);

         public default UserSecretQuestionDO singleResultByInSeq(Collection<Integer> seqList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInSeq(Collection<Integer> seqList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSeq(UserSecretQuestionDO updateDO, Collection<Integer> seqList);

         public Integer updateAllFieldsByInSeq(UserSecretQuestionDO updateDO, Collection<Integer> seqList);

         public Integer deleteByInSeq(Collection<Integer> seqList);
        public List<UserSecretQuestionDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserSecretQuestionDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserSecretQuestionDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserSecretQuestionDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<UserSecretQuestionDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserSecretQuestionDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserSecretQuestionDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserSecretQuestionDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<UserSecretQuestionDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserSecretQuestionDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserSecretQuestionDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserSecretQuestionDO>> groupingByUserIdModified(Long userIdModified, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
             List<UserSecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserSecretQuestionDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserSecretQuestionDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<UserSecretQuestionDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserSecretQuestionDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserSecretQuestionDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserSecretQuestionDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserSecretQuestionDO, T> mapper, String... fieldNames){
              List<UserSecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserSecretQuestionDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserSecretQuestionDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

