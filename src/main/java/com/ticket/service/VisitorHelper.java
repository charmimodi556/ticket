package com.ticket.service;

import org.springframework.stereotype.Component;

import com.ticket.Visitors;

@Component
public class VisitorHelper {
	public void validate(Visitors visitors) throws Exception {
		int findNameLen = visitors.getVname().length();
		int findVisitorIDLen = String.valueOf(visitors.getVid()).length();

		if (findVisitorIDLen > 4) {
			throw new Exception("ID digit length should be between 0 to 4");
		}
		
		if (findNameLen > 10) {
			throw new Exception("Name length should be between 0 to 10");
		}

		if (!visitors.getVname().matches("[a-zA-Z]+")) {
			throw new Exception("Name should not use special characters or space");
		}

		if (visitors.getVage() < 1 || visitors.getVage() > 100) {
			throw new Exception("Age is not valid");
		}
		
	}
}
