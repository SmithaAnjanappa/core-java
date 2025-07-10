class SnapchatEmail{
static String userMail;
public static boolean snapRegisterMail(String email){
boolean isMailValid=false;
boolean isMailRegister=false;
if(email != null){
userMail=email;
isMailValid=true;
}

if(isMailValid==true){
isMailRegister=true;
}
return isMailRegister;
}

public static void getmailInfo(){
System.out.println("the email of the user is:" +userMail);

}
}