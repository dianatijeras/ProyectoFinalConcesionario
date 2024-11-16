package co.edu.uniquindio.poo.proyectofinal.model;

public class VehiculoHibrido extends Vehiculo{

    private boolean esEnchufable;
    private boolean esHibridoLiguero;

    /**
     * Constructor de la clase vehiculo hibrido
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
     */
    public VehiculoHibrido(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, boolean esEnchufable, boolean esHibridoLiguero) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible);
        this.esEnchufable = esEnchufable;
        this.esHibridoLiguero = esHibridoLiguero;
    }

    /**
     * Metodo que obtiene si es enchufable un vehiculo hibrido
     * @return
     */
    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    /**
     * Metodo que establece si es enchufable un vehiculo hibrido
     * @param esEnchufable
     */
    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    /**
     * Metodo que obtiene si es hibrido liguero un vehiculo hibrido
     * @return
     */
    public boolean isEsHibridoLiguero() {
        return esHibridoLiguero;
    }

    /**
     * Metodo que establece si es hibrido liguero un vehiculo hibrido
     * @param esHibridoLiguero
     */
    public void setEsHibridoLiguero(boolean esHibridoLiguero) {
        this.esHibridoLiguero = esHibridoLiguero;
    }
}
