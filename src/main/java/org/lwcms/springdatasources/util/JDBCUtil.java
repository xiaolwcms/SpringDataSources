package org.lwcms.springdatasources.util;

import java.sql.*;

/**
 * @version 1.0
 * @ClassName JDBCUtil
 * @Author lwcms
 * @Date 2022/9/15 22:18
 **/
public class JDBCUtil {
    private static String url="jdbc:mysql://localhost:3306/db_database_practise";
    private static String username="root";
    private static String password="root";
    private static Connection con=null;
    private static PreparedStatement ps=null;
    private static ResultSet rs=null;
    private static CallableStatement callSt=null;
    //获取数据库连接
    private static void getConnection() {
        try {
            //1、导入驱动jar包
            //2、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //3、获取数据库连接对象
            con = DriverManager.getConnection(url, username,  password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * @Description 执行SQL查询
     * @author lwcms
     * @date 2022/9/15 22:19
     * @param sql
     * @return 返回查询结果集
     */
    public static ResultSet query(String sql) {
        //获取数据库连接
        getConnection();
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("query查询语法错误");
            e.printStackTrace();
        }
        
        return rs;
    }
    /**
     * @Description 关闭数据库连接
     * @author lwcms
     * @date 2022/9/15 22:29
     * @param
     * @return
     */
    private static void close(){
        try {
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(con!=null){
                con.close();
            }
            if(callSt!=null){
                callSt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
