import java.util.Random;

/**
 * @program: java-study
 * @description: Random练习
 * @author: Clevermis
 * @create: 2022-12-31 12:02
 **/
public class Demo02Random {
    /**
    * @Description:
    * @Param: [args]
    * @return: void
    * @Author: Clevermis
    * @Date: 2022/12/31 12:11
    */
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 范围实际上是0~9
            System.out.println(num);
        }
    }
}
