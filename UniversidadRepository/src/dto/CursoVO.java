package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CursoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int numeroCurso;
	private MateriaVO materia;
	private ProfesorVO profesor;
	private List<AlumnoVO> alumnos;
	private int cantidadMaxima;
	
	
	public CursoVO(int numeroCurso, MateriaVO materia, ProfesorVO profesor, List<AlumnoVO> alumnos,
			int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.cantidadMaxima = cantidadMaxima;
	}
	/*CONSTRUCTOR*/
	public CursoVO() {
		this.materia = new MateriaVO();
		this.profesor = new ProfesorVO();
		this.alumnos = new ArrayList<AlumnoVO>();
	}
	/*GETTERS AND SETTERS*/
	public int getNumeroCurso() {
		return numeroCurso;
	}
	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}
	public MateriaVO getMateria() {
		return materia;
	}
	public void setMateria(MateriaVO materia) {
		this.materia = materia;
	}
	public ProfesorVO getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorVO profesor) {
		this.profesor = profesor;
	}
	public List<AlumnoVO> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoVO> alumnos) {
		this.alumnos = alumnos;
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	
	
	
}
