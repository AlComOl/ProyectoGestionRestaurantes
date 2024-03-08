package ProgramaConArrayList;
/**************************************
*@author acome

En esta segunda entrega el programa principal o alguna clase tendrá que tener:

    un array o un arrayList de objetos.
    herencia
    tratamiento de cadenas
    si es posible vectores o matrices
***************************************/

public class Local {
	
//	atributos
	protected static int id=0;
	protected int idLocal;
	protected String estadoLocal;
	protected String horariosLocal;
	protected String direccionLocal;
	protected String ubicacionLocal;
	protected String gerenteLocal;
	
	
//	constructor
	
	
	
	public Local(String estadoLocal, String horariosLocal, String direccionLocal, String ubicacionLocal, String gerenteLocal) {
		
		id++;
		this.idLocal=id;
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
	
	
	public String getEstadoLocal() {
		return estadoLocal;
	}


	public void setEstadoLocal(String estadoLocal) {
		this.estadoLocal = estadoLocal;
	}


	public String getHorariosLocal() {
		return horariosLocal;
	}


	public void setHorariosLocal(String horariosLocal) {
		this.horariosLocal = horariosLocal;
	}


	public String getDireccionLocal() {
		return direccionLocal;
	}


	public void setDireccionLocal(String direccionLocal) {
		this.direccionLocal = direccionLocal;
	}


	public String getUbicacionLocal() {
		return ubicacionLocal;
	}


	public void setUbicacionLocal(String ubicacionLocal) {
		this.ubicacionLocal = ubicacionLocal;
	}


	public String getGerenteLocal() {
		return gerenteLocal;
	}


	public void setGerenteLocal(String gerenteLocal) {
		this.gerenteLocal = gerenteLocal;
	}


	@Override
	/*******************************************************
	 * @descripcion la funcion toString muestra los atributos
	 * del padre
	 * 
	 * **************************************************/
	public String toString() {
		
	return "\n Local " + idLocal +
			"\n Horarios: " + horariosLocal +
            "\n Dirección: " + direccionLocal +
            "\n Ubicación: " + ubicacionLocal + 
            "\n Gerente: " + gerenteLocal;
	}
	

}
