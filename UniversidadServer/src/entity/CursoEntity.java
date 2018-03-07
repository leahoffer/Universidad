package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cursos")
public class CursoEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int numeroCurso;
	private MateriaEntity materia;
	private ProfesorEntity profesor;
	private Set<AlumnoEntity> alumnos;
	private int cantidadMaxima;
	
	
}
