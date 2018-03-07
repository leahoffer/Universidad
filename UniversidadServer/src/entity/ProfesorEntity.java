package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Profesores")
public class ProfesorEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int numeroLegajo;
	private String nombre;
	@Embedded
	private DireccionEntity direccion;
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<MateriaEntity> materias;
	
	public ProfesorEntity(){}

	public ProfesorEntity(int numeroLegajo, String nombre, DireccionEntity direccion, Set<MateriaEntity> materias) {
		super();
		this.numeroLegajo = numeroLegajo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.materias = materias;
	}
	
	public ProfesorEntity(int numeroLegajo, String nombre, DireccionEntity direccion)
	{
		super();
		this.numeroLegajo = numeroLegajo;
		this.nombre = nombre;
		this.direccion = direccion;
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

	public DireccionEntity getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionEntity direccion) {
		this.direccion = direccion;
	}

	public Set<MateriaEntity> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<MateriaEntity> materias) {
		this.materias = materias;
	}
	
	
}
