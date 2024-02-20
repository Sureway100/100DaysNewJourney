package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txt1;

    @FXML
    private Label lbl1;


    public void onFinish(ActionEvent actionEvent) {
        String read = txt1.getText();
//        String reply = String.valueOf(calculate(Sign.DIV));
        lbl1.setText( "WELCOME " + read);
    }
}