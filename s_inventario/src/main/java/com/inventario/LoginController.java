package com.inventario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblError;

    // Método para iniciar sesión
    @FXML
    private void iniciarSesion(ActionEvent event) throws IOException {
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        // Verificar credenciales (puedes cambiarlas a tu gusto o conectarlas a una BD)
        if (validarCredenciales(usuario, password)) {
            // Cerrar ventana de login
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();

            // Abrir la interfaz de menú
            abrirMenu();
        } else {
            lblError.setText("Usuario o contraseña incorrectos.");
        }
    }

    // Verificación de credenciales (aquí puedes conectarlo a una base de datos)
    private boolean validarCredenciales(String usuario, String password) {
        return usuario.isEmpty() && password.isEmpty();
    }

    // Cargar el menú después del login exitoso
    private void abrirMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/Interfaces/MenuPrincipal.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setTitle("Menú Principal");
        stage.setScene(new Scene(root, 750, 400));
        stage.show();
    }
}
