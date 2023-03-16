package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.dto.FilmSessionDto;
import ru.job4j.cinema.model.FilmSession;
import ru.job4j.cinema.repository.FilmSessionRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class SimpleFilmSessionService implements FilmSessionService {

    private final FilmSessionRepository filmSessionRepository;
    private final FilmService filmService;
    private final HallService hallService;

    public SimpleFilmSessionService(FilmSessionRepository sql2oFilmSessionRepository,
                                    FilmService filmService, HallService hallService) {
        this.filmSessionRepository = sql2oFilmSessionRepository;
        this.filmService = filmService;
        this.hallService = hallService;
    }

    @Override
    public Collection<FilmSessionDto> findAll() {
        return filmSessionRepository.findAll().stream()
                .map(session -> new FilmSessionDto(session.getId(), getFilmName(session),
                        getHallName(session), session.getStartTime(), session.getEndTime(),
                        String.valueOf(session.getPrice()))).collect(Collectors.toList());
    }

    private String getFilmName(FilmSession filmSession) {
        return filmService.findById(filmSession.getFilmId()).get().getName();
    }

    private String getHallName(FilmSession filmSession) {
        return hallService.findById(filmSession.getHallsId()).get().getName();
    }
}
