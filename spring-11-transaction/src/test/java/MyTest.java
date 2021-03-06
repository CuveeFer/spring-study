import com.alivin.mapper.UserMapper;
import com.alivin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


public class MyTest {
    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = new User(4, "西西", "123456");
        userMapper.addUser(user);
        userMapper.deleteUser(2);
        List<User> users = userMapper.selectUser();
        for (User user1 : users) {
            System.out.println(user1);
        }

    }
}
