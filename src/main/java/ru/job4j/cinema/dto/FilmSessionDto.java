package ru.job4j.cinema.dto;

import java.time.LocalDateTime;

public class FilmSessionDto {
    private int id;
    private String filmName;
    private String hallsName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String price;

    public FilmSessionDto(int id, String filmName, String hallsName,
                          LocalDateTime startTime, LocalDateTime endTime, String price) {
        this.id = id;
        this.filmName = filmName;
        this.hallsName = hallsName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getHallsName() {
        return hallsName;
    }

    public void setHallsName(String hallsName) {
        this.hallsName = hallsName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
