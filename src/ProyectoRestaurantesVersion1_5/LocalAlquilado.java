package ProyectoRestaurantesVersion1_5;

/**
 * Clase que representa un local alquilado, extiende de la clase Local.
 * Contiene información adicional sobre el propietario y el contrato de alquiler.
 * 
 * @see Local
 */
public class LocalAlquilado extends Local {
    
    /** Nombre del propietario del local */
    private String propietarioLocal;
    
    /** Teléfono del propietario del local */
    private String telefonoPropietario;
    
    /** Correo electrónico del propietario del local */
    private String correoPropietario;
    
    /** Dirección del propietario del local */
    private String direccionProp;
    
    /** Fecha de inicio del contrato de alquiler */
    private String fechaInicioContrato;
    
    /** Fecha de fin del contrato de alquiler */
    private String fechaFinContrato;

    /**
     * Constructor para crear un objeto LocalAlquilado.
     * 
     * @param propietarioLocal Nombre del propietario del local.
     * @param telefonoPropietario Teléfono del propietario del local.
     * @param correoPropietario Correo electrónico del propietario del local.
     * @param direccionProp Dirección del propietario del local.
     * @param fechaInicioContrato Fecha de inicio del contrato de alquiler.
     * @param fechaFinContrato Fecha de fin del contrato de alquiler.
     * @param estadoOperacion Estado de operación del local.
     * @param horarioApertura Horario de apertura del local.
     * @param direccionLocal Dirección del local.
     * @param localidad Localidad del local.
     * @param gerenteLocal Gerente a cargo del local.
     * @param codigoPostal Código postal del local.
     * @param metros Metros cuadrados del local.
     */
    public LocalAlquilado(String propietarioLocal, String telefonoPropietario,
                          String correoPropietario, String direccionProp, 
                          String fechaInicioContrato, String fechaFinContrato, 
                          int estadoOperacion, String horarioApertura, 
                          String direccionLocal, String localidad, 
                          String gerenteLocal, int codigoPostal, double metros) {
        
        super(estadoOperacion, horarioApertura, direccionLocal, localidad, 
              gerenteLocal, codigoPostal, metros);
        this.propietarioLocal = propietarioLocal;
        this.telefonoPropietario = telefonoPropietario;
        this.correoPropietario = correoPropietario;
        this.direccionProp = direccionProp;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
    }

    // Getters y Setters

    /**
     * Obtiene el nombre del propietario del local.
     *
     * @return el nombre del propietario del local.
     */
    public String getPropietarioLocal() {
        return propietarioLocal;
    }

    /**
     * Establece el nombre del propietario del local.
     *
     * @param propietarioLocal el nuevo nombre del propietario del local.
     */
    public void setPropietarioLocal(String propietarioLocal) {
        this.propietarioLocal = propietarioLocal;
    }

    /**
     * Obtiene el teléfono del propietario del local.
     *
     * @return el teléfono del propietario del local.
     */
    public String getTelefonoPropietario() {
        return telefonoPropietario;
    }

    /**
     * Establece el teléfono del propietario del local.
     *
     * @param telefonoPropietario el nuevo teléfono del propietario del local.
     */
    public void setTelefonoPropietario(String telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    /**
     * Obtiene el correo electrónico del propietario del local.
     *
     * @return el correo electrónico del propietario del local.
     */
    public String getCorreoPropietario() {
        return correoPropietario;
    }

    /**
     * Establece el correo electrónico del propietario del local.
     *
     * @param correoPropietario el nuevo correo electrónico del propietario del local.
     */
    public void setCorreoPropietario(String correoPropietario) {
        this.correoPropietario = correoPropietario;
    }

    /**
     * Obtiene la dirección del propietario del local.
     *
     * @return la dirección del propietario del local.
     */
    public String getDireccionProp() {
        return direccionProp;
    }

    /**
     * Establece la dirección del propietario del local.
     *
     * @param direccionProp la nueva dirección del propietario del local.
     */
    public void setDireccionProp(String direccionProp) {
        this.direccionProp = direccionProp;
    }

    /**
     * Obtiene la fecha de inicio del contrato de alquiler.
     *
     * @return la fecha de inicio del contrato de alquiler.
     */
    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    /**
     * Establece la fecha de inicio del contrato de alquiler.
     *
     * @param fechaInicioContrato la nueva fecha de inicio del contrato de alquiler.
     */
    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    /**
     * Obtiene la fecha de fin del contrato de alquiler.
     *
     * @return la fecha de fin del contrato de alquiler.
     */
    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    /**
     * Establece la fecha de fin del contrato de alquiler.
     *
     * @param fechaFinContrato la nueva fecha de fin del contrato de alquiler.
     */
    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    /**
     * Método que devuelve una representación en cadena de todas las características del local alquilado.
     * Incluye la información del propietario y del contrato de alquiler.
     *
     * @return Una cadena con todas las características del local alquilado.
     */
    @Override
    public String toString() {
        return super.toString() + "LocalAlquilado [propietarioLocal=" + propietarioLocal + 
               ", telefonoPropietario=" + telefonoPropietario + 
               ", correoPropietario=" + correoPropietario + 
               ", direccionProp=" + direccionProp + 
               ", fechaInicioContrato=" + fechaInicioContrato + 
               ", fechaFinContrato=" + fechaFinContrato + "]";
    }
}
