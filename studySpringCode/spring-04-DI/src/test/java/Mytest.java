import com.clevermis.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 17:18
 * @since JDK 1.8
 **/
public class Mytest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Student student = (Student) context.getBean("student");
    System.out.println(student.toString());
  }
}
