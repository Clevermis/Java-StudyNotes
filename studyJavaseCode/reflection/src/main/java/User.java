/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-06 21:33
 * @since JDK 1.8
 **/
public class User{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("pojoUser");
        System.out.println(c1);
        System.out.println(c1.hashCode());

        //通过C2,C3,C4打印的hashCode一样，可以证明一个类在内存中只会有一个Class对象
        Class c2 = Class.forName("pojoUser");
        System.out.println(c2.hashCode());
        Class c3 = Class.forName("pojoUser");
        System.out.println(c3.hashCode());

        Class c4 = Class.forName("pojoUser");
        System.out.println(c4.hashCode());

    }
}

//实体类 pojo extity什么叫做实体类 ，只有属性的类叫做实体类
class pojoUser {
    private String name;
    private int id;
    private int age;

    public pojoUser() {
    }

    public pojoUser(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

