class X{
static String givenName;
static String userEmail;
static String userDob;

public static boolean UserRegistered(String name , String email , String dob){
boolean isRegistered=false;
boolean givenNameValid=false;
boolean userEmailValid=false;
boolean userDobValid=false;

if(name != null){
givenName=name;
givenNameValid=true;
}
else{
System.out.println("the given name is not valid:");
}

if(email != null){
userEmail=email;
userEmailValid=true;
}
else{
System.out.println("the email is not valid");
}


if(dob != null){
userDob=dob;
userDobValid=true;
}
else{
System.out.println("the dob is not valid");
}

if(givenNameValid==true && userEmailValid==true && userDobValid==true){
System.out.println("correct name, email and dob");
isRegistered=true;
}

return isRegistered;
}

public static void getInfo(){
System.out.println("the name of the user:" +givenName);
System.out.println("the eamil of the user" +userEmail);
System.out.println("the dob of the user:" +userDob);

}
}

