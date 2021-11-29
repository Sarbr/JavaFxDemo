package com.sarbr.javafx;

import com.sarbr.javafx.utils.AlertHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main.fxml"), 800, 450);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(Parent parent) {
        scene.setRoot(parent);
    }

    public static Parent loadFXML(String fxml) throws IOException {
        return new FXMLLoader(getURL(fxml)).load();
    }

    public static  URL getURL(String file) {
        final URL url = ClassLoader.getSystemResource(file);
        if(Objects.nonNull(url)){
            return url;
        }
        final Window window = scene.getWindow();
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, window, file,
                "未找到文件!");
        throw new NullPointerException("未找到文件:" + file);
    }

    public static void main(String[] args) {
        launch();
    }
}