import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.layout.Pane;



public class Hangman extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        
        //Polyline uses x and y DOUBLES for points
        //Creates initial double values
        
        double x1 = 50.0;
        double y1 = 180.0;
        double y2 = 30.0;
        double x3 = 125.0;
        
	// Creates 3 polyline objects
        // 1 Platform
	Polyline poly = new Polyline();
        pane.getChildren().add(poly);
        poly.setStroke(Color.BLACK);
        poly.getPoints().addAll(new Double[]{x1, y1, x1, y2, x3, y2, x3, y1 * .60});
        
	// 2
        // Arms
        Polyline poly2 = new Polyline();
        pane.getChildren().add(poly2);
        poly2.setStroke(Color.BLACK);
        poly2.getPoints().addAll(new Double[]{(x1+x3) * .5, y1 * .5, x3, y1 * .5, x3 + (x3 - x1) * .25, y1 * .5});
        // 3
        // Legs 
        Polyline poly3 = new Polyline();
        pane.getChildren().add(poly3);
        poly3.setStroke(Color.BLACK);
        poly3.getPoints().addAll(new Double[]{(x1 + x3) * .5, y1 * .85, x3, y1 * .6,x3 + (x3 - x1) * .3, y1 * .85});
 
	// Creates circle object
        // Head
	Circle circle = new Circle(x3, y1 * .25, 15);
	circle.setFill(Color.WHITE);
	circle.setStroke(Color.BLACK);
	pane.getChildren().add(circle);

	// Creates arc object
        // Base
	Arc arc = new Arc(x1, y1 + 2, 30, 20, 0, 180);
	arc.setFill(Color.WHITE);
	arc.setStroke(Color.BLACK);
	pane.getChildren().add(arc);

	// Creates the scene
	Scene scene = new Scene(pane, 175, 225);
	primaryStage.setTitle("Hangman");
	primaryStage.setScene(scene); 
	primaryStage.show(); // Displays stage
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}