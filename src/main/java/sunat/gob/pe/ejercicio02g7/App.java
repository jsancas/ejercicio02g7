package sunat.gob.pe.ejercicio02g7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Insets sangriaLabel = new Insets(0,0,0,10);
        Label lblData = new Label("Data");
        Label lblVentas = new Label("Ventas");
        lblVentas.setPadding(sangriaLabel);
        Label lblMarketing = new Label("Marketing");
        lblMarketing.setPadding(sangriaLabel);
        Label lblDistribucion = new Label("Distribucion");
        lblDistribucion.setPadding(sangriaLabel);
        Label lblCostos = new Label("Costos");
        lblCostos.setPadding(sangriaLabel);
        
        VBox box = new VBox(lblData,lblVentas,lblMarketing,lblDistribucion,lblCostos);
        var scene = new Scene(new StackPane(box), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}