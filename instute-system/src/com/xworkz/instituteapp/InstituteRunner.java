package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

public class InstituteRunner {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.setTraineeId(1);
        trainee.setTraineeName("Gowtham");
        trainee.setDomainOfTrainee("development");
        trainee.setSkillsOfTrainee("java");
        trainee.setWorkingInstituteName("xworkz");
        trainee.setYearOfExperience(10);


        Institute institute = new Institute();
        boolean check=institute.InstituteRegistered(trainee);
        System.out.println("the user registered:"+check);
        if (check){
            institute.getInfo();
        }
    }
}
