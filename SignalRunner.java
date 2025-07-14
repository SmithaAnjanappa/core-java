class SignalRunner{
public static void main(String smi[]){
String colorOfSignal=Signal.SignalColors();
System.out.println("the color of the signal is:" +colorOfSignal);

int timeOfSignal=Signal.signalTime();
System.out.println("the time of the signal is:" +timeOfSignal);


short timeOfWait=Signal.waitTime();
System.out.println("the wait time of signal is:" +timeOfWait);

boolean crossing=Signal.personIsCrossing();
System.out.println("the person is crossing:" +crossing);

byte redSignal=Signal.redSignalTime();
System.out.println("the time of red signal:" +redSignal);
}
}