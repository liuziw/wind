package com.lzw.common.config.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Properties;

/**
 *
 * 配置客户端的初始化一些环境。该类主要的作用是配置CONFIG-SERVICE服务，实现其他应用的无配置启动.
 *  <pre>
 *      1.设置spring.application.name属性，主要拿启动类名。如ClientTestApplication=>CLIENT-NAME
 *      2.主动加上一些配置=>resouce/META-INF/defaultConfigClient.properties
 *      3.将spring.cloud.config.label，设置为{@link HostInfo}
 *
 *      spring.application.name/spring.cloud.config.label两个属性主要是与CONFIG-SERVICE交互时使用
 *  </pre>
 *
 * User: liys
 * Date: 2017-11-14
 */
public class HyzsConfigClientSpringApplicationRunListener implements SpringApplicationRunListener {


    private static final Logger logger= LoggerFactory.getLogger(HyzsConfigClientSpringApplicationRunListener.class);

    private SpringApplication application;

    private String[] args;


    private static final String LABEL_KEY="spring.cloud.config.label";

    private static final String SERVICE_NAME_KEY="spring.application.name";

    private static final String SERVER_PORT_KEY="server.port";

    private static final String EUREKA_SERVER_KEY="eureka.client.service-url.defaultZone";

    private static final String PROPERTIES_SOURCE_NAM="HyzsConfigClientSpringApplicationRunListener";

    private static final Properties DEFAULT_CONFIG_CLIENT_PROPERTIES=new Properties();

    private static final String DEFAULT_EUREKA_SERVER="http://172.16.8.20:8761/eureka";

    private static final ObjectMapper objectMapper=new ObjectMapper();

    static {
        try {
            DEFAULT_CONFIG_CLIENT_PROPERTIES.load(HyzsConfigClientSpringApplicationRunListener.class.getClassLoader().getResourceAsStream("META-INF/defaultConfigClient.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 这个方法是SpringBoot要求的,见{@link SpringApplicationRunListener}
     * @param application
     * @param args
     */
    public HyzsConfigClientSpringApplicationRunListener(SpringApplication application, String[] args)
    {
        this.application=application;
        this.args=args;
    }


    @Override
    public void starting() {

    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

        Properties properties=new Properties();
        properties.putAll(DEFAULT_CONFIG_CLIENT_PROPERTIES);

        //label
        String label = environment.getProperty(LABEL_KEY);
        if(StringUtils.isBlank(label))
        {
            //原配置中没有label,生成一个新的
            String newLabel=this.getLabel(environment);
            if(StringUtils.isNoneBlank(newLabel))
            {
                logger.info("设置环境变量{}={}",LABEL_KEY,newLabel);
                properties.setProperty(LABEL_KEY,newLabel);
            }
        }

        //name
        String name=environment.getProperty(SERVICE_NAME_KEY);



        //liys 20180723,集成Spring Cloud Bus 修改逻辑
        if(StringUtils.isBlank(name) ||
                StringUtils.equalsIgnoreCase(name,"Bootstrap") ||
                StringUtils.equalsIgnoreCase(name,"Application"))
        {
            //原配置中没有label,生成一个新的
            String newName=this.getServiceNameByApplication();
            if(StringUtils.isNoneBlank(newName))
            {
                logger.info("设置环境变量{}={}",SERVICE_NAME_KEY,newName);
                properties.setProperty(SERVICE_NAME_KEY,newName);
            }
        }
        else{
            //也加上
            properties.setProperty(SERVICE_NAME_KEY,name);
        }

        String eurekaServer=environment.getProperty(EUREKA_SERVER_KEY);

        if(StringUtils.isBlank(eurekaServer)){
            logger.warn("{}没有配置，将设置默认值：{}",EUREKA_SERVER_KEY,DEFAULT_EUREKA_SERVER);
            properties.setProperty(EUREKA_SERVER_KEY,DEFAULT_EUREKA_SERVER);
        }

        PropertiesPropertySource propertySource=new PropertiesPropertySource(PROPERTIES_SOURCE_NAM,properties);
        environment.getPropertySources().addFirst(propertySource);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext configurableApplicationContext) {

    }

    @Override
    public void running(ConfigurableApplicationContext configurableApplicationContext) {

    }

    @Override
    public void failed(ConfigurableApplicationContext configurableApplicationContext, Throwable throwable) {

    }

    /**
     * ClientTestApplication=>CLIENT-NAME
     * @return
     */
    protected String getServiceNameByApplication()
    {
        Class<?> tClass=this.application.getMainApplicationClass();
        String name=StringUtils.substringBefore(tClass.getSimpleName(),"Application");
        StringBuilder sb=new StringBuilder();
        if(StringUtils.isBlank(name))
        {
            return null;
        }
        sb.append(name.charAt(0));
        for(int i=1;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(Character.isUpperCase(c))
            {
                sb.append("-");
                sb.append(c);
            }
            else
            {
                sb.append(Character.toUpperCase(c));
            }

        }
        return sb.toString();
    }

    /**
     * 生成{@link HostInfo}对象，并转成json
     * @param environment
     * @return
     */
    protected String getLabel(ConfigurableEnvironment environment)
    {
        String ip=null;
        try {
            ip=InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            logger.warn("获取本IP失败:",e);
            return null;
        }
        String port=environment.getProperty(SERVER_PORT_KEY);
        HostInfo hostInfo=new HostInfo();
        hostInfo.setIps(Lists.newArrayList(ip));
        if(StringUtils.isNumeric(port))
        {
            hostInfo.setPort(Integer.parseInt(port));
        }
        try {
            return objectMapper.writeValueAsString(hostInfo);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    private static class HostInfo{

        private List<String> ips;

        private Integer port;


        public List<String> getIps() {
            return ips;
        }

        public void setIps(List<String> ips) {
            this.ips = ips;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("ips", ips)
                    .append("port", port)
                    .toString();
        }
    }


}
