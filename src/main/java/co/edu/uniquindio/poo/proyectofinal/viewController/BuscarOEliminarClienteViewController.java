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

public class BuscarOEliminarClienteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarCliente;

    @FXML
    private Button btn_EliminarCliente;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_CedulaCliente;

    @FXML
    private Label lbl_Cliente2;

    @FXML
    private Pane pn_MenuCliente2;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TextField txf_CedulaCliente;

    @FXML
    void onClick_BuscarCliente(ActionEvent event) {

    }

    @FXML
    void onClick_EliminarCliente(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAVentanaAnterior();

    }

    public void volverAVentanaAnterior() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuCliente.fxml"));
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
        assert btn_BuscarCliente != null : "fx:id=\"btn_BuscarCliente\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert btn_EliminarCliente != null : "fx:id=\"btn_EliminarCliente\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert lbl_CedulaCliente != null : "fx:id=\"lbl_CedulaCliente\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert lbl_Cliente2 != null : "fx:id=\"lbl_Cliente2\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert pn_MenuCliente2 != null : "fx:id=\"pn_MenuCliente2\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";
        assert txf_CedulaCliente != null : "fx:id=\"txf_CedulaCliente\" was not injected: check your FXML file 'MenuBuscarOEliminarCliente.fxml'.";

    }

}
