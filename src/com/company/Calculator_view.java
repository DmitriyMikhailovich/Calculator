package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator_view extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            primaryStage.setTitle("Calculator");
            primaryStage.setScene(new Scene(root, 300, 400));
            primaryStage.show();
        } catch (IOException e) {

        }

    }
}
