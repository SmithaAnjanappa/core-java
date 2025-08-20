package com.xworkz.policeapp.validation;

import com.xworkz.policeapp.police.Police;

public class Validation {
    public boolean balidationOfPolice(Police police){
        boolean isValidated=false;
        boolean idValid=false;
        boolean nameValid = false;
        boolean typeValid = false;
        boolean starValid = false;
        boolean workValid = false;
        boolean pistolVlaid =false;

        if (police.getPoliceId()!=0){
            idValid=true;
        }else {
            System.out.println("the id is not valid");
        }
        if (police.getPoliceName()!=null && ! police.getPoliceName().isEmpty()){
            nameValid=true;
        }
        else {
            System.out.println("the police name is not valid");
        }
        if (police.getTypeOfPolice()!=null && !police.getTypeOfPolice().isEmpty()){
            typeValid=true;
        }else {
            System.out.println("the type of police is not valid");
        }

        if (police.getNoOfStars()!=null && !police.getNoOfStars().isEmpty()){
            starValid=true;
        }else {
            System.out.println("the stars are not valid");
        }
        if (police.getWorkTimings()!=null && !police.getWorkTimings().isEmpty()){
            workValid=true;
        }
        if (police.getNoOfPistol()!=0){
            pistolVlaid=true;
        }
        else {
            System.out.println("the pistol is not valid");
        }
        if(idValid && nameValid && typeValid && starValid && workValid && pistolVlaid){
            isValidated=true;
        }
            return  isValidated;
    }
}
