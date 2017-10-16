package com.imooc.sell.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @Description
 * @Author Carey
 * @Date 23:43 2017/10/16
 */
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
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
