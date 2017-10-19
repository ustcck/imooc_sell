package com.imooc.sell.comm.dto;
/**
 * @Description 基础异常处理
 * @Author Carey
 * @Date 0:37 2017/10/20
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /** 自定义异常代码* */
    private String code;
    /** 自定义异常信息**/
    private String message;

    public BaseException(String code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }
}
