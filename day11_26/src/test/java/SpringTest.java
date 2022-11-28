import com.llkj.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:SpringAnnocation.xml")
public class SpringTest {
    @Autowired
    private UserController userController;

    @Test
    public void testLogin() {
        boolean root = userController.login("root", "123456");

        if (root) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登录失败!");
        }
    }
}
