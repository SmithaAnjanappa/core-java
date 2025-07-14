class WalkiTalkiRunner{

public static void main (String[] args){

String purposes= WalkiTalki.walkiTalkiPurpose();
System.out.println("the walki talki purpose is:" +purposes);

int numberwt=WalkiTalki.numberOfWalkiTalki();
System.out.println("the number of walki talkies are:" +numberwt);

long majorwt= WalkiTalki.majorWalkiTalki();
System.out.println("the major walkitalki are:" +majorwt);

short usersOfwt= WalkiTalki.noOfUsers();
System.out.println("the number of walkitalki are:" +usersOfwt);

boolean audibility =WalkiTalki.isAudible();
System.out.println("the audible:" +audibility);
}
}
