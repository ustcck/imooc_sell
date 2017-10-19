package com.imooc.sell.comm.dto;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @Description 请求返回DTO
 * @Author Carey
 * @Date 0:13 2017/10/20
 */
@Data
public class ResponseDto implements Serializable{

    private static final long serialVersionUID = 1L;

    /**返回代码**/
    private String resultCode;
    /**返回结果**/
    private String resultMsg;
    /**返回数据**/
    private Object resultObj;

    public ResponseDto(String resultCode, String resultMsg, Object resultObj) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultObj = resultObj;
    }

    private ResponseDto(Object resultObj){
        this.resultCode ="0000";
        this.resultMsg ="成功";
        this.resultObj = resultObj;
    }

    public ResponseDto() {
    }

    public static ResponseDto instance(Object resultObj){
        return new ResponseDto(resultObj);
    }



}
