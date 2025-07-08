class Cooler{
static boolean isConnected;
static int currentTemperature ;
static int maxTemperature = 5;
static int minTemperature=0;
public static void onAndOff(){
if(isConnected == false){
isConnected = true;
System.out.println("the cooler has been on ");
}
else{
isConnected = false;
System.out.println("the cooler has been off");
}
return;
}

public static void increaseCooling(){
if(isConnected=true){
if(currentTemperature < maxTemperature){
currentTemperature=currentTemperature+1;
System.out.println("the current temperature is:" +currentTemperature);
}
else{
System.out.println("reached the max range");
}
}
else{
System.out.println("turn on the cooler first:");
}

return;
}

public static void decreaseCooling(){
if(isConnected = true){
if(minTemperature < currentTemperature){
currentTemperature=currentTemperature-1;
System.out.println("the current temperature is:" +currentTemperature);
}
else{
System.out.println("reached the min range");
}
}
else{
System.out.println("turn on the cooler first:");
}
return;
}
}