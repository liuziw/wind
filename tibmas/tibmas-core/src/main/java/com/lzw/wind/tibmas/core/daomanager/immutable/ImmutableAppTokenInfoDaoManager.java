package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.AppTokenInfoDO;
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
public interface ImmutableAppTokenInfoDaoManager extends CommonDaoManager<AppTokenInfoDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public AppTokenInfoDO getById(Long id);

        public List<AppTokenInfoDO> listById(Long id, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default AppTokenInfoDO singleResultById(Long id, String... fieldNames){
             List<AppTokenInfoDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingById(Long id, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(AppTokenInfoDO updateDO, Long id);

        public Integer updateAllFieldsById(AppTokenInfoDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<AppTokenInfoDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default AppTokenInfoDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInId(Collection<Long> idList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(AppTokenInfoDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(AppTokenInfoDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<AppTokenInfoDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default AppTokenInfoDO singleResultByUserId(Long userId, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByUserId(Long userId, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(AppTokenInfoDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(AppTokenInfoDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<AppTokenInfoDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default AppTokenInfoDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInUserId(Collection<Long> userIdList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(AppTokenInfoDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(AppTokenInfoDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<AppTokenInfoDO> listByAppId(Long appId, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByAppId(Long appId, String... fieldNames);

        public Integer countByAppId(Long appId);

        public default AppTokenInfoDO singleResultByAppId(Long appId, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByAppId(Long appId, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(AppTokenInfoDO updateDO, Long appId);

        public Integer updateAllFieldsByAppId(AppTokenInfoDO updateDO, Long appId);

        public Integer deleteByAppId(Long appId);






        public List<AppTokenInfoDO> listByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Integer countByInAppId(Collection<Long> appIdList);

         public default AppTokenInfoDO singleResultByInAppId(Collection<Long> appIdList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInAppId(appIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInAppId(Collection<Long> appIdList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInAppId(appIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppId(AppTokenInfoDO updateDO, Collection<Long> appIdList);

         public Integer updateAllFieldsByInAppId(AppTokenInfoDO updateDO, Collection<Long> appIdList);

         public Integer deleteByInAppId(Collection<Long> appIdList);
        public List<AppTokenInfoDO> listByToken(String token, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByToken(String token, String... fieldNames);

        public Integer countByToken(String token);

        public default AppTokenInfoDO singleResultByToken(String token, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByToken(token,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByToken(String token, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByToken(token,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByToken(AppTokenInfoDO updateDO, String token);

        public Integer updateAllFieldsByToken(AppTokenInfoDO updateDO, String token);

        public Integer deleteByToken(String token);






        public List<AppTokenInfoDO> listByInToken(Collection<String> tokenList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInToken(Collection<String> tokenList, String... fieldNames);

         public Integer countByInToken(Collection<String> tokenList);

         public default AppTokenInfoDO singleResultByInToken(Collection<String> tokenList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInToken(tokenList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInToken(Collection<String> tokenList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInToken(tokenList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInToken(AppTokenInfoDO updateDO, Collection<String> tokenList);

         public Integer updateAllFieldsByInToken(AppTokenInfoDO updateDO, Collection<String> tokenList);

         public Integer deleteByInToken(Collection<String> tokenList);
        public List<AppTokenInfoDO> listByRemark(String remark, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByRemark(String remark, String... fieldNames);

        public Integer countByRemark(String remark);

        public default AppTokenInfoDO singleResultByRemark(String remark, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByRemark(remark,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByRemark(String remark, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByRemark(remark,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRemark(AppTokenInfoDO updateDO, String remark);

        public Integer updateAllFieldsByRemark(AppTokenInfoDO updateDO, String remark);

        public Integer deleteByRemark(String remark);






        public List<AppTokenInfoDO> listByInRemark(Collection<String> remarkList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInRemark(Collection<String> remarkList, String... fieldNames);

         public Integer countByInRemark(Collection<String> remarkList);

         public default AppTokenInfoDO singleResultByInRemark(Collection<String> remarkList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInRemark(remarkList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInRemark(Collection<String> remarkList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInRemark(remarkList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRemark(AppTokenInfoDO updateDO, Collection<String> remarkList);

         public Integer updateAllFieldsByInRemark(AppTokenInfoDO updateDO, Collection<String> remarkList);

         public Integer deleteByInRemark(Collection<String> remarkList);
        public List<AppTokenInfoDO> listBySerialNumber(String serialNumber, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapBySerialNumber(String serialNumber, String... fieldNames);

        public Integer countBySerialNumber(String serialNumber);

        public default AppTokenInfoDO singleResultBySerialNumber(String serialNumber, String... fieldNames){
             List<AppTokenInfoDO> list=this.listBySerialNumber(serialNumber,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingBySerialNumber(String serialNumber, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listBySerialNumber(serialNumber,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySerialNumber(AppTokenInfoDO updateDO, String serialNumber);

        public Integer updateAllFieldsBySerialNumber(AppTokenInfoDO updateDO, String serialNumber);

        public Integer deleteBySerialNumber(String serialNumber);






        public List<AppTokenInfoDO> listByInSerialNumber(Collection<String> serialNumberList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInSerialNumber(Collection<String> serialNumberList, String... fieldNames);

         public Integer countByInSerialNumber(Collection<String> serialNumberList);

         public default AppTokenInfoDO singleResultByInSerialNumber(Collection<String> serialNumberList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInSerialNumber(serialNumberList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInSerialNumber(Collection<String> serialNumberList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInSerialNumber(serialNumberList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSerialNumber(AppTokenInfoDO updateDO, Collection<String> serialNumberList);

         public Integer updateAllFieldsByInSerialNumber(AppTokenInfoDO updateDO, Collection<String> serialNumberList);

         public Integer deleteByInSerialNumber(Collection<String> serialNumberList);
        public List<AppTokenInfoDO> listByImei(String imei, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByImei(String imei, String... fieldNames);

        public Integer countByImei(String imei);

        public default AppTokenInfoDO singleResultByImei(String imei, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByImei(imei,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByImei(String imei, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByImei(imei,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByImei(AppTokenInfoDO updateDO, String imei);

        public Integer updateAllFieldsByImei(AppTokenInfoDO updateDO, String imei);

        public Integer deleteByImei(String imei);






        public List<AppTokenInfoDO> listByInImei(Collection<String> imeiList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInImei(Collection<String> imeiList, String... fieldNames);

         public Integer countByInImei(Collection<String> imeiList);

         public default AppTokenInfoDO singleResultByInImei(Collection<String> imeiList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInImei(imeiList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInImei(Collection<String> imeiList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInImei(imeiList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInImei(AppTokenInfoDO updateDO, Collection<String> imeiList);

         public Integer updateAllFieldsByInImei(AppTokenInfoDO updateDO, Collection<String> imeiList);

         public Integer deleteByInImei(Collection<String> imeiList);
        public List<AppTokenInfoDO> listByServeArea(String serveArea, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByServeArea(String serveArea, String... fieldNames);

        public Integer countByServeArea(String serveArea);

        public default AppTokenInfoDO singleResultByServeArea(String serveArea, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByServeArea(serveArea,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByServeArea(String serveArea, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByServeArea(serveArea,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByServeArea(AppTokenInfoDO updateDO, String serveArea);

        public Integer updateAllFieldsByServeArea(AppTokenInfoDO updateDO, String serveArea);

        public Integer deleteByServeArea(String serveArea);






        public List<AppTokenInfoDO> listByInServeArea(Collection<String> serveAreaList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInServeArea(Collection<String> serveAreaList, String... fieldNames);

         public Integer countByInServeArea(Collection<String> serveAreaList);

         public default AppTokenInfoDO singleResultByInServeArea(Collection<String> serveAreaList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInServeArea(serveAreaList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInServeArea(Collection<String> serveAreaList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInServeArea(serveAreaList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInServeArea(AppTokenInfoDO updateDO, Collection<String> serveAreaList);

         public Integer updateAllFieldsByInServeArea(AppTokenInfoDO updateDO, Collection<String> serveAreaList);

         public Integer deleteByInServeArea(Collection<String> serveAreaList);
        public List<AppTokenInfoDO> listByDeviceType(Integer deviceType, String... fieldNames);

        public Map<Long,AppTokenInfoDO> mapByDeviceType(Integer deviceType, String... fieldNames);

        public Integer countByDeviceType(Integer deviceType);

        public default AppTokenInfoDO singleResultByDeviceType(Integer deviceType, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByDeviceType(deviceType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByDeviceType(Integer deviceType, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
             List<AppTokenInfoDO> list=this.listByDeviceType(deviceType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeviceType(AppTokenInfoDO updateDO, Integer deviceType);

        public Integer updateAllFieldsByDeviceType(AppTokenInfoDO updateDO, Integer deviceType);

        public Integer deleteByDeviceType(Integer deviceType);






        public List<AppTokenInfoDO> listByInDeviceType(Collection<Integer> deviceTypeList, String... fieldNames);

         public Map<Long,AppTokenInfoDO> mapByInDeviceType(Collection<Integer> deviceTypeList, String... fieldNames);

         public Integer countByInDeviceType(Collection<Integer> deviceTypeList);

         public default AppTokenInfoDO singleResultByInDeviceType(Collection<Integer> deviceTypeList, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInDeviceType(deviceTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppTokenInfoDO>> groupingByInDeviceType(Collection<Integer> deviceTypeList, Function<AppTokenInfoDO, T> mapper, String... fieldNames){
              List<AppTokenInfoDO> list=this.listByInDeviceType(deviceTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeviceType(AppTokenInfoDO updateDO, Collection<Integer> deviceTypeList);

         public Integer updateAllFieldsByInDeviceType(AppTokenInfoDO updateDO, Collection<Integer> deviceTypeList);

         public Integer deleteByInDeviceType(Collection<Integer> deviceTypeList);


}

