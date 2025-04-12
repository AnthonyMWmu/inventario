module com.inventario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.inventario to javafx.fxml;
    exports com.inventario;
}
