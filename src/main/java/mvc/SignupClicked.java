package mvc;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignupClicked implements EventHandler {
    private Stage stage;
    private Scene scene;
    private GridPane root;

    public SignupClicked(Stage s, Scene s2, GridPane g){
        this.stage = s;
        this.scene = s2;
        this.root = g;
    }




    @Override
    public void handle(Event event) {

    }
}
