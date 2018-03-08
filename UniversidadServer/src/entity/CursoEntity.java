package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cursos")
public class CursoEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int numeroCurso;
	@OneToOne
	private MateriaEntity materia;
	private ProfesorEntity profesor;
	private List<AlumnoEntity> alumnos;
	private int cantidadMaxima;
	
	
	/*CONSTRUCTOR*/
	public CursoEntity() {
		this.materia = new MateriaEntity();
		this.profesor = new ProfesorEntity();
		this.alumnos = new ArrayList<AlumnoEntity>();
	}
	
	/**GETTERS AND SETTERS*/
	public int getNumeroCurso() {
		return numeroCurso;
	}
	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}
	public MateriaEntity getMateria() {
		return materia;
	}
	public void setMateria(MateriaEntity materia) {
		this.materia = materia;
	}
	public ProfesorEntity getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorEntity profesor) {
		this.profesor = profesor;
	}
	public List<AlumnoEntity> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoEntity> alumnos) {
		this.alumnos = alumnos;
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	
	
	
}
