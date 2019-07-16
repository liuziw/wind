package com.lzw.common.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * User: liys
 * Date: 2017-10-18
 */
@ApiModel("分页信息")
public class PageBO<T> implements Serializable {


    private static final long serialVersionUID = 1L;


    //总记录数
    @ApiModelProperty("总记录数")
    private Long totalCount;


    //每页记录数
    @ApiModelProperty("每页记录数")
    private Integer pageSize;


    //总页数
    @ApiModelProperty("总页数")
    private Integer totalPage;


    //当前页数
    @ApiModelProperty("当前页数")
    private Integer currPage;


    //列表数据
    @ApiModelProperty("列表数据")
    private List<T> list;


    private static final Integer INTEGER_0=new Integer(0);


    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("totalCount", totalCount)
                .append("pageSize", pageSize)
                .append("totalPage", totalPage)
                .append("currPage", currPage)
                .append("list", list)
                .toString();
    }
}
