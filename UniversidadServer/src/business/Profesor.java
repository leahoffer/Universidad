package business;

import java.util.ArrayList;
import java.util.List;

import dao.ProfesorDAO;
import entity.MateriaEntity;
import entity.ProfesorEntity;

public class Profesor {

	private int numeroLegajo;
	private String nombre;
	private Direccion direccion;
	private List<Materia> materias;
	
	public Profesor() {
		this.materias = new ArrayList<Materia>();
		this.direccion = new Direccion();
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

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	public ProfesorEntity toEntity()
	{
		ProfesorEntity pe = new ProfesorEntity();
		List<MateriaEntity> mes = new ArrayList<MateriaEntity>();
		pe.setNombre(this.nombre);
		pe.setNumeroLegajo(this.numeroLegajo);
		pe.setDireccion(this.direccion.toEntity());
		for(Materia m : this.materias)
			mes.add(m.toEntity());
		return pe;
	}

	public void save() {
		ProfesorDAO.getInstance().saveProfesor(this.toEntity());
		
	}
	
	
}
