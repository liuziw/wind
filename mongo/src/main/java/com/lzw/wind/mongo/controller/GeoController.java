package com.lzw.wind.mongo.controller;

import com.lzw.wind.mongo.entity.ChargePoi;
import com.lzw.wind.mongo.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.GeoResults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("geo")
public class GeoController {

    @Autowired
    private GeoService geoService;


    @PostMapping("saveGeo")
    public void saveGeo() {
        geoService.test1();
    }

    @GetMapping("circle")
    public List<ChargePoi> circle() {
        return geoService.test2();
    }

    @GetMapping("spherical")
    public List<ChargePoi> spherical() {
        return geoService.test3();
    }

    @GetMapping("box")
    public List<ChargePoi> box() {
        return geoService.test4();
    }

    @GetMapping("near")
    public List<ChargePoi> near() {
        return geoService.test5();
    }

    @GetMapping("nearSphere")
    public List<ChargePoi> nearSphere() {
        return geoService.test6();
    }

    @GetMapping("nearDistance")
    public GeoResults<ChargePoi> nearDistance() {
        return geoService.test7();
    }

}
