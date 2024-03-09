package ProgramaArrayList_version1_2;

public class LocalPropio extends Local{
	
	private String nombre;
	private String fechaCompra;
	
	
	public LocalPropio( int estadoOperacion, String horarioApertura, String direccionLocal, 
			String localidad, String gerenteLocal, int codigoPostal,double metros,
			String nombre, String fechaCompra) {
		
		super(estadoOperacion,horarioApertura,direccionLocal, 
				localidad,gerenteLocal,codigoPostal,metros);
		this.nombre=nombre;
		this.fechaCompra=fechaCompra;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	@Override
	public String toString() {
		return super.toString()+"nombre=" + nombre + ", fechaCompra=" + fechaCompra + "]";
	}
	

}
