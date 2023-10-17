package com.example.peluqueria2;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MenuController {

    @FXML
    private DatePicker calendario;

    @FXML
    private TableColumn<?, ?> columna_fecha;

    @FXML
    private TableColumn<?, ?> columna_hora;

    @FXML
    private TableColumn<?, ?> columna_servicio;

    @FXML
    private ComboBox<?> comoBox_hora;

    @FXML
    private RadioButton radioButton_Barba;

    @FXML
    private RadioButton radioButton_CorteCompleto;

    @FXML
    private RadioButton radioButton_CorteDis;

    @FXML
    private RadioButton radioButton_corteCaballero;

    @FXML
    private RadioButton radioButton_corteInfantil;

    @FXML
    private RadioButton radioButton_tinte;

    @FXML
    private TableView<?> tabla_pedidos;

}
