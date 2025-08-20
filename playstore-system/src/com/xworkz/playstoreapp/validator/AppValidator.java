package com.xworkz.playstoreapp.validator;

import com.xworkz.playstoreapp.application.Application;

public class AppValidator {
   public boolean validateApplicationInfo(Application application){
        boolean appValidated=false;
        boolean isAppVersionValid=false;
        boolean updateValid = false;
        boolean downlodValid=false;
        boolean downlodSizeValid=false;
        boolean requiresOsValid = false;
        boolean offerValid =false;
        boolean releaseValid = false;

        if(application.getAppVersion()!=null && !application.getAppVersion().isEmpty()){
            isAppVersionValid=true;
        }else{
            System.out.println("the appversion is not valid");
        }

        if (application.getUpdatedOn()!=null && !application.getUpdatedOn().isEmpty()){
            updateValid=true;
        }else {
            System.out.println("the updated on is not valid");
        }

        if (application.getDownloads()!=0){
            downlodValid=true;
        }else {
            System.out.println("the downloads are not valid");
        }

        if (application.getDownloadSize()!=null && !application.getDownloadSize().isEmpty()){
            downlodSizeValid=true;
        }else {
            System.out.println("the download size is not valid");
        }

        if(application.getRequiredOS()!=null && !application.getRequiredOS().isEmpty()){
            requiresOsValid=true;
        }else {
            System.out.println("requires os is not valid");
        }

        if(application.getOfferedBy()!=null && !application.getOfferedBy().isEmpty()){
            offerValid=true;
        }else {
            System.out.println("the offered by is not valid");
        }

        if (application.getReleasedOn()!=null &&!application.getReleasedOn().isEmpty()){
            releaseValid=true;
        }else{
            System.out.println("the release is not valid");
        }

        if(isAppVersionValid && updateValid && downlodValid && downlodSizeValid && requiresOsValid && offerValid && releaseValid){
            appValidated=true;
        }
        return appValidated;
    }
}
