package ProgramaArrayList_version1_2;
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
	protected  int idLocal=0;
	protected String iDEstado;
	protected String horarioApertura;
	protected String direccionLocal;
	protected String localidad;
	protected String gerenteLocal;
	protected int codigoPostal;
	protected double metros;
	
	
//	constructor
	
	public Local(String iDEstado, String horarioApertura, String direccionLocal, String localidad, String gerenteLocal, int codigoPostal,double metros) {
		id++;
		this.idLocal=id;
		this.iDEstado=iDEstado;
		this.horarioApertura=horarioApertura;
		this.direccionLocal=direccionLocal;
		this.localidad=localidad;
		this.gerenteLocal=gerenteLocal;
		this.metros=metros;
		
		
	}


	public int getIdLocal() {
		return idLocal;
	}


	public  void setIdLocal(int idLocal) {
		this.idLocal=idLocal;
	}


	public String getiDEstado() {
		return iDEstado;
	}


	public void setiDEstado(String iDEstado) {
		this.iDEstado = iDEstado;
	}


	public String getHorarioApertura() {
		return horarioApertura;
	}


	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}


	public String getDireccionLocal() {
		return direccionLocal;
	}


	public void setDireccionLocal(String direccionLocal) {
		this.direccionLocal = direccionLocal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getGerenteLocal() {
		return gerenteLocal;
	}


	public void setGerenteLocal(String gerenteLocal) {
		this.gerenteLocal = gerenteLocal;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public double getMetros() {
		return metros;
	}


	public void setMetros(double metros) {
		this.metros = metros;
	}


	@Override
	public String toString() {
		return "Local [iDEstado=" + iDEstado + ", horarioApertura=" + horarioApertura + ", direccionLocal="
				+ direccionLocal + ", localidad=" + localidad + ", gerenteLocal=" + gerenteLocal + ", codigoPostal="
				+ codigoPostal + ", metros=" + metros + "]";
	}

}
