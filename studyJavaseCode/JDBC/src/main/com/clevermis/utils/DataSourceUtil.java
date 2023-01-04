package main.com.clevermis.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-04 17:18
 * @since JDK 1.8
 **/
public class DataSourceUtil {

    static DruidDataSource dSource = null;
    static Properties properties = new Properties();

    // 静态代码块初始化加载驱动
    static {
        // 通过类加载器来获得流
        InputStream is = DataSourceUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            // 通过流读取配置文件中的内容到集合中
            properties.load(is);
            // 通过Druid工厂加载文件注册驱动,初始化池子
            dSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 测试连接是否正常
        for (int i = 0; i < 50; i++) {
            try {
                // 从池中取出连接
                Connection conn = dSource.getConnection();
                System.out.println(conn.hashCode());
                // 使用完后将连接放入池中(close()是代理过的方法，并不是原生的colse)
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
