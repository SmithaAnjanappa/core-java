class Earth{

/*static String asia = "Asia";
static String northAmerica="NorthAmerica";
static String southAmerica="south america";
static String africa="Africa";
static String antartica="Antartica";
static String australia = "Australia";
static String europe="Europe";

static String continents[]= {asia,northAmerica,southAmerica,africa,antartica,australia,europe};*/
public static void main(String earth[])
{

 String asia = "Asia";
 String northAmerica="NorthAmerica";
 String southAmerica="south america";
 String africa="Africa";
 String antartica="Antartica";
 String australia = "Australia";
 String europe="Europe";
 String continents[]= {asia,northAmerica,southAmerica,africa,antartica,australia,europe};

/* System.out.println("the continent names are:" +continents[0] + " " +continents[1] + " " +continents[2] +" " +continents[3] +" " +continents[4] +" " +continents[5] + " "+continents[6]); */

System.out.println("the number of continents are:" +continents.length);

/*for(String continent:continents){
System.out.println(continent);
} */

String earthContinents1=continents[0];
String earthContinents2=continents[1];
String earthContinents3=continents[2];
String earthContinents4=continents[3];
String earthContinents5=continents[4];
String earthContinents6=continents[5];
String earthContinents7=continents[6];

System.out.println(earthContinents1 +" " +earthContinents2 +" " +earthContinents3 +" " +earthContinents4 +" " +earthContinents5 +" " +earthContinents6 +" " +earthContinents7);



}
}