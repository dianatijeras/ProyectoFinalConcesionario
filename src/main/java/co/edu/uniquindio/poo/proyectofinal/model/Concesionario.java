package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario implements ICrudCliente, ICrudEmpleado, ICrudTransaccion, ICrudVehiculo{

    private String nombre;
    private String direccion;
    private String telefono;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private Administrador administrador;
    private Transaccion transaccion;
    private Collection<Vehiculo> listaVehiculos;
    private Collection<Cliente> listaClientes;
    private Collection<Empleado> listaEmpleados;
    private Collection<Transaccion> listaTransacciones;


    /**
     * Constructor de la clase principal Concesionario
     * @param nombre
     * @param direccion
     * @param telefono
     * @param vehiculo
     * @param cliente
     * @param empleado
     * @param administrador
     * @param transaccion
     */
    public Concesionario(String nombre, String direccion, String telefono, Vehiculo vehiculo, Cliente cliente, Empleado empleado, Administrador administrador, Transaccion transaccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.administrador = administrador;
        this.transaccion = transaccion;
        this.listaVehiculos = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
        this.listaEmpleados = new LinkedList<>();
        this.listaTransacciones = new LinkedList<>();


    }

    /**
     * Metodo que obtiene el nombre de la empresa
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la empresa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la direccion de la empresa
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que establece la direccion de la empresa
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que obtiene el telefono de la empresa
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que establece el telefono de la empresa
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que obtiene el vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo que establece el vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo que obtiene el Cliente
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Metodo que estableceel cliente
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo que obtiene el Empleado
     * @return
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Metodo que establece el empleado
     * @param empleado
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Metodo que obtiene a el Administrador
     * @return
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * Metodo que establece ae el administrador
     * @param administrador
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodod que obtiene la transaccion
     * @return
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * Metodo que establece la transaccion
     * @param transaccion
     */
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * Metodo que obtiene la lista de vehiculos
     * @return
     */
    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Metodo que establece la lista de vehiculos
     * @param listaVehiculos
     */
    public void setListaVehiculos(Collection<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    /**
     * Metodo que obtiene la lista de clientes
     * @return
     */
    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    /**
     * Metodo que establece la lista de clientes
     * @param listaClientes
     */
    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    /**
     * Metodo que obtiene la lista de empleados
     * @return
     */
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Metodo que establece la lista de empleados
     * @param listaEmpleados
     */
    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo que obtiene la lista de transacciones
     * @return
     */
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    /**
     * Metodo que establece la lista de transacciones
     * @param listaTransacciones
     */
    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }


    /**
     * Metodo que verifica si existe y registra un cliente
     * @param cliente
     */
    @Override
    public void registrarCliente(Cliente cliente) {
        // Verifica si el cliente ya existe en la lista
        boolean existe = false;
        for (Cliente c : listaClientes){
            if(c.getCedula().equals(cliente.getCedula())){
                existe = true;
                break;
            }
        }

        //Si no existe lo agrega
        if(!existe){
            listaClientes.add(cliente);
        }
    }

    /**
     * Metodo que busca a un cliente
     *
     * @param cedula
     * @return
     */
    @Override
    public Cliente buscarCliente(String cedula) {
        for(Cliente cliente : listaClientes){
            if(cliente.getCedula().equals(cedula)){
                System.out.println("Se encontro al cliente: " + cliente);
                return cliente;
            }
        }

        System.out.println("No se encontro al cliente");
        return null;
    }

    /**
     * Metodo que elimina a un cliente
     * @param cedula
     */
    @Override
    public void eliminarCliente(String cedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                listaClientes.remove(cliente);
                break;
            }
        }
    }

    /**
     * Metodo que verifica que no exista y registra a un empleado
     * @param empleado
     */
    @Override
    public void registrarEmpleado(Empleado empleado) {
        // Verifica si el empleado ya existe en la lista
        boolean existe = false;
        for (Empleado e : listaEmpleados){
            if(e.getCedula().equals(cliente.getCedula())){
                existe = true;
                break;
            }
        }

        //Si no existe lo agrega
        if(!existe){
            listaEmpleados.add(empleado);
        }
    }

    /**
     * Metodo que busca a un empleado
     * @param cedula
     */
    @Override
    public void buscarEmpleado(String cedula) {
        for(Empleado empleado : listaEmpleados){
            if(empleado.getCedula().equals(cedula)){
                System.out.println("Se encontro al empleado: " + empleado);
                return;
            }
        }

        System.out.println("No se encontro al empleado");
    }

    /**
     * Metodo que elimina a un empleado
     * @param cedula
     */
    @Override
    public void eliminarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equals(cedula)) {
                listaEmpleados.remove(empleado);
                break;
            }
        }
    }

    /**
     * Metodo que verifica que no exista y crea una transaccion
     * @param transaccion
     */
    @Override
    public void crearTransaccion(Transaccion transaccion) {
        // Verifica si la transaccion ya existe en la lista
        boolean existe = false;
        for (Transaccion t : listaTransacciones){
            if(t.getIdTransaccion().equals(transaccion.getIdTransaccion())){
                existe = true;
                break;
            }
        }

        //Si no existe lo agrega
        if(!existe){
            listaTransacciones.add(transaccion);
        }
    }

    @Override
    public void registroTransacciones() {
        for (Transaccion transaccion : listaTransacciones){
            System.out.println("ID: " + transaccion.getIdTransaccion());
            System.out.println("Fecha: " + transaccion.getFecha());
            System.out.println("Monto: " + transaccion.getMonto());
            System.out.println("Vehiculo: " + transaccion.getVehiculo().getPlaca());
            System.out.println("Tipo: " + transaccion.getTipoTransaccion());
            System.out.println("Cliente: " + transaccion.getCliente().getNombre());
            System.out.println("--------------------------------");
        }
    }

    /**
     * Metodo que busca una transaccion
     * @param idTransaccion
     */
    @Override
    public void buscarTransaccion(String idTransaccion) {
        for(Transaccion transaccion : listaTransacciones){
            if(transaccion.getIdTransaccion().equals(idTransaccion)){
                System.out.println("Se encontro la transaccion: " + transaccion);
                return;
            }
        }

        System.out.println("No se encontro la transaccion");
    }

    /**
     * Metodo que verifica que no exista y registra un vehiculo
     * @param vehiculo
     */
    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {
        // Verifica si el vehiculo ya existe en la lista
        boolean existe = false;
        for (Vehiculo v : listaVehiculos){
            if(v.getPlaca().equals(vehiculo.getPlaca())){
                existe = true;
                break;
            }
        }

        //Si no existe lo agrega
        if(!existe){
            listaVehiculos.add(vehiculo);
        }
    }


    /**
     * Metodo que elimina un vehiculo
     * @param placa
     */
    @Override
    public void eliminarVehiculo(String placa) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                listaVehiculos.remove(vehiculo);
                break;
            }
        }
    }

    /**
     * Metodo que busca a un vehiculo por su placa
     * @param placa
     */
    @Override
    public Vehiculo buscarVehiculo(String placa) {
        Vehiculo vehiculoFinal= null;
        for(Vehiculo vehiculo : listaVehiculos){
            if(vehiculo.getPlaca().equals(placa)){
                vehiculoFinal = vehiculo;
                System.out.println("Se encontro el vehiculo: " + vehiculo);
            }
        }
        return vehiculoFinal;
    }

    public  void  agregarTransaccionVenta(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.VENTA) {
            listaTransacciones.add(transaccion);
            System.out.println("venta registrada: " + transaccion.getIdTransaccion());
        }
    }

    public  void  agregarTransaccionCompra(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.COMPRA) {
            listaTransacciones.add(transaccion);
            System.out.println("compra registrada: " + transaccion.getIdTransaccion());
        }
    }

    public  void  agregarTransaccionAlquiler(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.ALQUILER) {
            listaTransacciones.add(transaccion);
            System.out.println("alquiler registrada: " + transaccion.getIdTransaccion());
        }
    }



}
