package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.Administrador;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
import co.edu.uniquindio.poo.proyectofinal.model.Empleado;
import co.edu.uniquindio.poo.proyectofinal.model.Persona;
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

public class InicioSesionViewController {
    Concesionario concesionario = HelloApplication.concesionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_VolverMenuInicio;

    @FXML
    private Button btn_iniciarSesion;

    @FXML
    private Label lbl_contrasenia;

    @FXML
    private Label lbl_tituloInicioSseion;

    @FXML
    private Label lbl_usuario;

    @FXML
    private Pane pn_MenuEmpleado;

    @FXML
    private Separator sp_sepracionTitulo;

    @FXML
    private TextField txf_ingresoContrasenia;

    @FXML
    private TextField txf_ingresoUsuario;

    @FXML
    void OnMousePressed_contrasenia(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_usuario(ActionEvent event) {

    }

    @FXML
    void onClick_VolverMenuInicio(ActionEvent event) {
        volverAInicio();
    }


    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();

            if (( concesionario.getAdministrador()).getUsername().equals(usuario) && (concesionario.getAdministrador()).getContrasenia().equals(contrasenia)){
                cambiarVentana1(event);
            }


        for (Persona persona : concesionario.getListaEmpleados()){
            if (persona.getClass().equals(Empleado.class)){
                if (((Empleado) persona).getUsername().equals(usuario) && ((Empleado) persona).getContrasenia().equals(contrasenia)){
                    cambiarVentana(event);
                    break;
                }
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            }

        }
    }
    @FXML
    private void cambiarVentana1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuAdministrador.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);


            Stage currentStage = (Stage) (btn_iniciarSesion).getScene().getWindow();
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void cambiarVentana(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuEmpleado.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);


            Stage currentStage = (Stage) (btn_iniciarSesion).getScene().getWindow();
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void volverAInicio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuInicio.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) (btn_VolverMenuInicio).getScene().getWindow();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert btn_VolverMenuInicio != null : "fx:id=\"btn_VolverMenuInicio\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert btn_iniciarSesion != null : "fx:id=\"btn_iniciarSesionEmpleado\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert lbl_contrasenia != null : "fx:id=\"lbl_contrasenia\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert lbl_tituloInicioSseion != null : "fx:id=\"lbl_tituloInicioSseion\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert lbl_usuario != null : "fx:id=\"lbl_usuario\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert pn_MenuEmpleado != null : "fx:id=\"pn_MenuEmpleado\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert sp_sepracionTitulo != null : "fx:id=\"sp_sepracionTitulo\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert txf_ingresoContrasenia != null : "fx:id=\"txf_ingresoContrasenia\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";
        assert txf_ingresoUsuario != null : "fx:id=\"txf_ingresoUsuario\" was not injected: check your FXML file 'MenuInicioSesion.fxml'.";

    }

}
