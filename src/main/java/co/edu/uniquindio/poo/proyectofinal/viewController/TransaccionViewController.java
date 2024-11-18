package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.TipoCombustible;
import co.edu.uniquindio.poo.proyectofinal.model.TipoTransaccion;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class TransaccionViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_BuscarTransaccion;

    @FXML
    private Button btn_RealizarTransaccion;

    @FXML
    private Button btn_Volver;

    @FXML
    private ComboBox<TipoTransaccion> cb_TipoTransaccion;

    @FXML
    private ComboBox<Vehiculo> cb_Vehiculo;

    @FXML
    private Label lbl_ClienteTransaccion;

    @FXML
    private Label lbl_FechaTransaccion;

    @FXML
    private Label lbl_IDTransaccion;

    @FXML
    private Label lbl_Monto;

    @FXML
    private Label lbl_Transaccion;

    @FXML
    private Label lbl_VehiculoTransaccion;

    @FXML
    private Label lbl_tipoTransaccion;

    @FXML
    private Label lbl_diasAlquiler;

    @FXML
    private Pane pn_menuTransaccion;

    @FXML
    private Separator sp_botones;

    @FXML
    private Separator sp_separacionTitulo;

    @FXML
    private TextField txf_ClienteTransaccion;

    @FXML
    private TextField txf_FechaTransaccion;

    @FXML
    private TextField txf_IDTransaccion;

    @FXML
    private TextField txf_VehiculoTransaccion;

    @FXML
    private TextField txf_diasAlquiler;

    @FXML
    private Label txf_monto;

    private DoubleProperty monto;

    private double baseDias = 0;

    public double getMonto() {
        return monto.get();
    }

    public DoubleProperty montoProperty() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto.set(monto);
    }

    @FXML
    void OnMousePressed_ClienteTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_FechaTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_IDTransaccion(ActionEvent event) {

    }

    @FXML
    void OnMousePressed_VehiculoTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_BuscarTransaccion(ActionEvent event) {
        buscarTransaccion();

    }

    @FXML
    void onClick_RealizarTransaccion(ActionEvent event) {
        TipoTransaccion tipo = cb_TipoTransaccion.getValue();
        if(tipo != null){
            switch (tipo){
                case VENTA:
                    realizarVenta();
                    break;
                case ALQUILER:
                    realizarAlquiler();
                case COMPRA:
                    realizarCompra();
                    break;
            }
        } else {
            System.out.println("Selecciones un tipo de transaccion");
        }

    }

    private void realizarVenta(){
        System.out.println("Realizando venta..");

    }

    private void realizarCompra(){
        System.out.println("Realizando compra..");
    }

    private void realizarAlquiler(){
        System.out.println("Realizando alquiler..");
    }


    @FXML
    void onClick_TipoTransaccion(ActionEvent event) {

    }

    @FXML
    void onClick_Volver(ActionEvent event) {
        volverAVentanaAnterior();

    }
    public void volverAVentanaAnterior() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuEmpleado.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) (btn_Volver).getScene().getWindow();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void buscarTransaccion() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/MenuBuscarTransaccion.fxml"));
            Parent root = loader.load();


            Stage currentStage = (Stage) (btn_BuscarTransaccion).getScene().getWindow();


            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @FXML
    void initialize() {

        monto = new SimpleDoubleProperty(0);
        cb_TipoTransaccion.getItems().addAll(TipoTransaccion.values());
        cb_Vehiculo.setConverter(new StringConverter<Vehiculo>() {
            @Override
            public String toString(Vehiculo vehiculo) {
                if (vehiculo == null) {
                    return "Vehículo no disponible";
                }
                // Utilizar valores predeterminados si alguna propiedad es nula
                String marca = vehiculo.getMarca() != null ? vehiculo.getMarca() : "Sin marca";
                String placa = vehiculo.getPlaca() != null ? vehiculo.getPlaca() : "Sin placa";
                TipoCombustible tipo = vehiculo.getTipoCombustible();
                return marca + " - " + placa + " - " + tipo;
            }

            @Override
            public Vehiculo fromString(String string) {
                return null; // No es necesario implementar para este caso
            }
        });

        // Añadir la lista de vehículos al ComboBox
        cb_Vehiculo.getItems().addAll(HelloApplication.getVehiculos());

        // Listener para actualizar el texto del Label cuando cambie el valor de 'monto'
        monto.addListener((observable, oldValue, newValue) -> {
            txf_monto.setText(String.format("Monto: %.2f", newValue.doubleValue()));
        });

        cb_TipoTransaccion.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) return;

            switch (newValue) {
                case ALQUILER -> {
                    txf_diasAlquiler.setVisible(true);
                    lbl_diasAlquiler.setVisible(true);
                    System.out.println("Modo ALQUILER seleccionado. Configurando campos...");
                }
                case VENTA -> {
                    txf_diasAlquiler.setVisible(false);
                    lbl_diasAlquiler.setVisible(false);
                    System.out.println("Modo VENTA seleccionado.");
                }
                case COMPRA -> {
                    txf_diasAlquiler.setVisible(false);
                    lbl_diasAlquiler.setVisible(false);
                    System.out.println("Modo COMPRA seleccionado.");
                }
                default -> {
                    txf_diasAlquiler.setVisible(false);
                    lbl_diasAlquiler.setVisible(false);
                    System.out.println("Otro tipo de transacción.");
                }
            }
        });

        // Listener para el TextField de días de alquiler
        txf_diasAlquiler.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                // Calcular el monto base solo para los días
                double diasAlquiler = Double.parseDouble(newValue);
                baseDias = 7000.0 * diasAlquiler;

                // Actualizar el monto total basado en otros factores (vehículo, etc.)
                actualizarMonto();
            } catch (NumberFormatException e) {
                baseDias = 0.0; // Si el texto no es válido, restablecer base a 0
                actualizarMonto();
            }
        });

        // Listener para el ComboBox de vehículos
        cb_Vehiculo.valueProperty().addListener((observable, oldValue, newValue) -> {
            actualizarMonto(); // Recalcular monto total cuando cambia el vehículo
        });

        // Inicialización adicional, si es necesaria
    }

    private void actualizarMonto() {
        // Obtener el vehículo seleccionado, si lo hay
        Vehiculo vehiculo = cb_Vehiculo.getSelectionModel().getSelectedItem();
        double extraCombustible = 0.0;

        // Verificar si el vehículo tiene un cargo adicional por combustible
        if (vehiculo != null && "DIESEL".equals(vehiculo.getTipoCombustible().name())) {
            extraCombustible = 3000.0;
        }

        // Calcular el monto total basado en días y otros factores
        double total = baseDias + extraCombustible;
        monto.set(total); // Actualizar la propiedad de monto
    }

}



