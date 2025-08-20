package com.xworkz.theatreapp.validation;
import com.xworkz.theatreapp.movie.Movie;

public class Validation {
    Movie movie;
    public boolean userValidation(Movie movie){
        boolean isValidated=false;
        boolean movieIdValid=false;
        boolean movieNameValid =false;
        boolean seatsValid =false;
        boolean ticketsValid =false;
        boolean priceValid=false;
        boolean budgetValid=false;
        boolean directorValid = false;

        if (movie.getMovieId()!=0){
            movieIdValid=true;
        }

        if (movie.getMovieName()!=null && !movie.getMovieName().isEmpty()){
            movieNameValid=true;
        }

        if(movie.getNoOfSeats()!=0){
            seatsValid=true;
        }

        if(movie.getNoOfTicketsAvailable()!=0){
            ticketsValid=true;
        }

        if (movie.getTicketPrice()!=0.0){
            priceValid=true;
        }

        if(movie.getMovieBudget()!=null && !movie.getMovieBudget().isEmpty()){
            budgetValid=true;
        }

        if (movie.getDirector()!=null && !movie.getDirector().isEmpty()){
            directorValid=true;
        }

        if(movieIdValid && movieNameValid && seatsValid && ticketsValid && priceValid && budgetValid && directorValid ){
            isValidated=true;
        }
            return isValidated;
    }

}
