class TV{
static boolean isOn;
static int maxVolume=10;
static int minVolume = 0;
static int currentVolume;
public static void onAndOff(){
if(isOn == false){
isOn = true;
System.out.println("turned on the TV");
}
else{
isOn=false;
System.out.println("turned off the TV");
}
}


public static void increaseVolume(){

if (isOn=true){

	if(currentVolume < maxVolume){
	currentVolume=currentVolume+1;
	System.out.println("the current volume is:" +currentVolume);
	}
	else{
	System.out.println("reached the max volume");
	}
}
else{
System.out.println("first turn on the TV");
}
return;
}



public static void decreaseVolume(){
if(isOn=true){
	if(minVolume < currentVolume){
	currentVolume=currentVolume-1;
	System.out.println("the current volume is:" +currentVolume);
	}
	else{
	System.out.println("reached the min volume");
	}
}
else{

	System.out.println("first turn on the tv");
}
return;
}
}