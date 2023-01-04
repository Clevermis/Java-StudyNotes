package main.com.clevermis.utils;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 15:56
 * @since JDK 1.8
 **/
public class JdbcUtils_DBCP {
private static DataSource dataSource;

/*静态代码，获取配置文件*/
static{
        try{
        InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");//读取db.properties配置文件信息
        Properties properties = new Properties();
        properties.load(in);

        //创建数据源 工厂模式创建对象
            DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);


        }catch(IOException e){
        e.printStackTrace();
        }catch(Exception e){
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
