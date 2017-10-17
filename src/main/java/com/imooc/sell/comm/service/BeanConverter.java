package com.imooc.sell.comm.service;
/**
 * @Description  类转换用服务
 * @Author Carey
 * @Date 23:30 2017/10/17
 */
public interface BeanConverter {
    public void convert(Object src,Object des);

    public void convert(Object src,Object des, String mapId);

    public <T> T convert(Object src, Class<T> desClass, String mapId);

    public <T> T convert(Object src, Class<T> desClass);
}
