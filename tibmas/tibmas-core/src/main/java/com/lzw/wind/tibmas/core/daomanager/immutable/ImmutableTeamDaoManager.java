package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.TeamDO;
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
public interface ImmutableTeamDaoManager extends CommonDaoManager<TeamDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public TeamDO getById(Long id);

        public List<TeamDO> listById(Long id, String... fieldNames);

        public Map<Long,TeamDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default TeamDO singleResultById(Long id, String... fieldNames){
             List<TeamDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingById(Long id, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(TeamDO updateDO, Long id);

        public Integer updateAllFieldsById(TeamDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<TeamDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,TeamDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default TeamDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<TeamDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInId(Collection<Long> idList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(TeamDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(TeamDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<TeamDO> listByTeamName(String teamName, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamName(String teamName, String... fieldNames);

        public Integer countByTeamName(String teamName);

        public default TeamDO singleResultByTeamName(String teamName, String... fieldNames){
             List<TeamDO> list=this.listByTeamName(teamName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamName(String teamName, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamName(teamName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamName(TeamDO updateDO, String teamName);

        public Integer updateAllFieldsByTeamName(TeamDO updateDO, String teamName);

        public Integer deleteByTeamName(String teamName);






        public List<TeamDO> listByInTeamName(Collection<String> teamNameList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamName(Collection<String> teamNameList, String... fieldNames);

         public Integer countByInTeamName(Collection<String> teamNameList);

         public default TeamDO singleResultByInTeamName(Collection<String> teamNameList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamName(teamNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamName(Collection<String> teamNameList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamName(teamNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamName(TeamDO updateDO, Collection<String> teamNameList);

         public Integer updateAllFieldsByInTeamName(TeamDO updateDO, Collection<String> teamNameList);

         public Integer deleteByInTeamName(Collection<String> teamNameList);
        public List<TeamDO> listByTeamDesc(String teamDesc, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamDesc(String teamDesc, String... fieldNames);

        public Integer countByTeamDesc(String teamDesc);

        public default TeamDO singleResultByTeamDesc(String teamDesc, String... fieldNames){
             List<TeamDO> list=this.listByTeamDesc(teamDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamDesc(String teamDesc, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamDesc(teamDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamDesc(TeamDO updateDO, String teamDesc);

        public Integer updateAllFieldsByTeamDesc(TeamDO updateDO, String teamDesc);

        public Integer deleteByTeamDesc(String teamDesc);






        public List<TeamDO> listByInTeamDesc(Collection<String> teamDescList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamDesc(Collection<String> teamDescList, String... fieldNames);

         public Integer countByInTeamDesc(Collection<String> teamDescList);

         public default TeamDO singleResultByInTeamDesc(Collection<String> teamDescList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamDesc(teamDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamDesc(Collection<String> teamDescList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamDesc(teamDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamDesc(TeamDO updateDO, Collection<String> teamDescList);

         public Integer updateAllFieldsByInTeamDesc(TeamDO updateDO, Collection<String> teamDescList);

         public Integer deleteByInTeamDesc(Collection<String> teamDescList);
        public List<TeamDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames);

        public Integer countByTeamTypeCode(String teamTypeCode);

        public default TeamDO singleResultByTeamTypeCode(String teamTypeCode, String... fieldNames){
             List<TeamDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamTypeCode(String teamTypeCode, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamTypeCode(teamTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamTypeCode(TeamDO updateDO, String teamTypeCode);

        public Integer updateAllFieldsByTeamTypeCode(TeamDO updateDO, String teamTypeCode);

        public Integer deleteByTeamTypeCode(String teamTypeCode);






        public List<TeamDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames);

         public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList);

         public default TeamDO singleResultByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamTypeCode(Collection<String> teamTypeCodeList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamTypeCode(teamTypeCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamTypeCode(TeamDO updateDO, Collection<String> teamTypeCodeList);

         public Integer updateAllFieldsByInTeamTypeCode(TeamDO updateDO, Collection<String> teamTypeCodeList);

         public Integer deleteByInTeamTypeCode(Collection<String> teamTypeCodeList);
        public List<TeamDO> listByTeamLeaderId(Long teamLeaderId, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamLeaderId(Long teamLeaderId, String... fieldNames);

        public Integer countByTeamLeaderId(Long teamLeaderId);

        public default TeamDO singleResultByTeamLeaderId(Long teamLeaderId, String... fieldNames){
             List<TeamDO> list=this.listByTeamLeaderId(teamLeaderId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamLeaderId(Long teamLeaderId, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamLeaderId(teamLeaderId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamLeaderId(TeamDO updateDO, Long teamLeaderId);

        public Integer updateAllFieldsByTeamLeaderId(TeamDO updateDO, Long teamLeaderId);

        public Integer deleteByTeamLeaderId(Long teamLeaderId);






        public List<TeamDO> listByInTeamLeaderId(Collection<Long> teamLeaderIdList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamLeaderId(Collection<Long> teamLeaderIdList, String... fieldNames);

         public Integer countByInTeamLeaderId(Collection<Long> teamLeaderIdList);

         public default TeamDO singleResultByInTeamLeaderId(Collection<Long> teamLeaderIdList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamLeaderId(teamLeaderIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamLeaderId(Collection<Long> teamLeaderIdList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamLeaderId(teamLeaderIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamLeaderId(TeamDO updateDO, Collection<Long> teamLeaderIdList);

         public Integer updateAllFieldsByInTeamLeaderId(TeamDO updateDO, Collection<Long> teamLeaderIdList);

         public Integer deleteByInTeamLeaderId(Collection<Long> teamLeaderIdList);
        public List<TeamDO> listByTeamDeptId(Long teamDeptId, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamDeptId(Long teamDeptId, String... fieldNames);

        public Integer countByTeamDeptId(Long teamDeptId);

        public default TeamDO singleResultByTeamDeptId(Long teamDeptId, String... fieldNames){
             List<TeamDO> list=this.listByTeamDeptId(teamDeptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamDeptId(Long teamDeptId, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamDeptId(teamDeptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamDeptId(TeamDO updateDO, Long teamDeptId);

        public Integer updateAllFieldsByTeamDeptId(TeamDO updateDO, Long teamDeptId);

        public Integer deleteByTeamDeptId(Long teamDeptId);






        public List<TeamDO> listByInTeamDeptId(Collection<Long> teamDeptIdList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamDeptId(Collection<Long> teamDeptIdList, String... fieldNames);

         public Integer countByInTeamDeptId(Collection<Long> teamDeptIdList);

         public default TeamDO singleResultByInTeamDeptId(Collection<Long> teamDeptIdList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamDeptId(teamDeptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamDeptId(Collection<Long> teamDeptIdList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamDeptId(teamDeptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamDeptId(TeamDO updateDO, Collection<Long> teamDeptIdList);

         public Integer updateAllFieldsByInTeamDeptId(TeamDO updateDO, Collection<Long> teamDeptIdList);

         public Integer deleteByInTeamDeptId(Collection<Long> teamDeptIdList);
        public List<TeamDO> listByTeamHandleId(Long teamHandleId, String... fieldNames);

        public Map<Long,TeamDO> mapByTeamHandleId(Long teamHandleId, String... fieldNames);

        public Integer countByTeamHandleId(Long teamHandleId);

        public default TeamDO singleResultByTeamHandleId(Long teamHandleId, String... fieldNames){
             List<TeamDO> list=this.listByTeamHandleId(teamHandleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamDO>> groupingByTeamHandleId(Long teamHandleId, Function<TeamDO, T> mapper, String... fieldNames){
             List<TeamDO> list=this.listByTeamHandleId(teamHandleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamHandleId(TeamDO updateDO, Long teamHandleId);

        public Integer updateAllFieldsByTeamHandleId(TeamDO updateDO, Long teamHandleId);

        public Integer deleteByTeamHandleId(Long teamHandleId);






        public List<TeamDO> listByInTeamHandleId(Collection<Long> teamHandleIdList, String... fieldNames);

         public Map<Long,TeamDO> mapByInTeamHandleId(Collection<Long> teamHandleIdList, String... fieldNames);

         public Integer countByInTeamHandleId(Collection<Long> teamHandleIdList);

         public default TeamDO singleResultByInTeamHandleId(Collection<Long> teamHandleIdList, String... fieldNames){
              List<TeamDO> list=this.listByInTeamHandleId(teamHandleIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamDO>> groupingByInTeamHandleId(Collection<Long> teamHandleIdList, Function<TeamDO, T> mapper, String... fieldNames){
              List<TeamDO> list=this.listByInTeamHandleId(teamHandleIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamHandleId(TeamDO updateDO, Collection<Long> teamHandleIdList);

         public Integer updateAllFieldsByInTeamHandleId(TeamDO updateDO, Collection<Long> teamHandleIdList);

         public Integer deleteByInTeamHandleId(Collection<Long> teamHandleIdList);


}

