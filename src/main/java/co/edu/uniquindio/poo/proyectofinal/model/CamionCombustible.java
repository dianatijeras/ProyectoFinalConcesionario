package co.edu.uniquindio.poo.proyectofinal.model;

public class CamionCombustible extends VehiculoCombustible implements ICalcularCostoTotal{

    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosDeAire;
    private boolean abs;
    private int numEjes;
    private TipoCamion tipoCamion;

    /**
     * Metodo de la clase hija camionCombustible que hereda de la clase padre VehiculoCombustible
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
     * @param capacidadCarga
     * @param aireAcondicionado
     * @param frenosDeAire
     * @param abs
     * @param numEjes
     * @param tipoCamion
     */
    public CamionCombustible(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, int capacidadTanque, int capacidadCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean abs, int numEjes, TipoCamion tipoCamion) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, capacidadTanque);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.abs = abs;
        this.numEjes = numEjes;
        this.tipoCamion = tipoCamion;
    }

    public CamionCombustible() {
    }

    /**
     * Metodo que obtiene la capacidad de carga de un camion
     * @return
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Metodo que establece la capidad de carga de un camion
     * @param capacidadCarga
     */
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Metodo que obtiene si un camion tiene aire acondicionado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Metodo que establece si un camion tiene aire acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Metodo que obtiene si un camion tiene frenos de aire
     * @return
     */
    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    /**
     * Metodo que establece si un camion tiene frenos de aire
     * @param frenosDeAire
     */
    public void setFrenosDeAire(boolean frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    /**
     * Metodo que obtiene si un camion tiene abs
     * @return
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Metodo que establece si un camion tiene abs
     * @param abs
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Metodo que obtiene el numero de ejes que tiene un camion
     * @return
     */
    public int getNumEjes() {
        return numEjes;
    }

    /**
     * Metodo que establece el numero de ejes que tiene un camion
     * @param numEjes
     */
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    /**
     * Metodo que obtiene el tipo de camion
     * @return
     */
    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    /**
     * Metodo que establece el tipo de camion
     * @param tipoCamion
     */
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
