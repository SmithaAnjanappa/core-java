class AmazonRunner{
public static void main(String smi[]){
String mail="smitha@gmail.com" ;
String pwd="@Smitha67";
long phone=  7080673191L;
String AmazonUser=AmazonRunner.logIn(mail , pwd);
System.out.println("the name of the amazon user is:" +AmazonUser +"and the email is" +mail );

flipkartUser=AmazonRunner.logIn(phone , pwd);
System.out.println("the name of the amazon user is:" +AmazonUser );

}
}