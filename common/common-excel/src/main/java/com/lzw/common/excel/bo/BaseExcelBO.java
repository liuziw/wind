package com.lzw.common.excel.bo;

import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/6/5 19:48
 */
public interface BaseExcelBO{
    //要导出的列放入list中
    List<Object> toList();
}
