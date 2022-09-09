package com.silverlink.firstfxpractice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class ChooserController {

    @FXML
    private Button btn1;

    @FXML
    private ListView listView;

    public void ButtonAction(){
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("D:\\Mis Documentos\\Estudios\\YouTube\\The Net Ninja\\HTML Tutorial for Beginners"));
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Archivos PDF", "*.pdf"));
        List<File> selectedFiles = fc.showOpenMultipleDialog(null);

        if(selectedFiles != null){
//            listView.getItems().add(selectedFile.getName());
//            listView.getItems().add(selectedFile.getAbsolutePath());
            for(File file : selectedFiles){
                listView.getItems().add(file.getAbsolutePath());
            }

        } else {
            System.out.println("File doesn't exist");
        }
    }

}
