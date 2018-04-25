import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;


public class RaiseFlag extends Application {

    GridPane pane = new GridPane();
    ImageView image = new ImageView(new Image(getClass().getResourceAsStream("flag.png"),
                                     150,150, true, true));
    PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), image);


    @Override
    public void start(Stage primaryStage) {

        pane.getChildren().add(image);

        pt.setCycleCount(5);
        pt.play();

        Scene scene = new Scene(pane, 300, 450);
        primaryStage.setTitle("Raise Flag");
        primaryStage.setScene(scene);
        primaryStage.show();
    } // end of start


    public static void main(String[] args) {
        Application.launch(args);
    }

}  // end of class