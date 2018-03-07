import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    //Need to be outside start to be accessible in rates()
    TextArea ta = new TextArea();
    TextField LoanAmount = new TextField();
    TextField NumYears = new TextField();
    DropShadow shadow = new DropShadow();

    @Override
    public void start(Stage primaryStage) {

        EventHandler<ActionEvent> handler = event -> rates();
        NumYears.setOnAction(handler);
        LoanAmount.setOnAction(handler);

        HBox topPane = new HBox();
        topPane.setSpacing(5);
        topPane.setPadding(new Insets(7));

        Label loan = new Label("Loan Amount:", LoanAmount);
        loan.setContentDisplay(ContentDisplay.RIGHT);
        loan.setTextFill(Color.web("0c38bd"));
        loan.setFont(new Font("Courier New", 15));

        Label NumOfYears = new Label("Number Of Years:", NumYears);
        NumOfYears.setContentDisplay(ContentDisplay.RIGHT);
        NumOfYears.setTextFill(Color.web("0c38bd"));
        NumOfYears.setFont(new Font("Courier New", 15));

        Button btCalculate = new Button("Calculate");
        btCalculate.setOnAction(handler);
        btCalculate.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        btCalculate.setEffect(shadow);
                    }
                });
        btCalculate.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        btCalculate.setEffect(null);
                    }
                });

        topPane.getChildren().addAll(loan, NumOfYears, btCalculate);

        BorderPane borderPane = new BorderPane(ta);
        borderPane.setTop(topPane);

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("Display Loan");
        primaryStage.show();
    }

    private void rates() {
        double annualInterestRate = 3.00;

        double loanAmount = Double.parseDouble(LoanAmount.getText());

        double numberOfYears = Double.parseDouble(NumYears.getText());

        String s = String.format("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        // for loop to display interest rates
        for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

            //This calculates monthly payments
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

            double totalPayment = monthlyPayment * numberOfYears * 12;

            // making % string for formatting reasons...
            String str = "%";

            // Displaying formatted info
            s += String.format("%-1.3f%s%19.2f%30.2f \n", annualInterestRate, str, ((int) (monthlyPayment * 100) / 100.0), ((int) (totalPayment * 100) / 100.0));
            System.out.println();
        }

        ta.setText(s);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}