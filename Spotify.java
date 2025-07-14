class Spotify{
static String firstName;
static String lastName;
static long phoneNumber;
static int age;
static char gender;
static byte month;
static short year;
static float planAmount;
static double price;
static boolean subscription;
public static String getFirstName(){
firstName="smitha";
return firstName;
}

public static String getLastName(){
lastName="Anjanappa";
return lastName;
}

public static int getAge(){
age=22;
return age;
}

public static long getphoneNumber(){
phoneNumber=7019167380L;
return phoneNumber;
}

public static char getGender(){
gender='F';
return gender;
}

public static byte getBirthMonth(){
month=12;
return month;
}

public static short getBirthYear(){
year=2003;
return year;
}


public static float getPremiumPlan(){
planAmount=500;
return planAmount;
}


public static double getPrice(){
price = 530.20;
return price;
}


public static boolean subscribed(){
subscription=true;
return subscription;
}
}