class Bangalore{
/* static String yelahanka="Yelahanka";
static String tvsCross="TVS cross";
static String laggere = "Laggere";
static String atturLayout="Attur layout";
static String vidyaranyapura = "Vidyaranyapura";
static String bommasandra = "Bommasandra";
static String yeshwanthapura = "Yeshwanthapura";
static String rajajinagar = "Rajajinagar";
static String isckon= "Iskon";
static String dairy = "Dairy";

static String areaNames[]= {yelahanka, tvsCross,laggere,atturLayout, vidyaranyapura,bommasandra, yeshwanthapura, rajajinagar, isckon , dairy}; */

public static void main(String area[]){

String yelahanka="Yelahanka";
String tvsCross="TVS cross";
String laggere = "Laggere";
String atturLayout="Attur layout";
String vidyaranyapura = "Vidyaranyapura";
String bommasandra = "Bommasandra";
String yeshwanthapura = "Yeshwanthapura";
String rajajinagar = "Rajajinagar";
String isckon= "Iskon";
String dairy = "Dairy";

String areaNames[]= {yelahanka, tvsCross,laggere,atturLayout, vidyaranyapura,bommasandra, yeshwanthapura, rajajinagar, isckon , dairy}; 





System.out.println("the number of areas are:" +areaNames.length);

/* System.out.println("the areas are:" + areaNames[0] + " "+ areaNames[1] + " "+areaNames[2] + " "+areaNames[3] + " "+areaNames[4] + " "+areaNames[5] +" " +areaNames[6] +" " +areaNames[7] +" " +areaNames[8] + " " +areaNames[9]); */

for (String areaName:areaNames){
System.out.println(areaName);
}
}
}