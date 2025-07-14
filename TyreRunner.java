class TyreRunner{
public static void main(String smi[]){

String brandTyre=Tyre.tyreBrand();
System.out.println("the brand of the tyre is:" + brandTyre);

double tyrePrice=Tyre.priceOfTyre();
System.out.println("the prive of the tyre:" + tyrePrice);

int tyreRequired=Tyre.numberOfTyre();
System.out.println("the number of tyres required" + tyreRequired);

boolean efficienct=Tyre.isTyreEfficient();
System.out.println("is ture efficient" + efficienct);

short griper=Tyre.TyreGrip();
System.out.println("the grip of the tyre" + griper);

}
}