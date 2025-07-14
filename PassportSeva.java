class PassportSeva{
static String givenName;
static String surName;
public static boolean registerUser(String gName , String sName){

boolean isUserRegistered=false;
boolean givenNameValid = false;
boolean surNameValid = false;

if(gName != null){
givenName=gName;
givenNameValid = true;
}

if(sName != null ){
surName=sName;
surNameValid=true;
}

if(givenNameValid==true && surNameValid==true){
isUserRegistered=true;

}
return isUserRegistered;
}

public static void getUserInfo(){
System.out.println("the given name is:" +givenName);

System.out.println("the sur name is:" +surName);

}
}