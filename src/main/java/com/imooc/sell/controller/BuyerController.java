package com.imooc.sell.controller;

import com.imooc.sell.comm.dto.ResponseDto;
import com.imooc.sell.service.ProductCategoryCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private ProductCategoryCrudService productCategoryCrudService;

    @GetMapping("/product/list")
    public ResponseDto queryProductList(){
        return ResponseDto.instance(null);
    }
}
