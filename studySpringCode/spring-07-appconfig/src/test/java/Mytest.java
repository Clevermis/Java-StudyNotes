import com.clevermis.config.ClevermisConfig;
import com.clevermis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Test;


/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 21:46
 * @since JDK 1.8
 **/
public class Mytest {
  @Test
  public void test1(){
    //如果完全使用配置类方式去做，我们就只能通过AnnotationConfig 上下文来获取容器  ， 通过配置类的class对象加载
    ApplicationContext context = new AnnotationConfigApplicationContext(ClevermisConfig.class);
    User user = (User) context.getBean("user");
    System.out.println(user.getName());
  }
}
