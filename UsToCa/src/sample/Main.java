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

    Label usDollar = new Label();
    Label caDollar = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        GridPane gp = new GridPane();

        TextField tfUs = new TextField();
        TextField tfCa = new TextField();
        tfCa.setEditable(false);

        Button btConvert = new Button("Convert");

        gp.add(new Label("US Dollars: ", usDollar), 0,0);
        gp.add(tfUs, 1, 0);
        gp.add(new Label("Canadian Dollars: ", caDollar),0,1);
        gp.add(tfCa, 1, 1);
        gp.add(btConvert, 2,4);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);

        btConvert.setOnAction(e -> {
            double calculate = Double.parseDouble(tfUs.getText()) * 1.5;
            tfCa.setText(Double.toString(calculate));
        });

        Scene scene = new Scene(gp, 375, 200);
        primaryStage.setTitle("Convert US Dollars to Canadian Dollars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}