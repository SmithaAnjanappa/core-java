class FacebookRunner{
public static void main(String face[]){

boolean registerd=FaceBook.register("gowthu","smitha");
System.out.println("the user is registerd to facebook:" +registerd);
FaceBook.getUserInfo();


boolean dateRegister= FacebookDate.dateOfBirth(1,"jan",2003);
System.out.println("the date of birth as registered" +dateRegister);
FacebookDate.getDateInfo();

boolean genderDetails=FacebookGender.genderDetails("female");
System.out.println("the gender of the person is:" +genderDetails);
FacebookGender.getGenderInfo();



boolean emails= FacebookEmail.emailRegister("smitha.@gmail.com");
System.out.println("the email of the user is " +emails);
FacebookEmail.getEmailInfo();
}
}