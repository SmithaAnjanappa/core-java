package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policeStation.PoliceStation;

public class PoliceRunner {
    public static void main(String[] args) {
        Police police=new Police();
        police.setPoliceId(1);
        police.setPoliceName("Vikram");
        police.setTypeOfPolice("inspector");
        police.setNoOfPistol(1);
        police.setWorkTimings("10 to 4 ");
        police.setNoOfStars("4");


        PoliceStation policeStation=new PoliceStation();
        boolean reg=policeStation.policeRegistration(police);
        System.out.println("the user regidtered "+reg);
        if (reg) {
            policeStation.getInfo();
        }
    }
}
