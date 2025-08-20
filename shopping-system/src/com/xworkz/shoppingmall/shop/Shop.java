package com.xworkz.shoppingmall.shop;

public class Shop {
    private int shopId;
    private String shopName;
    private String typeOfShop;
    private  int noOfShop;
    private String brand;
    private String productsAvailable;


    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName(){
        return  shopName;
    }
    public void setShopName(String shopName){
        this.shopName=shopName;
    }

    public String getTypeOfShop() {
        return typeOfShop;
    }
    public void setTypeOfShop(String typeOfShop) {
        this.typeOfShop = typeOfShop;
    }

    public int getNoOfShop() {
        return noOfShop;
    }
    public void setNoOfShop(int noOfShop) {
        this.noOfShop = noOfShop;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductsAvailable() {
        return productsAvailable;
    }

    public void setProductsAvailable(String productsAvailable) {
        this.productsAvailable = productsAvailable;
    }
}
