class FlipkartRunner{
public static void main(String smi[]){
String mail="smitha@gmail.com" ;
String pwd="@Smitha67";
long phone=  7080673191L;
String flipkartUser=Flipkart.logIn(mail , pwd);
System.out.println("the name of the flipkart user is:" +flipkartUser +"and the email is" +mail );

flipkartUser=Flipkart.logIn(phone , pwd);
System.out.println("the name of the flipkart user is:" +flipkartUser );

}
}