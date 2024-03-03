package ProgramaConArrayList;
import java.util.*;

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
}
