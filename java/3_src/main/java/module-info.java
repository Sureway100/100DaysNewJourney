module com.example.switchbulb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switchbulb to javafx.fxml;
    exports com.example.switchbulb;
}