package co.edu.uniquindio.poo.proyectofinal.viewController;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InicioViewController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_botonIngresarEmpleado;

    @FXML
    private Button btn_ingresarAdministrador;

    @FXML
    private ImageView img_logoUQ;

    @FXML
    private Label lbl_subtituloMenuInicio;

    @FXML
    private Label lbl_tituloMenuInicio;

    @FXML
    private Pane pn_PantallaInicio;

    @FXML
    private Separator sp_separacionMenuInicio;

    @FXML
    void onClickIngresarAdministrador(ActionEvent event) {
        cambiarVentana("MenuInicioSesionEmpleado.fxml");
    }

    @FXML
    void onClickIngresarEmpleado(ActionEvent event) {
        cambiarVentana("MenuInicioSesionAdministrador.fxml");

    }

    @FXML private void cambiarVentana(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) pn_PantallaInicio.getScene().getWindow();
            Scene scene = new Scene(root); stage.setScene(scene);
            stage.show();
        } catch (IOException e)
        { e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert btn_botonIngresarEmpleado != null : "fx:id=\"btn_botonIngresarEmpleado\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert btn_ingresarAdministrador != null : "fx:id=\"btn_ingresarAdministrador\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert img_logoUQ != null : "fx:id=\"img_logoUQ\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert lbl_subtituloMenuInicio != null : "fx:id=\"lbl_subtituloMenuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert lbl_tituloMenuInicio != null : "fx:id=\"lbl_tituloMenuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert pn_PantallaInicio != null : "fx:id=\"pn_PantallaInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert sp_separacionMenuInicio != null : "fx:id=\"sp_separacionMenuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";

    }

}
