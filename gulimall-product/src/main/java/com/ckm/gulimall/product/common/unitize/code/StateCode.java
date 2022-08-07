package com.ckm.gulimall.product.common.unitize.code;

/**统一返回状态值**/
public enum StateCode {

     /** 操作成功 **/
     SUCCESS(200,"Success"),

     /** 操作失败 **/
     FAIL(500,"操作失败"),

    /** 登陆失败 **/
    LOGIN_EXCEPTION(4000, "登陆失败"),

    ;

     private final int code;
     private final String message;

     StateCode(final int code,final String message){
         this.code = code;
         this.message = message;
     }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }



}
