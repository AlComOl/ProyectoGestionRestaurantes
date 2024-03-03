package ProgramaConArrayList;
import java.util.*;
/**************************************
*@author acome

En esta segunda entrega el programa principal o alguna clase tendrá que tener:

    un array o un arrayList de objetos.
    herencia
    tratamiento de cadenas
    si es posible vectores o matrices
***************************************/
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


	public String getNombrePropiedad() {
		return nombrePropiedad;
	}


	public void setNombrePropiedad(String nombrePropiedad) {
		this.nombrePropiedad = nombrePropiedad;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public int getMetrosLocal() {
		return metrosLocal;
	}


	public void setMetrosLocal(int metrosLocal) {
		this.metrosLocal = metrosLocal;
	}


	public String getFechaPagoIBI() {
		return fechaPagoIBI;
	}


	public void setFechaPagoIBI(String fechaPagoIBI) {
		this.fechaPagoIBI = fechaPagoIBI;
	}


	public float getPrecioIBI() {
		return precioIBI;
	}


	public void setPrecioIBI(float precioIBI) {
		this.precioIBI = precioIBI;
	}
    
	@Override
	public String toString() {//lo mismo con la otra clase
		
	return super.toString()+
			"\n Local " + idLocal + // este ya esta quitar
			"\n - Estado: " + nombrePropiedad + ///cambiar atributes 
			"\n Horarios: " + horariosLocal +
            "\n Dirección: " + direccionLocal +
            "\n Ubicación: " + ubicacionLocal + 
            "\n Gerente: " + gerenteLocal;
	}
}
