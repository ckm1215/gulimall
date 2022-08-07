package com.ckm.gulimall.product.common.unitize.code;

import com.fasterxml.jackson.annotation.JsonInclude;

/**返回json统一格式**/
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResultApi<T> {

    /** 返回状态码 **/
    private int code;

    /** 返回状态信息 **/
    private String message;

    /** 返回数据 **/
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /** 请求成功并返回数据data **/
    public static ResultApi success(Object data){
        return resApi(StateCode.SUCCESS,data);
    }

    /** 请求成功但没有返回数据 **/
    public static ResultApi success(){
        return resApi(StateCode.SUCCESS,null);
    }

    /** 请求失败 **/
    public static ResultApi error(){
        return resApi(StateCode.FAIL,null);
    }

    /** 请求失败有返回值 **/
    public static ResultApi error(Object data){
        return resApi(StateCode.FAIL,data);
    }


    public static ResultApi resApi(StateCode stateCode, Object data){
        ResultApi apiResult = new ResultApi();
        apiResult.setCode(stateCode.getCode());
        apiResult.setMessage(stateCode.getMessage());
        apiResult.setData(data);
        return apiResult;
    }





}
