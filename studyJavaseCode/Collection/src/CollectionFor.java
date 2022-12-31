import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: java-study
 * @description: 增强for循环
 * @author: Clevermis
 * @create: 2022-12-31 21:03
 * @since JDK 1.8
 **/
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList<>();

        col.add(new Book("qwe","qwe",10.1));
        col.add(new Book("asd","asd",10.2));
        col.add(new Book("zxc","zxc",10.3));

        //
        //1.使用增强for  在collection集合
        //2.增强for  底层仍然是迭代器
        //3.增强for可以理解成简化版本的 迭代器遍历
        //4.快捷键I

        for (Object book:col){
            System.out.println(book);
        }
        //增强for ,也可以在数组中使用
        int[] nums = {1,3,4,5};
        for (int i:nums){
            System.out.println(i);
        }

    }
}
