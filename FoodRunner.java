class FoodRunner
{
public static void main(String smi[]){

double swiggy=Swiggy.priceOfFood("panipuri");
System.out.println("the price of panipuri are:"+swiggy);

swiggy=Swiggy.priceOfFood("pav bhaji");
System.out.println("the price of pav bhaji are:"+swiggy);

double zomato = Zomato.priceOfFoods("ice creams");
System.out.println("the price of ice creams are:"+zomato);

double uber = UberEats.priceOfFoodss("bites");
System.out.println("the price of bites are:"+uber);

double ola = OlaEats.olaPrice("jamoon");
System.out.println("the price of jamoon are:"+ola);

}
}



