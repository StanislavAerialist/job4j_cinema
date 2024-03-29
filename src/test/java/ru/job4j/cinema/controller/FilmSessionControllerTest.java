package ru.job4j.cinema.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import ru.job4j.cinema.dto.FilmSessionDto;
import ru.job4j.cinema.service.FilmSessionService;

import java.util.List;

import static java.time.LocalDateTime.now;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FilmSessionControllerTest {
    private FilmSessionService filmSessionService;
    private FilmSessionController filmSessionController;

    @BeforeEach
    public void initServices() {
        filmSessionService = mock(FilmSessionService.class);
        filmSessionController = new FilmSessionController(filmSessionService);
    }

    @Test
    public void whenRequestFilmSessionsSchedulePageThenGetPageWithFilmSessions() {
        var filmSession1 = new FilmSessionDto(1, "film1", "hall1", now(),
                now().plusHours(2), "300");
        var filmSession2 = new FilmSessionDto(2, "film2", "hall2", now(),
                now().plusHours(3), "400");
        var expectedFilmSessions = List.of(filmSession1, filmSession2);
        when(filmSessionService.findAll()).thenReturn(expectedFilmSessions);

        var model = new ConcurrentModel();
        var view = filmSessionController.getAll(model);
        var actualFilmSessions = model.getAttribute("filmSessions");

        assertThat(view).isEqualTo("filmSessions/schedule");
        assertThat(actualFilmSessions).isEqualTo(expectedFilmSessions);
    }
}