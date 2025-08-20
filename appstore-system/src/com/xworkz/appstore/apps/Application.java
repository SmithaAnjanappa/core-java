package com.xworkz.appstore.apps;

import com.xworkz.appstore.users.Users;
import com.xworkz.appstore.validation.Validation;

public class Application {
    Users user;
    public boolean applicationRegister(Users user){
        boolean isRegistered=false;
        Validation validation=new Validation();
        boolean reg=validation.checkUserIsValid(user);
        if (reg){
            this.user= user;
            isRegistered=true;
        }


        return isRegistered;
    }

    public void getInfo(){
        System.out.println("the given name is;" +user.getGivenName());
        System.out.println("the sur name is:"+user.getSurName());
        System.out.println("the user email is :"+user.getUserEmail());
        System.out.println("the email is:"+user.getUserEmail());
        System.out.println("the password is :"+user.getPassword());
        System.out.println("the confirm password is:"+user.getConfirmPassword());
        System.out.println("the state is:"+user.getState());
        System.out.println("the city is:"+user.getCity());
        System.out.println("the country is:"+user.getCountry());
        System.out.println("the adress is:"+user.getAddress());
        System.out.println("the dob is:"+user.getDOB());
        System.out.println("the age is:"+user.getAge());
        System.out.println("the idProof is:"+user.getIdProof());
        System.out.println("the gender is:"+user.getGender());
        System.out.println("the occupation is:"+user.getOccupation());
    }
}
