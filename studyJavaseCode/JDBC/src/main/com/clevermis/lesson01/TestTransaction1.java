package main.com.clevermis.lesson01;

import main.com.clevermis.utils.JdbcUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 12:51
 * @since JDK 1.8
 **/
public class TestTransaction1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {

            conn = JdbcUtils.getConnection();
            /*开启一个事务，类似于mysql语句中 :  set autocommit=0 ;start transaction*/
            conn.setAutoCommit(false);

            String sql1 = "update account set money=money-100 where name='A'";
            st = conn.prepareStatement(sql1);
            st.executeUpdate();

            String sql2 = "update account set money=money+100 where name='B'";
            st = conn.prepareStatement(sql2);
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("更新成功!");
            }
            //业务完毕，提交事务
            conn.commit();


        } catch (SQLException throwables) {
            try {
                conn.rollback(); //如果失败就回滚事务
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }
}
