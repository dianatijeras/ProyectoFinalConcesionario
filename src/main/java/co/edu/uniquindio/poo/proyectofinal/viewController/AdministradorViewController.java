package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_CerrarSesionAdministrador;

    @FXML
    private Button btn_Empleado;

    @FXML
    private Button btn_Empleados;

    @FXML
    private Button btn_Reporte;

    @FXML
    private Button btn_Vehiculos;

    @FXML
    private Label lbl_TituloAdministrador;

    @FXML
    private Pane pn_MenuAdministrador;

    @FXML
    private Separator sp_separacionCerrarSesionAdministrador;

    @FXML
    private Separator sp_separacionTitulo;

    @FXML
    void onClick_CerrarSesionAdministrador(ActionEvent event) {

    }

    @FXML
    void onClick_Empleado(ActionEvent event) {
        cambiarVentana();

    }

    @FXML
    void onClick_Empleados(ActionEvent event) {
        cambiarVentana2();

    }

    @FXML
    void onClick_Reporte(ActionEvent event) {
        cambiarVentana3();

    }

    @FXML
    void onClick_Vehiculos(ActionEvent event) {
        cambiarVentana4();

    }

    @FXML
    private void cambiarVentana() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuEmpleado.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_Empleado.getScene().getWindow());
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void cambiarVentana2() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuVerEmpleados.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_Empleados.getScene().getWindow());
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void cambiarVentana3() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuReporte.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_Reporte.getScene().getWindow());
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void cambiarVentana4() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuVerVehiculos.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_Vehiculos.getScene().getWindow());
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    @FXML
    void initialize() {
        assert btn_CerrarSesionAdministrador != null : "fx:id=\"btn_CerrarSesionAdministrador\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert btn_Empleado != null : "fx:id=\"btn_Empleado\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert btn_Empleados != null : "fx:id=\"btn_Empleados\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert btn_Reporte != null : "fx:id=\"btn_Reporte\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert btn_Vehiculos != null : "fx:id=\"btn_Vehiculos\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert lbl_TituloAdministrador != null : "fx:id=\"lbl_TituloAdministrador\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert pn_MenuAdministrador != null : "fx:id=\"pn_MenuAdministrador\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert sp_separacionCerrarSesionAdministrador != null : "fx:id=\"sp_separacionCerrarSesionAdministrador\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";
        assert sp_separacionTitulo != null : "fx:id=\"sp_separacionTitulo\" was not injected: check your FXML file 'MenuAdministrador.fxml'.";

    }

}
