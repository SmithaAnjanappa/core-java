package com.xworkz.shoppingmall;

import com.xworkz.shoppingmall.mall.Mall;
import com.xworkz.shoppingmall.shop.Shop;

public class MallRunner {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setShopId(1);
        shop.setShopName("Trends");
        shop.setTypeOfShop("ClothesShop");
        shop.setNoOfShop(2);
        shop.setBrand("avasa");
        shop.setProductsAvailable("all types of clothes available");

        Mall mall = new Mall();
        boolean register=mall.mallRegistration(shop);
        System.out.println("the user registered is:" +register);
        if (register){
            mall.getInfo();
        }
    }
}
