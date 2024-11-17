package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.model.Transaccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    public class TransaccionController {
        private List<Transaccion> listaTransacciones;

        public TransaccionController() {
            this.listaTransacciones = new ArrayList<>();
        }

        public void registrarTransaccion(Transaccion transaccion) {
            listaTransacciones.add(transaccion);
        }

        public Optional<Transaccion> buscarTransaccion(String id) {
            return listaTransacciones.stream().filter(t -> t.getIdTransaccion().equals(t.getIdTransaccion())).findFirst();
        }

        public List<Transaccion> obtenerTransacciones() {
            return new ArrayList<>(listaTransacciones);
        }
    }


