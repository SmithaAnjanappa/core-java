package com.xworkz.furnitureapp.table;

import com.xworkz.furnitureapp.furniture.Furniture;

public class Table extends Furniture {
    @Override
    public double doFurnitureBusiness(){
        System.out.println("doing the tables of all types");
        return 18000.00;
    }

}
