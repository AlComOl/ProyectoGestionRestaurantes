package ProyectoRestaurantesVersion1_5;

/**
 * Clase que representa un local propio, extiende de la clase Local.
 * Contiene información adicional sobre el nombre y la fecha de compra del local.
 * 
 * @see Local
 */
public class LocalPropio extends Local {
    
    /** Nombre del local */
    private String nombre;
    
    /** Fecha de compra del local */
    private String fechaCompra;

    /**
     * Constructor para crear un objeto LocalPropio.
     * 
     * @param estadoOperacion Estado de operación del local.
     * @param horarioApertura Horario de apertura del local.
     * @param direccionLocal Dirección del local.
     * @param localidad Localidad del local.
     * @param gerenteLocal Gerente a cargo del local.
     * @param codigoPostal Código postal del local.
     * @param metros Metros cuadrados del local.
     * @param nombre Nombre del local.
     * @param fechaCompra Fecha de compra del local.
     */
    public LocalPropio(int estadoOperacion, String horarioApertura, String direccionLocal, 
                       String localidad, String gerenteLocal, int codigoPostal, double metros,
                       String nombre, String fechaCompra) {
        
        super(estadoOperacion, horarioApertura, direccionLocal, 
              localidad, gerenteLocal, codigoPostal, metros);
        this.nombre = nombre;
        this.fechaCompra = fechaCompra;
    }

    // Getters y Setters

    /**
     * Obtiene el nombre del local.
     *
     * @return el nombre del local.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del local.
     *
     * @param nombre el nuevo nombre del local.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de compra del local.
     *
     * @return la fecha de compra del local.
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Establece la fecha de compra del local.
     *
     * @param fechaCompra la nueva fecha de compra del local.
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Método que devuelve una representación en cadena de todas las características del local propio.
     * Incluye la información del nombre y la fecha de compra del local.
     *
     * @return Una cadena con todas las características del local propio.
     */
    @Override
    public String toString() {
        return super.toString() + "nombre=" + nombre + ", fechaCompra=" + fechaCompra + "]";
    }
}
