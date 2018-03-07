package business;

import entity.AlumnoEntity;

public class Alumno {
	
	int legajo;
	String nombre;
	String estado;
	
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
	
	public AlumnoEntity toEntity() {
		AlumnoEntity ae = new AlumnoEntity(this.legajo, this.nombre, this.estado);
		return ae;
	}
	
}
