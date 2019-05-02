package com.ngApp.daoImpl.Ticket;

import com.ngApp.daoImpl.repo.TicketRepo;
import com.ngApp.daoImpl.repo.TicketStatusRepo;
import com.ngApp.model.Ticket.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl {

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private TicketStatusRepo ticketStatusRepo;



    public Ticket addNewTicket(Ticket ticket) {

        ticket.setTicketStatus(ticketStatusRepo.findById(1));

        return ticketRepo.save(ticket);
    }


}
