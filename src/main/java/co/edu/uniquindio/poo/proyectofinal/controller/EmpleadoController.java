package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
import javafx.stage.Stage;

public class EmpleadoController {
    private Stage stageActual;

    public void abrirMenuCliente(Stage stageActual) {
        cambiarVentana(stageActual, "/co/edu/uniquindio/poo/proyectofinal/MenuCliente.fxml");
    }

    public void abrirMenuTransaccion(Stage stageActual) {
        cambiarVentana(stageActual, "/co/edu/uniquindio/poo/proyectofinal/MenuTransaccion.fxml");
    }

    public void abrirMenuVehiculo(Stage stageActual) {
        cambiarVentana(stageActual, "/co/edu/uniquindio/poo/proyectofinal/MenuVehiculo.fxml");
    }

    public void volverAInicio(Stage stageActual) {
        cambiarVentana(stageActual, "/co/edu/uniquindio/poo/proyectofinal/MenuInicio.fxml");
    }

    private void cambiarVentana(Stage stageActual, String rutaFXML) {
        try {
            FXML.Loader loader = new FXML.Loader(getClass().getResource(rutaFXML));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            stageActual.close();
            Stage nuevoStage = new Stage();
            nuevoStage.setScene(scene);
            nuevoStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlertaError("No se pudo cargar la ventana solicitada");
        }
    }

    private void mostrarAlertaError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}


}
