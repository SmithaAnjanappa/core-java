class MakeUpKitRunner{
public static void main(String smi[]){
double makeupPrice=MakeUpKit.priceOfMakeUpKit();
System.out.println("the make up kit price" +makeupPrice);

String brandMake=MakeUpKit.makeUpBrand();
System.out.println("the make up brand name is:" +brandMake);

long shadesNo=MakeUpKit.noOfShades();
System.out.println("the number of shades are:" +shadesNo);

short lipsticName=MakeUpKit.numberOfLipstics();
System.out.println("the number of lipstics are:" +lipsticName);

int brushesName=MakeUpKit.noOfMakeUpBrushes();
System.out.println("the number of brushes are:" +brushesName);

}
}