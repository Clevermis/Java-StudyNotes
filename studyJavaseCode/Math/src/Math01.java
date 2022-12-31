/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 13:44
 **/

/**
 java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

 public static double abs(double num)：获取绝对值。有多种重载。
 public static double ceil(double num)：向上取整。
 public static double floor(double num)：向下取整。
 public static long round(double num)：四舍五入。

 Math.PI代表近似的圆周率常量（double）。
 */
public class Math01 {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");

        // 向上取整
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        // 向下取整，抹零
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11
    }

}
