package com.sarbr.javafx.controller;

import com.sarbr.javafx.Main;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

public class MainController extends DefController{
    @FXML
    public Button btnLogin;
    @FXML
    public HBox hbType;
    @FXML
    public ComboBox<String> comboBox;

    @FXML
    protected void onHelloButtonClick() throws Exception {
        final String value = comboBox.getSelectionModel().getSelectedItem();
        final Parent parent = Main.loadFXML(value.concat(".fxml"));
        Main.setRoot(parent);
    }

}