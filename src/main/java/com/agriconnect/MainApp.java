package com.agriconnect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root,1000,700);
        stage.setTitle("AgriConnect - Login");
        MainApp.applyCss(scene);
        stage.setScene(scene);
        stage.show();
    }
    public static void applyCss(Scene scene) {
        scene.getStylesheets().add(MainApp.class.getResource("/css/app.css").toExternalForm());
    }


    public static void main(String[] args) {
        launch();
    }
}
