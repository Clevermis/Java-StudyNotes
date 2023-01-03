package main.com.clevermis.lesson01;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

/**
 * @program: java-study
 * @description: JDBC-demo
 * @author: Clevermis
 * @create: 2023-01-03 23:03
 * @since JDK 1.8
 **/
//我的第一个jdbc程序
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        /*三种反射方式  Class.forName  ;JdbcFirstDemo.calss ;jdbcFirstDemo.getClass()*/
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver())
//         `com.mysql.cj.jdbc.Driver
        Class.forName("com.mysql.jdbc.Driver");  //固定写法，加载驱动
        //2.连接数据库信息  用户信息和url
        String url = "jdbc:mysql://localhost:3306/jdbcStudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username ="root";
        String password = "131400";
        //3.连接成功了，返回数据库对象  connection代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);
/**        connection.rollback();
        connection.commit();
        connection.setAutoCommit();   */
        //4.执行sql的对象   Statement statement执行sql的对象
        Statement statement = connection.createStatement();
/**        connection.prepareStatement()
        Statement 执行SQL事务的类  PrepareStatement 执行SQL的对象  createStatement
        statement.executeQuery() //查询操作返回ResultSet
        statement.execute(); //执行任何SQL
        statement.executeUpdate(); //更新、插入、删除，都是用这个，返回一个受影响的行数；*/
        //5.用执行sql的对象去执行sql语句，可能存在结果，查看返回结果
        String sql = "select * from users";
        ResultSet resultSet = statement.executeQuery(sql); //返回的结果集，结果集封装了我们查询出来的所有结果
        //resultSet是一个链表结构
        while (resultSet.next()){
            System.out.println("==========================================");
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("NAME"));
            System.out.println("pwd="+resultSet.getObject("PASSWORD"));
            System.out.println("email="+resultSet.getObject("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
/**            查询的结果集对象 ResultSet 封装了所有查询结果
            Resultset resultSet = statement.exeQuery("select * from users")
            resultget.getObject()
 // 如果知道列的类型就使用指定的
            resultget.getInt()
            resultget.getFloat()
            resultget.getDate()
            resultget.next()*/
/**            遍历指针
            resultSet.beforeFirst(); //移动到最前面
            resultSet.afterLast(); //移动到最后面
            resultSet.next()  移动到下一个数据
            resultSet.previous()  移动到下一行
            resultSet.absolute(row) 移动到指定行*/
        }
        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
