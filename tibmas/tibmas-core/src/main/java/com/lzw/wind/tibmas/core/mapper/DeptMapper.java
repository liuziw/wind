package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.DeptDO;
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
public interface DeptMapper extends CommonMapper<DeptDO,Long> {


        public DeptDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<DeptDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default DeptDO singleResultById(Long id, String[] fieldNames){
             List<DeptDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingById(Long id, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") DeptDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") DeptDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<DeptDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default DeptDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<DeptDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInId(Collection<Long> idList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") DeptDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") DeptDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<DeptDO> listByDeptCode(@Param("deptCode") String deptCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByDeptCode(@Param("deptCode") String deptCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptCode(@Param("deptCode") String deptCode);

        public default DeptDO singleResultByDeptCode(String deptCode, String[] fieldNames){
             List<DeptDO> list=this.listByDeptCode(deptCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptCode(String deptCode, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByDeptCode(deptCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptCode(@Param("updateDO") DeptDO updateDO, @Param("deptCode") String deptCode);

        public Integer updateAllFieldsByDeptCode(@Param("updateDO") DeptDO updateDO, @Param("deptCode") String deptCode);

        public Integer deleteByDeptCode(@Param("deptCode") String deptCode);




        public List<DeptDO> listByInDeptCode(@Param("deptCodeList") Collection<String> deptCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInDeptCode(@Param("deptCodeList") Collection<String> deptCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptCode(@Param("deptCodeList") Collection<String> deptCodeList);

        public default DeptDO singleResultByInDeptCode(Collection<String> deptCodeList, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptCode(deptCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInDeptCode(Collection<String> deptCodeList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptCode(deptCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptCode(@Param("updateDO") DeptDO updateDO, @Param("deptCodeList") Collection<String> deptCodeList);

        public Integer updateAllFieldsByInDeptCode(@Param("updateDO") DeptDO updateDO, @Param("deptCodeList") Collection<String> deptCodeList);

        public Integer deleteByInDeptCode(@Param("deptCodeList") Collection<String> deptCodeList);

        public List<DeptDO> listByDeptName(@Param("deptName") String deptName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByDeptName(@Param("deptName") String deptName, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptName(@Param("deptName") String deptName);

        public default DeptDO singleResultByDeptName(String deptName, String[] fieldNames){
             List<DeptDO> list=this.listByDeptName(deptName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptName(String deptName, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByDeptName(deptName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptName(@Param("updateDO") DeptDO updateDO, @Param("deptName") String deptName);

        public Integer updateAllFieldsByDeptName(@Param("updateDO") DeptDO updateDO, @Param("deptName") String deptName);

        public Integer deleteByDeptName(@Param("deptName") String deptName);




        public List<DeptDO> listByInDeptName(@Param("deptNameList") Collection<String> deptNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInDeptName(@Param("deptNameList") Collection<String> deptNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptName(@Param("deptNameList") Collection<String> deptNameList);

        public default DeptDO singleResultByInDeptName(Collection<String> deptNameList, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptName(deptNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInDeptName(Collection<String> deptNameList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptName(deptNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptName(@Param("updateDO") DeptDO updateDO, @Param("deptNameList") Collection<String> deptNameList);

        public Integer updateAllFieldsByInDeptName(@Param("updateDO") DeptDO updateDO, @Param("deptNameList") Collection<String> deptNameList);

        public Integer deleteByInDeptName(@Param("deptNameList") Collection<String> deptNameList);

        public List<DeptDO> listByDeptDescribe(@Param("deptDescribe") String deptDescribe, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByDeptDescribe(@Param("deptDescribe") String deptDescribe, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptDescribe(@Param("deptDescribe") String deptDescribe);

        public default DeptDO singleResultByDeptDescribe(String deptDescribe, String[] fieldNames){
             List<DeptDO> list=this.listByDeptDescribe(deptDescribe,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptDescribe(String deptDescribe, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByDeptDescribe(deptDescribe,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptDescribe(@Param("updateDO") DeptDO updateDO, @Param("deptDescribe") String deptDescribe);

        public Integer updateAllFieldsByDeptDescribe(@Param("updateDO") DeptDO updateDO, @Param("deptDescribe") String deptDescribe);

        public Integer deleteByDeptDescribe(@Param("deptDescribe") String deptDescribe);




        public List<DeptDO> listByInDeptDescribe(@Param("deptDescribeList") Collection<String> deptDescribeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInDeptDescribe(@Param("deptDescribeList") Collection<String> deptDescribeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptDescribe(@Param("deptDescribeList") Collection<String> deptDescribeList);

        public default DeptDO singleResultByInDeptDescribe(Collection<String> deptDescribeList, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptDescribe(deptDescribeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInDeptDescribe(Collection<String> deptDescribeList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptDescribe(deptDescribeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptDescribe(@Param("updateDO") DeptDO updateDO, @Param("deptDescribeList") Collection<String> deptDescribeList);

        public Integer updateAllFieldsByInDeptDescribe(@Param("updateDO") DeptDO updateDO, @Param("deptDescribeList") Collection<String> deptDescribeList);

        public Integer deleteByInDeptDescribe(@Param("deptDescribeList") Collection<String> deptDescribeList);

        public List<DeptDO> listByDeptType(@Param("deptType") Integer deptType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByDeptType(@Param("deptType") Integer deptType, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptType(@Param("deptType") Integer deptType);

        public default DeptDO singleResultByDeptType(Integer deptType, String[] fieldNames){
             List<DeptDO> list=this.listByDeptType(deptType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptType(Integer deptType, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByDeptType(deptType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptType(@Param("updateDO") DeptDO updateDO, @Param("deptType") Integer deptType);

        public Integer updateAllFieldsByDeptType(@Param("updateDO") DeptDO updateDO, @Param("deptType") Integer deptType);

        public Integer deleteByDeptType(@Param("deptType") Integer deptType);




        public List<DeptDO> listByInDeptType(@Param("deptTypeList") Collection<Integer> deptTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInDeptType(@Param("deptTypeList") Collection<Integer> deptTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptType(@Param("deptTypeList") Collection<Integer> deptTypeList);

        public default DeptDO singleResultByInDeptType(Collection<Integer> deptTypeList, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptType(deptTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInDeptType(Collection<Integer> deptTypeList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInDeptType(deptTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptType(@Param("updateDO") DeptDO updateDO, @Param("deptTypeList") Collection<Integer> deptTypeList);

        public Integer updateAllFieldsByInDeptType(@Param("updateDO") DeptDO updateDO, @Param("deptTypeList") Collection<Integer> deptTypeList);

        public Integer deleteByInDeptType(@Param("deptTypeList") Collection<Integer> deptTypeList);

        public List<DeptDO> listByAreaId(@Param("areaId") Long areaId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByAreaId(@Param("areaId") Long areaId, @Param("fieldNames") String[] fieldNames);

        public Integer countByAreaId(@Param("areaId") Long areaId);

        public default DeptDO singleResultByAreaId(Long areaId, String[] fieldNames){
             List<DeptDO> list=this.listByAreaId(areaId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByAreaId(Long areaId, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByAreaId(areaId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAreaId(@Param("updateDO") DeptDO updateDO, @Param("areaId") Long areaId);

        public Integer updateAllFieldsByAreaId(@Param("updateDO") DeptDO updateDO, @Param("areaId") Long areaId);

        public Integer deleteByAreaId(@Param("areaId") Long areaId);




        public List<DeptDO> listByInAreaId(@Param("areaIdList") Collection<Long> areaIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInAreaId(@Param("areaIdList") Collection<Long> areaIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAreaId(@Param("areaIdList") Collection<Long> areaIdList);

        public default DeptDO singleResultByInAreaId(Collection<Long> areaIdList, String[] fieldNames){
             List<DeptDO> list=this.listByInAreaId(areaIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInAreaId(Collection<Long> areaIdList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInAreaId(areaIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAreaId(@Param("updateDO") DeptDO updateDO, @Param("areaIdList") Collection<Long> areaIdList);

        public Integer updateAllFieldsByInAreaId(@Param("updateDO") DeptDO updateDO, @Param("areaIdList") Collection<Long> areaIdList);

        public Integer deleteByInAreaId(@Param("areaIdList") Collection<Long> areaIdList);

        public List<DeptDO> listByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        public Integer countByPid(@Param("pid") Long pid);

        public default DeptDO singleResultByPid(Long pid, String[] fieldNames){
             List<DeptDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByPid(Long pid, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(@Param("updateDO") DeptDO updateDO, @Param("pid") Long pid);

        public Integer updateAllFieldsByPid(@Param("updateDO") DeptDO updateDO, @Param("pid") Long pid);

        public Integer deleteByPid(@Param("pid") Long pid);




        public List<DeptDO> listByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPid(@Param("pidList") Collection<Long> pidList);

        public default DeptDO singleResultByInPid(Collection<Long> pidList, String[] fieldNames){
             List<DeptDO> list=this.listByInPid(pidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInPid(Collection<Long> pidList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInPid(pidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPid(@Param("updateDO") DeptDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer updateAllFieldsByInPid(@Param("updateDO") DeptDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer deleteByInPid(@Param("pidList") Collection<Long> pidList);

        public List<DeptDO> listBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        public Integer countBySeq(@Param("seq") Long seq);

        public default DeptDO singleResultBySeq(Long seq, String[] fieldNames){
             List<DeptDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingBySeq(Long seq, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(@Param("updateDO") DeptDO updateDO, @Param("seq") Long seq);

        public Integer updateAllFieldsBySeq(@Param("updateDO") DeptDO updateDO, @Param("seq") Long seq);

        public Integer deleteBySeq(@Param("seq") Long seq);




        public List<DeptDO> listByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSeq(@Param("seqList") Collection<Long> seqList);

        public default DeptDO singleResultByInSeq(Collection<Long> seqList, String[] fieldNames){
             List<DeptDO> list=this.listByInSeq(seqList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInSeq(Collection<Long> seqList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInSeq(seqList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSeq(@Param("updateDO") DeptDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer updateAllFieldsByInSeq(@Param("updateDO") DeptDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer deleteByInSeq(@Param("seqList") Collection<Long> seqList);

        public List<DeptDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default DeptDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<DeptDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") DeptDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") DeptDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<DeptDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default DeptDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<DeptDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") DeptDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") DeptDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<DeptDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default DeptDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<DeptDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByUserIdModified(Long userIdModified, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") DeptDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") DeptDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<DeptDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default DeptDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<DeptDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptDO, T> mapper, String[] fieldNames){
             List<DeptDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") DeptDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") DeptDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
