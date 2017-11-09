import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Switchcase extends Application {

    public void start(Stage PrimaryStage) {

        int value=0;
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setContentText("Enter a number");
        Optional<String> input = inputDialog.showAndWait();
        String enteredValue = (String)(input.get());
        value = Integer.parseInt(enteredValue);

        switch(value) {
            case 100:
                System.out.println("100");
                break;
            case 80:
                System.out.println("80");
                break;
            default:
                System.out.println("Invalid Value!");
        }
    }
    public static void main(String [] args) {
        launch(args);

    }
}
