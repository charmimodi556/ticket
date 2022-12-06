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

	@Autowired
	TicketHelper ticketHelper;

	public String addTicket(Ticket ticket) throws Exception {

		ticketHelper.validate(ticket);

		ticketRepo.save(ticket);
		return "Added ticket successfully !!";
	}

	public String updateTicket(Ticket ticket) throws Exception {
		ticketHelper.validate(ticket);
		ticketRepo.save(ticket);
		return "Updated ticket successfully !!";
	}

	public String deleteTicket(int id) {
		String msg = null;
		try {
			ticketRepo.deleteById(id);
			msg = "Record deleted";
		} catch (Exception e) {
			e.getMessage();
			msg = "Record not found";
		}
		return msg;
	}

	public List<Ticket> listTicket() {
		List<Ticket> listTickets = new ArrayList<>();
		ticketRepo.findAll().forEach(ticket1 -> listTickets.add(ticket1));

		return listTickets;
	}

	public int getAge(int id) {
		List<Ticket> listTickets = listTicket();
		int age=0;
		
		for(int i=0;i<listTickets.size();i++) {
			if(listTickets.get(i).getId() == id) {
				age = listTickets.get(i).getAge();
			}
		}
		
		return age;
	}

}
