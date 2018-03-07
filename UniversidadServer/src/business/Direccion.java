package business;

import entity.DireccionEntity;

public class Direccion {

	private String calle;
	private int numero;
	private String cp;
	private String localidad;
	private int piso;
	private String depto;
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public DireccionEntity toEntity() {
		DireccionEntity de = new DireccionEntity(this.calle, this.numero, this.cp, this.localidad, this.piso, this.depto);
		return de;
	}
	
	
}
