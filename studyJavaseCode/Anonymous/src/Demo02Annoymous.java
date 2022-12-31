import java.util.Scanner;

/**
 * @program: java-study
 * @description: 匿名对象的使用
 * @author: Clevermis
 * @create: 2022-12-31 11:46
 **/
public class Demo02Annoymous {

    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
/**
* @Description: 
* @Param: [sc]
* @return: void
* @Author: Clevermis
* @Date: 2022/12/31
*/
    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
/**
* @Description: 返回一个scanner对象
* @Param: []
* @return: java.util.Scanner
* @Author: Clevermis
* @Date: 2022/12/31
*/
    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

}
