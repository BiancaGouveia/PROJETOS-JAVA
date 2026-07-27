import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Fase1 extends Application {
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

        // button to calculate imc
        Button calculationButton = new Button("calculate imc");
        
        calculationButton.setOnAction(e -> {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            double imc = weight / (height * height);
            resultLabel.setText(String.format("Your IMC is: %.2f", imc));
        });

        // vertical layout
        VBox layout = new VBox(10, weightLabel, weightField, heightLabel, heightField, calculationButton, resultLabel);
        layout.setPadding(new Insets(10));
        layout.setAlignament(Pos.CENTER);

        // scene and stage
        Scene cena = new Scene(layout, 300, 250);
        palco.setTitle("IMC calculator");
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}