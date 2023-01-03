package main.com.clevermis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @program: java-study
 * @description: 工具类
 * @author: Clevermis
 * @create: 2023-01-03 23:29
 * @since JDK 1.8
 **/
public class JdbcUtils {
    private static String driver =null;//获取数据库的驱动信息
    private static String url =null;//获取连接信息
    private static String username=null; //获取配置文件的用户名
    private static String password=null;//获取配置文件中的密码信息
    /*静态代码，获取配置文件*/
    static{
        try{
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");//读取db.properties配置文件信息
            Properties properties = new Properties();
            properties.load(in);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

            //驱动只会加载一次
            Class.forName(driver);
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //获取connection
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }

    //释放资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st!=null){
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
