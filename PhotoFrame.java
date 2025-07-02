class PhotoFrame{
public static void main(String frame[]){
System.out.println("main Started");

photo(10,7);
System.out.println("main ended");

}

public static void photo(int length , int width ){
int areaOfFrame=length*width;
System.out.println("photo started");

System.out.println("the area of the frame is :" +areaOfFrame);

System.out.println("photo ended");

}

}