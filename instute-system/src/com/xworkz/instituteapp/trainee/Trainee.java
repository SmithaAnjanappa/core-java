package com.xworkz.instituteapp.trainee;

public class Trainee {
    private int traineeId;
    private String traineeName;
    private  int yearOfExperience;
    private String domainOfTrainee;
    private String skillsOfTrainee;
    private String workingInstituteName;


    public int getTraineeId() {
        return traineeId;
    }
    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }
    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }
    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getDomainOfTrainee() {
        return domainOfTrainee;
    }

    public void setDomainOfTrainee(String domainOfTrainee) {
        this.domainOfTrainee = domainOfTrainee;
    }

    public String getSkillsOfTrainee() {
        return skillsOfTrainee;
    }
    public void setSkillsOfTrainee(String skillsOfTrainee) {
        this.skillsOfTrainee = skillsOfTrainee;
    }

    public String getWorkingInstituteName() {
        return workingInstituteName;
    }
    public void setWorkingInstituteName(String workingInstituteName) {
        this.workingInstituteName = workingInstituteName;
    }
}
