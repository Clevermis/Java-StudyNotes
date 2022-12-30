/**
 * @Author Clevermis
 * @Date 2022/12/30 21:26
 * @Version 1.0
* 数组综合测试
 */
import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] i = new int[10];
        //填充数组
        Arrays.fill(i, 2);
        //遍历数组
        for (int x : i) {
            System.out.print(x + " ");
        }
        //toString()数组
        System.out.println("\n" + Arrays.toString(i));
        //复制数组
        int[] b = new int[12];
        System.arraycopy(i, 0, b, 2, 5);
        System.out.println(Arrays.toString(b));
        //一维数组的比较
        int[] c = new int[3];
        int[] d = new int[3];
        Arrays.fill(c, 3);
        Arrays.fill(d, 3);
        System.out.println(c.equals(d));
        System.out.println(Arrays.equals(c, d));
        System.out.println("-------------");
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] a2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(a1.equals(a2));
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.deepEquals(a1, a2));
        //深度toString()
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.deepToString(a1));

        //数组的排序
        int[] a3 = {3, 2, 5, 4, 1};
        System.out.println(Arrays.toString(a3));
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
        //一维数组数值检索
        int index1 = Arrays.binarySearch(a3, 4);
        int index2 = Arrays.binarySearch(a3, -12);
        int index3 = Arrays.binarySearch(a3, 8);
        System.out.println(index1 + " " + index2 + " " + index3);
    }
}


