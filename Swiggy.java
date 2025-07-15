class Swiggy{
public static double search(String food){
double price = 0.0;

if(food == "burger"){
price=79 ;
return price;
}

else if(food=="pizza"){
price=150 ;
return price;
}

else if(food== "takos"){
price= 120;
return price;
}

else if(food== "panipuri"){
price= 60;
return price;
}

else if(food== "mexican chutney"){
price= 100;
return price;
}

else if(food== "noodles"){
price= 250;
return price;
}

else if(food== "gobi"){
price= 180;
return price;
}

else if(food== "popcorn"){
price= 65;
return price;
}

else if(food== "chocolava"){
price= 195;
return price;
}

else if(food== "corn manchuri" ){
price= 195;
return price;
}

else if(food== "french fries"){
price= 220.55;
return price;
}

else if(food== "papad"){
price= 35.86;
return price;
}

else if(food== " KFC"){
price= 590.35;
return price;
}


else if(food== "5 star" ){
price= 990.85;
return price;
}


else if(food== "panner manchuri"){
price= 562.35;
return price;
}


else if(food== "chicken lolipop"){
price=680.84 ;
return price;
}


else if(food== "kaima"){
price= 899.65;
return price;
}


else if(food== "chicken 65"){
price= 856.67;
return price;
}


else if(food== "vada"){
price= 25;
return price;
}

else if(food== "pav bhaji"){
price= 105.32;
return price;
}

else{
System.out.println("food not found");
}

return price;
}



public static double search(String food , int quantity){
double price=0.0;

if(food == "burger"){
price  =79 * quantity;
return price;
}

else if(food=="pizza"){
price  =150* quantity ;
return price;
}

else if(food== "takos"){
price = 120* quantity;
return price;
}

else if(food== "panipuri"){
price = 60* quantity;
return price;
}

else if(food== "mexican chutney"){
price = 100* quantity;
return price;
}

else if(food== "noodles"){
price= 250 * quantity;
return price;
}

else if(food== "gobi"){
price = 180 * quantity;
return price;
}

else if(food== "popcorn"){
price = 65 * quantity;
return price;
}

else if(food== "chocolava"){
price = 195 * quantity;
return price;
}

else if(food== "corn manchuri" ){
price = 195* quantity;
return price;
}

else if(food== "french fries"){
price = 220.55* quantity;
return price;
}

else if(food== "papad"){
price = 35.86 * quantity;
return price;
}

else if(food== " KFC"){
price = 590.35 * quantity;
return price;
}


else if(food== "5 star" ){
price = 990.85 * quantity;
return price;
}


else if(food== "panner manchuri"){
price = 562.35 * quantity;
return price;
}


else if(food== "chicken lolipop"){
price =680.84 * quantity;
return price;
}


else if(food== "kaima"){
price = 899.65 * quantity;
return price;
}


else if(food== "chicken 65"){
price = 856.67* quantity;
return price;
}


else if(food== "vada"){
price = 25 * quantity;
return price;
}

else if(food== "pav bhaji"){
price = 105.32 * quantity;
return price;
}

else{
System.out.println("food not found");
}


return price;
}
}