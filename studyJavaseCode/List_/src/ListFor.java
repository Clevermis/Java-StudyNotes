import java.util.*;


/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 21:40
 * @since JDK 1.8
 **/
public class ListFor {
    public static void main(String[] args) {
        //List 接口的实现子类  Vector LinkedList

//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("qqq");
        list.add("www");
        list.add("eee");
        list.add("rrr");
        list.add("ttt");
        //遍历
        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        // 2.增强For
        for (Object o :list) {
            System.out.println(o);
        }

        //3.使用普通For
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
