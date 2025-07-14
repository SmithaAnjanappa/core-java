class SnapChat{
static String firstName;
static String lastName;

public static boolean snapRegister(String fName , String lName){
boolean isFirstNameValid=false;
boolean isLastNameValid=false;
boolean isNameValid=false;
if(fName!=null){
firstName=fName;
isFirstNameValid=true;
}

if(lName != null){
lastName=lName;
isLastNameValid=true;
}

if(isFirstNameValid==true && isLastNameValid==true){
isNameValid=true;
}

return isNameValid;
}

public static void getSnapInfo(){

System.out.println("the first name is:" +firstName);
System.out.println("the lat name is:" +lastName);

}
}