package com.ngApp.daoImpl.repo;

import com.ngApp.model.Ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {
}
