package com.xworkz.lokasabha.lokasabha;

import com.xworkz.lokasabha.politician.Politician;
import com.xworkz.lokasabha.validation.LokasabhaValidation;

public class Lokasabha {
    Politician politician;
    public  boolean lokasabhaRegister(Politician politician){
        boolean isRegistered=false;
        LokasabhaValidation lokasabhaValidation = new LokasabhaValidation();
        boolean validated=lokasabhaValidation.lokasabhaValidater(politician);
        if (validated){
            this.politician=politician;
            isRegistered=true;
        }

        return isRegistered;
    }

    public void getInfo(){
        System.out.println("the politician id is:" +politician.getPoliticianId());
        System.out.println("the politician name is :" +politician.getPoliticianName());
        System.out.println("the politician state is:" +politician.getState());
        System.out.println("the politician taluk is :" +politician.getTaluk());
        System.out.println("the ward number is:" +politician.getWardNo());
        System.out.println("the number of areas are:" +politician.getNoOfAreas());
        System.out.println("the number of years of power is:" +politician.getNoOfYearsOfPower());
    }
}
