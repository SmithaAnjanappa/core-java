package com.xworkz.policeapp.policeStation;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.validation.Validation;

public class PoliceStation {
    Police police;
    public  boolean policeRegistration(Police police){
        boolean isRegistered=false;
        Validation validation=new Validation();
        boolean valid=validation.balidationOfPolice(police);
        if (valid){

            isRegistered=true;
            this.police=police;
        }


        return isRegistered;
    }
    public  void getInfo(){
        System.out.println("the police id is:"+police.getPoliceId());
        System.out.println("the police name is:"+police.getPoliceName());
        System.out.println("the type of police is:"+police.getTypeOfPolice());
        System.out.println("the number of pistol is:"+police.getNoOfPistol());
        System.out.println("the worktiming is :"+police.getWorkTimings());
        System.out.println("the number of stars are:"+police.getNoOfStars());
    }
}
