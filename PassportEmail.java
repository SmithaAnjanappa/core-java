class PassportEmail{
static String personEmail;
public static boolean registerEmail(String email){
boolean isEmailValid=false;
boolean isEmailRegister=false;
if(email != null){
personEmail=email;
isEmailValid=true;
}

if(isEmailValid==true){
isEmailRegister=true;
}

return isEmailRegister;
}

public static void getEmailInfo(){
System.out.println("the email of the person:" +personEmail);
}
}