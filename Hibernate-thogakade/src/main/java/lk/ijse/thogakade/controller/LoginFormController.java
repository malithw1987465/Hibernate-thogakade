package lk.ijse.thogakade.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public Button btnLogin;
    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane dashboardPane;

    public void btnLoginOnAction(ActionEvent event) throws IOException {

        if(txtUserName.getText().equals("Malith") && txtPassword.getText().equals("1234")){
            Stage stage = (Stage) dashboardPane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard_form.fxml"))));
            stage.setTitle("Item Form");
            stage.centerOnScreen();
            stage.show();
        }else{
            new Alert(Alert.AlertType.ERROR, "Not a existing user!").show();
        }
    }


}