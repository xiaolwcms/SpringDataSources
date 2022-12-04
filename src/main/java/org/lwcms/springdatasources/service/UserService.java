package org.lwcms.springdatasources.service;

import org.lwcms.springdatasources.entry.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户service层
 */
public interface UserService {
   /*
    * @Description 用户登录
    * @Author: lwcms
    * @Date: 2022/12/4 20:20
    * @param: user
    * @return: user
    */
    User login(User user);
    /*
     * @Description
     * @Author  lwcms
     * @Date  2022/12/4 20:23
     * @param
     * @return
     */
    String register(User user);

}
