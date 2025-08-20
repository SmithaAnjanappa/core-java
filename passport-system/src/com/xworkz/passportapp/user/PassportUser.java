package com.xworkz.passportapp.user;

public class PassportUser {
    private String cpvLocation;
    public String getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation=cpvLocation;
    }


    private String dcdrLocation;
    public String getDcdrLocation(){
        return dcdrLocation;
    }
    public void setDcdrLocation(String dcdrLocation){
        this.dcdrLocation=dcdrLocation;
    }


    private String givenName;
    public String getGivenName(){
        return  givenName;
    }
    public void setGivenName(String givenNam){
        this.givenName=givenNam;
    }



    private String surName;
    public String getSurName(){
        return  surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }


    private String dob;
    public String getDob(){
        return  dob;
    }
    public void setDob(String dob){
        this.dob=dob;
    }


    private String email;
    public String getEmail(){
        return  email;
    }
    public void setEmail(String email){
        this.email=email;
    }



    private String isEmailSame;
    public String getIsEmailSame(){
        return isEmailSame;
    }

    public void setIsEmailSame(String isEmailSame) {
        this.isEmailSame = isEmailSame;
    }

    private boolean isEmailAndLoginSame;
    public boolean getIsEmailAndLoginSame(){
        return isEmailAndLoginSame;
    }
    public void setIsEmailAndLoginSame(boolean isEmailAndLoginSame){
        this.isEmailAndLoginSame=isEmailAndLoginSame;
    }


    private String pwd;
    public String getPwd(){
        return  pwd;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }


    private String cpwd;
    public String getCpwd(){
        return  cpwd;
    }
    public void setCpwd(String cpwd){
        this.cpwd=cpwd;
    }


    private String birthPlace;
    public String getBirthPlace(){
        return  birthPlace;
    }
    public void setBirthPlace(String birthPlace){
        this.birthPlace=birthPlace;
    }


    private String test;
    public String getTest(){
        return  test;
    }
public  void setTest(String test){
        this.test=test;
}

}
