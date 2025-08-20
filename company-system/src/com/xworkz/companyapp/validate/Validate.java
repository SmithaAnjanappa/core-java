package com.xworkz.companyapp.validate;

import com.xworkz.companyapp.projects.Project;

public class Validate {

    public boolean checkValidation(Project project){
        boolean validated = false;
        boolean idValid = false;
        boolean nameValid=false;
        boolean workValid= false;
        boolean typeValid = false;
        boolean budgetValid =false;
        boolean durationValid = false;

        if (project.getProjectId()!=0){
            idValid=true;
        }

        if (project.getProjectName()!=null &&!project.getProjectName().isEmpty()){
            nameValid=true;
        }

        if (project.getNoOfMembersWorkingInProject()!=0){
            workValid=true;
        }
        if (project.getTypeOfProject()!=null &&!project.getTypeOfProject().isEmpty()){
            typeValid=true;
        }
        if (project.getBudgetOfProject()!=0.0){
            budgetValid=true;
        }
        if (project.getDurationOfProject()!=null &&!project.getDurationOfProject().isEmpty()){
            durationValid=true;

        }
        if (idValid && nameValid&& workValid && typeValid && budgetValid && durationValid){
            validated=true;
        }
        return validated;
    }
}
