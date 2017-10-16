package com.imooc.sell.repository;

import com.imooc.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @Description 类目表DAO
 * @Author Carey
 * @Date 23:51 2017/10/16
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
}
