package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class BuscarOEliminarEmpleadoAdministrador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarEmpleado;

    @FXML
    private Button btn_EliminarEmpleado;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_CedulaEmpleado;

    @FXML
    private Label lbl_Empleado;

    @FXML
    private Pane pn_MenuCliente2;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TextField txf_CedulaEmpleado;

    @FXML
    void onClick_BuscarEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_EliminarEmpleado(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_BuscarEmpleado != null : "fx:id=\"btn_BuscarEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert btn_EliminarEmpleado != null : "fx:id=\"btn_EliminarEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert lbl_CedulaEmpleado != null : "fx:id=\"lbl_CedulaEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert lbl_Empleado != null : "fx:id=\"lbl_Empleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert pn_MenuCliente2 != null : "fx:id=\"pn_MenuCliente2\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert txf_CedulaEmpleado != null : "fx:id=\"txf_CedulaEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";

    }

}
