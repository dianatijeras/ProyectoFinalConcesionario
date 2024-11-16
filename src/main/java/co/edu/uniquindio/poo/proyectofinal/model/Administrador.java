package co.edu.uniquindio.poo.proyectofinal.model;


public class Administrador extends Empleado{

    private String fechaIngreso;

    /**
     * Metodo de la clase hija Administrador
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param salario
     * @param contrasenia
     * @param idEmpleado
     * @param username
     * @param vehiculo
     * @param fechaIngreso
     */
    public Administrador(String nombre, String cedula, String telefono, String direccion, String cargo, double salario, String contrasenia, String idEmpleado, String username, Vehiculo vehiculo, String fechaIngreso) {
        super(nombre, cedula, telefono, direccion, salario, contrasenia, idEmpleado, username, vehiculo);
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Metodo que obtiene la fecha de ingreso del administrador
     * @return
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Metodo que establece la fecha de ingreso del administrador
     * @param fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
