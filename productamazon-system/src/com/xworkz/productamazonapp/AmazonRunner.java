package com.xworkz.productamazonapp;

import com.xworkz.productamazonapp.amazon.Amazon;
import com.xworkz.productamazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        Product product=new Product();
        product.setProductId(1);
        product.setProductName("HairStraightner");
        product.setExpiryDate("10 years from manufacturing");
        product.setNoOfProductsAvailable(10);
        product.setPrice(2800.36);
        product.setQuantity("1");


        Amazon amazon=new Amazon();
        boolean amazonRegister=amazon.productsRegistered(product);
        System.out.println("the amazon user registered:"+amazonRegister);
        if (amazonRegister){
            amazon.getInfo();
        }
        amazon.updateProductPrice(789);
        amazon.getInfo();
    }
}
