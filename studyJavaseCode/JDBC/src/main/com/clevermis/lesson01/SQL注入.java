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
 * @create: 2023-01-03 23:54
 * @since JDK 1.8
 **/
public class SQL注入 {
    public static void main(String[] args) {
        /*当用户名使用 ' or 1=1 时候，拼接到查询语句："select * from users WHERE `NAME`='"+username+"' and
        `PASSWORD`='"+password+"'"就变成了
        * select * from users where `name` ='' or '1=1' and `password`='' or '1=1'
        * */
        login(" ' or '1=1","123456");
    }
    public static void login(String username,String password){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            //只需要这样记住就行：单引号 括双引号 两个加号 中间变量   ( 0Q0   OMG)
            String sql = "select * from users WHERE `NAME`='"+username+"' and `PASSWORD`='"+password+"'";
            System.out.println("sql--->"+sql);
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
