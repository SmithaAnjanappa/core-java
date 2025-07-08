class WashingMachine{
static boolean isConnected ;
static int maxSpeed = 7;
static int currentSpeed;
static int minSpeed=0;
public static void onAndOff(){
if(isConnected == false){
isConnected=true;
System.out.println("turned on the washing machine");
}
else{
isConnected=false;
System.out.println("turned off the washing machine:");
}
return;
}

public static void increaseSpeed(){

if(isConnected=true){
	if(currentSpeed < maxSpeed){
		currentSpeed=currentSpeed+1;
		System.out.println("the current speed is:" +currentSpeed);
	}
	else{
		System.out.println("reached the max limit:");

	}
}
else{
System.out.println("first turn on the washing machine:");
}
return;
}


public static void decreaseSpeed(){

if(isConnected=true){
	if(minSpeed < currentSpeed){
	currentSpeed=currentSpeed-1;
	System.out.println("the currentspeed is:" +currentSpeed);	
	}
	else{
	System.out.println("reached the min limit:");
	}
}
else{
System.out.println("first turn on the machine:");
}
return;
}
}