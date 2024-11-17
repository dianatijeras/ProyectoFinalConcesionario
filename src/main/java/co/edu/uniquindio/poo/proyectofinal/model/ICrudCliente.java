package co.edu.uniquindio.poo.proyectofinal.model;

public interface ICrudCliente {


    /**
     * Metodo que implementa la clase Concesionario que registra a un cliente
     */
    public void registrarCliente(Cliente cliente);


    /**
     * Metodo que implementa la clase Concesionario que busca a un cliente
     *
     * @return
     */
    public Cliente buscarCliente(String cedula);


    /**
     * Metodo que implementa la clase Concesionario que elimina a un cliente
     */
    public void eliminarCliente(String cedula);
}
