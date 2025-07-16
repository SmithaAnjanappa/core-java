class SpotifyRunner{
public static void main(String smi[]){
String mail="smitha@gmail.com" ;
String pwd="@Smitha67";
long phone=  7080673191L;
String spotifyUser=Spotify.logIn(mail , pwd);
System.out.println("the name of the spotify user is:" +spotifyUser +"and the email is" +mail );

spotifyUser=Spotify.logIn(phone , pwd);
System.out.println("the name of the spotify user is:" +spotifyUser );

}
}