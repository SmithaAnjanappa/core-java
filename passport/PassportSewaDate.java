class PassportSewaDate{
static int birthDate;
static String birthMonth;
static int birthYear;
public static boolean dateOfBirth(int date , String month, int year){
boolean isDateValid=false;
boolean isMonthValid=false;
boolean isYearValid=false;
boolean isBirthDetailsValid=false;
if(date != 0){
birthDate=date;
isDateValid=true;
}

if(month != null){
birthMonth=month;
isMonthValid=true;
}

if(year != 0){
birthYear=year;
isYearValid=true;
}

if(isDateValid==true && isMonthValid==true && isYearValid==true){
isBirthDetailsValid=true;
}

return isBirthDetailsValid;
}

public static void getBirthInfo(){
System.out.println("the birth day is:"+birthDate);
System.out.println("the birth month is:"+birthMonth);
System.out.println("the birth year is:"+birthYear);

}
}