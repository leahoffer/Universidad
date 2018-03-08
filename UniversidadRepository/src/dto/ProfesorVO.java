package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProfesorVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int numeroLegajo;
	private String nombre;
	private DireccionVO direccion;
	private List<MateriaVO> materias;
	
	
	
	/*CONSTRUCTOR*/
	public ProfesorVO() {
		this.materias = new ArrayList<MateriaVO>();
		this.direccion = new DireccionVO();
	}
	/*CONSTRUCTOR*/
	public ProfesorVO(int numeroLegajo, String nombre, DireccionVO direccion, List<MateriaVO> materias) {
		super();
		this.numeroLegajo = numeroLegajo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.materias = materias;
	}
	/*GETTERS AND SETTERS*/
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
	public DireccionVO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionVO direccion) {
		this.direccion = direccion;
	}
	public List<MateriaVO> getMaterias() {
		return materias;
	}
	public void setMaterias(List<MateriaVO> materias) {
		this.materias = materias;
	}
	
	
}
