package co.edu.uniquindio.poo.proyectofinal.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {

    private StringProperty nombre;
    private String cedula;
    private StringProperty telefono;
    private StringProperty direccion;

    /**
     * Constructor de la clase padre Persona
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     */
    public Persona(String nombre, String cedula, String telefono, String direccion) {
        this.nombre = new SimpleStringProperty(nombre);
        this.cedula = cedula;
        this.telefono = new SimpleStringProperty(telefono);
        this.direccion = new SimpleStringProperty(direccion);
    }

    public Persona() {
        this.nombre = new SimpleStringProperty("");
        this.telefono = new SimpleStringProperty("");
        this.direccion = new SimpleStringProperty("");
    }

    /**
     * Metodo que obtiene el nombre de una persona
     * @return
     */
    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de una persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    /**
     * Metodo que obtiene la cedula de una persona
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo que establece la cedula de una persona
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo que obtiene el telefono de una persona
     * @return
     */
    public String getTelefono() {
        return telefono.get();
    }

    /**
     * Metodo que establece el telefono de una persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    /**
     * Metodo que obtiene la direccion de una persona
     * @return
     */
    public String getDireccion() {
        return direccion.get();
    }

    /**
     * Metodo que establece la direccion de una persona
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public StringProperty direccionProperty() {
        return direccion;
    }
}
