package co.edu.uniquindio.poo.proyectofinal.model;

public class Vehiculo {

    private String marca;
    private String placa;
    private String modelo;
    private int cambios;
    private int cilindraje;
    private int velocidadMax;
    private Estado estado;
    private TipoTransmicion tipoTransmicion;
    private TipoCombustible tipoCombustible;

    /**
     * Constructor de la clase padre Vehiculo
     * @param marca
     * @param placa
     * @param modelo
     * @param cambios
     * @param cilindraje
     * @param velocidadMax
     * @param estado
     * @param tipoTransmicion
     * @param tipoCombustible
     */
    public Vehiculo(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.velocidadMax = velocidadMax;
        this.estado = estado;
        this.tipoTransmicion = tipoTransmicion;
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Metodo que obtiene la marca de un vehiculo
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca de un vehiculo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que obtiene la placa de un vehiculo
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo que establece la placa de un vehiculo
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo que obtiene el modelo de un vehiculo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que establece el modelo de un vehiculo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que obtiene los cambios de un vehiculo
     * @return
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * Metodo que establece los cambios de un vehiculo
     * @param cambios
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * Metodo que obtiene el cilindraje de un vehiculo
     * @return
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * Metodo que establece el cilindraje de un vehiculo
     * @param cilindraje
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Metodo que obtiene la velocidad maxima de un vehiculo
     * @return
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * Metodo que establece la velocidad maxima de un vehiculo
     * @param velocidadMax
     */
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * Metodo que obtiene el estado
     * @return
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Metodo que establece el estado
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Metodo que obtiene el tipo de transmicion
     * @return
     */
    public TipoTransmicion getTipoTransmicion() {
        return tipoTransmicion;
    }

    /**
     * Metodo que establece el tipo de transmicion
     * @param tipoTransmicion
     */
    public void setTipoTransmicion(TipoTransmicion tipoTransmicion) {
        this.tipoTransmicion = tipoTransmicion;
    }

    /**
     * Metodo que obtiene el tipo de combustible
     * @return
     */
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Metodo que establece el tipo de combustible
     * @param tipoCombustible
     */
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return marca + " - " + placa;
    }

}
