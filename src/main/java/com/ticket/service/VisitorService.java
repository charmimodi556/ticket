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
	VisitorHelper visitorHelper;
	
	@Autowired
	TicketRepository ticketRepo;
	
	
	public void addVisitor(Visitors visitors) throws Exception {
		visitorHelper.validate(visitors);
		visitorRepo.save(visitors);
	}


	public List<Visitors> listVisit() {
		List<Visitors> listVisitors = new ArrayList<>();
		visitorRepo.findAll().forEach(visitor1 -> listVisitors.add(visitor1));
		return listVisitors;
	}


	public Visitors findVisitorDetail(String vname) {
		List<Visitors> listVisitors = listVisit();
		Visitors visitor = null;
		
		for(int i=0;i<listVisitors.size();i++) {
			if(listVisitors.get(i).getVname().equalsIgnoreCase(vname)) {
				visitor = listVisitors.get(i);
			}
		}
		return visitor;
	}


	
}
