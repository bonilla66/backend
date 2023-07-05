package com.grupo14.apirest.services.implementations;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.grupo14.apirest.models.dtos.SaveTicketDTO;
import com.grupo14.apirest.models.entities.Ticket;
import com.grupo14.apirest.repositories.TicketRepository;
import com.grupo14.apirest.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public void save(SaveTicketDTO info) {
		
		Ticket ticket = new Ticket();
		
		ticket.setLocalidad(info.getLocalidad());
		ticket.setUsuario(info.getUsuario());
		
		ticketRepository.save(null);
		
	}

	@Override
	public List<Ticket> findAllByUsuario(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
