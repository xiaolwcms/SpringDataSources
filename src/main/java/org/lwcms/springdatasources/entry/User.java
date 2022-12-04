package org.lwcms.springdatasources.entry;



import lombok.Data;

import java.sql.Date;

/**
 * @version 1.0
 * @ClassName User
 * @Author LWCMS
 * @Date 2022/9/27 20:17
 **/
@Data
public class User {
    private int user_id;//用户表ID
    private String user_login_name;//登录用户名
    private String user_password;//用户登录密码
    private Date user_create_time;//用户注册时间
    private Date user_login_time;//用户最近登录时间
    private String user_name;//用户昵称
    private String user_type;//用户类型
}
