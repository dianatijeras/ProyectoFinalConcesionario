package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.controller.ClienteController;
import co.edu.uniquindio.poo.proyectofinal.controller.VehiculoController;
import co.edu.uniquindio.poo.proyectofinal.model.*;
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
    private VehiculoController vehiculoController = new VehiculoController();


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
    private ComboBox<TipoVehiculo> cb_TipoVehiculo;

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

    private HelloApplication application;

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
        agregar();
        System.out.println(HelloApplication.getVehiculos().size());
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





    public void agregar(){
        Vehiculo vehiculo = null;

        TipoVehiculo tipo = cb_TipoVehiculo.getSelectionModel().getSelectedItem();
        TipoCombustible tipoCombustible = cb_TipoCombustibleVehiculo.getSelectionModel().getSelectedItem();

        switch (tipoCombustible.name()){
            case "DIESEL":
                vehiculo = new CamionCombustible();
                break;
            case "GASOLINA":
                if (tipo.name().equals("Bus")){
                    vehiculo = new BusCombustible();
                }
                if (tipo.name().equals("Moto")){
                    vehiculo = new MotoCombustible();
                }
                if (tipo.name().equals("Deportivo")){
                    vehiculo = new MotoCombustible();
                }
                if (tipo.name().equals("Camioneta")){
                    vehiculo = new CamionetaCombustible();
                }
                if (tipo.name().equals("Camion")){
                    vehiculo = new CamionCombustible();
                }
                if (tipo.name().equals("PickUp")) {
                    vehiculo = new PickUpCombustible();
                }
                if (tipo.name().equals("Sedan")){
                    vehiculo = new SedanCombustible();
                }
                if (tipo.name().equals("Van")){
                    vehiculo = new VanCombustible();
                }
                break;
            case "HIBRIDO":
                if (tipo.name().equals("Bus")){
                    vehiculo = new BusHibrido();
                }
                if (tipo.name().equals("Moto")){
                    vehiculo = new MotoHibrida();
                }
                if (tipo.name().equals("Deportivo")){
                    vehiculo = new DeportivoHibrido();
                }
                if (tipo.name().equals("Camioneta")){
                    vehiculo = new CamionetaHibrida();
                }
                if (tipo.name().equals("Camion")){
                    vehiculo = new CamionetaHibrida();
                }
                if (tipo.name().equals("PickUp")) {
                    vehiculo = new PickUpHibrido();
                }
                if (tipo.name().equals("Sedan")){
                    vehiculo = new SedanHibrido();
                }
                if (tipo.name().equals("Van")){
                    vehiculo = new VanHibrida();
                }
        }

        if (vehiculo != null){
            vehiculo.setMarca(txf_MarcaVehiculo.getText());
            vehiculo.setPlaca(txf_PlacaVehiculo.getText());
            vehiculo.setTipoCombustible(cb_TipoCombustibleVehiculo.getSelectionModel().getSelectedItem());

        }

        vehiculoController.agregar(vehiculo);


    }


    @FXML
    void initialize() {
        cb_EstadoVehiculo.getItems().addAll(Estado.values());
        cb_TipoTransmicionVehiculo.getItems().addAll(TipoTransmicion.values());
        cb_TipoCombustibleVehiculo.getItems().addAll(TipoCombustible.values());
        cb_TipoVehiculo.getItems().addAll(TipoVehiculo.values());
    }


}