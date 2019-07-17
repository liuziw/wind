package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.AreaDO;
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
public interface AreaMapper extends CommonMapper<AreaDO,Long> {


        public AreaDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<AreaDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default AreaDO singleResultById(Long id, String[] fieldNames){
             List<AreaDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingById(Long id, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") AreaDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") AreaDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<AreaDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default AreaDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<AreaDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInId(Collection<Long> idList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") AreaDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") AreaDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<AreaDO> listByCode(@Param("code") Long code, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByCode(@Param("code") Long code, @Param("fieldNames") String[] fieldNames);

        public Integer countByCode(@Param("code") Long code);

        public default AreaDO singleResultByCode(Long code, String[] fieldNames){
             List<AreaDO> list=this.listByCode(code,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByCode(Long code, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByCode(code,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCode(@Param("updateDO") AreaDO updateDO, @Param("code") Long code);

        public Integer updateAllFieldsByCode(@Param("updateDO") AreaDO updateDO, @Param("code") Long code);

        public Integer deleteByCode(@Param("code") Long code);




        public List<AreaDO> listByInCode(@Param("codeList") Collection<Long> codeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInCode(@Param("codeList") Collection<Long> codeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInCode(@Param("codeList") Collection<Long> codeList);

        public default AreaDO singleResultByInCode(Collection<Long> codeList, String[] fieldNames){
             List<AreaDO> list=this.listByInCode(codeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInCode(Collection<Long> codeList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInCode(codeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInCode(@Param("updateDO") AreaDO updateDO, @Param("codeList") Collection<Long> codeList);

        public Integer updateAllFieldsByInCode(@Param("updateDO") AreaDO updateDO, @Param("codeList") Collection<Long> codeList);

        public Integer deleteByInCode(@Param("codeList") Collection<Long> codeList);

        public List<AreaDO> listByName(@Param("name") String name, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByName(@Param("name") String name, @Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default AreaDO singleResultByName(String name, String[] fieldNames){
             List<AreaDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByName(String name, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") AreaDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") AreaDO updateDO, @Param("name") String name);

        public Integer deleteByName(@Param("name") String name);




        public List<AreaDO> listByInName(@Param("nameList") Collection<String> nameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInName(@Param("nameList") Collection<String> nameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default AreaDO singleResultByInName(Collection<String> nameList, String[] fieldNames){
             List<AreaDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInName(Collection<String> nameList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") AreaDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") AreaDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName(@Param("nameList") Collection<String> nameList);

        public List<AreaDO> listByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        public Integer countByPid(@Param("pid") Long pid);

        public default AreaDO singleResultByPid(Long pid, String[] fieldNames){
             List<AreaDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByPid(Long pid, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(@Param("updateDO") AreaDO updateDO, @Param("pid") Long pid);

        public Integer updateAllFieldsByPid(@Param("updateDO") AreaDO updateDO, @Param("pid") Long pid);

        public Integer deleteByPid(@Param("pid") Long pid);




        public List<AreaDO> listByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPid(@Param("pidList") Collection<Long> pidList);

        public default AreaDO singleResultByInPid(Collection<Long> pidList, String[] fieldNames){
             List<AreaDO> list=this.listByInPid(pidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInPid(Collection<Long> pidList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInPid(pidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPid(@Param("updateDO") AreaDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer updateAllFieldsByInPid(@Param("updateDO") AreaDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer deleteByInPid(@Param("pidList") Collection<Long> pidList);

        public List<AreaDO> listByPcode(@Param("pcode") Long pcode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByPcode(@Param("pcode") Long pcode, @Param("fieldNames") String[] fieldNames);

        public Integer countByPcode(@Param("pcode") Long pcode);

        public default AreaDO singleResultByPcode(Long pcode, String[] fieldNames){
             List<AreaDO> list=this.listByPcode(pcode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByPcode(Long pcode, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByPcode(pcode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPcode(@Param("updateDO") AreaDO updateDO, @Param("pcode") Long pcode);

        public Integer updateAllFieldsByPcode(@Param("updateDO") AreaDO updateDO, @Param("pcode") Long pcode);

        public Integer deleteByPcode(@Param("pcode") Long pcode);




        public List<AreaDO> listByInPcode(@Param("pcodeList") Collection<Long> pcodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInPcode(@Param("pcodeList") Collection<Long> pcodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPcode(@Param("pcodeList") Collection<Long> pcodeList);

        public default AreaDO singleResultByInPcode(Collection<Long> pcodeList, String[] fieldNames){
             List<AreaDO> list=this.listByInPcode(pcodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInPcode(Collection<Long> pcodeList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInPcode(pcodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPcode(@Param("updateDO") AreaDO updateDO, @Param("pcodeList") Collection<Long> pcodeList);

        public Integer updateAllFieldsByInPcode(@Param("updateDO") AreaDO updateDO, @Param("pcodeList") Collection<Long> pcodeList);

        public Integer deleteByInPcode(@Param("pcodeList") Collection<Long> pcodeList);

        public List<AreaDO> listByLongitude(@Param("longitude") String longitude, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByLongitude(@Param("longitude") String longitude, @Param("fieldNames") String[] fieldNames);

        public Integer countByLongitude(@Param("longitude") String longitude);

        public default AreaDO singleResultByLongitude(String longitude, String[] fieldNames){
             List<AreaDO> list=this.listByLongitude(longitude,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLongitude(String longitude, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByLongitude(longitude,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLongitude(@Param("updateDO") AreaDO updateDO, @Param("longitude") String longitude);

        public Integer updateAllFieldsByLongitude(@Param("updateDO") AreaDO updateDO, @Param("longitude") String longitude);

        public Integer deleteByLongitude(@Param("longitude") String longitude);




        public List<AreaDO> listByInLongitude(@Param("longitudeList") Collection<String> longitudeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInLongitude(@Param("longitudeList") Collection<String> longitudeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLongitude(@Param("longitudeList") Collection<String> longitudeList);

        public default AreaDO singleResultByInLongitude(Collection<String> longitudeList, String[] fieldNames){
             List<AreaDO> list=this.listByInLongitude(longitudeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInLongitude(Collection<String> longitudeList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInLongitude(longitudeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLongitude(@Param("updateDO") AreaDO updateDO, @Param("longitudeList") Collection<String> longitudeList);

        public Integer updateAllFieldsByInLongitude(@Param("updateDO") AreaDO updateDO, @Param("longitudeList") Collection<String> longitudeList);

        public Integer deleteByInLongitude(@Param("longitudeList") Collection<String> longitudeList);

        public List<AreaDO> listByLatitude(@Param("latitude") String latitude, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByLatitude(@Param("latitude") String latitude, @Param("fieldNames") String[] fieldNames);

        public Integer countByLatitude(@Param("latitude") String latitude);

        public default AreaDO singleResultByLatitude(String latitude, String[] fieldNames){
             List<AreaDO> list=this.listByLatitude(latitude,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLatitude(String latitude, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByLatitude(latitude,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLatitude(@Param("updateDO") AreaDO updateDO, @Param("latitude") String latitude);

        public Integer updateAllFieldsByLatitude(@Param("updateDO") AreaDO updateDO, @Param("latitude") String latitude);

        public Integer deleteByLatitude(@Param("latitude") String latitude);




        public List<AreaDO> listByInLatitude(@Param("latitudeList") Collection<String> latitudeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInLatitude(@Param("latitudeList") Collection<String> latitudeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLatitude(@Param("latitudeList") Collection<String> latitudeList);

        public default AreaDO singleResultByInLatitude(Collection<String> latitudeList, String[] fieldNames){
             List<AreaDO> list=this.listByInLatitude(latitudeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInLatitude(Collection<String> latitudeList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInLatitude(latitudeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLatitude(@Param("updateDO") AreaDO updateDO, @Param("latitudeList") Collection<String> latitudeList);

        public Integer updateAllFieldsByInLatitude(@Param("updateDO") AreaDO updateDO, @Param("latitudeList") Collection<String> latitudeList);

        public Integer deleteByInLatitude(@Param("latitudeList") Collection<String> latitudeList);

        public List<AreaDO> listByLevelPath(@Param("levelPath") String levelPath, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByLevelPath(@Param("levelPath") String levelPath, @Param("fieldNames") String[] fieldNames);

        public Integer countByLevelPath(@Param("levelPath") String levelPath);

        public default AreaDO singleResultByLevelPath(String levelPath, String[] fieldNames){
             List<AreaDO> list=this.listByLevelPath(levelPath,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLevelPath(String levelPath, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByLevelPath(levelPath,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLevelPath(@Param("updateDO") AreaDO updateDO, @Param("levelPath") String levelPath);

        public Integer updateAllFieldsByLevelPath(@Param("updateDO") AreaDO updateDO, @Param("levelPath") String levelPath);

        public Integer deleteByLevelPath(@Param("levelPath") String levelPath);




        public List<AreaDO> listByInLevelPath(@Param("levelPathList") Collection<String> levelPathList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInLevelPath(@Param("levelPathList") Collection<String> levelPathList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLevelPath(@Param("levelPathList") Collection<String> levelPathList);

        public default AreaDO singleResultByInLevelPath(Collection<String> levelPathList, String[] fieldNames){
             List<AreaDO> list=this.listByInLevelPath(levelPathList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInLevelPath(Collection<String> levelPathList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInLevelPath(levelPathList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLevelPath(@Param("updateDO") AreaDO updateDO, @Param("levelPathList") Collection<String> levelPathList);

        public Integer updateAllFieldsByInLevelPath(@Param("updateDO") AreaDO updateDO, @Param("levelPathList") Collection<String> levelPathList);

        public Integer deleteByInLevelPath(@Param("levelPathList") Collection<String> levelPathList);

        public List<AreaDO> listByLevel(@Param("level") Integer level, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByLevel(@Param("level") Integer level, @Param("fieldNames") String[] fieldNames);

        public Integer countByLevel(@Param("level") Integer level);

        public default AreaDO singleResultByLevel(Integer level, String[] fieldNames){
             List<AreaDO> list=this.listByLevel(level,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByLevel(Integer level, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByLevel(level,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByLevel(@Param("updateDO") AreaDO updateDO, @Param("level") Integer level);

        public Integer updateAllFieldsByLevel(@Param("updateDO") AreaDO updateDO, @Param("level") Integer level);

        public Integer deleteByLevel(@Param("level") Integer level);




        public List<AreaDO> listByInLevel(@Param("levelList") Collection<Integer> levelList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInLevel(@Param("levelList") Collection<Integer> levelList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInLevel(@Param("levelList") Collection<Integer> levelList);

        public default AreaDO singleResultByInLevel(Collection<Integer> levelList, String[] fieldNames){
             List<AreaDO> list=this.listByInLevel(levelList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInLevel(Collection<Integer> levelList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInLevel(levelList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInLevel(@Param("updateDO") AreaDO updateDO, @Param("levelList") Collection<Integer> levelList);

        public Integer updateAllFieldsByInLevel(@Param("updateDO") AreaDO updateDO, @Param("levelList") Collection<Integer> levelList);

        public Integer deleteByInLevel(@Param("levelList") Collection<Integer> levelList);

        public List<AreaDO> listByDeep(@Param("deep") Integer deep, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByDeep(@Param("deep") Integer deep, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeep(@Param("deep") Integer deep);

        public default AreaDO singleResultByDeep(Integer deep, String[] fieldNames){
             List<AreaDO> list=this.listByDeep(deep,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByDeep(Integer deep, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByDeep(deep,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeep(@Param("updateDO") AreaDO updateDO, @Param("deep") Integer deep);

        public Integer updateAllFieldsByDeep(@Param("updateDO") AreaDO updateDO, @Param("deep") Integer deep);

        public Integer deleteByDeep(@Param("deep") Integer deep);




        public List<AreaDO> listByInDeep(@Param("deepList") Collection<Integer> deepList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInDeep(@Param("deepList") Collection<Integer> deepList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeep(@Param("deepList") Collection<Integer> deepList);

        public default AreaDO singleResultByInDeep(Collection<Integer> deepList, String[] fieldNames){
             List<AreaDO> list=this.listByInDeep(deepList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInDeep(Collection<Integer> deepList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInDeep(deepList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeep(@Param("updateDO") AreaDO updateDO, @Param("deepList") Collection<Integer> deepList);

        public Integer updateAllFieldsByInDeep(@Param("updateDO") AreaDO updateDO, @Param("deepList") Collection<Integer> deepList);

        public Integer deleteByInDeep(@Param("deepList") Collection<Integer> deepList);

        public List<AreaDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default AreaDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<AreaDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByUserIdCreate(Long userIdCreate, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") AreaDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") AreaDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<AreaDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default AreaDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<AreaDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") AreaDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") AreaDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<AreaDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default AreaDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<AreaDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByUserIdModified(Long userIdModified, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") AreaDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") AreaDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<AreaDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AreaDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default AreaDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<AreaDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AreaDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<AreaDO, T> mapper, String[] fieldNames){
             List<AreaDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") AreaDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") AreaDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
