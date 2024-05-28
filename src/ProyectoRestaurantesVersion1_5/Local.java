package ProyectoRestaurantesVersion1_5;

/**************************************
 * @author acome
 *
 * En esta segunda entrega el programa principal o alguna clase tendrá que tener:
 * - un array o un ArrayList de objetos.
 * - herencia
 * - tratamiento de cadenas
 * - si es posible vectores o matrices
 ***************************************/

public class Local {
    
    // Atributos
    /** ID global estático para todos los locales */
    protected static int id = 0;

    /** ID único del local */
    protected int idLocal;

    /** Estado de operación del local */
    protected int estadoOperacion;

    /** Constante que indica que el local está abierto */
    public final static int ABIERTO = 1;

    /** Constante que indica que el local está cerrado */
    public final static int CERRADO = 2;

    /** Constante que indica que el local está en reforma */
    public final static int ENREFORMA = 3;

    /** Arreglo de estados de operación en forma de cadenas */
    protected static final String[] estadoOperaciones = {"Abierto", "Cerrado", "EnReforma"};

    /** Horario de apertura del local */
    protected String horarioApertura;

    /** Dirección del local */
    protected String direccionLocal;

    /** Localidad del local */
    protected String localidad;

    /** Gerente a cargo del local */
    protected String gerenteLocal;

    /** Código postal del local */
    protected int codigoPostal;

    /** Metros cuadrados del local */
    protected double metros;

    // Constructor
    /**
     * Constructor para crear un objeto Local.
     *
     * @param estadoOperacion Estado de operación del local.
     * @param horarioApertura Horario de apertura del local.
     * @param direccionLocal Dirección del local.
     * @param localidad Localidad del local.
     * @param gerenteLocal Gerente a cargo del local.
     * @param codigoPostal Código postal del local.
     * @param metros Metros cuadrados del local.
     */
    public Local(int estadoOperacion, String horarioApertura, String direccionLocal, 
                 String localidad, String gerenteLocal, int codigoPostal, double metros) {
        id++;
        this.idLocal = id;
        this.estadoOperacion = estadoOperacion;
        this.horarioApertura = horarioApertura;
        this.direccionLocal = direccionLocal;
        this.localidad = localidad;
        this.gerenteLocal = gerenteLocal;
        this.codigoPostal = codigoPostal;
        this.metros = metros;
    }

    // Getters y Setters

    /**
     * Obtiene el ID del local.
     *
     * @return el ID del local.
     */
    public int getIdLocal() {
        return idLocal;
    }

    /**
     * Establece el ID del local.
     *
     * @param idLocal el nuevo ID del local.
     */
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    /**
     * Obtiene el estado de operación del local.
     *
     * @return el estado de operación del local.
     */
    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    /**
     * Establece el estado de operación del local.
     *
     * @param estadoOperacion el nuevo estado de operación del local.
     */
    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    /**
     * Obtiene el horario de apertura del local.
     *
     * @return el horario de apertura del local.
     */
    public String getHorarioApertura() {
        return horarioApertura;
    }

    /**
     * Establece el horario de apertura del local.
     *
     * @param horarioApertura el nuevo horario de apertura del local.
     */
    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    /**
     * Obtiene la dirección del local.
     *
     * @return la dirección del local.
     */
    public String getDireccionLocal() {
        return direccionLocal;
    }

    /**
     * Establece la dirección del local.
     *
     * @param direccionLocal la nueva dirección del local.
     */
    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    /**
     * Obtiene la localidad del local.
     *
     * @return la localidad del local.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Establece la localidad del local.
     *
     * @param localidad la nueva localidad del local.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Obtiene el nombre del gerente del local.
     *
     * @return el nombre del gerente del local.
     */
    public String getGerenteLocal() {
        return gerenteLocal;
    }

    /**
     * Establece el nombre del gerente del local.
     *
     * @param gerenteLocal el nuevo nombre del gerente del local.
     */
    public void setGerenteLocal(String gerenteLocal) {
        this.gerenteLocal = gerenteLocal;
    }

    /**
     * Obtiene el código postal del local.
     *
     * @return el código postal del local.
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el código postal del local.
     *
     * @param codigoPostal el nuevo código postal del local.
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene los metros cuadrados del local.
     *
     * @return los metros cuadrados del local.
     */
    public double getMetros() {
        return metros;
    }

    /**
     * Establece los metros cuadrados del local.
     *
     * @param metros los nuevos metros cuadrados del local.
     */
    public void setMetros(double metros) {
        this.metros = metros;
    }

    /**
     * Método que devuelve una representación en cadena de todas las características del local.
     * Incluye un switch para mostrar el estado del local en forma de cadena.
     *
     * @return Una cadena con todas las características del local.
     */
    @Override
    public String toString() {
        System.out.println("Las características del local son:");
        String cadenaOperacion = "";
        switch (estadoOperacion) {
            case ABIERTO:
                cadenaOperacion = "Abierto";
                break;
            case CERRADO:
                cadenaOperacion = "Cerrado";
                break;
            case ENREFORMA:
                cadenaOperacion = "En Reforma";
                break;
        }
        return "Local [idLocal nº" + idLocal + ", estadoOperacion=" + cadenaOperacion + 
               ", horarioApertura=" + horarioApertura + ", direccionLocal=" + direccionLocal + 
               ", localidad=" + localidad + ", gerenteLocal=" + gerenteLocal + 
               ", codigoPostal=" + codigoPostal + ", metros=" + metros + "]";
    }
}
