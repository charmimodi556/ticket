package com.ticket.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TicketControllerTest {
	
	@Test
	public void isEvenAssertTrue() {
		TicketController ticketController = new TicketController();
		boolean val = ticketController.isEven(10);
		assertTrue(val);
	}
	
	@Test
	public void isEvenAssertFalse() {
		TicketController ticketController = new TicketController();
		boolean val = ticketController.isEven(11);
		assertFalse(val);
	}

}
