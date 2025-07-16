class UberEatsRunner{
public static void main(String sni[]){
String foodName="cookies";
double ola=UberEats.priceOfFoodss(foodName);
System.out.println("the price of " +foodName +"is" +ola);

int quantity=2;
double olaEats=UberEats.priceOfFoodss(foodName, quantity);
System.out.println("the price of " +foodName +"and quantity is" +quantity +"and total price is" +olaEats);
}
}

