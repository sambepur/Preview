package com.example.preview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;


public class Window extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Check.Call(Window.class, Preview.class);
    }
    @Preview()
    public static void CallWindow1(){
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 200, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Test1");
        stage.show();
    }
    @Preview()
    public static void CallWindow2(){
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 200, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Test2");
        stage.show();
    }

}
