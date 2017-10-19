package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
/**
 * @Description 商品信息DTO
 * @Author Carey
 * @Date 0:43 2017/10/20
 */
@Getter
@Setter
public class ProductInfoDto implements Serializable {

    private static final long servialVersionUID = 1L;
    /**商品ID**/
    private String productId;
    /**商品名称**/
    @JsonProperty("name")
    private String productName;
    /**商品价格**/
    @JsonProperty("price")
    private String productPrice;
    /***库存*/
    private String productStock;
    /***商品描述*/
    @JsonProperty("description")
    private String productDescription;
    /***商品图标*/
    @JsonProperty("icon")
    private String productIcon;
    /**商品状态**/
    private String productStatus;
    /**类目编号**/
    private String categoryType;
    /**创建时间**/
    private Date createTime;
    /**更新时间**/
    private Date updateTime;
}
