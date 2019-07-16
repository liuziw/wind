package com.lzw.wind.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.filter.FilterDefinition;
import org.springframework.cloud.gateway.filter.factory.RewritePathGatewayFilterFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

import static org.springframework.cloud.gateway.support.NameUtils.normalizeFilterFactoryName;


/**
 * <PRE>
 *     该类存在原因如下：
 *        在服务发现开启的情况发下，通过网关将请求转发到微服务上，请求的路径会发生如下变化
 *          1.访问网关的url为http://gateway.com/user-service/webapi/getUserInfo
 *          2.网关转发到user-service服务时，默认的地址为http://localhost:8080/webapi/getUserInfo,其中localhost:8080为user-service对的实际地址
 *        通过这个类的配置，实际请求的地址为http://localhost:8080/user-service/webapi/getUserInfo
 * </PRE>
 */
@Component
@Slf4j
public class DiscoveryLocatorPropertiesPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof DiscoveryLocatorProperties){
            log.warn("处理DiscoveryLocatorProperties对象...");
            DiscoveryLocatorProperties properties=(DiscoveryLocatorProperties)bean;
            List<FilterDefinition> filters = properties.getFilters();
            Iterator<FilterDefinition> iterator = filters.iterator();
            while(iterator.hasNext()){
                FilterDefinition filterDefinition = iterator.next();
                if(StringUtils.equals(normalizeFilterFactoryName(RewritePathGatewayFilterFactory.class),filterDefinition.getName())){
                    //path 不作处理
                    filterDefinition.setName(normalizeFilterFactoryName(ReplacePathGatewayFilterFactory.class));
                }
            }
        }
        return bean;
    }
}
