import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeradorSenhasSegurasGUI extends Application {
    @Override
    public void start(Stage palco) {
        palco.setTitle("Gerador de Senhas");

        Label labelTamanhoSenha = new Label("Tamanho da senha:");
        TextField campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setText("8");
    }
}