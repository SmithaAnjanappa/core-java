class Customer{
public static void buy(String vegetables , String quantity){
System.out.println("customer started buying");
String tomato = "tomato";
String potato ="potato";
String onion = "onion";
String veges[]={tomato,potato,onion};
for(String vege:veges){
System.out.println("the customer buyed the following vegetables\n" +vege);
}
System.out.println("customer done with buying");


Shop.sell("potato","30kg");


}
}