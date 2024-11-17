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

public class BuscarTransaccionViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarTransaccion;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_IDTransaccion;

    @FXML
    private Label lbl_Transaccion;

    @FXML
    private Pane pn_MenuTransaccion;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TextField txf_IDTransaccion;

    @FXML
    void onClick_BuscarTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAVentanaAnterior();

    }
    public void volverAVentanaAnterior() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuTransaccion.fxml"));
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
        assert btn_BuscarTransaccion != null : "fx:id=\"btn_BuscarTransaccion\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert lbl_IDTransaccion != null : "fx:id=\"lbl_IDTransaccion\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert lbl_Transaccion != null : "fx:id=\"lbl_Transaccion\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert pn_MenuTransaccion != null : "fx:id=\"pn_MenuTransaccion\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";
        assert txf_IDTransaccion != null : "fx:id=\"txf_IDTransaccion\" was not injected: check your FXML file 'MenuBuscarTransaccion.fxml'.";

    }

}
