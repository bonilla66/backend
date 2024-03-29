package com.grupo14.apirest.models.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString(exclude = {"usuarios"})
@Table(name = "rol")
public class Rol {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@ManyToMany(mappedBy = "roles")
	@JsonIgnore
	private List<Usuario> usuarios;

	public Rol(Integer id, String nombre, String description, Boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.description = description;
		this.estado = estado;
	}
	
}
