import com.zdd.ApplicationLock;
import com.zdd.entiry.User;
import com.zdd.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 下午2:05
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationLock.class)
public class TestDB {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setName("zdd");
        user.setAge(18);
        userService.addUser(user);
    }
}
