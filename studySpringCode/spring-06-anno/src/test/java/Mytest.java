import com.clevermis.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 21:14
 * @since JDK 1.8
 **/
public class Mytest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "beans.xml");
    User user = context.getBean("user", User.class);
    System.out.println(user.name);
  }

}
