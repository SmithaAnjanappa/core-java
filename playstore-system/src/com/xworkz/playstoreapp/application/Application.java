package com.xworkz.playstoreapp.application;

public class Application {
    private String appVersion;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    private String updatedOn;

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    private long downloads;

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    private String downloadSize;

    public String getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(String downloadSize) {
        this.downloadSize = downloadSize;
    }

    private String requiredOS;

    public String getRequiredOS() {
        return requiredOS;
    }

    public void setRequiredOS(String requiredOS) {
        this.requiredOS = requiredOS;
    }

    String offeredBy;

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    private String releasedOn;

    public String getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }
}
