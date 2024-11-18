package co.edu.uniquindio.poo.proyectofinal.model;


import java.util.Collection;

public class Administrador extends Persona {

    private double salario;
    private String contrasenia;
    private String idAdministrador;
    private String username;


    /**
     * Metodo de la clase hija Administrador que hereda de la clase padre  Persona
     *
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param salario
     * @param contrasenia
     * @param idAdministrador
     * @param username
     */
    public Administrador(String nombre, String cedula, String telefono, String direccion, double salario, String contrasenia, String idAdministrador, String username) {
        super(nombre, cedula, telefono, direccion);
        this.salario = salario;
        this.contrasenia = contrasenia;
        this.idAdministrador = idAdministrador;
        this.username = username;
    }

    public Administrador() {
    }

    /**
     * Metodo que obtiene el salario del Administrador
     * @return
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Metodo que establece el salario del administrador
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Metodo que obtiene la contraseña del administrador
     * @return
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Metodo que establece la contraseña del administrador
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo que obtiene el id del administrador
     * @return
     */
    public String getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * Metodo que establece el id del administrador
     * @param idAdministrador
     */
    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    /**
     * Metodo que obtiene el username del administrador
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que establece el username del administrador
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
