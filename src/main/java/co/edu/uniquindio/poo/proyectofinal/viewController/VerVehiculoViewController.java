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

public class VerVehiculoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Volver;

    @FXML
    private Label lbl_VerVehiculos;

    @FXML
    private Pane pn_MenuVerVehiculos;

    @FXML
    private Separator sp_titulo;

    @FXML
    private TableView<?> tb_VerVehiculo;

    @FXML
    private TableColumn<?, ?> tbc_MarcaVehiculo;

    @FXML
    private TableColumn<?, ?> tbc_PlacaVehiculo;

    @FXML
    void onClick_Volver(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert lbl_VerVehiculos != null : "fx:id=\"lbl_VerVehiculos\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert pn_MenuVerVehiculos != null : "fx:id=\"pn_MenuVerVehiculos\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert sp_titulo != null : "fx:id=\"sp_titulo\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tb_VerVehiculo != null : "fx:id=\"tb_VerVehiculo\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tbc_MarcaVehiculo != null : "fx:id=\"tbc_MarcaVehiculo\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";
        assert tbc_PlacaVehiculo != null : "fx:id=\"tbc_PlacaVehiculo\" was not injected: check your FXML file 'MenuVerVehiculos.fxml'.";

    }

}
