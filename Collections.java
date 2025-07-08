class Collections{
static String brands[]={"nike","avasa","fusion","kushi","adidas","levis","H&M","zara","uniqlo"};

public static void brandCollections(){

System.out.println("the number of collections are:" +brands.length);
for(String brand : brands){
System.out.println(brand);
}
}
}