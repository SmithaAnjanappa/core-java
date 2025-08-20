package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validation.Validation;

public class Theatre {
    Movie movie;
    public boolean theatreRegistration(Movie movie) {
        boolean isTheatreRegistered = false;

        Validation validation = new Validation();
        boolean moviesValidated=validation.userValidation(movie);
        if (moviesValidated) {
            this.movie = movie;
            isTheatreRegistered=true;
        }
        return isTheatreRegistered;
    }
 public  void getTheatreInfo(){
        System.out.println("the theatre id is :" +movie.getMovieId());
     System.out.println("the movie name is " +movie.getMovieName());
     System.out.println("the budget of the movie is:"+movie.getMovieBudget());
     System.out.println("the number of tickets available are:"+movie.getNoOfTicketsAvailable());
     System.out.println("the ticket price is:" +movie.getTicketPrice());
     System.out.println("the movie seats is is:" +movie.getNoOfSeats());
     System.out.println("the director is:" +movie.getDirector());
 }
}
