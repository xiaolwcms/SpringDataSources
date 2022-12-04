package org.lwcms.springdatasources.dto;

import lombok.Data;
import org.lwcms.springdatasources.entry.User;

import java.util.Date;
@Data
public class UserDTO extends User {
    private Date user_create_timeStart;//用户注册开始时间段,用于时间段查询
    private Date user_create_timeEnd;//用户注册结束时间段,用于时间段查询
    private Date user_login_timeStart;//用户登录开始时间,用于时间段查询
    private Date user_login_timeEnd;//用户登录结束时间,用于时间段查询

}
