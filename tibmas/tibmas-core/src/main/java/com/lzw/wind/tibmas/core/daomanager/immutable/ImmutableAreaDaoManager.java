package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.AreaDO;
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
public interface ImmutableAreaDaoManager extends CommonDaoManager<AreaDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public AreaDO getById(Long id);

        public List<AreaDO> listById(Long id, String... fieldNames);

        public Map<Long,AreaDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default AreaDO singleResultById(Long id, String... fieldNames){
             List<AreaDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingById(Long id, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(AreaDO updateDO, Long id);

        public Integer updateAllFieldsById(AreaDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<AreaDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,AreaDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default AreaDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<AreaDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInId(Collection<Long> idList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(AreaDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(AreaDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<AreaDO> listByCode(Long code, String... fieldNames);

        public Map<Long,AreaDO> mapByCode(Long code, String... fieldNames);

        public Integer countByCode(Long code);

        public default AreaDO singleResultByCode(Long code, String... fieldNames){
             List<AreaDO> list=this.listByCode(code,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByCode(Long code, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByCode(code,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCode(AreaDO updateDO, Long code);

        public Integer updateAllFieldsByCode(AreaDO updateDO, Long code);

        public Integer deleteByCode(Long code);






        public List<AreaDO> listByInCode(Collection<Long> codeList, String... fieldNames);

         public Map<Long,AreaDO> mapByInCode(Collection<Long> codeList, String... fieldNames);

         public Integer countByInCode(Collection<Long> codeList);

         public default AreaDO singleResultByInCode(Collection<Long> codeList, String... fieldNames){
              List<AreaDO> list=this.listByInCode(codeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInCode(Collection<Long> codeList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInCode(codeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInCode(AreaDO updateDO, Collection<Long> codeList);

         public Integer updateAllFieldsByInCode(AreaDO updateDO, Collection<Long> codeList);

         public Integer deleteByInCode(Collection<Long> codeList);
        public List<AreaDO> listByName(String name, String... fieldNames);

        public Map<Long,AreaDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default AreaDO singleResultByName(String name, String... fieldNames){
             List<AreaDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByName(String name, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(AreaDO updateDO, String name);

        public Integer updateAllFieldsByName(AreaDO updateDO, String name);

        public Integer deleteByName(String name);






        public List<AreaDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,AreaDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default AreaDO singleResultByInName(Collection<String> nameList, String... fieldNames){
              List<AreaDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInName(Collection<String> nameList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(AreaDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(AreaDO updateDO, Collection<String> nameList);

         public Integer deleteByInName(Collection<String> nameList);
        public List<AreaDO> listByPid(Long pid, String... fieldNames);

        public Map<Long,AreaDO> mapByPid(Long pid, String... fieldNames);

        public Integer countByPid(Long pid);

        public default AreaDO singleResultByPid(Long pid, String... fieldNames){
             List<AreaDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByPid(Long pid, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(AreaDO updateDO, Long pid);

        public Integer updateAllFieldsByPid(AreaDO updateDO, Long pid);

        public Integer deleteByPid(Long pid);






        public List<AreaDO> listByInPid(Collection<Long> pidList, String... fieldNames);

         public Map<Long,AreaDO> mapByInPid(Collection<Long> pidList, String... fieldNames);

         public Integer countByInPid(Collection<Long> pidList);

         public default AreaDO singleResultByInPid(Collection<Long> pidList, String... fieldNames){
              List<AreaDO> list=this.listByInPid(pidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInPid(Collection<Long> pidList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInPid(pidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPid(AreaDO updateDO, Collection<Long> pidList);

         public Integer updateAllFieldsByInPid(AreaDO updateDO, Collection<Long> pidList);

         public Integer deleteByInPid(Collection<Long> pidList);
        public List<AreaDO> listByPcode(Long pcode, String... fieldNames);

        public Map<Long,AreaDO> mapByPcode(Long pcode, String... fieldNames);

        public Integer countByPcode(Long pcode);

        public default AreaDO singleResultByPcode(Long pcode, String... fieldNames){
             List<AreaDO> list=this.listByPcode(pcode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByPcode(Long pcode, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByPcode(pcode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPcode(AreaDO updateDO, Long pcode);

        public Integer updateAllFieldsByPcode(AreaDO updateDO, Long pcode);

        public Integer deleteByPcode(Long pcode);






        public List<AreaDO> listByInPcode(Collection<Long> pcodeList, String... fieldNames);

         public Map<Long,AreaDO> mapByInPcode(Collection<Long> pcodeList, String... fieldNames);

         public Integer countByInPcode(Collection<Long> pcodeList);

         public default AreaDO singleResultByInPcode(Collection<Long> pcodeList, String... fieldNames){
              List<AreaDO> list=this.listByInPcode(pcodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInPcode(Collection<Long> pcodeList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInPcode(pcodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPcode(AreaDO updateDO, Collection<Long> pcodeList);

         public Integer updateAllFieldsByInPcode(AreaDO updateDO, Collection<Long> pcodeList);

         public Integer deleteByInPcode(Collection<Long> pcodeList);
        public List<AreaDO> listByLongitude(String longitude, String... fieldNames);

        public Map<Long,AreaDO> mapByLongitude(String longitude, String... fieldNames);

        public Integer countByLongitude(String longitude);

        public default AreaDO singleResultByLongitude(String longitude, String... fieldNames){
             List<AreaDO> list=this.listByLongitude(longitude,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLongitude(String longitude, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByLongitude(longitude,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLongitude(AreaDO updateDO, String longitude);

        public Integer updateAllFieldsByLongitude(AreaDO updateDO, String longitude);

        public Integer deleteByLongitude(String longitude);






        public List<AreaDO> listByInLongitude(Collection<String> longitudeList, String... fieldNames);

         public Map<Long,AreaDO> mapByInLongitude(Collection<String> longitudeList, String... fieldNames);

         public Integer countByInLongitude(Collection<String> longitudeList);

         public default AreaDO singleResultByInLongitude(Collection<String> longitudeList, String... fieldNames){
              List<AreaDO> list=this.listByInLongitude(longitudeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInLongitude(Collection<String> longitudeList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInLongitude(longitudeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLongitude(AreaDO updateDO, Collection<String> longitudeList);

         public Integer updateAllFieldsByInLongitude(AreaDO updateDO, Collection<String> longitudeList);

         public Integer deleteByInLongitude(Collection<String> longitudeList);
        public List<AreaDO> listByLatitude(String latitude, String... fieldNames);

        public Map<Long,AreaDO> mapByLatitude(String latitude, String... fieldNames);

        public Integer countByLatitude(String latitude);

        public default AreaDO singleResultByLatitude(String latitude, String... fieldNames){
             List<AreaDO> list=this.listByLatitude(latitude,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLatitude(String latitude, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByLatitude(latitude,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLatitude(AreaDO updateDO, String latitude);

        public Integer updateAllFieldsByLatitude(AreaDO updateDO, String latitude);

        public Integer deleteByLatitude(String latitude);






        public List<AreaDO> listByInLatitude(Collection<String> latitudeList, String... fieldNames);

         public Map<Long,AreaDO> mapByInLatitude(Collection<String> latitudeList, String... fieldNames);

         public Integer countByInLatitude(Collection<String> latitudeList);

         public default AreaDO singleResultByInLatitude(Collection<String> latitudeList, String... fieldNames){
              List<AreaDO> list=this.listByInLatitude(latitudeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInLatitude(Collection<String> latitudeList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInLatitude(latitudeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLatitude(AreaDO updateDO, Collection<String> latitudeList);

         public Integer updateAllFieldsByInLatitude(AreaDO updateDO, Collection<String> latitudeList);

         public Integer deleteByInLatitude(Collection<String> latitudeList);
        public List<AreaDO> listByLevelPath(String levelPath, String... fieldNames);

        public Map<Long,AreaDO> mapByLevelPath(String levelPath, String... fieldNames);

        public Integer countByLevelPath(String levelPath);

        public default AreaDO singleResultByLevelPath(String levelPath, String... fieldNames){
             List<AreaDO> list=this.listByLevelPath(levelPath,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLevelPath(String levelPath, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByLevelPath(levelPath,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLevelPath(AreaDO updateDO, String levelPath);

        public Integer updateAllFieldsByLevelPath(AreaDO updateDO, String levelPath);

        public Integer deleteByLevelPath(String levelPath);






        public List<AreaDO> listByInLevelPath(Collection<String> levelPathList, String... fieldNames);

         public Map<Long,AreaDO> mapByInLevelPath(Collection<String> levelPathList, String... fieldNames);

         public Integer countByInLevelPath(Collection<String> levelPathList);

         public default AreaDO singleResultByInLevelPath(Collection<String> levelPathList, String... fieldNames){
              List<AreaDO> list=this.listByInLevelPath(levelPathList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInLevelPath(Collection<String> levelPathList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInLevelPath(levelPathList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLevelPath(AreaDO updateDO, Collection<String> levelPathList);

         public Integer updateAllFieldsByInLevelPath(AreaDO updateDO, Collection<String> levelPathList);

         public Integer deleteByInLevelPath(Collection<String> levelPathList);
        public List<AreaDO> listByLevel(Integer level, String... fieldNames);

        public Map<Long,AreaDO> mapByLevel(Integer level, String... fieldNames);

        public Integer countByLevel(Integer level);

        public default AreaDO singleResultByLevel(Integer level, String... fieldNames){
             List<AreaDO> list=this.listByLevel(level,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLevel(Integer level, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByLevel(level,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLevel(AreaDO updateDO, Integer level);

        public Integer updateAllFieldsByLevel(AreaDO updateDO, Integer level);

        public Integer deleteByLevel(Integer level);






        public List<AreaDO> listByInLevel(Collection<Integer> levelList, String... fieldNames);

         public Map<Long,AreaDO> mapByInLevel(Collection<Integer> levelList, String... fieldNames);

         public Integer countByInLevel(Collection<Integer> levelList);

         public default AreaDO singleResultByInLevel(Collection<Integer> levelList, String... fieldNames){
              List<AreaDO> list=this.listByInLevel(levelList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInLevel(Collection<Integer> levelList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInLevel(levelList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInLevel(AreaDO updateDO, Collection<Integer> levelList);

         public Integer updateAllFieldsByInLevel(AreaDO updateDO, Collection<Integer> levelList);

         public Integer deleteByInLevel(Collection<Integer> levelList);
        public List<AreaDO> listByDeep(Integer deep, String... fieldNames);

        public Map<Long,AreaDO> mapByDeep(Integer deep, String... fieldNames);

        public Integer countByDeep(Integer deep);

        public default AreaDO singleResultByDeep(Integer deep, String... fieldNames){
             List<AreaDO> list=this.listByDeep(deep,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByDeep(Integer deep, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByDeep(deep,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeep(AreaDO updateDO, Integer deep);

        public Integer updateAllFieldsByDeep(AreaDO updateDO, Integer deep);

        public Integer deleteByDeep(Integer deep);






        public List<AreaDO> listByInDeep(Collection<Integer> deepList, String... fieldNames);

         public Map<Long,AreaDO> mapByInDeep(Collection<Integer> deepList, String... fieldNames);

         public Integer countByInDeep(Collection<Integer> deepList);

         public default AreaDO singleResultByInDeep(Collection<Integer> deepList, String... fieldNames){
              List<AreaDO> list=this.listByInDeep(deepList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInDeep(Collection<Integer> deepList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInDeep(deepList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeep(AreaDO updateDO, Collection<Integer> deepList);

         public Integer updateAllFieldsByInDeep(AreaDO updateDO, Collection<Integer> deepList);

         public Integer deleteByInDeep(Collection<Integer> deepList);
        public List<AreaDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,AreaDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default AreaDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<AreaDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByUserIdCreate(Long userIdCreate, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(AreaDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(AreaDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<AreaDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,AreaDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default AreaDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<AreaDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(AreaDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(AreaDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<AreaDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,AreaDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default AreaDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<AreaDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByUserIdModified(Long userIdModified, Function<AreaDO, T> mapper, String... fieldNames){
             List<AreaDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(AreaDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(AreaDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<AreaDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,AreaDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default AreaDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<AreaDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AreaDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<AreaDO, T> mapper, String... fieldNames){
              List<AreaDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(AreaDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(AreaDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

