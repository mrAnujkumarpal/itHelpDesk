package com.ngApp.service.Ticket;

import com.ngApp.daoImpl.Ticket.TicketDaoImpl;
import com.ngApp.daoImpl.repo.TicketRepo;
import com.ngApp.model.Ticket.Ticket;
import com.ngApp.model.Ticket.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDaoImpl ticketDao;



    @Override
    public Ticket createNewTicket(Ticket newTicket){

        return ticketDao.addNewTicket(newTicket);
    }


}
