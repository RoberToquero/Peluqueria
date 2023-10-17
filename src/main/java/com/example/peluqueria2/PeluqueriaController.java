package com.example.peluqueria2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PeluqueriaController {

    @FXML
    private Button botonInicio;

    @FXML
    private Button boton_registro;

    @FXML
    private PasswordField text_password;

    @FXML
    private TextField text_usuario;

    @FXML
    private Label welcomeText;

    @FXML
    void Inicio(ActionEvent event) throws IOException, ClassNotFoundException {
        Conexion.conectar();
        if(Conexion.conectar()){
            
        }
        if(text_usuario.getText().equals("admin")){
            FXMLLoader fxmlLoader = new FXMLLoader(PeluqueriaApplication.class.getResource("Menu.fxml"));//quando eu clicar en entrar, iremos para a ventana seguinte
            Parent root = fxmlLoader.load();
            MenuController controlador3 = fxmlLoader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            //stage.initStyle(StageStyle.UNDECORATED);//nao tenho o menu acima
            stage.setScene(scene);
            stage.show();

        }

    }
    @FXML
    void Registrarse(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PeluqueriaApplication.class.getResource("Registro.fxml"));//quando eu clicar en entrar, iremos para a ventana seguinte
        Parent root = fxmlLoader.load();
        RegistroController controlador3 = fxmlLoader.getController();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        //stage.initStyle(StageStyle.UNDECORATED);//nao tenho o menu acima
        stage.setScene(scene);
        stage.show();
    }

}
