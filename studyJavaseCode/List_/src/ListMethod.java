import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-study
 * @description: List接口方法
 * @author: Clevermis
 * @create: 2022-12-31 21:21
 * @since JDK 1.8
 **/
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("贾宝玉");
//  void add(int index ,object ele)  在index位置插入ele元素
        list.add(1,"qwe");
        System.out.println(list);
//boolean addAll(int index, Collection eles): 从index位置开始将eles中的所有元素添加进来
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("tom");
        list1.add("jack");
        list.addAll(1,list1);
        System.out.println(list);
        // Object get (int index): 获取指定index位置的元素
        // int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        // int lastIndexOf (Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf("tom"));
        // Object remove (int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));
        System.out.println(list);
        // Object set(int index ,Object ele):设置指定index位置的元素为ele，相当于替换
        list.set(0,"111");
        System.out.println(list);
        // List subList (int fromIndex , int toIndex):返回fromIndex到toIndex位置的子集合
        System.out.println(list.subList(1, 3));


    }
}
