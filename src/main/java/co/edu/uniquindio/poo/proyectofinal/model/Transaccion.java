package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.HashMap;
import java.util.Map;

public class Transaccion {

    private String idTransaccion;
    private String fecha;
    private double monto;
    private Vehiculo vehiculo;
    private TipoTransaccion tipoTransaccion;
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
    public Transaccion(String idTransaccion, String fecha, double monto, Vehiculo vehiculo, TipoTransaccion tipoTransaccion, Cliente cliente) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.tipoTransaccion = tipoTransaccion;
        this.cliente = cliente;
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
        return monto;
    }

    /**
     * Metodo que establece el monto de una transaccion
     * @param monto
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * Metodo que obtiene un vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo que establece un vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo que obtiene tipo de transaccion
     * @return
     */
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Metodo que establece tipo de transaccion
     * @param tipoTransaccion
     */
    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
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
}
