import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
/    Class: Chp16_06
/    @autho: Ethan
/    Date: 3/15
/    Purpose: some purpose
*/
public class Chp16_06 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        TextField tfTextField = new TextField("Ethan");
        Label lbTextField = new Label("Text Field:", tfTextField);
        lbTextField.setContentDisplay(ContentDisplay.RIGHT);
        
        HBox hBox = new HBox(lbTextField);
        hBox.setPadding(new Insets(2));
        hBox.setAlignment(Pos.CENTER);
        pane.add(hBox, 0, 0);

        ToggleGroup group = new ToggleGroup();
        
        RadioButton rbLeft = new RadioButton();
        Label lbLeft = new Label("Left", rbLeft);
        rbLeft.setToggleGroup(group);
        rbLeft.setOnAction(e -> tfTextField.setAlignment(Pos.CENTER_LEFT));
        rbLeft.setSelected(true);

        RadioButton rbRight = new RadioButton();
        Label lbRight = new Label("Right", rbRight);

        rbRight.setOnAction(e-> tfTextField.setAlignment(Pos.CENTER_RIGHT));
        rbRight.setToggleGroup(group);

        RadioButton rbCenter = new RadioButton();
        Label lbCenter = new Label("Center", rbCenter);

        rbCenter.setOnAction(e-> tfTextField.setAlignment(Pos.CENTER));
        rbCenter.setToggleGroup(group);

        TextField tfColumnSize = new TextField();
        tfColumnSize.setPrefColumnCount(3);
        tfColumnSize.setText("12");

        tfColumnSize.setOnAction(e->tfTextField.setPrefColumnCount(Integer.parseInt(tfColumnSize.getText())));
        Label lbColumnSize = new Label("Column Size", tfColumnSize);
        lbColumnSize.setContentDisplay(ContentDisplay.RIGHT);

        HBox hBox2 = new HBox(lbLeft, lbCenter, lbRight, lbColumnSize);
        hBox2.setSpacing(10);
        hBox2.setPadding(new Insets(5, 5, 5, 5));
        pane.add(hBox2, 0, 1);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("TextField");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
