package ProgramaArrayList_version1_2;

public class LocalAlquilado extends Local{
	
	private String propietarioLocal ;
	private String telefonoPropietario;
	private String correoPropietario;
	private String direccionProp;
	private String fechaInicioContrato;
	private String fechaFinContrato;
	
	
	public LocalAlquilado(String propietarioLocal,String telefonoPropietario,String correoPropietario,String direccionProp,String fechaInicioContrato,String fechaFinContrato, int estadoOperacion, String horarioApertura, String direccionLocal, String localidad, String gerenteLocal, int codigoPostal,double metros) {
		super(estadoOperacion,horarioApertura,direccionLocal,localidad,gerenteLocal,codigoPostal,metros);
		this.propietarioLocal=propietarioLocal;
		this.telefonoPropietario=telefonoPropietario;
		this.correoPropietario=correoPropietario;
		this.direccionProp=direccionProp;
		this.fechaInicioContrato=fechaInicioContrato;
		this.fechaFinContrato=fechaFinContrato;
	}



	public String getPropietarioLocal() {
		return propietarioLocal;
	}


	public void setPropietarioLocal(String propietarioLocal) {
		this.propietarioLocal = propietarioLocal;
	}


	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}


	public void setTelefonoPropietario(String telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}


	public String getCorreoPropietario() {
		return correoPropietario;
	}


	public void setCorreoPropietario(String correoPropietario) {
		this.correoPropietario = correoPropietario;
	}


	public String getDireccionProp() {
		return direccionProp;
	}


	public void setDireccionProp(String direccionProp) {
		this.direccionProp = direccionProp;
	}


	public String getFechaInicioContrato() {
		return fechaInicioContrato;
	}


	public void setFechaInicioContrato(String fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}


	public String getFechaFinContrato() {
		return fechaFinContrato;
	}


	public void setFechaFinContrato(String fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}
	
	@Override
	public String toString() {
		return super.toString()+"LocalAlquilado [propietarioLocal=" + propietarioLocal + ", telefonoPropietario=" + telefonoPropietario
				+ ", correoPropietario=" + correoPropietario + ", direccionProp=" + direccionProp
				+ ", fechaInicioContrato=" + fechaInicioContrato + ", fechaFinContrato=" + fechaFinContrato + "]";
	}
}
