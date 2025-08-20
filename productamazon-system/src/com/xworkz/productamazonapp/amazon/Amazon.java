package com.xworkz.productamazonapp.amazon;

import com.xworkz.productamazonapp.product.Product;
import com.xworkz.productamazonapp.validation.Validation;

public class Amazon {
    Product product;
    public boolean productsRegistered(Product product){
        boolean registered=false;
        Validation validation=new Validation();
        boolean registerValid=validation.amazonProductValidation(product);
        if (registerValid){
            this.product=product;
            registered=true;
        }


        return registered;
    }
    public void getInfo(){
        System.out.println("the product id is "+product.getProductId());
        System.out.println("the product name is ;"+product.getProductName());
        System.out.println("the expiry date of the product is:"+product.getExpiryDate());
        System.out.println("the quantity of the produvt is:"+product.getQuantity());
        System.out.println("the number of products available are:"+product.getNoOfProductsAvailable());
        System.out.println("the price of the product is:"+product.getPrice());
    }

    public boolean updateProductPrice(double price){
        boolean isPriceUpdated=false;
        if(price > 0){
            product.setPrice(price);
            isPriceUpdated=true;
        }
        return  isPriceUpdated;
    }
}
