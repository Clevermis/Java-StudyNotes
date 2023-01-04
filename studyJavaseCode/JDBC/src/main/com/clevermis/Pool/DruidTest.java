package main.com.clevermis.Pool;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 16:51
 * @since JDK 1.8
 **/
public class DruidTest {
    public static void main(String[] args) throws SQLException {
        //创建数据源对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbcStudy?useUnicode=true&characterEncoding=utf8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("131400");
        //根据数据源对象来获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass());
    }
}
