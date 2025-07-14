class InstagramRunner{
public static void main(String inst[]){

boolean insta=Instagram.registerUser("smitha","a");
System.out.println("the user registration os name is:"+insta);
Instagram.getInstaInfo();

boolean instaContact=InstagramPhoneNumber.instaRegistorPhone(7019167380L);
System.out.println("the instagram phone number is :" +instaContact);
InstagramPhoneNumber.getPhoneInfo();
}
}