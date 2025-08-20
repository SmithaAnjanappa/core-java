package com.xworkz.instituteapp.validation;

import com.xworkz.instituteapp.trainee.Trainee;

public class Validation {
    public  boolean instituteValidation(Trainee trainee){
        boolean validated=false;
        boolean idValid=false;
        boolean nameValid = false;
        boolean domainValid = false;
        boolean skillValid = false;
        boolean workValid = false;
        boolean yearValid = false;

        if (trainee.getTraineeId()!=0){
            idValid=true;
        }else {
            System.out.println("the trainee id is not valid");
        }
        if (trainee.getTraineeName()!=null && !trainee.getTraineeName().isEmpty()){
            nameValid=true;
        }else {
            System.out.println();
        }
        if (trainee.getDomainOfTrainee()!=null && !trainee.getDomainOfTrainee().isEmpty()){
            domainValid=true;
        }else {
            System.out.println("the domain is not valid");
        }
        if (trainee.getSkillsOfTrainee()!=null && !trainee.getSkillsOfTrainee().isEmpty()){
            skillValid=true;
        }else{
            System.out.println("the skills are not valid");
        }
        if (trainee.getWorkingInstituteName()!=null && !trainee.getWorkingInstituteName().isEmpty()){
            workValid=true;
        }
        else {
            System.out.println("the institute is not valid");
        }
        if (trainee.getYearOfExperience()!=0){
            yearValid=true;
        }else {
            System.out.println("the year is not valid");
        }
        if (idValid && nameValid && domainValid && skillValid && workValid && yearValid){
            validated=true;
        }

        return validated;
    }
}
