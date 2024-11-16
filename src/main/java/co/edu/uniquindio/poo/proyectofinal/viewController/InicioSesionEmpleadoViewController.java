package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
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

public class InicioSesionEmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_VolverMenuInicio;

    @FXML
    private Button btn_iniciarSesionEmpleado;

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
        cambiarVentana("/co/edu/uniquindio/poo/proyectofinal/view/InicioViewController.fxml");

    }

    /**
     *
     * @FXML
     * private void volver(ActionEvent event) throws IOException {
     *     cambiarVentana("/co/edu/uniquindio/poo/proyectofinal/view/MenuInicio.fxml");
     * }
     *
     * @FXML
     * private void cambiarVentana(String fxmlFile) {
     *     try {
     *         FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
     *         Parent root = loader.load();
     *         Stage stage = (Stage) pn_MenuEmpleado.getScene().getWindow();
     *         Scene scene = new Scene(root);
     *         stage.setScene(scene);
     *         stage.show();
     *     } catch (IOException e) {
     *         e.printStackTrace();
     *     }
     * }
     *
     */

    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();
        if("Empleado".equals(usuario) && "1234".equals(contrasenia)) {
            System.out.println("Inicio de sesion exitosa");
            cambiarVentana("/co/edu/uniquindio/poo/proyectofinal/view/EmpleadoViewController.fxml");
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
        }

    }
    @FXML private void cambiarVentana(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) pn_MenuEmpleado.getScene().getWindow();
            Scene scene = new Scene(root); stage.setScene(scene);
            stage.show();
        } catch (IOException e)
        { e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert btn_VolverMenuInicio != null : "fx:id=\"btn_VolverMenuInicio\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert btn_iniciarSesionEmpleado != null : "fx:id=\"btn_iniciarSesionEmpleado\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert lbl_contrasenia != null : "fx:id=\"lbl_contrasenia\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert lbl_tituloInicioSseion != null : "fx:id=\"lbl_tituloInicioSseion\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert lbl_usuario != null : "fx:id=\"lbl_usuario\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert pn_MenuEmpleado != null : "fx:id=\"pn_MenuEmpleado\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert sp_sepracionTitulo != null : "fx:id=\"sp_sepracionTitulo\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert txf_ingresoContrasenia != null : "fx:id=\"txf_ingresoContrasenia\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";
        assert txf_ingresoUsuario != null : "fx:id=\"txf_ingresoUsuario\" was not injected: check your FXML file 'MenuInicioSesionEmpleado.fxml'.";

    }

}
