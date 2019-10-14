package com.lzw.test.randowWeight;

import org.apache.commons.math3.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/22 15:35
 */
public class Test {
    public static void main(String [] args){
        List<Pair<String,Float>> pairList = new ArrayList<>();
        Pair<String,Float> p1 = new Pair("A",1);
        Pair<String,Float> p2 = new Pair("B",2);
        Pair<String,Float> p3 = new Pair("C",3);
        Pair<String,Float> p4 = new Pair("D",4);
        pairList.add(p1);
        pairList.add(p2);
        pairList.add(p3);
        pairList.add(p4);
        WeightRandom<String,Float> weightRandom = new WeightRandom<>(pairList);
        for(int i=0;i<100;i++){
            System.out.println(weightRandom.random());
        }
    }
}
