package com.xworkz.appstore;

import com.xworkz.appstore.apps.Application;
import com.xworkz.appstore.users.Users;

public class AppstoreRunner {
    public static void main(String[] args) {
        Users users=new Users();
        users.setGivenName("Smitha");
        users.setSurName("A");
        users.setUserEmail("smitha@123gmail.com");
        users.setPhoneNumber("7019180673");
        users.setPassword("smitha123");
        users.setConfirmPassword("smitha123");
        users.setState("karanataka");
        users.setCity("bangalore");
        users.setCountry("India");
        users.setAge(22);
        users.setDOB("01/12/2003");
        users.setAddress("yelahanka bangalore");
        users.setIdProof("879456122");
        users.setGender("female");
        users.setOccupation("engineer");


        Application application=new Application();
        boolean app=application.applicationRegister(users);
        System.out.println("the user provided information is :" +app);
        if (app){
            application.getInfo();
        }
    }
}
