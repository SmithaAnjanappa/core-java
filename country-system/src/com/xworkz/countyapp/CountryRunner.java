package com.xworkz.countyapp;

import com.xworkz.countyapp.country.Country;
import com.xworkz.countyapp.india.India;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new India();
        country.whatIDoForMyCountry();
    }
}
