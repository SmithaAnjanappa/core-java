package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazonUser.AmazonUser;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonUser amazonUser = new AmazonUser();
        amazonUser.setGivenName("smitha");
        amazonUser.setSurName("A");
        amazonUser.setEmail("smitha@gmail.com");
        amazonUser.setPhoneNumber(7018160789L);
        amazonUser.setPassword("smitha123");
        amazonUser.setcPwd("smitha123");

        Amazon amazon=new Amazon();
        boolean userCreated=amazon.createUserRegistered(amazonUser);
        System.out.println("the user registered" +userCreated);

        if (userCreated){
            amazon.getAmazonInfo();

        }
    }
}
