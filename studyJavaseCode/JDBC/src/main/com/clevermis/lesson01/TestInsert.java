package main.com.clevermis.lesson01;

import main.com.clevermis.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-03 23:39
 * @since JDK 1.8
 **/
    public class TestInsert {
        public static void main(String[] args) {
            Connection conn =null;
            Statement st = null;
            ResultSet rs =null;
            try {
                conn = JdbcUtils.getConnection();//获取数据库连接
                st = conn.createStatement();//获取SQL的执行对象
                String sql = "INSERT INTO users(id, `NAME`,`PASSWORD`,`email`,`birthday`)" +
                        "value(4,'kuangshen','1234560','123455@qq.com','2020-10-10')";
                int i = st.executeUpdate(sql);
                if (i>0){
                    System.out.println("插入成功!");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                JdbcUtils.release(conn,st,rs);
            }
        }
    }
