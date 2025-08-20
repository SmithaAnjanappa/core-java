package com.xworkz.watchapp.watchrunner;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchRunner {
    public static void main(String[] args) {

        Watch watch = new Watch();
        watch.setWatchId(1);
        watch.setWatchName("sonata");
        watch.setTypeOfWatch("analog");
        watch.setPriceOfWatch(2800.23);
        watch.setTypeOfWatchBand("leather");
        watch.setIsWaterProof("yes");

        WatchShop watchShop = new WatchShop();
        watchShop.watchRegistered(watch);
        boolean register=watchShop.watchRegistered(watch);
        System.out.println("the user registered:" +register);
        if (register){
            watchShop.getInfo();
        }

    }
}
