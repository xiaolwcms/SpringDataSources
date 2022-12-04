package org.lwcms.springdatasources.mapper;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lwcms.springdatasources.SpringDataSourcesApplication;
import org.lwcms.springdatasources.dto.UserDTO;
import org.lwcms.springdatasources.entry.User;
import org.lwcms.springdatasources.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;

/**
 * @version 1.0
 * @ClassName UserMapperTest
 * @Author LWCMS
 * @Date 2022/9/27 21:32
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataSourcesApplication.class)
public class UserMapperTest {
//    注入Mapper
    @Autowired
    private UserMapper userMapper;
    /**
     * @Description 查询用户信息-条件查询
     * @author lwcms
     * @date 2022/9/27 20:22
     */
    @Test
    public void  conditionQueryUser(){
        UserDTO userDTO=new UserDTO();
        userDTO.setUser_type("admin");
        List<User> userList=userMapper.conditionQueryUser(userDTO);
        for(User u:userList){
            System.out.println(u);
        }
    }
    /**
     * @Description 注册新用户
     * @author lwcms
     * @date 2022/9/27 20:23
     * @return list
     */
    @Test
    public void  addUser(){
        User user=new User();
        user.setUser_login_name("admin");
        user.setUser_password("admin");
        user.setUser_type("admin");
        user.setUser_name("超级管理员");
        System.out.println(userMapper.addUser(user));
    }
    /**
     * @Description 用于单元测试
     * @author 雷维昌
     * @date 2022/9/30 0:19
     * @param
     * @return
     */
    @Test
    public void MainTest(){
        String dateFormat="yyyy-MM-dd";
        System.out.println(DateUtil.getNowDate(dateFormat));
    }
}
