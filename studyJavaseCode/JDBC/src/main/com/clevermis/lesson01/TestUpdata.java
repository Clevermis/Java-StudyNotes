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
 * @create: 2023-01-03 23:51
 * @since JDK 1.8
 **/
public class TestUpdata {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "UPDATE `users` set NAME='修改' WHERE id=4;";
            int i = st.executeUpdate(sql);
            if (i > 0) {
                System.out.println("修改成功!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
