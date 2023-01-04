package main.com.clevermis.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 16:13
 * @since JDK 1.8
 **/
public class JdbcUtils_c3p0 {
    private static ComboPooledDataSource dataSource =null;
    static{
        try{

            //创建数据源 工厂模式创建对象
            ComboPooledDataSource ds = new ComboPooledDataSource("MYSQL");


        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();//从数据源获取连接
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
