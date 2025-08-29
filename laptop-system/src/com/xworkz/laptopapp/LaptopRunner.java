package com.xworkz.laptopapp;

import com.xworkz.laptopapp.hp.HP;
import com.xworkz.laptopapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new HP();
        laptop.laptopDealer();
    }
}
