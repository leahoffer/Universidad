package dto;

import java.io.Serializable;

public class AlumnoVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int legajo;
	private String nombre;
	private String estado;
	
	
	
	public AlumnoVO() {
	}
	public AlumnoVO(int legajo, String nombre, String estado) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
