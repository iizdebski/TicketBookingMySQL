package com.izdebski.TicketBookingMySQL;

import java.util.Date;

import javax.sql.DataSource;

import com.izdebski.TicketBookingMySQL.entity.Ticket;
import com.izdebski.TicketBookingMySQL.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketBookingMySqlApplication implements CommandLineRunner{

	@Autowired
	private TicketBookingService ticketBookingService;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");

		ticketBookingService.createTicket(ticket);

		System.out.println("DataSource::"+dataSource);
	}
}
