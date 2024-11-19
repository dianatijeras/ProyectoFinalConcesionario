package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
import co.edu.uniquindio.poo.proyectofinal.model.TipoTransaccion;
import co.edu.uniquindio.poo.proyectofinal.model.Transaccion;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReporteViewController {

    Concesionario concesionario = HelloApplication.concesionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ap_MenuReporte;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_Reporte;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TableView<Transaccion> tb_Reporte;

    @FXML
    private TableColumn<Transaccion, String> tbc_Empleado;

    @FXML
    private TableColumn<Transaccion, TipoTransaccion> tbc_TipoTransaccion;

    @FXML
    private TableColumn<Transaccion, Double> tbc_Valor;

    @FXML
    private TableColumn<Transaccion, Vehiculo> tbc_Vehiculo;

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAAdministrador();

    }
    public void volverAAdministrador() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuAdministrador.fxml"));
            Parent root = loader.load();


            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @FXML
    void initialize() {
        tbc_Empleado.setCellValueFactory(cellData -> cellData.getValue().empleadoProperty());
        tbc_Valor.setCellValueFactory(cellData -> cellData.getValue().montoProperty().asObject());
        tbc_TipoTransaccion.setCellValueFactory(cellData -> cellData.getValue().tipoTransaccionProperty());
        tbc_Vehiculo.setCellValueFactory(cellData -> cellData.getValue().vehiculoProperty());
        tb_Reporte.getItems().setAll(concesionario.getListaTransacciones());

        assert ap_MenuReporte != null : "fx:id=\"ap_MenuReporte\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert lbl_Reporte != null : "fx:id=\"lbl_Reporte\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert tb_Reporte != null : "fx:id=\"tb_Reporte\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert tbc_Empleado != null : "fx:id=\"tbc_Empleado\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert tbc_TipoTransaccion != null : "fx:id=\"tbc_TipoTransaccion\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert tbc_Valor != null : "fx:id=\"tbc_Valor\" was not injected: check your FXML file 'MenuReporte.fxml'.";
        assert tbc_Vehiculo != null : "fx:id=\"tbc_Vehiculo\" was not injected: check your FXML file 'MenuReporte.fxml'.";

    }


}
