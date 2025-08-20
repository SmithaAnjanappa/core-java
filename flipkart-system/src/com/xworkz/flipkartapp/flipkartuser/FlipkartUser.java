package com.xworkz.flipkartapp.flipkartuser;

public class FlipkartUser {
    public String givenName;
    public String getGivenName(){
        return  givenName;
    }
    public void setGivenName(String givenName){
        this.givenName=givenName;
    }

    public String surName;
    public String getSurName(){
        return  surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }

    public String email;
    public String getEmail(){
        return  email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String password;
    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public  String confirmPwd;
    public String getConfirmPwd(){
        return confirmPwd;
    }
    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd=confirmPwd;
    }

    public long phoneNumber;
    public long getPhoneNumber(){
        return  phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }

}
