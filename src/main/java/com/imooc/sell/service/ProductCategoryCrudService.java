package com.imooc.sell.service;

import com.imooc.sell.dto.ProductCategoryDto;

/**
 * @Description 商品类目表数据库操作服务
 * @Author Carey
 * @Date 23:11 2017/10/17
 */
public interface ProductCategoryCrudService {

    /**
     * @Description 保存商品类目
     * @Author Carey
     * @Date 23:20 2017/10/17
     */
    public void saveProductCategory(ProductCategoryDto productCategoryDto);
    /**
     * @Description 根据主键删除商品类目
     * @Author Carey
     * @Date 23:20 2017/10/17
     */
    public void deleteProductCategoryById(ProductCategoryDto productCategoryDto);
    /**
     * @Description 根据主键修改商品类目
     * @Author Carey
     * @Date 23:20 2017/10/17
     */
    public void updateProductCategoryById(ProductCategoryDto productCategoryDto);
    /**
     * @Description 根据主键查询商品类目
     * @Author Carey
     * @Date 23:20 2017/10/17
     */
    public ProductCategoryDto queryProductCategoryById(ProductCategoryDto productCategoryDto);
}
