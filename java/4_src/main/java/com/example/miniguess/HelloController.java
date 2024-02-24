package com.example.miniguess;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;

public class HelloController {

    @FXML
    public Button myBtn1, myBtn2, myBtn3, myBtn4, myBtn5, myBtn6, myBtn7, myBtn8, myBtn9, myBtn10;

    @FXML
    public Label lblPlayerOne, lblPlayerTwo, selectedFirst, selectedSecond, winOrLose;


    public String firstNum;
    public String secondNum;
    Random rand = new Random();

    public int randomNumber;


    public String getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(String firstNum) {
        this.firstNum = firstNum;
    }

    public String getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(String secondNum) {
        this.secondNum = secondNum;
    }
    public void setLblPlayerOne(){
        randomNumber = rand.nextInt(11);
    }

    @FXML
    public void btnClicked(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn1.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn1.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked2(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn2.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn2.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked3(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn3.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn3.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked4(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn4.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn4.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked5(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn5.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn5.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked6(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn6.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn6.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked7(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn7.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn7.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked8(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn8.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn8.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked9(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn9.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn9.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void btnClicked10(){
        System.out.println("randomNumber = " + randomNumber);
        if(firstNum == null){
            setFirstNum(myBtn10.getText());
            System.out.println("you have picked first number");
            selectedFirst.setText("First Number Selected");
        } else if (secondNum == null) {
            setSecondNum(myBtn10.getText());
            System.out.println("you have picked second number");
            selectedSecond.setText("Second Number Selected");
        }else {
            System.out.println("you can't pick more than one");
        }

    }
    public void answer(){
        try {
            System.out.println("randomNumber = " + randomNumber);
            int first_guess = Integer.parseInt(getFirstNum());
            int second_guess = Integer.parseInt(getSecondNum());
            int total = first_guess + second_guess;
            lblPlayerTwo.setText("" + total);
            lblPlayerOne.setText("" + randomNumber);

            if (randomNumber == total) {
                System.out.println("you win");
                winOrLose.setText("YOU WIN");

            } else {
                System.out.println("you lose");
                winOrLose.setText("YOU LOSE");
            }
        }catch(Exception e){
            System.out.println("Selected first and second number");
        }

    }
    public void clear(){
        selectedSecond.setText("");
        selectedFirst.setText("");
        lblPlayerOne.setText("");
        lblPlayerTwo.setText("");
        winOrLose.setText("");
        setFirstNum(null);
        setSecondNum(null);
        rand.nextInt(11);
    }

    //another method of doing this onclick method
//    public void handleButtonClick(ActionEvent event) {
//        Button clickedButton = (Button) event.getSource();
//
//        if (clickedButton == button1) {
//            // Handle button1 click
//
//            System.out.println("Button 1 was clicked!");
//        } else if (clickedButton == button2) {
//            // Handle button2 click
//            System.out.println("Button 2 was clicked!");
//        } else if (clickedButton == button3) {
//            // Handle button3 click
//            System.out.println("Button 3 was clicked!");
//        } else if (clickedButton == button4) {
//            // Handle button4 click
//            System.out.println("Button 4 was clicked!");
//        } else if (clickedButton == button5) {
//            // Handle button5 click
//            System.out.println("Button 5 was clicked!");
//        }
//    }



}