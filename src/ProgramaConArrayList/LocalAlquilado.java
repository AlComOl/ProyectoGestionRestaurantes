package ProgramaConArrayList;
import java.util.*;
/**************************************
*@author acome

Entrega proyecto ArrayList Cadenas 
*
*
*
***************************************/
public class LocalAlquilado extends Local{

	//atributos
	private String fechaAlquiler; 
	private String tipoLocal;
	
	
//	constructor
	
	public LocalAlquilado( int idLocal, String estadoLocal, String horariosLocal, String direccionLocal,String ubicacionLocal,String gerenteLocal,String fechaAlquiler,String tipoLocal) {
		super(idLocal, estadoLocal, horariosLocal,direccionLocal,ubicacionLocal,gerenteLocal);
		this.fechaAlquiler=fechaAlquiler;
		this.tipoLocal=tipoLocal;
	}

//	getters setters
	public String getFechaAlquiler() {
		return fechaAlquiler;
	}


	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}


	public String getTipoLocal() {
		return tipoLocal;
	}


	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}
	
	@Override
	public String toString() {//lo mismo con la otra clase
		
	return super.toString()
			+"\n Fecha de Alquiler: " + fechaAlquiler 
			+"\n Horarios: " + tipoLocal ;
			
	}
	
	
}
