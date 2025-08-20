package com.xworkz.passportapp;

import com.xworkz.passportapp.passportsewa.PassportSewa;
import com.xworkz.passportapp.user.PassportUser;

public class PassportRunner {
    public static void main(String[] args) {
        PassportUser passportUser = new PassportUser();
        passportUser.setCpvLocation("po");
        passportUser.setDcdrLocation("bengaluru");
        passportUser.setGivenName("Smitha");
        passportUser.setSurName("A");
        passportUser.setPwd("smitha");
        passportUser.setCpwd("smitha");
        passportUser.setTest("bangalore");
        passportUser.setBirthPlace("enter");
        passportUser.setDob("01/12");
        passportUser.setEmail("smitha");
        passportUser.setIsEmailSame("smitha");
        passportUser.setIsEmailAndLoginSame(true);

        PassportSewa passportSewa = new PassportSewa();

            boolean created = passportSewa.createPassportUser(passportUser);
        System.out.println("the user is created" +created);

        if(created) {
            passportSewa.getuserInfo();
        }
        }
    }

