package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static Concesionario concesionario;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuInicio.fxml")); //En lugar de Hello Applicarion se usa getClass()
        Scene scene = new Scene(fxmlLoader.load(), 297, 270);
        stage.setTitle("Tu Carro Uq");
        cargarDatos();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void cargarDatos(){
        concesionario = new Concesionario("Tu carro Uq", "Universidad del quindio", "3020202");
        Empleado empleado = new Empleado();
        empleado.setUsername("emp");
        empleado.setContrasenia("123");
        empleado.setIdEmpleado("123");
        empleado.setNombre("Juan");
        empleado.setTelefono("312456789");
        empleado.setDireccion("juan@gmail.com");

        concesionario.getListaEmpleados().add(empleado);

        Administrador administrador = new Administrador();

        administrador.setUsername("admin");
        administrador.setContrasenia("123");

        concesionario.setAdministrador(administrador);
    }


}