package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.model.Cliente;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

    private Concesionario concesionario;

    @FXML
    void onClick_BuscarCliente(ActionEvent event) {
       String cedula = txf_CedulaCliente.getText();
       Cliente cliente = concesionario.buscarCliente(cedula);

       if(cliente != null){
           mostrarInformacionCliente(cliente);
       } else {
           mostrarAlerta("Cliente no encontrado", "No se encontro ningun cliente con la cedula especificada");
       }
    }

    @FXML
    void onClick_EliminarCliente(ActionEvent event) {
        String cedula = txf_CedulaCliente.getText();
        Cliente cliente = concesionario.buscarCliente(cedula);

        if (cliente != null){
            concesionario.eliminarCliente(cedula);
            mostrarAlerta("Cliente eliminado", "El cliente con la cédula especificada ha sido eliminado.");
        } else {
            mostrarAlerta("Error", "No se encontró ningún cliente con la cédula especificada.");
        }


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

    private void mostrarInformacionCliente(Cliente cliente){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información del Cliente");
        alert.setHeaderText(null);
        alert.setContentText("Nombre: " + cliente.getNombre() + "\nCédula: " + cliente.getCedula());
        alert.showAndWait();
    }

    private void mostrarAlerta(String titulo, String mensaje){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();

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
