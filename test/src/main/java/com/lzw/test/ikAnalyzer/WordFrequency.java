package com.lzw.test.ikAnalyzer;

import org.apache.commons.lang3.StringUtils;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;

/**
 * 利用IK分词器进行词频统计的工具类
 * IK2012 具有 160 万字 / 秒（ 3000KB/S ）的高速处理能力
 *
 * @author liuziw
 * @date 2019/11/7 14:18
 */
public class WordFrequency {

    /**
     * 对内容进行词频统计并排序，次数多的在前
     * @param content
     * @return
     * @throws IOException
     */
    public static List<Map.Entry<String, Integer>> wordFrequencyCountAndOrder(String content) throws IOException {
        return WordFrequency.orderWordFrequency(WordFrequency.countWordFrequency(new HashMap<String, Integer>(), content));
    }

    /**
     * 对内容进行词频统计,不排序
     * @param content
     * @return
     * @throws IOException
     */
    public static List<Map.Entry<String, Integer>> wordFrequency(String content) throws IOException {
        return WordFrequency.wordFrequency(WordFrequency.countWordFrequency(new HashMap<String, Integer>(), content));
    }

    /**
     * 词频统计
     *
     * @param frequencies 词频；key：词语；value:出现次数
     * @param content     内容
     * @return
     * @throws IOException
     */
    public static Map<String, Integer> countWordFrequency(Map<String, Integer> frequencies, String
            content) throws IOException {
        if (frequencies == null) {
            frequencies = new HashMap<>();
        }
        if (StringUtils.isBlank(content)) {
            return frequencies;
        }

        //true 使用smart分词，false使用最小颗粒分词
        IKSegmenter ikSegmenter = new IKSegmenter(new StringReader(content), true);

        Lexeme lexeme;
        while ((lexeme = ikSegmenter.next()) != null) {
            final String text = lexeme.getLexemeText();

            if (text.length() > 1) {
                //递增
                if (frequencies.containsKey(text)) {
                    frequencies.put(text, frequencies.get(text) + 1);
                } else {//首次出现
                    frequencies.put(text, 1);
                }
            }
        }

        return frequencies;


    }

    /**
     * 按出现次数，从高到低排序
     *
     * @param data
     * @return
     */
    public static List<Map.Entry<String, Integer>> orderWordFrequency(Map<String, Integer> data) {
        List<Map.Entry<String, Integer>> result = wordFrequency(data);
        Collections.sort(result, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return result;
    }

    public static List<Map.Entry<String, Integer>> wordFrequency(Map<String, Integer> data) {
        if (data == null) {
            return new ArrayList<>();
        }
        List<Map.Entry<String, Integer>> result = new ArrayList<>(data.entrySet());
        return result;
    }

    public static void main(String[] args) throws IOException {
        String content = "springboot读取外部配置文件的方法，如下优先级：\n" +
                "第一种是在执行命令的目录下建config文件夹。（在jar包的同一目录下建config文件夹，执行命令需要在jar包目录下才行），然后把配置文件放到这个文件夹下。\n" +
                "第二种是直接把配置文件放到jar包的同级目录。\n" +
                "第三种在classpath下建一个config文件夹，然后把配置文件放进去。\n" +
                "第四种是在classpath下直接放配置文件。\n" +
                "springboot默认是优先读取它本身同级目录下的一个config/application.properties 文件的。\n" +
                "在src/main/resources 文件夹下创建的application.properties 文件的优先级是最低的\n" +
                "\n" +
                "所以springboot启动读取外部配置文件，只需要在外面加一层配置文件覆盖默认的即可，不用修改代码。\n" +
                "\n" +
                "Spring Boot程序默认从application.properties或者application.yaml读取配置，如何将配置信息外置，方便配置呢？\n" +
                "\n" +
                "查询官网，可以得到下面的几种方案:";
        List<Map.Entry<String, Integer>> result = wordFrequencyCountAndOrder(content);
        System.out.println(result);
    }

}
