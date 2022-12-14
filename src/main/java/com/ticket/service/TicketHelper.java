package com.ticket.service;

import org.springframework.stereotype.Component;

import com.ticket.Ticket;

@Component
public class TicketHelper {

	public void validate(Ticket ticket) throws Exception {
		int findNameLen = ticket.getName().length();

		if(ticket.getName().equalsIgnoreCase("charmi") || ticket.getName().equalsIgnoreCase("dhaval") ||ticket.getName().equalsIgnoreCase("darsh") || ticket.getName().equalsIgnoreCase("ruta") || ticket.getName().equalsIgnoreCase("mili")) {
			throw new Exception("Name should not be Charmi or Dhaval or Darsh or Ruta or Mili");
		}
		
		if (findNameLen > 10) {
			throw new Exception("Name length should be between 0 to 10");
		}

		if (!ticket.getName().matches("[a-zA-Z]+")) {
			throw new Exception("Name should not use special characters or space");
		}

		if (ticket.getAge() < 1 || ticket.getAge() > 100) {
			throw new Exception("Age is not valid");
		}

		if (ticket.getPrice() < 1 || ticket.getPrice() > 200) {
			throw new Exception("Price should not above 200");
		}

	}

}
