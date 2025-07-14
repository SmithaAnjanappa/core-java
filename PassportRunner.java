class PassportRunner{
public static void main(String pass[]){

boolean passportOfUser=Passport.userRegisterd("smitha","Gowtham","smitha@","smitha@");
System.out.println("the user registerd"+passportOfUser);

if(passportOfUser){
Passport.getPassportInfo();
}

}



}