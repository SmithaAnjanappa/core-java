package com.xworkz.flipkartapp.flipkart;

import com.xworkz.flipkartapp.flipkartuser.FlipkartUser;

public class Flipkart {
    FlipkartUser flipkartUser;
    public boolean flipkartUserRegisterd(FlipkartUser flipkartUser) {
        boolean isUserRegistered = false;
        boolean isGivenNameValud = false;
        boolean surNameValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;
        boolean conPwd = false;
        boolean phoneNumberValid = false;

        if (flipkartUser.getGivenName() != null) {
            isGivenNameValud = true;
        } else {
            System.out.println("the given name is not valid");
        }

        if (flipkartUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("the sur name is not valid");
        }

        if (flipkartUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("the email is not valid");
        }

        if (flipkartUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("tge password is not valid");
        }

        if (flipkartUser.getConfirmPwd() != null) {
            conPwd = true;
        } else {
            System.out.println("the confirm password is not valid");
        }

        if (flipkartUser.getPhoneNumber() != 0) {
            phoneNumberValid = true;
        } else {
            System.out.println("the phone number is not valid");
        }
        if (isGivenNameValud && surNameValid && emailValid && passwordValid && conPwd && phoneNumberValid) {
            isUserRegistered = true;
            this.flipkartUser = flipkartUser;
        }
        return isUserRegistered;
    }
    public void getFlipkartUserInfo(){
        System.out.println("the user name is" +flipkartUser.getGivenName());
        System.out.println("the sur name is" +flipkartUser.getSurName());
        System.out.println("the user email is" +flipkartUser.getEmail());
        System.out.println("the user password is" +flipkartUser.getPassword());
        System.out.println("the user confirm password  is" +flipkartUser.getConfirmPwd());
        System.out.println("the user name is" +flipkartUser.getPhoneNumber());
    }
}
