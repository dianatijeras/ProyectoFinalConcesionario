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
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

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
    private Label lbl_IdEmpleado;

    @FXML
    private Label lbl_Empleado;

    @FXML
    private Pane pn_MenuCliente2;

    @FXML
    private Separator sp_Titulo;

    @FXML
    private TextField txf_IdEmpleado;

    @FXML
    void onClick_BuscarEmpleado(ActionEvent event) {
       String id = txf_IdEmpleado.getText();
       boolean existe = false;
        System.out.println(id);

       for(Persona persona: HelloApplication.getEmpleados()){
           if(persona instanceof Empleado){
               if(((Empleado) persona).getIdEmpleado().equals(id)){
                   existe = true;
                   JOptionPane.showMessageDialog(null, "Se ha encontrado el empleado" + persona.toString());
               }
           }
       }

       if(!existe){
           JOptionPane.showMessageDialog(null, "No se ha encontrado el empleado");
       }
    }

    @FXML
    void onClick_EliminarEmpleado(ActionEvent event) {
        String id = txf_IdEmpleado.getText();

        for(Persona persona: HelloApplication.getEmpleados()){
            if(persona instanceof Empleado){
                if(((Empleado) persona).getIdEmpleado().equals(id)){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el Empleado");
                    HelloApplication.getEmpleados().remove(persona);
                }
            }
        }
    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAInicio();

    }
    public void volverAInicio() {
        try {
            // Cargar el archivo FXML de InicioViewController
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuEmpleadoAdministrador.fxml"));
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
        assert btn_BuscarEmpleado != null : "fx:id=\"btn_BuscarEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert btn_EliminarEmpleado != null : "fx:id=\"btn_EliminarEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert btn_Volver != null : "fx:id=\"btn_Volver\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert lbl_IdEmpleado != null : "fx:id=\"lbl_CedulaEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert lbl_Empleado != null : "fx:id=\"lbl_Empleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert pn_MenuCliente2 != null : "fx:id=\"pn_MenuCliente2\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert sp_Titulo != null : "fx:id=\"sp_Titulo\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";
        assert txf_IdEmpleado != null : "fx:id=\"txf_CedulaEmpleado\" was not injected: check your FXML file 'MenuBuscarOEliminarEmpleadoAdministrador.fxml'.";

    }

}
