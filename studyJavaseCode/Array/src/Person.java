/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 12:10
 **/
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
