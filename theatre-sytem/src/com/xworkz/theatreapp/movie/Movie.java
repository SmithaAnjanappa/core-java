package com.xworkz.theatreapp.movie;

public class Movie {
    private int movieId;
    private String movieName;
    private int noOfSeats;
    private int noOfTicketsAvailable;
    private double ticketPrice;
    private String movieBudget;
    private String Director;

    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfTicketsAvailable() {
        return noOfTicketsAvailable;
    }

    public void setNoOfTicketsAvailable(int noOfTicketsAvailable) {
        this.noOfTicketsAvailable = noOfTicketsAvailable;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getMovieBudget() {
        return movieBudget;
    }

    public void setMovieBudget(String movieBudget) {
        this.movieBudget = movieBudget;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }


}
