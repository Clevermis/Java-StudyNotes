package main.com.clevermis.lesson01;

import main.com.clevermis.utils.JdbcUtils_DBCP;
import main.com.clevermis.utils.JdbcUtils_c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 16:10
 * @since JDK 1.8
 **/
public class TestC3P0 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = JdbcUtils_c3p0.getConnection();
            String sql = "insert into users(`id`,`name`,`password`,`email`,`birthday`) values (?,?,?,?,?)";
            st = conn.prepareStatement(sql);

            st.setInt(1,9);
            st.setString(2,"hewu");
            st.setString(3,"123456");
            st.setString(4,"hewu@qq.com");
            st.setDate(5, new java.sql.Date(new Date().getTime()));
            //执行
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("插入成功!");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils_DBCP.release(conn,st,null);
        }
    }
}
