package com.silverlink.firstfxpractice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.controlsfx.control.action.Action;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

//Controller should always implement Initializable so values can be preloaded before the program shows
public class ComboBoxController implements Initializable {

    @FXML
    public ComboBox<String> myComboBox;

    @FXML
    public Label myLabel;

    @FXML
    public Button btnAddItems;

    public ListView<String> myListView;

    ObservableList<String> list = FXCollections.observableArrayList(populateList());

    public ArrayList<String> populateList(){
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Mango");
        frutas.add("Orange");
        frutas.add("Apple");
        frutas.add("Cashew");
        frutas.add("PawPaw");

        return frutas;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        myComboBox.setItems(list);
//        myListView.setItems(list);
    }

    public void comboChanged(ActionEvent event){
        myLabel.setText(myComboBox.getValue());
    }

    public void ButtonCombo(ActionEvent event){
//        myComboBox.getItems().addAll("Car", "House", "School", "Juice");
//        myListView.getItems().addAll("Car", "House", "School", "Juice"); //Adds it to ListView control
        //You can also add the items directly to the list, the controls with update accordingly


        ObservableList<String> names;
        names = myListView.getSelectionModel().getSelectedItems(); //To print selected item from ListView
        for(String name : names){
            System.out.println(name);
        }
    }

    public void printListViewItemList(){
        System.out.println(myListView.getItems());
    }
}
