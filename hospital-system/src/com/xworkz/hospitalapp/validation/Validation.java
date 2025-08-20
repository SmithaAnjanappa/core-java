package com.xworkz.hospitalapp.validation;

import com.xworkz.hospitalapp.patient.Patient;

public class Validation {
    public  boolean hospitalValidation(Patient patient){
        boolean isValidated=false;
        boolean idValid =false;
        boolean nameValid = false;
        boolean ageValid = false;
        boolean diseaseValid = false;
        boolean bloodValid = false;
        boolean doctorValid =false;


        if (patient.getPatientId()!=0){
            idValid=true;
        }else {
            System.out.println("the patient id is not valid");
        }
        if (patient.getPatientName()!=null && !patient.getPatientName().isEmpty()){
            nameValid=true;
        }else {
            System.out.println("the patient name is not valid");
        }
        if (patient.getAge()!=0){
            ageValid=true;
        }else {
            System.out.println("the patient age is not valid");
        }
        if (patient.getDisease()!=null && !patient.getDisease().isEmpty()){
            diseaseValid=true;
        }else {
            System.out.println("the patient disease is not valid");
        }
        if (patient.getBloodGroup()!=null && !patient.getBloodGroup().isEmpty()){
            bloodValid=true;
        }else {
            System.out.println("the blood group is not valid");
        }
        if (patient.getNameOfDoctor()!=null &&!patient.getNameOfDoctor().isEmpty()){
            doctorValid=true;
        }
        else {
            System.out.println("the name of doctir is not valid ");
        }
        if (idValid && nameValid && ageValid && diseaseValid && bloodValid &&doctorValid ){
            isValidated=true;
        }



        return isValidated;
    }
}
