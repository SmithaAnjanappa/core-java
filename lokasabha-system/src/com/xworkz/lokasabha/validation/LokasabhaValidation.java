package com.xworkz.lokasabha.validation;

import com.xworkz.lokasabha.politician.Politician;

public class LokasabhaValidation {
    Politician politician;
    public boolean lokasabhaValidater(Politician politician){
        boolean validated=false;
        boolean idValid =false;
        boolean powerValid = false;
        boolean nameValid = false;
        boolean areaValid = false;
        boolean stateValid = false;
        boolean talukValid = false;
        boolean wardValid = false;

        if(politician.getPoliticianId()!=0){
            idValid=true;
        }

        if (politician.getNoOfYearsOfPower()!=0){
            powerValid=true;
        }

        if (politician.getPoliticianName()!=null &&!politician.getPoliticianName().isEmpty()){
            nameValid=true;
        }

        if (politician.getNoOfAreas()!=0){
            areaValid=true;
        }

        if (politician.getState()!=null && !politician.getState().isEmpty()){
            stateValid=true;
        }

        if(politician.getTaluk()!=null &&!politician.getTaluk().isEmpty()){
            talukValid=true;
        }

        if (politician.getWardNo()!=0){
            wardValid=true;
        }
        if (idValid && powerValid && nameValid && areaValid && stateValid && talukValid && wardValid){
            validated=true;
        }
        return validated;
    }
}
