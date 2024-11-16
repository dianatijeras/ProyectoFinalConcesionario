package co.edu.uniquindio.poo.proyectofinal.model;

public class VanHibrida extends VehiculoHibrido implements ICalcularCostoTotal{

    private int numPasajero;
    private int numPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean abs;

    /**
     * Constructor de la clase hija vanHibrida que hereda de la clase padre vehiculoHibrido
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
     * @param capacidadMaletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param numBolsasAire
     * @param abs
     */
    public VanHibrida(String marca, String placa, String modelo, int cambios, int cilindraje, int velocidadMax, Estado estado, TipoTransmicion tipoTransmicion, TipoCombustible tipoCombustible, boolean esEnchufable, boolean esHibridoLiguero, int numPasajero, int numPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean abs) {
        super(marca, placa, modelo, cambios, cilindraje, velocidadMax, estado, tipoTransmicion, tipoCombustible, esEnchufable, esHibridoLiguero);
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
    }

    /**
     * Metodo que obtiene el numero de pasajeros de una van
     * @return
     */
    public int getNumPasajero() {
        return numPasajero;
    }

    /**
     * Metodo que establece el numero de pasajeros de una van
     * @param numPasajero
     */
    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    /**
     * Metodo que obtiene el numero de puertas de una van
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Metodo que establece el numero de puertas de una van
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo que obtiene la capacidad del maletero de una van
     * @return
     */
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Metodo que establece la capacidad del maletero de una van
     * @param capacidadMaletero
     */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Metodo que obtiene si la van tiene aire acondiconado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Metodo que establece si la van tiene aire acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Metodo que obtiene si la van tiene camara de reversa
     * @return
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Metodo que establece si la van tiene camara de reversa
     * @param camaraReversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }


    /**
     * Metodo que obtiene el numero de bolsas de aire que tiene una van
     * @return
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    /**
     * Metodo que establece el numero de bolsas de aire que tiene una van
     * @param numBolsasAire
     */
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    /**
     * Metodo que obtiene si la van tiene abs
     * @return
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Metodo que establece si la van tiene abs
     * @param abs
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public double calcularCosto(int dias, double tarifaFija) {
        return 0;
    }
}
