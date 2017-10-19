package com.imooc.sell.service.impl;

import com.imooc.sell.comm.service.BeanConverter;
import com.imooc.sell.dto.ProductCategoryDto;
import com.imooc.sell.entity.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import com.imooc.sell.service.ProductCategoryCrudService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 商品类目表操作数据库服务实现
 * @Author Carey
 * @Date 23:10 2017/10/17
 */
@Service
public class ProductCategoryCrudServiceImpl implements ProductCategoryCrudService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryCrudServiceImpl.class);

    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Autowired
    private BeanConverter beanConverter;

    @Override
    public void saveProductCategory(ProductCategoryDto productCategoryDto) {
        LOGGER.info("*****保存商品类目,类目名称={}****",productCategoryDto.getCategoryName());
        ProductCategory productCategory = beanConverter.convert(productCategoryDto,ProductCategory.class);
        productCategoryRepository.save(productCategory);

    }

    @Override
    public void deleteProductCategoryById(ProductCategoryDto productCategoryDto) {
        LOGGER.info("*****删除商品类目,类目ID={}****",productCategoryDto.getCategoryId());
        ProductCategory productCategory = beanConverter.convert(productCategoryDto,ProductCategory.class);
        productCategoryRepository.delete(productCategory);
    }

    @Override
    public void updateProductCategoryById(ProductCategoryDto productCategoryDto) {
        LOGGER.info("*****修改商品类目,类目ID={}****",productCategoryDto.getCategoryId());
        ProductCategory productCategory  = productCategoryRepository.findOne(productCategoryDto.getCategoryId());
        BeanUtils.copyProperties(productCategoryDto,productCategory);
        productCategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategoryDto queryProductCategoryById(ProductCategoryDto productCategoryDto) {
        LOGGER.info("*****查询商品类目,类目ID={}****",productCategoryDto.getCategoryId());
        ProductCategory productCategory  = productCategoryRepository.findOne(productCategoryDto.getCategoryId());
        ProductCategoryDto queryResult = beanConverter.convert(productCategory,ProductCategoryDto.class);
        return queryResult;
    }

    @Override
    public List<ProductCategoryDto> queryAllProduct() {
        LOGGER.info("****查询所有类目****");
        List<ProductCategory> productCategoryList =  productCategoryRepository.findAll();
        List<ProductCategoryDto> productCategoryDtoList = new ArrayList<ProductCategoryDto>();
        BeanUtils.copyProperties(productCategoryList,productCategoryDtoList);
        return productCategoryDtoList;
    }
}
