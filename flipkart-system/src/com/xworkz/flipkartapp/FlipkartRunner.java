package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkart.Flipkart;
import com.xworkz.flipkartapp.flipkartuser.FlipkartUser;

public class FlipkartRunner {
    public static void main(String[] args) {
        FlipkartUser flipkartUser=new FlipkartUser();
        flipkartUser.setGivenName("smitha");
        flipkartUser.setSurName("A");
        flipkartUser.setEmail("smitha@gmail.com");
        flipkartUser.setPassword("smitha123");
        flipkartUser.setConfirmPwd("smitha123");
        flipkartUser.setPhoneNumber(7016180762L);

        Flipkart flipkart=new Flipkart();
        boolean userRegister=flipkart.flipkartUserRegisterd(flipkartUser);
        System.out.println("the user is registered" +userRegister);


        if (userRegister){
        flipkart.getFlipkartUserInfo();
}
    }
}
