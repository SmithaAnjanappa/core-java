package com.xworkz.appstore.validation;

import com.xworkz.appstore.users.Users;

public class Validation {
    public boolean checkUserIsValid(Users user){
        boolean isValidated=false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean passwordValid = false;
        boolean confirmValid = false;
        boolean cityValid = false;
        boolean stateValid = false;
        boolean countryValid = false;
        boolean ageValid = false;
        boolean dobValid = false;
        boolean addressValid =false;
        boolean proofValid = false;
        boolean genderValid = false;
        boolean occupationValid = false;


        if (user.getGivenName()!=null &&!user.getGivenName().isEmpty()){
            givenNameValid=true;
        }else System.out.println("the given name is not valid");


        if (user.getSurName()!=null && !user.getSurName().isEmpty()){
            surNameValid=true;
        }else System.out.println("the surname is not valid");


        if (user.getUserEmail()!=null &&!user.getUserEmail().isEmpty()){
            emailValid=true;
        }else System.out.println("the email is not valid");

        if (user.getPhoneNumber()!=null && !user.getPhoneNumber().isEmpty() && user.getPhoneNumber().length()<=10){
            phoneValid=true;
        }else {
            System.out.println("the phone is not valid");

        }
        if (user.getPassword()!=null && !user.getPassword().isEmpty() ){
            passwordValid=true;
        }else System.out.println("the pasword is not valid");


        if (user.getConfirmPassword()==user.getPassword()){
            confirmValid=true;
        }
        else System.out.println("the con pasword is jot valid");

        if (user.getCity()!=null && !user.getCity().isEmpty()){
            cityValid=true;
        }else System.out.println("the city is not valid");

        if (user.getState()!=null && !user.getState().isEmpty()){
            stateValid=true;
        }else System.out.println("the state is not valid");

        if (user.getCountry()!=null &&!user.getCountry().isEmpty()){
            countryValid=true;
        }else System.out.println("the country is not valid");

        if (user.getAge()!=0){
            ageValid=true;
        }else {
            System.out.println("the age is not valid");
        }

        if (user.getDOB()!=null && !user.getDOB().isEmpty()){
            dobValid=true;
        }else System.out.println("the dob is not valid");

        if (user.getAddress()!=null && !user.getAddress().isEmpty()){
            addressValid=true;
        }
        else System.out.println("the address is not valid");

        if (user.getIdProof()!=null && !user.getIdProof().isEmpty()){
            proofValid=true;
        }else System.out.println("the proof is not valid");

        if (user.getGender()!=null && !user.getGender().isEmpty()){
            genderValid=true;
        }else System.out.println("the gender is not valid");

        if (user.getOccupation()!=null && !user.getOccupation().isEmpty()){
            occupationValid=true;
        }
        else System.out.println("the occupation is not valid");
        if (givenNameValid && surNameValid && emailValid && phoneValid && passwordValid && confirmValid && cityValid && stateValid && countryValid && ageValid && dobValid && addressValid && proofValid && genderValid && occupationValid){
            isValidated=true;
        }

        return isValidated;
    }
}
