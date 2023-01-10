import com.clevermis.pojo.User;
import com.clevermis.pojo.UserT;
import javax.naming.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 16:26
 * @since JDK 1.8
 **/
public class Mytest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserT user = (UserT) context.getBean("userT");
    System.out.println(user.getName());
  }
}
