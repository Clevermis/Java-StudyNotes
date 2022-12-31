import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: java-study
 * @description: 迭代器遍历
 * @author: Clevermis
 * @create: 2022-12-31 20:45
 * @since JDK 1.8
 **/
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList<>();

        col.add(new Book("qwe","qwe",10.1));
        col.add(new Book("asd","asd",10.2));
        col.add(new Book("zxc","zxc",10.3));

        System.out.println(col);
        //1. 先得到col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while (iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是object
            Object next = iterator.next();
            System.out.println(next);
        }
        //快捷键，快速生成 while循环 ctrl+j
        //3.当突出while循环后，这时iterator 指向了最后的元素
        //iterator.next();  // NoSuchElementException
        //如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
    }
}

class  Book{

    private String name;
    private String author;
    private double price;

    Book(final String name, final String author, final double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
