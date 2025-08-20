package com.xworkz.flowerapp.flower;

class Flowers {
    String name;
    String color;
    int petals;
    boolean hasFragrance;
    double price;

    Flowers(){
        System.out.println("constructor invoked");
    }

    Flowers(String name,String color,int petals,boolean hasFragrance,double price){
        System.out.println("parameterized constructor invoked");
        this.name=name;
        this.color=color;
        this.petals=petals;
        this.hasFragrance=hasFragrance;
        this.price=price;
    }


    public void getFlowersInfo() {
        System.out.println("flower Name: " + name);
        System.out.println("flower Color: " + color);
        System.out.println("flower Petals: " + petals);
        System.out.println("flower Has Fragrance: " + hasFragrance);
        System.out.println("flower Price: " + price);
    }
}

