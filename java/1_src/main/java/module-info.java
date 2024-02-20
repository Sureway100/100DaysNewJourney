module com.example.calculatorui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorui to javafx.fxml;
    exports com.example.calculatorui;
}