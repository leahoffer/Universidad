package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Alumnos")
public class AlumnoEntity {

	int legajo;
	String nombre;
	String estado;
	
	public AlumnoEntity() {
	}

	public AlumnoEntity(int legajo, String nombre, String estado) {
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
