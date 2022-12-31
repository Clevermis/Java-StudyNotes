import java.util.*;

/**
 * @author ruobing
 */
public class Main {
    public static void main(String[] args) {

        //1.集合主要是两组（单列集合  双列集合）
        //2.Collection 接口有两个重要的子接口 List Set ,它们的实现子类都是单列集合
        //3. Map接口的实现子类 都是双列集合 ，存放的K-V

        List<String> arrayList = new ArrayList<>();
        arrayList.add("jjj");
        arrayList.add("tom");

        final Map<String, String> hashMap = new HashMap<>();
        hashMap.put("sd","dsd");
        hashMap.put("sdfs","sdf");

    }
}