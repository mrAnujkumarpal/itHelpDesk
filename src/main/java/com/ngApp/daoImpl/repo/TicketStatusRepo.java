package com.ngApp.daoImpl.repo;

import com.ngApp.model.Ticket.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketStatusRepo extends JpaRepository<TicketStatus,Integer> {

    TicketStatus  findById(int id);
}
