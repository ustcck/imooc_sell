package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 商品大对象
 * @Author Carey
 * @Date 0:44 2017/10/20
 */
@Getter
@Setter
public class ProductDto implements Serializable{
    private static final long servialVersionUID = 1L;

    /**类目**/
    private ProductCategoryDto productCategoryDto;
    /**商品列表**/
    @JsonProperty("foods")
    private List<ProductInfoDto> productInfoDtoList;
}
