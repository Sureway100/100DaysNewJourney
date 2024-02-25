module com.example.digitalwatch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.digitalwatch to javafx.fxml;
    exports com.example.digitalwatch;
}