package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.LoginFailDO;
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
public interface LoginFailMapper extends CommonMapper<LoginFailDO,Long> {

        public List<LoginFailDO> listByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByUserAccount(@Param("userAccount") String userAccount, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserAccount(@Param("userAccount") String userAccount);

        public default LoginFailDO singleResultByUserAccount(String userAccount, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserAccount(String userAccount, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(@Param("updateDO") LoginFailDO updateDO, @Param("userAccount") String userAccount);

        public Integer updateAllFieldsByUserAccount(@Param("updateDO") LoginFailDO updateDO, @Param("userAccount") String userAccount);

        public Integer deleteByUserAccount(@Param("userAccount") String userAccount);




        public List<LoginFailDO> listByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByInUserAccount(@Param("userAccountList") Collection<String> userAccountList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public default LoginFailDO singleResultByInUserAccount(Collection<String> userAccountList, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserAccount(userAccountList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserAccount(@Param("updateDO") LoginFailDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer updateAllFieldsByInUserAccount(@Param("updateDO") LoginFailDO updateDO, @Param("userAccountList") Collection<String> userAccountList);

        public Integer deleteByInUserAccount(@Param("userAccountList") Collection<String> userAccountList);

        public List<LoginFailDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default LoginFailDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserIdCreate(Long userIdCreate, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") LoginFailDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") LoginFailDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<LoginFailDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default LoginFailDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") LoginFailDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") LoginFailDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<LoginFailDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default LoginFailDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserIdModified(Long userIdModified, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") LoginFailDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") LoginFailDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<LoginFailDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,LoginFailDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default LoginFailDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<LoginFailDO, T> mapper, String[] fieldNames){
             List<LoginFailDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") LoginFailDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") LoginFailDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
