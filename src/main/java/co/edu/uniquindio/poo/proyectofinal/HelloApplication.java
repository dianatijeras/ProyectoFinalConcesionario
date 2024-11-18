package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.Administrador;
import co.edu.uniquindio.poo.proyectofinal.model.Empleado;
import co.edu.uniquindio.poo.proyectofinal.model.Persona;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static List<Vehiculo> vehiculos;
    public static List<Persona> empleados;

    static {
        vehiculos = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/menuInicio.fxml")); //En lugar de Hello Applicarion se usa getClass()
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Tu Carro Uq");
        cargarDatos();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void cargarDatos(){
        Empleado empleado = new Empleado();
        empleado.setUsername("emp");
        empleado.setContrasenia("123");
        empleado.setIdEmpleado("123");
        empleado.setNombre("Juan");
        empleado.setTelefono("312456789");
        empleado.setDireccion("juan@gmail.com");

        empleados.add(empleado);

        Administrador administrador = new Administrador();

        administrador.setUsername("admin");
        administrador.setContrasenia("123");

        empleados.add(administrador);
    }

    public static List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static void setVehiculos(List<Vehiculo> vehiculos) {
        HelloApplication.vehiculos = vehiculos;
    }

    public static List<Persona> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(List<Persona> empleados) {
        HelloApplication.empleados = empleados;
    }
}