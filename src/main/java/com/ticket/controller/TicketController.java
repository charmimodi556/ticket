package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.Ticket;
import com.ticket.service.TicketService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketService ticketService;

	@PostMapping("/addTicket")
	public String addTicket(@RequestBody Ticket ticket) throws Exception {
		String msgString = null;
		try {
			msgString = ticketService.addTicket(ticket);
		} catch (Exception e) {
			msgString = e.getMessage();
		}
		return msgString;
	}

	@PutMapping("/updateTicket")
	public String updateTicket(@RequestBody Ticket ticket) throws Exception {
		String msgString = null;
		try {
			msgString = ticketService.updateTicket(ticket);
		} catch (Exception e) {
			msgString = e.getMessage();
		}
		return msgString;
	}

	@DeleteMapping("/deleteTicket/{id}")
	public String deleteTicket(@PathVariable("id") int id) {
		String msgString = null;
		try {
			msgString = ticketService.deleteTicket(id);
		} catch (Exception e) {
			msgString = e.getMessage();
		}
		return msgString;
	}

	@GetMapping("/")
	public List<Ticket> listTicket() {
		List<Ticket> listTicket = ticketService.listTicket();
		return listTicket;
	}

}
