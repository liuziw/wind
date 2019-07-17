package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.TeamTypeDO;
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
public interface TeamTypeMapper extends CommonMapper<TeamTypeDO,Long> {

        public List<TeamTypeDO> listByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);

        public default TeamTypeDO singleResultByTeamTypeCode(String teamTypeCode, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeCode(String teamTypeCode, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer deleteByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);




        public List<TeamTypeDO> listByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public default TeamTypeDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamTypeCode(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer updateAllFieldsByInTeamTypeCode(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer deleteByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public List<TeamTypeDO> listByTeamTypeName(@Param("teamTypeName") String teamTypeName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByTeamTypeName(@Param("teamTypeName") String teamTypeName, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamTypeName(@Param("teamTypeName") String teamTypeName);

        public default TeamTypeDO singleResultByTeamTypeName(String teamTypeName, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeName(teamTypeName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeName(String teamTypeName, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeName(teamTypeName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeName(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeName") String teamTypeName);

        public Integer updateAllFieldsByTeamTypeName(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeName") String teamTypeName);

        public Integer deleteByTeamTypeName(@Param("teamTypeName") String teamTypeName);




        public List<TeamTypeDO> listByInTeamTypeName(@Param("teamTypeNameList") Collection<String> teamTypeNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByInTeamTypeName(@Param("teamTypeNameList") Collection<String> teamTypeNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamTypeName(@Param("teamTypeNameList") Collection<String> teamTypeNameList);

        public default TeamTypeDO singleResultByInTeamTypeName(Collection<String> teamTypeNameList, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeName(teamTypeNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeName(Collection<String> teamTypeNameList, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeName(teamTypeNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamTypeName(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeNameList") Collection<String> teamTypeNameList);

        public Integer updateAllFieldsByInTeamTypeName(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeNameList") Collection<String> teamTypeNameList);

        public Integer deleteByInTeamTypeName(@Param("teamTypeNameList") Collection<String> teamTypeNameList);

        public List<TeamTypeDO> listByTeamTypeRepeat(@Param("teamTypeRepeat") Integer teamTypeRepeat, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByTeamTypeRepeat(@Param("teamTypeRepeat") Integer teamTypeRepeat, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamTypeRepeat(@Param("teamTypeRepeat") Integer teamTypeRepeat);

        public default TeamTypeDO singleResultByTeamTypeRepeat(Integer teamTypeRepeat, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeRepeat(teamTypeRepeat,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeRepeat(Integer teamTypeRepeat, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeRepeat(teamTypeRepeat,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeRepeat(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeRepeat") Integer teamTypeRepeat);

        public Integer updateAllFieldsByTeamTypeRepeat(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeRepeat") Integer teamTypeRepeat);

        public Integer deleteByTeamTypeRepeat(@Param("teamTypeRepeat") Integer teamTypeRepeat);




        public List<TeamTypeDO> listByInTeamTypeRepeat(@Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamTypeDO> mapByInTeamTypeRepeat(@Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamTypeRepeat(@Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList);

        public default TeamTypeDO singleResultByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeRepeat(teamTypeRepeatList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, Function<TeamTypeDO, T> mapper, String[] fieldNames){
             List<TeamTypeDO> list=this.listByInTeamTypeRepeat(teamTypeRepeatList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamTypeRepeat(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList);

        public Integer updateAllFieldsByInTeamTypeRepeat(@Param("updateDO") TeamTypeDO updateDO, @Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList);

        public Integer deleteByInTeamTypeRepeat(@Param("teamTypeRepeatList") Collection<Integer> teamTypeRepeatList);


}
