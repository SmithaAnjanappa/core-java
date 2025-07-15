class ZomatoRunner{
public static void main(String smi[]){
String foodName="pallav";
double zoomato=Zomato.priceOfFoods(foodName);
System.out.println("the" +foodName +"cost is" +zoomato);

int quantity=8;
double zommato=Zomato.priceOfFoods(foodName , quantity);
System.out.println("the price of" +foodName +"is" +zommato +"and the quantity is" +quantity);
}
}
