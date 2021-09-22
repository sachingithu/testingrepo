package com.marlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.dao.TicketDao;
import com.marlabs.model.Ticket;
@RestController
public class TicketController {
	@Autowired
	private TicketDao dao;
	@GetMapping("/findTicket")
	public List<Ticket> findTickets(){
		return dao.getTicketInfo();
	}
	@GetMapping("/findTicketByCategory/{category}")
	public List<Ticket> findTicketsByCategory(@PathVariable String category){
		return dao.getTicketInfoBycategory(category);
	}
}
