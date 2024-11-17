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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_CerrarSesionEmpleado;

    @FXML
    private Button btn_Cliente;

    @FXML
    private Button btn_Transaccion;

    @FXML
    private Button btn_Vehiculo;

    @FXML
    private Label lbl_TituloEmpleado;

    @FXML
    private Pane pn_MenuEmpleado;

    @FXML
    private Separator sp_separacionCerrarSesionEmpleado;

    @FXML
    private Separator sp_separacionTitulo;

    @FXML
    void onClick_CerrarSesionEmpleado(ActionEvent event) {
    }

    @FXML
    void onClick_Transaccion(ActionEvent event) {


    }

    @FXML
    void onClick_cliente(ActionEvent event) {
    }

    @FXML
    void onClick_vehiculo(ActionEvent event) {

    }
    @FXML
    private void cambiarVentana(ActionEvent event) {
        try {
            // Carga la nueva vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuCliente.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);

            Stage currentStage = (Stage) (btn_Cliente).getScene().getWindow();
            currentStage.close();

            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /**
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
      */
    @FXML
    void initialize() {
        assert btn_CerrarSesionEmpleado != null : "fx:id=\"btn_CerrarSesionEmpleado\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert btn_Cliente != null : "fx:id=\"btn_Cliente\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert btn_Transaccion != null : "fx:id=\"btn_Transaccion\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert btn_Vehiculo != null : "fx:id=\"btn_Vehiculo\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert lbl_TituloEmpleado != null : "fx:id=\"lbl_TituloEmpleado\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert pn_MenuEmpleado != null : "fx:id=\"pn_MenuEmpleado\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert sp_separacionCerrarSesionEmpleado != null : "fx:id=\"sp_separacionCerrarSesionEmpleado\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";
        assert sp_separacionTitulo != null : "fx:id=\"sp_separacionTitulo\" was not injected: check your FXML file 'MenuEmpleado.fxml'.";

    }

}