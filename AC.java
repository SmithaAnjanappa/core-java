class AC{
static boolean isOn;
static int maxTemperature = 5;
static int minTemperature=0;
static int currentTemperature;

public static void onAndOff(){
if(isOn == false){
isOn=true;
System.out.println("the AC turned ON");
}
else{
isOn=false;
System.out.println("the AC is turned OFF");
}

}

public static void increaseTemperature(){

if(isOn=true){
	if(currentTemperature < maxTemperature){
	currentTemperature=currentTemperature+1;
	System.out.println("the max temperature of the AC is:" +currentTemperature);
	}
	else{
	System.out.println("reached the max temperature");
	}
}
else{
	System.out.println("turn on the AC first then increase the temp");
}
}

public static void decreaseTemperature(){
if(isOn = true){
	if (currentTemperature > minTemperature){
	currentTemperature=currentTemperature-1;
	System.out.println("the current temperature of the AC is:" +currentTemperature);
	}
	else{
	System.out.println("reached the min limit:");
	}
}
else{
System.out.println("turn ON the AC first");
}


}
}