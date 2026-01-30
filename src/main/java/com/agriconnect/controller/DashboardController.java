package com.agriconnect.controller;

import com.agriconnect.MainApp;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class DashboardController {

    @FXML private VBox rootBox;

    @FXML
    private void handleLogout() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
            Stage stage = (Stage) rootBox.getScene().getWindow();
            Scene scene = new Scene(root,1000,700);
            MainApp.applyCss(scene);
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goProducts() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/products.fxml"));
            Stage stage = (Stage) rootBox.getScene().getWindow();
            Scene scene = new Scene(root,1000,700);
            MainApp.applyCss(scene);
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goOrders() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/orders.fxml"));
            Stage stage = (Stage) rootBox.getScene().getWindow();
            Scene scene = new Scene(root,1000,700);
            MainApp.applyCss(scene);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
