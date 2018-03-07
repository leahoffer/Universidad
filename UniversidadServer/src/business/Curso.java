package business;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	
	private int numeroCurso;
	private Materia materia;
	private Profesor profesor;
	private Set<Alumno> alumnos;
	private int cantidadMaxima;
	
	public Curso() {
		this.alumnos = new HashSet<Alumno>();
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	
	
	

}
