class Messenger{
static String userMail;
static long number;
static String password;
static String  correctPassword;

public static boolean userRegister(String email , long phoneNumber, String pwd, String cpwd){
boolean userMailValid=false;
boolean isRegisterd = false;
boolean numberValid=false;
boolean correctPasswordValid=false;
boolean passwordValid=false;

if(email != null){
String userMail=email;
userMailValid=true;
}
else{
System.out.println("provide the correct user name:" );
}

if(phoneNumber != 0){
long number = phoneNumber;
numberValid=true;
}
else{
System.out.println("provide the correct user email:" );
}


if(pwd != null){
password=pwd;
passwordValid=true;
}
else{
System.out.println("provide the correct user dob:" );
}


if(cpwd!=null && pwd==cpwd){
correctPassword=cpwd;
correctPasswordValid=true;
}

if(userMailValid && numberValid && passwordValid && correctPasswordValid){
System.out.println("user provided the correct  name , email and the password:");
isRegisterd=true;
}
return isRegisterd;
}

public static void getInfo(){
System.out.println("the user email is:" +userMail );
System.out.println("the phone number is:" + number);
System.out.println("the password" +password );
System.out.println("the correct password" + correctPassword);

}
}

