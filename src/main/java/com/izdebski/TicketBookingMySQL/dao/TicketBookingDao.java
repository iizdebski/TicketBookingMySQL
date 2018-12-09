package com.izdebski.TicketBookingMySQL.dao;

import com.izdebski.TicketBookingMySQL.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}