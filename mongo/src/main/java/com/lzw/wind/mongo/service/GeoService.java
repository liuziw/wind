package com.lzw.wind.mongo.service;

import com.lzw.wind.mongo.entity.ChargePoi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.NearQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GeoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 准备测试数据
     * save
     */
    public void test1() {
        for (int x = 100; x < 131; x++) {
            for (int y = 30; y < 61; y++) {
                Double loca[] = new Double[]{Double.valueOf(x), Double.valueOf(y)};
                ChargePoi chargePoi = new ChargePoi();
                chargePoi.setPoi_id("poiid" + x);
                chargePoi.setMedia_url("http://www.baidu.com?params=" + x);
                chargePoi.setPoi_name("vini" + Arrays.toString(loca));
                chargePoi.setPrice(Math.random() * 100);
                chargePoi.setLocation(loca);
                mongoTemplate.insert(chargePoi);
            }
        }
    }

    /**
     * 圆形查询（在圆形范围内部）
     * circle
     */
    public List<ChargePoi> test2() {
        Circle circle = new Circle(30, 20, 20);
        List<ChargePoi> find = mongoTemplate.find(new Query(Criteria.where("location").within(circle)), ChargePoi.class);
        System.out.println(find);
        System.out.println(find.size());
        return find;
    }

    /**球形查询（在球体内部）
     * spherical
     */
    public List<ChargePoi> test3() {
        Circle circle = new Circle(30,20, 20);
        List<ChargePoi> find = mongoTemplate.find(new Query(Criteria.where("location").withinSphere(circle)), ChargePoi.class);
        System.out.println(find.size());
        System.out.println(find);
        return find;
    }

    /**
     * 矩形查询（在矩形内部）
     * box
     */
    public List<ChargePoi> test4() {
        Box box = new Box(new Point(10, 11), new Point(10, 20));
        List<ChargePoi> find =
                mongoTemplate.find(new Query(Criteria.where("location").within(box)), ChargePoi.class);
        System.out.println(find.size());
        System.out.println(find);
        return find;
    }

    /**
     * 按距离由近到远查询
     * near
     */
    public List<ChargePoi> test5() {
        Point point = new Point(12, 12);
        List<ChargePoi> venues =
                mongoTemplate.find(new Query(Criteria.where("location").near(point).maxDistance(20)), ChargePoi.class);
        System.out.println(venues.size());
        System.out.println(venues);
        return venues;
    }

    /**
     * 空间距离由近到远查询
     * nearSphere
     */
    public List<ChargePoi> test6() {
        Point point = new Point(12, 12);
        List<ChargePoi> venues =
                mongoTemplate.find(new Query(Criteria.where("location").nearSphere(point).maxDistance(20)), ChargePoi.class);
        System.out.println(venues.size());
        System.out.println(venues);
        return venues;
    }

    /**
     * 最近点查询
     */
    public GeoResults<ChargePoi> test7() {
        Point location = new Point(12, 12);
        NearQuery query = NearQuery.near(location).maxDistance(new Distance(100000, Metrics.KILOMETERS));
        GeoResults<ChargePoi> result = mongoTemplate.geoNear(query, ChargePoi.class);
        System.out.println(result);
        return result;
    }

}
