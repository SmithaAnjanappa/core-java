class Speaker {
	static int maxVolume = 7;
	static boolean isConnected;
	static int currentVolume;
static int minVolume = 0;
	// onandoff , increase volume , decrease volume
	public static void onOrOff(){
		if(isConnected == false){
			
			isConnected = true;
			System.out.println("check speaker connected speaker is turned on ");
		}
		else{
			isConnected=false;
			System.out.println("speaker is off");
			
		}
}

public static void increaseVolume(){
System.out.println("increase volume started");
if(isConnected==true){
	if(currentVolume < maxVolume){
currentVolume=currentVolume+1;
System.out.println("the current volume is " +currentVolume);
}
else{
System.out.println("reached the max volume");
}
}
else{
 System.out.println("turn on the speaker");
}	

}


public static void decreaseVolume(){
if(isConnected==true){
	if(currentVolume > minVolume){
	currentVolume=currentVolume-1;
	System.out.println("the min volume is:" +currentVolume);
}
		else{
	System.out.println("reached the min volume");

}

}
else{
	System.out.println("hey turn on the speker");
}

}
}