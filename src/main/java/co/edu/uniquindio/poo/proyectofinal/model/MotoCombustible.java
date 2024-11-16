package co.edu.uniquindio.poo.proyectofinal.model;

public class MotoCombustible extends VehiculoCombustible implements ICalcularCostoTotal{

    private String anioFabricacion;

    /**
     * Constructor de la clase hija motoCombustible que hereda de la clase padre vehiculoCombustible
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
     * @param anioFabricacion
     */
    public MotoCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int capacidadTanque, String anioFabricacion) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, capacidadTanque);
        this.anioFabricacion = anioFabricacion;
    }

    /**
     * Metodo que obtiene el año de fabricacion de una moto
     * @return
     */
    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    /**
     * Metodo que establece el año de fabricacion de una moto
     * @param anioFabricacion
     */
    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
