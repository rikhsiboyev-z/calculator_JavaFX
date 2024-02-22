package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {


    private final Image icon = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHbkByuwj63B9L70VeX9TYt3VSXv0PKO6cePJ6OtZgDQ&s");

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}