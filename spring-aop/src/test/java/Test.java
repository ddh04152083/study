import com.ddh.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();


//        around 前
//        方法执行前
//                增加
//        around 后
//        方法执行后
    }
}
