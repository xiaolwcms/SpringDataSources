package org.lwcms.springdatasources.service.impl;

import org.lwcms.springdatasources.constant.Constants;
import org.lwcms.springdatasources.entry.User;
import org.lwcms.springdatasources.mapper.UserMapper;
import org.lwcms.springdatasources.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*
 * @Description 用户表Service实现层
 * @Author  lwcms
 * @Date  2022/12/4 20:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
      return userMapper.login(user);
    }

    @Override
    public String register(User user) {
        if(userMapper.addUser(user)==1){
            return Constants.OPERATION_SUCCESS;
        }
        return Constants.OPERATION_FAIL;
    }
}
