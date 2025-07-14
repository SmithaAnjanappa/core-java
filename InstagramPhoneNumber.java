class InstagramPhoneNumber{
static long instaPhoneNumber;

public static boolean instaRegistorPhone(long phoneNumber){
boolean isPhoneValid=false;
boolean isPhoneRegisterd=false;
if(phoneNumber != 0){
instaPhoneNumber=phoneNumber;
isPhoneValid=true;
}


if(isPhoneValid==true){
isPhoneRegisterd=true;
}

return isPhoneRegisterd;
}

public static void getPhoneInfo(){
System.out.println("the phone number is:"+instaPhoneNumber);
}
}