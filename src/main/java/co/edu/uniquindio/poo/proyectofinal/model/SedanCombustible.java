package co.edu.uniquindio.poo.proyectofinal.model;

public class SedanCombustible extends VehiculoCombustible implements ICalcularCostoTotal{

    private int numPasajero;
    private int numPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int numBolsasAire;
    private boolean abs;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    /**
     * Constructor de la clase hija sedanCombustible que hereda de la clase padre vehiculoCombustible
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
     * @param capacidadMaletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param velocidadCrucero
     * @param numBolsasAire
     * @param abs
     * @param sensoresColision
     * @param sensorTraficoCruzado
     * @param asistentePermanenciaCarril
     */
    public SedanCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int capacidadTanque, int numPasajero, int numPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int numBolsasAire, boolean abs, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, capacidadTanque);
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public SedanCombustible() {
    }

    /**
     * Metodo que obtiene el numero de pasajeros de un sedan
     * @return
     */
    public int getNumPasajero() {
        return numPasajero;
    }

    /**
     * Metodo que establece el numero de pasajeros de un sedan
     * @param numPasajero
     */
    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    /**
     * Metodo que obtiene el numero de puertas de un sedan
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Metodo que establece el numero de puertas de un sedan
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo que obtiene la capacidad del maletero de un sedan
     * @return
     */
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Metodo que establece la capacidad del maletero de un sedan
     * @param capacidadMaletero
     */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Metodo que obtiene si el sedan tiene aire acondiconado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Metodo que establece si el sedan tiene aire acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Metodo que obtiene si el sedan tiene camara de reversa
     * @return
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Metodo que establece si el sedan tiene camara de reversa
     * @param camaraReversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Metodo que obtiene si el sedan tiene velocidad de crucero
     * @return
     */
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     * Metodo que establece si el sedan tiene velocidad de crucero
     * @param velocidadCrucero
     */
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * Metodo que obtiene el numero de bolsas de aire que tiene un sedan
     * @return
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    /**
     * Metodo que establece el numero de bolsas de aire que tiene un sedan
     * @param numBolsasAire
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    /**
     * Metodo que obtiene si el sedan tiene abs
     * @return
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Metodo que establece si el sedan tiene abs
     * @param abs
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Metodo que obtiene si el sedan tiene sensores de colision
     * @return
     */
    public boolean isSensoresColision() {
        return sensoresColision;
    }

    /**
     * Metodo que establece si el sedan tiene sensores de colision
     * @param sensoresColision
     */
    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    /**
     * Metodo que obtiene si el sedan tiene sensor de trafico cruzado
     * @return
     */
    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    /**
     * Metodo que establece si el sedan tiene sensor de trafico cruzado
     * @param sensorTraficoCruzado
     */
    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    /**
     * Metodo que obtiene si el sedan tiene asistente de permanencia en el carril
     * @return
     */
    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    /**
     * Metodo que establece si el sedan tiene asistente de permanencia en el carril
     * @param asistentePermanenciaCarril
     */
    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
