package org.lwcms.springdatasources.controller;

import lombok.extern.slf4j.Slf4j;
import org.lwcms.springdatasources.constant.Constants;
import org.lwcms.springdatasources.entry.DataResult;
import org.lwcms.springdatasources.entry.User;
import org.lwcms.springdatasources.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Description user控制层
 * @Author lwcms
 * @Date 2022/12/4 21:11
 */
@Slf4j
@RestController
@RequestMapping("/userController")
public class UserController {
    @Resource
    private UserService userService;
    /*
     * @Description  登录
     * @Author  lwcms
     * @Date  2022/12/4 21:12
     * @param  user
     * @return DataResult
     */
    @PostMapping("/login")
    public DataResult login(@RequestBody User user, HttpServletRequest request){
        User resultUser=userService.login(user);
        if(resultUser!=null){
            HttpSession session=request.getSession();
            session.invalidate();//会话失效
            session=request.getSession(true);
            session.setAttribute("loginUser",user);
            return new DataResult(Constants.OPERATION_SUCCESS,1,"登录成功");
        }
        return new DataResult(Constants.OPERATION_SUCCESS,0,"登录失败");
    }
    /*
     * @Description 用户注册
     * @Author  lwcms
     * @Date  2022/12/4 21:19
     * @param  user
     * @return  DataResult
     */
    @PostMapping("/register")
    public DataResult register(@RequestBody User user){
        if(Constants.OPERATION_SUCCESS.equals(userService.register(user))){
            return new DataResult(Constants.OPERATION_SUCCESS,1,"注册成功");
        }else{
            return new DataResult(Constants.OPERATION_FAIL,0,"注册失败");
        }
    }
}
