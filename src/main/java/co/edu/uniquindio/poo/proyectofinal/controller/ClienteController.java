package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.model.Cliente;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;

public class ClienteController {

    private Concesionario concesionario;

    public ClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public boolean registrarCliente(String nombre, String cedula, String telefono, String direccion, String email) {
        Cliente nuevoCliente = new Cliente(nombre, cedula, telefono, direccion, email, null);
        if (concesionario.getListaClientes().stream().anyMatch(c -> c.getCedula().equals(cedula))) {
            return false; // Cliente ya existe
        }
        concesionario.registrarCliente(nuevoCliente);
        return true;
    }

    public Cliente buscarCliente(String cedula) {
        return concesionario.getListaClientes().stream()
                .filter(cliente -> cliente.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarCliente(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
            concesionario.getListaClientes().remove(cliente);
            return true;
        }
        return false;
    }
}