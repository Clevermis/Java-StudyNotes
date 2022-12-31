import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //1. List集合类中元素有序（即添加顺序和去除顺序一致）、且可重复
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println(list);
        //2. List集合中的每个元素都有其对应的顺序索引，即支持索引
        // 索引是从0开始的
        System.out.println(list.get(3));
        //3. List容器中的元素都对应一个整数型的序号
        //4. JDK API中List接口有很多

    }
}