class GoldRunner{
public static void main(String smi[]){
String extraction=Gold.goldExtarction();
System.out.println("the gold extraction is done in:"  + extraction);

int extractionPlaces=Gold.noOfPlacesOfExtraction();
System.out.println("the gold extraction places:"  + extractionPlaces);

double perGramPrice=Gold.pricePerGram();
System.out.println("the gold price per gram:"  + perGramPrice);

byte goldVendors=Gold.numberOfGoldvendors();
System.out.println("the gold vendors are:"  + goldVendors);

long designs=Gold.noOfGoldDesigners();
System.out.println("the gold designs are:"  + designs);

}
}