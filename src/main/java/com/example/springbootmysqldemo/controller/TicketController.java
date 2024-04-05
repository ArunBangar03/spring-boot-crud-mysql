package com.example.springbootmysqldemo.controller;

import com.example.springbootmysqldemo.dao.TicketDao;
import com.example.springbootmysqldemo.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTickets(@RequestBody List<Ticket> tickets) {
//		dao.save(tickets);
		dao.saveAll(tickets);
		return "ticket booked : " + tickets.size();
	}

	@PostMapping("/bookTicket")
	public Ticket bookTicket(@RequestBody Ticket ticket) {
//		dao.save(tickets);
//		dao.save(ticket);
		return dao.save(ticket);
	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}

}
