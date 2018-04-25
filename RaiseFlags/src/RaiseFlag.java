import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

// Ethan Treece

public class RaiseFlag extends Application {

    // Creates gridpane, image view with image view object, and path transition.
    GridPane pane = new GridPane();
    ImageView image = new ImageView(new Image(getClass().getResourceAsStream("flag.png"),
                                     150,150, true, true));
    PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), image);


    // Start method
    @Override
    public void start(Stage primaryStage) {

        //adds image
        pane.getChildren().add(image);

        //sets cycle count to 5
        pt.setCycleCount(5);
        // plays animation
        pt.play();

        // set the scene
        Scene scene = new Scene(pane, 300, 450);
        primaryStage.setTitle("Raise Flag");
        primaryStage.setScene(scene);
        // display stage
        primaryStage.show();
    } // end of start


    public static void main(String[] args) {
        //launch application
        Application.launch(args);
    }

}  // end of class