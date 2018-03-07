package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Materias")
public class MateriaEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String numero;
	private String nombre;
	
	public MateriaEntity() {
	}
	
	public MateriaEntity(String numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}
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
	
	
	
}
