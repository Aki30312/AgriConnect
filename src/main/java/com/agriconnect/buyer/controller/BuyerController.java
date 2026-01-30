package com.agriconnect.buyer.controller;
import com.agriconnect.buyer.dao.BuyerDAO;
import com.agriconnect.buyer.model.Buyer;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;

public class BuyerController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    private BuyerDAO buyerDAO = new BuyerDAO();

    public void handleLogin() {
        boolean success = buyerDAO.LoginBuyer(
                emailField.getText(),
                passwordField.getText()
        );

        if (success) {
            showAlert("Login successful");
        } else {
            showAlert("Invalid credentials");
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.show();
    }
}

