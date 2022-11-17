package com.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ticket.Visitors;

@Service
public class VisitorService {

	@Autowired
	VisitorRepository visitorRepo;
	
	@Autowired
	TicketRepository ticketRepo;
	
	
	public void addVisitor(Visitors visitors) {
		visitorRepo.save(visitors);
	}

//	public List<Visitors> listVisit(String name) {
//		List<Ticket> listTickets = new ArrayList<>();
//		ticketRepo.findAll().forEach(ticket1 -> listTickets.add(ticket1));
//		return null;
//	}
	
	
}
