package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.playstore.PlayStore;

public class PlayStoreRunner {
    public static void main(String[] args) {
        Application application = new Application();
        application.setAppVersion("2.56");
        application.setUpdatedOn("4/12/2024");
        application.setDownloads(562334941215212L);
        application.setDownloadSize("46mb");
        application.setRequiredOS("android");
        application.setOfferedBy("whatsapp");
        application.setReleasedOn("2008");


        PlayStore playStore=new PlayStore();
        boolean created=playStore.addApplication(application);
        System.out.println("the user created" +created);
        if(created){
            playStore.getPlayStoreInfo();
        }
    }
}
