package com.xworkz.googleapp.googleuser;

public class GoogleUser {
    private String givenName;
    private  String surName;
    private String dob;
    private String email;
    private long phoneNumber;
    private String password;
    private String conPassword;

    public String getGivenName(){
        return  givenName;
    }
    public  void  setGivenName(String givenName){
        this.givenName=givenName;
    }

    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob=dob;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getConPassword(){
        return conPassword;
    }
    public void setConPassword(String conPassword){
        this.conPassword=conPassword;
    }


}
