package Gestion_Sucursales;

public class Encargado extends Empleado{

	//atributos 
	private int fechaInicioContra,fechaFinContra,menusualidad;
	private  String direccionProp;
	private Empleado a;
//	constructores
	public Encargado() {
		direccionProp="";
		fechaInicioContra=0;
		fechaFinContra=0;
		menusualidad=0;
	}
//constructor argumentos
	
	public Encargado(int IDlocal,int metrosLocal,int CodigoPostaLoc,String propietarioLocal,String correoProp,String UbicaLoc,String DireccionLoc,String direccionProp,int fechaInicioContra,int fechaFinContra,int menusualidad) {
//		super(IDlocal,metrosLocal,CodigoPostaLoc,propietarioLocal,correoProp,UbicaLoc,DireccionLoc);
		a=new Empleado(IDlocal,metrosLocal,CodigoPostaLoc,propietarioLocal,correoProp,UbicaLoc,DireccionLoc);
		this.direccionProp=direccionProp;
		this.fechaInicioContra=fechaInicioContra;
		this.fechaFinContra=fechaFinContra;
		this.menusualidad=menusualidad;
	}

	public String getDireccionProp() {
		return this.direccionProp;
	}
	public void setDireccionProp(String direccionProp) {
		this.direccionProp = direccionProp;
	}

	public int getFechaInicioContra() {
		return this.fechaInicioContra;
	}

	public void setFechaInicioContra(int fechaInicioContra) {
		this.fechaInicioContra = fechaInicioContra;
	}

	public int getFechaFinContra() {
		return this.fechaFinContra;
	}

	public void setFechaFinContra(int fechaFinContra) {
		this.fechaFinContra = fechaFinContra;
	}

	public int getMenusualidad() {
		return this.menusualidad;
	}

	public void setMenusualidad(int menusualidad) {
		this.menusualidad = menusualidad;
	}
	
	
	public Empleado devolverDatos() {
		return this.a;
	}

	@Override
	public String toString() {
		return " Codigo ID local " + a.getIDlocal()+ "\n fechaInicioContra " + getFechaInicioContra() + "\n fechaFinContra " + fechaFinContra
				+ "\n Menusualidad " + getMenusualidad() + "\n Fecha Inicio Contrato " + getFechaInicioContra()
				+ "\n Fecha Fin Contrato " + getFechaFinContra() + "\n Cantidad Menusualidad " + getMenusualidad()
				+ "\n Direcciion Propietario " + getDireccionProp() + "\n Telefono Propietario "+ getTelefonoProp() 
				+ "\n Metros Local " + a.getMetrosLocal()+ "\n Codigo Posta Local " + a.getCodigoPostaLoc() 
				+ "\n Nombre Propietario Local " + getPropietarioLocal()+ "\n Correo electronico Propietario"
				+ a.getCorreoProp() + "\n Ubicacion Local " + a.getUbicaLoc() + "\n Direccion Local "
				+ a.getDireccionLoc();
	}
	

}