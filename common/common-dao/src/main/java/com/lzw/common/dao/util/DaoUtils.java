package com.lzw.common.dao.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.lzw.common.core.bo.PageBO;
import com.lzw.common.dao.dto.PageQueryDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.enums.QueryTypeEnum2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: liys
 * Date: 2017-11-15
 */
public abstract class DaoUtils {

    public static final String IS_DELETED_FILE_NAME="IS_DELETED";


    private static final List<Object> EMPTY_IN_LIST;

    static{
        List<Object> list=new ArrayList<>(1);
        list.add(null);
        EMPTY_IN_LIST= Collections.unmodifiableList(list);
    }


    /**
     * 下划线转驼峰法
     * @param line 源字符串
     * @param smallCamel 大小驼峰,是否为小驼峰
     * @return 转换后的字符串
     */
    public static String underline2Camel(String line,boolean smallCamel){
        if(line==null||"".equals(line)){
            return "";
        }
        StringBuffer sb=new StringBuffer();
        Pattern pattern=Pattern.compile("([A-Za-z\\d]+)(_)?");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            String word=matcher.group();
            sb.append(smallCamel&&matcher.start()==0?Character.toLowerCase(word.charAt(0)):Character.toUpperCase(word.charAt(0)));
            int index=word.lastIndexOf('_');
            if(index>0){
                sb.append(word.substring(1, index).toLowerCase());
            }else{
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
    /**
     * 驼峰法转下划线
     * @param line 源字符串
     * @return 转换后的字符串
     */
    public static String camel2Underline(String line){
        if(line==null||"".equals(line)){
            return "";
        }
        line=String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
        StringBuffer sb=new StringBuffer();
        Pattern pattern= Pattern.compile("[A-Z]([a-z\\d]+)?");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            String word=matcher.group();
            sb.append(word.toUpperCase());
            sb.append(matcher.end()==line.length()?"":"_");
        }
        return sb.toString();
    }


    /**
     * java驼峰转下划线
     * @param javaFieldName
     * @return
     */
    public static String javaFieldName2DatabaseFieldName(String javaFieldName)
    {
       return camel2Underline(javaFieldName);
    }


    /**
     * 根据三个参数生成QueryItemDTO对象
     * @param fieldName
     * @param queryType
     * @param value
     * @return
     */
    public static QueryItemDTO buildQueryItem(String fieldName, QueryTypeEnum2 queryType, Object value){
        return new QueryItemDTO(fieldName,queryType,value);
    }


    /**
     * 生成一个操作符为"="的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildEqualTo(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.EQUAL_TO,value);
    }

    /**
     * 生成一个操作符为"<>"的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildNotEqualTo(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.NOT_EQUAL_TO,value);
    }

    /**
     * 生成一个操作符为"in"的查询条件
     * @param fieldName
     * @param list
     * @return
     */
    public static QueryItemDTO buildIn(String fieldName,Collection<?> list){
        if(CollectionUtils.isEmpty(list)){
            return buildQueryItem(fieldName,QueryTypeEnum2.IN, EMPTY_IN_LIST);
        }
        return buildQueryItem(fieldName,QueryTypeEnum2.IN, list);
    }

    /**
     * 生成一个操作符为"in"的查询条件
     * @param fieldName
     * @param values
     * @return
     */
    public static QueryItemDTO buildIn(String fieldName,Object... values){
        if(values==null || values.length==0){
            return buildQueryItem(fieldName,QueryTypeEnum2.IN, EMPTY_IN_LIST);
        }
        return buildQueryItem(fieldName,QueryTypeEnum2.IN, Arrays.asList(values));
    }

    /**
     * 生成一个操作符为"not in"的查询条件
     * @param fieldName
     * @param values
     * @return
     */
    public static QueryItemDTO buildNotIn(String fieldName,Object... values){
        return buildQueryItem(fieldName,QueryTypeEnum2.NOT_IN, Arrays.asList(values));
    }


    /**
     * 生成一个操作符为">"的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildGreaterThen(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.GREATER_THAN,value);
    }

    /**
     * 生成一个操作符为">="的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildGreaterThenOrEqualTo(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.GREATER_THAN_OR_EQUAL_TO,value);
    }

    /**
     * 生成一个操作符为"<"的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildLessThen(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.LESS_THAN,value);
    }

    /**
     * 生成一个操作符为"<="的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildLessThenOrEqualTo(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO,value);
    }

    /**
     * 生成一个操作符为"is not null"的查询条件
     * @param fieldName
     * @return
     */
    public static QueryItemDTO buildIsNotNull(String fieldName){
        return buildQueryItem(fieldName,QueryTypeEnum2.IS_NOT_NULL,"");
    }

    /**
     * 生成一个操作符为"is  null"的查询条件
     * @param fieldName
     * @return
     */
    public static QueryItemDTO buildIsNull(String fieldName){
        return buildQueryItem(fieldName,QueryTypeEnum2.IS_NULL,"");
    }

    /**
     * 生成一个操作符为"like"的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildLike(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.LIKE,value);
    }


    /**
     * 生成一个操作符为"not like"的查询条件
     * @param fieldName
     * @param value
     * @return
     */
    public static QueryItemDTO buildNotLike(String fieldName,Object value){
        return buildQueryItem(fieldName,QueryTypeEnum2.NOT_LIKE,value);
    }


    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     end_time>=now() and start_time<now()
     * </PRE>
     * @return
     */
    public static QueryItemDTO[] buildTimeScope(){
        QueryItemDTO queryItems[]=new QueryItemDTO[2];
        Date date=new Date();
        queryItems[0]=buildGreaterThenOrEqualTo("endTime",date);
        queryItems[1]=buildLessThen("starTime",date);
        return queryItems;
    }

    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     end_time>=now() and start_time<now()
     * </PRE>
     * @return
     */
    public static List<QueryItemDTO> buildTimeScopeAsList(){
        List<QueryItemDTO> list= Lists.newArrayList();
        Date date=new Date();
        list.add(buildGreaterThenOrEqualTo("endTime",date));
        list.add(buildLessThen("starTime",date));
        return list;
    }

    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     endTimeFieldName>=now() and startTimeFieldName<now()
     * </PRE>
     * @return
     */
    public static QueryItemDTO[] buildTimeScope(String startTimeFieldName,String endTimeFieldName){
        QueryItemDTO queryItems[]=new QueryItemDTO[2];
        Date date=new Date();
        queryItems[0]=buildGreaterThenOrEqualTo(endTimeFieldName,date);
        queryItems[1]=buildLessThen(startTimeFieldName,date);
        return queryItems;
    }

    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     endTimeFieldName>=now() and startTimeFieldName<now()
     * </PRE>
     * @return
     */
    public static List<QueryItemDTO> buildTimeScopeAsList(String startTimeFieldName,String endTimeFieldName){
        List<QueryItemDTO> list= Lists.newArrayList();
        Date date=new Date();
        list.add(buildGreaterThenOrEqualTo(endTimeFieldName,date));
        list.add(buildLessThen(startTimeFieldName,date));
        return list;
    }

    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     endTimeFieldName>=time and startTimeFieldName<time
     * </PRE>
     * @return
     */
    public static QueryItemDTO[] buildTimeScope(String startTimeFieldName,String endTimeFieldName,Date time){
        QueryItemDTO queryItems[]=new QueryItemDTO[2];
        Date date=time;
        queryItems[0]=buildGreaterThenOrEqualTo(endTimeFieldName,date);
        queryItems[1]=buildLessThen(startTimeFieldName,date);
        return queryItems;
    }

    /**
     * 生成时间范围的查询条件
     * <PRE>
     *     endTimeFieldName>=time and startTimeFieldName<time
     * </PRE>
     * @return
     */
    public static List<QueryItemDTO> buildTimeScopeAsList(String startTimeFieldName,String endTimeFieldName,Date time){
        List<QueryItemDTO> list= Lists.newArrayList();
        Date date=time;
        list.add(buildGreaterThenOrEqualTo(endTimeFieldName,date));
        list.add(buildLessThen(startTimeFieldName,date));
        return list;
    }

    /**
     * 转换
     * @param fieldNames
     * @param values
     * @return
     */
    public static List<QueryItemDTO> buildEqualToItems(String[] fieldNames,Object[] values){
        List<QueryItemDTO> list=Lists.newArrayListWithCapacity(fieldNames.length);
        for(int i=0;i<fieldNames.length;i++){
            list.add(buildEqualTo(fieldNames[i],values[i]));
        }
        return list;
    }


    /**
     * 分页查询,利用分页助手.一般自定义Sql的情况下使用。
     * 分页统一的查询方法,使用方法
     *<PRE>
     PageQueryDTO pageQueryDTO=new PageQueryDTO();
     pageQueryDTO.setCurrPage(2);
     pageQueryDTO.setPageSize(10);
     PageBO<SysAreaEntity> pageBO=CommonUtils.listDOByPage(()->this.sysAreaEntityDao.selectSysAreaEntity(),pageQueryDTO));
     *</PRE>
     *
     * @param supplier 执行sql返回一个List对象
     * @param pageQueryDTO
     * @param <T>
     * @return
     */
    public static <T> PageBO<T> listDOByPage(Supplier<List<T>> supplier, PageQueryDTO pageQueryDTO) {
        PageHelper.startPage(pageQueryDTO.getCurrPage(),pageQueryDTO.getPageSize());
        String sortFieldName = pageQueryDTO.getSortFieldNameForDatabase();
        //增加排序功能
        if(StringUtils.isNotBlank(sortFieldName)){
            PageHelper.orderBy(sortFieldName+" "+pageQueryDTO.getSortType());
        }
        List<T> list = supplier.get();
        PageInfo<T> page = new PageInfo<>(list);
        PageBO<T> pageBO = new PageBO<>();
        pageBO.setCurrPage(page.getPageNum());
        pageBO.setPageSize(page.getPageSize());
        pageBO.setList(page.getList());
        pageBO.setTotalCount(page.getTotal());
        pageBO.setTotalPage(page.getPages());
        return pageBO;
    }
}
