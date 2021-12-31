import com.ddh.mapper.LoginMapper;
import com.ddh.pojo.Login;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        LoginMapper loginMapper = context.getBean("loginMapper", LoginMapper.class);
        Login login = loginMapper.queryById(1);
        System.out.println(login);
        Login login1 = loginMapper.queryById(1);
        System.out.println(login1);
        System.out.println(login == login1);

    }
}
