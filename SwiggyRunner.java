class SwiggyRunner{
public static void main(String smi[]){
String foodName="takos";
double swiigyFoods=Swiggy.search(foodName);
System.out.println("the cost of food is" +swiigyFoods);

int quantity = 3;
double costOfFood=Swiggy.search(foodName , quantity);
System.out.println("the quantity of  " +foodName +"is" +quantity);
}
}



