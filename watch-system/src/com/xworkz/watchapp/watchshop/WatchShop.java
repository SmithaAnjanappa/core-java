package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.validated.Validated;
import com.xworkz.watchapp.watch.Watch;

public class WatchShop {
    Watch watch;
    public  boolean watchRegistered(Watch watch){
        boolean isregisterValid=false;
        Validated validated = new Validated();
        boolean valid=validated.checkValidation(watch);
        isregisterValid=true;
        this.watch=watch;

        return  isregisterValid;
    }
    public void getInfo(){
        System.out.println("the watch id is:" +watch.getWatchId());
        System.out.println("the watch name is :"+watch.getWatchName());
        System.out.println("the price of the watch is:"+watch.getPriceOfWatch());
        System.out.println("the type of watch is:"+watch.getTypeOfWatch());
        System.out.println("the brand of watch is:"+watch.getTypeOfWatchBand());
        System.out.println("the watch is waterproof:"+watch.getIsWaterProof());
    }
}
