class ZeptoRunner{
public static void main(String smi[]){
String foodName = "paddu";
double zeptoPrice=Zepto.prices(foodName);
System.out.println("the cost of the" +foodName +"is" +zeptoPrice);

foodName = "kurma";
int quantityOfZepto = 5;
double zepto=Zepto.prices(foodName , quantityOfZepto);
System.out.println("the cost of the" +foodName +  " is" +   zeptoPrice +  " and the quantity is" + quantityOfZepto);

}
}