class FacebookEmail{
static String userEmail;
public static boolean emailRegister(String email){
boolean isEmailValid=false;
boolean isUserEmailValid=false;

if(email != null){
userEmail=email;
isEmailValid=true;
}

if(isEmailValid=true){
isUserEmailValid=true;
}


return isUserEmailValid;
}


public static void getEmailInfo()
{
System.out.println("the email of user:" +userEmail);

} 
}