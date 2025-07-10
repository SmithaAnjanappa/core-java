class FacebookDate{
static int userDate;
static String userMonth;
static int userYear;
public static boolean dateOfBirth(int date, String month, int year){

boolean isDateOfBirthValid=false;
boolean isMonthValid = false;
boolean isRegisterd=false;
boolean isYearValid = false;
if(date != 0){
userDate=date;
isDateOfBirthValid=true;
}


if(month != null){
userMonth=month;
isMonthValid=true;
}

if(year != 0){
userYear=year;
isYearValid=true;
}

if(isDateOfBirthValid==true && isMonthValid==true && isYearValid==true){
isRegisterd=true;
}

return isRegisterd;
}


public static void getDateInfo(){
System.out.println("the day is:" +userDate);
System.out.println("the month is:" +userMonth);
System.out.println("the year is:" +userYear);
}
}