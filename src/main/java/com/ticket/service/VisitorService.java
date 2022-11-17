package com.ticket.service;

import java.util.ArrayList;
import java.util.List;

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


	public List<Visitors> listVisit() {
		List<Visitors> listVisitors = new ArrayList<>();
		visitorRepo.findAll().forEach(visitor1 -> listVisitors.add(visitor1));
		return listVisitors;
	}


	
}
