package com.example.smartshoppers;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import mvc.SplashLoginClicked;
import mvc.SplashSignupClicked;

public class Main extends Application {



    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        //Stage s = new Stage();
        //parent
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(12);
        root.setStyle("-fx-background-color: LIGHTSKYBLUE" );
        Scene scene = new Scene(root,1400, 800, Color.LIGHTSKYBLUE);


        //Text label
        Text welcome = new Text();
        welcome.setText("WELCOME TO SMARTSHOPPERS");

        welcome.setFont(Font.font("Verdana", 40));

        root.add(welcome, 0, 0);




        //Login button
        Button login = new Button("LOGIN");
        login.setMinSize(150,100);
        Font font = new Font(50);
        login.setFont(font);
        login.setOnMouseClicked(new SplashLoginClicked(stage, scene, root){
                                });

        //Signup button
        Button signup = new Button("SIGNUP");
        login.setMinSize(150,100);
        signup.setFont(font);
        signup.setOnMouseClicked(new SplashSignupClicked(stage, scene, root));

        //hbox
        HBox h = new HBox();
        h.getChildren().add(login);
        h.getChildren().add(signup);
        h.setSpacing(50);
        h.setLayoutX(500);
        h.setLayoutY(400);
        root.add(h, 1, 1);
        root.setAlignment(Pos.CENTER);

        stage.setResizable(false);
        stage.setTitle("Smartshoppers");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
