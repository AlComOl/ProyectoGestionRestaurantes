package Gestion_Sucursales;

public class Empleado {

//	Atributos
	private static int IDlocal;
	private int metrosLocal,CodigoPostaLoc,telefonoProp;
	private String propietarioLocal,correoProp,UbicaLoc,DireccionLoc;
//	Constructor 
	public Empleado(){
		IDlocal=0;
		metrosLocal=0;
		CodigoPostaLoc=0;
		telefonoProp=0;
		propietarioLocal="";
		correoProp="";
		UbicaLoc="";
		DireccionLoc="";
		
	
	}
//	Constructor Argumentos
	
	public Empleado(int IDlocal,int metrosLocal,int CodigoPostaLoc,String propietarioLocal,String correoProp,String UbicaLoc,String DireccionLoc ) {
//		this.IDlocal=IDlocal;
		this.metrosLocal=metrosLocal;
		this.CodigoPostaLoc=CodigoPostaLoc;
		this.propietarioLocal=propietarioLocal;
		this.correoProp=correoProp;
		this.UbicaLoc=UbicaLoc;
		this.DireccionLoc=DireccionLoc;
		
	}




	public void setIDlocal(int iDlocal) {
		IDlocal = iDlocal;
	}

	public void setMetrosLocal(int metrosLocal) {
		this.metrosLocal = metrosLocal;
	}

	public void setCodigoPostaLoc(int codigoPostaLoc) {
		CodigoPostaLoc = codigoPostaLoc;
	}

	public void setTelefonoProp(int telefonoProp) {
		this.telefonoProp = telefonoProp;
	}

	public void setPropietarioLocal(String propietarioLocal) {
		this.propietarioLocal = propietarioLocal;
	}

	public void setCorreoProp(String correoProp) {
		this.correoProp = correoProp;
	}

	public void setUbicaLoc(String ubicaLoc) {
		this.UbicaLoc = ubicaLoc;
	}

	public void setDireccionLoc(String direccionLoc) {
		this.DireccionLoc = direccionLoc;
	}

	public int getIDlocal() {
		return this.IDlocal;
	}

	public int getTelefonoProp() {
		return this.telefonoProp;
	}

	public int getMetrosLocal() {
		return this.metrosLocal;
	}

	public int getCodigoPostaLoc() {
		return this.CodigoPostaLoc;
	}

	public String getPropietarioLocal() {
		return this.propietarioLocal;
	}

	public String getCorreoProp() {
		return this.correoProp;
	}

	public String getUbicaLoc() {
		return this.UbicaLoc;
	}

	public String getDireccionLoc() {
		return this.DireccionLoc;
	}
	
	public String toString() {
		return "Datos de Accesibles desde el Menu del Empleado"+"\n ID del Local"+getIDlocal()+"\n Telefono del Propietario"+getTelefonoProp()+"\n Metros del Local "+getMetrosLocal()+"\n Codigo postal del local"+getCodigoPostaLoc()+"\n Propietario del Local "+getPropietarioLocal()+"\n Correo electronico del propietario del local"+getCorreoProp()+"\n Ubicacion del local "+getUbicaLoc()+"\n Direccion del local"+getDireccionLoc();
	
	}
	
}
