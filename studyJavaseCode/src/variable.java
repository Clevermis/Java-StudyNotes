/**
 * @author Clevermis
 * @date 2022/12/30 10:30
 * @version 1.0
 * @description: 这是一个关于 变量、常量 、作用域的相关demo
 */
public class variable {

/**
 * 类变量(静态变量)
 * */
    static double salary=2500;

/** 常量(不会变动的值);修饰符不存在先后顺序
    但注意：double是数据类型！后必须跟变量名
    在程序运行过程一直不会改变的量,在整个程序中只能被赋值一次
*/
    static final double PI=3.14;
    final static double PI1=3.1415;

/** 实例变量(成员变量):从属于对象；不进行初始化，输出该类型的默认值 0、0.0布尔值默认值为false
    除基本类型其余默认值为null
 */
     //推荐 属性：变量
    String name;
    int age;

    public static void main(String[] args) {
        //int a,b,c;
        //int a=1,b=2,c=3;(程序可读性)
        //变量推荐
        int a=1;
        int b=2;
        int c=3;

        //局部变量:必须声明和初始化值
        int i=10;
        System.out.println(i);


        //变量类型(自定义)    变量名字 =值
        //有static可弃
        variable   demo5 = new variable();
        System.out.println(demo5.name);
        System.out.println(demo5.age);


        //类变量
        System.out.println(salary);

        //常量
        System.out.println(PI);
        System.out.println(PI1);

    }
/**
   * 其他方法
*/
    public void add(){}
    //上面的局部变量中的i不可在此运用

}