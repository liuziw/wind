package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.TeamUserDO;
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
public interface TeamUserMapper extends CommonMapper<TeamUserDO,Long> {

        public List<TeamUserDO> listByTeamId(@Param("teamId") Long teamId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByTeamId(@Param("teamId") Long teamId, @Param("fieldNames") String[] fieldNames);

        public Integer countByTeamId(@Param("teamId") Long teamId);

        public default TeamUserDO singleResultByTeamId(Long teamId, String[] fieldNames){
             List<TeamUserDO> list=this.listByTeamId(teamId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByTeamId(Long teamId, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByTeamId(teamId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByTeamId(@Param("updateDO") TeamUserDO updateDO, @Param("teamId") Long teamId);

        public Integer updateAllFieldsByTeamId(@Param("updateDO") TeamUserDO updateDO, @Param("teamId") Long teamId);

        public Integer deleteByTeamId(@Param("teamId") Long teamId);




        public List<TeamUserDO> listByInTeamId(@Param("teamIdList") Collection<Long> teamIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByInTeamId(@Param("teamIdList") Collection<Long> teamIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInTeamId(@Param("teamIdList") Collection<Long> teamIdList);

        public default TeamUserDO singleResultByInTeamId(Collection<Long> teamIdList, String[] fieldNames){
             List<TeamUserDO> list=this.listByInTeamId(teamIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByInTeamId(Collection<Long> teamIdList, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByInTeamId(teamIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInTeamId(@Param("updateDO") TeamUserDO updateDO, @Param("teamIdList") Collection<Long> teamIdList);

        public Integer updateAllFieldsByInTeamId(@Param("updateDO") TeamUserDO updateDO, @Param("teamIdList") Collection<Long> teamIdList);

        public Integer deleteByInTeamId(@Param("teamIdList") Collection<Long> teamIdList);

        public List<TeamUserDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default TeamUserDO singleResultByUserId(Long userId, String[] fieldNames){
             List<TeamUserDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByUserId(Long userId, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") TeamUserDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") TeamUserDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<TeamUserDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default TeamUserDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<TeamUserDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByInUserId(Collection<Long> userIdList, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") TeamUserDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") TeamUserDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<TeamUserDO> listByUserType(@Param("userType") Integer userType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByUserType(@Param("userType") Integer userType, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserType(@Param("userType") Integer userType);

        public default TeamUserDO singleResultByUserType(Integer userType, String[] fieldNames){
             List<TeamUserDO> list=this.listByUserType(userType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByUserType(Integer userType, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByUserType(userType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserType(@Param("updateDO") TeamUserDO updateDO, @Param("userType") Integer userType);

        public Integer updateAllFieldsByUserType(@Param("updateDO") TeamUserDO updateDO, @Param("userType") Integer userType);

        public Integer deleteByUserType(@Param("userType") Integer userType);




        public List<TeamUserDO> listByInUserType(@Param("userTypeList") Collection<Integer> userTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,TeamUserDO> mapByInUserType(@Param("userTypeList") Collection<Integer> userTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserType(@Param("userTypeList") Collection<Integer> userTypeList);

        public default TeamUserDO singleResultByInUserType(Collection<Integer> userTypeList, String[] fieldNames){
             List<TeamUserDO> list=this.listByInUserType(userTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<TeamUserDO>> groupingByInUserType(Collection<Integer> userTypeList, Function<TeamUserDO, T> mapper, String[] fieldNames){
             List<TeamUserDO> list=this.listByInUserType(userTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserType(@Param("updateDO") TeamUserDO updateDO, @Param("userTypeList") Collection<Integer> userTypeList);

        public Integer updateAllFieldsByInUserType(@Param("updateDO") TeamUserDO updateDO, @Param("userTypeList") Collection<Integer> userTypeList);

        public Integer deleteByInUserType(@Param("userTypeList") Collection<Integer> userTypeList);


}
