package co.edu.uniquindio.poo.proyectofinal.model;

public class VehiculoElectrico extends Vehiculo{

    private int autonomiaCargaCompleta;
    private int tiempoCargaPromedio;

    /**
     * Constructor de la clase VehiculoElectrico
     * @param marca
     * @param placa
     * @param modelo
     * @param cambios
     * @param cilindraje
     * @param velocidadMax
     * @param estado
     * @param tipoTransmicion
     * @param tipoCombustible
     * @param autonomiaCargaCompleta
     * @param tiempoCargaPromedio
     */
    public VehiculoElectrico(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int autonomiaCargaCompleta, int tiempoCargaPromedio) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible);
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoCargaPromedio = tiempoCargaPromedio;
    }

    /**
     * Metodo que obtiene la autonomia de carga completa de un vehiculo electrico
     * @return
     */
    public int getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }

    /**
     * Metodo que establece la autonomia de carga completa de un vehiculo electrico
     * @param autonomiaCargaCompleta
     */
    public void setAutonomiaCargaCompleta(int autonomiaCargaCompleta) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
    }

    /**
     * Metodo que obtiene el tiempo de carga de un vehiculo electrico
     * @return
     */
    public int getTiempoCargaPromedio() {
        return tiempoCargaPromedio;
    }

    /**
     * Metodo que establece el tiempo de carga de un vehiculo electrico
     * @param tiempoCargaPromedio
     */
    public void setTiempoCargaPromedio(int tiempoCargaPromedio) {
        this.tiempoCargaPromedio = tiempoCargaPromedio;
    }
}
