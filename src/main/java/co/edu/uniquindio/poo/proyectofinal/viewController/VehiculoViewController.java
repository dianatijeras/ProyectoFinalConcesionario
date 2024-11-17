package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class VehiculoViewController {
//breve espere miro lo d fox q esta perdido ale
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_AgregarVehiculo;

    @FXML
    private Button btn_BuscarVehiculo;

    @FXML
    private Button btn_EliminarVehiculo;

    @FXML
    private Button btn_Volver;

    @FXML
    private ComboBox<?> cb_EstadoVehiculo;

    @FXML
    private ComboBox<?> cb_TipoCombustibleVehiculo;

    @FXML
    private ComboBox<?> cb_TipoTransmicionVehiculo;

    @FXML
    private ComboBox<?> cb_TipoVehiculo;

    @FXML
    private ComboBox<?> cb_Vehiculos;

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
    void onClick_BuscarVehiculo(ActionEvent event) {

    }

    @FXML
    void onClick_EliminarVehiculo(ActionEvent event) {

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

    }

    @FXML
    void initialize() {
        assert btn_AgregarVehiculo != null : "fx:id=\"btn_AgregarVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert btn_BuscarVehiculo != null : "fx:id=\"btn_BuscarVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert btn_EliminarVehiculo != null : "fx:id=\"btn_EliminarVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert cb_EstadoVehiculo != null : "fx:id=\"cb_EstadoVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert cb_TipoCombustibleVehiculo != null : "fx:id=\"cb_TipoCombustibleVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert cb_TipoTransmicionVehiculo != null : "fx:id=\"cb_TipoTransmicionVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert cb_TipoVehiculo != null : "fx:id=\"cb_TipoVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert cb_Vehiculos != null : "fx:id=\"cb_Vehiculos\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_CambiosVehiculo != null : "fx:id=\"lbl_CambiosVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_CilindrajeVehiculo != null : "fx:id=\"lbl_CilindrajeVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_EstadoVehiculo != null : "fx:id=\"lbl_EstadoVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_MarcaVehiculo != null : "fx:id=\"lbl_MarcaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_ModeloVehiculo != null : "fx:id=\"lbl_ModeloVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_PlacaVehiculo != null : "fx:id=\"lbl_PlacaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_TipoCombistobleVehiculo != null : "fx:id=\"lbl_TipoCombistobleVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_TipoTransmicionVehiculo != null : "fx:id=\"lbl_TipoTransmicionVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_TipoVehiculo != null : "fx:id=\"lbl_TipoVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_TituloVehiculo != null : "fx:id=\"lbl_TituloVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_Vehiculos != null : "fx:id=\"lbl_Vehiculos\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert lbl_VelocidadMaximaVehiculo != null : "fx:id=\"lbl_VelocidadMaximaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert pn_MenuVehiculo != null : "fx:id=\"pn_MenuVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert sp_SeparacionBotones != null : "fx:id=\"sp_SeparacionBotones\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert sp_SepracionMitadMenu != null : "fx:id=\"sp_SepracionMitadMenu\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert sp_separacionTitulo != null : "fx:id=\"sp_separacionTitulo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_CambiosVehiculo != null : "fx:id=\"txf_CambiosVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_CilindrajeVehiculo != null : "fx:id=\"txf_CilindrajeVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_MarcaVehiculo != null : "fx:id=\"txf_MarcaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_ModeloVehiculo != null : "fx:id=\"txf_ModeloVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_PlacaVehiculo != null : "fx:id=\"txf_PlacaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";
        assert txf_VelocidadMaximaVehiculo != null : "fx:id=\"txf_VelocidadMaximaVehiculo\" was not injected: check your FXML file 'MenuVehiculo.fxml'.";

    }

}
