class Tourism{
static String touristPlaces[]={"mysorepalace","dharmasthala","kukke","ghati","tirupathi","shiridi","ajanta","ellora","pattadakallu","goa","ooty" ,"lalbagh", "nandihills","hampi","madikeri"};

public static void tours (){

for(String touristPlace:touristPlaces){
System.out.println(touristPlace);
}

System.out.println("the number of tousit places are:" +touristPlaces.length);
}
}