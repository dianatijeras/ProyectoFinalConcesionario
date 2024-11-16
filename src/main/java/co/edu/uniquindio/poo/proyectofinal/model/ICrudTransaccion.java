package co.edu.uniquindio.poo.proyectofinal.model;

public interface ICrudTransaccion {


    /**
     * Metodo que implementa la clase Concesionario que crea una transaccion
     */
    public void crearTransaccion(Transaccion transaccion);


    /**
     * Metodo que implementa la clase Concesionario que muestra el registro de transaciones
     */
    public void registroTransacciones();


    /**
     * Metodo que implementa la clase concesionario que busca una transaccion
     */
    public void buscarTransaccion(String idTransaccion);
}
