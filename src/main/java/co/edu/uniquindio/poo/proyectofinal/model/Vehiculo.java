package co.edu.uniquindio.poo.proyectofinal.model;

import javafx.beans.property.*;

public class Vehiculo {

    private StringProperty  marca;
    private StringProperty placa;
    private StringProperty modelo;
    private IntegerProperty cambios;
    private int cilindraje;
    private int velocidadMax;
    private ObjectProperty <Estado> estado;
    private ObjectProperty <TipoTransmicion> tipoTransmicion;
    private ObjectProperty <TipoCombustible> tipoCombustible;

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
        this.marca = new SimpleStringProperty(marca);
        this.placa = new SimpleStringProperty(placa);
        this.modelo = new SimpleStringProperty(modelo);
        this.cambios = new SimpleIntegerProperty(cambios);
        this.cilindraje = cilindraje;
        this.velocidadMax = velocidadMax;
        this.estado = new SimpleObjectProperty<>(estado);
        this.tipoTransmicion = new SimpleObjectProperty<>(tipoTransmicion);
        this.tipoCombustible = new SimpleObjectProperty<>(tipoCombustible);
    }

    /**
     * Constructor vacio
     */
    public Vehiculo() {
        this.marca = new SimpleStringProperty("");
        this.placa = new SimpleStringProperty("");
        this.modelo = new SimpleStringProperty("");
        this.cambios = new SimpleIntegerProperty(0);
        this.estado = new SimpleObjectProperty<>(null);
        this.tipoTransmicion = new SimpleObjectProperty<>(null);
        this.tipoCombustible = new SimpleObjectProperty<>(null);
    }

    public StringProperty marcaProperty() {
        return marca;
    }

    public StringProperty placaProperty() {
        return placa;
    }

    public StringProperty modeloProperty() {return modelo;}

    public IntegerProperty cambiosProperty() {return cambios;}

    public ObjectProperty <Estado> estadoProperty() {return estado;}

    public ObjectProperty <TipoTransmicion> tipoTransmicionProperty() {return tipoTransmicion;}

    public ObjectProperty <TipoCombustible> tipoCombustibleProperty() {return tipoCombustible;}


    /**
     * Metodo que obtiene la marca de un vehiculo
     * @return
     */
    public String getMarca() {
        return marca.get();
    }

    /**
     * Metodo que establece la marca de un vehiculo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca.set(marca);
    }

    /**
     * Metodo que obtiene la placa de un vehiculo
     * @return
     */
    public String getPlaca() {
        return placa.get();
    }

    /**
     * Metodo que establece la placa de un vehiculo
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa.set(placa);
    }

    /**
     * Metodo que obtiene el modelo de un vehiculo
     * @return
     */
    public String getModelo() {
        return modelo.get();
    }

    /**
     * Metodo que establece el modelo de un vehiculo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo.set(modelo);
    }

    /**
     * Metodo que obtiene los cambios de un vehiculo
     * @return
     */
    public int getCambios() {
        return cambios.get();
    }

    /**
     * Metodo que establece los cambios de un vehiculo
     * @param cambios
     */
    public void setCambios(int cambios) {
        this.cambios.set(cambios);
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
        return estado.get();
    }

    /**
     * Metodo que establece el estado
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado.set(estado);
    }

    /**
     * Metodo que obtiene el tipo de transmicion
     * @return
     */
    public TipoTransmicion getTipoTransmicion() {
        return tipoTransmicion.get();
    }

    /**
     * Metodo que establece el tipo de transmicion
     * @param tipoTransmicion
     */
    public void setTipoTransmicion(TipoTransmicion tipoTransmicion) {
        this.tipoTransmicion.set(tipoTransmicion);
    }

    /**
     * Metodo que obtiene el tipo de combustible
     * @return
     */
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible.get();
    }

    /**
     * Metodo que establece el tipo de combustible
     * @param tipoCombustible
     */
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible.set(tipoCombustible);
    }


    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return marca + " - " + placa;
    }

}
