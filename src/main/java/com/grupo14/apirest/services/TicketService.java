package com.grupo14.apirest.services;

import java.util.List;
import java.util.UUID;

import com.grupo14.apirest.models.dtos.SaveTicketDTO;
import com.grupo14.apirest.models.entities.Ticket;

public interface TicketService {

	void save(SaveTicketDTO info);
	
	List<Ticket> findAllByUsuario(UUID id);
	
}
