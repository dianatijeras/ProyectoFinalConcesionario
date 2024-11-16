package co.edu.uniquindio.poo.proyectofinal.model;

public interface ICrudVehiculo {

    /**
     * Metodo que implementa la clase Concesionario que registra un vehiculo
     */
    public void registrarVehiculo(Vehiculo vehiculo);


    /**
     * Metodo que implementa la clase Concesionario que elimina un vehiculo
     */
    public void eliminarVehiculo(String placa);


    /**
     * Metodo que implementa la clase Concesionario que busca un vehiculo por su tipo
     */
    public void buscarVehiculoPorTipo();


    /**
     * Metodo que implementa la clase Concesionario que muestra los vehiculos disponibles
     */
    public void vehiculosDisponibles();
}
