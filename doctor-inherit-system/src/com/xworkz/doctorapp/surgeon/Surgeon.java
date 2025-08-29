package com.xworkz.doctorapp.surgeon;

import com.xworkz.doctorapp.doctor.Doctor;

public class Surgeon extends Doctor {

    @Override
    public boolean treatsPatient(){
        System.out.println("the treats the patient disease");
        return true;
    }
}
