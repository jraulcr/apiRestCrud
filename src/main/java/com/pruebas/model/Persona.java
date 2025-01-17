//Crear una API REST desde cero con Spring Boot
//https://www.youtube.com/watch?v=jO-o3qQZDuU
package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	private Integer id;	
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private Integer edad;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
