package com.lzw.common.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 记录交易日志，用户的一般、重要的操作都需要调用log方法记录日志
 *
 * @author liys
 * @date 2018/9/611:23
 */
public class TradeLogService {
    private static final Logger logger= LoggerFactory.getLogger(TradeLogService.class);

    private static final Character CHAR_01=01;

    private static final String CHAR_01_STR=CHAR_01.toString();

    /**
     * 写日志
     * @param userId 用户id
     * @param tradeTypeCode 交易类型编码
     * @param sysCode 系统编写
     * @param sysName 系统名称
     * @param moduleName 模块名称
     * @param targetName 操作目标名称
     * @param tradeInfo 操作说明
     * @param remark 详情说明
     */
    public void log(Object userId,
                    String tradeTypeCode,
                    String sysCode,
                    String sysName,
                    String moduleName,
                    String targetName,
                    String tradeInfo,
                    String remark
                    ){
        logger.debug("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}",
                userId,
                CHAR_01_STR,
                tradeTypeCode,
                CHAR_01_STR,
                sysCode,
                CHAR_01_STR,
                sysName,
                CHAR_01_STR,
                moduleName,
                CHAR_01_STR,
                targetName,
                CHAR_01_STR,
                tradeInfo,
                CHAR_01_STR,
                remark,
                CHAR_01_STR,
                System.currentTimeMillis());
    }

}
