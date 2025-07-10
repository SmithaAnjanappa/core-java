class FaceBook{
static String firstName;
static String surName;
public static boolean register(String fName, String sName){
boolean firstNameValid=false;
boolean surNameValid=false;
boolean isRegistered = false;

if(fName != null){
firstName=fName;
firstNameValid = true;
}

if(sName != null){
surName=sName;
surNameValid=true;
}

if(firstNameValid==true && surNameValid==true){
isRegistered = true;
}

return isRegistered;
}

public static void getUserInfo(){
System.out.println("the name is:" +firstName);
System.out.println("the sur name is:" +surName);


}
}