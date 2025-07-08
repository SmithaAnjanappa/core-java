class Mixer{
static boolean isOn;
static int increaseSpeed=4;
static int currentSpeed;
static int minSpeed = 0;

public static void onAndOff(){

if(isOn == false){
isOn = true;
System.out.println("the mixer turned ON");
}
else{
isOn=false;
System.out.println("the mixer is not ON");
}
}


public static void increaseSpeed (){
if(isOn = true){
	if(currentSpeed < increaseSpeed){
	currentSpeed=currentSpeed+1;
	System.out.println("the current speed of the mixer is:"+currentSpeed);
	}
	else{
	System.out.println("reached the max speed of the mixer");
	}

}
 else{
	System.out.println("firs turn ON the mixer");
}
}


public static void decreaseSpeed(){
if(isOn = true){
	if(currentSpeed > minSpeed){
	currentSpeed = currentSpeed-1;
	System.out.println("the current speed of the mixer is:" +currentSpeed);
	}
	else{
	System.out.println("reached the minimum speed");
	}
}
else{
	System.out.println("first turn on the mixer");
}
}
}

