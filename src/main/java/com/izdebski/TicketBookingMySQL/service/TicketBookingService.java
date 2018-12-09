package com.izdebski.TicketBookingMySQL.service;

import com.izdebski.TicketBookingMySQL.dao.TicketBookingDao;
import com.izdebski.TicketBookingMySQL.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    public Ticket createTicket(Ticket ticket) {
        return ticketBookingDao.save(ticket);
    }
    public Ticket getTicketById(Integer ticketId) {
        return ticketBookingDao.findOne(ticketId);
    }
    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingDao.findAll();
    }
    public void deleteTicket(Integer ticketId) {
        ticketBookingDao.delete(ticketId);
    }
    public Ticket updateTicket(Integer ticketId, String newEmail) {
        Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
        ticketFromDb.setEmail(newEmail);
        Ticket updatedTicket = ticketBookingDao.save(ticketFromDb);
        return updatedTicket;
    }
}