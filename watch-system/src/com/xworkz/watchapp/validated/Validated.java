package com.xworkz.watchapp.validated;

import com.xworkz.watchapp.watch.Watch;

public class Validated {
    Watch watch;
    public  boolean checkValidation(Watch watch){
        boolean watchidValid =false;
        boolean nameValid = false;
        boolean typeValid = false;
        boolean priceValid = false;
        boolean brandValid = false;
        boolean waterValid=false;
        boolean validated=false;

        if (watch.getWatchId()!=0){
            watchidValid=true;
        }
        if (watch.getWatchName()!=null &&!watch.getWatchName().isEmpty()){
            nameValid=true;
        }
        if (watch.getTypeOfWatch()!=null &&!watch.getTypeOfWatch().isEmpty()){
            typeValid=true;
        }
        if (watch.getPriceOfWatch()!=0.0){
            priceValid=true;
        }
        if (watch.getTypeOfWatchBand()!=null &&!watch.getTypeOfWatchBand().isEmpty()){
            brandValid=true;
        }
        if (watch.getIsWaterProof()!=null &&!watch.getIsWaterProof().isEmpty()){
            waterValid=true;
        }
        if (watchidValid && nameValid && typeValid && priceValid && brandValid && waterValid){
            validated=true;
        }
        return  validated;
    }
}
