package com.xworkz.googleapp.google;

import com.xworkz.googleapp.googleuser.GoogleUser;

public class Google {
    GoogleUser googleUser;
    public boolean userCreated(GoogleUser googleUser){
       boolean isUserRegistered=false;
        boolean givenNameValid=false;
        boolean surNameValid=false;
        boolean dobValid=false;
        boolean phoneValid=false;
        boolean emailValid=false;
        boolean passwordValid =false;
        boolean conPasswordValid =false;

        if (googleUser.getGivenName()!=null){
            givenNameValid=true;
        }else {
            System.out.println("the given name is not valid");
        }

        if (googleUser.getSurName()!=null){
            surNameValid=true;
        }else {
            System.out.println("the sur name is not valid");
        }
        if (googleUser.getDob()!=null){
            dobValid=true;
        }else {
            System.out.println("the dob is not valid");
        }

        if (googleUser.getPhoneNumber()!=0){
            phoneValid=true;
        }else {
            System.out.println("the phone number is not valid");
        }

        if (googleUser.getEmail()!=null){
            emailValid=true;
        }else {
            System.out.println("the email is not valid");
        }

        if (googleUser.getPassword()!=null){
            passwordValid=true;
        }else {
            System.out.println("the password is not valid");
        }

        if (googleUser.getConPassword() == googleUser.getPassword()){
            conPasswordValid=true;
        }else {
            System.out.println("the con password is not valid");
        }
        if (givenNameValid && surNameValid && dobValid && phoneValid && emailValid &&  passwordValid && conPasswordValid){
            isUserRegistered=true;
            this.googleUser=googleUser;
        }
        return isUserRegistered;
    }
    public void getGoogleInfo(){
        System.out.println("the user name is" +googleUser.getGivenName());
        System.out.println("the user sur  name is" +googleUser.getSurName());
        System.out.println("the user name is" +googleUser.getDob());
        System.out.println("the user phone number is:" +googleUser.getPhoneNumber());
        System.out.println("the user email is" +googleUser.getEmail());
        System.out.println("the user passwotd is" +googleUser.getPassword());
        System.out.println("the user name is" +googleUser.getConPassword());
    }

}
