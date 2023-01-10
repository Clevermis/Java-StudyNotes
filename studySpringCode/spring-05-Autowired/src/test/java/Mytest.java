import com.clevermis.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 20:33
 * @since JDK 1.8
 **/
public class Mytest {


  public static void main(String[] args) {
    ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

    People people = context.getBean("people", People.class);
    people.getDog().shout();
    people.getCat().shout();
  }


}
