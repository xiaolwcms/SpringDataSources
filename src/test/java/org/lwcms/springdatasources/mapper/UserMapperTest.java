package org.lwcms.springdatasources.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lwcms.springdatasources.SpringDataSourcesApplication;
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
        User user=new User();
//        user.setUser_login_time(Date.valueOf("2022-02-01"));
        user.setUser_status(1);
        String startTime="2022-02-02";
        String endTime="2022-02-02";
        List<User> userList=userMapper.conditionQueryUser(user,Date.valueOf(startTime),Date.valueOf(endTime));
        for(User u:userList){
            System.out.println(u);
        }
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
