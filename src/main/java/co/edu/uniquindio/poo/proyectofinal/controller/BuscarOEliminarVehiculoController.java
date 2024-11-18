package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.HelloApplication;
import co.edu.uniquindio.poo.proyectofinal.model.ICrudVehiculo;
import co.edu.uniquindio.poo.proyectofinal.model.Vehiculo;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class BuscarOEliminarVehiculoController implements ICrudVehiculo {
    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public void eliminarVehiculo(String placa) {
        HelloApplication.getVehiculos().forEach(e -> {
            if (e.getPlaca().equals(placa)) {
                HelloApplication.getVehiculos().remove(e);
                JOptionPane.showMessageDialog(null, "Vehiculo eliminado exitosamente");
            }
        });
    }

    @Override
    public Vehiculo buscarVehiculo(String placa) {
        AtomicBoolean existe = new AtomicBoolean(false);
        AtomicReference<Vehiculo> vehiculo = new AtomicReference<>();

        HelloApplication.getVehiculos().forEach(e -> {
            if (e.getPlaca().equals(placa)) {
                vehiculo.set(e);
                existe.set(true);
            }
        });

        if(!existe.get()){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el Vehiculo");
        }

        return vehiculo.get();
    }
}
