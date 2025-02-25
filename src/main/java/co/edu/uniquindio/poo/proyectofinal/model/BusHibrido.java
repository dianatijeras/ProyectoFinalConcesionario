package co.edu.uniquindio.poo.proyectofinal.model;

public class BusHibrido extends VehiculoHibrido implements ICalcularCostoTotal{

    private int numPasajeros;
    private int numPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;
    private int numEjes;
    private int numSalidasEmergencia;

    /**
     * Constructor de la clase hija busHibrido que hereda de la clase padre VehiculoHibrido
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
     * @param numPasajeros
     * @param numPuertas
     * @param capacidadMaletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param numBolsasAire
     * @param abs
     * @param numEjes
     * @param numSalidasEmergencia
     */
    public BusHibrido(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, boolean esEnchufable, boolean esHibridoLiguero, int numPasajeros, int numPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean abs, int numEjes, int numSalidasEmergencia) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, esEnchufable, esHibridoLiguero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
    }

    /**
     * Constructor vacio que inicializa un bus hibrido sin parametros
     */
    public BusHibrido() {
    }

    /**
     * Metodo que obtiene el numero de pasajeros de un bus
     * @return
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    /**
     * Metodo que establece el numero de pasajeros de un bus
     * @param numPasajeros
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    /**
     * Metodo que obtiene el numero de puertas de un bus
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Metodo que establece el numero de puertas de un bus
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo qe obtiene la capacidad del maletero de un bus
     * @return
     */
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Metodo que establece la capacidad del maletero de un bus
     * @param capacidadMaletero
     */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Metodo que obtiene si un bus tiene aire acondicionado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Metodo que establece si un bus tiene aire acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Metodo que obtiene si un bus tiene camara de reversa
     * @return
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Metodo que establece si un bus tiene camara de reversa
     * @param camaraReversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Metodo que obtiene el numero de bolsas de aire que tiene un bus
     * @return
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    /**
     * Metodo que establece el numero de bolsas de aire que tiene un bus
     * @param numBolsasAire
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    /**
     * Metodo que obtiene si un bus tiene abs
     * @return
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Metodo que establece si un bus tiene abs
     * @param abs
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Metodo que obtiene el numero de ejes que tiene un bus
     * @return
     */
    public int getNumEjes() {
        return numEjes;
    }

    /**
     * Metodo que establece el numero de ejes que tiene un bus
     * @param numEjes
     */
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    /**
     * Metodo que obtiene el numero de salidas de emergencia que tiene un bus
     * @return
     */
    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    /**
     * Metodo que establece el numero de salidad de emergencia que tiene un bus
     * @param numSalidasEmergencia
     */
    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
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
