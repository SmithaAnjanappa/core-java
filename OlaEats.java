class OlaEats{
public static double olaPrice(String name){
double price = 0.0;

if(name == "kabab"){
price= 450.00;
}

else if(name == "fish fry"){
price = 120.26;
}

else if(name == "egg fry"){
price = 120.26;
}

else if(name == "mutar masala"){
price = 110.26;
}

else if(name == "aloo fry"){
price = 89.26;
}

else if(name == "raskula"){
price = 99.26;
}

else if(name == "jamoon"){
price = 99.26;
}

else if(name == "chilli bajji"){
price = 89.26;
}

else if(name == "bonda"){
price = 65.26;
}

else if(name == "tandori"){
price = 200.26;
}

else if(name == "kachori"){
price = 59.26;
}

else if(name == "samosa"){
price = 39.26;
}

else if(name == "madoor vada"){
price = 35.26;
}

else if(name == "managlore bonda"){
price = 89.26;
}

else{
System.out.println("the food not found:");
}

return price;
}
}





