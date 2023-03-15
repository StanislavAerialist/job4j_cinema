package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Ticket;

import java.util.Collection;
import java.util.Optional;

public interface TicketRepository {

    Optional<Ticket> findById(int id);

    Optional<Ticket> findByRowAndPlace(int row, int place);

    Collection<Ticket> findAll();

}
