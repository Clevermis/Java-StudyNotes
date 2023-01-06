import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-06 23:15
 * @since JDK 1.8
 **/
//练习反射操作注解
public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Test10.class;
        //step1 或者Class类对象
        Class c2 = Class.forName("Student2");
        //通过反射获得注解
        Annotation[] annotations = c2.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation-->"+annotation);
        }

        //通过反射获得注解的value值
        Tablekuang tablekuang = (Tablekuang)c2.getAnnotation(Tablekuang.class);
        String value = tablekuang.Value();
        System.out.println("tablekuang.Value()-->"+tablekuang.Value()); //通过.Value()直接获取指定注解的值

        //通过反射 获得类的  指定属性的 注解
        Field field = c2.getDeclaredField("name");
        Fieldkuang annotation = (Fieldkuang)field.getAnnotation(Fieldkuang.class);
        System.out.println("annotation.columenName-->"+annotation.columenName());
        System.out.println("annotation.type-->"+annotation.type());
        System.out.println("annotation.length-->"+annotation.length());

        Field field2 = c2.getDeclaredField("id");
        Fieldkuang annotation2 = (Fieldkuang)field.getAnnotation(Fieldkuang.class);
        System.out.println("annotation2.columenName-->"+annotation2.columenName());
        System.out.println("annotation2.type-->"+annotation2.type());
        System.out.println("annotation2.length-->"+annotation2.length());
    }
}
@Tablekuang(Value = "db_student")
class Student2{
    @Fieldkuang(columenName = "db_id",type = "int",length = 10)
    private int id;
    @Fieldkuang(columenName = "db_age",type = "int",length = 10)
    private int age;
    @Fieldkuang(columenName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student2() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//注解类名
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  Tablekuang{
    String Value();
}

//属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldkuang{
    String columenName();
    String type();
    int length();
}
