package com.imooc.sell.comm.dto;
/**
 * @Description 业务异常
 * @Author Carey
 * @Date 0:37 2017/10/20
 */
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 1L;
    //通用业务异常code
    public static final String BUSINESS_ERROR_CODE = "9999";

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(BUSINESS_ERROR_CODE, message);
    }

    public BusinessException(String code, String message) {
        super(code, message);
    }
}
