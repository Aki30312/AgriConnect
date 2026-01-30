package com.agriconnect.controller;

import com.agriconnect.MainApp;
import com.agriconnect.util.AlertUtil;
import com.agriconnect.util.ValidationUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        // 1) Validation
        if (!ValidationUtil.isValidEmail(email)) {
            AlertUtil.error("Invalid Input", "Please enter a valid email address.");
            return;
        }
        if (!ValidationUtil.isValidPassword(password)) {
            AlertUtil.error("Invalid Input", "Password must be at least 4 characters.");
            return;
        }

        // 2) DB login check (placeholder now)
        // Later (when UserDAO exists), replace this block with DAO authentication:
        // User user = userDAO.login(email, password);
        // if (user == null) { AlertUtil.error(...); return; }
        boolean loginOk = true; // TEMP
        String role = "FARMER"; // TEMP ("FARMER" or "BUYER")

        if (!loginOk) {
            AlertUtil.error("Login Failed", "Incorrect email or password.");
            return;
        }

        // 3) Navigate
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
            Stage stage = (Stage) emailField.getScene().getWindow();
            MainApp.switchScene(stage, root);

            // 4) Role-ready note:
            // Once dashboard supports role injection, Person 6 can pass role via controller
            // using FXMLLoader loader = new FXMLLoader(...); loader.load(); loader.getController()...
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtil.error("Error", "Could not load dashboard.");
        }
    }

    @FXML
    private void handleClear() {
        emailField.clear();
        passwordField.clear();
    }

    @FXML
    private void goFarmerRegister() {
        AlertUtil.info("Info", "Farmer registration screen not implemented yet.");
    }

    @FXML
    private void goBuyerRegister() {
        AlertUtil.info("Info", "Buyer registration screen not implemented yet.");
    }
}
