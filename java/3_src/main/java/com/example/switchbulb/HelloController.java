package com.example.switchbulb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class HelloController {

    @FXML
    private boolean active = false;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @FXML
    ImageView imageView1, imageView2, imageView3;
    @FXML
    Button myButton;

    Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("bulbOn.png")));
    Image myImage2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("bulbOff.png")));

    public void displayImageBtn1(){
        if (isActive()) {
            imageView1.setImage(myImage2);
            setActive(false);
        } else {
            imageView1.setImage(myImage);
            setActive(true);
        }

    }
    public void displayImageBtn2(){
        if (isActive()) {
            imageView2.setImage(myImage2);
            setActive(false);
        } else {
            imageView2.setImage(myImage);
            setActive(true);
        }

    }
    public void displayImageBtn3(){
        if (isActive()) {
            imageView3.setImage(myImage2);
            setActive(false);
        } else {
            imageView3.setImage(myImage);
            setActive(true);
        }

    }

}