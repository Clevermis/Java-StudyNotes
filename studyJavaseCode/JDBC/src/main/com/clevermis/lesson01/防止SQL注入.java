package main.com.clevermis.lesson01;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-03 23:57
 * @since JDK 1.8
 **/
import main.com.clevermis.utils.JdbcUtils;

import java.sql.*;

public class 防止SQL注入 {
    public static void main(String[] args) {
        /*当用户名使用 ' or 1=1 时候，拼接到查询语句："select * from users WHERE `NAME`='"+username+"' and
        `PASSWORD`='"+password+"'"就变成了
        * select * from users where `name` ='' or '1=1' and `password`='' or '1=1'
        * */
        login(" '' or 1=1","123456");
        //login("zhangsan","123456");
    }
    public static void login(String username,String password){
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            String sql = "select * from users WHERE `NAME`=? and `PASSWORD`=?";
            st = conn.prepareStatement(sql);
            st.setString(1,username);
            st.setString(2,password);

            rs=st.executeQuery();

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
