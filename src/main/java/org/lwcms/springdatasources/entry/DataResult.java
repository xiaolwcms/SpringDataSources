package org.lwcms.springdatasources.entry;

import lombok.Data;

import java.util.List;

/**
 * @ClassName DataResult
 * @Description 统一返回结果
 * @Author lwcms
 * @Date 2022/12/4 21:03
 */
@Data
public class DataResult<T> {
    private String success;//是否成功
    private Integer code;//返回码
    private String message;//返回消息
    private Long count;//数据条数
    private List<T> data;//返回数据

    public DataResult(String success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public DataResult(String success, Integer code, String message, Long count, List<T> data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.count = count;
        this.data = data;
    }
}
