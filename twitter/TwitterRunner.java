class TwitterRunner{
public static void main(String x[]){

boolean tweet=Twitter.registerUser("smitha","a");
System.out.println("the tweets users are:" +tweet);
Twitter.getUserInfo();
}
}