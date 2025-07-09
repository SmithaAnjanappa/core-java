class Seller{
public static void sell(String products , int quantity){
System.out.println("started selling to the ecommerce");

System.out.println("seller will sell the below products:");
String sellProducts[]={"home utinsels", "grocery","clothind","detergents"};
for(String sellProduct:sellProducts){

System.out.println(sellProduct);


}
System.out.println("done selling to the ecommerce");

return;
}
}