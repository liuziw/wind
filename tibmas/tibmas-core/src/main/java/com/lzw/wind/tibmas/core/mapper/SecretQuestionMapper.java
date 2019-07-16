package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.SecretQuestionDO;
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
public interface SecretQuestionMapper extends CommonMapper<SecretQuestionDO,Long> {

        public List<SecretQuestionDO> listByQuestionDesc(@Param("questionDesc") String questionDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByQuestionDesc(@Param("questionDesc") String questionDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByQuestionDesc(@Param("questionDesc") String questionDesc);

        public default SecretQuestionDO singleResultByQuestionDesc(String questionDesc, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByQuestionDesc(questionDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByQuestionDesc(String questionDesc, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByQuestionDesc(questionDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByQuestionDesc(@Param("updateDO") SecretQuestionDO updateDO, @Param("questionDesc") String questionDesc);

        public Integer updateAllFieldsByQuestionDesc(@Param("updateDO") SecretQuestionDO updateDO, @Param("questionDesc") String questionDesc);

        public Integer deleteByQuestionDesc(@Param("questionDesc") String questionDesc);




        public List<SecretQuestionDO> listByInQuestionDesc(@Param("questionDescList") Collection<String> questionDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByInQuestionDesc(@Param("questionDescList") Collection<String> questionDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInQuestionDesc(@Param("questionDescList") Collection<String> questionDescList);

        public default SecretQuestionDO singleResultByInQuestionDesc(Collection<String> questionDescList, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInQuestionDesc(questionDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByInQuestionDesc(Collection<String> questionDescList, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInQuestionDesc(questionDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInQuestionDesc(@Param("updateDO") SecretQuestionDO updateDO, @Param("questionDescList") Collection<String> questionDescList);

        public Integer updateAllFieldsByInQuestionDesc(@Param("updateDO") SecretQuestionDO updateDO, @Param("questionDescList") Collection<String> questionDescList);

        public Integer deleteByInQuestionDesc(@Param("questionDescList") Collection<String> questionDescList);

        public List<SecretQuestionDO> listBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        public Integer countBySeq(@Param("seq") Long seq);

        public default SecretQuestionDO singleResultBySeq(Long seq, String[] fieldNames){
             List<SecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingBySeq(Long seq, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(@Param("updateDO") SecretQuestionDO updateDO, @Param("seq") Long seq);

        public Integer updateAllFieldsBySeq(@Param("updateDO") SecretQuestionDO updateDO, @Param("seq") Long seq);

        public Integer deleteBySeq(@Param("seq") Long seq);




        public List<SecretQuestionDO> listByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSeq(@Param("seqList") Collection<Long> seqList);

        public default SecretQuestionDO singleResultByInSeq(Collection<Long> seqList, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByInSeq(Collection<Long> seqList, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInSeq(seqList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSeq(@Param("updateDO") SecretQuestionDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer updateAllFieldsByInSeq(@Param("updateDO") SecretQuestionDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer deleteByInSeq(@Param("seqList") Collection<Long> seqList);

        public List<SecretQuestionDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default SecretQuestionDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByUserIdCreate(Long userIdCreate, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<SecretQuestionDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default SecretQuestionDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<SecretQuestionDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default SecretQuestionDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByUserIdModified(Long userIdModified, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<SecretQuestionDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SecretQuestionDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default SecretQuestionDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SecretQuestionDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<SecretQuestionDO, T> mapper, String[] fieldNames){
             List<SecretQuestionDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") SecretQuestionDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
