class SnapChatRunner{
public static void main(String snap[]){

boolean snapUser=SnapChat.snapRegister("null","null");
System.out.println("the snap user name is:" +snapUser);

SnapChat.getSnapInfo();



boolean phoneSnap=SnapChatPhoneNumber.phoneRegistered(7019167380L);
System.out.println("the number of snap chat user is:"+phoneSnap);

SnapChatPhoneNumber.getPhoneInfo();


boolean mails=SnapchatEmail.snapRegisterMail("smitha.ag@gmail.com");
System.out.println("the email is registered" +mails);
SnapchatEmail.getmailInfo();
}
}