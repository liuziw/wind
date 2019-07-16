package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.TeamDO;
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
public interface TeamMapper extends CommonMapper<TeamDO,Long> {


        public TeamDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<TeamDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default TeamDO singleResultById(Long id, String[] fieldNames){
             List<TeamDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingById(Long id, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") TeamDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") TeamDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<TeamDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default TeamDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<TeamDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInId(Collection<Long> idList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") TeamDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") TeamDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<TeamDO> listByTeamName(@Param("teamName") String teamName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamName(@Param("teamName") String teamName, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamName(@Param("teamName") String teamName);

        public default TeamDO singleResultByTeamName(String teamName, String[] fieldNames){
             List<TeamDO> list=this.listByTeamName(teamName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamName(String teamName, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamName(teamName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamName(@Param("updateDO") TeamDO updateDO, @Param("teamName") String teamName);

        public Integer updateAllFieldsByTeamName(@Param("updateDO") TeamDO updateDO, @Param("teamName") String teamName);

        public Integer deleteByTeamName(@Param("teamName") String teamName);




        public List<TeamDO> listByInTeamName(@Param("teamNameList") Collection<String> teamNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamName(@Param("teamNameList") Collection<String> teamNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamName(@Param("teamNameList") Collection<String> teamNameList);

        public default TeamDO singleResultByInTeamName(Collection<String> teamNameList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamName(teamNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamName(Collection<String> teamNameList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamName(teamNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamName(@Param("updateDO") TeamDO updateDO, @Param("teamNameList") Collection<String> teamNameList);

        public Integer updateAllFieldsByInTeamName(@Param("updateDO") TeamDO updateDO, @Param("teamNameList") Collection<String> teamNameList);

        public Integer deleteByInTeamName(@Param("teamNameList") Collection<String> teamNameList);

        public List<TeamDO> listByTeamDesc(@Param("teamDesc") String teamDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamDesc(@Param("teamDesc") String teamDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamDesc(@Param("teamDesc") String teamDesc);

        public default TeamDO singleResultByTeamDesc(String teamDesc, String[] fieldNames){
             List<TeamDO> list=this.listByTeamDesc(teamDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamDesc(String teamDesc, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamDesc(teamDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamDesc(@Param("updateDO") TeamDO updateDO, @Param("teamDesc") String teamDesc);

        public Integer updateAllFieldsByTeamDesc(@Param("updateDO") TeamDO updateDO, @Param("teamDesc") String teamDesc);

        public Integer deleteByTeamDesc(@Param("teamDesc") String teamDesc);




        public List<TeamDO> listByInTeamDesc(@Param("teamDescList") Collection<String> teamDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamDesc(@Param("teamDescList") Collection<String> teamDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamDesc(@Param("teamDescList") Collection<String> teamDescList);

        public default TeamDO singleResultByInTeamDesc(Collection<String> teamDescList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamDesc(teamDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamDesc(Collection<String> teamDescList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamDesc(teamDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamDesc(@Param("updateDO") TeamDO updateDO, @Param("teamDescList") Collection<String> teamDescList);

        public Integer updateAllFieldsByInTeamDesc(@Param("updateDO") TeamDO updateDO, @Param("teamDescList") Collection<String> teamDescList);

        public Integer deleteByInTeamDesc(@Param("teamDescList") Collection<String> teamDescList);

        public List<TeamDO> listByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);

        public default TeamDO singleResultByTeamTypeCode(String teamTypeCode, String[] fieldNames){
             List<TeamDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamTypeCode(String teamTypeCode, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(@Param("updateDO") TeamDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(@Param("updateDO") TeamDO updateDO, @Param("teamTypeCode") String teamTypeCode);

        public Integer deleteByTeamTypeCode(@Param("teamTypeCode") String teamTypeCode);




        public List<TeamDO> listByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public default TeamDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamTypeCode(@Param("updateDO") TeamDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer updateAllFieldsByInTeamTypeCode(@Param("updateDO") TeamDO updateDO, @Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public Integer deleteByInTeamTypeCode(@Param("teamTypeCodeList") Collection<String> teamTypeCodeList);

        public List<TeamDO> listByTeamLeaderId(@Param("teamLeaderId") Long teamLeaderId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamLeaderId(@Param("teamLeaderId") Long teamLeaderId, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamLeaderId(@Param("teamLeaderId") Long teamLeaderId);

        public default TeamDO singleResultByTeamLeaderId(Long teamLeaderId, String[] fieldNames){
             List<TeamDO> list=this.listByTeamLeaderId(teamLeaderId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamLeaderId(Long teamLeaderId, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamLeaderId(teamLeaderId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamLeaderId(@Param("updateDO") TeamDO updateDO, @Param("teamLeaderId") Long teamLeaderId);

        public Integer updateAllFieldsByTeamLeaderId(@Param("updateDO") TeamDO updateDO, @Param("teamLeaderId") Long teamLeaderId);

        public Integer deleteByTeamLeaderId(@Param("teamLeaderId") Long teamLeaderId);




        public List<TeamDO> listByInTeamLeaderId(@Param("teamLeaderIdList") Collection<Long> teamLeaderIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamLeaderId(@Param("teamLeaderIdList") Collection<Long> teamLeaderIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamLeaderId(@Param("teamLeaderIdList") Collection<Long> teamLeaderIdList);

        public default TeamDO singleResultByInTeamLeaderId(Collection<Long> teamLeaderIdList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamLeaderId(teamLeaderIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamLeaderId(Collection<Long> teamLeaderIdList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamLeaderId(teamLeaderIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamLeaderId(@Param("updateDO") TeamDO updateDO, @Param("teamLeaderIdList") Collection<Long> teamLeaderIdList);

        public Integer updateAllFieldsByInTeamLeaderId(@Param("updateDO") TeamDO updateDO, @Param("teamLeaderIdList") Collection<Long> teamLeaderIdList);

        public Integer deleteByInTeamLeaderId(@Param("teamLeaderIdList") Collection<Long> teamLeaderIdList);

        public List<TeamDO> listByTeamDeptId(@Param("teamDeptId") Long teamDeptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamDeptId(@Param("teamDeptId") Long teamDeptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamDeptId(@Param("teamDeptId") Long teamDeptId);

        public default TeamDO singleResultByTeamDeptId(Long teamDeptId, String[] fieldNames){
             List<TeamDO> list=this.listByTeamDeptId(teamDeptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamDeptId(Long teamDeptId, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamDeptId(teamDeptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamDeptId(@Param("updateDO") TeamDO updateDO, @Param("teamDeptId") Long teamDeptId);

        public Integer updateAllFieldsByTeamDeptId(@Param("updateDO") TeamDO updateDO, @Param("teamDeptId") Long teamDeptId);

        public Integer deleteByTeamDeptId(@Param("teamDeptId") Long teamDeptId);




        public List<TeamDO> listByInTeamDeptId(@Param("teamDeptIdList") Collection<Long> teamDeptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamDeptId(@Param("teamDeptIdList") Collection<Long> teamDeptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamDeptId(@Param("teamDeptIdList") Collection<Long> teamDeptIdList);

        public default TeamDO singleResultByInTeamDeptId(Collection<Long> teamDeptIdList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamDeptId(teamDeptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamDeptId(Collection<Long> teamDeptIdList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamDeptId(teamDeptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamDeptId(@Param("updateDO") TeamDO updateDO, @Param("teamDeptIdList") Collection<Long> teamDeptIdList);

        public Integer updateAllFieldsByInTeamDeptId(@Param("updateDO") TeamDO updateDO, @Param("teamDeptIdList") Collection<Long> teamDeptIdList);

        public Integer deleteByInTeamDeptId(@Param("teamDeptIdList") Collection<Long> teamDeptIdList);

        public List<TeamDO> listByTeamHandleId(@Param("teamHandleId") Long teamHandleId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByTeamHandleId(@Param("teamHandleId") Long teamHandleId, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamHandleId(@Param("teamHandleId") Long teamHandleId);

        public default TeamDO singleResultByTeamHandleId(Long teamHandleId, String[] fieldNames){
             List<TeamDO> list=this.listByTeamHandleId(teamHandleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamHandleId(Long teamHandleId, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByTeamHandleId(teamHandleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamHandleId(@Param("updateDO") TeamDO updateDO, @Param("teamHandleId") Long teamHandleId);

        public Integer updateAllFieldsByTeamHandleId(@Param("updateDO") TeamDO updateDO, @Param("teamHandleId") Long teamHandleId);

        public Integer deleteByTeamHandleId(@Param("teamHandleId") Long teamHandleId);




        public List<TeamDO> listByInTeamHandleId(@Param("teamHandleIdList") Collection<Long> teamHandleIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamDO> mapByInTeamHandleId(@Param("teamHandleIdList") Collection<Long> teamHandleIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamHandleId(@Param("teamHandleIdList") Collection<Long> teamHandleIdList);

        public default TeamDO singleResultByInTeamHandleId(Collection<Long> teamHandleIdList, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamHandleId(teamHandleIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByInTeamHandleId(Collection<Long> teamHandleIdList, Function<TeamDO, T> mapper, String[] fieldNames){
             List<TeamDO> list=this.listByInTeamHandleId(teamHandleIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamHandleId(@Param("updateDO") TeamDO updateDO, @Param("teamHandleIdList") Collection<Long> teamHandleIdList);

        public Integer updateAllFieldsByInTeamHandleId(@Param("updateDO") TeamDO updateDO, @Param("teamHandleIdList") Collection<Long> teamHandleIdList);

        public Integer deleteByInTeamHandleId(@Param("teamHandleIdList") Collection<Long> teamHandleIdList);


}
