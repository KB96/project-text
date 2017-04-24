/**
 * Created by kbailey179796 on 4/24/2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Prosecution extends Application {

    public void start(Stage primaryStage) throws  Exception{

        Button choice1 = new Button("Restitution");
        Button choice2 = new Button("Jail");
        Button choice3 = new Button("IDK");

        Button choice4 = new Button("Objection!");
        /*choice4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.setTitle("Objection");
                Image pheonix = new Image("Objections.png");
                Scene objection = new Scene(pheonix,200,500);
                System.out.println("");
            }
        });*/
        Pane root = new Pane();
        root.getChildren().add(choice1);
        choice1.setLayoutX(10);
        choice1.setLayoutY(470);
        root.getChildren().add(choice2);
        choice2.setLayoutX(100);
        choice2.setLayoutY(470);
        root.getChildren().add(choice3);
        choice3.setLayoutX(150);
        choice3.setLayoutY(470);
        root.getChildren().add(choice4);
        choice4.setLayoutX(200);
        choice4.setLayoutY(470);
        Image back = new Image("courtroom.jpg");
        primaryStage.setTitle("Prosecution");
        primaryStage.setScene(new Scene(root, 1000,500));
        primaryStage.show();


    }
}