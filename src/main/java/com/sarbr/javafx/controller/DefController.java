package com.sarbr.javafx.controller;

import com.sarbr.javafx.Main;
import javafx.fxml.FXML;
import javafx.scene.Parent;

public class DefController {

    @FXML
    protected void  onMain() throws Exception  {
        final Parent parent = Main.loadFXML("main.fxml");
        Main.setRoot(parent);
    }
}
