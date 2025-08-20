package com.xworkz.passportapp.passportsewa;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSewa {
    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {

        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean emailSameValid = false;
        boolean emailAndLoginValid = false;
        boolean passwordalid = false;
        boolean cpwdValid = false;
        boolean birthPlaceValid = false;
        boolean testValid = false;
        boolean passportUserCreated = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("the cpv location is not valid");
        }


        if (passportUser.getDcdrLocation() != null) {
            dcdrLocationValid = true;
        } else
            System.out.println("the dcdr location is not valid");


        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else
            System.out.println("the given name is not valid");


        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else
            System.out.println("the surName is not valid");

        if (passportUser.getDob() != null) {
            dobValid = true;
        } else
            System.out.println("the dob is not valid");

        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else
            System.out.println("the email is not valid");

        if (passportUser.getIsEmailSame() != null) {
            emailSameValid = true;
        } else
            System.out.println("the email is not same");

        if (passportUser.getIsEmailAndLoginSame() != false) {
            emailAndLoginValid = true;
        } else
            System.out.println("the email and login are not same");
        if (passportUser.getPwd() != null) {
            passwordalid = true;
        } else
            System.out.println("password valid");
        if (passportUser.getCpvLocation() != null) {
            cpwdValid = true;
        } else
            System.out.println("the cpwd is not valid");

        if (passportUser.getBirthPlace() != null) {
            birthPlaceValid = true;
        } else
            System.out.println("the birth place is not valid");
        if (passportUser.getTest() != null) {
            testValid = true;
        }
        if (cpvLocationValid && dcdrLocationValid && givenNameValid && surNameValid && dobValid && emailValid && emailSameValid && emailAndLoginValid && passwordalid && birthPlaceValid && testValid && cpwdValid) {
            passportUserCreated=true;
            this.passportUser = passportUser;
        }
        return passportUserCreated;
    }
    public void getuserInfo(){
        System.out.println("the passport user cpv is:" + passportUser.getCpvLocation());
        System.out.println("the passport user dcdr location is:" + passportUser.getDcdrLocation());
        System.out.println("the passport username  is:" + passportUser.getGivenName());
        System.out.println("the passport user  surname is:" + passportUser.getSurName());
        System.out.println("the passport user password is:" + passportUser.getPwd());
        System.out.println("the passport confirm password user is:" + passportUser.getCpwd());
        System.out.println("the passport user get test is:" + passportUser.getTest());
        System.out.println("the passport user birth place is:" + passportUser.getBirthPlace());
        System.out.println("the dob is" +passportUser.getDob());
        System.out.println("the email is validation" +passportUser.getEmail());
        System.out.println("the email same check" +passportUser.getIsEmailSame());
        System.out.println("the email login same" +passportUser.getIsEmailAndLoginSame());

    }
}
