package mvc;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.PageLayout;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginClicked implements EventHandler {
    private Stage stage;
    private Scene scene;
    private GridPane root;

    public LoginClicked(Stage s, Scene s2, GridPane g){
        this.stage = s;
        this.scene = s2;
        this.root = g;

    }

    @Override
    //from splash page, takes to login page
    public void handle(Event event) {
        //clear scene first
        this.root.getChildren().clear();


        //create login page
        VBox v = new VBox();
        v.setAlignment(Pos.CENTER);
        v.setSpacing(10);


        //Text label
        Text welcome = new Text();
        welcome.setText("LOGIN");
        welcome.setX(650);
        welcome.setY(270);
        welcome.setFont(Font.font("Verdana", 40));

        v.getChildren().add(welcome);

        //Username
        Text username = new Text();
        username.setText("USERNAME:");
        username.setFont(Font.font("Verdana", 13));
        v.getChildren().add(username);

        //username textfield
        TextField userText = new TextField();
        userText.setPrefWidth(400);
        v.getChildren().add(userText);


        //password
        Text pass = new Text();
        pass.setText("PASSWORD:");
        pass.setFont(Font.font("Verdana", 13));
        v.getChildren().add(pass);

        //password textfield
        PasswordField passText = new PasswordField();
        passText.setPrefWidth(400);
        v.getChildren().add(passText);

        //buttons placed horizontally
        HBox buttons = new HBox();
        buttons.setSpacing(22);

        //Login button
        Button login = new Button("LOGIN");

        //Signup button
        Button signup = new Button("SIGNUP");

        //forgot password
        Button fpass = new Button("FORGOT PASSWORD");

        buttons.getChildren().addAll(login, signup, fpass);
        buttons.setAlignment(Pos.CENTER);


        BorderPane b = new BorderPane();
        b.setCenter(v);
        Insets insets = new Insets(20);
        BorderPane.setMargin(v, insets);
        b.setBottom(buttons);
        root.getChildren().add(b);




    }
}
