package com.ticket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.Ticket;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository ticketRepo;

	public void addTicket(Ticket ticket) {
		ticketRepo.save(ticket);
	}

	public void updateTicket(Ticket ticket) {
		ticketRepo.save(ticket);
	}

	public void deleteTicket(int id) {
		ticketRepo.deleteById(id);
	}

	public List<Ticket> listTicket() {
		List<Ticket> listTickets = new ArrayList<>();
		ticketRepo.findAll().forEach(ticket1 -> listTickets.add(ticket1));
		
		return listTickets;
	}


}
