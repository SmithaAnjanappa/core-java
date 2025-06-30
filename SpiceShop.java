class SpiceShop{
static String spices[] = {"cinnamon","nutmes","clove","saffron","mustard","black pepper","cumin seeds","baby leaf","coriander","star anise",
"cardamom" , "febugreek", "carom seeds" , "red chilli"};
public static void main(String spice[])
{
System.out.println("the number of spices are:" +spices.length);

for(String spiceName:spices){
System.out.println(spiceName);
}
}
}