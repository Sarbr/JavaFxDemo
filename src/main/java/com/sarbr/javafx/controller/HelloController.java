package com.sarbr.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController extends DefController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello World!");
    }
}