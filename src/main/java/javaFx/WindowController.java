package javaFx;

//import bigFolder.client.ClientService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

public class WindowController {

//
//    private final ClientService clientService;
//
//    @Autowired
//    public WindowController(ClientService clientService) {
//        this.clientService = clientService;}

    @FXML
    private TextField nameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField cedulaField;

    @FXML
    private void LoginBt(){
        System.out.println(nameField.getText() + lastNameField.getText() + cedulaField.getText());
        System.out.println("Hola");
    }

    @FXML
    private void RegisterBt(){
        System.out.println(nameField.getText() + lastNameField.getText() + cedulaField.getText());
        System.out.println("Charu");
    }
}
