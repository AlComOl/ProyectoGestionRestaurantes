package ProgramaConArrayList;
import java.util.*;

public class LocalPropio extends Local{

    // atributo
    private String nombrePropiedad;
    private String fechaCompra;
    private int metrosLocal;
    private String fechaPagoIBI;
    private float precioIBI;
    
    
    // constructor
    
    public LocalPropio(String nombrePropiedad, String fechaCompra, int metrosLocal, String fechaPagoIBI, int precioIBI, int idLocal, String estadoLocal, String horariosLocal, String direccionLocal, String ubicacionLocal, String gerenteLocal) {
        super(idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal);
        this.nombrePropiedad = nombrePropiedad;
        this.fechaCompra = fechaCompra;
        this.metrosLocal = metrosLocal;
        this.fechaPagoIBI = fechaPagoIBI;
        this.precioIBI = precioIBI;
    }
}
