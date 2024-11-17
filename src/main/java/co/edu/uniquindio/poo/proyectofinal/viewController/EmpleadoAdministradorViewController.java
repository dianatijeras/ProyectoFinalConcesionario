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
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EmpleadoAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_AgregarEmpleado;

    @FXML
    private Button btn_BuscarEmpleado;

    @FXML
    private Button btn_EliminarEmpleado;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_CedulaEmpleado;

    @FXML
    private Label lbl_DireccionEmpleado;

    @FXML
    private Label lbl_Empleado;

    @FXML
    private Label lbl_IDEmpleado;

    @FXML
    private Label lbl_NombreEmpleado;

    @FXML
    private Label lbl_Salario;

    @FXML
    private Label lbl_TelefonoEmpleado;

    @FXML
    private Pane pn_MenuEmpleadoAdministrador;

    @FXML
    private Separator sp_SeparacionTitulo;

    @FXML
    private TextField txf_CedulaEmpleado;

    @FXML
    private TextField txf_DireccionEmpleado;

    @FXML
    private TextField txf_IDEmpleado;

    @FXML
    private TextField txf_NombreEmpleado;

    @FXML
    private TextField txf_SalarioEmpleado;

    @FXML
    private TextField txf_TelefonoEmpleado;

    @FXML
    void OnMousePressed_CedulaEmpleado(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_DireccionEmpleado(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_IDEmpleado(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_NombreEmpleado(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_SalarioEmpleado(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_TelefonoEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_AgregarEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_BuscarEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_EliminarEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {
    volverAInicio();
    }

    public void volverAInicio() {
        try {
            // Cargar el archivo FXML de InicioViewController
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuInicio.fxml"));
            Parent root = loader.load();

            // Obtener el Stage actual
            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();

            // Configurar la nueva escena
            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error en caso de que el archivo FXML no se cargue
        }
    }

    @FXML
    void initialize() {
        assert btn_AgregarEmpleado != null : "fx:id=\"btn_AgregarEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert btn_BuscarEmpleado != null : "fx:id=\"btn_BuscarEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert btn_EliminarEmpleado != null : "fx:id=\"btn_EliminarEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_CedulaEmpleado != null : "fx:id=\"lbl_CedulaEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_DireccionEmpleado != null : "fx:id=\"lbl_DireccionEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_Empleado != null : "fx:id=\"lbl_Empleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_IDEmpleado != null : "fx:id=\"lbl_IDEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_NombreEmpleado != null : "fx:id=\"lbl_NombreEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_Salario != null : "fx:id=\"lbl_Salario\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert lbl_TelefonoEmpleado != null : "fx:id=\"lbl_TelefonoEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert pn_MenuEmpleadoAdministrador != null : "fx:id=\"pn_MenuEmpleadoAdministrador\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert sp_SeparacionTitulo != null : "fx:id=\"sp_SeparacionTitulo\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_CedulaEmpleado != null : "fx:id=\"txf_CedulaEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_DireccionEmpleado != null : "fx:id=\"txf_DireccionEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_IDEmpleado != null : "fx:id=\"txf_IDEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_NombreEmpleado != null : "fx:id=\"txf_NombreEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_SalarioEmpleado != null : "fx:id=\"txf_SalarioEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";
        assert txf_TelefonoEmpleado != null : "fx:id=\"txf_TelefonoEmpleado\" was not injected: check your FXML file 'MenuEmpleadoAdministrador.fxml'.";

    }


}
