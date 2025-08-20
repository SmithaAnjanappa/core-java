package com.xworkz.companyapp.projects;

public class Project {
    private int projectId;
    private String projectName;
    private int noOfMembersWorkingInProject;
    private String typeOfProject;
    private double budgetOfProject;
    private String durationOfProject;


    public int getProjectId() {
        return projectId;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfMembersWorkingInProject() {
        return noOfMembersWorkingInProject;
    }

    public void setNoOfMembersWorkingInProject(int noOfMembersWorkingInProject) {
        this.noOfMembersWorkingInProject = noOfMembersWorkingInProject;
    }

    public String getTypeOfProject() {
        return typeOfProject;
    }

    public void setTypeOfProject(String typeOfProject) {
        this.typeOfProject = typeOfProject;
    }

    public double getBudgetOfProject() {
        return budgetOfProject;
    }

    public void setBudgetOfProject(double budgetOfProject) {
        this.budgetOfProject = budgetOfProject;
    }

    public String getDurationOfProject() {
        return durationOfProject;
    }

    public void setDurationOfProject(String durationOfProject) {
        this.durationOfProject = durationOfProject;
    }
}
