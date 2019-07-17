package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.AppTokenInfoDO;
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
public interface AppTokenInfoMapper extends CommonMapper<AppTokenInfoDO,Long> {


        public AppTokenInfoDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<AppTokenInfoDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default AppTokenInfoDO singleResultById(Long id, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingById(Long id, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") AppTokenInfoDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") AppTokenInfoDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<AppTokenInfoDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default AppTokenInfoDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInId(Collection<Long> idList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<AppTokenInfoDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default AppTokenInfoDO singleResultByUserId(Long userId, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByUserId(Long userId, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<AppTokenInfoDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default AppTokenInfoDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInUserId(Collection<Long> userIdList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<AppTokenInfoDO> listByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppId(@Param("appId") Long appId);

        public default AppTokenInfoDO singleResultByAppId(Long appId, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByAppId(Long appId, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("appId") Long appId);

        public Integer updateAllFieldsByAppId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("appId") Long appId);

        public Integer deleteByAppId(@Param("appId") Long appId);




        public List<AppTokenInfoDO> listByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public default AppTokenInfoDO singleResultByInAppId(Collection<Long> appIdList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInAppId(appIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInAppId(Collection<Long> appIdList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInAppId(appIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer updateAllFieldsByInAppId(@Param("updateDO") AppTokenInfoDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer deleteByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public List<AppTokenInfoDO> listByToken(@Param("token") String token, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByToken(@Param("token") String token, @Param("fieldNames") String[] fieldNames);

        public Integer countByToken(@Param("token") String token);

        public default AppTokenInfoDO singleResultByToken(String token, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByToken(token,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByToken(String token, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByToken(token,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByToken(@Param("updateDO") AppTokenInfoDO updateDO, @Param("token") String token);

        public Integer updateAllFieldsByToken(@Param("updateDO") AppTokenInfoDO updateDO, @Param("token") String token);

        public Integer deleteByToken(@Param("token") String token);




        public List<AppTokenInfoDO> listByInToken(@Param("tokenList") Collection<String> tokenList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInToken(@Param("tokenList") Collection<String> tokenList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInToken(@Param("tokenList") Collection<String> tokenList);

        public default AppTokenInfoDO singleResultByInToken(Collection<String> tokenList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInToken(tokenList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInToken(Collection<String> tokenList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInToken(tokenList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInToken(@Param("updateDO") AppTokenInfoDO updateDO, @Param("tokenList") Collection<String> tokenList);

        public Integer updateAllFieldsByInToken(@Param("updateDO") AppTokenInfoDO updateDO, @Param("tokenList") Collection<String> tokenList);

        public Integer deleteByInToken(@Param("tokenList") Collection<String> tokenList);

        public List<AppTokenInfoDO> listByRemark(@Param("remark") String remark, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByRemark(@Param("remark") String remark, @Param("fieldNames") String[] fieldNames);

        public Integer countByRemark(@Param("remark") String remark);

        public default AppTokenInfoDO singleResultByRemark(String remark, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByRemark(remark,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByRemark(String remark, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByRemark(remark,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRemark(@Param("updateDO") AppTokenInfoDO updateDO, @Param("remark") String remark);

        public Integer updateAllFieldsByRemark(@Param("updateDO") AppTokenInfoDO updateDO, @Param("remark") String remark);

        public Integer deleteByRemark(@Param("remark") String remark);




        public List<AppTokenInfoDO> listByInRemark(@Param("remarkList") Collection<String> remarkList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInRemark(@Param("remarkList") Collection<String> remarkList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRemark(@Param("remarkList") Collection<String> remarkList);

        public default AppTokenInfoDO singleResultByInRemark(Collection<String> remarkList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInRemark(remarkList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInRemark(Collection<String> remarkList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInRemark(remarkList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRemark(@Param("updateDO") AppTokenInfoDO updateDO, @Param("remarkList") Collection<String> remarkList);

        public Integer updateAllFieldsByInRemark(@Param("updateDO") AppTokenInfoDO updateDO, @Param("remarkList") Collection<String> remarkList);

        public Integer deleteByInRemark(@Param("remarkList") Collection<String> remarkList);

        public List<AppTokenInfoDO> listBySerialNumber(@Param("serialNumber") String serialNumber, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapBySerialNumber(@Param("serialNumber") String serialNumber, @Param("fieldNames") String[] fieldNames);

        public Integer countBySerialNumber(@Param("serialNumber") String serialNumber);

        public default AppTokenInfoDO singleResultBySerialNumber(String serialNumber, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listBySerialNumber(serialNumber,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingBySerialNumber(String serialNumber, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listBySerialNumber(serialNumber,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySerialNumber(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serialNumber") String serialNumber);

        public Integer updateAllFieldsBySerialNumber(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serialNumber") String serialNumber);

        public Integer deleteBySerialNumber(@Param("serialNumber") String serialNumber);




        public List<AppTokenInfoDO> listByInSerialNumber(@Param("serialNumberList") Collection<String> serialNumberList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInSerialNumber(@Param("serialNumberList") Collection<String> serialNumberList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSerialNumber(@Param("serialNumberList") Collection<String> serialNumberList);

        public default AppTokenInfoDO singleResultByInSerialNumber(Collection<String> serialNumberList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInSerialNumber(serialNumberList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInSerialNumber(Collection<String> serialNumberList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInSerialNumber(serialNumberList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSerialNumber(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serialNumberList") Collection<String> serialNumberList);

        public Integer updateAllFieldsByInSerialNumber(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serialNumberList") Collection<String> serialNumberList);

        public Integer deleteByInSerialNumber(@Param("serialNumberList") Collection<String> serialNumberList);

        public List<AppTokenInfoDO> listByImei(@Param("imei") String imei, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByImei(@Param("imei") String imei, @Param("fieldNames") String[] fieldNames);

        public Integer countByImei(@Param("imei") String imei);

        public default AppTokenInfoDO singleResultByImei(String imei, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByImei(imei,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByImei(String imei, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByImei(imei,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByImei(@Param("updateDO") AppTokenInfoDO updateDO, @Param("imei") String imei);

        public Integer updateAllFieldsByImei(@Param("updateDO") AppTokenInfoDO updateDO, @Param("imei") String imei);

        public Integer deleteByImei(@Param("imei") String imei);




        public List<AppTokenInfoDO> listByInImei(@Param("imeiList") Collection<String> imeiList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInImei(@Param("imeiList") Collection<String> imeiList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInImei(@Param("imeiList") Collection<String> imeiList);

        public default AppTokenInfoDO singleResultByInImei(Collection<String> imeiList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInImei(imeiList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInImei(Collection<String> imeiList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInImei(imeiList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInImei(@Param("updateDO") AppTokenInfoDO updateDO, @Param("imeiList") Collection<String> imeiList);

        public Integer updateAllFieldsByInImei(@Param("updateDO") AppTokenInfoDO updateDO, @Param("imeiList") Collection<String> imeiList);

        public Integer deleteByInImei(@Param("imeiList") Collection<String> imeiList);

        public List<AppTokenInfoDO> listByServeArea(@Param("serveArea") String serveArea, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByServeArea(@Param("serveArea") String serveArea, @Param("fieldNames") String[] fieldNames);

        public Integer countByServeArea(@Param("serveArea") String serveArea);

        public default AppTokenInfoDO singleResultByServeArea(String serveArea, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByServeArea(serveArea,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByServeArea(String serveArea, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByServeArea(serveArea,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByServeArea(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serveArea") String serveArea);

        public Integer updateAllFieldsByServeArea(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serveArea") String serveArea);

        public Integer deleteByServeArea(@Param("serveArea") String serveArea);




        public List<AppTokenInfoDO> listByInServeArea(@Param("serveAreaList") Collection<String> serveAreaList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInServeArea(@Param("serveAreaList") Collection<String> serveAreaList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInServeArea(@Param("serveAreaList") Collection<String> serveAreaList);

        public default AppTokenInfoDO singleResultByInServeArea(Collection<String> serveAreaList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInServeArea(serveAreaList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInServeArea(Collection<String> serveAreaList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInServeArea(serveAreaList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInServeArea(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serveAreaList") Collection<String> serveAreaList);

        public Integer updateAllFieldsByInServeArea(@Param("updateDO") AppTokenInfoDO updateDO, @Param("serveAreaList") Collection<String> serveAreaList);

        public Integer deleteByInServeArea(@Param("serveAreaList") Collection<String> serveAreaList);

        public List<AppTokenInfoDO> listByDeviceType(@Param("deviceType") Integer deviceType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByDeviceType(@Param("deviceType") Integer deviceType, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeviceType(@Param("deviceType") Integer deviceType);

        public default AppTokenInfoDO singleResultByDeviceType(Integer deviceType, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByDeviceType(deviceType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByDeviceType(Integer deviceType, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByDeviceType(deviceType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeviceType(@Param("updateDO") AppTokenInfoDO updateDO, @Param("deviceType") Integer deviceType);

        public Integer updateAllFieldsByDeviceType(@Param("updateDO") AppTokenInfoDO updateDO, @Param("deviceType") Integer deviceType);

        public Integer deleteByDeviceType(@Param("deviceType") Integer deviceType);




        public List<AppTokenInfoDO> listByInDeviceType(@Param("deviceTypeList") Collection<Integer> deviceTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppTokenInfoDO> mapByInDeviceType(@Param("deviceTypeList") Collection<Integer> deviceTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeviceType(@Param("deviceTypeList") Collection<Integer> deviceTypeList);

        public default AppTokenInfoDO singleResultByInDeviceType(Collection<Integer> deviceTypeList, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInDeviceType(deviceTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppTokenInfoDO>> groupingByInDeviceType(Collection<Integer> deviceTypeList, Function<AppTokenInfoDO, T> mapper, String[] fieldNames){
             List<AppTokenInfoDO> list=this.listByInDeviceType(deviceTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeviceType(@Param("updateDO") AppTokenInfoDO updateDO, @Param("deviceTypeList") Collection<Integer> deviceTypeList);

        public Integer updateAllFieldsByInDeviceType(@Param("updateDO") AppTokenInfoDO updateDO, @Param("deviceTypeList") Collection<Integer> deviceTypeList);

        public Integer deleteByInDeviceType(@Param("deviceTypeList") Collection<Integer> deviceTypeList);


}
