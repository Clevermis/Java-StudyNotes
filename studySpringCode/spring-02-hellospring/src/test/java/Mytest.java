import com.clevermis.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 15:37
 * @since JDK 1.8
 **/
public class Mytest {

  public static void main(String[] args) {
    //获取Spring的上下文对象
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    //我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出就可以了！
    Hello hello = (Hello) context.getBean("hello");
    System.out.println(hello.toString());
  }

}
