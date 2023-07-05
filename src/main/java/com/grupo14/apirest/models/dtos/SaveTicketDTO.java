package com.grupo14.apirest.models.dtos;

import java.util.Date;

import com.grupo14.apirest.models.entities.Localidad;
import com.grupo14.apirest.models.entities.Usuario;

import lombok.Data;

@Data
public class SaveTicketDTO {
	
	
	//TODO: Hacer el campo de codigoQR
	
	
	private Localidad localidad;
	
	private Usuario usuario;
	
}
