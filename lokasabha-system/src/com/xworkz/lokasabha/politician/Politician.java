package com.xworkz.lokasabha.politician;

public class Politician {
    private int politicianId;
    private  int noOfYearsOfPower;
    private String politicianName;
    private  int noOfAreas;
    private String state;
    private String taluk;
    private  int wardNo;

    public int getPoliticianId() {
        return politicianId;
    }
    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }

    public int getNoOfYearsOfPower() {
        return noOfYearsOfPower;
    }
    public void setNoOfYearsOfPower(int noOfYearsOfPower) {
        this.noOfYearsOfPower = noOfYearsOfPower;
    }

    public String getPoliticianName() {
        return politicianName;
    }
    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }

    public int getNoOfAreas() {
        return noOfAreas;
    }
    public void setNoOfAreas(int noOfAreas) {
        this.noOfAreas = noOfAreas;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getTaluk() {
        return taluk;
    }
    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public int getWardNo() {
        return wardNo;
    }
    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }
}
