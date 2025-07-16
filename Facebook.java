class Facebook{
public static String logIn(String password , String email){
String name = null;

if(email == "smitha.ag@gmail.com"){
password = "@Smitha70";
name="Smitha";
return name;
}

if(email == "gowtham.ag@gmail.com"){
password = "@Gowtham12";
name="Gowtham";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber==7019167380L){
password = "@Smitha78";
name = "Smitha";
}

if(phoneNumber==8248960465L){
password = "@Gowtham12";
name = "Gowtham";
}


return name;
}
}
