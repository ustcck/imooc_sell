package com.imooc.sell.service.impl;

import com.imooc.sell.service.ProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryServiceImpl.class);

    @Override
    public void saveProductCategory() {
        LOGGER.info("*****保存商品类目****");
    }
}
