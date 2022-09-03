package com.silverlink.firstfxpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {

    @FXML
    private Label myLabel;

    public void generateRandom(ActionEvent event){

        Random randnum = new Random();
        int rand = randnum.nextInt(1000) + 1;
        myLabel.setText(String.valueOf(rand));
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido a Libra v0.0.1");
    }
}