/**
 * @program: java-study
 * @description: 求最大值
 * @author: Clevermis
 * @create: 2022-12-31 11:20
 **/

import java.util.Scanner;

/**
题目：
键盘输入三个int数字，然后求出其中的最大值。

思路：
1. 既然是键盘输入，肯定需要用到Scanner
2. Scanner三个步骤：导包、创建、使用nextInt()方法
3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
    4.1 首先判断前两个当中谁最大，拿到前两个的最大值
    4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
5. 打印最终结果
 */
public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        // 首先得到前两个数字当中的最大值
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是：" + max);
    }
}
