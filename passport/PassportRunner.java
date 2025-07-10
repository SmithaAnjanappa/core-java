class PassportRunner{
public static void main(String pass[]){

boolean userRegistered=PassportSeva.registerUser("baba","das");
System.out.println("the user registered" +userRegistered);
PassportSeva.getUserInfo();


boolean passportDOB=PassportSewaDate.dateOfBirth(01 , "march", 2007);
System.out.println("the passport has below dob" +passportDOB);
PassportSewaDate.getBirthInfo();

boolean emailOfPassport=PassportEmail.registerEmail("smitha.ag@gmail.com");
System.out.println("the email is:" +emailOfPassport);
PassportEmail.getEmailInfo();
}
}