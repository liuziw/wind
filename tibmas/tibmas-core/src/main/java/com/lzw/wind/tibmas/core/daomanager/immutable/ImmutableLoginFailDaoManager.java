package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.LoginFailDO;
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
public interface ImmutableLoginFailDaoManager extends CommonDaoManager<LoginFailDO,Long> {


        public List<LoginFailDO> listByUserAccount(String userAccount, String... fieldNames);

        public Map<Long,LoginFailDO> mapByUserAccount(String userAccount, String... fieldNames);

        public Integer countByUserAccount(String userAccount);

        public default LoginFailDO singleResultByUserAccount(String userAccount, String... fieldNames){
             List<LoginFailDO> list=this.listByUserAccount(userAccount,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserAccount(String userAccount, Function<LoginFailDO, T> mapper, String... fieldNames){
             List<LoginFailDO> list=this.listByUserAccount(userAccount,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserAccount(LoginFailDO updateDO, String userAccount);

        public Integer updateAllFieldsByUserAccount(LoginFailDO updateDO, String userAccount);

        public Integer deleteByUserAccount(String userAccount);






        public List<LoginFailDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Map<Long,LoginFailDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames);

         public Integer countByInUserAccount(Collection<String> userAccountList);

         public default LoginFailDO singleResultByInUserAccount(Collection<String> userAccountList, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<LoginFailDO>> groupingByInUserAccount(Collection<String> userAccountList, Function<LoginFailDO, T> mapper, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserAccount(userAccountList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserAccount(LoginFailDO updateDO, Collection<String> userAccountList);

         public Integer updateAllFieldsByInUserAccount(LoginFailDO updateDO, Collection<String> userAccountList);

         public Integer deleteByInUserAccount(Collection<String> userAccountList);
        public List<LoginFailDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,LoginFailDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default LoginFailDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<LoginFailDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserIdCreate(Long userIdCreate, Function<LoginFailDO, T> mapper, String... fieldNames){
             List<LoginFailDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(LoginFailDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(LoginFailDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<LoginFailDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,LoginFailDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default LoginFailDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<LoginFailDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<LoginFailDO, T> mapper, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(LoginFailDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(LoginFailDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<LoginFailDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,LoginFailDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default LoginFailDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<LoginFailDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<LoginFailDO>> groupingByUserIdModified(Long userIdModified, Function<LoginFailDO, T> mapper, String... fieldNames){
             List<LoginFailDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(LoginFailDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(LoginFailDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<LoginFailDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,LoginFailDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default LoginFailDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<LoginFailDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<LoginFailDO, T> mapper, String... fieldNames){
              List<LoginFailDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(LoginFailDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(LoginFailDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

