package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (int i = 1; i <= 4; i++) {
            userService.add(new User("User" + i, "Lastname" + i, "user" + i + "@mail.ru",
                    new Car("Car" + i, i)));
        }

        List<User> users = userService.listUsers();
        for (User user : users) System.out.println(user.toString());

        System.out.println(userService.getUserByCar("Car1", 1));
        context.close();
    }
}
