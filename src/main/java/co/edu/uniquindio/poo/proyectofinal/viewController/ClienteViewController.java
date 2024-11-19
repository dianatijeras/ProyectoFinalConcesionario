package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.Cliente;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
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

public class ClienteViewController {

    Concesionario concesionario = HelloApplication.concesionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_AgregarCliente;

    @FXML
    private Button btn_BuscarOEliminarCliente;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_CedulaCliente;

    @FXML
    private Label lbl_Cliente;

    @FXML
    private Label lbl_DireccionCliente;

    @FXML
    private Label lbl_EmailCliente;

    @FXML
    private Label lbl_NombreCliente;

    @FXML
    private Label lbl_TelefonoCliente;

    @FXML
    private Pane pn_MenuCliente;

    @FXML
    private Separator sp_SeparacionTitulo;

    @FXML
    private Separator sp_botones;

    @FXML
    private Separator sp_botones1;

    @FXML
    private TextField txf_CedulaCliente;

    @FXML
    private TextField txf_DireccionCliente;

    @FXML
    private TextField txf_EmailCliente;

    @FXML
    private TextField txf_NombreCliente;

    @FXML
    private TextField txf_TelefonoCliente;

    @FXML
    void OnMousePressed_CedulaCliente(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_DireccionCliente(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_EmailCliente(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_NombreCliente(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_TelefonoCliente(ActionEvent event) {

    }

    @FXML
    void onClick_BuscarOEliminarCliente(ActionEvent event) {
        abrirVentana();

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

    @FXML
    private void abrirVentana() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuBuscarOEliminarCliente.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_BuscarOEliminarCliente.getScene().getWindow());
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void onClick_agregarCliente(ActionEvent event) {
        String nombre = txf_NombreCliente.getText();
        String cedula = txf_CedulaCliente.getText();
        String telefono = txf_TelefonoCliente.getText();
        String direccion = txf_DireccionCliente.getText();
        String email = txf_EmailCliente.getText();

        boolean registrado = registrarCliente(nombre, cedula, telefono, direccion, email);
        mostrarMensaje("Registro Cliente", registrado ? "Cliente registrado con éxito" : "Cliente ya existe", registrado);
    }

    private void mostrarMensaje(String registroCliente, String s, boolean registrado) {
    }


    public boolean registrarCliente(String nombre, String cedula, String telefono, String direccion, String email) {
        Cliente nuevoCliente = new Cliente(nombre, cedula, telefono, direccion, email, null);
        if (concesionario.getListaClientes().stream().anyMatch(c -> c.getCedula().equals(cedula))) {
            return false; // Cliente ya existe
        }
        concesionario.registrarCliente(nuevoCliente);
        return true;
    }


    @FXML
    void initialize() {
        assert btn_AgregarCliente != null : "fx:id=\"btn_AgregarCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert btn_BuscarOEliminarCliente != null : "fx:id=\"btn_BuscarOEliminarCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_CedulaCliente != null : "fx:id=\"lbl_CedulaCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_Cliente != null : "fx:id=\"lbl_Cliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_DireccionCliente != null : "fx:id=\"lbl_DireccionCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_EmailCliente != null : "fx:id=\"lbl_EmailCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_NombreCliente != null : "fx:id=\"lbl_NombreCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert lbl_TelefonoCliente != null : "fx:id=\"lbl_TelefonoCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert pn_MenuCliente != null : "fx:id=\"pn_MenuCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert sp_SeparacionTitulo != null : "fx:id=\"sp_SeparacionTitulo\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert sp_botones != null : "fx:id=\"sp_botones\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert sp_botones1 != null : "fx:id=\"sp_botones1\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert txf_CedulaCliente != null : "fx:id=\"txf_CedulaCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert txf_DireccionCliente != null : "fx:id=\"txf_DireccionCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert txf_EmailCliente != null : "fx:id=\"txf_EmailCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert txf_NombreCliente != null : "fx:id=\"txf_NombreCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";
        assert txf_TelefonoCliente != null : "fx:id=\"txf_TelefonoCliente\" was not injected: check your FXML file 'MenuCliente.fxml'.";

    }

}

