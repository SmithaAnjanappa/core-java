class FacebookRunner{
public static void main(String smi[]){
String pwd="@Smitha70";
String mail="smitha.ag@gmail.com";
long phone = 7019167380L;

String faceBookName=Facebook.logIn(pwd, mail);
System.out.println("the name of the user is:" +faceBookName);

faceBookName=Facebook.logIn(phone , pwd);
System.out.println("the name of the user is:" +faceBookName);
}
}


