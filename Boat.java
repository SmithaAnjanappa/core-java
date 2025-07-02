class Boat{
public static void main (String boats[]){
System.out.println("main started");

boat( 5,50);

System.out.println("main ended");

}

public static void boat(int traveling, int distance ){
double cost = traveling + distance;

System.out.println("the cost for traveling in the boat is:"+cost);
}

}
