package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String addTicket(@RequestBody Visitors visitors) throws Exception{
		String msgString = null;
		try {		
		visitorService.addVisitor(visitors);
			msgString = "Visitors details added successfully";
		} catch (Exception e) {
			msgString = e.getMessage();
		}
		return msgString;
	}
	
	@GetMapping("/")
	public List<Visitors> listVisitor(){
	 List<Visitors> lVisitors = visitorService.listVisit();
	 return lVisitors;
	}
	
	@GetMapping("/{vname}")
	public Visitors findVisitorDetails(@PathVariable("vname") String vname){
	Visitors visitorDetail = visitorService.findVisitorDetail(vname);
	 return visitorDetail;
	}
	

}
