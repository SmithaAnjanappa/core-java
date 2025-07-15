class Swiggy{
public static double priceOfFood(String name){
double price = 0.0;

if(name == "burger"){
price=79;
return price;
}

else if(name=="pizza"){
price=150 ;
return price;
}

else if(name== "takos"){
price= 120;
return price;
}

else if(name== "panipuri"){
price= 60;
return price;
}

else if(name== "mexican chutney"){
price= 100;
return price;
}

else if(name== "noodles"){
price= 250;
return price;
}

else if(name== "gobi"){
price= 180;
return price;
}

else if(name== "popcorn"){
price= 65;
return price;
}

else if(name== "chocolava"){
price= 195;
return price;
}

else if(name== "corn manchuri" ){
price= 195;
return price;
}

else if(name== "french fries"){
price= 220.55;
return price;
}

else if(name== "papad"){
price= 35.86;
return price;
}

else if(name== " KFC"){
price= 590.35;
return price;
}


else if(name== "5 star" ){
price= 990.85;
return price;
}


else if(name== "panner manchuri"){
price= 562.35;
return price;
}


else if(name== "chicken lolipop"){
price=680.84 ;
return price;
}


else if(name== "kaima"){
price= 899.65;
return price;
}


else if(name== "chicken 65"){
price= 856.67;
return price;
}


else if(name== "vada"){
price= 25;
return price;
}

else if(name== "pav bhaji"){
price= 105.32;
return price;
}

else{
System.out.println("food not found");
return price;
}

return price;

}
}

