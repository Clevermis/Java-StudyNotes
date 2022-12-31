import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 17:42
 * @since JDK 1.8
 **/
public class CollectionMethod {
    public static void main(String[] args) {
        /**
         * - add：添加单个元素
         * - remove：删除指定元素
         * - contains：查找元素是否存在
         * - size：获取元素个数
         * - isEmpty：判断是否为空
         * - clear：清空
         * - addAll：添加多个元素
         * - containsAll：查找多个元素是否都存在
         * - removeAll：删除多个元素
         * */
        List<Object> objects = new ArrayList<>();
        objects.add("qwe");
        objects.add(10);
        objects.add(true);
        System.out.println("list="+ objects);

        //objects.remove(0);//删除第一个元素
        objects.remove(true);
        System.out.println("list="+objects);

        System.out.println(objects.contains(10));

        System.out.println(objects.size());

        System.out.println(objects.isEmpty());

        objects.clear();
        System.out.println(objects);

        ArrayList<Object> objects1 = new ArrayList<>();
        objects1.add("qqq");
        objects1.add("www");
        objects.addAll(objects1);
        System.out.println(objects);
        System.out.println(objects.containsAll(objects1));
        objects.removeAll(objects1);
        System.out.println(objects);

    }
}
