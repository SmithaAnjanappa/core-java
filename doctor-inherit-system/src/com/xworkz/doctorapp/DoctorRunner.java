package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;
import com.xworkz.doctorapp.surgeon.Surgeon;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor=new Surgeon();
        doctor.treatsPatient();
    }
}
