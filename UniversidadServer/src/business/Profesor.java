package business;

import java.util.HashSet;
import java.util.Set;

public class Profesor {

	private int numeroLegajo;
	private String nombre;
	private Direccion direccion;
	private Set<Materia> materias;
	
	public Profesor() {
		this.materias = new HashSet<Materia>();
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Set<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}
	
	
	
	
}
