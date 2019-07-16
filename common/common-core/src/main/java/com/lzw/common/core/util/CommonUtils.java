package com.lzw.common.core.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.lzw.common.core.bo.Gps;
import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * User: liys
 * Date: 2017-09-16
 */
@Slf4j
public abstract class CommonUtils {


    private static final Logger logger= LoggerFactory.getLogger(CommonUtils.class);



    private static final ObjectMapper objectMapper=new ObjectMapper();

    private static final JacksonJsonParser jacksonJsonParser=new JacksonJsonParser();


    private static final Integer SUCCESS_CODE=new Integer(0);

    private static final String SUCCESS_MSG="TradeOK";

    private static final Integer UNKNOWN_EXCEPTION_CODE=new Integer(-1);

    //地球半径
    private static final  double EARTH_RADIUS = 6378.137;

    private static final double pi = 3.1415926535897932384626;
    private static final double a = 6378245.0;
    private static final double ee = 0.00669342162296594323;






    /**
     * 生成一个成功的{@linkplain ResponseVO}对象
     * @param t
     * @param <T>
     * @return
     */
    public static <T> ResponseVO<T> okResponseVO(T t)
    {
        ResponseVO<T> vo=new ResponseVO<>();
        vo.setCode(SUCCESS_CODE);
        vo.setMsg(SUCCESS_MSG);
        vo.setData(t);
        return vo;
    }


    /**
     * 生成一个响应失败的VO,包含异常的详细信息
     * @param e
     * @return
     */
    public static ResponseVO<?> errorResponseVO(Exception e){
        ResponseVO<String> vo=new ResponseVO<>();
        if(e instanceof CommonException)
        {
            CommonException ce=(CommonException)e;
            vo.setCode(ce.getCode());
            vo.setMsg(ce.getMsg());
        }
        else
        {
            vo.setCode(UNKNOWN_EXCEPTION_CODE);
            vo.setMsg(e.getMessage());
            //将详细信息设置在data中返回
            vo.setData(stackTrace2String(e));
        }
        return vo;
    }

    public static void responseMsg(ServletResponse response,Integer code,String msg) throws IOException{
        response.setContentType("application/json;charset=UTF-8");
        ResponseVO<String> rv=new ResponseVO<>();
        rv.setCode(code);
        rv.setMsg(msg);
        response.getWriter().print(objectMapper.writeValueAsString(rv));
    }

    /**
     * 获取异常的详细信息.
     * @param e
     * @return
     * @author ashan
     * @date 2017/7/8
     */
    public static String stackTrace2String(Throwable e)
    {
        ByteArrayOutputStream os=new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(os);
        e.printStackTrace(ps);
        return os.toString();
    }


    /**
     * 根据错误描述生成一个{@linkplain ResponseVO}对象
     * @param msg
     * @return
     */
    public static ResponseVO<?> errorResponseVO(String msg)
    {
        ResponseVO<?> responseVO=new ResponseVO<>();
        responseVO.setCode(UNKNOWN_EXCEPTION_CODE);
        responseVO.setMsg(msg);
        return responseVO;
    }


    /**
     * 检查远程调用返回的ResponseVO
     * @param responseVO
     * @param <T>
     * @return
     */
    public static <T> ResponseVO<T> checkResponseVO(ResponseVO<T> responseVO){
        if(responseVO==null){
            throw CommonException.paramException("远程调用失败ResponseVO<?>为空");
        }
        if(responseVO.getCode()==null || responseVO.getCode()!=0){
            log.error("code={},msg={},data={}",responseVO.getCode(),responseVO.getMsg(),responseVO.getData());
            throw CommonException.paramException("远程调用失败:"+responseVO.getMsg());
        }
        return responseVO;
    }


    /**
     *  根据class创建一个对象，并从src中复制属性，注意：只有名称和类型完全相同并有相应的setter及getter方法才能复制成功.
     * @param src
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T newInstance(Object src,Class<T> clazz)
    {
        T t=newInstance(clazz);
        copyProperties(src,t);
        return t;
    }


    /**
     * 根据class创建一个对象
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T newInstance(Class<T> tClass)
    {
        T target= BeanUtils.instantiate(tClass);
        return target;
    }


    /**
     * 复制属性。从src复制属性到target中。注意只有属性名和类型完全一样才能被复制。
     * @param src
     * @param target
     */
    public static void copyProperties(Object src,Object target)
    {
        BeanUtils.copyProperties(src,target);
    }









    /**
     * 转换PageBO对象。
     * T input
     * R output
     * @param srcPageBO
     * @param mapper
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> PageBO<R> convertPageBO(PageBO<T> srcPageBO, Function<? super T, ? extends R> mapper)
    {
        if(srcPageBO==null)
        {
            return null;
        }
        PageBO<R> targetPageBO=new PageBO<>();
        targetPageBO.setTotalPage(srcPageBO.getTotalPage());
        targetPageBO.setPageSize(srcPageBO.getPageSize());
        targetPageBO.setCurrPage(srcPageBO.getCurrPage());
        targetPageBO.setTotalCount(srcPageBO.getTotalCount());
        if(srcPageBO.getList()==null)
        {
            return targetPageBO;
        }
        targetPageBO.setList(srcPageBO.getList().stream().map(mapper).collect(Collectors.toList()));
        return targetPageBO;
    }


    /**
     * 转换PageBO。只是简单的实例化R对象并从T复制属性到R。
     * @param srcPageBO
     * @param rClass
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> PageBO<R> convertPageBO(PageBO<T> srcPageBO, Class<R> rClass)
    {
        return convertPageBO(srcPageBO,t -> newInstance(t,rClass));
    }

    /**
     * 根据修改时间gmtModified排序
     * 过时，使用{@link #sortListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param asc
     */
    @Deprecated
    public static void sortByModifyTime(List<?> list ,boolean asc){

        sortByTimeField(list,"gmtModified",asc);

    }

    /**
     * 根据修改时间gmtModified排序，对象中有children
     * 过时，使用{@link #sortTreeListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param asc
     */
    @Deprecated
    public static void sortByModifyTimeWithListTree(List<?> list ,boolean asc){
        sortByTimeFieldWithListTree(list,"gmtModified",asc);
    }

    /**
     * 根据排序字段seq排序
     * 过时，使用{@link #sortListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param asc
     */
    @Deprecated
    public static void sortBySeq(List<?> list ,boolean asc){
        sortByNumberField(list,"seq",asc);

    }

    /**
     * 根据排序字段seq排序，对象中有children
     * 过时，使用{@link #sortTreeListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param asc
     */
    @Deprecated
    public static void sortBySeqWithListTree(List<?> list ,boolean asc){
        sortByNumberFieldWithListTree(list,"seq",asc);
    }

    /**
     * list排序，根据传入时间字段fieldName排序
     * 过时，使用{@link #sortListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param fieldName 排序字段
     * @param asc
     */
    @Deprecated
    public static void sortByTimeField(List<?> list ,String fieldName,boolean asc){
        //为空，不用排
        if(CollectionUtils.isEmpty(list)){
            return;
        }

        Collections.sort(list,(e1,e2)->{
            if(e1==null || e2==null || getFieldValue(e1,fieldName)==null || getFieldValue(e2,fieldName)==null){
                return 0;
            }
            Date t1=(Date)getFieldValue(e1,fieldName);
            Date t2=(Date)getFieldValue(e2,fieldName);

            if(asc){
                return t1.compareTo(t2);
            }else {
                return t2.compareTo(t1);
            }
        });
    }

    /**
     *  根据传入时间字段fieldName排序，对象中有children
     *  过时，使用{@link #sortTreeListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param fieldName 排序字段
     * @param asc
     */
    @Deprecated
    public static void sortByTimeFieldWithListTree(List<?> list ,String fieldName ,boolean asc){
        sortByTimeField(list,fieldName,asc);
        list.forEach(e->{
            List<?> children = (List<?>)getFieldValue(e,"children");
            sortBySeqWithListTree(children,asc);
        });
    }

    /**
     * list排序，根据传入数字字段fieldName排序
     * 过时，使用{@link #sortListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param fieldName 排序字段
     * @param asc
     */
    @Deprecated
    public static void sortByNumberField(List<?> list ,String fieldName,boolean asc){
        //为空，不用排
        if(CollectionUtils.isEmpty(list)){
            return;
        }

        Collections.sort(list,(e1,e2)->{
            if(e1==null || e2==null || getFieldValue(e1,fieldName)==null || getFieldValue(e2,fieldName)==null){
                return 0;
            }
            Number seq1 = (Number) getFieldValue(e1,fieldName);
            Number seq2 = (Number)getFieldValue(e2,fieldName);
            Long i1 = seq1.longValue();
            Long i2 = seq2.longValue();
            if(asc){
                return i1.compareTo(i2);
            }else {
                return i2.compareTo(i1);
            }
        });
    }




    /**
     *  根据传入数字字段fieldName排序，对象中有children
     *  过时，使用{@link #sortTreeListByFieldName(List, String, boolean)}代替 liys 20190421
     * @param list
     * @param fieldName 排序字段
     * @param asc
     */
    @Deprecated
    public static void sortByNumberFieldWithListTree(List<?> list ,String fieldName ,boolean asc){
        sortByNumberField(list,fieldName,asc);
        list.forEach(e->{
            List<?> children = (List<?>)getFieldValue(e,"children");
            sortBySeqWithListTree(children,asc);
        });
    }


    /**
     * 对List进行排序
     * @param list 要排序的list
     * @param comparator 比较器
     * @param asc 是否升序
     */
    public static <T> void sortList(List<T> list,Comparator<? super T> comparator,boolean asc){
        Collections.sort(list,asc?comparator:comparator.reversed());
    }


    /**
     *
     * 根据列表中的指定字段进行排序，指定的字段的值必须实现{@link Comparable}接口
     *
     * @param list
     * @param fieldName
     * @param asc
     */
    public static void sortListByFieldName(List<?> list,String fieldName,boolean asc){
        Comparator comparator=(e1,e2)->{
            //处理，为null的问题，不然会抛出空指针异常
            if(e1==null || e2==null || getFieldValue(e1,fieldName)==null || getFieldValue(e2,fieldName)==null){
                return 0;
            }
            Comparable c1=(Comparable)getFieldValue(e1,fieldName);
            Comparable c2=(Comparable)getFieldValue(e2,fieldName);
            return c1.compareTo(c2);
        };
        sortList(list,comparator,asc);
    }


    /**
     *
     * 根据列表中的指定字段进行排序，指定的字段的值必须实现{@link Comparable}接口
     *<PRE>
     *     支持树状结构
     *</PRE>
     * @param list
     * @param fieldName
     * @param asc
     */
    public static void sortTreeListByFieldName(List<?> list,String fieldName,boolean asc){
        sortListByFieldName(list,fieldName,asc);
        list.forEach(e->{
            List<?> children = (List<?>)getFieldValue(e,"children");
            sortTreeListByFieldName(children,fieldName,asc);
        });
    }



    public static Object getFieldValue(Object target,String fieldsName){
        if(target==null){
            logger.warn("对象为空");
            return null;
        }
        Field field=FieldUtils.getField(target.getClass(),fieldsName,true);

        if(field==null){
            logger.warn("不存在该字段");
            return null;
        }
        Object obj = null;
        try {
            obj =  FieldUtils.readField(field,target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }


    /**
     * 对集合进行分组
     * @param collection
     * @param keyFunc
     * @param <K>
     * @param <D>
     * @return
     */
    public static <K,D> Map<K,List<D>> grouping(Collection<D> collection, Function<D,K> keyFunc){
        Map<K,List<D>> map=new HashMap<>();
        if(CollectionUtils.isEmpty(collection)){
            return map;
        }
        for(D d:collection){
            K k=keyFunc.apply(d);
            List<D> list=map.get(k);
            if(list==null){
                list=new ArrayList<>();
                map.put(k,list);
            }
            list.add(d);
        }
        return map;
    }


    /**
     * 生成Map
     * @param collection
     * @param keyFunc
     * @param <K>
     * @param <D>
     * @return
     */
    public static <K,D> Map<K,D> mapping(Collection<D> collection, Function<D,K> keyFunc){
        Map<K,D> map=new HashMap<>();
        if(CollectionUtils.isEmpty(collection)){
            return map;
        }
        for(D d:collection) {
            K k = keyFunc.apply(d);
            map.put(k,d);
        }
        return map;
    }


    /**
     * 数据转List
     * @param rs
     * @param <T>
     * @return
     */
    public static <T> List<T> array2List(T[] rs){
        if(rs==null || rs.length==0){
            return new ArrayList<>(0);
        }
        List<T> list= Lists.newArrayListWithCapacity(rs.length);
        for(T t:rs){
            list.add(t);
        }
        return list;
    }

    /**
     * 数据转Set
     * @param rs
     * @param <T>
     * @return
     */
    public static <T> Set<T> array2Set(T[] rs){
        Set<T> set= new HashSet<>();
        if(rs==null || rs.length==0){
            return set;
        }
        for(T t:rs){
            set.add(t);
        }
        return set;
    }


    /**
     * 数组转List
     * @param rs
     * @param func
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<R> array2List(T[] rs,Function<T,R> func){
        if(rs==null || rs.length==0){
            return new ArrayList<>(0);
        }
        List<R> list= Lists.newArrayListWithCapacity(rs.length);
        for(T t:rs){
            list.add(func.apply(t));
        }
        return list;
    }

    /**
     * 数组转Set
     * @param rs
     * @param func
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> Set<R> array2Set(T[] rs,Function<T,R> func){
        Set<R> set= new HashSet<>();
        if(rs==null || rs.length==0){
            return set;
        }
        for(T t:rs){
            set.add(func.apply(t));
        }
        return set;
    }


    /**
     * Collection转Set
     * @param rs
     * @param func
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> Set<R> collection2Set(Collection<T> rs,Function<T,R> func){
        Set<R> set= new HashSet<>();
        if(CollectionUtils.isEmpty(rs)){
            return set;
        }
        for(T t:rs){
            set.add(func.apply(t));
        }
        return set;
    }


    /**
     * List转List
     * @param rs
     * @param func
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<R> collection2List(Collection<T> rs,Function<T,R> func){
        if(CollectionUtils.isEmpty(rs)){
            return new ArrayList<>(0);
        }
        List<R> list= Lists.newArrayListWithCapacity(rs.size());
        for(T t:rs){
            list.add(func.apply(t));
        }
        return list;
    }


    /**
     * 过滤集合，返回List
     * @param rs
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> filter2List(Collection<T> rs,Predicate<? super T> predicate){
        if(CollectionUtils.isEmpty(rs)){
            return new ArrayList<>(0);
        }
        List<T> list= Lists.newArrayListWithCapacity(rs.size());
        for(T t:rs){
            if(predicate.test(t)){
                list.add(t);
            }
        }
        return list;
    }

    /**
     * 过滤集合，返回Set
     * @param rs
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> Set<T> filter2Set(Collection<T> rs,Predicate<? super T> predicate){
        Set<T> set= new HashSet<>();
        if(CollectionUtils.isEmpty(rs)){
            return set;
        }
        for(T t:rs){
            if(predicate.test(t)){
                set.add(t);
            }
        }
        return set;
    }


    /**
     * 当月的开始时间
     * @param date
     * @return
     */
    public static Date getMonthStartTime(Date date){
        return DateUtils.truncate(date, Calendar.MONTH);
    }

    /**
     * 当月的结束时间
     * @param date
     * @return
     */
    public static Date getMonthEndTime(Date date){
        return DateUtils.addMilliseconds(DateUtils.ceiling(date, Calendar.MONTH),-1);
    }





    /**
     * 当天的开始时间
     * @param date
     * @return
     */
    public static Date getDayStartTime(Date date){
        return DateUtils.truncate(date, Calendar.DATE);
    }

    /**
     * 当天的结束时间
     * @param date
     * @return
     */
    public static Date getDayEndTime(Date date){
        return DateUtils.addMilliseconds(DateUtils.ceiling(date, Calendar.DATE),-1);
    }

    /**
     * 得到上个月的第一天，格式为yyyy-MM-dd
     * @return
     */
    public static String getFirstDateStrOfLastMonth(){
        Calendar day = Calendar.getInstance();
        day.add(Calendar.MONTH, -1);
        day.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return dateFormat.format(day.getTime());
    }


    /**
     * 得到上个月的第一天，格式为yyyy-MM-dd
     * @return
     */
    public static Date getFirstDateOfLastMonth(){
        Calendar day = Calendar.getInstance();
        day.add(Calendar.MONTH, -1);
        day.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        day.set(Calendar.HOUR_OF_DAY,0);
        day.set(Calendar.MINUTE,0);
        day.set(Calendar.SECOND,0);
        day.set(Calendar.MILLISECOND,0);


        return day.getTime();
    }

    /**
     * 获取当月所有的天
     * @param date
     * @return
     */
    public static List<Date> getAllDate(Date date){
        //下月1号00:00:00
        Date maxDate = DateUtils.ceiling(date, Calendar.MONTH);
        List<Date> list=Lists.newArrayListWithCapacity(31);
        //当月1号00:00:00
        Date tmpDate=DateUtils.truncate(date, Calendar.MONTH);
        while(tmpDate.compareTo(maxDate)<0){
            list.add(tmpDate);
            //加一天
            tmpDate=DateUtils.addDays(tmpDate,1);
        }
        return list;
    }

    /**
     * 时间格式字符串转换成时间
     * @param dateStr
     * @return
     */
    public static Date convertString2Date(String dateStr){
        Date date;
        try {
            date =  DateUtils.parseDate(dateStr,"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd","yyyy-MM");
        } catch (ParseException e) {
            logger.error("时间格式转换失败",e);
            throw CommonException.exception("时间格式转换失败");
        }
        return date;
    }

    /**
     * 得到当天年月日格式时间字符串
     * @return
     */
    public static String getNowDateStr(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(date);
        return str;
    }

    /**
     * 根据时间得到年月日时间字符串
     * @param date
     * @return
     */
    public static String getDateStrByDateTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        return str;
    }

    /**
     * 得到某个时间前一天的时间
     * @param dateTime
     * @return
     */
    public static Date getLastDayTime(Date dateTime){
        Calendar ca = Calendar.getInstance();//得到一个Calendar的实例
        ca.setTime(dateTime);
        ca.add(Calendar.DATE, -1);
        Date lastDayTime = ca.getTime(); //结果
        return lastDayTime;
    }

    /**
     * 获取某段时间段内所有日期
     * @param begin 时间段开始时间
     * @param end 时间段结束时间
     * @return 时间段内日期列表
     */
    public static List<String> getBetweenDate(String begin,String end){
        List<String> dates = Lists.newArrayList();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            // 比较结束日期和开始日期
            int i = end.compareTo(begin);

            if (i <= -1) {
                return dates;
            }
            // 当结束日期大于或等于开始日期时，把开始日期放入集合
            dates.add(begin);

            Calendar calBegin = Calendar.getInstance();
            calBegin.setTime(sdf.parse(begin));
            Calendar calEnd = Calendar.getInstance();
            calEnd.setTime(sdf.parse(end));

            // 当结束日期大于开始日期时，循环累加开始日期
            while (i >= 1) {
                calBegin.add(Calendar.DAY_OF_MONTH, 1);
                dates.add(sdf.format(calBegin.getTime()));

                // 开始日期等于结束日期，跳出循环
                if (calBegin.equals(calEnd)) {
                    break;
                }
            }
        } catch (ParseException e) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "日期格式转换异常");
        }

        return dates;
    }

    /**
     * 得到两坐标点之间的距离 以 米为单位
     * @param lat1 坐标1 的维度
     * @param lng1 坐标1 的经度
     * @param lat2 坐标2 的维度
     * @param lng2 坐标2 的经度
     * @return
     */
    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 1000);
        return s;
    }

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     *四舍五入保留2位小数
     * 例如：
     * 123f返回123.00
     * 123.1返回123.10
     * 123.116返回123.12
     * 123.111返回123.11
     * @param number
     * @return
     */
    public static Double get2Decimal(Number number){
        return Double.parseDouble(String.format("%.2f",number));
    }

    /**
     * 得到百分比
     * @param total
     * @param number
     * @return
     */
    public static  Double getRate(Number total, Number number){
        if(total==null || total.equals(0) || number==null || number.equals(0) ){
            return  0D;
        }
        return  get2Decimal( number.floatValue() /  total.floatValue() * 100) ;
    }


    /**
     * 通过url 和 map 参数值拼接成完整的请求字符串
     *     例如：requestPath : /login
     *           paramMap : ("username", "admin")
     *                      ("password", "123456")
     *     返回结果为：/login?username=admin&password=123456
     * @param requestPath 请求url
     * @param paramMap 参数组成的map
     * @return
     */
    public static String buildFullUrlPath(String requestPath, Map<String, Object> paramMap){
        String URIPath = requestPath;
        if((paramMap != null) && (paramMap.size() > 0)){
            String paramPath = paramMap.entrySet().stream().map(e->e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&"));
            URIPath = URIPath + "?" + paramPath;
        }
        return URIPath;
    }


    /**
     * 把对象转成map
     * @param object
     * @return
     */
    public static Map<String, Object> changeObject2Map(Object object){
        Map<String, Object> map = new HashMap<>();
        if(object == null){
            return null;
        }
        Field[] fields = object.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            try {
                if(field.getType().equals(String.class)){
                    if(!StringUtils.isEmpty(field.get(object))){
                        map.put(field.getName(), field.get(object));
                    }
                }
                else if(field.get(object) != null){
                    map.put(field.getName(), field.get(object));
                }
            } catch (IllegalAccessException e) {
                logger.error("获取字段的值失败" + e.getMessage());
                e.printStackTrace();
                throw CommonException.exception("对象转MAP失败！");
            }
        }
        return map;
    }


    /**
     * 从数组或List/Collection中获取第一个元素，如果传入的不一个数姐或List/Collection则返回传入的对象
     * @param object
     * @return
     */
    public static Object getFirstElementFromArray(Object object){
        if(object==null){
            return null;
        }

        //是一个数姐
        if(object.getClass().isArray()){
            //拿长度
            int length = ArrayUtils.getLength(object);
            //长度为0，返回null
            if(length==0){
                return null;
            }
            //取第一个
            return Array.get(object,0);
        }
        else if(object instanceof List){
            List<?> list=(List<?>)object;
            if(CollectionUtils.isEmpty(list)){
                //为空，返回null
                return null;
            }
            return list.get(0);
        }
        else if(object instanceof Collection){
            Collection<?> collection=(Collection<?>)object;
            if(CollectionUtils.isEmpty(collection)){
                return null;
            }
            //返回
            return collection.iterator().next();
        }

        //原值返回
        return object;
    }

    /**
     * 从数组或List/Collection中获取第一个元素，如果传入的不一个数姐或List/Collection则返回传入的对象
     * 以String的形式返回
     * @param object
     * @return
     */
    public static String getFirstElementFromArrayForString(Object object){
        Object value=getFirstElementFromArray(object);
        if(value==null){
            return null;
        }
        return value.toString();
    }

    /**
     * 84 to 火星坐标系 (GCJ-02) World Geodetic System ==> Mars Geodetic System
     *
     * @param latitude
     * @param longitude
     * @return
     */
    public static Gps gps84_To_Gcj02(String latitude, String longitude) {
        double lat = Double.parseDouble(latitude);
        double lon = Double.parseDouble(longitude);
        if (outOfRange(lat, lon)) {
            return null;
        }
        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;
        Gps gps = new Gps();
        gps.setLatitude(String.valueOf(mgLat));
        gps.setLongitude(String.valueOf(mgLon));
        return gps;
    }

    private static double transformLat(double x, double y) {
        double ret = -100.0 + 2.0 * x + 3.0 * y + 0.2 * y * y + 0.1 * x * y
                + 0.2 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(y * pi) + 40.0 * Math.sin(y / 3.0 * pi)) * 2.0 / 3.0;
        ret += (160.0 * Math.sin(y / 12.0 * pi) + 320 * Math.sin(y * pi / 30.0)) * 2.0 / 3.0;
        return ret;
    }

    private static double transformLon(double x, double y) {
        double ret = 300.0 + x + 2.0 * y + 0.1 * x * x + 0.1 * x * y + 0.1
                * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(x * pi) + 40.0 * Math.sin(x / 3.0 * pi)) * 2.0 / 3.0;
        ret += (150.0 * Math.sin(x / 12.0 * pi) + 300.0 * Math.sin(x / 30.0
                * pi)) * 2.0 / 3.0;
        return ret;
    }

    private static boolean outOfRange(double lat, double lon) {
        if (lon < -180 || lon > 180)
            return true;
        if (lat < -90 || lat > 90)
            return true;
        return false;
    }

    /**
     * * 火星坐标系 (GCJ-02) to 84 * * @param lon * @param lat * @return
     */
    public static Gps gcj_To_Gps84(String lat, String lon) {
        Gps gps = transform(Double.parseDouble(lat), Double.parseDouble(lon));
        double longitude = Double.parseDouble(lon) * 2 - Double.parseDouble(gps.getLongitude());
        double latitude = Double.parseDouble(lat) * 2 - Double.parseDouble(gps.getLatitude());

        gps.setLatitude(String.valueOf(latitude));
        gps.setLongitude(String.valueOf(longitude));
        return gps;
    }

    public static Gps transform(double lat, double lon) {
        Gps gps = new Gps();
        if (outOfChina(lat, lon)) {
            gps.setLatitude(String.valueOf(lat));
            gps.setLongitude(String.valueOf(lon));
            return gps;
        }
        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;

        gps.setLatitude(String.valueOf(mgLat));
        gps.setLongitude(String.valueOf(mgLon));
        return gps;
    }

    public static boolean outOfChina(double lat, double lon) {
        if (lon < 72.004 || lon > 137.8347) {
            return true;
        }
        if (lat < 0.8293 || lat > 55.8271) {
            return true;
        }
        return false;
    }


    /**
     * 转换Map值
     * @param map
     * @param func
     * @param <K>
     * @param <V>
     * @param <R>
     * @return
     */
    public static <K,V,R> Map<K,R> mapValue(Map<K,V> map,Function<V,R> func){
        Map<K,R> newMap=new HashMap<>();
        if(map==null || map.isEmpty()){
            return newMap;
        }
        for(Map.Entry<K,V> entry:map.entrySet()){
            newMap.put(entry.getKey(),func.apply(entry.getValue()));
        }
        return newMap;
    }


    /**
     * 判断数字是否相等
     * @param n1
     * @param n2
     * @return
     */
    public static boolean equals(Number n1,Number n2){
        if(n1==null || n2==null){
            return false;
        }
        return n1.equals(n2);
    }


    /**
     * 从集合中找出一个元素
     * @param collection
     * @param predicate
     * @param <E>
     * @return
     */
    public static <E> E findElement(Collection<E> collection,Predicate<E> predicate){
        if(CollectionUtils.isEmpty(collection)){
            return null;
        }
        for(E e:collection){
            if(predicate.test(e)){
                return e;
            }
        }
        return null;
    }



    public static boolean isEmpty(Collection<?> collection){
        if(collection==null){
            return true;
        }
        if(collection.size()==0){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Map<?,?> map){
        if(map==null){
            return true;
        }
        if(map.size()==0){
            return true;
        }
        return false;
    }


    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }

    public static int size(Collection<?> collection){
        if(isEmpty(collection)){
            return 0;
        }
        return collection.size();
    }

    public static int size(Map<?,?> map){
        if(isEmpty(map)){
            return 0;
        }
        return map.size();
    }


    public static boolean isBlank(String str){
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    public static boolean isNotBlank(String str){
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    public static boolean isNotBlank(String ...strings){
        if(strings==null &&strings.length==0){
            throw CommonException.paramException("必须得有一个参数");
        }
        for(String str:strings){
            if(isBlank(str)){
                return false;
            }
        }
        return true;
    }

    public static Map<String,Object> json2Map(String json){
        return jacksonJsonParser.parseMap(json);
    }

    public static String map2Json(Map<String,Object> map){
        try {
            return objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw CommonException.exception("json error",e);
        }
    }

    public static String object2Json(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw CommonException.exception("json error",e);
        }
    }


    public static class Stu{
        private Long id;

        private String name;

        private Integer age;

        public Stu(Long id,String name,Integer age){
            this.id=id;
            this.name=name;
            this.age=age;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Stu{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
    }



}
