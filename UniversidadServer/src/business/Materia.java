package business;

import dao.MateriaDAO;
import entity.MateriaEntity;

public class Materia {

	private String numero;
	private String nombre;
	
	/*EMPTY CONSTRUCTOR*/
	public Materia() {
	}

	/*CONSTRUCTOR USING FIELDS*/
	public Materia(String numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}
	/*GETTERS AND SETTERS*/
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void save() 
	{
		MateriaDAO.getInstance().saveMateria(this.toEntity());	
	}

	public MateriaEntity toEntity() {
		MateriaEntity me = new MateriaEntity(this.numero, this.nombre);
		return me;
	}
	
	
	
}
