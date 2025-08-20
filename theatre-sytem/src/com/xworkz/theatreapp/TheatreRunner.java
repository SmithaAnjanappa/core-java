package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieId(1);
        movie.setMovieName("kantara");
        movie.setNoOfSeats(105);
        movie.setNoOfTicketsAvailable(59);
        movie.setTicketPrice(200.36);
        movie.setMovieBudget("50 crores");
        movie.setDirector("Rishab sheety");

        Theatre theatre = new Theatre();
    boolean created =theatre.theatreRegistration(movie);
        System.out.println("the user is registered:L" +created);
        if(created){
            theatre.getTheatreInfo();
        }
    }
}
