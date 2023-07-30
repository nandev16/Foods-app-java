module com.nandev.proyecto1.v2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.nandev.proyecto1.v2 to javafx.fxml;
    exports com.nandev.proyecto1.v2;
}
