package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

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
    private TableView<?> tb_VerEmpleado;

    @FXML
    private TableColumn<?, ?> tbc_IDEmpleado;

    @FXML
    private TableColumn<?, ?> tbc_NombreEmpleado;

    @FXML
    private TableColumn<?, ?> tcb_CorreoEmpleado;

    @FXML
    private TableColumn<?, ?> tcb_TelefonoEmpleado;

    @FXML
    void onClick_Volver(ActionEvent event) {

    }

    @FXML
    void initialize() {
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
