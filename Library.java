class Library{
/*static String kannada = "kannada";
static String english="english";
static String hindi="hindi";
static String social="Social";
static String science="Science";
static String maths="maths";
static String sanskrit="sanskrit";
static String tulu="tulu";

static String bookNames[]={kannada,english,hindi,social,science,maths,sanskrit,tulu};*/

public static void main(String book[]){

 String kannada = "kannada";
 String english="english";
 String hindi="hindi";
 String social="Social";
 String science="Science";
 String maths="maths";
 String sanskrit="sanskrit";
 String tulu="tulu";

 String bookNames[]={kannada,english,hindi,social,science,maths,sanskrit,tulu};

System.out.println("the number of books are:" +bookNames.length);

/*System.out.println("the book names are:" +bookNames[0] +" " +bookNames[1] + " "+bookNames[2] + " "+bookNames[3] + " "+bookNames[4] +" " +bookNames[5] + " "+bookNames[6] + " "+bookNames[7] );*/

/*for(String bookName:bookNames){
System.out.println(bookName);
}*/

String librarayBook1=bookNames[0];
String librarayBook2=bookNames[1];
String librarayBook3=bookNames[2];
String librarayBook4=bookNames[3];
String librarayBook5=bookNames[4];
String librarayBook6=bookNames[5];
String librarayBook7=bookNames[6];
String librarayBook8=bookNames[7];

System.out.println(librarayBook1 +" " +librarayBook2 +" " +librarayBook3 + " "+librarayBook4 +" " +librarayBook5 + " " +librarayBook6 +" " +librarayBook7 +" " +librarayBook8);

}
}