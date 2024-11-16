package co.edu.uniquindio.poo.proyectofinal.model;

public class Persona {

    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;

    /**
     * Constructor de la clase padre Persona
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     */
    public Persona(String nombre, String cedula, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Metodo que obtiene el nombre de una persona
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de una persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return telefono;
    }

    /**
     * Metodo que establece el telefono de una persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que obtiene la direccion de una persona
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que establece la direccion de una persona
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
