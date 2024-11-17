package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.controller.VehiculoController;
import co.edu.uniquindio.poo.proyectofinal.model.Estado;
import co.edu.uniquindio.poo.proyectofinal.model.TipoCombustible;
import co.edu.uniquindio.poo.proyectofinal.model.TipoTransmicion;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VehiculoViewController {
    private VehiculoController vehiculoController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_AgregarVehiculo;

    @FXML
    private Button btn_EliminarOBuscarVehiculo;

    @FXML
    private Button btn_Volver;

    @FXML
    private ComboBox<Estado> cb_EstadoVehiculo;

    @FXML
    private ComboBox<TipoCombustible> cb_TipoCombustibleVehiculo;

    @FXML
    private ComboBox<TipoTransmicion> cb_TipoTransmicionVehiculo;

    @FXML
    private ComboBox<Vehiculo> cb_TipoVehiculo;

    @FXML
    private Label lbl_CambiosVehiculo;

    @FXML
    private Label lbl_CilindrajeVehiculo;

    @FXML
    private Label lbl_EstadoVehiculo;

    @FXML
    private Label lbl_MarcaVehiculo;

    @FXML
    private Label lbl_ModeloVehiculo;

    @FXML
    private Label lbl_PlacaVehiculo;

    @FXML
    private Label lbl_TipoCombistobleVehiculo;

    @FXML
    private Label lbl_TipoTransmicionVehiculo;

    @FXML
    private Label lbl_TipoVehiculo;

    @FXML
    private Label lbl_TituloVehiculo;

    @FXML
    private Label lbl_Vehiculos;

    @FXML
    private Label lbl_VelocidadMaximaVehiculo;

    @FXML
    private Pane pn_MenuVehiculo;

    @FXML
    private Separator sp_SeparacionBotones;

    @FXML
    private Separator sp_SepracionMitadMenu;

    @FXML
    private Separator sp_separacionTitulo;

    @FXML
    private TextField txf_CambiosVehiculo;

    @FXML
    private TextField txf_CilindrajeVehiculo;

    @FXML
    private TextField txf_MarcaVehiculo;

    @FXML
    private TextField txf_ModeloVehiculo;

    @FXML
    private TextField txf_PlacaVehiculo;

    @FXML
    private TextField txf_VelocidadMaximaVehiculo;

    @FXML
    void OnMousePresse_CambiosVehiculo(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_CilindrajeVehiculo(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_MarcaVehiculo(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_ModeloVehiculo(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_PlacaVehiculo(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_VelocidadMaximaVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_AgregarVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_EliminarOBuscarVehiculo(ActionEvent event) {
        buscarVehiculo();

    }

    @FXML
    void onClick_EstadoVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_TipoCombustibleVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_TipoTransmicionVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_TipoVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_Vehiculos(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAVentanaAnterior();

    }

    public void volverAVentanaAnterior() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuEmpleado.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void buscarVehiculo() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuBuscarOEliminarVehiculo.fxml"));
            Parent root = loader.load();


            Stage currentStage = (Stage) (btn_EliminarOBuscarVehiculo).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @FXML
    void initialize() {
        cb_EstadoVehiculo.getItems().addAll(Estado.values());

        cb_TipoTransmicionVehiculo.getItems().addAll(TipoTransmicion.values());
        cb_TipoCombustibleVehiculo.getItems().addAll(TipoCombustible.values());
    }
}