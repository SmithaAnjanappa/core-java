package com.xworkz.watchapp.watch;

public class Watch {
    private int watchId;
    private String watchName;
    private String typeOfWatch;
    private double priceOfWatch;
    private String typeOfWatchBand;
    private String isWaterProof;

    public int getWatchId() {
        return watchId;
    }
    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public String getWatchName() {
        return watchName;
    }
    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }


    public String getTypeOfWatch() {
        return typeOfWatch;
    }
    public void setTypeOfWatch(String typeOfWatch) {
        this.typeOfWatch = typeOfWatch;
    }

    public double getPriceOfWatch() {
        return priceOfWatch;
    }
    public void setPriceOfWatch(double priceOfWatch) {
        this.priceOfWatch = priceOfWatch;
    }

    public String getTypeOfWatchBand() {
        return typeOfWatchBand;
    }
    public void setTypeOfWatchBand(String typeOfWatchBand) {
        this.typeOfWatchBand = typeOfWatchBand;
    }

    public String getIsWaterProof() {
        return isWaterProof;
    }

    public void setIsWaterProof(String isWaterProof) {
        this.isWaterProof = isWaterProof;
    }
}
