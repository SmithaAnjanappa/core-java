class SpotifyRunner{
public static void main(String spo[]){
String name=Spotify.getFirstName();
System.out.println("the first name is:" +name);

String lname=Spotify.getLastName();
System.out.println("the last name is:" +lname);

int pAge = Spotify.getAge();
System.out.println("the age is:" +pAge);


long phone=Spotify.getphoneNumber();
System.out.println("the phone number is:" +phone);


char genderofPerson=Spotify.getGender();
System.out.println("the gender is:" +genderofPerson);

byte monthOfPerson =Spotify.getBirthMonth();
System.out.println("the birth month is:" +monthOfPerson);

short yearOfBirth=Spotify.getBirthYear();
System.out.println("the birth year is:" +yearOfBirth);

float plan=Spotify.getPremiumPlan();
System.out.println("the premium plan for spotify is:" +plan);

double priceOf=Spotify.getPrice();
System.out.println("the plan of spotify is:" +priceOf);

boolean subs=Spotify.subscribed();
System.out.println("the paln is subscribed:" +subs);
}
}
