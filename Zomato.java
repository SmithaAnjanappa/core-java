class Zomato{
public static double priceOfFoods(String name){
double price = 0.0;

if(name == "rice bath" ){
price= 108.23;
}

else if(name == "puliogere"){
price = 89.65;
}

else if(name == "chitranna"){
price = 79.65;
}

else if(name == "pallav"){
price = 145.89;
}

else if(name == "toamato bath"){
price = 110.47;
}

else if(name == "fried rice"){
price = 120.59;
}


else if(name == "egg rice"){
price = 150.75;
}


else if(name == "omlet"){
price = 69.65;
}

else if(name == "chicken fry"){
price = 580.95;
}

else if(name == "biriyani"){
price = 169.23;
}

else if(name == "roti"){
price = 89.65;
}

else if(name == "kheer"){
price = 52.65;
}

else if(name == "sandwitch"){
price = 102.35;
}

else if(name == "puffs"){
price = 29.65;
}


else if(name == "buns"){
price = 19.65;
}

else if(name == "ice creams"){
price = 129.39;
}


else if(name == "desets"){
price = 89.28;
}

else if(name == "sweets"){
price = 189.65;
}



else{
System.out.println("food nit found:");
}

return price;
}
}