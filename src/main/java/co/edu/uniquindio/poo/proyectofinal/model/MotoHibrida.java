package co.edu.uniquindio.poo.proyectofinal.model;

public class MotoHibrida extends VehiculoHibrido implements ICalcularCostoTotal{

    private String anioFabricacion;

    /**
     * Constructor de la clase hija motoHibrida que hereda de la clase padre vehiculoHibrido
     * @param marca
     * @param placa
     * @param modelo
     * @param cambios
     * @param cilindraje
     * @param velocidadMax
     * @param estado
     * @param tipoTransmicion
     * @param tipoCombustible
     * @param esEnchufable
     * @param esHibridoLiguero
     * @param anioFabricacion
     */
    public MotoHibrida(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, boolean esEnchufable, boolean esHibridoLiguero, String anioFabricacion) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, esEnchufable, esHibridoLiguero);
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
