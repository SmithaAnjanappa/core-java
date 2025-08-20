package com.xworkz.companyapp.company;

import com.xworkz.companyapp.projects.Project;
import com.xworkz.companyapp.validate.Validate;

public class Company {
    Project project;
    public boolean companyRegistered(Project project){
        boolean isRegistered=false;

        Validate validate = new Validate();
        boolean valid=validate.checkValidation(project);
        if (valid){
            this.project=project;
            isRegistered=true;
        }
        return isRegistered;
    }
    public void getInfo(){
        System.out.println("the project id is:" +project.getProjectId());
        System.out.println("the name of the project is:"+project.getProjectName());
        System.out.println("the bugjet of the project is:"+project.getBudgetOfProject());
        System.out.println("the duration of the project is:"+project.getDurationOfProject());
        System.out.println("the type pof project is:"+project.getTypeOfProject());
        System.out.println("the number of members working in the project"+project.getNoOfMembersWorkingInProject());
    }
}
