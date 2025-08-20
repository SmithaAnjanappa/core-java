package com.xworkz.productamazonapp.product;

public class Product {
    private int productId;
    private String productName;
    private int noOfProductsAvailable;
    private String quantity;
    private String expiryDate;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNoOfProductsAvailable() {
        return noOfProductsAvailable;
    }

    public void setNoOfProductsAvailable(int noOfProductsAvailable) {
        this.noOfProductsAvailable = noOfProductsAvailable;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
