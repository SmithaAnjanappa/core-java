package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validation.Validation;

public class Hospital {
    Patient patient;
    public  boolean hospitalRegistration(Patient patient){
        boolean isRegistered=false;

        Validation validation=new Validation();
        boolean valid=validation.hospitalValidation(patient);
        if (valid){
            this.patient=patient;
            isRegistered=true;
        }


        return isRegistered;
    }

    public void getInfo(){
        System.out.println("the patient id is:"+patient.getPatientId());
        System.out.println("the patient name is :"+patient.getPatientName());
        System.out.println("the disease of the patient is:"+patient.getDisease());
        System.out.println("the blood group of the patient is:"+patient.getBloodGroup());
        System.out.println("the age of the patient is:"+patient.getAge());
        System.out.println("the name of the doctor is:"+patient.getNameOfDoctor());
    }
}
