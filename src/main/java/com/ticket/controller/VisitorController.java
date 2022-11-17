package com.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ticket.Visitors;
import com.ticket.service.VisitorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/visitors")
public class VisitorController {
	
	@Autowired
	VisitorService visitorService;
	
	@PostMapping("/addVisitor")
	public String addTicket(@RequestBody Visitors visitors) {
		String msgString = "Visitors details added successfully";
		visitorService.addVisitor(visitors);
	
		return msgString;
	}
	
//	public List<Visitors> listVisitor(@PathVariable("name") String name){
//	 List<Visitors> lVisitors = visitorService.listVisit(name);
//	 return lVisitors;
//	}

}
