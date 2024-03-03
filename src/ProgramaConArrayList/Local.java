package ProgramaConArrayList;

public class Local {
	
//	atributos
	protected  int idLocal;
	protected String estadoLocal;
	protected String horariosLocal;
	protected String direccionLocal;
	protected String ubicacionLocal;
	protected String gerenteLocal;
	
	
//	constructor
	
	public Local(int idLocal,String estadoLocal, String horariosLocal, String direccionLocal, String ubicacionLocal, String gerenteLocal) {
		this.idLocal=idLocal;
		this.estadoLocal=estadoLocal;
		this.horariosLocal=horariosLocal;
		this.direccionLocal=direccionLocal;
		this.ubicacionLocal=ubicacionLocal;
		this.gerenteLocal=gerenteLocal;
	}


	public int getIdLocal() {
		return idLocal;
	}


	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	@Override
	public String toString() {
		
	return "Local " + idLocal + " - Estado: " + estadoLocal + ", Horarios: " + horariosLocal +
            ", Dirección: " + direccionLocal + ", Ubicación: " + ubicacionLocal + ", Gerente: " + gerenteLocal;
	}

}
