package com.silverlink.firstfxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1366*.7, 768*.7);
//        stage.setTitle("Libra GUI v0.0.1");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}

//Class has to extend Application and override the start method
//The method to show the main screen (the stage) is primaryStage.show(); this line goes inside the start method
//Inside main method call the launch(args); method (launch is a method from the Application class)

public class HelloApplication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me!"); //Create a button, button by itself doesn't show
        Button btnExit = new Button("Salir");

//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello World!");
//            }
//        });
        btnExit.setOnAction(e ->{
            System.out.println("Saliendo de la aplicación. Hasta pronto!");
            System.exit(0);
        });
        btn.setOnAction(e -> System.out.println("Hello lambda!"));
//        StackPane root = new StackPane(); //This layout is not so useful for a main screen
        HBox root = new HBox(); //Have to create a layout and add items to it
        root.getChildren().add(btn); //Add all items created to the StackPane
        root.getChildren().add(btnExit);
        Scene scene = new Scene(root, 640, 480); //Create new Scene and set root as it's layout, and window dimensions
        primaryStage.setScene(scene); //Set the scene to the stage
        primaryStage.show(); //Show on screen
    }

    public static void main(String[] args) {
        launch(args); //This is a method from the Application class
    }
}