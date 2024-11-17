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
        volverAInicio();
    }
    /**
    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        // Obtiene los valores ingresados por el usuario
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();

        // Imprime las credenciales para depuración
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contrasenia);

        // Verifica las credenciales y redirige a diferentes vistas según el usuario
        if ("Empleado".equals(usuario) && "1234".equals(contrasenia)) {
            System.out.println("Inicio de sesión exitoso para Empleado");

        } else if ("Admin".equals(usuario) && "adminpass".equals(contrasenia)) {
            System.out.println("Inicio de sesión exitoso para Administrador");
            cambiarVentana2("/co/edu/uniquindio/poo/proyectofinal/view/MenuAdministrador.fxml");
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
        }
    }

    /**
     * Cambia la ventana actual a la especificada por el archivo FXML.
     *
     * @param fxmlFile Ruta del archivo FXML de la nueva ventana.

    @FXML
    private void cambiarVentana2(String fxmlFile) {
        try {
            // Carga el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/view/MenuAdministrador.fxml"));
            Parent root = loader.load();

            // Obtiene la ventana actual y establece la nueva escena
            Stage stage = (Stage) btn_iniciarSesionAdministrador.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    */
    /**
    @FXML
    void onClick_iniciarSesion(ActionEvent event) {
        String usuario = txf_ingresoUsuario.getText();
        String contrasenia = txf_ingresoContrasenia.getText();

        if ("Admin".equals(usuario) && "123".equals(contrasenia)) {
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
    */
    public void volverAInicio() {
        try {
            // Cargar el archivo FXML de InicioViewController
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuInicio.fxml"));
            Parent root = loader.load();

            // Obtener el Stage actual
            Stage currentStage = (Stage) (btn_VolverMenuIncio).getScene().getWindow();

            // Configurar la nueva escena
            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error en caso de que el archivo FXML no se cargue
        }
    }


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

