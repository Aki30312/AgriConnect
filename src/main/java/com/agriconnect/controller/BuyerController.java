package com.agriconnect.controller;

import com.agriconnect.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BuyerController {

    @FXML private BorderPane rootPane;   // CONNECTS to fx:id in FXML
    @FXML private TextField productIdField;
    @FXML private TextField orderQtyField;

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
    private void placeOrder() {
        System.out.println("Place order clicked");
    }

    @FXML
    private void clearOrderFields() {
        productIdField.clear();
        orderQtyField.clear();
    }
}
