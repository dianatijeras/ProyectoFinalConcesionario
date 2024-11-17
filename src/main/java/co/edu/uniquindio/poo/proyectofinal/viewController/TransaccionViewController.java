package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.proyectofinal.model.TipoTransaccion;
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
    private ComboBox<TipoTransaccion> cb_TipoTransaccion;

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
        buscarTransaccion();

    }

    @FXML
    void onClick_RealizarTransaccion(ActionEvent event) {
        TipoTransaccion tipo = cb_TipoTransaccion.getValue();
        if(tipo != null){
            switch (tipo){
                case VENTA:
                    realizarVenta();
                    break;
                case ALQUILER:
                    realizarAlquiler();
                case COMPRA:
                    realizarCompra();
                    break;
            }
        } else {
            System.out.println("Selecciones un tipo de transaccion");
        }

    }

    private void realizarVenta(){
        System.out.println("Realizando venta..");

    }

    private void realizarCompra(){
        System.out.println("Realizando compra..");
    }

    private void realizarAlquiler(){
        System.out.println("Realizando alquiler..");
    }


    @FXML
    void onClick_TipoTransaccion(ActionEvent event) {

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

    public void buscarTransaccion() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuBuscarTransaccion.fxml"));
            Parent root = loader.load();


            Stage currentStage = (Stage) (btn_BuscarTransaccion).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @FXML
    void initialize() {
        cb_TipoTransaccion.getItems().addAll(TipoTransaccion.values());
    }

}



