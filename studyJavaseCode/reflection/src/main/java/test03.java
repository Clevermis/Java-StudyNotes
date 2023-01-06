/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-06 21:46
 * @since JDK 1.8
 **/
public class test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是" + person.name);

        //方式一：通过Person实例对象获取类Class
        Class  c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式二：通过Class.forName()获取class
        Class c2 = Class.forName("Student");
        System.out.println(c2.hashCode());

        //方式三：通过类名获取Class对象
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获取父类类型  通过对象person中person.getClass()获取person的类Student ,然后通过这个c1的c1.getSupercLass()获取父类
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student() {
        this.name="-->学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name="-->老师";
    }
}
