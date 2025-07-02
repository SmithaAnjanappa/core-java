class Bar{
/* static String bear = "Bear";
static String vodka = "Vodka";
static String gin = "gin";
static String soju = "Soju";
static String rum = "Rum";
static String whisky = "Whisky";
static String shochu = "Shochu";
static String baijiu = "Baijiu";
static String brandy = "Brandy";
static String singani = "Singani";
static String tequila="Tequila";
static String sherry = "Sherry";
static String alcoholNames[]={bear, vodka ,gin,soju,rum,whisky,shochu,baijiu,brandy,singani,tequila,sherry}; */

public static void main(String alcohol[]){

String bear = "Bear";
String vodka = "Vodka";
String gin = "gin";
String soju = "Soju";
String rum = "Rum";
String whisky = "Whisky";
String shochu = "Shochu";
String baijiu = "Baijiu";
String brandy = "Brandy";
String singani = "Singani";
String tequila="Tequila";
String sherry = "Sherry";

String alcoholNames[]={bear, vodka ,gin,soju,rum,whisky,shochu,baijiu,brandy,singani,tequila,sherry};



System.out.println("the number of alcohols are:" +alcoholNames.length);

/* System.out.println("the alcohols names are:" +alcoholNames[0] +"  " +alcoholNames[1] + " " +alcoholNames[2] + " "+alcoholNames[3] + " "+alcoholNames[4] + " "+alcoholNames[5] + " "+alcoholNames[6] +" " +alcoholNames[7] +" " +alcoholNames[8] + " " +alcoholNames[9] + " "+alcoholNames[10] +" " +alcoholNames[11]); */

for(String alcoholName:alcoholNames){
System.out.println(alcoholName);
}
}
}