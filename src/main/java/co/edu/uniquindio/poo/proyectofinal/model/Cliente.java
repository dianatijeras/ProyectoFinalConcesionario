package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.Collection;
import java.util.LinkedList;

public class Cliente extends Persona{

    private String email;
    private Transaccion transaccion;
    private Vehiculo vehiculo;
    private Collection<Vehiculo> listaVehiculos;

    /**
     * Constructor de la clase hija Cliente
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param email
     * @param vehiculo
     */
    public Cliente(String nombre, String cedula, String telefono, String direccion, String email,  Vehiculo vehiculo) {
        super(nombre, cedula, telefono, direccion);
        this.email = email;
        this.vehiculo = vehiculo;
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
