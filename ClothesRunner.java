class ClothesRunner{
public static void main(String smi[]){

String brandOfClothes= Clothes.clothesBrand();
System.out.println("the brand of the clothes is:" +  brandOfClothes);

double clothesPrice=Clothes.priceOfClothes();
System.out.println("the price of the clothes are:" + clothesPrice);

char clothesSize= Clothes. sizeOfClothes();
System.out.println("the size of the cloth is:" + clothesSize);

int sizeOfTheSize=Clothes. waistSize();
System.out.println("the waist size is:" + sizeOfTheSize);

boolean clothesIsFitting=Clothes. isFit();
System.out.println("the clothes is fit:" + clothesIsFitting);
}
}