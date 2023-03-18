package ru.job4j.cinema.service;

import ru.job4j.cinema.model.Hall;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface HallService {

    Optional<Hall> findById(int id);

    Collection<Hall> findAll();

    Optional<Hall> findByName(String name);

    List<Integer> getRowsByName(String name);

    List<Integer> getPlacesByName(String name);
}
