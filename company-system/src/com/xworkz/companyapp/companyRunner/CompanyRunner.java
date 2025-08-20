package com.xworkz.companyapp.companyRunner;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.projects.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        Project project = new Project();
        project.setProjectId(1);
        project.setProjectName("Shopping");
        project.setDurationOfProject("6 months");
        project.setBudgetOfProject(150000.96);
        project.setTypeOfProject("commercial");
        project.setNoOfMembersWorkingInProject(15);


        Company company = new Company();
        boolean register=company.companyRegistered(project);
        System.out.println("the company registered" +register);
        if (register){
            company.getInfo();
        }

    }
}
