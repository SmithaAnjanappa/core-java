class Signal{
static String color;
static int time;
static short wait;
static boolean isCrossing;
static byte red;

public static String SignalColors(){
color="red";
return color;
}

public static int signalTime(){
time=3;
return time;
}

public static short waitTime(){
wait = 3;
return wait;
}

public static boolean personIsCrossing(){
isCrossing=true;
return isCrossing;
}

public static byte redSignalTime(){
red = 5;
return red;
}
}