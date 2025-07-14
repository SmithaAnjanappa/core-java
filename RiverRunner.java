class RiverRunner{
public static void main(String smi[]){
String river = River.riverName();
System.out.println("the name of the river is:" +river);

int flowDistance = River.distanceOfRiver();
System.out.println("the distance of the river:" +flowDistance);

short flowFrequency = River.frequencyOfFlow();
System.out.println("the floe frequency is:" +flowFrequency);

long riverDeep = River.deepOfRiver();
System.out.println("the deep of the river:" +riverDeep);

byte riverJoin = River.noOfRiversJoin();
System.out.println("the number of rivers join :" +riverJoin);

}
}