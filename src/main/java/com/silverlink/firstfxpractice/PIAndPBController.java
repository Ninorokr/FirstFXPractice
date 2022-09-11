package com.silverlink.firstfxpractice;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

import java.net.URL;
import java.util.ResourceBundle;

public class PIAndPBController implements Initializable {

    @FXML
    public ProgressIndicator piCompletion;

    @FXML
    public ProgressBar pbCompletion;

    @FXML
    public Button btnMinus;

    @FXML
    public Button btnPlus;

    final Progress progress = new Progress();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pbCompletion.progressProperty().set(progress.getProgress());
        piCompletion.progressProperty().set(progress.getProgress());
        progress.progressProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                pbCompletion.progressProperty().set(progress.getProgress());
                piCompletion.progressProperty().set(progress.getProgress());
            }
        });
    }

    public void increase(){
        if(progress.getProgress() > 1)
            return;
        progress.setProgress(progress.getProgress() + .1);
    }

    public void decrease(){
        if(progress.getProgress() < 0)
            return;
        progress.setProgress(progress.getProgress() - .1);
    }
}
