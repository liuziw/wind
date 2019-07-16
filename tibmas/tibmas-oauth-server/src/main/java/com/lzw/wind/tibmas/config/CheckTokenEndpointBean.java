package com.lzw.wind.tibmas.config;

import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.dbo.UserDO;
import com.hyzs.tibmas.core.service.AppService;
import com.hyzs.tibmas.core.service.UserService;
import com.hyzs.tibmas.oauth.bo.CheckTokenPermBO;
import com.hyzs.tibmas.oauth.bo.CheckTokenUserInfoBO;
import com.hyzs.tibmas.oauth.service.CheckTokenService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.endpoint.CheckTokenEndpoint;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultUserAuthenticationConverter;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/5 22:24
 */
@Component
public class CheckTokenEndpointBean implements BeanPostProcessor {

    @Autowired
    private UserService userService;
    @Autowired
    private AppService appService;


    @Autowired
    private CheckTokenService checkTokenService;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CheckTokenEndpoint) {
            CheckTokenEndpoint endpoint = (CheckTokenEndpoint) bean;
            DefaultUserAuthenticationConverter userAuthenticationConverter = new DefaultUserAuthenticationConverter() {
                @Override
                public Map<String, ?> convertUserAuthentication(Authentication authentication) {
                    return super.convertUserAuthentication(authentication);
                }

                @Override
                public Authentication extractAuthentication(Map<String, ?> map) {
                    return super.extractAuthentication(map);
                }
            };
            DefaultAccessTokenConverter defaultAccessTokenConverter = new DefaultAccessTokenConverter() {
                @Override
                public Map<String, ?> convertAccessToken(OAuth2AccessToken token, OAuth2Authentication authentication) {
                    Map<String, Object> map = new LinkedHashMap<>();
                    Map<String, ?> response = super.convertAccessToken(token, authentication);
                    String userAccount = "";
                    String clientId = "";
                    List<?> newPermList = null;
                    if (response.get("user_name") != null) {
                        userAccount = (String) response.get("user_name");
                    }
                    if (response.get("client_id") != null) {
                        clientId = (String) response.get("client_id");
                    }
                    UserDO userDO = userService.getUserDOByLoginAccountInfo(userAccount);
                    AppDO appDO = appService.getByAppCode(clientId);


                    if(userDO==null || appDO==null){
                        throw CommonException.paramException("用户或应用异常");
                    }

                    CheckTokenUserInfoBO userInfo = checkTokenService.getUserInfo(userDO.getId(), appDO.getId());
                    map.put("userInfo", CommonUtils.object2Json(userInfo));

                    if (response.get("authorities") instanceof Collection) {
                        Collection<?> collection = (Collection<?>) response.get("authorities");
                        newPermList = CommonUtils.filter2List(collection, obj -> {
                            if (obj == null) {
                                return false;
                            }
                            if (StringUtils.startsWithIgnoreCase(obj.toString(), "role_")) {
                                //如果角色的话，不用过滤
                                return true;
                            }
                            Set<String> userPermSet = CommonUtils.collection2Set(userInfo.getPermInfoList(), CheckTokenPermBO::getPermCode);
                            return userPermSet.contains(obj.toString());
                        });
                    }
                    map.putAll(response);
                    if (newPermList != null) {
                        map.put("authorities", newPermList);
                    }
                    return map;
                }
            };
            defaultAccessTokenConverter.setUserTokenConverter(userAuthenticationConverter);

            endpoint.setAccessTokenConverter(defaultAccessTokenConverter);
        }
        return bean;
    }
}
