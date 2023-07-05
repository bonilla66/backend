package com.grupo14.apirest.repositories;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.grupo14.apirest.models.entities.Ticket;

public interface TicketRepository extends ListCrudRepository<Ticket, UUID>{

}
