/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 13:12
 **/

/**
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class StaticField {
    public static void main(String[] args) {

        Student two = new Student("黄蓉", 16);
        Student.room = "101教室";
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + Student.room
                + "，学号：" + two.getId());

        Student one = new Student("郭靖", 19);
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + Student.room
                + "，学号：" + one.getId());
    }
}
