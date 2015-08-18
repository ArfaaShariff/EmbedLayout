package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Stage window;
    Button button1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Embedded Layout");

        HBox topMenu= new HBox();
        Button buttonA= new Button("File");
        Button buttonB= new Button("Edit");
        Button buttonC= new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB ,buttonC);

        VBox leftMenu = new VBox();
        Button buttonD= new Button("D");
        Button buttonE= new Button("E");
        Button buttonF= new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane border=new BorderPane();
        border.setTop(topMenu);
        border.setLeft(leftMenu);



        window.setScene(new Scene(border, 300, 275));
        window.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
