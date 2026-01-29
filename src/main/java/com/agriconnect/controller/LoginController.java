package com.agriconnect.controller;

import com.agriconnect.MainApp;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(
                    getClass().getResource("/view/dashboard.fxml"));
            javafx.scene.Parent root = loader.load();

            Stage stage = (Stage) emailField.getScene().getWindow();

            Scene scene = new Scene(root, 1000, 700);
            MainApp.applyCss(scene);

            stage.setScene(scene);   // ✅ use the styled scene

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void handleClear() {
        emailField.clear();
        passwordField.clear();
    }

    @FXML
    private void goFarmerRegister() {
        System.out.println("Farmer register clicked");
    }

    @FXML
    private void goBuyerRegister() {
        System.out.println("Buyer register clicked");
    }
}
