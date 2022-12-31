/**
 * @program: java-study
 * @description: 累加demo
 * @author: Clevermis
 * @create: 2022-12-31 11:18
 **/

import java.util.Scanner;

/**
题目：
键盘输入两个int数字，并且求出和值。

思路：
1. 既然需要键盘输入，那么就用Scanner
2. Scanner的三个步骤：导包、创建、使用
3. 需要的是两个数字，所以要调用两次nextInt方法
4. 得到了两个数字，就需要加在一起。
5. 将结果打印输出。
 */
public class DemoScannerSum {
    /**
    * @Description:
    * @Param: [args]
    * @return: void
    * @Author: Clevermis
    * @Date: 2022/12/31
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
