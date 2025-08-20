package com.xworkz.shoppingmall.mall;

import com.xworkz.shoppingmall.Validation.Validation;
import com.xworkz.shoppingmall.shop.Shop;

public class Mall {
    Shop shop;
    public boolean mallRegistration(Shop shop){
        boolean mallRegistered=false;
        Validation validation = new Validation();
       boolean validated= validation.mallValidation(shop);
        if (validated){
            mallRegistered=true;
            this.shop=shop;
        }


        return  mallRegistered;
    }
    public void getInfo(){
        System.out.println("the shop id is:"+shop.getShopId());
        System.out.println("the shop name is:" +shop.getShopName());
        System.out.println("the type of shop is:" +shop.getTypeOfShop());
        System.out.println("the number of shops is:" +shop.getNoOfShop());
        System.out.println("the brand is" +shop.getBrand());
        System.out.println("the number of products is:" +shop.getProductsAvailable());
    }
}
