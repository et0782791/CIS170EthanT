package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    // create 2 labels (was going to create a method but decided against it)
    Label usDollar = new Label();
    Label caDollar = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Create grid pane
        GridPane gp = new GridPane();

        //create text fields
        TextField tfUs = new TextField();
        TextField tfCa = new TextField();

        //Disables editable text in canadian dollar field
        tfCa.setEditable(false);

        //creates button
        Button btConvert = new Button("Convert");

        //Creates, adds, aligns, and sets horizontal and vertical gap in grid pane
        gp.add(new Label("US Dollars: ", usDollar), 0,0);
        gp.add(tfUs, 1, 0);
        gp.add(new Label("Canadian Dollars: ", caDollar),0,1);
        gp.add(tfCa, 1, 1);
        gp.add(btConvert, 2,4);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);

        // action event that converts us dollars to ca dollars
        btConvert.setOnAction(e -> {
            double calculate = Double.parseDouble(tfUs.getText()) * 1.5;
            tfCa.setText(Double.toString(calculate));
        });

        // Create and set scene
        Scene scene = new Scene(gp, 375, 200);
        primaryStage.setTitle("Convert US Dollars to Canadian Dollars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}