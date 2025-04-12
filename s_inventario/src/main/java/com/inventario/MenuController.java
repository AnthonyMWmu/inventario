package com.inventario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private AnchorPane panelContenido;

    // Método para cargar Vista Movimientos
    @FXML
    private void cargarMovimientos() throws IOException {
        cargarVista("/com/Interfaces/Movimientos.fxml");
    }

    // Método para cargar Vista Inventario
    @FXML
    private void cargarInventario() throws IOException {
        cargarVista("/com/Interfaces/Inventario.fxml");
    }

    // Método para cargar Vista Piezas
    @FXML
    private void cargarPiezas() throws IOException {
        cargarVista("/com/Interfaces/Piezas.fxml");
    }

    // Método para cargar Vista Proveedores
    @FXML
    private void cargarProveedores() throws IOException {
        cargarVista("/com/Interfaces/Proveedores.fxml");
    }
    
    // Método para cargar Vista Usuarios
    @FXML
    private void cargarUsuarios() throws IOException {
        cargarVista("/com/Interfaces/Usuarios.fxml");
    }


    // Método genérico para cambiar contenido del panel
    private void cargarVista(String rutaVista) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaVista));
        Parent vistaCargada = loader.load();
        
        // Limpiar contenido previo y agregar la nueva vista
        panelContenido.getChildren().clear();
        panelContenido.getChildren().add(vistaCargada);
        
        // Ajustar la vista para que se adapte al contenedor
        AnchorPane.setTopAnchor(vistaCargada, 0.0);
        AnchorPane.setBottomAnchor(vistaCargada, 0.0);
        AnchorPane.setLeftAnchor(vistaCargada, 0.0);
        AnchorPane.setRightAnchor(vistaCargada, 0.0);

    }

    @FXML
    private void cerrarSesion() throws IOException {
        // Cerrar la ventana actual (menú) y abrir el login
        Stage stage = (Stage) panelContenido.getScene().getWindow();
        stage.close();

        // Abrir la interfaz de login
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/Interfaces/Login.fxml"));
        Parent root = loader.load();
        Stage nuevoStage = new Stage();
        nuevoStage.setTitle("Inicio de Sesión");
        nuevoStage.setScene(new Scene(root, 600, 400));
        nuevoStage.show();
    }
}
