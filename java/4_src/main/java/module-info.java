module com.example.miniguess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniguess to javafx.fxml;
    exports com.example.miniguess;
}