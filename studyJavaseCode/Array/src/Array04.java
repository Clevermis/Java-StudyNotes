import java.util.ArrayList;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2022-12-31 12:29
 **/
public class Array04 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
