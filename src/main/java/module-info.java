module app.example.tp1 {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires java.base;

    opens app.example.tp1 to javafx.fxml;
    exports app.example.tp1;
}