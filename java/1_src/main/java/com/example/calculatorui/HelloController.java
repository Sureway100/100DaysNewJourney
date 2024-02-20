package com.example.calculatorui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtTol;

    public void clear(ActionEvent actionEvent) {
        setTxtTol("");
        setTxtNum1("");
        setTxtNum2("");
    }

    enum Sign{ ADD, SUB,DIV, MULTI};


    public TextField getTxtNum1() {
        return txtNum1;
    }

    public void setTxtNum1(String value) {
        txtNum1.setText(value);

    }

    public TextField getTxtNum2() {
        return txtNum2;
    }

    public void setTxtNum2(String value) {
        txtNum2.setText(value);
    }

    public TextField getTxtTol() {
        return txtTol;
    }

    public void setTxtTol(String value) {
        txtTol.setText(value);
    }

    @FXML
   public void add(){
        if (!txtNum1.getText().isEmpty() || !txtNum2.getText().isEmpty()) {
            String ans = String.valueOf(calculate(Sign.ADD));
            setTxtTol(ans);
        }
    }
    @FXML
    public void sub(){
        if (!txtNum1.getText().isEmpty() || !txtNum2.getText().isEmpty()) {
            String ans = String.valueOf(calculate(Sign.SUB));
            setTxtTol(ans);
        }
    }
    @FXML
    public void div(){
        if (!txtNum1.getText().isEmpty() || !txtNum2.getText().isEmpty()) {
            String ans = String.valueOf(calculate(Sign.DIV));
            setTxtTol(ans);
        }
    }
    @FXML
    public void multi(){
        if (!txtNum1.getText().isEmpty() || !txtNum2.getText().isEmpty()) {
            String ans = String.valueOf(calculate(Sign.MULTI));
            setTxtTol(ans);
        }
    }

    @FXML
    public double calculate(Sign sign){
        double num1 = Double.parseDouble(getTxtNum1().getText());
        double num2 = Double.parseDouble(getTxtNum2().getText());
         switch(sign){
             case ADD:
                 return num1 + num2;
             case SUB:
                 return num1 - num2;
             case MULTI:
                 return num1 * num2;
             case DIV:
                 return num1 / num2;

             default: return 0.0;
         }
    }
}