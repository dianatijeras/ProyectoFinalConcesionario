package co.edu.uniquindio.poo.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/menuInicio.fxml")); //En lugar de Hello Applicarion se usa getClass()
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Tu Carro Uq");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}