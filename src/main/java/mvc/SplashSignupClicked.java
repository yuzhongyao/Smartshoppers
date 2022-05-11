package mvc;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SplashSignupClicked implements EventHandler {
    private Stage stage;
    private Scene scene;
    private GridPane root;

    public SplashSignupClicked(Stage s, Scene s2, GridPane g){
        this.stage = s;
        this.scene = s2;
        this.root = g;
    }




    @Override
    public void handle(Event event) {
        this.root.getChildren().clear();

        //Vbox
        VBox v = new VBox();
        v.setSpacing(10);

        VBox v1 = new VBox();
        //first name
        Text first = new Text("First Name:");
        v1.getChildren().add(first);
        //first name textfield
        TextField firstField = new TextField();
        firstField.setPrefWidth(400);
        v1.getChildren().add(firstField);
        v.getChildren().add(v1);

        VBox v2 = new VBox();
        //last name
        Text last = new Text("Last Name:");
        v2.getChildren().add(last);
        //last name field
        TextField lastField = new TextField();
        lastField.setPrefWidth(400);
        v2.getChildren().add(lastField);
        v.getChildren().add(v2);

        VBox v3 = new VBox();
        //username textlabel
        Text username = new Text("Username:");
        v3.getChildren().add(username);
        //username textfield
        TextField usernameField = new TextField();
        usernameField.setPrefWidth(400);
        v3.getChildren().add(usernameField);
        v.getChildren().add(v3);

        VBox v4 = new VBox();
        //password textlabel
        Text password = new Text("Password:");
        v4.getChildren().add(password);
        //password textfield
        TextField passwordField = new TextField();
        passwordField.setPrefWidth(400);
        v4.getChildren().add(passwordField);
        v.getChildren().add(v4);

        VBox v5 = new VBox();
        //street address label
        Text address = new Text("Address:");
        v5.getChildren().add(address);
        //street address textfield
        TextField addressField = new TextField();
        addressField.setPrefWidth(400);
        v5.getChildren().add(addressField);
        v.getChildren().add(v5);

        VBox v6 = new VBox();
        //city label
        Text city = new Text("City:");
        v6.getChildren().add(city);
        //city textfield
        TextField cityField = new TextField();
        cityField.setPrefWidth(400);
        v6.getChildren().add(cityField);
        v.getChildren().add(v6);

        VBox v7 = new VBox();
        //province label
        Text prov = new Text("Province:");
        v7.getChildren().add(prov);
        //province textfield
        TextField provField = new TextField();
        provField.setPrefWidth(400);
        v7.getChildren().add(provField);
        v.getChildren().add(v7);

        VBox v8 = new VBox();
        //postal code label
        Text postal = new Text("Postal Code:");
        v8.getChildren().add(postal);
        //postal code textfield
        TextField postalField = new TextField();
        postalField.setPrefWidth(400);
        v8.getChildren().add(postalField);
        v.getChildren().add(v8);

        HBox buttons = new HBox();
        buttons.setSpacing(40);

        //Signup
        Button signup = new Button("SIGNUP");
        buttons.getChildren().add(signup);

        //login instead
        HBox h = new HBox();
        h.setSpacing(5);
        Text login = new Text("Already have an account?");
        Font f = new Font(16);
        login.setFont(f);
        Button loginButton = new Button("Login");
        loginButton.setOnMouseClicked(new SplashLoginClicked(stage, scene, root));

        h.getChildren().add(login);
        h.getChildren().add(loginButton);
        buttons.getChildren().add(h);
        v.getChildren().add(buttons);


        root.getChildren().add(v);
    }
}
