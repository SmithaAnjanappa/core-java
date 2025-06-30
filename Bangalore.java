class Bangalore{

static String areaNames[]= {"Yelahanka", "TVS cross","laggere","attur layout", "vidyaranyapura","bommasandra", "yeshwanthapura", "Rajajinagar", "isckon" , "dairy"};

public static void main(String area[]){

System.out.println("the number of areas are:" +areaNames.length);

for(String areaName : areaNames){
System.out.println(areaName);
}
}
}