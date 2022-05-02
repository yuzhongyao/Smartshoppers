package com.example.smartshoppers;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
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
        //parent
        Group root = new Group();
        Scene scene = new Scene(root,1400, 800, Color.LIGHTSKYBLUE);

        //Text label
        Text welcome = new Text();
        welcome.setText("WELCOME TO SMARTSHOPPERS");
        welcome.setX(400);
        welcome.setY(270);
        welcome.setFont(Font.font("Verdana", 40));

        root.getChildren().add(welcome);




        //Login button
        Button login = new Button("LOGIN");
        login.setMinSize(150,100);
        Font font = new Font(50);
        login.setFont(font);


        //Signup button
        Button signup = new Button("SIGNUP");
        login.setMinSize(150,100);
        signup.setFont(font);

        //hbox
        HBox h = new HBox();
        h.getChildren().add(login);
        h.getChildren().add(signup);
        h.setSpacing(50);
        h.setLayoutX(500);
        h.setLayoutY(400);
        root.getChildren().add(h);

        stage.setResizable(false);
        stage.setTitle("Smartshoppers");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
