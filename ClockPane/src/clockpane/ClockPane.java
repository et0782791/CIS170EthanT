
package clockpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;


public class ClockPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Clock clock = new Clock();
        
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        
        Button btStop = new Button("Stop");
        Button btStart = new Button("Start");
        
        btStop.setOnAction(e -> clock.stop());
        btStart.setOnAction(e -> clock.start());
        
        // Place buttons in hBox
        hBox.getChildren().addAll(btStop, btStart);

	// Create a border pane and place the nodes in to it
	BorderPane borderPane = new BorderPane();
	borderPane.setCenter(clock);
	borderPane.setBottom(hBox);

	// Create a scene and place it in the stage
	Scene scene = new Scene(borderPane, 250, 250);
	primaryStage.setTitle("Clock"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
