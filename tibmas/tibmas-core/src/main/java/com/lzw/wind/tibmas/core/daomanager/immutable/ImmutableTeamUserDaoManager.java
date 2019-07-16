package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.TeamUserDO;
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
public interface ImmutableTeamUserDaoManager extends CommonDaoManager<TeamUserDO,Long> {


        public List<TeamUserDO> listByTeamId(Long teamId, String... fieldNames);

        public Map<Long,TeamUserDO> mapByTeamId(Long teamId, String... fieldNames);

        public Integer countByTeamId(Long teamId);

        public default TeamUserDO singleResultByTeamId(Long teamId, String... fieldNames){
             List<TeamUserDO> list=this.listByTeamId(teamId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByTeamId(Long teamId, Function<TeamUserDO, T> mapper, String... fieldNames){
             List<TeamUserDO> list=this.listByTeamId(teamId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamId(TeamUserDO updateDO, Long teamId);

        public Integer updateAllFieldsByTeamId(TeamUserDO updateDO, Long teamId);

        public Integer deleteByTeamId(Long teamId);






        public List<TeamUserDO> listByInTeamId(Collection<Long> teamIdList, String... fieldNames);

         public Map<Long,TeamUserDO> mapByInTeamId(Collection<Long> teamIdList, String... fieldNames);

         public Integer countByInTeamId(Collection<Long> teamIdList);

         public default TeamUserDO singleResultByInTeamId(Collection<Long> teamIdList, String... fieldNames){
              List<TeamUserDO> list=this.listByInTeamId(teamIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamUserDO>> groupingByInTeamId(Collection<Long> teamIdList, Function<TeamUserDO, T> mapper, String... fieldNames){
              List<TeamUserDO> list=this.listByInTeamId(teamIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInTeamId(TeamUserDO updateDO, Collection<Long> teamIdList);

         public Integer updateAllFieldsByInTeamId(TeamUserDO updateDO, Collection<Long> teamIdList);

         public Integer deleteByInTeamId(Collection<Long> teamIdList);
        public List<TeamUserDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,TeamUserDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default TeamUserDO singleResultByUserId(Long userId, String... fieldNames){
             List<TeamUserDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByUserId(Long userId, Function<TeamUserDO, T> mapper, String... fieldNames){
             List<TeamUserDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(TeamUserDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(TeamUserDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<TeamUserDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,TeamUserDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default TeamUserDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<TeamUserDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamUserDO>> groupingByInUserId(Collection<Long> userIdList, Function<TeamUserDO, T> mapper, String... fieldNames){
              List<TeamUserDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(TeamUserDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(TeamUserDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<TeamUserDO> listByUserType(Integer userType, String... fieldNames);

        public Map<Long,TeamUserDO> mapByUserType(Integer userType, String... fieldNames);

        public Integer countByUserType(Integer userType);

        public default TeamUserDO singleResultByUserType(Integer userType, String... fieldNames){
             List<TeamUserDO> list=this.listByUserType(userType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByUserType(Integer userType, Function<TeamUserDO, T> mapper, String... fieldNames){
             List<TeamUserDO> list=this.listByUserType(userType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserType(TeamUserDO updateDO, Integer userType);

        public Integer updateAllFieldsByUserType(TeamUserDO updateDO, Integer userType);

        public Integer deleteByUserType(Integer userType);






        public List<TeamUserDO> listByInUserType(Collection<Integer> userTypeList, String... fieldNames);

         public Map<Long,TeamUserDO> mapByInUserType(Collection<Integer> userTypeList, String... fieldNames);

         public Integer countByInUserType(Collection<Integer> userTypeList);

         public default TeamUserDO singleResultByInUserType(Collection<Integer> userTypeList, String... fieldNames){
              List<TeamUserDO> list=this.listByInUserType(userTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<TeamUserDO>> groupingByInUserType(Collection<Integer> userTypeList, Function<TeamUserDO, T> mapper, String... fieldNames){
              List<TeamUserDO> list=this.listByInUserType(userTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserType(TeamUserDO updateDO, Collection<Integer> userTypeList);

         public Integer updateAllFieldsByInUserType(TeamUserDO updateDO, Collection<Integer> userTypeList);

         public Integer deleteByInUserType(Collection<Integer> userTypeList);


}

