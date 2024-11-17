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

public class InicioSesionAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_VolverMenuIncio;

    @FXML
    private Button btn_iniciarSesionAdministrador;

    @FXML
    private Label lbl_contrasenia;

    @FXML
    private Label lbl_tituloInicioSesion;

    @FXML
    private Label lbl_usuario;

    @FXML
    private Pane pn_MenuAdministrador;

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
    void onClick_VolverInicio(ActionEvent event) {

    }

    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();

        if ("Administrador".equals(usuario) && "1234".equals(contrasenia)) {
            System.out.println("Inicio de sesión exitoso");
            cambiarVentana(event);
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
        }
    }

    @FXML
    private void cambiarVentana(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuAdministrador.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);


            Stage currentStage = (Stage) (btn_iniciarSesionAdministrador).getScene().getWindow();
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     /**
    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();
        if("Administrador".equals(usuario) && "1234".equals(contrasenia)) {
            System.out.println("Inicio de sesion exitosa");
            cambiarVentana("/co/edu/uniquindio/poo/proyectofinal/view/AdministradorViewController.fxml");
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
        }

    }
    @FXML private void cambiarVentana(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) pn_MenuAdministrador.getScene().getWindow();
            Scene scene = new Scene(root); stage.setScene(scene);
            stage.show();
        } catch (IOException e)
        { e.printStackTrace();
        }
    }
    */

    @FXML
    void initialize() {
        assert btn_VolverMenuIncio != null : "fx:id=\"btn_VolverMenuIncio\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert btn_iniciarSesionAdministrador != null : "fx:id=\"btn_iniciarSesionAdministrador\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert lbl_contrasenia != null : "fx:id=\"lbl_contrasenia\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert lbl_tituloInicioSesion != null : "fx:id=\"lbl_tituloInicioSesion\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert lbl_usuario != null : "fx:id=\"lbl_usuario\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert pn_MenuAdministrador != null : "fx:id=\"pn_MenuAdministrador\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert sp_sepracionTitulo != null : "fx:id=\"sp_sepracionTitulo\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert txf_ingresoContrasenia != null : "fx:id=\"txf_ingresoContrasenia\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";
        assert txf_ingresoUsuario != null : "fx:id=\"txf_ingresoUsuario\" was not injected: check your FXML file 'MenuInicioSesionAdministrador.fxml'.";

    }

}

