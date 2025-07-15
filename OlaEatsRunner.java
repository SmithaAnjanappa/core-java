class OlaEatsRunner{
public static void main(String smi[]){
String foodName="egg fry";
double olaCost=OlaEats.olaPrice(foodName);
System.out.println("the name of food is " +foodName +"and the price is" +olaCost);

int quantity=3;
double olaCosts=OlaEats.olaPrice(foodName , quantity);
System.out.println("the total price of the " +foodName +olaCosts +" and the quantity is" +quantity);
}
}
