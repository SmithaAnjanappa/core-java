class FacebookGender{
static String nameGender;
public static boolean genderDetails(String gender){
boolean isGenderValid=false;
boolean isRegisterd=false;

if(gender != null){
nameGender=gender;
isGenderValid = true;
}

if(isGenderValid == true){
isRegisterd = true;
}

return isRegisterd;
}


public static void getGenderInfo(){
System.out.println("the name of gender:" +nameGender);

}
}