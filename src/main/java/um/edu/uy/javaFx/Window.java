package um.edu.uy.javaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import um.edu.uy.springBoot.user.UserRepository;


public class Window extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //FXMLLoader loader = new FXMLLoader();
        //Parent root = loader.load((getClass().getResourceAsStream("menu.fxml")));

        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/MenuFx.fxml"));

        Parent root = FXMLLoader.load(getClass().getResource("/MenuFx.fxml"));

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Registration App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Bean
    public CommandLineRunner run(UserRepository repository) {
        return (args) -> {
            // repository.save(new User("admin", "admin", 1));
            // (new Window).start(new Stage());
            //launch();
        };
    }

    public static void main(String[] args) {
        launch(args);
    }


}