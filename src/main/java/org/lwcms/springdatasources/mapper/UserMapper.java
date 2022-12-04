package org.lwcms.springdatasources.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lwcms.springdatasources.dto.UserDTO;
import org.lwcms.springdatasources.entry.User;

import java.sql.Date;
import java.util.List;

/**
 * @version 1.0
 * @ClassName UserMapper
 * @Author LWCMS
 * @Date 2022/9/27 20:17
 **/
@Mapper
public interface UserMapper {
    /**
     * @Description 查询用户信息-条件查询
     * @author lwcms
     * @date 2022/9/27 20:22
     * @param userDTO
     * @return list
     */
    List<User> conditionQueryUser(@Param("userDTO") UserDTO userDTO);
    /**
     * @Description 注册新用户
     * @author lwcms
     * @date 2022/9/27 20:23
     * @param user
     * @return list
     */
    int addUser(@Param("user")User user);
    /**
     * @Description 用户登录
     * @author lwcms
     * @date 2022/9/27 20:28
     * @param user
     * @return int
     */
    User login(@Param("user")User user);

}
