package com.grupo14.apirest.models.entities;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Table(name = "usuario")
@Entity
@NoArgsConstructor
@ToString(exclude = {"roles","tickets","colaboraciones","usuarioEmisor","usuarioReceptor"})
public class Usuario {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "estado")
	private Boolean estado = true;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "usuario_rol",
			joinColumns = @JoinColumn(name = "id_usuario"),
			inverseJoinColumns = @JoinColumn(name = "id_rol")
			)
	@JsonIgnore
	private List<Rol> roles;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Ticket> tickets;
	
	/*
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Colaboracion> colaboraciones;*/

	@OneToMany(mappedBy = "emisor", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Transaccion> usuarioEmisor;
	
	@OneToMany(mappedBy = "receptor", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Transaccion> usuarioReceptor;
	
	public Usuario(String usuario, String email, Boolean estado) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.estado = estado;
	}
	
	
	
	
}
