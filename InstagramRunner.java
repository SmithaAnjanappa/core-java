class InstagramRunner{
public static void main(String smi[]){
String mail="smitha@gmail.com" ;
String pwd="@Smitha67";
long phone=  7080673191L;
String instaUser=Instagram.logIn(mail , pwd);
System.out.println("the name of the Instagram user is:" +instaUser +"and the email is" +mail );

instaUser=Instagram.logIn(phone , pwd);
System.out.println("the name of the Instagram user is:" +instaUser );

}
}