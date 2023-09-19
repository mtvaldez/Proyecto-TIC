package springBoot;

import javaFx.Window;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springBoot.user.UserRepository;
import springBoot.user.User;
import springBoot.user.UserService;

import static javafx.application.Application.launch;

@SpringBootApplication
public class Main {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Bean
    public CommandLineRunner run(/*UserRepository repository*/) {
        return (args) -> {
            // repository.save(new User("admin", "admin", 1));
            // (new Window).start(new Stage());
            //launch();
        };
    }

}
