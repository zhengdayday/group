import com.zdd.ApplicationFeign;
import com.zdd.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 上午11:32
 * @Description:
 */
@SpringBootTest(classes = ApplicationFeign.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {

    @Autowired
    private ApiService apiService;

    @Test
    public void test() {
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
