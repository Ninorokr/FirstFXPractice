package com.silverlink.firstfxpractice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TreeViewController implements Initializable {

    @FXML
    TreeView<String> treeView;

    Image icon = new Image(getClass().getResourceAsStream("img/folderIcon64.png"), 10, 10, false, false);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));

        TreeItem<String> node1 = new TreeItem<>("Node 1", new ImageView(icon));
        TreeItem<String> node2 = new TreeItem<>("Node 2", new ImageView(icon));
        TreeItem<String> node3 = new TreeItem<>("Node 3", new ImageView(icon));
        TreeItem<String> node4 = new TreeItem<>("Node 4", new ImageView(icon));
        TreeItem<String> node5 = new TreeItem<>("Node 5", new ImageView(icon));
        root.getChildren().addAll(node1, node2, node3, node4, node5);

//        TreeItem<String> node1a = new TreeItem<>("Node 1A");
//        TreeItem<String> node2a = new TreeItem<>("Node 2A");
//        TreeItem<String> node3a = new TreeItem<>("Node 3A");
//        TreeItem<String> node4a = new TreeItem<>("Node 4A");
//        TreeItem<String> node5a = new TreeItem<>("Node 5A");
//        node1.getChildren().addAll(node1a, node2a, node3a, node4a, node5a);

        TreeItem<String> node1a = new TreeItem<>("Node 1A", new ImageView(icon));
        TreeItem<String> node1b = new TreeItem<>("Node 1B", new ImageView(icon));
        TreeItem<String> node1c = new TreeItem<>("Node 1C", new ImageView(icon));
        TreeItem<String> node1d = new TreeItem<>("Node 1D", new ImageView(icon));
        TreeItem<String> node1e = new TreeItem<>("Node 1E", new ImageView(icon));
        node1.getChildren().addAll(node1a, node1b, node1c, node1d, node1e);

        TreeItem<String> node2a = new TreeItem<>("Node 2A", new ImageView(icon));
        TreeItem<String> node2b = new TreeItem<>("Node 2B", new ImageView(icon));
        TreeItem<String> node2c = new TreeItem<>("Node 2C", new ImageView(icon));
        TreeItem<String> node2d = new TreeItem<>("Node 2D", new ImageView(icon));
        TreeItem<String> node2e = new TreeItem<>("Node 2E", new ImageView(icon));
        node2.getChildren().addAll(node2a, node2b, node2c, node2d, node2e);

        TreeItem<String> node3a = new TreeItem<>("Node 3A", new ImageView(icon));
        TreeItem<String> node3b = new TreeItem<>("Node 3B", new ImageView(icon));
        TreeItem<String> node3c = new TreeItem<>("Node 3C", new ImageView(icon));
        TreeItem<String> node3d = new TreeItem<>("Node 3D", new ImageView(icon));
        TreeItem<String> node3e = new TreeItem<>("Node 3E", new ImageView(icon));
        node3.getChildren().addAll(node3a, node3b, node3c, node3d, node3e);

        TreeItem<String> node4a = new TreeItem<>("Node 4A", new ImageView(icon));
        TreeItem<String> node4b = new TreeItem<>("Node 4B", new ImageView(icon));
        TreeItem<String> node4c = new TreeItem<>("Node 4C", new ImageView(icon));
        TreeItem<String> node4d = new TreeItem<>("Node 4D", new ImageView(icon));
        TreeItem<String> node4e = new TreeItem<>("Node 4E", new ImageView(icon));
        node4.getChildren().addAll(node4a, node4b, node4c, node4d, node4e);

        TreeItem<String> node5a = new TreeItem<>("Node 5A", new ImageView(icon));
        TreeItem<String> node5b = new TreeItem<>("Node 5B", new ImageView(icon));
        TreeItem<String> node5c = new TreeItem<>("Node 5C", new ImageView(icon));
        TreeItem<String> node5d = new TreeItem<>("Node 5D", new ImageView(icon));
        TreeItem<String> node5e = new TreeItem<>("Node 5E", new ImageView(icon));
        node5.getChildren().addAll(node5a, node5b, node5c, node5d, node5e);

        treeView.setRoot(root);

    }

    public void treeViewMouseClick(MouseEvent mouseEvent){
        if(mouseEvent.getClickCount() == 4) {
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }

}
