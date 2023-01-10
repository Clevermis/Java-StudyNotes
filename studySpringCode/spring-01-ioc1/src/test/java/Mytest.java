import com.clevermis.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 15:54
 * @since JDK 1.8
 **/
public class Mytest {

  public static void main(String[] args) {
    //获取ApplicationContext；拿到Spring的容器
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    System.out.println("context::"+context);
    //容器里有万物，需要什么，就直接get什么！
    UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
    System.out.println("userServiceImpl:::"+userServiceImpl);
    userServiceImpl.getUser();
  }
}
