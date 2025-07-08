class Fan{
static boolean isOn;
static int currentSpeed;
static int maxSpeed=5;
static int minSpeed=0;

public static void onAndOff(){
if(isOn == false){
isOn = true;
System.out.println("the Fan is turned ON");
}
else{
isOn=false;
System.out.println("the fan is turned OFF");
}
return;
}




public static void increaseSpeed(){
if(isOn=true){
	if(currentSpeed < maxSpeed){
	currentSpeed=currentSpeed+1;
	System.out.println("the current speed of Fan is:" +currentSpeed);
	}
	else{
	System.out.println("reached the max speed:");

	}
}
else{
System.out.println("turn ON the fan first");
}
return;
}




public static void decreaseSpeed(){
if(isOn=true){
	if(minSpeed < currentSpeed){
	currentSpeed=currentSpeed-1;
	System.out.println("the current speed is:" +currentSpeed);
	}
	else{
	System.out.println("reached the min speed");
	}

}
else{

System.out.println("first fan ON madu");
}
return;
}
}

