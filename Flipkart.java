class Flipkart{
public static String logIn(String email , String password){
String name = null;

if(email == "smitha@gmail.com"){
password="@Smitha67";
name = "smitha";
return name;
}

if(email == "veena23@gmail.com"){
password = "@Veena89";
name="veena";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber == 7080673191L){
password="@Smitha67";
name = "smitha";
return name;
}

if(phoneNumber == 8296046842L){
password = "@Veena89";
name="veena";
return name;
}

return name;
}
}
