package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setPatientName("meena");
        patient.setDisease("fever");
        patient.setAge(5);
        patient.setBloodGroup("O Positive");
        patient.setNameOfDoctor("gowtham");


        Hospital hospital=new Hospital();
        boolean hosRegistered=hospital.hospitalRegistration(patient);
        System.out.println("the user is registered:"+hosRegistered);
        if (hosRegistered){
        hospital.getInfo();
        }
    }
}
