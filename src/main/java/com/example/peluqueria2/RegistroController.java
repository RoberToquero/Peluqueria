package com.example.peluqueria2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RegistroController {

    @FXML
    private Button Button_Limpiar;

    @FXML
    private Button Button_registro;

    @FXML
    private TextField Text_email;

    @FXML
    private PasswordField Text_password;

    @FXML
    private TextField Text_usuario;

    @FXML
    void Limpiar(ActionEvent event) {
        Text_usuario.clear();
        Text_password.clear();
        Text_email.clear();

    }

    @FXML
    void Registrarse(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PeluqueriaApplication.class.getResource("Peluqueria-view.fxml"));//quando eu clicar en entrar, iremos para a ventana seguinte
        Parent root = fxmlLoader.load();
        PeluqueriaController controlador3 = fxmlLoader.getController();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        //stage.initStyle(StageStyle.UNDECORATED);//nao tenho o menu acima
        stage.setScene(scene);
        stage.show();
    }

}

