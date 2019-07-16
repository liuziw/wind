package com.lzw.wind.gateway.manager;

import com.hyzs.gateway.enums.AuthInfoEnum;
import org.springframework.web.server.ServerWebExchange;

/**
 * <PRE>
 *     一般需要验证两种信息
 *          1.调用渠道的信息，防止恶意攻击
 *          2.用户权限信息，有些接口需要登陆之后才能调用
 * </PRE>
 */
public interface AuthManager {

    /**
     * 调用的渠道鉴权,一般使用加密签名的方式进行验证
     * <PRE>
     *     验证X-Channel-Info字段信息
     * </PRE>
     * @param exchange
     * @return
     */
    public AuthInfoEnum checkChannelInfo(ServerWebExchange exchange);


    /**
     * 用户的权限校验,一般是token的合法性
     * <PRE>
     *     验证X-Auth-Info字段信息
     * </PRE>
     * @param exchange
     * @return
     */
    public AuthInfoEnum checkAuthInfo(ServerWebExchange exchange);

}
