package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
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
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketService ticketService;
	
	@PostMapping("/addTicket")
	public String addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
		return "Added ticket successfully !!";
	}
	
	@PutMapping("/updateTicket")
	public String updateTicket(@RequestBody Ticket ticket) {
		ticketService.updateTicket(ticket);
		return "Updated ticket successfully !!";
	}
	
	@DeleteMapping("/deleteTicket/{id}")
	public String deleteTicket(@PathVariable("id") int id) {
		ticketService.deleteTicket(id);
		return "Ticket deleted successfully !!";
	}
	
	@GetMapping("/")
	public List<Ticket> listTicket() {
	  List<Ticket> listTicket =	ticketService.listTicket();
		return listTicket;
	}
	
}
