package co.edu.uniquindio.poo.proyectofinal.model;

public class PickUpHibrido extends VehiculoHibrido implements ICalcularCostoTotal{

    private int numPasajero;
    private int numPuertas;
    private int capacidadCajaCarga;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;
    private boolean es4x4;

    /**
     * Constructor de la clase hija pickUpHibrido que hereda de la clase padre vehiculoHibrido
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
     * @param numPasajero
     * @param numPuertas
     * @param capacidadCajaCarga
     * @param aireAcondicionado
     * @param camaraReversa
     * @param numBolsasAire
     * @param abs
     * @param es4x4
     */
    public PickUpHibrido(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, boolean esEnchufable, boolean esHibridoLiguero, int numPasajero, int numPuertas, int capacidadCajaCarga, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean abs, boolean es4x4) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, esEnchufable, esHibridoLiguero);
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.es4x4 = es4x4;
    }

    /**
     * Metodo que obtiene el numero de pasajeros de un pickUp
     * @return
     */
    public int getNumPasajero() {
        return numPasajero;
    }

    /**
     * Metodo que establece el numero de pasajeros de un pickUp
     * @param numPasajero
     */
    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    /**
     * Metodo que obtiene el numero de puertas de un pickUp
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Metodo que establece el numero de puertas de un pickUp
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo que obtiene la capacidad de la caja de carga de un pickUp
     * @return
     */
    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    /**
     * Metodo que establece la capacidad de la caja de carga de un pickUp
     * @param capacidadCajaCarga
     */
    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Metodo que obtiene si el pickUp tiene aire acondiconado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Metodo que establece si el pickUp tiene aire acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Metodo que obtiene si el pickUp tiene camara de reversa
     * @return
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Metodo que establece si el pickUp tiene camara de reversa
     * @param camaraReversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }


    /**
     * Metodo que obtiene el numero de bolsas de aire que tiene un pickUp
     * @return
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    /**
     * Metodo que establece el numero de bolsas de aire que tiene un pickUp
     * @param numBolsasAire
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    /**
     * Metodo que obtiene si el pickUp tiene abs
     * @return
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Metodo que establece si el pickUp tiene abs
     * @param abs
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }


    /**
     * Metodo que obtiene si el pickUp es 4x4
     * @return
     */
    public boolean isEs4x4() {
        return es4x4;
    }

    /**
     * Metodo que establece si el pickUp es  4x4
     * @param es4x4
     */
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
