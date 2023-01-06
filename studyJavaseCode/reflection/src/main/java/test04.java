import java.lang.annotation.ElementType;

/**
 * @program: java-study
 * @description:所有类型的CLASS
 * @author: Clevermis
 * @create: 2023-01-06 21:53
 * @since JDK 1.8
 **/
public class test04 {
    private int age;

    public static void main(String[] args) {
        Class c1 = test04.class;//class
        Class c2 = String[].class;//一维数组
        Class c3 = int[][].class;//二维数组
        Class c4 = Object.class;    //类
        Class c5 = Comparable.class;//接口
        Class c6 = Override.class;//注解
        Class c7 = ElementType.class;//枚举
        Class c8 = void.class;//空类型
        Class c9 = Integer.class;//基本数据类型

//        System.out.println("Class的getSuperclass:"+c1.getSuperclass());//Class的getSuperclass:class java.lang.Object
//        System.out.println("Class的getName:"+c1.getName());//Class的getName:top.aigoo.reflection.test04
//        System.out.println("Class的getSimpleName:"+c1.getSimpleName());//Class的getSimpleName:test04
//        System.out.println("Class的getTypeName:"+c1.getTypeName());//Class的getTypeName:top.aigoo.reflection.test04
//        System.out.println("Class的getClasses:"+c1.getClasses());
//        System.out.println("Class的getFields:"+c1.getFields());
//        System.out.println("Class的getClassLoader():"+c1.getClassLoader());
//        System.out.println("Class的getClassLoader():"+c1.getMethods()[0]);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println("c9"+c9);

        //只要元素类型和维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
    }
}
