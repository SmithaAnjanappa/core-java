class Passport{
static String givenName;
static String surName;
static String password;
static String confirmPassword;

public static boolean userRegisterd(String gName, String sName , String pwd , String cPwd){
boolean isUserRegisterd=false;
boolean givenNameValid=false;
boolean surNameValid=false;
boolean passwordValid=false;
boolean confirmPasswordValid = false;

if(gName != null){
givenName = gName;
givenNameValid=true;
}
else{
System.out.println("the given name is not valid give the name properly");
}

if(sName != null){
surName=sName;
surNameValid=true;
}
else{
System.out.println("the sur name is not valid");
}

if(pwd != null){
password=pwd;
passwordValid=true;
}
else{
System.out.println("the password is not valid");
}

if(cPwd != null && pwd==cPwd){
confirmPassword=cPwd;
confirmPasswordValid=true;
}
else{
System.out.println("the current password is not matching with the password");
}


if(givenNameValid && surNameValid && passwordValid && confirmPasswordValid){
System.out.println("user provide the correct name , surname , password and confirm password");
}
return isUserRegisterd;
}


public static void getPassportInfo(){
System.out.println("the given name is:" +givenName);
System.out.println("the sur name is:" +surName);
System.out.println("the password is:" +password);
System.out.println("the confirm password is:" +confirmPassword);
}
}