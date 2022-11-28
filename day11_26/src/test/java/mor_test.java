import com.llkj.controller.PersonController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName mor_test
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 9:15
 * @Version 1.0
 */
public class mor_test {
    @Test
    public void test1(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("SpringAnnocation.xml");
        com.llkj.controller.Test bean = applicationContext.getBean(com.llkj.controller.Test.class);
        System.out.println(bean);
        PersonController personController = applicationContext.getBean(PersonController.class);
        System.out.println(personController);



    }
}
