package co.edu.uniquindio.poo.proyectofinal.model;

public class VehiculoCombustible extends Vehiculo{

    private int capacidadTanque;

    /**
     * Constructor de la clase vehiculo combustible
     * @param marca
     * @param placa
     * @param modelo
     * @param cambios
     * @param cilindraje
     * @param velocidadMax
     * @param estado
     * @param tipoTransmicion
     * @param tipoCombustible
     * @param capacidadTanque
     */
    public VehiculoCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int capacidadTanque) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible);
        this.capacidadTanque = capacidadTanque;
    }

    public VehiculoCombustible() {
    }

    /**
     * Metodo que obtiene la capacidad del tanque de un vehiculo a combustible
     * @return
     */
    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    /**
     * Metodo que establece la capacidad de tanque de un vehiculo a combustible
     * @param capacidadTanque
     */
    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
}
