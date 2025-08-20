package com.xworkz.googleapp;

import com.xworkz.googleapp.google.Google;
import com.xworkz.googleapp.googleuser.GoogleUser;

public class GoogleRunner {
    public static void main(String[] args) {
        GoogleUser googleUser=new GoogleUser();
        googleUser.setGivenName("smitha");
        googleUser.setSurName("A");
        googleUser.setDob("01/12/2003");
        googleUser.setPhoneNumber(7018106789L);
        googleUser.setEmail("smitha@123");
        googleUser.setPassword("smitha890");
        googleUser.setConPassword("smitha890");


        Google google = new Google();
        boolean userCreate=google.userCreated(googleUser);
        System.out.println("the user is registered"+userCreate);

        if (userCreate){
            google.getGoogleInfo();
        }
    }
}
