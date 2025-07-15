class Swiggy{
public static double priceOfFood(String name){
double price = 0.0;

if(name == "burger"){
price=79;
}

else if(name=="pizza"){
price=150 ;
}

else if(name== "takos"){
price= 120;
}

else if(name== "panipuri"){
price= 60;
}

else if(name== "mexican chutney"){
price= 100;
}

else if(name== "noodles"){
price= 250;
}

else if(name== "gobi"){
price= 180;
}

else if(name== "popcorn"){
price= 65;
}

else if(name== "chocolava"){
price= 195;
}

else if(name== "corn manchuri" ){
price= 195;
}

else if(name== "french fries"){
price= 220.55;
}

else if(name== "papad"){
price= 35.86;
}

else if(name== " KFC"){
price= 590.35;
}


else if(name== "5 star" ){
price= 990.85;
}


else if(name== "panner manchuri"){
price= 562.35;
}


else if(name== "chicken lolipop"){
price=680.84 ;
}


else if(name== "kaima"){
price= 899.65;
}


else if(name== "chicken 65"){
price= 856.67;
}


else if(name== "vada"){
price= 25;
}

else if(name== "pav bhaji"){
price= 105.32;
}

else{
System.out.println("food not found");
}

return price;

}
}

