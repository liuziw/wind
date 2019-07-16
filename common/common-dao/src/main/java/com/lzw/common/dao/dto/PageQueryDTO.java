package com.lzw.common.dao.dto;



import com.hyzs.gz.common.dao.util.DaoUtils;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * User: liys
 * Date: 2017-10-18
 */
public class PageQueryDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private static final String ORDER_TYPE_DESC="DESC";

    private static final String ORDER_TYPE_ASC="ASC";

    //每页记录数
    @ApiModelProperty("每页记录数")
    private Integer pageSize;


    //当前页数
    @ApiModelProperty("当前页数")
    private Integer currPage;



    @ApiModelProperty("排序字段")
    private String sortFieldName;


    @ApiModelProperty("排序方式:DESC-降序，ASC-升序")
    private String sortType;

    @ApiModelProperty("是否计算总的记录数,默认：true")
    private Boolean isCount=Boolean.TRUE;


    private static final Integer INTEGER_0=new Integer(0);


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }


    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public void setSortFieldName(String orderFieldName) {
        this.sortFieldName = orderFieldName;
        if(this.sortType==null)
        {
            this.setSortType(ORDER_TYPE_ASC);
        }
    }

    public String getSortType() {
        if(this.sortType==null)
        {
            return "";
        }
        return sortType;
    }

    public void setSortType(String orderType) {
        if(StringUtils.equalsIgnoreCase(ORDER_TYPE_DESC,orderType))
        {
            this.sortType=ORDER_TYPE_DESC;
            return;
        }
        this.sortType = ORDER_TYPE_ASC;
    }


    public Boolean getIsCount() {
        return isCount;
    }

    public void setIsCount(Boolean count) {
        isCount = count;
    }

    public String getSortFieldNameForDatabase() {
        if(StringUtils.isBlank(this.sortFieldName)){
            return null;
        }else{
            return DaoUtils.javaFieldName2DatabaseFieldName(this.sortFieldName);
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageQueryDTO{");
        sb.append("pageSize=").append(pageSize);
        sb.append(", currPage=").append(currPage);
        sb.append(", sortFieldName='").append(sortFieldName).append('\'');
        sb.append(", sortType='").append(sortType).append('\'');
        sb.append(", isCount=").append(isCount);
        sb.append('}');
        return sb.toString();
    }
}
