package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.Concesionario;
import co.edu.uniquindio.poo.proyectofinal.model.ICrudVehiculo;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;



public class VehiculoController implements ICrudVehiculo {
    private Concesionario concesionario;



    public VehiculoController() {


    }


    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public void eliminarVehiculo(String placa) {

    }

    @Override
    public Vehiculo buscarVehiculo(String placa) {
        return null;
    }

    public void agregar(Vehiculo vehiculo){
        if (vehiculo == null) throw new NullPointerException("Vehiculo no puede ser nulo");
        HelloApplication.getVehiculos().add(vehiculo);
    }



}
