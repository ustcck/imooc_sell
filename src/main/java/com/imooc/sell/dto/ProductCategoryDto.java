package com.imooc.sell.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Description 商品类目DTO
 * @Author Carey
 * @Date 23:14 2017/10/17
 */
public class ProductCategoryDto implements Serializable {

    private static final long serialVersionUID = 1l;

    /** 类目编号 **/
    private Integer categoryId;
    /** 类目名称 **/
    private String categoryName;
    /** 类目编号 **/
    private String categoryType;
    /** 创建时间 **/
    private Timestamp createTime;
    /** 更新时间 **/
    private Timestamp updateTime;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
