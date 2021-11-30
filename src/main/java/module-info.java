module com.sarbr.javafx {
    requires org.kordamp.bootstrapfx.core;
    requires javafx.fxml;
    requires javafx.controls;

    opens com.sarbr.javafx.controller to javafx.fxml;
    exports com.sarbr.javafx;
}