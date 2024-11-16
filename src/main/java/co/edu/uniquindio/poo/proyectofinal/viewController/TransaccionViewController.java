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

public class TransaccionViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarTransaccion;

    @FXML
    private Button btn_RealizarTransaccion;

    @FXML
    private Button btn_Volver;

    @FXML
    private ComboBox<?> cb_TipoTransaccion;

    @FXML
    private Label lbl_ClienteTransaccion;

    @FXML
    private Label lbl_FechaTransaccion;

    @FXML
    private Label lbl_IDTransaccion;

    @FXML
    private Label lbl_Monto;

    @FXML
    private Label lbl_Transaccion;

    @FXML
    private Label lbl_VehiculoTransaccion;

    @FXML
    private Label lbl_tipoTransaccion;

    @FXML
    private Pane pn_menuTransaccion;

    @FXML
    private Separator sp_botones;

    @FXML
    private Separator sp_separacionTitulo;

    @FXML
    private TextField txf_ClienteTransaccion;

    @FXML
    private TextField txf_FechaTransaccion;

    @FXML
    private TextField txf_IDTransaccion;

    @FXML
    private TextField txf_VehiculoTransaccion;

    @FXML
    void OnMousePressed_ClienteTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_FechaTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_IDTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_VehiculoTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_BuscarTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_RealizarTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_TipoTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_BuscarTransaccion != null : "fx:id=\"btn_BuscarTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert btn_RealizarTransaccion != null : "fx:id=\"btn_RealizarTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert cb_TipoTransaccion != null : "fx:id=\"cb_TipoTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_ClienteTransaccion != null : "fx:id=\"lbl_ClienteTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_FechaTransaccion != null : "fx:id=\"lbl_FechaTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_IDTransaccion != null : "fx:id=\"lbl_IDTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_Monto != null : "fx:id=\"lbl_Monto\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_Transaccion != null : "fx:id=\"lbl_Transaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_VehiculoTransaccion != null : "fx:id=\"lbl_VehiculoTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert lbl_tipoTransaccion != null : "fx:id=\"lbl_tipoTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert pn_menuTransaccion != null : "fx:id=\"pn_menuTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert sp_botones != null : "fx:id=\"sp_botones\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert sp_separacionTitulo != null : "fx:id=\"sp_separacionTitulo\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert txf_ClienteTransaccion != null : "fx:id=\"txf_ClienteTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert txf_FechaTransaccion != null : "fx:id=\"txf_FechaTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert txf_IDTransaccion != null : "fx:id=\"txf_IDTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";
        assert txf_VehiculoTransaccion != null : "fx:id=\"txf_VehiculoTransaccion\" was not injected: check your FXML file 'MenuTransaccion.fxml'.";

    }


}
