package com.example.springbootmysqldemo.dao;


import com.example.springbootmysqldemo.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
