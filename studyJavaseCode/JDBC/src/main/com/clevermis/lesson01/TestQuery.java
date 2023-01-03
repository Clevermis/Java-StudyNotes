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
 * @create: 2023-01-03 23:52
 * @since JDK 1.8
 **/
public class TestQuery {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "select * from users";
            rs=st.executeQuery(sql);
            while (rs.next()){
                System.out.println("==========================================");
                System.out.println("id="+rs.getObject("id"));
                System.out.println("name="+rs.getObject("NAME"));
                System.out.println("pwd="+rs.getObject("PASSWORD"));
                System.out.println("email="+rs.getObject("email"));
                System.out.println("birthday="+rs.getObject("birthday"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
