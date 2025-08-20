package com.xworkz.shoppingmall.Validation;
import com.xworkz.shoppingmall.shop.Shop;

public class Validation {
    Shop shop;
    public boolean mallValidation(Shop shop){
        boolean idValid = false;
        boolean shopValid = false;
        boolean shopNumberValid = false;
        boolean typeValid = false;
        boolean brandValid = false;
        boolean productValid = false;
        boolean isValidated=false;

        if (shop.getShopId()!=0){
            idValid=true;
        }
        if (shop.getShopName()!=null && !shop.getShopName().isEmpty()){
            shopValid=true;
        }

        if (shop.getNoOfShop()!=0){
            shopNumberValid=true;
        }
        if (shop.getTypeOfShop()!=null &&!shop.getTypeOfShop().isEmpty()){
            typeValid=true;
        }
        if (shop.getBrand()!=null &&!shop.getBrand().isEmpty()){
            brandValid=true;
        }

        if (shop.getProductsAvailable()!=null &&!shop.getProductsAvailable().isEmpty()){
            productValid=true;
        }
        if (idValid && shopValid && shopNumberValid && typeValid && brandValid && productValid ){
            isValidated=true;
        }
        return  isValidated;
    }
}
