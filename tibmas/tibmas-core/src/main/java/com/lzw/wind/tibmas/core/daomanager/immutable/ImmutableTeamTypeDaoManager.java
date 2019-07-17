package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamTypeDO;
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
public interface ImmutableTeamTypeDaoManager extends CommonDaoManager<TeamTypeDO,Long> {


        public List<TeamTypeDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Map<Long,TeamTypeDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Integer countByTeamTypeCode(String teamTypeCode);

        public default TeamTypeDO singleResultByTeamTypeCode(String teamTypeCode, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeCode(String teamTypeCode, Function<TeamTypeDO, T> mapper, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(TeamTypeDO updateDO, String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(TeamTypeDO updateDO, String teamTypeCode);

        public Integer deleteByTeamTypeCode(String teamTypeCode);






        public List<TeamTypeDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Map<Long,TeamTypeDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList);

         public default TeamTypeDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<TeamTypeDO, T> mapper, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamTypeCode(TeamTypeDO updateDO, Collection<String> teamTypeCodeList);

         public Integer updateAllFieldsByInTeamTypeCode(TeamTypeDO updateDO, Collection<String> teamTypeCodeList);

         public Integer deleteByInTeamTypeCode(Collection<String> teamTypeCodeList);
        public List<TeamTypeDO> listByTeamTypeName(String teamTypeName, String... fieldNames);

        public Map<Long,TeamTypeDO> mapByTeamTypeName(String teamTypeName, String... fieldNames);

        public Integer countByTeamTypeName(String teamTypeName);

        public default TeamTypeDO singleResultByTeamTypeName(String teamTypeName, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeName(teamTypeName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeName(String teamTypeName, Function<TeamTypeDO, T> mapper, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeName(teamTypeName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeName(TeamTypeDO updateDO, String teamTypeName);

        public Integer updateAllFieldsByTeamTypeName(TeamTypeDO updateDO, String teamTypeName);

        public Integer deleteByTeamTypeName(String teamTypeName);






        public List<TeamTypeDO> listByInTeamTypeName(Collection<String> teamTypeNameList, String... fieldNames);

         public Map<Long,TeamTypeDO> mapByInTeamTypeName(Collection<String> teamTypeNameList, String... fieldNames);

         public Integer countByInTeamTypeName(Collection<String> teamTypeNameList);

         public default TeamTypeDO singleResultByInTeamTypeName(Collection<String> teamTypeNameList, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeName(teamTypeNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeName(Collection<String> teamTypeNameList, Function<TeamTypeDO, T> mapper, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeName(teamTypeNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamTypeName(TeamTypeDO updateDO, Collection<String> teamTypeNameList);

         public Integer updateAllFieldsByInTeamTypeName(TeamTypeDO updateDO, Collection<String> teamTypeNameList);

         public Integer deleteByInTeamTypeName(Collection<String> teamTypeNameList);
        public List<TeamTypeDO> listByTeamTypeRepeat(Integer teamTypeRepeat, String... fieldNames);

        public Map<Long,TeamTypeDO> mapByTeamTypeRepeat(Integer teamTypeRepeat, String... fieldNames);

        public Integer countByTeamTypeRepeat(Integer teamTypeRepeat);

        public default TeamTypeDO singleResultByTeamTypeRepeat(Integer teamTypeRepeat, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeRepeat(teamTypeRepeat,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamTypeDO>> groupingByTeamTypeRepeat(Integer teamTypeRepeat, Function<TeamTypeDO, T> mapper, String... fieldNames){
             List<TeamTypeDO> list=this.listByTeamTypeRepeat(teamTypeRepeat,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeRepeat(TeamTypeDO updateDO, Integer teamTypeRepeat);

        public Integer updateAllFieldsByTeamTypeRepeat(TeamTypeDO updateDO, Integer teamTypeRepeat);

        public Integer deleteByTeamTypeRepeat(Integer teamTypeRepeat);






        public List<TeamTypeDO> listByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String... fieldNames);

         public Map<Long,TeamTypeDO> mapByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String... fieldNames);

         public Integer countByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList);

         public default TeamTypeDO singleResultByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeRepeat(teamTypeRepeatList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamTypeDO>> groupingByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, Function<TeamTypeDO, T> mapper, String... fieldNames){
              List<TeamTypeDO> list=this.listByInTeamTypeRepeat(teamTypeRepeatList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamTypeRepeat(TeamTypeDO updateDO, Collection<Integer> teamTypeRepeatList);

         public Integer updateAllFieldsByInTeamTypeRepeat(TeamTypeDO updateDO, Collection<Integer> teamTypeRepeatList);

         public Integer deleteByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList);


}

