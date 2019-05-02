package com.ngApp.controller;

import com.ngApp.model.Ticket.Ticket;
import com.ngApp.service.Ticket.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TicketController {

    Date currentDate = new Date();

    @Autowired
    private TicketService ticketService;

    @PostMapping(value = "/createNewTicket")
    public Ticket postNewTicket(@RequestBody Ticket newTicket) {

        newTicket.setTkt_createdDate(currentDate);
      //  newTicket.setCreaterBy(longImEmpId);
       return ticketService.createNewTicket(newTicket);

    }
}
