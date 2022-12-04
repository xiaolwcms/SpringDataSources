package org.lwcms.springdatasources.constant;

import org.springframework.http.HttpStatus;

/**
 * @ClassName ErrorCode
 * @Description TODO
 * @Author lwcms
 * @Date 2022/12/4 20:38
 */
public enum ErrorCode {
    /**
     * 日期类型转换错误
     */
    DATA_FORMAT_ERROR(HttpStatus.BAD_REQUEST,"DATE_FORMAT","日期类型转换出错"),
    /**
     * 日期类型转换错误
     */
    INVALID_ARGUMENT(HttpStatus.BAD_REQUEST,"INVALID_ARGUMENT","无效参数"),
    /**
     * 用户名密码错误
     */
    LOGINNAMEANDPASSWORDERROR(HttpStatus.BAD_REQUEST,"LOGINNAMEANDPASSWORDERROR","用户名密码错误"),


    ;
    private HttpStatus httpStatus;
    private String code;
    private String message;
    ErrorCode(HttpStatus httpStatus,String code,String message){
        this.httpStatus=httpStatus;
        this.code=code;
        this.message=message;
    }
    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.getMsg();
    }
}
