package com.example.smartshoppers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {



    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        //Stage s = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root,1400, 800, Color.LIGHTSKYBLUE);

        Text welcome = new Text();
        welcome.setText("WELCOME TO SMARTSHOPPERS");
        welcome.setX(700);
        welcome.setY(400);
        welcome.setFont(Font.font("Verdana", 28));

        root.getChildren().add(welcome);

        stage.setResizable(false);
        stage.setTitle("Smartshoppers");
        stage.setScene(scene);
        stage.show();
    }
}
