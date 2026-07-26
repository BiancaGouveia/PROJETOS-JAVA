import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CalculadoraIMC extends Application {
    @Override 
    public void start(Stage palco) {
        // labels for input fields
        Label weightLabel = new Label("Weight");
        Label heightLabel = new Label("Height");

        // text fields for data entry
        TextField weightField = new TextField();
        weightField.setPromptText("weight in kg");

        TextField heightField = new TextField();
        heightField.setPromptText("height in meters");

        // label to display the IMC result
        Label resultLabel = new Label();
    }
}