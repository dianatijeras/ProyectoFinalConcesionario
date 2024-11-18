package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VerEmpleadosViewController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_VerEmpleados;

    @FXML
    private Pane pn_MenuVerEmpleados;

    @FXML
    private Separator sp_titulo;

    @FXML
    private TableView<Empleado> tb_VerEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbc_IDEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbc_NombreEmpleado;

    @FXML
    private TableColumn<Empleado, String> tcb_CorreoEmpleado;

    @FXML
    private TableColumn<Empleado, String> tcb_TelefonoEmpleado;

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAAdministrador();

    }
    public void volverAAdministrador() {
        try {
            // Cargar el archivo FXML de InicioViewController
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuAdministrador.fxml"));
            Parent root = loader.load();

            // Obtener el Stage actual
            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();

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
        tbc_IDEmpleado.setCellValueFactory(cellData -> cellData.getValue().idEmpleadoProperty());
        tbc_NombreEmpleado.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        tcb_CorreoEmpleado.setCellValueFactory(cellData -> cellData.getValue().direccionProperty());
        tcb_TelefonoEmpleado.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
        tb_VerEmpleado.getItems().setAll(HelloApplication.getEmpleados().stream()
                .filter(e -> e instanceof Empleado)
                .map(e -> (Empleado) e)
                .toList());

        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert lbl_VerEmpleados != null : "fx:id=\"lbl_VerEmpleados\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert pn_MenuVerEmpleados != null : "fx:id=\"pn_MenuVerEmpleados\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert sp_titulo != null : "fx:id=\"sp_titulo\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tb_VerEmpleado != null : "fx:id=\"tb_VerEmpleado\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tbc_IDEmpleado != null : "fx:id=\"tbc_IDEmpleado\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tbc_NombreEmpleado != null : "fx:id=\"tbc_NombreEmpleado\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tcb_CorreoEmpleado != null : "fx:id=\"tcb_CorreoEmpleado\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tcb_TelefonoEmpleado != null : "fx:id=\"tcb_TelefonoEmpleado\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";

    }

}
