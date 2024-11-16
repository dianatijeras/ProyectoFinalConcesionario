package co.edu.uniquindio.poo.proyectofinal.model;

public interface ICrudEmpleado {


    /**
     * Metodo que implementa la clase Concesionario que registra a un empleado
     */
    public void registrarEmpleado(Empleado empleado);


    /**
     * Metodo que implementa la clase Concesionario que busca a un empleado
     */
    public void buscarEmpleado(String cedula);


    /**
     * Metodo que implementa la clase Concesionario que elimina a un empleado
     */
    public void eliminarEmpleado(String cedula);
}
