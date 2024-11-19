package co.edu.uniquindio.poo.proyectofinal.model;

public class DeportivoCombustible extends VehiculoCombustible implements ICalcularCostoTotal{

    private int numPasajero;
    private int numPuertas;
    private int numBolsasAire;
    private int caballosFuerza;
    private double tiempo0a100;

    /**
     * Consttuctor de la clase hija depostivoCombustible que hereda de la clase padre vehiculoCombustible
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
     * @param numPasajero
     * @param numPuertas
     * @param numBolsasAire
     * @param caballosFuerza
     * @param tiempo0a100
     */
    public DeportivoCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int capacidadTanque, int numPasajero, int numPuertas, int numBolsasAire, int caballosFuerza, double tiempo0a100) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, capacidadTanque);
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempo0a100 = tiempo0a100;
    }

    /**
     * Metodo que obtiene el numero de pasajeros de un deportivo
     * @return
     */
    public int getNumPasajero() {
        return numPasajero;
    }

    /**
     * Metodo que establece el numero de pasajeros de un deportivo
     * @param numPasajero
     */
    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    /**
     * Metodo que obtiene el numero de puertas que tiene un deportivo
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Metodo que establece el numero de puertas que tiene un deportivo
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo que obtiene el numero de bolsas de aire de un deportivo
     * @return
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    /**
     * Metodo que establece el numero de bolsas de aire de un deportivo
     * @param numBolsasAire
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    /**
     * Metodo que obtiene los caballos de fuerza de un deportivo
     * @return
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * Metodo que establece los caballos de fuerza de un deportivo
     * @param caballosFuerza
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * Metodo que obtiene el tiempo en el que alcanza los 100kmh un deportivo
     * @return
     */
    public double getTiempo0a100() {
        return tiempo0a100;
    }

    /**
     * Metodo que establece el tiempo en el que alcanza los 100kmh un deportivo
     * @param tiempo0a100
     */
    public void setTiempo0a100(double tiempo0a100) {
        this.tiempo0a100 = tiempo0a100;
    }


    /**
     * Metodo que calcula el costo
     * @param dias
     * @param tarifaFija
     * @return
     */
    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
