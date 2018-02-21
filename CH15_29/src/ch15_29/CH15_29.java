
package ch15_29;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class CH15_29 extends Application {
    
@Override // Override the start method on the Application class
	public void start(Stage primaryStage) {
	// Create a car
	Car car = new Car();
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        
        Button btStop = new Button("Hault!");
        Button btStart = new Button("Begin!");
        Button btSpdUp = new Button("Speed Up!");
        Button btSlwDwn = new Button("SLOW DOWN!");
        
        btStop.setOnAction(e -> car.pause());
        btStart.setOnAction(e -> car.play());
        btSpdUp.setOnAction(e -> car.increaseSpeed());
        btSlwDwn.setOnAction(e -> car.decreaseSpeed());
        
        
	
        hBox.getChildren().addAll(btStop, btStart,btSpdUp, btSlwDwn);
        BorderPane borderPane = new BorderPane();
	borderPane.setCenter(car);
	borderPane.setBottom(hBox);

	// Create a scene and place it in the stage
	Scene scene = new Scene(borderPane, 400, 250);
	primaryStage.setTitle("Vroom Vroom"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage

	car.requestFocus(); // Request focus
	}
        
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
