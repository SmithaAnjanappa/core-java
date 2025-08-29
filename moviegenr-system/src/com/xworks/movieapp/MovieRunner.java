package com.xworks.movieapp;

import com.xworks.movieapp.comedy.Comedy;
import com.xworks.movieapp.moviegenr.MovieGenr;

public class MovieRunner {
    public static void main(String[] args) {
        MovieGenr movieGenr=new Comedy();
        movieGenr.moviegenr();
    }
}
