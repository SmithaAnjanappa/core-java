package com.xworkz.productamazonapp.validation;

import com.xworkz.productamazonapp.amazon.Amazon;
import com.xworkz.productamazonapp.product.Product;

public class Validation {
    public boolean amazonProductValidation(Product product){
        boolean isValidated=false;
        boolean idValid=false;
        boolean nameValid=false;
        boolean productsValid = false;
        boolean quantityValid = false;
        boolean productValid =false;
        boolean priceValid = false;

        if (product.getProductId()!=0){
            idValid=true;
        }else {
            System.out.println("the product id is not valid");
        }
        if (product.getProductName()!=null && !product.getProductName().isEmpty()){
            nameValid=true;
        }else {
            System.out.println("the product name is not valid");
        }
        if (product.getNoOfProductsAvailable()!=0){
            productsValid=true;
        }else {
            System.out.println("the products are not available");
        }
        if (product.getQuantity()!=null && !product.getQuantity().isEmpty()){
            quantityValid=true;
        }else{
            System.out.println("the quantity is not available");
        }
        if (product.getExpiryDate()!=null && !product.getExpiryDate().isEmpty()) {
            productValid = true;
        }
        else {
            System.out.println("the expiry date is not valid");
        }
        if (product.getPrice()!=0.0){
            priceValid=true;
        }else {
            System.out.println("the prce is not valid");
        }
        if (idValid && nameValid && productsValid && quantityValid && productValid && priceValid){
            isValidated=true;
        }


        return  isValidated;
    }
}
