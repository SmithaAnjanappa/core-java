class Instagram{
static String userFirstName;
static String userLastName;
public static boolean registerUser(String firstName , String lastName){
boolean isFirstNameValid=false;
boolean isLastNameValid=false;
boolean isUserRegisterd=false;

if(firstName!=null){
userFirstName=firstName;
isFirstNameValid=true;
}

if(lastName != null){
userLastName=lastName;
isLastNameValid=true;
}

if(isFirstNameValid==true && isLastNameValid==true){
isUserRegisterd=true;
}

return isUserRegisterd;
}

public static void getInstaInfo(){
System.out.println("the first name is:"+userFirstName);
System.out.println("the last name is:" +userLastName);

}
}