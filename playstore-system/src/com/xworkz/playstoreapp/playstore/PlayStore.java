package com.xworkz.playstoreapp.playstore;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.validator.AppValidator;

public class PlayStore {
    Application application;

    public boolean addApplication(Application application){
        boolean isApplicationAdded=false;

        AppValidator appValidator = new AppValidator();
        boolean isApplicationValidInfoValid=appValidator.validateApplicationInfo(application);
        if (isApplicationValidInfoValid){
            this.application=application;
            isApplicationAdded=true;

        }

        return isApplicationAdded;
    }

    public void getPlayStoreInfo(){
        System.out.println("the app version is" +application.getAppVersion());
        System.out.println("the app updated on" +application.getUpdatedOn());
        System.out.println("the app downlods is"+application.getDownloads());
        System.out.println("the download size is:" +application.getDownloadSize());
        System.out.println("the required os is:"+application.getRequiredOS());
        System.out.println("the offered by:" +application.getOfferedBy());
        System.out.println("the released on" +application.getReleasedOn());
    }
}
