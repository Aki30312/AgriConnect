package com.agriconnect.controller;

import com.agriconnect.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FarmerController {

    @FXML private BorderPane rootPane;
    @FXML private TextField nameField;
    @FXML private TextField priceField;
    @FXML private TextField qtyField;

    @FXML
    private void goBack() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            Scene scene = new Scene(root,1000,700);
            MainApp.applyCss(scene);
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void addProduct() {
        System.out.println("Add product clicked");
    }

    @FXML
    private void updateProduct() {
        System.out.println("Update product clicked");
    }

    @FXML
    private void deleteProduct() {
        System.out.println("Delete product clicked");
    }

    @FXML
    private void clearFields() {
        nameField.clear();
        priceField.clear();
        qtyField.clear();
    }
}
