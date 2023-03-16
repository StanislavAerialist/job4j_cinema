package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Ticket;

import java.util.Collection;

public interface TicketService {

    Collection<Ticket> findAll();
}
