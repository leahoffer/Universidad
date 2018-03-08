package controller;

import business.*;
import dto.*;

public class Controller {

	private static Controller instance;
	/*private Set<Alumno> alumnos;
	private Set<Profesor> profesores;
	private Set<Curso> cursos;
	private Set<Materia> materias;
	*/
	
	public static Controller getInstance() {
		if(instance == null)
			instance = new Controller();
		return instance;
	}
	
	private Controller() {
		/*this.alumnos = new HashSet<Alumno>();
		this.profesores = new HashSet<Profesor>();
		this.cursos = new HashSet<Curso>();
		this.materias = new HashSet<Materia>();
		*/
	}

	public void agregarAlumno(AlumnoVO alumno) {
		Alumno a = new Alumno();
		a.setLegajo(alumno.getLegajo());
		a.setNombre(alumno.getNombre());
		a.setEstado(alumno.getEstado());
		a.save();
	}

	public void agregarMateria(MateriaVO materia) {
		Materia m = new Materia();
		m.setNombre(materia.getNombre());
		m.setNumero(materia.getNumero());
		m.save();
	}

	public void agregarProfesor(ProfesorVO profesor) {
		Profesor p = new Profesor();
		Direccion d = new Direccion(profesor.getDireccion().getCalle(), profesor.getDireccion().getNumero(), profesor.getDireccion().getCp(), profesor.getDireccion().getLocalidad(), profesor.getDireccion().getPiso(), profesor.getDireccion().getDepto());
		p.setNombre(profesor.getNombre());
		p.setNumeroLegajo(profesor.getNumeroLegajo());
		p.setDireccion(d);
		p.save();
	}
	
	
	
}
