package com.inventario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el Login.fxml al iniciar
        Parent root = FXMLLoader.load(getClass().getResource("/com/Interfaces/Login.fxml"));
        primaryStage.setTitle("Inicio de Sesión");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}