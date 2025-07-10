class SnapChatPhoneNumber{
static long phoneNumber;
public static boolean phoneRegistered(long pNumber){
boolean phoneValid=false;
boolean isNumberRegistered=false;

if(pNumber != 0){
phoneNumber=pNumber;
phoneValid=true;
}

if(phoneValid==true){
isNumberRegistered=true;
}
return isNumberRegistered;
}

public static void getPhoneInfo(){
System.out.println("the phone number is:" +phoneNumber);

}
}