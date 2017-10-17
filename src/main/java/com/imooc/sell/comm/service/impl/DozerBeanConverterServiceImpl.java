package com.imooc.sell.comm.service.impl;

import com.imooc.sell.comm.service.BeanConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

@Service
public class DozerBeanConverterServiceImpl implements BeanConverter {

    private DozerBeanMapper converter;

    public void setConverter(DozerBeanMapper converter) {
        this.converter = converter;
    }

    public DozerBeanConverterServiceImpl(){
    }

    public DozerBeanConverterServiceImpl(DozerBeanMapper mapper){
        this.converter = mapper;
    }


    @Override
    public void convert(Object src, Object des) {
        if(src == null)
            des = null;
        else
            converter.map(src, des);
    }

    @Override
    public void convert(Object src, Object des, String mapId) {
        if(src == null)
            des = null;
        else
            converter.map(src, des, mapId);
    }

    @Override
    public <T> T convert(Object src, Class<T> desClass, String mapId) {

        return src==null?null:converter.map(src, desClass, mapId);
    }

    @Override
    public <T> T convert(Object src, Class<T> desClass) {

        return src==null?null:converter.map(src, desClass);
    }
}
