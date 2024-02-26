package com.example.digitalwatch;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class HelloController {
    public Label lblWatch;


    @FXML
    public void checkTime() {
//        lblWatch = new Label();
        lblWatch.setStyle("-fx-font-size: 4em;"); // Adjust font size as needed
        updateTime(); // Initial call to set the current time

        // Create a Timeline to update the time every second
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> updateTime())
        );
        timeline.setCycleCount(Animation.INDEFINITE); // Repeat indefinitely
        timeline.play();
    }

    // Method to update the time label
    public void updateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        lblWatch.setText(formattedTime);
    }


}