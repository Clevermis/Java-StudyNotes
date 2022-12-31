import java.util.Scanner;

/**
 * @program: java-study
 * @description: 一个Scanner的demo
 * @author: Clevermis
 * @create: 2022-12-31 11:13
 **/

/**
Scanner类的功能：可以实现键盘输入数据，到程序当中。

引用类型的一般使用步骤：

1. 导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2. 创建
类名称 对象名 = new 类名称();

3. 使用
对象名.成员方法名()

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */

public class DemoScanner {
    /**
    * @Description: 这是主方法main
    * @Param: [args]
    * @return: void
    * @Author: Clevermis
    * @Date: 2022/12/31
    */
    public static void main(String[] args) {
        // 2. 创建
        // 备注：System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        // 3. 获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);

        // 4. 获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
