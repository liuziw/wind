package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.SecretQuestionDO;
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
public interface ImmutableSecretQuestionDaoManager extends CommonDaoManager<SecretQuestionDO,Long> {


        public List<SecretQuestionDO> listByQuestionDesc(String questionDesc, String... fieldNames);

        public Map<Long,SecretQuestionDO> mapByQuestionDesc(String questionDesc, String... fieldNames);

        public Integer countByQuestionDesc(String questionDesc);

        public default SecretQuestionDO singleResultByQuestionDesc(String questionDesc, String... fieldNames){
             List<SecretQuestionDO> list=this.listByQuestionDesc(questionDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByQuestionDesc(String questionDesc, Function<SecretQuestionDO, T> mapper, String... fieldNames){
             List<SecretQuestionDO> list=this.listByQuestionDesc(questionDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionDesc(SecretQuestionDO updateDO, String questionDesc);

        public Integer updateAllFieldsByQuestionDesc(SecretQuestionDO updateDO, String questionDesc);

        public Integer deleteByQuestionDesc(String questionDesc);






        public List<SecretQuestionDO> listByInQuestionDesc(Collection<String> questionDescList, String... fieldNames);

         public Map<Long,SecretQuestionDO> mapByInQuestionDesc(Collection<String> questionDescList, String... fieldNames);

         public Integer countByInQuestionDesc(Collection<String> questionDescList);

         public default SecretQuestionDO singleResultByInQuestionDesc(Collection<String> questionDescList, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInQuestionDesc(questionDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SecretQuestionDO>> groupingByInQuestionDesc(Collection<String> questionDescList, Function<SecretQuestionDO, T> mapper, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInQuestionDesc(questionDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInQuestionDesc(SecretQuestionDO updateDO, Collection<String> questionDescList);

         public Integer updateAllFieldsByInQuestionDesc(SecretQuestionDO updateDO, Collection<String> questionDescList);

         public Integer deleteByInQuestionDesc(Collection<String> questionDescList);
        public List<SecretQuestionDO> listBySeq(Long seq, String... fieldNames);

        public Map<Long,SecretQuestionDO> mapBySeq(Long seq, String... fieldNames);

        public Integer countBySeq(Long seq);

        public default SecretQuestionDO singleResultBySeq(Long seq, String... fieldNames){
             List<SecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingBySeq(Long seq, Function<SecretQuestionDO, T> mapper, String... fieldNames){
             List<SecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(SecretQuestionDO updateDO, Long seq);

        public Integer updateAllFieldsBySeq(SecretQuestionDO updateDO, Long seq);

        public Integer deleteBySeq(Long seq);






        public List<SecretQuestionDO> listByInSeq(Collection<Long> seqList, String... fieldNames);

         public Map<Long,SecretQuestionDO> mapByInSeq(Collection<Long> seqList, String... fieldNames);

         public Integer countByInSeq(Collection<Long> seqList);

         public default SecretQuestionDO singleResultByInSeq(Collection<Long> seqList, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SecretQuestionDO>> groupingByInSeq(Collection<Long> seqList, Function<SecretQuestionDO, T> mapper, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSeq(SecretQuestionDO updateDO, Collection<Long> seqList);

         public Integer updateAllFieldsByInSeq(SecretQuestionDO updateDO, Collection<Long> seqList);

         public Integer deleteByInSeq(Collection<Long> seqList);
        public List<SecretQuestionDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,SecretQuestionDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default SecretQuestionDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByUserIdCreate(Long userIdCreate, Function<SecretQuestionDO, T> mapper, String... fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(SecretQuestionDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(SecretQuestionDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<SecretQuestionDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,SecretQuestionDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default SecretQuestionDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SecretQuestionDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<SecretQuestionDO, T> mapper, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(SecretQuestionDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(SecretQuestionDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<SecretQuestionDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,SecretQuestionDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default SecretQuestionDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByUserIdModified(Long userIdModified, Function<SecretQuestionDO, T> mapper, String... fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(SecretQuestionDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(SecretQuestionDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<SecretQuestionDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,SecretQuestionDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default SecretQuestionDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SecretQuestionDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<SecretQuestionDO, T> mapper, String... fieldNames){
              List<SecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(SecretQuestionDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(SecretQuestionDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

