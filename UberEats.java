class UberEats{
public static double priceOfFoodss(String name){
double price = 0.0;

if(name == "mixture"){
price=350.89;
}

else if(name == "pakkoda"){
price=340.89;
}

else if(name == "cakes"){
price = 500.26;
}

else if(name == "pasteries"){
price = 600.26;
}

else if(name == "biscuits"){
price = 50.38;
}

else if(name == "cookies"){
price = 69.26;
}

else if(name == "bites"){
price = 52.39;
}

else if(name == "falooda"){
price = 199.56;
}

else if(name == "kulfi"){
price = 89.89;
}

else if(name == "mueslies"){
price = 562.26;
}

else if(name == "oats"){
price = 250.26;
}

else if(name == "ragi ball"){
price = 99.26;
}

else if(name == "chicken sambar"){
price = 180.26;
}

else if(name == "chole batore"){
price = 205.26;
}

else if(name == "kabul kadle palya"){
price = 99.26;
}

else if(name == "salads"){
price = 129.76;
}

else{
System.out.println("food not found");
}

return price;
}
}


















