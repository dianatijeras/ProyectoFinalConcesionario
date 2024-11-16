package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Persona{

    private String cargo;
    private double salario;
    private String contrasenia;
    private String idEmpleado;
    private String username;
    private Vehiculo vehiculo;
    private Collection<Vehiculo> listaRegistrosVehiculos;

    /**
     * Constructor de la clase Empleado
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param cargo
     * @param salario
     * @param contrasenia
     * @param idEmpleado
     * @param username
     * @param vehiculo
     */
    public Empleado(String nombre, String cedula, String telefono, String direccion, String cargo, double salario, String contrasenia, String idEmpleado, String username, Vehiculo vehiculo) {
        super(nombre, cedula, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.contrasenia = contrasenia;
        this.idEmpleado = idEmpleado;
        this.username = username;
        this.vehiculo = vehiculo;
        this.listaRegistrosVehiculos = new LinkedList<>();
    }

    /**
     * Metodo que obtiene el cargo de un empleado
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Metodo que establece el cargo de un empleado
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Metodo que obtiene el salario de un empleado
     * @return
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Metodo que establece el salario de un empleado
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Metodo que obtiene la contraseña de un empleado
     * @return
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Metodo que establece la contraseña de un empleado
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo que obtiene el id de un empleado
     * @return
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Metodo que establece el id de un empleado
     * @param idEmpleado
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Metodo que obtiene el username de un empleado
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que establece el username de un empleado
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Metodo que obtiene el vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo que establece el vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo que obtiene la lista de registros de vehiculos de un empleado
     * @return
     */
    public Collection<Vehiculo> getListaRegistrosVehiculos() {
        return listaRegistrosVehiculos;
    }

    /**
     * Metodo que establece la lista de registros de vehiculos de un empleado
     * @param listaRegistrosVehiculos
     */
    public void setListaRegistrosVehiculos(Collection<Vehiculo> listaRegistrosVehiculos) {
        this.listaRegistrosVehiculos = listaRegistrosVehiculos;
    }
}
