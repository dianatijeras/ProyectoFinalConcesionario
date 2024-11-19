package co.edu.uniquindio.poo.proyectofinal.model;

import javafx.beans.property.*;

import java.util.HashMap;
import java.util.Map;

public class Transaccion {

    private String idTransaccion;
    private StringProperty empleado;
    private String fecha;
    private DoubleProperty monto;
    private ObjectProperty<Vehiculo> vehiculo;
    private ObjectProperty<TipoTransaccion> tipoTransaccion;
    private Cliente cliente;


    private static final Map<Class<? extends Vehiculo>, Double> MONTOS_BASE = new HashMap<>();

    static {
        MONTOS_BASE.put(BusCombustible.class, 7000.0);
    }

    /**
     * Constructor de la clase Transaccion
     * @param idTransaccion
     * @param fecha
     * @param monto
     * @param vehiculo
     * @param tipoTransaccion
     * @param cliente
     */
    public Transaccion(String idTransaccion, String empleado, String fecha, double monto, Vehiculo vehiculo, TipoTransaccion tipoTransaccion, Cliente cliente) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.monto = new SimpleDoubleProperty(monto);
        this.vehiculo = new SimpleObjectProperty<>(vehiculo);
        this.tipoTransaccion = new SimpleObjectProperty<>(tipoTransaccion);
        this.cliente = cliente;
        this.empleado = new SimpleStringProperty(empleado);
    }

    public Transaccion() {
        this.monto = new SimpleDoubleProperty(0.0);
        this.vehiculo = new SimpleObjectProperty<>(null);
        this.tipoTransaccion = new SimpleObjectProperty<>(null);
        this.empleado = new SimpleStringProperty("");
    }

    public DoubleProperty montoProperty() {
        return monto;
    }

    public ObjectProperty<TipoTransaccion> tipoTransaccionProperty() {
        return tipoTransaccion;
    }

    public StringProperty empleadoProperty() {
        return empleado;
    }

    public StringProperty vehiculoProperty() {return vehiculo.get().placaProperty();}

    public String getEmpleado() {
        return empleado.get();
    }

    public void setEmpleado(String empleado) {
        this.empleado.set(empleado);
    }

    /**
     * Metodo que obtiene el id de una transaccion
     * @return
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Metodo que establece el id de una transaccion
     * @param idTransaccion
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * Metodo que obtiene la fecha de una transaccion
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo que establece la fecha de una transaccion
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo que obtiene el monto de una transaccion
     * @return
     */
    public double getMonto() {
        return monto.get();
    }

    /**
     * Metodo que establece el monto de una transaccion
     * @param monto
     */
    public void setMonto(double monto) {
        this.monto.set(monto);
    }

    /**
     * Metodo que obtiene un vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo.get();
    }

    /**
     * Metodo que establece un vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo.set(vehiculo);
    }

    /**
     * Metodo que obtiene tipo de transaccion
     * @return
     */
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion.get();
    }

    /**
     * Metodo que establece tipo de transaccion
     * @param tipoTransaccion
     */
    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion.set(tipoTransaccion);
    }

    /**
     * Metodo que obtiene un cliente
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }


    /**
     * Metodo que establece un cliente
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", empleado=" + empleado +
                ", fecha='" + fecha + '\'' +
                ", monto=" + monto +
                ", vehiculo=" + vehiculo +
                ", tipoTransaccion=" + tipoTransaccion +
                ", cliente=" + cliente +
                '}';
    }
}
