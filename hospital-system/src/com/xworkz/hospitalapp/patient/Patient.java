package com.xworkz.hospitalapp.patient;

public class Patient {
    private int patientId;
    private String patientName;
    private String disease;
    private int age;
    private String bloodGroup;
    private String nameOfDoctor;


    public int getPatientId(){
        return patientId;
    }
    public  void setPatientId(int patientId){
        this.patientId=patientId;
    }

    public String getPatientName(){
        return  patientName;
    }

    public void setPatientName(String patientName){
        this.patientName=patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNameOfDoctor() {
        return nameOfDoctor;
    }

    public void setNameOfDoctor(String nameOfDoctor) {
        this.nameOfDoctor = nameOfDoctor;
    }
}
