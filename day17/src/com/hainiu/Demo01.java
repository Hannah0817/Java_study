package com.hainiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class Demo01 {
    public static void main(String[] args) {
        //
        // 数据库连接四大属性
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/hainiudb?characterEncoding=UTF-8";
        String user = "root";
        String password = "root";

        // 获取数据库连接
        Connection conn = null;
        Statement stmt = null;
        try{
            // 加载驱动
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // 编写SQL语句
            String sql = "insert into category(cid, cname) values (7, '图书');";
            // 创建SQL语句的执行对象
            stmt = conn.createStatement();
            // 执行SQL语句并获取结果
            int executeUpdate = stmt.executeUpdate(sql);
            if(executeUpdate > 0){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            // 释放资源
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}