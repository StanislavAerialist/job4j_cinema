package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Ticket;

import java.util.Collection;

@Service
public class SimpleTicketService implements TicketService {
    private final TicketService ticketService;

    public SimpleTicketService(TicketService sql2oTicketService) {
        this.ticketService = sql2oTicketService;
    }

    @Override
    public Collection<Ticket> findAll() {
        return ticketService.findAll();
    }

}
