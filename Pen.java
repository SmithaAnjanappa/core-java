class Pen{
public static void main(String pen[]){
System.out.println("main started");

pens("cello","blue");
System.out.println("main ended");
}



public static void pens(String penBrand , String penColor){
System.out.println("pen started");

System.out.println("the name of the pen brand is:" +penBrand);
System.out.println("the color of the pen is:" +penColor);

System.out.println("pen ended");
}
}