class SpeakerRunner{

public static void main(String spreak[]){
System.out.println("main started");
Speaker.onOrOff();
Speaker.increaseVolume();
Speaker.onOrOff();

Speaker.decreaseVolume();

System.out.println("main ended");
}
}