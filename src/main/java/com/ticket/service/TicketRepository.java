package com.ticket.service;

import org.springframework.data.repository.CrudRepository;

import com.ticket.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
