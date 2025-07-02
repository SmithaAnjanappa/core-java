class Window{
public static void main(String win[]){
System.out.println("main Started");

window("scrolling", 2);

System.out.println("main ended");

}

public static void window(String windowType , int numOfLocks){
System.out.println("window started");

System.out.println("the type of the window:" +windowType);
System.out.println("the number of locks in the window is:" +numOfLocks);

System.out.println("window ended");
}

}