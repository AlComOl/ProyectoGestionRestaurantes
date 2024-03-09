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
	protected  int idLocal;
	protected int estadoOperacion;
//	public final static int ABIERTO=1, CERRADO=2, ENREFORMA=3;
	//esta estructura almacena los tres estados dentro , ordenando el estado numerico y despues dando la cadena del arrary en el toString
	protected static final String []estadoOperaciones= {"Abierto","Cerrado","EnReforma"};
	protected String horarioApertura;
	protected String direccionLocal;
	protected String localidad;
	protected String gerenteLocal;
	protected int codigoPostal;
	protected double metros;
	
	
//	constructor
	
	public Local(int estadoOperacion, String horarioApertura, String direccionLocal, 
			String localidad, String gerenteLocal, int codigoPostal,double metros) {
		id++;
		this.idLocal=id;
		this.estadoOperacion=estadoOperacion;
		this.horarioApertura=horarioApertura;
		this.direccionLocal=direccionLocal;
		this.localidad=localidad;
		this.gerenteLocal=gerenteLocal;
		this.codigoPostal=codigoPostal;
		this.metros=metros;
		
		
	}


	public int getIdLocal() {
		return idLocal;
	}


	public  void setIdLocal(int idLocal) {
		this.idLocal=idLocal;
	}


	public int getiDEstado() {
		return estadoOperacion;
	}


	public void setiDEstado(int estadoOperacion) {
		this.estadoOperacion = estadoOperacion;
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

	/******************************************
	 * @descripcion la funcion devuelve todas las
	 *  caracteristicas del local
	 *  tambien tiene el switch que lo que hace es segun el 
	 *  valor numerico muestra una de las 3 cadenas
	 * 
	 *******************************************/
	@Override
	public String toString() {
		System.out.println("Las caracteristicas del local son:");
		String cadenaOperacion="";
		  switch (estadoOperacion){
		  case 1: 
			  cadenaOperacion="Abierto";
		  break;
		  case 2:
			  cadenaOperacion="Cerrado";
		  break;
		  case 3: 
			  cadenaOperacion="En Reforma";
		  break;
		  }
		  	return "Local [idLocal" +idLocal+ "iDEstado=" + cadenaOperacion + ", horarioApertura=" + horarioApertura + ", direccionLocal="
		  		+ direccionLocal + ", localidad=" + localidad + ", gerenteLocal=" + gerenteLocal + ", codigoPostal="
				+ codigoPostal + ", metros=" + metros + "]";
		  }
	}


