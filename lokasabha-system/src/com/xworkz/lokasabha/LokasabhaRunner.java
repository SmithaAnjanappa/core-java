package com.xworkz.lokasabha;

import com.xworkz.lokasabha.lokasabha.Lokasabha;
import com.xworkz.lokasabha.politician.Politician;

public class LokasabhaRunner {
    Politician politician;

    public static void main(String[] args) {
        Politician politician = new Politician();
        politician.setPoliticianId(1);
        politician.setPoliticianName("Vishwanath");
        politician.setState("Bangalore");
        politician.setTaluk("yelahanka");
        politician.setWardNo(003);
        politician.setNoOfAreas(10);
        politician.setNoOfYearsOfPower(5);


        Lokasabha lokasabha = new Lokasabha();
        boolean lokasabhaCreated = lokasabha.lokasabhaRegister(politician);
        System.out.println("the user is created" +lokasabhaCreated);
        if (lokasabhaCreated) {
            lokasabha.getInfo();
        }
    }
}
