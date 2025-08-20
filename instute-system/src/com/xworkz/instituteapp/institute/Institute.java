package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validation.Validation;

public class Institute {
    Trainee trainee;
    public boolean InstituteRegistered(Trainee trainee){
        boolean isRegistered=false;
        Validation validation=new Validation();
        boolean register=validation.instituteValidation(trainee);
        if (register){
            this.trainee=trainee;
            isRegistered=true;
        }

        return  isRegistered;
    }
    public void  getInfo(){
        System.out.println("the trainee id is:" +trainee.getTraineeId());
        System.out.println("the trainee name is:" +trainee.getTraineeName());
        System.out.println("the year of experience is:"+trainee.getYearOfExperience());
        System.out.println("the domain of trainee is:"+trainee.getDomainOfTrainee());
        System.out.println("the skills of the trainee"+trainee.getSkillsOfTrainee());
        System.out.println("the working of trainee" +trainee.getWorkingInstituteName());
    }
}
