package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.Collection;
import java.util.LinkedList;

public class Cliente extends Persona{

    private String email;
    private Transaccion transaccion;
    private Vehiculo vehiculo;
    private Collection<Transaccion> listaTransacciones;
    private Collection<Vehiculo> listaVehiculos;

    /**
     * Constructor de la clase hija Cliente
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param email
     * @param transaccion
     * @param vehiculo
     */
    public Cliente(String nombre, String cedula, String telefono, String direccion, String email, Transaccion transaccion, Vehiculo vehiculo) {
        super(nombre, cedula, telefono, direccion);
        this.email = email;
        this.transaccion = transaccion;
        this.vehiculo = vehiculo;
        this.listaTransacciones = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
    }

    /**
     * Metodo que obtiene el email de un cliente
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que establece el email de un cliente
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene una transaccion
     * @return
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * Metodo que establece una transaccion
     * @param transaccion
     */
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
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
     * Metodo que obtiene una lista de transacciones de un cliente
     * @return
     */
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    /**
     * Metodo que establece una lista de transacciones de un cliente
     * @param listaTransacciones
     */
    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    /**
     * Metodo que obtiene una lista de vehiculos de un cliente
     * @return
     */
    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Metodo que establece una lista de vehiculos de un cliente
     * @param listaVehiculos
     */
    public void setListaVehiculos(Collection<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
