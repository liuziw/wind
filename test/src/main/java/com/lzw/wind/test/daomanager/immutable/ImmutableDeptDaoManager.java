package com.lzw.wind.test.daomanager.immutable;

import com.lzw.wind.test.dbo.DeptDO;
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
public interface ImmutableDeptDaoManager extends CommonDaoManager<DeptDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public DeptDO getById(Long id);

        public List<DeptDO> listById(Long id, String... fieldNames);

        public Map<Long,DeptDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default DeptDO singleResultById(Long id,String... fieldNames){
             List<DeptDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingById(Long id, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(DeptDO updateDO, Long id);

        public Integer updateAllFieldsById(DeptDO updateDO,  Long id);

        public Integer deleteById( Long id);






        public List<DeptDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,DeptDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default DeptDO singleResultByInId(Collection<Long> idList,String... fieldNames){
              List<DeptDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInId(Collection<Long> idList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(DeptDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(DeptDO updateDO,  Collection<Long> idList);

         public Integer deleteByInId( Collection<Long> idList);
        public List<DeptDO> listByDeptCode(String deptCode, String... fieldNames);

        public Map<Long,DeptDO> mapByDeptCode(String deptCode, String... fieldNames);

        public Integer countByDeptCode(String deptCode);

        public default DeptDO singleResultByDeptCode(String deptCode,String... fieldNames){
             List<DeptDO> list=this.listByDeptCode(deptCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptCode(String deptCode, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByDeptCode(deptCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptCode(DeptDO updateDO, String deptCode);

        public Integer updateAllFieldsByDeptCode(DeptDO updateDO,  String deptCode);

        public Integer deleteByDeptCode( String deptCode);






        public List<DeptDO> listByInDeptCode(Collection<String> deptCodeList, String... fieldNames);

         public Map<Long,DeptDO> mapByInDeptCode(Collection<String> deptCodeList, String... fieldNames);

         public Integer countByInDeptCode(Collection<String> deptCodeList);

         public default DeptDO singleResultByInDeptCode(Collection<String> deptCodeList,String... fieldNames){
              List<DeptDO> list=this.listByInDeptCode(deptCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInDeptCode(Collection<String> deptCodeList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInDeptCode(deptCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptCode(DeptDO updateDO, Collection<String> deptCodeList);

         public Integer updateAllFieldsByInDeptCode(DeptDO updateDO,  Collection<String> deptCodeList);

         public Integer deleteByInDeptCode( Collection<String> deptCodeList);
        public List<DeptDO> listByDeptName(String deptName, String... fieldNames);

        public Map<Long,DeptDO> mapByDeptName(String deptName, String... fieldNames);

        public Integer countByDeptName(String deptName);

        public default DeptDO singleResultByDeptName(String deptName,String... fieldNames){
             List<DeptDO> list=this.listByDeptName(deptName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptName(String deptName, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByDeptName(deptName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptName(DeptDO updateDO, String deptName);

        public Integer updateAllFieldsByDeptName(DeptDO updateDO,  String deptName);

        public Integer deleteByDeptName( String deptName);






        public List<DeptDO> listByInDeptName(Collection<String> deptNameList, String... fieldNames);

         public Map<Long,DeptDO> mapByInDeptName(Collection<String> deptNameList, String... fieldNames);

         public Integer countByInDeptName(Collection<String> deptNameList);

         public default DeptDO singleResultByInDeptName(Collection<String> deptNameList,String... fieldNames){
              List<DeptDO> list=this.listByInDeptName(deptNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInDeptName(Collection<String> deptNameList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInDeptName(deptNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptName(DeptDO updateDO, Collection<String> deptNameList);

         public Integer updateAllFieldsByInDeptName(DeptDO updateDO,  Collection<String> deptNameList);

         public Integer deleteByInDeptName( Collection<String> deptNameList);
        public List<DeptDO> listByDeptDescribe(String deptDescribe, String... fieldNames);

        public Map<Long,DeptDO> mapByDeptDescribe(String deptDescribe, String... fieldNames);

        public Integer countByDeptDescribe(String deptDescribe);

        public default DeptDO singleResultByDeptDescribe(String deptDescribe,String... fieldNames){
             List<DeptDO> list=this.listByDeptDescribe(deptDescribe,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptDescribe(String deptDescribe, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByDeptDescribe(deptDescribe,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptDescribe(DeptDO updateDO, String deptDescribe);

        public Integer updateAllFieldsByDeptDescribe(DeptDO updateDO,  String deptDescribe);

        public Integer deleteByDeptDescribe( String deptDescribe);






        public List<DeptDO> listByInDeptDescribe(Collection<String> deptDescribeList, String... fieldNames);

         public Map<Long,DeptDO> mapByInDeptDescribe(Collection<String> deptDescribeList, String... fieldNames);

         public Integer countByInDeptDescribe(Collection<String> deptDescribeList);

         public default DeptDO singleResultByInDeptDescribe(Collection<String> deptDescribeList,String... fieldNames){
              List<DeptDO> list=this.listByInDeptDescribe(deptDescribeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInDeptDescribe(Collection<String> deptDescribeList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInDeptDescribe(deptDescribeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptDescribe(DeptDO updateDO, Collection<String> deptDescribeList);

         public Integer updateAllFieldsByInDeptDescribe(DeptDO updateDO,  Collection<String> deptDescribeList);

         public Integer deleteByInDeptDescribe( Collection<String> deptDescribeList);
        public List<DeptDO> listByDeptType(Integer deptType, String... fieldNames);

        public Map<Long,DeptDO> mapByDeptType(Integer deptType, String... fieldNames);

        public Integer countByDeptType(Integer deptType);

        public default DeptDO singleResultByDeptType(Integer deptType,String... fieldNames){
             List<DeptDO> list=this.listByDeptType(deptType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByDeptType(Integer deptType, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByDeptType(deptType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptType(DeptDO updateDO, Integer deptType);

        public Integer updateAllFieldsByDeptType(DeptDO updateDO,  Integer deptType);

        public Integer deleteByDeptType( Integer deptType);






        public List<DeptDO> listByInDeptType(Collection<Integer> deptTypeList, String... fieldNames);

         public Map<Long,DeptDO> mapByInDeptType(Collection<Integer> deptTypeList, String... fieldNames);

         public Integer countByInDeptType(Collection<Integer> deptTypeList);

         public default DeptDO singleResultByInDeptType(Collection<Integer> deptTypeList,String... fieldNames){
              List<DeptDO> list=this.listByInDeptType(deptTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInDeptType(Collection<Integer> deptTypeList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInDeptType(deptTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptType(DeptDO updateDO, Collection<Integer> deptTypeList);

         public Integer updateAllFieldsByInDeptType(DeptDO updateDO,  Collection<Integer> deptTypeList);

         public Integer deleteByInDeptType( Collection<Integer> deptTypeList);
        public List<DeptDO> listByAreaId(Long areaId, String... fieldNames);

        public Map<Long,DeptDO> mapByAreaId(Long areaId, String... fieldNames);

        public Integer countByAreaId(Long areaId);

        public default DeptDO singleResultByAreaId(Long areaId,String... fieldNames){
             List<DeptDO> list=this.listByAreaId(areaId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByAreaId(Long areaId, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByAreaId(areaId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAreaId(DeptDO updateDO, Long areaId);

        public Integer updateAllFieldsByAreaId(DeptDO updateDO,  Long areaId);

        public Integer deleteByAreaId( Long areaId);






        public List<DeptDO> listByInAreaId(Collection<Long> areaIdList, String... fieldNames);

         public Map<Long,DeptDO> mapByInAreaId(Collection<Long> areaIdList, String... fieldNames);

         public Integer countByInAreaId(Collection<Long> areaIdList);

         public default DeptDO singleResultByInAreaId(Collection<Long> areaIdList,String... fieldNames){
              List<DeptDO> list=this.listByInAreaId(areaIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInAreaId(Collection<Long> areaIdList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInAreaId(areaIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAreaId(DeptDO updateDO, Collection<Long> areaIdList);

         public Integer updateAllFieldsByInAreaId(DeptDO updateDO,  Collection<Long> areaIdList);

         public Integer deleteByInAreaId( Collection<Long> areaIdList);
        public List<DeptDO> listByPid(Long pid, String... fieldNames);

        public Map<Long,DeptDO> mapByPid(Long pid, String... fieldNames);

        public Integer countByPid(Long pid);

        public default DeptDO singleResultByPid(Long pid,String... fieldNames){
             List<DeptDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByPid(Long pid, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(DeptDO updateDO, Long pid);

        public Integer updateAllFieldsByPid(DeptDO updateDO,  Long pid);

        public Integer deleteByPid( Long pid);






        public List<DeptDO> listByInPid(Collection<Long> pidList, String... fieldNames);

         public Map<Long,DeptDO> mapByInPid(Collection<Long> pidList, String... fieldNames);

         public Integer countByInPid(Collection<Long> pidList);

         public default DeptDO singleResultByInPid(Collection<Long> pidList,String... fieldNames){
              List<DeptDO> list=this.listByInPid(pidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInPid(Collection<Long> pidList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInPid(pidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPid(DeptDO updateDO, Collection<Long> pidList);

         public Integer updateAllFieldsByInPid(DeptDO updateDO,  Collection<Long> pidList);

         public Integer deleteByInPid( Collection<Long> pidList);
        public List<DeptDO> listBySeq(Long seq, String... fieldNames);

        public Map<Long,DeptDO> mapBySeq(Long seq, String... fieldNames);

        public Integer countBySeq(Long seq);

        public default DeptDO singleResultBySeq(Long seq,String... fieldNames){
             List<DeptDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingBySeq(Long seq, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(DeptDO updateDO, Long seq);

        public Integer updateAllFieldsBySeq(DeptDO updateDO,  Long seq);

        public Integer deleteBySeq( Long seq);






        public List<DeptDO> listByInSeq(Collection<Long> seqList, String... fieldNames);

         public Map<Long,DeptDO> mapByInSeq(Collection<Long> seqList, String... fieldNames);

         public Integer countByInSeq(Collection<Long> seqList);

         public default DeptDO singleResultByInSeq(Collection<Long> seqList,String... fieldNames){
              List<DeptDO> list=this.listByInSeq(seqList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInSeq(Collection<Long> seqList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInSeq(seqList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSeq(DeptDO updateDO, Collection<Long> seqList);

         public Integer updateAllFieldsByInSeq(DeptDO updateDO,  Collection<Long> seqList);

         public Integer deleteByInSeq( Collection<Long> seqList);
        public List<DeptDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,DeptDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default DeptDO singleResultByUserIdCreate(Long userIdCreate,String... fieldNames){
             List<DeptDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(DeptDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(DeptDO updateDO,  Long userIdCreate);

        public Integer deleteByUserIdCreate( Long userIdCreate);






        public List<DeptDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,DeptDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default DeptDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList,String... fieldNames){
              List<DeptDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(DeptDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(DeptDO updateDO,  Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList);
        public List<DeptDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,DeptDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default DeptDO singleResultByUserIdModified(Long userIdModified,String... fieldNames){
             List<DeptDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptDO>> groupingByUserIdModified(Long userIdModified, Function<DeptDO, T> mapper, String... fieldNames){
             List<DeptDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(DeptDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(DeptDO updateDO,  Long userIdModified);

        public Integer deleteByUserIdModified( Long userIdModified);






        public List<DeptDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,DeptDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default DeptDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList,String... fieldNames){
              List<DeptDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptDO, T> mapper, String... fieldNames){
              List<DeptDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(DeptDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(DeptDO updateDO,  Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList);


}

